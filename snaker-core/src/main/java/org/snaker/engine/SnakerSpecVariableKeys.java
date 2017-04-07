package org.snaker.engine;

/**snaker特定的变量key
 * 
 * @author wjguo
 *
 * datetime:2016年10月13日 下午8:08:39
 */
public abstract class SnakerSpecVariableKeys {
	//============================order流程实例=================================
	/**order流程实例 “关联的业务表id”的变量key
	 * 
	 */
	public static final String ORDER_BUS_ID_VAR = "snaker-bus_Id";
	
	
	
	
	//============================task流程任务=================================
	/**task流程任务 “任务操作人的基本信息”的变量key
	 * 
	 */
	public static final String TASK_OPERATOR_BASE_INFO_VAR = "snaker-operator_base_info";
	/**task流程任务 “任务操作人的审核意见”的变量key
	 * 
	 */
	public static final String TASK_OPERATOR_AUDIT_OPINION_VAR = "snaker-operator_audit_opinion";
}
