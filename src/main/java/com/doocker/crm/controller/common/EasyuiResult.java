package com.doocker.crm.controller.common;
/**
 * easyui 分页返回数据 bean
 * @author Administrator
 *
 */
public class EasyuiResult {
	
	//总条数
	private Long total;
	
	//当前查询出的记录条数
	private Object rows;
	
	//true 表示业务成功 （没有错误，）false业务失败（服务器内部错误，）
	private Boolean flag;

	//提示信息
	private String msg;

	
	public EasyuiResult (Long total,Object rows,Boolean flag,String msg){
		this.total=total;
		this.msg=msg;
		this.flag=flag;
		this.rows=rows;
	}
	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Object getRows() {
		return rows;
	}

	public void setRows(Object rows) {
		this.rows = rows;
	}

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "EasyuiResult [total=" + total + ", rows=" + rows + ", flag=" + flag + ", msg=" + msg + "]";
	}
	
	
}
