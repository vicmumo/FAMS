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
 * This class is a wrapper for {@link Matrix}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Matrix
 * @generated
 */
public class MatrixWrapper implements Matrix, ModelWrapper<Matrix> {

	public MatrixWrapper(Matrix matrix) {
		_matrix = matrix;
	}

	@Override
	public Class<?> getModelClass() {
		return Matrix.class;
	}

	@Override
	public String getModelClassName() {
		return Matrix.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("applicationId", getApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createdby", getCreatedby());
		attributes.put("modifiedby", getModifiedby());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicationType", getApplicationType());
		attributes.put("applicationCategory", getApplicationCategory());
		attributes.put("responsibleActor", getResponsibleActor());
		attributes.put("responsibleActor2", getResponsibleActor2());
		attributes.put("backupActor", getBackupActor());
		attributes.put("backupActor2", getBackupActor2());
		attributes.put("approver", getApprover());
		attributes.put("approver2", getApprover2());
		attributes.put("backupApprover", getBackupApprover());
		attributes.put("backupApprover2", getBackupApprover2());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long applicationId = (Long)attributes.get("applicationId");

		if (applicationId != null) {
			setApplicationId(applicationId);
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

		String applicationType = (String)attributes.get("applicationType");

		if (applicationType != null) {
			setApplicationType(applicationType);
		}

		String applicationCategory = (String)attributes.get(
			"applicationCategory");

		if (applicationCategory != null) {
			setApplicationCategory(applicationCategory);
		}

		String responsibleActor = (String)attributes.get("responsibleActor");

		if (responsibleActor != null) {
			setResponsibleActor(responsibleActor);
		}

		String responsibleActor2 = (String)attributes.get("responsibleActor2");

		if (responsibleActor2 != null) {
			setResponsibleActor2(responsibleActor2);
		}

		String backupActor = (String)attributes.get("backupActor");

		if (backupActor != null) {
			setBackupActor(backupActor);
		}

		String backupActor2 = (String)attributes.get("backupActor2");

		if (backupActor2 != null) {
			setBackupActor2(backupActor2);
		}

		String approver = (String)attributes.get("approver");

		if (approver != null) {
			setApprover(approver);
		}

		String approver2 = (String)attributes.get("approver2");

		if (approver2 != null) {
			setApprover2(approver2);
		}

		String backupApprover = (String)attributes.get("backupApprover");

		if (backupApprover != null) {
			setBackupApprover(backupApprover);
		}

		String backupApprover2 = (String)attributes.get("backupApprover2");

		if (backupApprover2 != null) {
			setBackupApprover2(backupApprover2);
		}
	}

	@Override
	public Object clone() {
		return new MatrixWrapper((Matrix)_matrix.clone());
	}

	@Override
	public int compareTo(Matrix matrix) {
		return _matrix.compareTo(matrix);
	}

	/**
	 * Returns the application category of this matrix.
	 *
	 * @return the application category of this matrix
	 */
	@Override
	public String getApplicationCategory() {
		return _matrix.getApplicationCategory();
	}

	/**
	 * Returns the application ID of this matrix.
	 *
	 * @return the application ID of this matrix
	 */
	@Override
	public long getApplicationId() {
		return _matrix.getApplicationId();
	}

	/**
	 * Returns the application type of this matrix.
	 *
	 * @return the application type of this matrix
	 */
	@Override
	public String getApplicationType() {
		return _matrix.getApplicationType();
	}

	/**
	 * Returns the approver of this matrix.
	 *
	 * @return the approver of this matrix
	 */
	@Override
	public String getApprover() {
		return _matrix.getApprover();
	}

	/**
	 * Returns the approver2 of this matrix.
	 *
	 * @return the approver2 of this matrix
	 */
	@Override
	public String getApprover2() {
		return _matrix.getApprover2();
	}

	/**
	 * Returns the backup actor of this matrix.
	 *
	 * @return the backup actor of this matrix
	 */
	@Override
	public String getBackupActor() {
		return _matrix.getBackupActor();
	}

	/**
	 * Returns the backup actor2 of this matrix.
	 *
	 * @return the backup actor2 of this matrix
	 */
	@Override
	public String getBackupActor2() {
		return _matrix.getBackupActor2();
	}

	/**
	 * Returns the backup approver of this matrix.
	 *
	 * @return the backup approver of this matrix
	 */
	@Override
	public String getBackupApprover() {
		return _matrix.getBackupApprover();
	}

	/**
	 * Returns the backup approver2 of this matrix.
	 *
	 * @return the backup approver2 of this matrix
	 */
	@Override
	public String getBackupApprover2() {
		return _matrix.getBackupApprover2();
	}

	/**
	 * Returns the company ID of this matrix.
	 *
	 * @return the company ID of this matrix
	 */
	@Override
	public long getCompanyId() {
		return _matrix.getCompanyId();
	}

	/**
	 * Returns the create date of this matrix.
	 *
	 * @return the create date of this matrix
	 */
	@Override
	public Date getCreateDate() {
		return _matrix.getCreateDate();
	}

	/**
	 * Returns the createdby of this matrix.
	 *
	 * @return the createdby of this matrix
	 */
	@Override
	public long getCreatedby() {
		return _matrix.getCreatedby();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _matrix.getExpandoBridge();
	}

	/**
	 * Returns the group ID of this matrix.
	 *
	 * @return the group ID of this matrix
	 */
	@Override
	public long getGroupId() {
		return _matrix.getGroupId();
	}

	/**
	 * Returns the modifiedby of this matrix.
	 *
	 * @return the modifiedby of this matrix
	 */
	@Override
	public String getModifiedby() {
		return _matrix.getModifiedby();
	}

	/**
	 * Returns the modified date of this matrix.
	 *
	 * @return the modified date of this matrix
	 */
	@Override
	public Date getModifiedDate() {
		return _matrix.getModifiedDate();
	}

	/**
	 * Returns the primary key of this matrix.
	 *
	 * @return the primary key of this matrix
	 */
	@Override
	public long getPrimaryKey() {
		return _matrix.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _matrix.getPrimaryKeyObj();
	}

	/**
	 * Returns the responsible actor of this matrix.
	 *
	 * @return the responsible actor of this matrix
	 */
	@Override
	public String getResponsibleActor() {
		return _matrix.getResponsibleActor();
	}

	/**
	 * Returns the responsible actor2 of this matrix.
	 *
	 * @return the responsible actor2 of this matrix
	 */
	@Override
	public String getResponsibleActor2() {
		return _matrix.getResponsibleActor2();
	}

	/**
	 * Returns the uuid of this matrix.
	 *
	 * @return the uuid of this matrix
	 */
	@Override
	public String getUuid() {
		return _matrix.getUuid();
	}

	@Override
	public int hashCode() {
		return _matrix.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _matrix.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _matrix.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _matrix.isNew();
	}

	@Override
	public void persist() {
		_matrix.persist();
	}

	/**
	 * Sets the application category of this matrix.
	 *
	 * @param applicationCategory the application category of this matrix
	 */
	@Override
	public void setApplicationCategory(String applicationCategory) {
		_matrix.setApplicationCategory(applicationCategory);
	}

	/**
	 * Sets the application ID of this matrix.
	 *
	 * @param applicationId the application ID of this matrix
	 */
	@Override
	public void setApplicationId(long applicationId) {
		_matrix.setApplicationId(applicationId);
	}

	/**
	 * Sets the application type of this matrix.
	 *
	 * @param applicationType the application type of this matrix
	 */
	@Override
	public void setApplicationType(String applicationType) {
		_matrix.setApplicationType(applicationType);
	}

	/**
	 * Sets the approver of this matrix.
	 *
	 * @param approver the approver of this matrix
	 */
	@Override
	public void setApprover(String approver) {
		_matrix.setApprover(approver);
	}

	/**
	 * Sets the approver2 of this matrix.
	 *
	 * @param approver2 the approver2 of this matrix
	 */
	@Override
	public void setApprover2(String approver2) {
		_matrix.setApprover2(approver2);
	}

	/**
	 * Sets the backup actor of this matrix.
	 *
	 * @param backupActor the backup actor of this matrix
	 */
	@Override
	public void setBackupActor(String backupActor) {
		_matrix.setBackupActor(backupActor);
	}

	/**
	 * Sets the backup actor2 of this matrix.
	 *
	 * @param backupActor2 the backup actor2 of this matrix
	 */
	@Override
	public void setBackupActor2(String backupActor2) {
		_matrix.setBackupActor2(backupActor2);
	}

	/**
	 * Sets the backup approver of this matrix.
	 *
	 * @param backupApprover the backup approver of this matrix
	 */
	@Override
	public void setBackupApprover(String backupApprover) {
		_matrix.setBackupApprover(backupApprover);
	}

	/**
	 * Sets the backup approver2 of this matrix.
	 *
	 * @param backupApprover2 the backup approver2 of this matrix
	 */
	@Override
	public void setBackupApprover2(String backupApprover2) {
		_matrix.setBackupApprover2(backupApprover2);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_matrix.setCachedModel(cachedModel);
	}

	/**
	 * Sets the company ID of this matrix.
	 *
	 * @param companyId the company ID of this matrix
	 */
	@Override
	public void setCompanyId(long companyId) {
		_matrix.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this matrix.
	 *
	 * @param createDate the create date of this matrix
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_matrix.setCreateDate(createDate);
	}

	/**
	 * Sets the createdby of this matrix.
	 *
	 * @param createdby the createdby of this matrix
	 */
	@Override
	public void setCreatedby(long createdby) {
		_matrix.setCreatedby(createdby);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_matrix.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_matrix.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_matrix.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the group ID of this matrix.
	 *
	 * @param groupId the group ID of this matrix
	 */
	@Override
	public void setGroupId(long groupId) {
		_matrix.setGroupId(groupId);
	}

	/**
	 * Sets the modifiedby of this matrix.
	 *
	 * @param modifiedby the modifiedby of this matrix
	 */
	@Override
	public void setModifiedby(String modifiedby) {
		_matrix.setModifiedby(modifiedby);
	}

	/**
	 * Sets the modified date of this matrix.
	 *
	 * @param modifiedDate the modified date of this matrix
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_matrix.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_matrix.setNew(n);
	}

	/**
	 * Sets the primary key of this matrix.
	 *
	 * @param primaryKey the primary key of this matrix
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_matrix.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_matrix.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the responsible actor of this matrix.
	 *
	 * @param responsibleActor the responsible actor of this matrix
	 */
	@Override
	public void setResponsibleActor(String responsibleActor) {
		_matrix.setResponsibleActor(responsibleActor);
	}

	/**
	 * Sets the responsible actor2 of this matrix.
	 *
	 * @param responsibleActor2 the responsible actor2 of this matrix
	 */
	@Override
	public void setResponsibleActor2(String responsibleActor2) {
		_matrix.setResponsibleActor2(responsibleActor2);
	}

	/**
	 * Sets the uuid of this matrix.
	 *
	 * @param uuid the uuid of this matrix
	 */
	@Override
	public void setUuid(String uuid) {
		_matrix.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Matrix> toCacheModel() {
		return _matrix.toCacheModel();
	}

	@Override
	public Matrix toEscapedModel() {
		return new MatrixWrapper(_matrix.toEscapedModel());
	}

	@Override
	public String toString() {
		return _matrix.toString();
	}

	@Override
	public Matrix toUnescapedModel() {
		return new MatrixWrapper(_matrix.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _matrix.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MatrixWrapper)) {
			return false;
		}

		MatrixWrapper matrixWrapper = (MatrixWrapper)obj;

		if (Objects.equals(_matrix, matrixWrapper._matrix)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _matrix.getStagedModelType();
	}

	@Override
	public Matrix getWrappedModel() {
		return _matrix;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _matrix.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _matrix.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_matrix.resetOriginalValues();
	}

	private final Matrix _matrix;

}