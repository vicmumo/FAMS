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

import com.tamarix.compliance.model.Matrix;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Matrix in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MatrixCacheModel implements CacheModel<Matrix>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MatrixCacheModel)) {
			return false;
		}

		MatrixCacheModel matrixCacheModel = (MatrixCacheModel)obj;

		if (applicationId == matrixCacheModel.applicationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, applicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", applicationId=");
		sb.append(applicationId);
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
		sb.append(", applicationType=");
		sb.append(applicationType);
		sb.append(", applicationCategory=");
		sb.append(applicationCategory);
		sb.append(", responsibleActor=");
		sb.append(responsibleActor);
		sb.append(", responsibleActor2=");
		sb.append(responsibleActor2);
		sb.append(", backupActor=");
		sb.append(backupActor);
		sb.append(", backupActor2=");
		sb.append(backupActor2);
		sb.append(", approver=");
		sb.append(approver);
		sb.append(", approver2=");
		sb.append(approver2);
		sb.append(", backupApprover=");
		sb.append(backupApprover);
		sb.append(", backupApprover2=");
		sb.append(backupApprover2);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Matrix toEntityModel() {
		MatrixImpl matrixImpl = new MatrixImpl();

		if (uuid == null) {
			matrixImpl.setUuid("");
		}
		else {
			matrixImpl.setUuid(uuid);
		}

		matrixImpl.setApplicationId(applicationId);
		matrixImpl.setGroupId(groupId);
		matrixImpl.setCompanyId(companyId);
		matrixImpl.setCreatedby(createdby);

		if (modifiedby == null) {
			matrixImpl.setModifiedby("");
		}
		else {
			matrixImpl.setModifiedby(modifiedby);
		}

		if (createDate == Long.MIN_VALUE) {
			matrixImpl.setCreateDate(null);
		}
		else {
			matrixImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			matrixImpl.setModifiedDate(null);
		}
		else {
			matrixImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (applicationType == null) {
			matrixImpl.setApplicationType("");
		}
		else {
			matrixImpl.setApplicationType(applicationType);
		}

		if (applicationCategory == null) {
			matrixImpl.setApplicationCategory("");
		}
		else {
			matrixImpl.setApplicationCategory(applicationCategory);
		}

		if (responsibleActor == null) {
			matrixImpl.setResponsibleActor("");
		}
		else {
			matrixImpl.setResponsibleActor(responsibleActor);
		}

		if (responsibleActor2 == null) {
			matrixImpl.setResponsibleActor2("");
		}
		else {
			matrixImpl.setResponsibleActor2(responsibleActor2);
		}

		if (backupActor == null) {
			matrixImpl.setBackupActor("");
		}
		else {
			matrixImpl.setBackupActor(backupActor);
		}

		if (backupActor2 == null) {
			matrixImpl.setBackupActor2("");
		}
		else {
			matrixImpl.setBackupActor2(backupActor2);
		}

		if (approver == null) {
			matrixImpl.setApprover("");
		}
		else {
			matrixImpl.setApprover(approver);
		}

		if (approver2 == null) {
			matrixImpl.setApprover2("");
		}
		else {
			matrixImpl.setApprover2(approver2);
		}

		if (backupApprover == null) {
			matrixImpl.setBackupApprover("");
		}
		else {
			matrixImpl.setBackupApprover(backupApprover);
		}

		if (backupApprover2 == null) {
			matrixImpl.setBackupApprover2("");
		}
		else {
			matrixImpl.setBackupApprover2(backupApprover2);
		}

		matrixImpl.resetOriginalValues();

		return matrixImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		applicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		createdby = objectInput.readLong();
		modifiedby = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicationType = objectInput.readUTF();
		applicationCategory = objectInput.readUTF();
		responsibleActor = objectInput.readUTF();
		responsibleActor2 = objectInput.readUTF();
		backupActor = objectInput.readUTF();
		backupActor2 = objectInput.readUTF();
		approver = objectInput.readUTF();
		approver2 = objectInput.readUTF();
		backupApprover = objectInput.readUTF();
		backupApprover2 = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(applicationId);

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

		if (applicationType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationType);
		}

		if (applicationCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationCategory);
		}

		if (responsibleActor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(responsibleActor);
		}

		if (responsibleActor2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(responsibleActor2);
		}

		if (backupActor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(backupActor);
		}

		if (backupActor2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(backupActor2);
		}

		if (approver == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(approver);
		}

		if (approver2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(approver2);
		}

		if (backupApprover == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(backupApprover);
		}

		if (backupApprover2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(backupApprover2);
		}
	}

	public String uuid;
	public long applicationId;
	public long groupId;
	public long companyId;
	public long createdby;
	public String modifiedby;
	public long createDate;
	public long modifiedDate;
	public String applicationType;
	public String applicationCategory;
	public String responsibleActor;
	public String responsibleActor2;
	public String backupActor;
	public String backupActor2;
	public String approver;
	public String approver2;
	public String backupApprover;
	public String backupApprover2;

}