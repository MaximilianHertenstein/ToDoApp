package org.example;

import gg.jte.CodeResolver;
import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.output.StringOutput;
import gg.jte.resolve.DirectoryCodeResolver;
import io.javalin.Javalin;
import org.junit.jupiter.api.Test;

import java.io.StringWriter;
import java.nio.file.Path;
import java.util.List;

import static java.io.IO.println;
import static org.junit.jupiter.api.Assertions.*;

class SingleItemTemplateTest {

    @Test
    void testSingleItemTemplateRendersCorrectly() {
        CodeResolver codeResolver = new DirectoryCodeResolver(Path.of("src/main/jte")); // This is the directory where your .jte files are located.
        var templateEngine = TemplateEngine.create(codeResolver, ContentType.Html);
        ToDo todo = new ToDo(1, "Testaufgabe", false);

        StringOutput output = new StringOutput();
        templateEngine.render("web/singleItem.jte", todo, output);

        String html = output.toString();
        println(output);
        assertTrue(html.contains("Testaufgabe"));
        assertTrue(html.contains("todo1"));
    }



}