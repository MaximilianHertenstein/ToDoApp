package org.example;

import gg.jte.CodeResolver;
import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.DirectoryCodeResolver;
import io.javalin.Javalin;
import io.javalin.config.JavalinConfig;
import io.javalin.plugin.bundled.CorsPluginConfig;
import io.javalin.rendering.template.JavalinJte;

import java.nio.file.Path;

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


    public static String computeToggleClass(boolean completed){
        if (completed) {
            return "toggle-completed";
        }
        return "toggle";
    }


    public static String statusToSymbol(boolean status) {
        if (status) {
            return "✓";
        }
        return "◯";
    }



}
