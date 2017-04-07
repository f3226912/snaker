package org.snaker.engine.bo;

import java.io.Serializable;

public class HistoryOrderBo implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 6793767609876330997L;
	/**
	 * 主键ID
	 */
	private String id;
	/**
	 * 流程定义ID
	 */
	private String processId;
	/**
	 * 流程实例状态（0：结束；1：活动）
	 */
	private Integer orderState;
	/**
	 * 流程实例创建者ID
	 */
	private String creator;
	/**
	 * 流程实例创建时间
	 */
	private String createTime;
	/**
	 * 流程实例结束时间
	 */
	private String endTime;
	/**
	 * 流程实例为子流程时，该字段标识父流程实例ID
	 */
	private String parentId;
	/**
	 * 流程实例期望完成时间
	 */
	private String expireTime;
	/**
	 * 流程实例优先级
	 */
	private Integer priority;
	/**
	 * 流程实例编号
	 */
	private String orderNo;
	/**
	 * 流程实例附属变量
	 */
	private String variable;

	private String displayName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public Integer getOrderState() {
		return orderState;
	}

	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

}
