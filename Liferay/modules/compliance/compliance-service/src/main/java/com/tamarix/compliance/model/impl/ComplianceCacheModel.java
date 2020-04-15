/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.tamarix.compliance.model.impl;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import com.tamarix.compliance.model.Compliance;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Compliance in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ComplianceCacheModel
	implements CacheModel<Compliance>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ComplianceCacheModel)) {
			return false;
		}

		ComplianceCacheModel complianceCacheModel = (ComplianceCacheModel)obj;

		if (complianceId == complianceCacheModel.complianceId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, complianceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(73);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", complianceId=");
		sb.append(complianceId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createdby=");
		sb.append(createdby);
		sb.append(", modifiedby=");
		sb.append(modifiedby);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", branchName=");
		sb.append(branchName);
		sb.append(", payrollNo=");
		sb.append(payrollNo);
		sb.append(", terminationReason=");
		sb.append(terminationReason);
		sb.append(", terminationCode=");
		sb.append(terminationCode);
		sb.append(", formerBranch=");
		sb.append(formerBranch);
		sb.append(", contractId=");
		sb.append(contractId);
		sb.append(", entityId=");
		sb.append(entityId);
		sb.append(", approvalDate=");
		sb.append(approvalDate);
		sb.append(", comments=");
		sb.append(comments);
		sb.append(", approverContractNumber=");
		sb.append(approverContractNumber);
		sb.append(", agentVerdict=");
		sb.append(agentVerdict);
		sb.append(", agentAction=");
		sb.append(agentAction);
		sb.append(", processedFlag=");
		sb.append(processedFlag);
		sb.append(", errorReason=");
		sb.append(errorReason);
		sb.append(", assignmentStatus=");
		sb.append(assignmentStatus);
		sb.append(", capacity=");
		sb.append(capacity);
		sb.append(", positionId=");
		sb.append(positionId);
		sb.append(", orgId=");
		sb.append(orgId);
		sb.append(", historyStartDate=");
		sb.append(historyStartDate);
		sb.append(", oldOrgId=");
		sb.append(oldOrgId);
		sb.append(", oldPositionId=");
		sb.append(oldPositionId);
		sb.append(", contractEffectiveEndDate=");
		sb.append(contractEffectiveEndDate);
		sb.append(", applicationTye=");
		sb.append(applicationTye);
		sb.append(", applicationCategory=");
		sb.append(applicationCategory);
		sb.append(", firstapprover=");
		sb.append(firstapprover);
		sb.append(", secondapprover=");
		sb.append(secondapprover);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Compliance toEntityModel() {
		ComplianceImpl complianceImpl = new ComplianceImpl();

		if (uuid == null) {
			complianceImpl.setUuid("");
		}
		else {
			complianceImpl.setUuid(uuid);
		}

		complianceImpl.setComplianceId(complianceId);
		complianceImpl.setGroupId(groupId);
		complianceImpl.setCompanyId(companyId);
		complianceImpl.setCreatedby(createdby);

		if (modifiedby == null) {
			complianceImpl.setModifiedby("");
		}
		else {
			complianceImpl.setModifiedby(modifiedby);
		}

		if (createDate == Long.MIN_VALUE) {
			complianceImpl.setCreateDate(null);
		}
		else {
			complianceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			complianceImpl.setModifiedDate(null);
		}
		else {
			complianceImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (firstName == null) {
			complianceImpl.setFirstName("");
		}
		else {
			complianceImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			complianceImpl.setLastName("");
		}
		else {
			complianceImpl.setLastName(lastName);
		}

		if (branchName == null) {
			complianceImpl.setBranchName("");
		}
		else {
			complianceImpl.setBranchName(branchName);
		}

		if (payrollNo == null) {
			complianceImpl.setPayrollNo("");
		}
		else {
			complianceImpl.setPayrollNo(payrollNo);
		}

		if (terminationReason == null) {
			complianceImpl.setTerminationReason("");
		}
		else {
			complianceImpl.setTerminationReason(terminationReason);
		}

		if (terminationCode == null) {
			complianceImpl.setTerminationCode("");
		}
		else {
			complianceImpl.setTerminationCode(terminationCode);
		}

		if (formerBranch == null) {
			complianceImpl.setFormerBranch("");
		}
		else {
			complianceImpl.setFormerBranch(formerBranch);
		}

		if (contractId == null) {
			complianceImpl.setContractId("");
		}
		else {
			complianceImpl.setContractId(contractId);
		}

		if (entityId == null) {
			complianceImpl.setEntityId("");
		}
		else {
			complianceImpl.setEntityId(entityId);
		}

		if (approvalDate == null) {
			complianceImpl.setApprovalDate("");
		}
		else {
			complianceImpl.setApprovalDate(approvalDate);
		}

		if (comments == null) {
			complianceImpl.setComments("");
		}
		else {
			complianceImpl.setComments(comments);
		}

		if (approverContractNumber == null) {
			complianceImpl.setApproverContractNumber("");
		}
		else {
			complianceImpl.setApproverContractNumber(approverContractNumber);
		}

		if (agentVerdict == null) {
			complianceImpl.setAgentVerdict("");
		}
		else {
			complianceImpl.setAgentVerdict(agentVerdict);
		}

		if (agentAction == null) {
			complianceImpl.setAgentAction("");
		}
		else {
			complianceImpl.setAgentAction(agentAction);
		}

		if (processedFlag == null) {
			complianceImpl.setProcessedFlag("");
		}
		else {
			complianceImpl.setProcessedFlag(processedFlag);
		}

		if (errorReason == null) {
			complianceImpl.setErrorReason("");
		}
		else {
			complianceImpl.setErrorReason(errorReason);
		}

		if (assignmentStatus == null) {
			complianceImpl.setAssignmentStatus("");
		}
		else {
			complianceImpl.setAssignmentStatus(assignmentStatus);
		}

		if (capacity == null) {
			complianceImpl.setCapacity("");
		}
		else {
			complianceImpl.setCapacity(capacity);
		}

		if (positionId == null) {
			complianceImpl.setPositionId("");
		}
		else {
			complianceImpl.setPositionId(positionId);
		}

		if (orgId == null) {
			complianceImpl.setOrgId("");
		}
		else {
			complianceImpl.setOrgId(orgId);
		}

		if (historyStartDate == null) {
			complianceImpl.setHistoryStartDate("");
		}
		else {
			complianceImpl.setHistoryStartDate(historyStartDate);
		}

		if (oldOrgId == null) {
			complianceImpl.setOldOrgId("");
		}
		else {
			complianceImpl.setOldOrgId(oldOrgId);
		}

		if (oldPositionId == null) {
			complianceImpl.setOldPositionId("");
		}
		else {
			complianceImpl.setOldPositionId(oldPositionId);
		}

		if (contractEffectiveEndDate == null) {
			complianceImpl.setContractEffectiveEndDate("");
		}
		else {
			complianceImpl.setContractEffectiveEndDate(
				contractEffectiveEndDate);
		}

		if (applicationTye == null) {
			complianceImpl.setApplicationTye("");
		}
		else {
			complianceImpl.setApplicationTye(applicationTye);
		}

		if (applicationCategory == null) {
			complianceImpl.setApplicationCategory("");
		}
		else {
			complianceImpl.setApplicationCategory(applicationCategory);
		}

		if (firstapprover == null) {
			complianceImpl.setFirstapprover("");
		}
		else {
			complianceImpl.setFirstapprover(firstapprover);
		}

		if (secondapprover == null) {
			complianceImpl.setSecondapprover("");
		}
		else {
			complianceImpl.setSecondapprover(secondapprover);
		}

		complianceImpl.resetOriginalValues();

		return complianceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		complianceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		createdby = objectInput.readLong();
		modifiedby = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		branchName = objectInput.readUTF();
		payrollNo = objectInput.readUTF();
		terminationReason = objectInput.readUTF();
		terminationCode = objectInput.readUTF();
		formerBranch = objectInput.readUTF();
		contractId = objectInput.readUTF();
		entityId = objectInput.readUTF();
		approvalDate = objectInput.readUTF();
		comments = objectInput.readUTF();
		approverContractNumber = objectInput.readUTF();
		agentVerdict = objectInput.readUTF();
		agentAction = objectInput.readUTF();
		processedFlag = objectInput.readUTF();
		errorReason = objectInput.readUTF();
		assignmentStatus = objectInput.readUTF();
		capacity = objectInput.readUTF();
		positionId = objectInput.readUTF();
		orgId = objectInput.readUTF();
		historyStartDate = objectInput.readUTF();
		oldOrgId = objectInput.readUTF();
		oldPositionId = objectInput.readUTF();
		contractEffectiveEndDate = objectInput.readUTF();
		applicationTye = objectInput.readUTF();
		applicationCategory = objectInput.readUTF();
		firstapprover = objectInput.readUTF();
		secondapprover = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(complianceId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(createdby);

		if (modifiedby == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(modifiedby);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (branchName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(branchName);
		}

		if (payrollNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(payrollNo);
		}

		if (terminationReason == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(terminationReason);
		}

		if (terminationCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(terminationCode);
		}

		if (formerBranch == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(formerBranch);
		}

		if (contractId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contractId);
		}

		if (entityId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entityId);
		}

		if (approvalDate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(approvalDate);
		}

		if (comments == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comments);
		}

		if (approverContractNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(approverContractNumber);
		}

		if (agentVerdict == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agentVerdict);
		}

		if (agentAction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agentAction);
		}

		if (processedFlag == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(processedFlag);
		}

		if (errorReason == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(errorReason);
		}

		if (assignmentStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assignmentStatus);
		}

		if (capacity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capacity);
		}

		if (positionId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(positionId);
		}

		if (orgId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(orgId);
		}

		if (historyStartDate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(historyStartDate);
		}

		if (oldOrgId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(oldOrgId);
		}

		if (oldPositionId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(oldPositionId);
		}

		if (contractEffectiveEndDate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contractEffectiveEndDate);
		}

		if (applicationTye == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationTye);
		}

		if (applicationCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationCategory);
		}

		if (firstapprover == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstapprover);
		}

		if (secondapprover == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondapprover);
		}
	}

	public String uuid;
	public long complianceId;
	public long groupId;
	public long companyId;
	public long createdby;
	public String modifiedby;
	public long createDate;
	public long modifiedDate;
	public String firstName;
	public String lastName;
	public String branchName;
	public String payrollNo;
	public String terminationReason;
	public String terminationCode;
	public String formerBranch;
	public String contractId;
	public String entityId;
	public String approvalDate;
	public String comments;
	public String approverContractNumber;
	public String agentVerdict;
	public String agentAction;
	public String processedFlag;
	public String errorReason;
	public String assignmentStatus;
	public String capacity;
	public String positionId;
	public String orgId;
	public String historyStartDate;
	public String oldOrgId;
	public String oldPositionId;
	public String contractEffectiveEndDate;
	public String applicationTye;
	public String applicationCategory;
	public String firstapprover;
	public String secondapprover;

}