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

package com.tamarix.compliance.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.tamarix.compliance.exception.NoSuchComplianceException;
import com.tamarix.compliance.model.Compliance;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the compliance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ComplianceUtil
 * @generated
 */
@ProviderType
public interface CompliancePersistence extends BasePersistence<Compliance> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ComplianceUtil} to access the compliance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, Compliance> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the compliances where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching compliances
	 */
	public java.util.List<Compliance> findByUuid(String uuid);

	/**
	 * Returns a range of all the compliances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComplianceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of compliances
	 * @param end the upper bound of the range of compliances (not inclusive)
	 * @return the range of matching compliances
	 */
	public java.util.List<Compliance> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the compliances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComplianceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of compliances
	 * @param end the upper bound of the range of compliances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching compliances
	 */
	public java.util.List<Compliance> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Compliance>
			orderByComparator);

	/**
	 * Returns an ordered range of all the compliances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComplianceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of compliances
	 * @param end the upper bound of the range of compliances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching compliances
	 */
	public java.util.List<Compliance> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Compliance>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first compliance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching compliance
	 * @throws NoSuchComplianceException if a matching compliance could not be found
	 */
	public Compliance findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Compliance>
				orderByComparator)
		throws NoSuchComplianceException;

	/**
	 * Returns the first compliance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching compliance, or <code>null</code> if a matching compliance could not be found
	 */
	public Compliance fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Compliance>
			orderByComparator);

	/**
	 * Returns the last compliance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching compliance
	 * @throws NoSuchComplianceException if a matching compliance could not be found
	 */
	public Compliance findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Compliance>
				orderByComparator)
		throws NoSuchComplianceException;

	/**
	 * Returns the last compliance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching compliance, or <code>null</code> if a matching compliance could not be found
	 */
	public Compliance fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Compliance>
			orderByComparator);

	/**
	 * Returns the compliances before and after the current compliance in the ordered set where uuid = &#63;.
	 *
	 * @param complianceId the primary key of the current compliance
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next compliance
	 * @throws NoSuchComplianceException if a compliance with the primary key could not be found
	 */
	public Compliance[] findByUuid_PrevAndNext(
			long complianceId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Compliance>
				orderByComparator)
		throws NoSuchComplianceException;

	/**
	 * Removes all the compliances where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of compliances where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching compliances
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the compliance where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchComplianceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching compliance
	 * @throws NoSuchComplianceException if a matching compliance could not be found
	 */
	public Compliance findByUUID_G(String uuid, long groupId)
		throws NoSuchComplianceException;

	/**
	 * Returns the compliance where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching compliance, or <code>null</code> if a matching compliance could not be found
	 */
	public Compliance fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the compliance where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching compliance, or <code>null</code> if a matching compliance could not be found
	 */
	public Compliance fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the compliance where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the compliance that was removed
	 */
	public Compliance removeByUUID_G(String uuid, long groupId)
		throws NoSuchComplianceException;

	/**
	 * Returns the number of compliances where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching compliances
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the compliances where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching compliances
	 */
	public java.util.List<Compliance> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the compliances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComplianceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of compliances
	 * @param end the upper bound of the range of compliances (not inclusive)
	 * @return the range of matching compliances
	 */
	public java.util.List<Compliance> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the compliances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComplianceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of compliances
	 * @param end the upper bound of the range of compliances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching compliances
	 */
	public java.util.List<Compliance> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Compliance>
			orderByComparator);

	/**
	 * Returns an ordered range of all the compliances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComplianceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of compliances
	 * @param end the upper bound of the range of compliances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching compliances
	 */
	public java.util.List<Compliance> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Compliance>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first compliance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching compliance
	 * @throws NoSuchComplianceException if a matching compliance could not be found
	 */
	public Compliance findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Compliance>
				orderByComparator)
		throws NoSuchComplianceException;

	/**
	 * Returns the first compliance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching compliance, or <code>null</code> if a matching compliance could not be found
	 */
	public Compliance fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Compliance>
			orderByComparator);

	/**
	 * Returns the last compliance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching compliance
	 * @throws NoSuchComplianceException if a matching compliance could not be found
	 */
	public Compliance findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Compliance>
				orderByComparator)
		throws NoSuchComplianceException;

	/**
	 * Returns the last compliance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching compliance, or <code>null</code> if a matching compliance could not be found
	 */
	public Compliance fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Compliance>
			orderByComparator);

	/**
	 * Returns the compliances before and after the current compliance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param complianceId the primary key of the current compliance
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next compliance
	 * @throws NoSuchComplianceException if a compliance with the primary key could not be found
	 */
	public Compliance[] findByUuid_C_PrevAndNext(
			long complianceId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Compliance>
				orderByComparator)
		throws NoSuchComplianceException;

	/**
	 * Removes all the compliances where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of compliances where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching compliances
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the compliance in the entity cache if it is enabled.
	 *
	 * @param compliance the compliance
	 */
	public void cacheResult(Compliance compliance);

	/**
	 * Caches the compliances in the entity cache if it is enabled.
	 *
	 * @param compliances the compliances
	 */
	public void cacheResult(java.util.List<Compliance> compliances);

	/**
	 * Creates a new compliance with the primary key. Does not add the compliance to the database.
	 *
	 * @param complianceId the primary key for the new compliance
	 * @return the new compliance
	 */
	public Compliance create(long complianceId);

	/**
	 * Removes the compliance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param complianceId the primary key of the compliance
	 * @return the compliance that was removed
	 * @throws NoSuchComplianceException if a compliance with the primary key could not be found
	 */
	public Compliance remove(long complianceId)
		throws NoSuchComplianceException;

	public Compliance updateImpl(Compliance compliance);

	/**
	 * Returns the compliance with the primary key or throws a <code>NoSuchComplianceException</code> if it could not be found.
	 *
	 * @param complianceId the primary key of the compliance
	 * @return the compliance
	 * @throws NoSuchComplianceException if a compliance with the primary key could not be found
	 */
	public Compliance findByPrimaryKey(long complianceId)
		throws NoSuchComplianceException;

	/**
	 * Returns the compliance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param complianceId the primary key of the compliance
	 * @return the compliance, or <code>null</code> if a compliance with the primary key could not be found
	 */
	public Compliance fetchByPrimaryKey(long complianceId);

	/**
	 * Returns all the compliances.
	 *
	 * @return the compliances
	 */
	public java.util.List<Compliance> findAll();

	/**
	 * Returns a range of all the compliances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComplianceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of compliances
	 * @param end the upper bound of the range of compliances (not inclusive)
	 * @return the range of compliances
	 */
	public java.util.List<Compliance> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the compliances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComplianceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of compliances
	 * @param end the upper bound of the range of compliances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of compliances
	 */
	public java.util.List<Compliance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Compliance>
			orderByComparator);

	/**
	 * Returns an ordered range of all the compliances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComplianceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of compliances
	 * @param end the upper bound of the range of compliances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of compliances
	 */
	public java.util.List<Compliance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Compliance>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the compliances from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of compliances.
	 *
	 * @return the number of compliances
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}