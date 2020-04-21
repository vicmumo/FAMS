<%@ include file="/init.jsp"%>
<%@page import="java.io.*" %>
<%@page import="java.net.*" %>

<%
   String recv;
   String recvbuff;
   URL jsonpage = new URL("http://10.10.4.214:9001/ords/apex_ebs_extension/fams/fams/complianceapprovals");
   URLConnection urlcon = jsonpage.openConnection();
   BufferedReader buffread = new BufferedReader(new InputStreamReader(urlcon.getInputStream()));

   while ((recv = buffread.readLine()) != null)
    recvbuff += recv;
   buffread.close();

   System.out.println(recvbuff);
%>