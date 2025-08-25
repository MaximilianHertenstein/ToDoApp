package org.example;

import io.javalin.config.JavalinConfig;
import io.javalin.rendering.template.JavalinJte;

public class Utils {
    public static void configureJavalinApp(JavalinConfig javalinConfig){
        javalinConfig.fileRenderer(new JavalinJte());
        javalinConfig.staticFiles.enableWebjars();
    }

    public static  String statusToCompleted(boolean status){
        if(status){
            return "completed";
        }
        return "";
    }

    public static  String computeLinkClass(String filter, String linkToFilter){
        if(filter.equals(linkToFilter)){
            return "selected";
        }
        return "";
    }

    public static int toIntNullToMinusOne(String value){
        if(value == null){
            return -1;
        }
        else {
            return Integer.parseInt(value);
        }
    }

    public static String nullToAll(String value){
        if(value == null){
            return "all";
        }
        else {
            return value;
        }}

}
