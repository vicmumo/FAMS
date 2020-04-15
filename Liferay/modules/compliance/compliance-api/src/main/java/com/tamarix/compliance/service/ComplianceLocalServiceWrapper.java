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
 * Provides a wrapper for {@link ComplianceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ComplianceLocalService
 * @generated
 */
public class ComplianceLocalServiceWrapper
	implements ComplianceLocalService, ServiceWrapper<ComplianceLocalService> {

	public ComplianceLocalServiceWrapper(
		ComplianceLocalService complianceLocalService) {

		_complianceLocalService = complianceLocalService;
	}

	/**
	 * Adds the compliance to the database. Also notifies the appropriate model listeners.
	 *
	 * @param compliance the compliance
	 * @return the compliance that was added
	 */
	@Override
	public com.tamarix.compliance.model.Compliance addCompliance(
		com.tamarix.compliance.model.Compliance compliance) {

		return _complianceLocalService.addCompliance(compliance);
	}

	/**
	 * Creates a new compliance with the primary key. Does not add the compliance to the database.
	 *
	 * @param complianceId the primary key for the new compliance
	 * @return the new compliance
	 */
	@Override
	public com.tamarix.compliance.model.Compliance createCompliance(
		long complianceId) {

		return _complianceLocalService.createCompliance(complianceId);
	}

	/**
	 * Deletes the compliance from the database. Also notifies the appropriate model listeners.
	 *
	 * @param compliance the compliance
	 * @return the compliance that was removed
	 */
	@Override
	public com.tamarix.compliance.model.Compliance deleteCompliance(
		com.tamarix.compliance.model.Compliance compliance) {

		return _complianceLocalService.deleteCompliance(compliance);
	}

	/**
	 * Deletes the compliance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param complianceId the primary key of the compliance
	 * @return the compliance that was removed
	 * @throws PortalException if a compliance with the primary key could not be found
	 */
	@Override
	public com.tamarix.compliance.model.Compliance deleteCompliance(
			long complianceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _complianceLocalService.deleteCompliance(complianceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _complianceLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _complianceLocalService.dynamicQuery();
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

		return _complianceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.tamarix.compliance.model.impl.ComplianceModelImpl</code>.
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

		return _complianceLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.tamarix.compliance.model.impl.ComplianceModelImpl</code>.
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

		return _complianceLocalService.dynamicQuery(
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

		return _complianceLocalService.dynamicQueryCount(dynamicQuery);
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

		return _complianceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.tamarix.compliance.model.Compliance fetchCompliance(
		long complianceId) {

		return _complianceLocalService.fetchCompliance(complianceId);
	}

	/**
	 * Returns the compliance matching the UUID and group.
	 *
	 * @param uuid the compliance's UUID
	 * @param groupId the primary key of the group
	 * @return the matching compliance, or <code>null</code> if a matching compliance could not be found
	 */
	@Override
	public com.tamarix.compliance.model.Compliance
		fetchComplianceByUuidAndGroupId(String uuid, long groupId) {

		return _complianceLocalService.fetchComplianceByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _complianceLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the compliance with the primary key.
	 *
	 * @param complianceId the primary key of the compliance
	 * @return the compliance
	 * @throws PortalException if a compliance with the primary key could not be found
	 */
	@Override
	public com.tamarix.compliance.model.Compliance getCompliance(
			long complianceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _complianceLocalService.getCompliance(complianceId);
	}

	/**
	 * Returns the compliance matching the UUID and group.
	 *
	 * @param uuid the compliance's UUID
	 * @param groupId the primary key of the group
	 * @return the matching compliance
	 * @throws PortalException if a matching compliance could not be found
	 */
	@Override
	public com.tamarix.compliance.model.Compliance
			getComplianceByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _complianceLocalService.getComplianceByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the compliances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.tamarix.compliance.model.impl.ComplianceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of compliances
	 * @param end the upper bound of the range of compliances (not inclusive)
	 * @return the range of compliances
	 */
	@Override
	public java.util.List<com.tamarix.compliance.model.Compliance>
		getCompliances(int start, int end) {

		return _complianceLocalService.getCompliances(start, end);
	}

	/**
	 * Returns all the compliances matching the UUID and company.
	 *
	 * @param uuid the UUID of the compliances
	 * @param companyId the primary key of the company
	 * @return the matching compliances, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.tamarix.compliance.model.Compliance>
		getCompliancesByUuidAndCompanyId(String uuid, long companyId) {

		return _complianceLocalService.getCompliancesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of compliances matching the UUID and company.
	 *
	 * @param uuid the UUID of the compliances
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of compliances
	 * @param end the upper bound of the range of compliances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching compliances, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.tamarix.compliance.model.Compliance>
		getCompliancesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.tamarix.compliance.model.Compliance> orderByComparator) {

		return _complianceLocalService.getCompliancesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of compliances.
	 *
	 * @return the number of compliances
	 */
	@Override
	public int getCompliancesCount() {
		return _complianceLocalService.getCompliancesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _complianceLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _complianceLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _complianceLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _complianceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the compliance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param compliance the compliance
	 * @return the compliance that was updated
	 */
	@Override
	public com.tamarix.compliance.model.Compliance updateCompliance(
		com.tamarix.compliance.model.Compliance compliance) {

		return _complianceLocalService.updateCompliance(compliance);
	}

	@Override
	public ComplianceLocalService getWrappedService() {
		return _complianceLocalService;
	}

	@Override
	public void setWrappedService(
		ComplianceLocalService complianceLocalService) {

		_complianceLocalService = complianceLocalService;
	}

	private ComplianceLocalService _complianceLocalService;

}