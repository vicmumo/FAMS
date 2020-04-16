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

package com.tamarix.compliance.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.tamarix.compliance.model.Matrix;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for Matrix. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see MatrixLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface MatrixLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MatrixLocalServiceUtil} to access the matrix local service. Add custom service methods to <code>com.tamarix.compliance.service.impl.MatrixLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	 * Adds the matrix to the database. Also notifies the appropriate model listeners.
	 *
	 * @param matrix the matrix
	 * @return the matrix that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Matrix addMatrix(Matrix matrix);

	/**
	 * Creates a new matrix with the primary key. Does not add the matrix to the database.
	 *
	 * @param applicationId the primary key for the new matrix
	 * @return the new matrix
	 */
	@Transactional(enabled = false)
	public Matrix createMatrix(long applicationId);

	/**
	 * Deletes the matrix with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param applicationId the primary key of the matrix
	 * @return the matrix that was removed
	 * @throws PortalException if a matrix with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public Matrix deleteMatrix(long applicationId) throws PortalException;

	/**
	 * Deletes the matrix from the database. Also notifies the appropriate model listeners.
	 *
	 * @param matrix the matrix
	 * @return the matrix that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public Matrix deleteMatrix(Matrix matrix);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.tamarix.compliance.model.impl.MatrixModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.tamarix.compliance.model.impl.MatrixModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Matrix fetchMatrix(long applicationId);

	/**
	 * Returns the matrix matching the UUID and group.
	 *
	 * @param uuid the matrix's UUID
	 * @param groupId the primary key of the group
	 * @return the matching matrix, or <code>null</code> if a matching matrix could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Matrix fetchMatrixByUuidAndGroupId(String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the matrix with the primary key.
	 *
	 * @param applicationId the primary key of the matrix
	 * @return the matrix
	 * @throws PortalException if a matrix with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Matrix getMatrix(long applicationId) throws PortalException;

	/**
	 * Returns the matrix matching the UUID and group.
	 *
	 * @param uuid the matrix's UUID
	 * @param groupId the primary key of the group
	 * @return the matching matrix
	 * @throws PortalException if a matching matrix could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Matrix getMatrixByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the matrixs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.tamarix.compliance.model.impl.MatrixModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of matrixs
	 * @param end the upper bound of the range of matrixs (not inclusive)
	 * @return the range of matrixs
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Matrix> getMatrixs(int start, int end);

	/**
	 * Returns all the matrixs matching the UUID and company.
	 *
	 * @param uuid the UUID of the matrixs
	 * @param companyId the primary key of the company
	 * @return the matching matrixs, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Matrix> getMatrixsByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of matrixs matching the UUID and company.
	 *
	 * @param uuid the UUID of the matrixs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of matrixs
	 * @param end the upper bound of the range of matrixs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching matrixs, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Matrix> getMatrixsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Matrix> orderByComparator);

	/**
	 * Returns the number of matrixs.
	 *
	 * @return the number of matrixs
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getMatrixsCount();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Updates the matrix in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param matrix the matrix
	 * @return the matrix that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Matrix updateMatrix(Matrix matrix);

}