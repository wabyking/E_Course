package com.yaru.beans;

/**
 *  用来封装分页信息
 */
public class Pagination {
	
	private int currPage = 1; //当前页码
	private int countPage = 0; //总页数
	private int pageSize = 3; //每页显示记录数
	private int countSize = 0; //总记录条数

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public int getCountPage() {
		
		if(countSize != 0){
			if(countSize%pageSize != 0){
				countPage = countSize/pageSize +1;
			}else{
				countPage = countSize/pageSize;
			}
		}
		return countPage;
	}

	public void setCountPage(int countPage) {
		this.countPage = countPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCountSize() {
		return countSize;
	}

	public void setCountSize(int countSize) {
		this.countSize = countSize;
	}
}
