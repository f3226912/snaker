/* Copyright 2013-2015 www.snakerflow.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.snaker.engine.entity;

import java.io.Serializable;

import org.snaker.engine.model.ProcessModel;

/**
 * 流程定义实体类
 * @author yuqs
 * @since 1.0
 */
public class Process implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6541688543201014542L;
	/**
	 * 主键ID
	 */
	private String id;
	/**
	 * 版本
	 */
	private Integer version;
    /**
     * 流程定义名称
     */
	private String name;
    /**
     * 流程定义显示名称
     */
	private String displayName;
    /**
     * 流程定义类型（预留字段）
     */
	private String type;
	/**
	 * 当前流程的实例url（一般为流程第一步的url）
	 * 该字段可以直接打开流程申请的表单
	 */
	private String instanceUrl;
    /**
     * 是否可用的开关
     */
	private Integer state;
	/**
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 创建人
	 */
	private String creator;
	/**
	 * 流程定义模型
	 */
    private ProcessModel model;
    /**
     * 流程定义xml
     */
    private String content;
    
    /**
     * 工作流业务类型
     */
    private String busType;
    
    /**组织id（即此工作流程所属的组织）
     * 
     */
    private String orgId;
    
    /**
     * 流程监控人id
     */
    private String monitorId;
    
    /**
     * 流程描述
     */
    private String processDesc;
    
    /**更改者ID
     * 
     */
    private String modificator;
    
    /**更改时间
     * 
     */
    private String modifiedTime;
    
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public ProcessModel getModel() {
		return model;
	}
	
	/**
	 * setter name/displayName/instanceUrl
	 * @param processModel
	 */
	public void setModel(ProcessModel processModel) {
		this.model = processModel;
    	this.name = processModel.getName();
    	this.displayName = processModel.getDisplayName();
    	this.instanceUrl = processModel.getInstanceUrl();
	}
	public String getInstanceUrl() {
		return instanceUrl;
	}
	public void setInstanceUrl(String instanceUrl) {
		this.instanceUrl = instanceUrl;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

    public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Process(id=").append(this.id);
		sb.append(",name=").append(this.name);
		sb.append(",displayName=").append(this.displayName);
		sb.append(",version=").append(this.version);
		sb.append(",state=").append(this.state).append(")");
		return sb.toString();
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getMonitorId() {
		return monitorId;
	}
	public void setMonitorId(String monitorId) {
		this.monitorId = monitorId;
	}
	public String getProcessDesc() {
		return processDesc;
	}
	public void setProcessDesc(String processDesc) {
		this.processDesc = processDesc;
	}
	public String getModificator() {
		return modificator;
	}
	public void setModificator(String modificator) {
		this.modificator = modificator;
	}
	public String getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
}
