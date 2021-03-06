<%@ include file="init.jsp"%>
<portlet:defineObjects />

<portlet:actionURL name="updateCompliance"
	var="updateComplianceActionURL" />

<aui:form action="<%=updateComplianceActionURL%>"
	name="complianceForm" method="POST" />

<%
	String complianceId = renderRequest.getParameter("complianceId");
String firstName = renderRequest.getParameter("firstName");
String lastName = renderRequest.getParameter("lastName");
String branchName = renderRequest.getParameter("branchName");
String payrollNo = renderRequest.getParameter("payrollNo");
String terminationReason = renderRequest.getParameter("terminationReason");
String terminationCode = renderRequest.getParameter("terminationCode");
String formerBranch = renderRequest.getParameter("formerBranch");
//Kaleo fields
String firstApprover = renderRequest.getParameter("firstApprover");
%>
<aui:form action="<%=updateComplianceActionURL%>" method="post">

	<h2>First approval 1.</h2>
	<aui:input name="complianceId" type="text"
		value="<%=Long.parseLong(complianceId)%>" />
	<aui:input name="firstName" type="text"
		value="${compliance.firstName}" />
	<aui:input name="lastName" type="text"
		value="${compliance.lastName}" />
	<aui:input name="branchName" type="text"
		value="${compliance.lastName}" />
	<aui:input name="payrollNo" type="text"
		value="${compliance.payrollNo}" />
	<aui:input name="terminationReason" type="text"
		value="${compliance.terminationReason}" />
	<aui:input name="terminationCode" type="text"
		value="${compliance.terminationCode}" />
	<aui:input name="formerBranch" type="text"
		value="${compliance.formerBranch}" />
	<!-- Kaleo records -->
	<!--<select name="firstapprover">
	    <option value="${compliance.firstapprover}">Approved</option>
	    <option value="${compliance.firstapprover}">Denayed</option>	    
	</select>  -->
	<aui:input name="firstapprover" type="text"
		value="${compliance.firstapprover}" />

	<!--<aui:input name="secondapprover" type="text" value="${compliance.secondapprover}"/>-->

	<hr />
	<hr />
	<aui:input type="submit" value="Submit..." name="firstApprover"></aui:input>

	<!--<aui:input type="submit" value="Decline to the next step.." name="update"></aui:input>-->
</aui:form>