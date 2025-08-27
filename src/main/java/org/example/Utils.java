package org.example;

import io.javalin.config.JavalinConfig;
import io.javalin.plugin.bundled.CorsPluginConfig;
import io.javalin.rendering.template.JavalinJte;

public class Utils {
    public static void configureJavalinApp(JavalinConfig javalinConfig) {
        javalinConfig.staticFiles.add("/public");
        javalinConfig.bundledPlugins.enableCors(cors -> {
            //it.allowHost("http://localhost:19006");
            cors.addRule(CorsPluginConfig.CorsRule::anyHost);
        });

        javalinConfig.fileRenderer(new JavalinJte());
        javalinConfig.staticFiles.enableWebjars();

    }

    public static String statusToCompleted(boolean status) {
        if (status) {
            return "completed";
        }
        return "";
    }

    public static String computeLinkClass(String filter, String linkToFilter) {
        if (filter.equals(linkToFilter)) {
            return "selected";
        }
        return "";
    }

    public static String nullToOldElseOld(String newFilter, String oldFilter) {
        if (newFilter == null) {
            return oldFilter;
        } else {
            return newFilter;
        }
    }

}
