package org.example;

import io.javalin.Javalin;



class ServerMain {



    public static void main(String[] args) {


        runApp();

//        var templateRenderer = new TemplateRenderer();
//        ToDo learnJava = new ToDo(2, "Learn Java", false);
//        println(templateRenderer.renderToDoToString(learnJava, false,false));

    }



    static void runApp() {


        var app =  Javalin.create(Utils::configureJavalin);

//        var app =  Javalin.create(Utils::configureJavalin);
        var serverController = new ServerController();
        app.get("/todos", serverController::showApp);
        app.post("/todos/new", serverController::addToDo);
        app.post("/todos/{id}/toggleStatus", serverController::toggleStatus);
        app.post("/todos/setFilter/{filter}", serverController::setFilter);
        app.get("/todos/{id}/edit", serverController::showEditForm);
        app.post("/todos/{id}/edit", serverController::updateTextOfToDo);
        app.post("/todos/{id}/delete", serverController::deleteToDo);
        app.post("/todos/clearCompletedToDos", serverController::clearCompletedToDos);
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
