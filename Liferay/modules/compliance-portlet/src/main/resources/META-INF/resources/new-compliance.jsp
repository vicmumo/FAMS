<%@ include file="init.jsp"%>
<portlet:defineObjects />

<portlet:actionURL name="addCompliance"
	var="addComplianceActionURL" />


<h2>Add addCompliance Form here !</h2>

<aui:form action="<%=addComplianceActionURL%>"
	name="complianceForm" method="POST">
	<aui:input name="firstName">
		<aui:validator name="required" />
		<aui:validator name="alpha" />
	</aui:input>
	<aui:input name="lastName">
		<aui:validator name="required" />
		<aui:validator name="alpha" />
	</aui:input>
	<aui:input name="branchName">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="payrollNo">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="terminationReason">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="terminationCode">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="formerBranch">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>


	<!--  New records -->
	<aui:input name="contractId" value="100003">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="entityId">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="approvalDate">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="comments">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="approverContractNumber">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="agentVerdict">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="agentAction">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="processedFlag">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="errorReason">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="assignmentStatus">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="capacity">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="PayslipLayout">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="orgId">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="historyStartDate">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="oldOrgId">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="oldPositionId">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="contractEffectiveEndDate">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<aui:input name="applicationTye">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>


	<aui:input name="applicationCategory">
		<aui:validator name="required" />
		<aui:validator name="string" />
	</aui:input>
	<!--  end of new records -->


	<aui:button type="submit" name="" value="Submit"></aui:button>
</aui:form>