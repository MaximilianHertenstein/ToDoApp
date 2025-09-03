package org.example;


import io.javalin.config.JavalinConfig;
import io.javalin.plugin.bundled.CorsPluginConfig;



public class Utils {
    public static void configureJavalin(JavalinConfig javalinConfig) {

        javalinConfig.bundledPlugins.enableCors(cors -> {
            //it.allowHost("http://localhost:19006");
            cors.addRule(CorsPluginConfig.CorsRule::anyHost);
        });
        javalinConfig.staticFiles.enableWebjars();



        //javalinConfig.fileRenderer(new JavalinJte());


    }



    public static String statusToCompleted(boolean status) {
        if (status) {
            return "completed";
        }
        return "";
    }

    public static String computeFilterClass(String filter, String linkToFilter) {
        if (filter.equals(linkToFilter)) {
            return "selected";
        }
        return "";
    }


}
