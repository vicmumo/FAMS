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

import com.tamarix.compliance.model.Compliance;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for Compliance. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ComplianceLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface ComplianceLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ComplianceLocalServiceUtil} to access the compliance local service. Add custom service methods to <code>com.tamarix.compliance.service.impl.ComplianceLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	 * Adds the compliance to the database. Also notifies the appropriate model listeners.
	 *
	 * @param compliance the compliance
	 * @return the compliance that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Compliance addCompliance(Compliance compliance);

	/**
	 * Creates a new compliance with the primary key. Does not add the compliance to the database.
	 *
	 * @param complianceId the primary key for the new compliance
	 * @return the new compliance
	 */
	@Transactional(enabled = false)
	public Compliance createCompliance(long complianceId);

	/**
	 * Deletes the compliance from the database. Also notifies the appropriate model listeners.
	 *
	 * @param compliance the compliance
	 * @return the compliance that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public Compliance deleteCompliance(Compliance compliance);

	/**
	 * Deletes the compliance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param complianceId the primary key of the compliance
	 * @return the compliance that was removed
	 * @throws PortalException if a compliance with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public Compliance deleteCompliance(long complianceId)
		throws PortalException;

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.tamarix.compliance.model.impl.ComplianceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.tamarix.compliance.model.impl.ComplianceModelImpl</code>.
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
	public Compliance fetchCompliance(long complianceId);

	/**
	 * Returns the compliance matching the UUID and group.
	 *
	 * @param uuid the compliance's UUID
	 * @param groupId the primary key of the group
	 * @return the matching compliance, or <code>null</code> if a matching compliance could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Compliance fetchComplianceByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	 * Returns the compliance with the primary key.
	 *
	 * @param complianceId the primary key of the compliance
	 * @return the compliance
	 * @throws PortalException if a compliance with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Compliance getCompliance(long complianceId) throws PortalException;

	/**
	 * Returns the compliance matching the UUID and group.
	 *
	 * @param uuid the compliance's UUID
	 * @param groupId the primary key of the group
	 * @return the matching compliance
	 * @throws PortalException if a matching compliance could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Compliance getComplianceByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Compliance> getCompliances(int start, int end);

	/**
	 * Returns all the compliances matching the UUID and company.
	 *
	 * @param uuid the UUID of the compliances
	 * @param companyId the primary key of the company
	 * @return the matching compliances, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Compliance> getCompliancesByUuidAndCompanyId(
		String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Compliance> getCompliancesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Compliance> orderByComparator);

	/**
	 * Returns the number of compliances.
	 *
	 * @return the number of compliances
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCompliancesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

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
	 * Updates the compliance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param compliance the compliance
	 * @return the compliance that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Compliance updateCompliance(Compliance compliance);

}