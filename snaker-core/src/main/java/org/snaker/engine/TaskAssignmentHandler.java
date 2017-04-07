package org.snaker.engine;

import org.snaker.engine.core.Execution;
import org.snaker.engine.model.TaskModel;

/**
 * 任务分配参与者的处理接口。
 * by gd extend 2016.09.29
 * @author wjguo
 * datetime:2016年9月29日 下午1:50:36
 */

public interface TaskAssignmentHandler extends AssignmentHandler{
    /**
     * 分配参与者方法，可获取到当前的任务模型、执行对象
     * @param model 任务模型
     * @param execution 执行对象
     * @return Object 参与者对象
     */
    public Object assign(TaskModel model, Execution execution);
}
