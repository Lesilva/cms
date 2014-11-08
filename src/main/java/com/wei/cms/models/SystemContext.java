/**
 * 
 */
package com.wei.cms.models;

/**
 * ThreadLocal for passing List(pager) value
 * @author Wei
 *
 */
public class SystemContext {
	/**
	 * Page Size
	 */
	private static ThreadLocal<Integer> pageSize = new ThreadLocal<Integer>();
	/**
	 * Starting page
	 */
	private static ThreadLocal<Integer> pageOffset = new ThreadLocal<Integer>();;
	/**
	 * Sorting method
	 */
	private static ThreadLocal<String> sort = new ThreadLocal<String>();;
	/**
	 * Descending/ascending order
	 */
	private static ThreadLocal<String> order = new ThreadLocal<String>();;
	
	
	/**
	 * @return the pageSize
	 */
	public static Integer getPageSize() {
		return pageSize.get();
	}
	/**
	 * @param pageSize the pageSize to set
	 */
	public static void setPageSize(Integer _pageSize) {
		pageSize.set(_pageSize);
	}
	/**
	 * @return the pageOffset
	 */
	public static Integer getPageOffset() {
		return pageOffset.get();
	}
	/**
	 * @param pageOffset the pageOffset to set
	 */
	public static void setPageOffset(Integer _pageOffset) {
		pageOffset.set(_pageOffset);
	}
	/**
	 * @return the sort
	 */
	public static String getSort() {
		return sort.get();
	}
	/**
	 * @param sort the sort to set
	 */
	public static void setSort(String _sort) {
		sort.set(_sort);
	}
	/**
	 * @return the order
	 */
	public static String getOrder() {
		return order.get();
	}
	/**
	 * @param order the order to set
	 */
	public static void setOrder(String _order) {
		order.set(_order);
	}
	
	public static void removePageSize() {
		pageSize.remove();
	}
	
	public static void removePageOffset() {
		pageOffset.remove();
	}
	
	public static void removeSort() {
		sort.remove();
	}
	
	public static void removeOrder() {
		order.remove();
	}
}
