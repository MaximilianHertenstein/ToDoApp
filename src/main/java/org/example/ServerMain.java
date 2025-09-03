package org.example;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.output.StringOutput;
import gg.jte.resolve.DirectoryCodeResolver;
import io.javalin.Javalin;
import io.javalin.config.JavalinConfig;
import io.javalin.plugin.bundled.CorsPluginConfig;
import org.example.*;

import java.util.List;

import static java.io.IO.println;


class ServerMain {



    public static void main(String[] args) {



        var serverView = new ServerView();
        var uiState = new UIState("Completed", List.of(), "0 items left");
        println(serverView.renderToString("mainPage", uiState, false));

    }



    void runApp() {
        var app =  Javalin.create(Utils::configureJavalin);
        var serverController = new ServerController();
        app.get("/todos", serverController::renderApp);
        app.post("/todos/new", serverController::addToDo);
        app.post("/todos/{id}/toggleStatus", serverController::toggleStatus);
        app.post("/todos/setFilter/{filter}", serverController::setFilter);
        app.get("/todos/{id}/edit", serverController::editToDo);
        app.post("/todos/{id}/edit", serverController::updateTextOfToDo);
        app.post("/todos/{id}/delete", serverController::deleteToDo);
        app.post("/todos/clearCompleted", serverController::deleteCompletedToDos);
        app.start();
    }
}

//private static void runWebApp(){
//    var serverController = new ServerController();
//    var webApp = Javalin.create(Utils::configureJavalin);
//    hostCommonRoutes(webApp, serverController);
//    webApp.delete("/todos/completed", serverController::deleteCompletedToDos);
//    webApp.delete("/todos/{id}", serverController::deleteToDo);
//    webApp.start();
//}
//
//private static void runMobileApp(){
//    var mobileApp = Javalin.create(Utils::configureJavalin);
//    var serverController = new ServerController();
//    hostCommonRoutes(mobileApp, serverController);
//    mobileApp.post("/todos/{id}/delete", serverController::deleteToDo);
//    mobileApp.post("/todos/clearCompleted", serverController::deleteCompletedToDos);
//    mobileApp.start();
//}
