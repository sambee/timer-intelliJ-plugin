package com.sam.idea.plugin.timer;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;

/**
 * Description:
 *
 * @see TimerToolWindowFactory
 *      Author: 黄海峰/samwong
 *      Date/Time: 13-9-15 下午2:57
 */
@SuppressWarnings("unchecked")
public class TimerToolWindowFactory implements ToolWindowFactory {
    @Override
    public void createToolWindowContent(Project project, ToolWindow toolWindow) {
//        Commander commander = Commander.getInstance(project);
        System.out.println("-----------TimerToolWindowFactory ------------------");

    }
}
