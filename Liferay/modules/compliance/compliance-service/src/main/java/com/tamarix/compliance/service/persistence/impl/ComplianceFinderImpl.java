package com.tamarix.compliance.service.persistence.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Order;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.tamarix.compliance.model.Compliance;
import com.tamarix.compliance.service.ComplianceLocalService;

public class ComplianceFinderImpl extends ComplianceFinderBaseImpl implements ComplianceFinder {
	// This finder method for the Compliance app retrieves a list of entries that
	// have a specific name and
	// belong to a branch with a specific name
	public List<Compliance> findByfirstNamebranchName(String firstName, String branchName) {
		Session session = null;
		try {
			session = openSession();
			ClassLoader classLoader = getClass().getClassLoader();
			//the dynamic query object
		    DynamicQuery complianceQuery = DynamicQueryFactoryUtil.forClass(Compliance.class, classLoader)
		    		//Restriction acts more like a "where" SQL-clause
		    		.add(RestrictionsFactoryUtil.eq("name", firstName))
		    		//Projections in Hibernate�s Criteria API let you modify the kind of results returned by a query.
		            .setProjection(ProjectionFactoryUtil.property("complianceId"));
		    Order order = OrderFactoryUtil.desc("modifiedDate");
		    DynamicQuery entryQuery = DynamicQueryFactoryUtil.forClass(Compliance.class, classLoader)
    .add(RestrictionsFactoryUtil.eq("branchname", branchName))
    .add(PropertyFactoryUtil.forName("complianceId").in(complianceQuery))
    //order is similar to order by
    .addOrder(order);

List<Compliance> entries = ComplianceLocalService.dynamicQuery(complianceQuery);

return entries;

		} catch (Exception e) {
			try {
				throw new SystemException(e);
			} catch (SystemException se) {
				se.printStackTrace();
			}
		} finally {
			closeSession(session);
		}
		//will return a null if there was an error
		return null;
	}
}