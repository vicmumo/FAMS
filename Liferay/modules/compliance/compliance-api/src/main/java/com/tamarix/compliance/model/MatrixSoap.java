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
 * This class is used by SOAP remote services, specifically {@link com.tamarix.compliance.service.http.MatrixServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MatrixSoap implements Serializable {

	public static MatrixSoap toSoapModel(Matrix model) {
		MatrixSoap soapModel = new MatrixSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setApplicationId(model.getApplicationId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreatedby(model.getCreatedby());
		soapModel.setModifiedby(model.getModifiedby());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setApplicationType(model.getApplicationType());
		soapModel.setApplicationCategory(model.getApplicationCategory());
		soapModel.setResponsibleActor(model.getResponsibleActor());
		soapModel.setResponsibleActor2(model.getResponsibleActor2());
		soapModel.setBackupActor(model.getBackupActor());
		soapModel.setBackupActor2(model.getBackupActor2());
		soapModel.setApprover(model.getApprover());
		soapModel.setApprover2(model.getApprover2());
		soapModel.setBackupApprover(model.getBackupApprover());
		soapModel.setBackupApprover2(model.getBackupApprover2());

		return soapModel;
	}

	public static MatrixSoap[] toSoapModels(Matrix[] models) {
		MatrixSoap[] soapModels = new MatrixSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MatrixSoap[][] toSoapModels(Matrix[][] models) {
		MatrixSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MatrixSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MatrixSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MatrixSoap[] toSoapModels(List<Matrix> models) {
		List<MatrixSoap> soapModels = new ArrayList<MatrixSoap>(models.size());

		for (Matrix model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MatrixSoap[soapModels.size()]);
	}

	public MatrixSoap() {
	}

	public long getPrimaryKey() {
		return _applicationId;
	}

	public void setPrimaryKey(long pk) {
		setApplicationId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getApplicationId() {
		return _applicationId;
	}

	public void setApplicationId(long applicationId) {
		_applicationId = applicationId;
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

	public String getApplicationType() {
		return _applicationType;
	}

	public void setApplicationType(String applicationType) {
		_applicationType = applicationType;
	}

	public String getApplicationCategory() {
		return _applicationCategory;
	}

	public void setApplicationCategory(String applicationCategory) {
		_applicationCategory = applicationCategory;
	}

	public String getResponsibleActor() {
		return _responsibleActor;
	}

	public void setResponsibleActor(String responsibleActor) {
		_responsibleActor = responsibleActor;
	}

	public String getResponsibleActor2() {
		return _responsibleActor2;
	}

	public void setResponsibleActor2(String responsibleActor2) {
		_responsibleActor2 = responsibleActor2;
	}

	public String getBackupActor() {
		return _backupActor;
	}

	public void setBackupActor(String backupActor) {
		_backupActor = backupActor;
	}

	public String getBackupActor2() {
		return _backupActor2;
	}

	public void setBackupActor2(String backupActor2) {
		_backupActor2 = backupActor2;
	}

	public String getApprover() {
		return _approver;
	}

	public void setApprover(String approver) {
		_approver = approver;
	}

	public String getApprover2() {
		return _approver2;
	}

	public void setApprover2(String approver2) {
		_approver2 = approver2;
	}

	public String getBackupApprover() {
		return _backupApprover;
	}

	public void setBackupApprover(String backupApprover) {
		_backupApprover = backupApprover;
	}

	public String getBackupApprover2() {
		return _backupApprover2;
	}

	public void setBackupApprover2(String backupApprover2) {
		_backupApprover2 = backupApprover2;
	}

	private String _uuid;
	private long _applicationId;
	private long _groupId;
	private long _companyId;
	private long _createdby;
	private String _modifiedby;
	private Date _createDate;
	private Date _modifiedDate;
	private String _applicationType;
	private String _applicationCategory;
	private String _responsibleActor;
	private String _responsibleActor2;
	private String _backupActor;
	private String _backupActor2;
	private String _approver;
	private String _approver2;
	private String _backupApprover;
	private String _backupApprover2;

}