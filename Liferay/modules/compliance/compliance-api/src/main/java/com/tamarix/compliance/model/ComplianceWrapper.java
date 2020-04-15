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

package com.tamarix.compliance.model;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Compliance}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Compliance
 * @generated
 */
public class ComplianceWrapper implements Compliance, ModelWrapper<Compliance> {

	public ComplianceWrapper(Compliance compliance) {
		_compliance = compliance;
	}

	@Override
	public Class<?> getModelClass() {
		return Compliance.class;
	}

	@Override
	public String getModelClassName() {
		return Compliance.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("complianceId", getComplianceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createdby", getCreatedby());
		attributes.put("modifiedby", getModifiedby());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("branchName", getBranchName());
		attributes.put("payrollNo", getPayrollNo());
		attributes.put("terminationReason", getTerminationReason());
		attributes.put("terminationCode", getTerminationCode());
		attributes.put("formerBranch", getFormerBranch());
		attributes.put("contractId", getContractId());
		attributes.put("entityId", getEntityId());
		attributes.put("approvalDate", getApprovalDate());
		attributes.put("comments", getComments());
		attributes.put("approverContractNumber", getApproverContractNumber());
		attributes.put("agentVerdict", getAgentVerdict());
		attributes.put("agentAction", getAgentAction());
		attributes.put("processedFlag", getProcessedFlag());
		attributes.put("errorReason", getErrorReason());
		attributes.put("assignmentStatus", getAssignmentStatus());
		attributes.put("capacity", getCapacity());
		attributes.put("positionId", getPositionId());
		attributes.put("orgId", getOrgId());
		attributes.put("historyStartDate", getHistoryStartDate());
		attributes.put("oldOrgId", getOldOrgId());
		attributes.put("oldPositionId", getOldPositionId());
		attributes.put(
			"contractEffectiveEndDate", getContractEffectiveEndDate());
		attributes.put("applicationTye", getApplicationTye());
		attributes.put("applicationCategory", getApplicationCategory());
		attributes.put("firstapprover", getFirstapprover());
		attributes.put("secondapprover", getSecondapprover());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long complianceId = (Long)attributes.get("complianceId");

		if (complianceId != null) {
			setComplianceId(complianceId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long createdby = (Long)attributes.get("createdby");

		if (createdby != null) {
			setCreatedby(createdby);
		}

		String modifiedby = (String)attributes.get("modifiedby");

		if (modifiedby != null) {
			setModifiedby(modifiedby);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String branchName = (String)attributes.get("branchName");

		if (branchName != null) {
			setBranchName(branchName);
		}

		String payrollNo = (String)attributes.get("payrollNo");

		if (payrollNo != null) {
			setPayrollNo(payrollNo);
		}

		String terminationReason = (String)attributes.get("terminationReason");

		if (terminationReason != null) {
			setTerminationReason(terminationReason);
		}

		String terminationCode = (String)attributes.get("terminationCode");

		if (terminationCode != null) {
			setTerminationCode(terminationCode);
		}

		String formerBranch = (String)attributes.get("formerBranch");

		if (formerBranch != null) {
			setFormerBranch(formerBranch);
		}

		String contractId = (String)attributes.get("contractId");

		if (contractId != null) {
			setContractId(contractId);
		}

		String entityId = (String)attributes.get("entityId");

		if (entityId != null) {
			setEntityId(entityId);
		}

		String approvalDate = (String)attributes.get("approvalDate");

		if (approvalDate != null) {
			setApprovalDate(approvalDate);
		}

		String comments = (String)attributes.get("comments");

		if (comments != null) {
			setComments(comments);
		}

		String approverContractNumber = (String)attributes.get(
			"approverContractNumber");

		if (approverContractNumber != null) {
			setApproverContractNumber(approverContractNumber);
		}

		String agentVerdict = (String)attributes.get("agentVerdict");

		if (agentVerdict != null) {
			setAgentVerdict(agentVerdict);
		}

		String agentAction = (String)attributes.get("agentAction");

		if (agentAction != null) {
			setAgentAction(agentAction);
		}

		String processedFlag = (String)attributes.get("processedFlag");

		if (processedFlag != null) {
			setProcessedFlag(processedFlag);
		}

		String errorReason = (String)attributes.get("errorReason");

		if (errorReason != null) {
			setErrorReason(errorReason);
		}

		String assignmentStatus = (String)attributes.get("assignmentStatus");

		if (assignmentStatus != null) {
			setAssignmentStatus(assignmentStatus);
		}

		String capacity = (String)attributes.get("capacity");

		if (capacity != null) {
			setCapacity(capacity);
		}

		String positionId = (String)attributes.get("positionId");

		if (positionId != null) {
			setPositionId(positionId);
		}

		String orgId = (String)attributes.get("orgId");

		if (orgId != null) {
			setOrgId(orgId);
		}

		String historyStartDate = (String)attributes.get("historyStartDate");

		if (historyStartDate != null) {
			setHistoryStartDate(historyStartDate);
		}

		String oldOrgId = (String)attributes.get("oldOrgId");

		if (oldOrgId != null) {
			setOldOrgId(oldOrgId);
		}

		String oldPositionId = (String)attributes.get("oldPositionId");

		if (oldPositionId != null) {
			setOldPositionId(oldPositionId);
		}

		String contractEffectiveEndDate = (String)attributes.get(
			"contractEffectiveEndDate");

		if (contractEffectiveEndDate != null) {
			setContractEffectiveEndDate(contractEffectiveEndDate);
		}

		String applicationTye = (String)attributes.get("applicationTye");

		if (applicationTye != null) {
			setApplicationTye(applicationTye);
		}

		String applicationCategory = (String)attributes.get(
			"applicationCategory");

		if (applicationCategory != null) {
			setApplicationCategory(applicationCategory);
		}

		String firstapprover = (String)attributes.get("firstapprover");

		if (firstapprover != null) {
			setFirstapprover(firstapprover);
		}

		String secondapprover = (String)attributes.get("secondapprover");

		if (secondapprover != null) {
			setSecondapprover(secondapprover);
		}
	}

	@Override
	public Object clone() {
		return new ComplianceWrapper((Compliance)_compliance.clone());
	}

	@Override
	public int compareTo(Compliance compliance) {
		return _compliance.compareTo(compliance);
	}

	/**
	 * Returns the agent action of this compliance.
	 *
	 * @return the agent action of this compliance
	 */
	@Override
	public String getAgentAction() {
		return _compliance.getAgentAction();
	}

	/**
	 * Returns the agent verdict of this compliance.
	 *
	 * @return the agent verdict of this compliance
	 */
	@Override
	public String getAgentVerdict() {
		return _compliance.getAgentVerdict();
	}

	/**
	 * Returns the application category of this compliance.
	 *
	 * @return the application category of this compliance
	 */
	@Override
	public String getApplicationCategory() {
		return _compliance.getApplicationCategory();
	}

	/**
	 * Returns the application tye of this compliance.
	 *
	 * @return the application tye of this compliance
	 */
	@Override
	public String getApplicationTye() {
		return _compliance.getApplicationTye();
	}

	/**
	 * Returns the approval date of this compliance.
	 *
	 * @return the approval date of this compliance
	 */
	@Override
	public String getApprovalDate() {
		return _compliance.getApprovalDate();
	}

	/**
	 * Returns the approver contract number of this compliance.
	 *
	 * @return the approver contract number of this compliance
	 */
	@Override
	public String getApproverContractNumber() {
		return _compliance.getApproverContractNumber();
	}

	/**
	 * Returns the assignment status of this compliance.
	 *
	 * @return the assignment status of this compliance
	 */
	@Override
	public String getAssignmentStatus() {
		return _compliance.getAssignmentStatus();
	}

	/**
	 * Returns the branch name of this compliance.
	 *
	 * @return the branch name of this compliance
	 */
	@Override
	public String getBranchName() {
		return _compliance.getBranchName();
	}

	/**
	 * Returns the capacity of this compliance.
	 *
	 * @return the capacity of this compliance
	 */
	@Override
	public String getCapacity() {
		return _compliance.getCapacity();
	}

	/**
	 * Returns the comments of this compliance.
	 *
	 * @return the comments of this compliance
	 */
	@Override
	public String getComments() {
		return _compliance.getComments();
	}

	/**
	 * Returns the company ID of this compliance.
	 *
	 * @return the company ID of this compliance
	 */
	@Override
	public long getCompanyId() {
		return _compliance.getCompanyId();
	}

	/**
	 * Returns the compliance ID of this compliance.
	 *
	 * @return the compliance ID of this compliance
	 */
	@Override
	public long getComplianceId() {
		return _compliance.getComplianceId();
	}

	/**
	 * Returns the contract effective end date of this compliance.
	 *
	 * @return the contract effective end date of this compliance
	 */
	@Override
	public String getContractEffectiveEndDate() {
		return _compliance.getContractEffectiveEndDate();
	}

	/**
	 * Returns the contract ID of this compliance.
	 *
	 * @return the contract ID of this compliance
	 */
	@Override
	public String getContractId() {
		return _compliance.getContractId();
	}

	/**
	 * Returns the create date of this compliance.
	 *
	 * @return the create date of this compliance
	 */
	@Override
	public Date getCreateDate() {
		return _compliance.getCreateDate();
	}

	/**
	 * Returns the createdby of this compliance.
	 *
	 * @return the createdby of this compliance
	 */
	@Override
	public long getCreatedby() {
		return _compliance.getCreatedby();
	}

	/**
	 * Returns the entity ID of this compliance.
	 *
	 * @return the entity ID of this compliance
	 */
	@Override
	public String getEntityId() {
		return _compliance.getEntityId();
	}

	/**
	 * Returns the error reason of this compliance.
	 *
	 * @return the error reason of this compliance
	 */
	@Override
	public String getErrorReason() {
		return _compliance.getErrorReason();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _compliance.getExpandoBridge();
	}

	/**
	 * Returns the firstapprover of this compliance.
	 *
	 * @return the firstapprover of this compliance
	 */
	@Override
	public String getFirstapprover() {
		return _compliance.getFirstapprover();
	}

	/**
	 * Returns the first name of this compliance.
	 *
	 * @return the first name of this compliance
	 */
	@Override
	public String getFirstName() {
		return _compliance.getFirstName();
	}

	/**
	 * Returns the former branch of this compliance.
	 *
	 * @return the former branch of this compliance
	 */
	@Override
	public String getFormerBranch() {
		return _compliance.getFormerBranch();
	}

	/**
	 * Returns the group ID of this compliance.
	 *
	 * @return the group ID of this compliance
	 */
	@Override
	public long getGroupId() {
		return _compliance.getGroupId();
	}

	/**
	 * Returns the history start date of this compliance.
	 *
	 * @return the history start date of this compliance
	 */
	@Override
	public String getHistoryStartDate() {
		return _compliance.getHistoryStartDate();
	}

	/**
	 * Returns the last name of this compliance.
	 *
	 * @return the last name of this compliance
	 */
	@Override
	public String getLastName() {
		return _compliance.getLastName();
	}

	/**
	 * Returns the modifiedby of this compliance.
	 *
	 * @return the modifiedby of this compliance
	 */
	@Override
	public String getModifiedby() {
		return _compliance.getModifiedby();
	}

	/**
	 * Returns the modified date of this compliance.
	 *
	 * @return the modified date of this compliance
	 */
	@Override
	public Date getModifiedDate() {
		return _compliance.getModifiedDate();
	}

	/**
	 * Returns the old org ID of this compliance.
	 *
	 * @return the old org ID of this compliance
	 */
	@Override
	public String getOldOrgId() {
		return _compliance.getOldOrgId();
	}

	/**
	 * Returns the old position ID of this compliance.
	 *
	 * @return the old position ID of this compliance
	 */
	@Override
	public String getOldPositionId() {
		return _compliance.getOldPositionId();
	}

	/**
	 * Returns the org ID of this compliance.
	 *
	 * @return the org ID of this compliance
	 */
	@Override
	public String getOrgId() {
		return _compliance.getOrgId();
	}

	/**
	 * Returns the payroll no of this compliance.
	 *
	 * @return the payroll no of this compliance
	 */
	@Override
	public String getPayrollNo() {
		return _compliance.getPayrollNo();
	}

	/**
	 * Returns the position ID of this compliance.
	 *
	 * @return the position ID of this compliance
	 */
	@Override
	public String getPositionId() {
		return _compliance.getPositionId();
	}

	/**
	 * Returns the primary key of this compliance.
	 *
	 * @return the primary key of this compliance
	 */
	@Override
	public long getPrimaryKey() {
		return _compliance.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _compliance.getPrimaryKeyObj();
	}

	/**
	 * Returns the processed flag of this compliance.
	 *
	 * @return the processed flag of this compliance
	 */
	@Override
	public String getProcessedFlag() {
		return _compliance.getProcessedFlag();
	}

	/**
	 * Returns the secondapprover of this compliance.
	 *
	 * @return the secondapprover of this compliance
	 */
	@Override
	public String getSecondapprover() {
		return _compliance.getSecondapprover();
	}

	/**
	 * Returns the termination code of this compliance.
	 *
	 * @return the termination code of this compliance
	 */
	@Override
	public String getTerminationCode() {
		return _compliance.getTerminationCode();
	}

	/**
	 * Returns the termination reason of this compliance.
	 *
	 * @return the termination reason of this compliance
	 */
	@Override
	public String getTerminationReason() {
		return _compliance.getTerminationReason();
	}

	/**
	 * Returns the uuid of this compliance.
	 *
	 * @return the uuid of this compliance
	 */
	@Override
	public String getUuid() {
		return _compliance.getUuid();
	}

	@Override
	public int hashCode() {
		return _compliance.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _compliance.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _compliance.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _compliance.isNew();
	}

	@Override
	public void persist() {
		_compliance.persist();
	}

	/**
	 * Sets the agent action of this compliance.
	 *
	 * @param agentAction the agent action of this compliance
	 */
	@Override
	public void setAgentAction(String agentAction) {
		_compliance.setAgentAction(agentAction);
	}

	/**
	 * Sets the agent verdict of this compliance.
	 *
	 * @param agentVerdict the agent verdict of this compliance
	 */
	@Override
	public void setAgentVerdict(String agentVerdict) {
		_compliance.setAgentVerdict(agentVerdict);
	}

	/**
	 * Sets the application category of this compliance.
	 *
	 * @param applicationCategory the application category of this compliance
	 */
	@Override
	public void setApplicationCategory(String applicationCategory) {
		_compliance.setApplicationCategory(applicationCategory);
	}

	/**
	 * Sets the application tye of this compliance.
	 *
	 * @param applicationTye the application tye of this compliance
	 */
	@Override
	public void setApplicationTye(String applicationTye) {
		_compliance.setApplicationTye(applicationTye);
	}

	/**
	 * Sets the approval date of this compliance.
	 *
	 * @param approvalDate the approval date of this compliance
	 */
	@Override
	public void setApprovalDate(String approvalDate) {
		_compliance.setApprovalDate(approvalDate);
	}

	/**
	 * Sets the approver contract number of this compliance.
	 *
	 * @param approverContractNumber the approver contract number of this compliance
	 */
	@Override
	public void setApproverContractNumber(String approverContractNumber) {
		_compliance.setApproverContractNumber(approverContractNumber);
	}

	/**
	 * Sets the assignment status of this compliance.
	 *
	 * @param assignmentStatus the assignment status of this compliance
	 */
	@Override
	public void setAssignmentStatus(String assignmentStatus) {
		_compliance.setAssignmentStatus(assignmentStatus);
	}

	/**
	 * Sets the branch name of this compliance.
	 *
	 * @param branchName the branch name of this compliance
	 */
	@Override
	public void setBranchName(String branchName) {
		_compliance.setBranchName(branchName);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_compliance.setCachedModel(cachedModel);
	}

	/**
	 * Sets the capacity of this compliance.
	 *
	 * @param capacity the capacity of this compliance
	 */
	@Override
	public void setCapacity(String capacity) {
		_compliance.setCapacity(capacity);
	}

	/**
	 * Sets the comments of this compliance.
	 *
	 * @param comments the comments of this compliance
	 */
	@Override
	public void setComments(String comments) {
		_compliance.setComments(comments);
	}

	/**
	 * Sets the company ID of this compliance.
	 *
	 * @param companyId the company ID of this compliance
	 */
	@Override
	public void setCompanyId(long companyId) {
		_compliance.setCompanyId(companyId);
	}

	/**
	 * Sets the compliance ID of this compliance.
	 *
	 * @param complianceId the compliance ID of this compliance
	 */
	@Override
	public void setComplianceId(long complianceId) {
		_compliance.setComplianceId(complianceId);
	}

	/**
	 * Sets the contract effective end date of this compliance.
	 *
	 * @param contractEffectiveEndDate the contract effective end date of this compliance
	 */
	@Override
	public void setContractEffectiveEndDate(String contractEffectiveEndDate) {
		_compliance.setContractEffectiveEndDate(contractEffectiveEndDate);
	}

	/**
	 * Sets the contract ID of this compliance.
	 *
	 * @param contractId the contract ID of this compliance
	 */
	@Override
	public void setContractId(String contractId) {
		_compliance.setContractId(contractId);
	}

	/**
	 * Sets the create date of this compliance.
	 *
	 * @param createDate the create date of this compliance
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_compliance.setCreateDate(createDate);
	}

	/**
	 * Sets the createdby of this compliance.
	 *
	 * @param createdby the createdby of this compliance
	 */
	@Override
	public void setCreatedby(long createdby) {
		_compliance.setCreatedby(createdby);
	}

	/**
	 * Sets the entity ID of this compliance.
	 *
	 * @param entityId the entity ID of this compliance
	 */
	@Override
	public void setEntityId(String entityId) {
		_compliance.setEntityId(entityId);
	}

	/**
	 * Sets the error reason of this compliance.
	 *
	 * @param errorReason the error reason of this compliance
	 */
	@Override
	public void setErrorReason(String errorReason) {
		_compliance.setErrorReason(errorReason);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_compliance.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_compliance.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_compliance.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the firstapprover of this compliance.
	 *
	 * @param firstapprover the firstapprover of this compliance
	 */
	@Override
	public void setFirstapprover(String firstapprover) {
		_compliance.setFirstapprover(firstapprover);
	}

	/**
	 * Sets the first name of this compliance.
	 *
	 * @param firstName the first name of this compliance
	 */
	@Override
	public void setFirstName(String firstName) {
		_compliance.setFirstName(firstName);
	}

	/**
	 * Sets the former branch of this compliance.
	 *
	 * @param formerBranch the former branch of this compliance
	 */
	@Override
	public void setFormerBranch(String formerBranch) {
		_compliance.setFormerBranch(formerBranch);
	}

	/**
	 * Sets the group ID of this compliance.
	 *
	 * @param groupId the group ID of this compliance
	 */
	@Override
	public void setGroupId(long groupId) {
		_compliance.setGroupId(groupId);
	}

	/**
	 * Sets the history start date of this compliance.
	 *
	 * @param historyStartDate the history start date of this compliance
	 */
	@Override
	public void setHistoryStartDate(String historyStartDate) {
		_compliance.setHistoryStartDate(historyStartDate);
	}

	/**
	 * Sets the last name of this compliance.
	 *
	 * @param lastName the last name of this compliance
	 */
	@Override
	public void setLastName(String lastName) {
		_compliance.setLastName(lastName);
	}

	/**
	 * Sets the modifiedby of this compliance.
	 *
	 * @param modifiedby the modifiedby of this compliance
	 */
	@Override
	public void setModifiedby(String modifiedby) {
		_compliance.setModifiedby(modifiedby);
	}

	/**
	 * Sets the modified date of this compliance.
	 *
	 * @param modifiedDate the modified date of this compliance
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_compliance.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_compliance.setNew(n);
	}

	/**
	 * Sets the old org ID of this compliance.
	 *
	 * @param oldOrgId the old org ID of this compliance
	 */
	@Override
	public void setOldOrgId(String oldOrgId) {
		_compliance.setOldOrgId(oldOrgId);
	}

	/**
	 * Sets the old position ID of this compliance.
	 *
	 * @param oldPositionId the old position ID of this compliance
	 */
	@Override
	public void setOldPositionId(String oldPositionId) {
		_compliance.setOldPositionId(oldPositionId);
	}

	/**
	 * Sets the org ID of this compliance.
	 *
	 * @param orgId the org ID of this compliance
	 */
	@Override
	public void setOrgId(String orgId) {
		_compliance.setOrgId(orgId);
	}

	/**
	 * Sets the payroll no of this compliance.
	 *
	 * @param payrollNo the payroll no of this compliance
	 */
	@Override
	public void setPayrollNo(String payrollNo) {
		_compliance.setPayrollNo(payrollNo);
	}

	/**
	 * Sets the position ID of this compliance.
	 *
	 * @param positionId the position ID of this compliance
	 */
	@Override
	public void setPositionId(String positionId) {
		_compliance.setPositionId(positionId);
	}

	/**
	 * Sets the primary key of this compliance.
	 *
	 * @param primaryKey the primary key of this compliance
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_compliance.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_compliance.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the processed flag of this compliance.
	 *
	 * @param processedFlag the processed flag of this compliance
	 */
	@Override
	public void setProcessedFlag(String processedFlag) {
		_compliance.setProcessedFlag(processedFlag);
	}

	/**
	 * Sets the secondapprover of this compliance.
	 *
	 * @param secondapprover the secondapprover of this compliance
	 */
	@Override
	public void setSecondapprover(String secondapprover) {
		_compliance.setSecondapprover(secondapprover);
	}

	/**
	 * Sets the termination code of this compliance.
	 *
	 * @param terminationCode the termination code of this compliance
	 */
	@Override
	public void setTerminationCode(String terminationCode) {
		_compliance.setTerminationCode(terminationCode);
	}

	/**
	 * Sets the termination reason of this compliance.
	 *
	 * @param terminationReason the termination reason of this compliance
	 */
	@Override
	public void setTerminationReason(String terminationReason) {
		_compliance.setTerminationReason(terminationReason);
	}

	/**
	 * Sets the uuid of this compliance.
	 *
	 * @param uuid the uuid of this compliance
	 */
	@Override
	public void setUuid(String uuid) {
		_compliance.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Compliance>
		toCacheModel() {

		return _compliance.toCacheModel();
	}

	@Override
	public Compliance toEscapedModel() {
		return new ComplianceWrapper(_compliance.toEscapedModel());
	}

	@Override
	public String toString() {
		return _compliance.toString();
	}

	@Override
	public Compliance toUnescapedModel() {
		return new ComplianceWrapper(_compliance.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _compliance.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ComplianceWrapper)) {
			return false;
		}

		ComplianceWrapper complianceWrapper = (ComplianceWrapper)obj;

		if (Objects.equals(_compliance, complianceWrapper._compliance)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _compliance.getStagedModelType();
	}

	@Override
	public Compliance getWrappedModel() {
		return _compliance;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _compliance.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _compliance.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_compliance.resetOriginalValues();
	}

	private final Compliance _compliance;

}