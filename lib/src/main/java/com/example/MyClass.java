package com.example;


import android.test.suitebuilder.annotation.SmallTest;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import org.junit.runner.RunWith;


public class MyClass extends UiAutomatorTestCase {
    public void testDemo() throws UiObjectNotFoundException {
        getUiDevice().pressHome();
        // 进入设置菜单
        UiObject settingApp = new UiObject(new UiSelector().text("Settings"));
        settingApp.click();
        //休眠3秒
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        // 进入语言和输入法设置
        UiScrollable settingItems = new UiScrollable( new UiSelector().scrollable(true));

        UiObject languageAndInputItem = settingItems.getChildByText(
                new UiSelector().text("Language & input"), "Language & input", true);
        languageAndInputItem.clickAndWaitForNewWindow();

    }

}