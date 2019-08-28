package com.chenfeng.scriptenginemanager;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author 陈枫 on 2019-05-12.
 */
public class Demo01 {
    public static void main(String[] args) throws ScriptException {
        // 获得脚本引擎对象
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine engine = scriptEngineManager.getEngineByMimeType("javascript");

        //定义变量，存储到引擎的上下文中
        engine.put("msg", "chenfeng is a good man!");
        String string = "var user = {name:'chenfeng',age:18,schools:['清华大学','浙江大学']};";
        string += "println(user.name);";

        // 执行脚本
        engine.eval(string);

    }
}
