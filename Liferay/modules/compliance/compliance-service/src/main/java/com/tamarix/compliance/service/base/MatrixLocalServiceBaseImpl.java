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

package com.tamarix.compliance.service.base;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.tamarix.compliance.model.Matrix;
import com.tamarix.compliance.service.MatrixLocalService;
import com.tamarix.compliance.service.persistence.ComplianceFinder;
import com.tamarix.compliance.service.persistence.CompliancePersistence;
import com.tamarix.compliance.service.persistence.MatrixPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the matrix local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.tamarix.compliance.service.impl.MatrixLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.tamarix.compliance.service.impl.MatrixLocalServiceImpl
 * @generated
 */
public abstract class MatrixLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements IdentifiableOSGiService, MatrixLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>MatrixLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.tamarix.compliance.service.MatrixLocalServiceUtil</code>.
	 */

	/**
	 * Adds the matrix to the database. Also notifies the appropriate model listeners.
	 *
	 * @param matrix the matrix
	 * @return the matrix that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Matrix addMatrix(Matrix matrix) {
		matrix.setNew(true);

		return matrixPersistence.update(matrix);
	}

	/**
	 * Creates a new matrix with the primary key. Does not add the matrix to the database.
	 *
	 * @param applicationId the primary key for the new matrix
	 * @return the new matrix
	 */
	@Override
	@Transactional(enabled = false)
	public Matrix createMatrix(long applicationId) {
		return matrixPersistence.create(applicationId);
	}

	/**
	 * Deletes the matrix with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param applicationId the primary key of the matrix
	 * @return the matrix that was removed
	 * @throws PortalException if a matrix with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Matrix deleteMatrix(long applicationId) throws PortalException {
		return matrixPersistence.remove(applicationId);
	}

	/**
	 * Deletes the matrix from the database. Also notifies the appropriate model listeners.
	 *
	 * @param matrix the matrix
	 * @return the matrix that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Matrix deleteMatrix(Matrix matrix) {
		return matrixPersistence.remove(matrix);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			Matrix.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return matrixPersistence.findWithDynamicQuery(dynamicQuery);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return matrixPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return matrixPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return matrixPersistence.countWithDynamicQuery(dynamicQuery);
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
		DynamicQuery dynamicQuery, Projection projection) {

		return matrixPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public Matrix fetchMatrix(long applicationId) {
		return matrixPersistence.fetchByPrimaryKey(applicationId);
	}

	/**
	 * Returns the matrix matching the UUID and group.
	 *
	 * @param uuid the matrix's UUID
	 * @param groupId the primary key of the group
	 * @return the matching matrix, or <code>null</code> if a matching matrix could not be found
	 */
	@Override
	public Matrix fetchMatrixByUuidAndGroupId(String uuid, long groupId) {
		return matrixPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the matrix with the primary key.
	 *
	 * @param applicationId the primary key of the matrix
	 * @return the matrix
	 * @throws PortalException if a matrix with the primary key could not be found
	 */
	@Override
	public Matrix getMatrix(long applicationId) throws PortalException {
		return matrixPersistence.findByPrimaryKey(applicationId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(matrixLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Matrix.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("applicationId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(matrixLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Matrix.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"applicationId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(matrixLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Matrix.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("applicationId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Matrix>() {

				@Override
				public void performAction(Matrix matrix)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, matrix);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(Matrix.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return matrixLocalService.deleteMatrix((Matrix)persistedModel);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return matrixPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the matrixs matching the UUID and company.
	 *
	 * @param uuid the UUID of the matrixs
	 * @param companyId the primary key of the company
	 * @return the matching matrixs, or an empty list if no matches were found
	 */
	@Override
	public List<Matrix> getMatrixsByUuidAndCompanyId(
		String uuid, long companyId) {

		return matrixPersistence.findByUuid_C(uuid, companyId);
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
	public List<Matrix> getMatrixsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Matrix> orderByComparator) {

		return matrixPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
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
	public Matrix getMatrixByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return matrixPersistence.findByUUID_G(uuid, groupId);
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
	public List<Matrix> getMatrixs(int start, int end) {
		return matrixPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of matrixs.
	 *
	 * @return the number of matrixs
	 */
	@Override
	public int getMatrixsCount() {
		return matrixPersistence.countAll();
	}

	/**
	 * Updates the matrix in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param matrix the matrix
	 * @return the matrix that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Matrix updateMatrix(Matrix matrix) {
		return matrixPersistence.update(matrix);
	}

	/**
	 * Returns the compliance local service.
	 *
	 * @return the compliance local service
	 */
	public com.tamarix.compliance.service.ComplianceLocalService
		getComplianceLocalService() {

		return complianceLocalService;
	}

	/**
	 * Sets the compliance local service.
	 *
	 * @param complianceLocalService the compliance local service
	 */
	public void setComplianceLocalService(
		com.tamarix.compliance.service.ComplianceLocalService
			complianceLocalService) {

		this.complianceLocalService = complianceLocalService;
	}

	/**
	 * Returns the compliance persistence.
	 *
	 * @return the compliance persistence
	 */
	public CompliancePersistence getCompliancePersistence() {
		return compliancePersistence;
	}

	/**
	 * Sets the compliance persistence.
	 *
	 * @param compliancePersistence the compliance persistence
	 */
	public void setCompliancePersistence(
		CompliancePersistence compliancePersistence) {

		this.compliancePersistence = compliancePersistence;
	}

	/**
	 * Returns the compliance finder.
	 *
	 * @return the compliance finder
	 */
	public ComplianceFinder getComplianceFinder() {
		return complianceFinder;
	}

	/**
	 * Sets the compliance finder.
	 *
	 * @param complianceFinder the compliance finder
	 */
	public void setComplianceFinder(ComplianceFinder complianceFinder) {
		this.complianceFinder = complianceFinder;
	}

	/**
	 * Returns the matrix local service.
	 *
	 * @return the matrix local service
	 */
	public MatrixLocalService getMatrixLocalService() {
		return matrixLocalService;
	}

	/**
	 * Sets the matrix local service.
	 *
	 * @param matrixLocalService the matrix local service
	 */
	public void setMatrixLocalService(MatrixLocalService matrixLocalService) {
		this.matrixLocalService = matrixLocalService;
	}

	/**
	 * Returns the matrix persistence.
	 *
	 * @return the matrix persistence
	 */
	public MatrixPersistence getMatrixPersistence() {
		return matrixPersistence;
	}

	/**
	 * Sets the matrix persistence.
	 *
	 * @param matrixPersistence the matrix persistence
	 */
	public void setMatrixPersistence(MatrixPersistence matrixPersistence) {
		this.matrixPersistence = matrixPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService
		getCounterLocalService() {

		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService
			counterLocalService) {

		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService
		getClassNameLocalService() {

		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService
			classNameLocalService) {

		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {

		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService
		getResourceLocalService() {

		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService
			resourceLocalService) {

		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService
		getUserLocalService() {

		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {

		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register(
			"com.tamarix.compliance.model.Matrix", matrixLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"com.tamarix.compliance.model.Matrix");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return MatrixLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Matrix.class;
	}

	protected String getModelClassName() {
		return Matrix.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = matrixPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	@BeanReference(
		type = com.tamarix.compliance.service.ComplianceLocalService.class
	)
	protected com.tamarix.compliance.service.ComplianceLocalService
		complianceLocalService;

	@BeanReference(type = CompliancePersistence.class)
	protected CompliancePersistence compliancePersistence;

	@BeanReference(type = ComplianceFinder.class)
	protected ComplianceFinder complianceFinder;

	@BeanReference(type = MatrixLocalService.class)
	protected MatrixLocalService matrixLocalService;

	@BeanReference(type = MatrixPersistence.class)
	protected MatrixPersistence matrixPersistence;

	@ServiceReference(
		type = com.liferay.counter.kernel.service.CounterLocalService.class
	)
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ClassNameLocalService.class
	)
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ResourceLocalService.class
	)
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.UserLocalService.class
	)
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;

	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry
		persistedModelLocalServiceRegistry;

}