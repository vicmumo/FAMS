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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.tamarix.compliance.service.http.ComplianceServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ComplianceSoap implements Serializable {

	public static ComplianceSoap toSoapModel(Compliance model) {
		ComplianceSoap soapModel = new ComplianceSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setComplianceId(model.getComplianceId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreatedby(model.getCreatedby());
		soapModel.setModifiedby(model.getModifiedby());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setLastName(model.getLastName());
		soapModel.setBranchName(model.getBranchName());
		soapModel.setPayrollNo(model.getPayrollNo());
		soapModel.setTerminationReason(model.getTerminationReason());
		soapModel.setTerminationCode(model.getTerminationCode());
		soapModel.setFormerBranch(model.getFormerBranch());
		soapModel.setContractId(model.getContractId());
		soapModel.setEntityId(model.getEntityId());
		soapModel.setApprovalDate(model.getApprovalDate());
		soapModel.setComments(model.getComments());
		soapModel.setApproverContractNumber(model.getApproverContractNumber());
		soapModel.setAgentVerdict(model.getAgentVerdict());
		soapModel.setAgentAction(model.getAgentAction());
		soapModel.setProcessedFlag(model.getProcessedFlag());
		soapModel.setErrorReason(model.getErrorReason());
		soapModel.setAssignmentStatus(model.getAssignmentStatus());
		soapModel.setCapacity(model.getCapacity());
		soapModel.setPositionId(model.getPositionId());
		soapModel.setOrgId(model.getOrgId());
		soapModel.setHistoryStartDate(model.getHistoryStartDate());
		soapModel.setOldOrgId(model.getOldOrgId());
		soapModel.setOldPositionId(model.getOldPositionId());
		soapModel.setContractEffectiveEndDate(
			model.getContractEffectiveEndDate());
		soapModel.setApplicationTye(model.getApplicationTye());
		soapModel.setApplicationCategory(model.getApplicationCategory());
		soapModel.setFirstapprover(model.getFirstapprover());
		soapModel.setSecondapprover(model.getSecondapprover());

		return soapModel;
	}

	public static ComplianceSoap[] toSoapModels(Compliance[] models) {
		ComplianceSoap[] soapModels = new ComplianceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ComplianceSoap[][] toSoapModels(Compliance[][] models) {
		ComplianceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ComplianceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ComplianceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ComplianceSoap[] toSoapModels(List<Compliance> models) {
		List<ComplianceSoap> soapModels = new ArrayList<ComplianceSoap>(
			models.size());

		for (Compliance model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ComplianceSoap[soapModels.size()]);
	}

	public ComplianceSoap() {
	}

	public long getPrimaryKey() {
		return _complianceId;
	}

	public void setPrimaryKey(long pk) {
		setComplianceId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getComplianceId() {
		return _complianceId;
	}

	public void setComplianceId(long complianceId) {
		_complianceId = complianceId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getCreatedby() {
		return _createdby;
	}

	public void setCreatedby(long createdby) {
		_createdby = createdby;
	}

	public String getModifiedby() {
		return _modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		_modifiedby = modifiedby;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public String getBranchName() {
		return _branchName;
	}

	public void setBranchName(String branchName) {
		_branchName = branchName;
	}

	public String getPayrollNo() {
		return _payrollNo;
	}

	public void setPayrollNo(String payrollNo) {
		_payrollNo = payrollNo;
	}

	public String getTerminationReason() {
		return _terminationReason;
	}

	public void setTerminationReason(String terminationReason) {
		_terminationReason = terminationReason;
	}

	public String getTerminationCode() {
		return _terminationCode;
	}

	public void setTerminationCode(String terminationCode) {
		_terminationCode = terminationCode;
	}

	public String getFormerBranch() {
		return _formerBranch;
	}

	public void setFormerBranch(String formerBranch) {
		_formerBranch = formerBranch;
	}

	public String getContractId() {
		return _contractId;
	}

	public void setContractId(String contractId) {
		_contractId = contractId;
	}

	public String getEntityId() {
		return _entityId;
	}

	public void setEntityId(String entityId) {
		_entityId = entityId;
	}

	public String getApprovalDate() {
		return _approvalDate;
	}

	public void setApprovalDate(String approvalDate) {
		_approvalDate = approvalDate;
	}

	public String getComments() {
		return _comments;
	}

	public void setComments(String comments) {
		_comments = comments;
	}

	public String getApproverContractNumber() {
		return _approverContractNumber;
	}

	public void setApproverContractNumber(String approverContractNumber) {
		_approverContractNumber = approverContractNumber;
	}

	public String getAgentVerdict() {
		return _agentVerdict;
	}

	public void setAgentVerdict(String agentVerdict) {
		_agentVerdict = agentVerdict;
	}

	public String getAgentAction() {
		return _agentAction;
	}

	public void setAgentAction(String agentAction) {
		_agentAction = agentAction;
	}

	public String getProcessedFlag() {
		return _processedFlag;
	}

	public void setProcessedFlag(String processedFlag) {
		_processedFlag = processedFlag;
	}

	public String getErrorReason() {
		return _errorReason;
	}

	public void setErrorReason(String errorReason) {
		_errorReason = errorReason;
	}

	public String getAssignmentStatus() {
		return _assignmentStatus;
	}

	public void setAssignmentStatus(String assignmentStatus) {
		_assignmentStatus = assignmentStatus;
	}

	public String getCapacity() {
		return _capacity;
	}

	public void setCapacity(String capacity) {
		_capacity = capacity;
	}

	public String getPositionId() {
		return _positionId;
	}

	public void setPositionId(String positionId) {
		_positionId = positionId;
	}

	public String getOrgId() {
		return _orgId;
	}

	public void setOrgId(String orgId) {
		_orgId = orgId;
	}

	public String getHistoryStartDate() {
		return _historyStartDate;
	}

	public void setHistoryStartDate(String historyStartDate) {
		_historyStartDate = historyStartDate;
	}

	public String getOldOrgId() {
		return _oldOrgId;
	}

	public void setOldOrgId(String oldOrgId) {
		_oldOrgId = oldOrgId;
	}

	public String getOldPositionId() {
		return _oldPositionId;
	}

	public void setOldPositionId(String oldPositionId) {
		_oldPositionId = oldPositionId;
	}

	public String getContractEffectiveEndDate() {
		return _contractEffectiveEndDate;
	}

	public void setContractEffectiveEndDate(String contractEffectiveEndDate) {
		_contractEffectiveEndDate = contractEffectiveEndDate;
	}

	public String getApplicationTye() {
		return _applicationTye;
	}

	public void setApplicationTye(String applicationTye) {
		_applicationTye = applicationTye;
	}

	public String getApplicationCategory() {
		return _applicationCategory;
	}

	public void setApplicationCategory(String applicationCategory) {
		_applicationCategory = applicationCategory;
	}

	public String getFirstapprover() {
		return _firstapprover;
	}

	public void setFirstapprover(String firstapprover) {
		_firstapprover = firstapprover;
	}

	public String getSecondapprover() {
		return _secondapprover;
	}

	public void setSecondapprover(String secondapprover) {
		_secondapprover = secondapprover;
	}

	private String _uuid;
	private long _complianceId;
	private long _groupId;
	private long _companyId;
	private long _createdby;
	private String _modifiedby;
	private Date _createDate;
	private Date _modifiedDate;
	private String _firstName;
	private String _lastName;
	private String _branchName;
	private String _payrollNo;
	private String _terminationReason;
	private String _terminationCode;
	private String _formerBranch;
	private String _contractId;
	private String _entityId;
	private String _approvalDate;
	private String _comments;
	private String _approverContractNumber;
	private String _agentVerdict;
	private String _agentAction;
	private String _processedFlag;
	private String _errorReason;
	private String _assignmentStatus;
	private String _capacity;
	private String _positionId;
	private String _orgId;
	private String _historyStartDate;
	private String _oldOrgId;
	private String _oldPositionId;
	private String _contractEffectiveEndDate;
	private String _applicationTye;
	private String _applicationCategory;
	private String _firstapprover;
	private String _secondapprover;

}