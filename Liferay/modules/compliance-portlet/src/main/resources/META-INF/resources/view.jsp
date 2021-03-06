<%@ include file="/init.jsp"%>

<portlet:defineObjects />

<%
	List<Compliance> firstvalidatedList1 = (List<Compliance>) request.getAttribute("firstvalidatedList1");
%>
<portlet:renderURL var="addComplianceRenderURL">
	<portlet:param name="mvcPath" value="/new-compliance.jsp" />
</portlet:renderURL>

<div class="mb-5">
	<a href="<%=addComplianceRenderURL%>"
		class="btn  btn-primary btn-default"> <i
		class="glyphicon glyphicon-plus"></i> Apply for a Transfer or Promotion.
	</a>
</div>
<table class="table table-striped">
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Branch Name</th>
		<th>Payroll No</th>
		<th>Termination Reason</th>
		<th>Termination Code</th>
		<th>Former Branch</th>
		<th>Contract id</th>
        <th>Entity id</th>
        <th>Approval Date</th>
		<th colspan="2" style="width: 100px">Action</th>
	</tr>
	<c:forEach items="${complianceList}" var="compliance">

		<portlet:renderURL var="updateComplianceRenderURL">
			<portlet:param name="mvcPath" value="/update-compliance.jsp" />
			<portlet:param name="firstName" value="${compliance.firstName}" />
			<portlet:param name="lastName" value="${compliance.lastName}" />
			<portlet:param name="branchName" value="${compliance.branchName}" />
			<!-- Status 1 -->
			<portlet:param name="payrollNo" value="${compliance.payrollNo}" />
			<!-- status 2 -->
			<portlet:param name="terminationReason"
				value="${compliance.terminationReason}" />
			<portlet:param name="terminationCode"
				value="${compliance.terminationCode}" />
			<portlet:param name="formerBranch"
				value="${compliance.formerBranch}" />
			<!-- New records -->
			<%-- <portlet:param name="contractId" value="${compliance.contractId}" />
			<portlet:param name="entityId" value="${compliance.entityId}" />
			<portlet:param name="approvalDate"
				value="${compliance.approvalDate}" /> --%>
			<portlet:param name="comments" value="${compliance.comments}" />
			<portlet:param name="approverContractNumber"
				value="${compliance.approverContractNumber}" />
			<portlet:param name="agentVerdict"
				value="${compliance.agentVerdict}" />
			<portlet:param name="agentAction"
				value="${compliance.agentAction}" />
			<portlet:param name="processedFlag"
				value="${compliance.processedFlag}" />
			<portlet:param name="errorReason"
				value="${compliance.errorReason}" />
			<portlet:param name="assignmentStatus"
				value="${compliance.assignmentStatus}" />
			<portlet:param name="capacity" value="${compliance.capacity}" />
			<portlet:param name="positionId" value="${compliance.positionId}" />
			<portlet:param name="orgId" value="${compliance.orgId}" />
			<portlet:param name="historyStartDate"
				value="${compliance.historyStartDate}" />
			<portlet:param name="oldOrgId" value="${compliance.oldOrgId}" />
			<portlet:param name="oldPositionId"
				value="${compliance.oldPositionId}" />
			<portlet:param name="contractEffectiveEndDate"
				value="${compliance.contractEffectiveEndDate}" />
			<portlet:param name="applicationTye"
				value="${compliance.applicationTye}" />
			<portlet:param name="applicationCategory"
				value="${compliance.applicationCategory}" />

			<!--  End of new records -->
			<portlet:param name="complianceId"
				value="${compliance.complianceId}" />
		</portlet:renderURL>

		<portlet:actionURL name="deleteCompliance"
			var="deleteComplianceActionURL">
			<portlet:param name="complianceId"
				value="${compliance.getComplianceId()}" />
		</portlet:actionURL>

		<tr>
			<td>${compliance.getFirstName()}</td>
			<td>${compliance.getLastName()}</td>
			<td>${compliance.getBranchName()}</td>
			<td>${compliance.getPayrollNo()}</td>
			<td>${compliance.getTerminationReason()}</td>
			<td>${compliance.getTerminationCode()}</td>
			<td>${compliance.getFormerBranch()}</td>
			<td>${compliance.getContractId()}</td>
			<td>${compliance.getEntityId()}</td>
			<td>${compliance.getApprovalDate()}</td>
			<td class="text-center" style="width: 50px"><a
				href="<%=updateComplianceRenderURL%>"
				class="btn  btn-primary btn-default btn-sm px-2 py-1"> <i
					class="glyphicon glyphicon-edit"></i>
			</a></td>
			<td class="text-center" style="width: 50px"><a
				href="<%=deleteComplianceActionURL%>"
				class="btn  btn-primary btn-default btn-sm px-2 py-1"
				onclick="return confirm('Are you sure you want to delete this item?');">
					<i class="glyphicon glyphicon-remove"></i>
			</a></td>
		</tr>
	</c:forEach>
</table>