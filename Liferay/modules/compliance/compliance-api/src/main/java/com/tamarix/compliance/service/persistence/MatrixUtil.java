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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.tamarix.compliance.model.Matrix;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the matrix service. This utility wraps <code>com.tamarix.compliance.service.persistence.impl.MatrixPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MatrixPersistence
 * @generated
 */
public class MatrixUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Matrix matrix) {
		getPersistence().clearCache(matrix);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Matrix> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Matrix> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Matrix> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Matrix> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Matrix> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Matrix update(Matrix matrix) {
		return getPersistence().update(matrix);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Matrix update(Matrix matrix, ServiceContext serviceContext) {
		return getPersistence().update(matrix, serviceContext);
	}

	/**
	 * Returns all the matrixs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching matrixs
	 */
	public static List<Matrix> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the matrixs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MatrixModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of matrixs
	 * @param end the upper bound of the range of matrixs (not inclusive)
	 * @return the range of matching matrixs
	 */
	public static List<Matrix> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the matrixs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MatrixModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of matrixs
	 * @param end the upper bound of the range of matrixs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching matrixs
	 */
	public static List<Matrix> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Matrix> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the matrixs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MatrixModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of matrixs
	 * @param end the upper bound of the range of matrixs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching matrixs
	 */
	public static List<Matrix> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Matrix> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first matrix in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching matrix
	 * @throws NoSuchMatrixException if a matching matrix could not be found
	 */
	public static Matrix findByUuid_First(
			String uuid, OrderByComparator<Matrix> orderByComparator)
		throws com.tamarix.compliance.exception.NoSuchMatrixException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first matrix in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching matrix, or <code>null</code> if a matching matrix could not be found
	 */
	public static Matrix fetchByUuid_First(
		String uuid, OrderByComparator<Matrix> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last matrix in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching matrix
	 * @throws NoSuchMatrixException if a matching matrix could not be found
	 */
	public static Matrix findByUuid_Last(
			String uuid, OrderByComparator<Matrix> orderByComparator)
		throws com.tamarix.compliance.exception.NoSuchMatrixException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last matrix in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching matrix, or <code>null</code> if a matching matrix could not be found
	 */
	public static Matrix fetchByUuid_Last(
		String uuid, OrderByComparator<Matrix> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the matrixs before and after the current matrix in the ordered set where uuid = &#63;.
	 *
	 * @param applicationId the primary key of the current matrix
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next matrix
	 * @throws NoSuchMatrixException if a matrix with the primary key could not be found
	 */
	public static Matrix[] findByUuid_PrevAndNext(
			long applicationId, String uuid,
			OrderByComparator<Matrix> orderByComparator)
		throws com.tamarix.compliance.exception.NoSuchMatrixException {

		return getPersistence().findByUuid_PrevAndNext(
			applicationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the matrixs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of matrixs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching matrixs
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the matrix where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMatrixException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching matrix
	 * @throws NoSuchMatrixException if a matching matrix could not be found
	 */
	public static Matrix findByUUID_G(String uuid, long groupId)
		throws com.tamarix.compliance.exception.NoSuchMatrixException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the matrix where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching matrix, or <code>null</code> if a matching matrix could not be found
	 */
	public static Matrix fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the matrix where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching matrix, or <code>null</code> if a matching matrix could not be found
	 */
	public static Matrix fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the matrix where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matrix that was removed
	 */
	public static Matrix removeByUUID_G(String uuid, long groupId)
		throws com.tamarix.compliance.exception.NoSuchMatrixException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of matrixs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching matrixs
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the matrixs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching matrixs
	 */
	public static List<Matrix> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the matrixs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MatrixModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of matrixs
	 * @param end the upper bound of the range of matrixs (not inclusive)
	 * @return the range of matching matrixs
	 */
	public static List<Matrix> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the matrixs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MatrixModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of matrixs
	 * @param end the upper bound of the range of matrixs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching matrixs
	 */
	public static List<Matrix> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Matrix> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the matrixs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MatrixModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of matrixs
	 * @param end the upper bound of the range of matrixs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching matrixs
	 */
	public static List<Matrix> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Matrix> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first matrix in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching matrix
	 * @throws NoSuchMatrixException if a matching matrix could not be found
	 */
	public static Matrix findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Matrix> orderByComparator)
		throws com.tamarix.compliance.exception.NoSuchMatrixException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first matrix in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching matrix, or <code>null</code> if a matching matrix could not be found
	 */
	public static Matrix fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Matrix> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last matrix in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching matrix
	 * @throws NoSuchMatrixException if a matching matrix could not be found
	 */
	public static Matrix findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Matrix> orderByComparator)
		throws com.tamarix.compliance.exception.NoSuchMatrixException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last matrix in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching matrix, or <code>null</code> if a matching matrix could not be found
	 */
	public static Matrix fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Matrix> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the matrixs before and after the current matrix in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param applicationId the primary key of the current matrix
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next matrix
	 * @throws NoSuchMatrixException if a matrix with the primary key could not be found
	 */
	public static Matrix[] findByUuid_C_PrevAndNext(
			long applicationId, String uuid, long companyId,
			OrderByComparator<Matrix> orderByComparator)
		throws com.tamarix.compliance.exception.NoSuchMatrixException {

		return getPersistence().findByUuid_C_PrevAndNext(
			applicationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the matrixs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of matrixs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching matrixs
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the matrix in the entity cache if it is enabled.
	 *
	 * @param matrix the matrix
	 */
	public static void cacheResult(Matrix matrix) {
		getPersistence().cacheResult(matrix);
	}

	/**
	 * Caches the matrixs in the entity cache if it is enabled.
	 *
	 * @param matrixs the matrixs
	 */
	public static void cacheResult(List<Matrix> matrixs) {
		getPersistence().cacheResult(matrixs);
	}

	/**
	 * Creates a new matrix with the primary key. Does not add the matrix to the database.
	 *
	 * @param applicationId the primary key for the new matrix
	 * @return the new matrix
	 */
	public static Matrix create(long applicationId) {
		return getPersistence().create(applicationId);
	}

	/**
	 * Removes the matrix with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param applicationId the primary key of the matrix
	 * @return the matrix that was removed
	 * @throws NoSuchMatrixException if a matrix with the primary key could not be found
	 */
	public static Matrix remove(long applicationId)
		throws com.tamarix.compliance.exception.NoSuchMatrixException {

		return getPersistence().remove(applicationId);
	}

	public static Matrix updateImpl(Matrix matrix) {
		return getPersistence().updateImpl(matrix);
	}

	/**
	 * Returns the matrix with the primary key or throws a <code>NoSuchMatrixException</code> if it could not be found.
	 *
	 * @param applicationId the primary key of the matrix
	 * @return the matrix
	 * @throws NoSuchMatrixException if a matrix with the primary key could not be found
	 */
	public static Matrix findByPrimaryKey(long applicationId)
		throws com.tamarix.compliance.exception.NoSuchMatrixException {

		return getPersistence().findByPrimaryKey(applicationId);
	}

	/**
	 * Returns the matrix with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param applicationId the primary key of the matrix
	 * @return the matrix, or <code>null</code> if a matrix with the primary key could not be found
	 */
	public static Matrix fetchByPrimaryKey(long applicationId) {
		return getPersistence().fetchByPrimaryKey(applicationId);
	}

	/**
	 * Returns all the matrixs.
	 *
	 * @return the matrixs
	 */
	public static List<Matrix> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the matrixs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MatrixModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of matrixs
	 * @param end the upper bound of the range of matrixs (not inclusive)
	 * @return the range of matrixs
	 */
	public static List<Matrix> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the matrixs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MatrixModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of matrixs
	 * @param end the upper bound of the range of matrixs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matrixs
	 */
	public static List<Matrix> findAll(
		int start, int end, OrderByComparator<Matrix> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the matrixs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MatrixModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of matrixs
	 * @param end the upper bound of the range of matrixs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matrixs
	 */
	public static List<Matrix> findAll(
		int start, int end, OrderByComparator<Matrix> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the matrixs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of matrixs.
	 *
	 * @return the number of matrixs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static MatrixPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<MatrixPersistence, MatrixPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(MatrixPersistence.class);

		ServiceTracker<MatrixPersistence, MatrixPersistence> serviceTracker =
			new ServiceTracker<MatrixPersistence, MatrixPersistence>(
				bundle.getBundleContext(), MatrixPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}