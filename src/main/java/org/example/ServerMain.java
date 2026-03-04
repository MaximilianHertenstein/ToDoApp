package org.example;

import io.javalin.Javalin;



class ServerMain {



     static void main() {


        runApp();

//        var templateRenderer = new TemplateRenderer();
//        ToDo learnJava = new ToDo(2, "Learn Java", false);
//        println(templateRenderer.renderToDoToString(learnJava, false,false));

    }



    static void runApp() {


        var app =  Javalin.create(JavalinConfigurator::configureJavalin);
        app.start();
    }
}

//private static void runWebApp(){
//    var serverController = new ServerController();
//    var webApp = Javalin.create(Utils::configureJavalin);
//    hostCommonRoutes(webApp, serverController);
//    webApp.delete("/todos/completed", serverController::clearCompletedToDos);
//    webApp.delete("/todos/{id}", serverController::deleteToDo);
//    webApp.start();
//}
//
//private static void runMobileApp(){
//    var mobileApp = Javalin.create(Utils::configureJavalin);
//    var serverController = new ServerController();
//    hostCommonRoutes(mobileApp, serverController);
//    mobileApp.post("/todos/{id}/delete", serverController::deleteToDo);
//    mobileApp.post("/todos/clearCompleted", serverController::clearCompletedToDos);
//    mobileApp.start();
//}
