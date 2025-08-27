package org.example;

import io.javalin.config.JavalinConfig;
import io.javalin.http.staticfiles.Location;
import io.javalin.rendering.template.JavalinJte;

public class Utils {
    public static void configureJavalinApp(JavalinConfig javalinConfig) {

        var x = new JavalinJte();

        javalinConfig.fileRenderer(new JavalinJte());

        javalinConfig.staticFiles.enableWebjars();
        // Serve static files from classpath /public (for Hyperview styles.xml)
        javalinConfig.staticFiles.add("/public", Location.CLASSPATH);
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
