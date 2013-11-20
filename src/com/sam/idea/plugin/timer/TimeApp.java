package com.sam.idea.plugin.timer;

import com.intellij.openapi.components.ApplicationComponent;
import org.jetbrains.annotations.NotNull;

import java.io.File;

/**
 * Description:
 *
 * @see TimeApp
 *      Author: 黄海峰/samwong
 *      Date/Time: 13-9-15 下午4:01
 */
@SuppressWarnings("unchecked")
public class TimeApp implements ApplicationComponent {
    public TimeApp() {
        System.out.println("---------------------- >>>> TimeApp Constructor");
    }

    public void initComponent() {
//        String path=this.getClass().getResource("").getPath();
//        System.out.println("------------ TimeManagement init component " + path);
    }

    public void disposeComponent() {
        System.out.println("TimeManagement disposeComponent");
    }

    @NotNull
    public String getComponentName() {
        return "TimeApp";
    }
}
