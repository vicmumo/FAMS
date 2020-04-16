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

import com.tamarix.compliance.exception.NoSuchMatrixException;
import com.tamarix.compliance.model.Matrix;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the matrix service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MatrixUtil
 * @generated
 */
@ProviderType
public interface MatrixPersistence extends BasePersistence<Matrix> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MatrixUtil} to access the matrix persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, Matrix> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the matrixs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching matrixs
	 */
	public java.util.List<Matrix> findByUuid(String uuid);

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
	public java.util.List<Matrix> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Matrix> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Matrix>
			orderByComparator);

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
	public java.util.List<Matrix> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Matrix>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first matrix in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching matrix
	 * @throws NoSuchMatrixException if a matching matrix could not be found
	 */
	public Matrix findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Matrix>
				orderByComparator)
		throws NoSuchMatrixException;

	/**
	 * Returns the first matrix in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching matrix, or <code>null</code> if a matching matrix could not be found
	 */
	public Matrix fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Matrix>
			orderByComparator);

	/**
	 * Returns the last matrix in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching matrix
	 * @throws NoSuchMatrixException if a matching matrix could not be found
	 */
	public Matrix findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Matrix>
				orderByComparator)
		throws NoSuchMatrixException;

	/**
	 * Returns the last matrix in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching matrix, or <code>null</code> if a matching matrix could not be found
	 */
	public Matrix fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Matrix>
			orderByComparator);

	/**
	 * Returns the matrixs before and after the current matrix in the ordered set where uuid = &#63;.
	 *
	 * @param applicationId the primary key of the current matrix
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next matrix
	 * @throws NoSuchMatrixException if a matrix with the primary key could not be found
	 */
	public Matrix[] findByUuid_PrevAndNext(
			long applicationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Matrix>
				orderByComparator)
		throws NoSuchMatrixException;

	/**
	 * Removes all the matrixs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of matrixs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching matrixs
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the matrix where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMatrixException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching matrix
	 * @throws NoSuchMatrixException if a matching matrix could not be found
	 */
	public Matrix findByUUID_G(String uuid, long groupId)
		throws NoSuchMatrixException;

	/**
	 * Returns the matrix where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching matrix, or <code>null</code> if a matching matrix could not be found
	 */
	public Matrix fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the matrix where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching matrix, or <code>null</code> if a matching matrix could not be found
	 */
	public Matrix fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the matrix where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matrix that was removed
	 */
	public Matrix removeByUUID_G(String uuid, long groupId)
		throws NoSuchMatrixException;

	/**
	 * Returns the number of matrixs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching matrixs
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the matrixs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching matrixs
	 */
	public java.util.List<Matrix> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Matrix> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Matrix> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Matrix>
			orderByComparator);

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
	public java.util.List<Matrix> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Matrix>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first matrix in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching matrix
	 * @throws NoSuchMatrixException if a matching matrix could not be found
	 */
	public Matrix findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Matrix>
				orderByComparator)
		throws NoSuchMatrixException;

	/**
	 * Returns the first matrix in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching matrix, or <code>null</code> if a matching matrix could not be found
	 */
	public Matrix fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Matrix>
			orderByComparator);

	/**
	 * Returns the last matrix in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching matrix
	 * @throws NoSuchMatrixException if a matching matrix could not be found
	 */
	public Matrix findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Matrix>
				orderByComparator)
		throws NoSuchMatrixException;

	/**
	 * Returns the last matrix in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching matrix, or <code>null</code> if a matching matrix could not be found
	 */
	public Matrix fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Matrix>
			orderByComparator);

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
	public Matrix[] findByUuid_C_PrevAndNext(
			long applicationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Matrix>
				orderByComparator)
		throws NoSuchMatrixException;

	/**
	 * Removes all the matrixs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of matrixs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching matrixs
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the matrix in the entity cache if it is enabled.
	 *
	 * @param matrix the matrix
	 */
	public void cacheResult(Matrix matrix);

	/**
	 * Caches the matrixs in the entity cache if it is enabled.
	 *
	 * @param matrixs the matrixs
	 */
	public void cacheResult(java.util.List<Matrix> matrixs);

	/**
	 * Creates a new matrix with the primary key. Does not add the matrix to the database.
	 *
	 * @param applicationId the primary key for the new matrix
	 * @return the new matrix
	 */
	public Matrix create(long applicationId);

	/**
	 * Removes the matrix with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param applicationId the primary key of the matrix
	 * @return the matrix that was removed
	 * @throws NoSuchMatrixException if a matrix with the primary key could not be found
	 */
	public Matrix remove(long applicationId) throws NoSuchMatrixException;

	public Matrix updateImpl(Matrix matrix);

	/**
	 * Returns the matrix with the primary key or throws a <code>NoSuchMatrixException</code> if it could not be found.
	 *
	 * @param applicationId the primary key of the matrix
	 * @return the matrix
	 * @throws NoSuchMatrixException if a matrix with the primary key could not be found
	 */
	public Matrix findByPrimaryKey(long applicationId)
		throws NoSuchMatrixException;

	/**
	 * Returns the matrix with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param applicationId the primary key of the matrix
	 * @return the matrix, or <code>null</code> if a matrix with the primary key could not be found
	 */
	public Matrix fetchByPrimaryKey(long applicationId);

	/**
	 * Returns all the matrixs.
	 *
	 * @return the matrixs
	 */
	public java.util.List<Matrix> findAll();

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
	public java.util.List<Matrix> findAll(int start, int end);

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
	public java.util.List<Matrix> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Matrix>
			orderByComparator);

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
	public java.util.List<Matrix> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Matrix>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the matrixs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of matrixs.
	 *
	 * @return the number of matrixs
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}