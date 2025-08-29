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
    private static void configureJavalinBasic(JavalinConfig javalinConfig) {

        javalinConfig.bundledPlugins.enableCors(cors -> {
            //it.allowHost("http://localhost:19006");
            cors.addRule(CorsPluginConfig.CorsRule::anyHost);
        });
        javalinConfig.staticFiles.enableWebjars();



        //javalinConfig.fileRenderer(new JavalinJte());


    }
    public static void configureJavalinForWeb(JavalinConfig javalinConfig){
        configureJavalinBasic(javalinConfig);
        javalinConfig.fileRenderer(new JavalinJte());
    }



    public static void configureJavalinForMobile(JavalinConfig javalinConfig){
        configureJavalinBasic(javalinConfig);
        javalinConfig.staticFiles.add("/public");
        CodeResolver codeResolver = new DirectoryCodeResolver(Path.of("src/main/jte")); // This is the directory where your .jte files are located.
        var templateEngine = TemplateEngine.create(codeResolver, ContentType.Plain);
        javalinConfig.fileRenderer(new JavalinJte(templateEngine));
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

    public static String statusToCompletedOrActive(boolean status) {
        if (status) {
            return "completed";
        }
        return "active";
    }

    public static String statusToCheckMark(boolean status) {
        if (status) {
            return "✓";
        }
        return "";
    }



}
