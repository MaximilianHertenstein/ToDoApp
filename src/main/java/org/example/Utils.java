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
    public static void configureJavalinApp(JavalinConfig javalinConfig) {
        javalinConfig.staticFiles.add("/public");
        javalinConfig.bundledPlugins.enableCors(cors -> {
            //it.allowHost("http://localhost:19006");
            cors.addRule(CorsPluginConfig.CorsRule::anyHost);
        });
        CodeResolver codeResolver = new DirectoryCodeResolver(Path.of("src/main/jte")); // This is the directory where your .jte files are located.
        var templateEngine = TemplateEngine.create(codeResolver, ContentType.Plain);
        javalinConfig.fileRenderer(new JavalinJte(templateEngine));
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

    public static String done(String newFilter, String oldFilter) {
        if (newFilter == null) {
            return oldFilter;
        } else {
            return newFilter;
        }
    }

}
