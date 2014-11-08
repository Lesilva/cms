/**
 * 
 */
package com.wei.cms.models;

import java.util.List;

/**
 * Pagination
 * @author Wei
 *
 * @param <T>
 */
public class Pager<T> {
	/**
	 * Page size
	 */
	private int size;
	/**
	 * Starting page
	 */
	private int offset;
	/**
	 * Total records
	 */
	private long total;
	/**
	 * Paged data
	 */
	private List<T> data;
	
	
	
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/**
	 * @return the offset
	 */
	public int getOffset() {
		return offset;
	}
	/**
	 * @param offset the offset to set
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}
	/**
	 * @return the total
	 */
	public long getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(long total) {
		this.total = total;
	}
	/**
	 * @return the data
	 */
	public List<T> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(List<T> data) {
		this.data = data;
	}
	
	
}
