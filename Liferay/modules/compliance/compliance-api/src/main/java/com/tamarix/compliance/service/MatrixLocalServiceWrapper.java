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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MatrixLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MatrixLocalService
 * @generated
 */
public class MatrixLocalServiceWrapper
	implements MatrixLocalService, ServiceWrapper<MatrixLocalService> {

	public MatrixLocalServiceWrapper(MatrixLocalService matrixLocalService) {
		_matrixLocalService = matrixLocalService;
	}

	/**
	 * Adds the matrix to the database. Also notifies the appropriate model listeners.
	 *
	 * @param matrix the matrix
	 * @return the matrix that was added
	 */
	@Override
	public com.tamarix.compliance.model.Matrix addMatrix(
		com.tamarix.compliance.model.Matrix matrix) {

		return _matrixLocalService.addMatrix(matrix);
	}

	/**
	 * Creates a new matrix with the primary key. Does not add the matrix to the database.
	 *
	 * @param applicationId the primary key for the new matrix
	 * @return the new matrix
	 */
	@Override
	public com.tamarix.compliance.model.Matrix createMatrix(
		long applicationId) {

		return _matrixLocalService.createMatrix(applicationId);
	}

	/**
	 * Deletes the matrix with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param applicationId the primary key of the matrix
	 * @return the matrix that was removed
	 * @throws PortalException if a matrix with the primary key could not be found
	 */
	@Override
	public com.tamarix.compliance.model.Matrix deleteMatrix(long applicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _matrixLocalService.deleteMatrix(applicationId);
	}

	/**
	 * Deletes the matrix from the database. Also notifies the appropriate model listeners.
	 *
	 * @param matrix the matrix
	 * @return the matrix that was removed
	 */
	@Override
	public com.tamarix.compliance.model.Matrix deleteMatrix(
		com.tamarix.compliance.model.Matrix matrix) {

		return _matrixLocalService.deleteMatrix(matrix);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _matrixLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _matrixLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _matrixLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _matrixLocalService.dynamicQuery(dynamicQuery, start, end);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _matrixLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _matrixLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _matrixLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.tamarix.compliance.model.Matrix fetchMatrix(long applicationId) {
		return _matrixLocalService.fetchMatrix(applicationId);
	}

	/**
	 * Returns the matrix matching the UUID and group.
	 *
	 * @param uuid the matrix's UUID
	 * @param groupId the primary key of the group
	 * @return the matching matrix, or <code>null</code> if a matching matrix could not be found
	 */
	@Override
	public com.tamarix.compliance.model.Matrix fetchMatrixByUuidAndGroupId(
		String uuid, long groupId) {

		return _matrixLocalService.fetchMatrixByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _matrixLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _matrixLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _matrixLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the matrix with the primary key.
	 *
	 * @param applicationId the primary key of the matrix
	 * @return the matrix
	 * @throws PortalException if a matrix with the primary key could not be found
	 */
	@Override
	public com.tamarix.compliance.model.Matrix getMatrix(long applicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _matrixLocalService.getMatrix(applicationId);
	}

	/**
	 * Returns the matrix matching the UUID and group.
	 *
	 * @param uuid the matrix's UUID
	 * @param groupId the primary key of the group
	 * @return the matching matrix
	 * @throws PortalException if a matching matrix could not be found
	 */
	@Override
	public com.tamarix.compliance.model.Matrix getMatrixByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _matrixLocalService.getMatrixByUuidAndGroupId(uuid, groupId);
	}

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
	@Override
	public java.util.List<com.tamarix.compliance.model.Matrix> getMatrixs(
		int start, int end) {

		return _matrixLocalService.getMatrixs(start, end);
	}

	/**
	 * Returns all the matrixs matching the UUID and company.
	 *
	 * @param uuid the UUID of the matrixs
	 * @param companyId the primary key of the company
	 * @return the matching matrixs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.tamarix.compliance.model.Matrix>
		getMatrixsByUuidAndCompanyId(String uuid, long companyId) {

		return _matrixLocalService.getMatrixsByUuidAndCompanyId(
			uuid, companyId);
	}

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
	@Override
	public java.util.List<com.tamarix.compliance.model.Matrix>
		getMatrixsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.tamarix.compliance.model.Matrix> orderByComparator) {

		return _matrixLocalService.getMatrixsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of matrixs.
	 *
	 * @return the number of matrixs
	 */
	@Override
	public int getMatrixsCount() {
		return _matrixLocalService.getMatrixsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _matrixLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _matrixLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the matrix in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param matrix the matrix
	 * @return the matrix that was updated
	 */
	@Override
	public com.tamarix.compliance.model.Matrix updateMatrix(
		com.tamarix.compliance.model.Matrix matrix) {

		return _matrixLocalService.updateMatrix(matrix);
	}

	@Override
	public MatrixLocalService getWrappedService() {
		return _matrixLocalService;
	}

	@Override
	public void setWrappedService(MatrixLocalService matrixLocalService) {
		_matrixLocalService = matrixLocalService;
	}

	private MatrixLocalService _matrixLocalService;

}