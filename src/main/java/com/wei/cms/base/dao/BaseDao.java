/**
 * 
 */
package com.wei.cms.base.dao;

import java.util.List;
import java.util.Map;

import com.wei.cms.models.Pager;

/**
 * Basic hibernate/SQL functions - CRUD
 * @author Wei
 *
 */
public interface BaseDao<T> {
	/**
	 * Add function
	 * @param t
	 * @return
	 */
	public T add(T t);
	/**
	 * Update function
	 * @param t
	 */
	public void update(T t);
	/**
	 * Delete by id
	 * @param id
	 */
	public void delete(int id);
	/**
	 * Load by id
	 * @param id
	 * @return
	 */
	public T load(int id); 
	/**
	 * No pagination search list
	 * @param hql Query search for objects
	 * @param args Query parameters
	 * @return none-pagination objects
	 */
	public List<T> list(String hql, Object[] args);
	public List<T> list(String hql, Object arg);
	public List<T> list(String hql);
	/**
	 * List by alias & parameters
	 * @param hql
	 * @param args
	 * @param alias
	 * @return
	 */
	public List<T> list(String hql, Object[] args, Map<String, Object> alias);
	public List<T> listByAlias(String hql,Map<String, Object> alias);
	
	/**
	 * Pagination search list
	 * @param hql Query search for objects
	 * @param args Query parameters
	 * @return none-pagination objects
	 */
	public Pager<T> find(String hql, Object[] args);
	public Pager<T> find(String hql, Object arg);
	public Pager<T> find(String hql);
	/**
	 * List by alias & parameters
	 * @param hql
	 * @param args
	 * @param alias
	 * @return
	 */
	public Pager<T> find(String hql, Object[] args, Map<String, Object> alias);
	public Pager<T> findByAlias(String hql,Map<String, Object> alias);
	/**
	 * Search for objects by hql
	 * @param hql
	 * @param args
	 * @return
	 */
	public Object queryObject(String hql, Object[] args);
	public Object queryObject(String hql, Object arg);
	public Object queryObject(String hql);
	public Object queryObject(String hql, Object[] args, Map<String, Object> alias);
	public Object queryObjectByAlias(String hql, Map<String, Object> alias);
	/**
	 * Update objects by hql
	 * @param hql
	 * @param args
	 * @return
	 */	
	public void updateByHql(String hql, Object[] args);
	public void updateByHql(String hql, Object arg);
	public void updateByHql(String hql);
	/**
	 * Search by sql
	 * @param sql query
	 * @param args condition
	 * @param clz entity
	 * @param hasEntity Check if the object is a hibernate entity, if not, use setResultTransform to search
	 * @return objects
	 */
	public List<Object> listBySql(String sql, Object[] args, Class<Object> clz, boolean hasEntity);
	public List<Object> listBySql(String sql, Object arg, Class<Object> clz, boolean hasEntity);
	public List<Object> listBySql(String sql, Class<Object> clz, boolean hasEntity);
	public List<Object> listBySql(String sql, Object[] args, Map<String, Object> alias, Class<Object> clz, boolean hasEntity);
	public List<Object> listByAliasSql(String sql, Map<String, Object> alias, Class<Object> clz, boolean hasEntity);
	
	/**
	 * Search by sql with pagination
	 * @param sql query
	 * @param args condition
	 * @param clz entity
	 * @param hasEntity Check if the object is a hibernate entity, if not, use setResultTransform to search
	 * @return objects
	 */
	public Pager<Object> findBySql(String sql, Object[] args, Class<Object> clz, boolean hasEntity);
	public Pager<Object> findBySql(String sql, Object arg, Class<Object> clz, boolean hasEntity);
	public Pager<Object> findBySql(String sql, Class<Object> clz, boolean hasEntity);
	public Pager<Object> findBySql(String sql, Object[] args, Map<String, Object> alias, Class<Object> clz, boolean hasEntity);
	public Pager<Object> findByAliasSql(String sql, Map<String, Object> alias, Class<Object> clz, boolean hasEntity);
}
