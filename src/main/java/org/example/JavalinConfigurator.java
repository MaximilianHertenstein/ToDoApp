package org.example;

import io.javalin.config.JavalinConfig;

public class JavalinConfigurator {

    public static void configureJavalin(JavalinConfig javalinConfig) {
        var serverController = new ServerController();
        javalinConfig.routes.get("/todos", serverController::showApp);
        javalinConfig.routes.post("/todos/new", serverController::addToDo);
        javalinConfig.routes.post("/todos/{id}/toggleStatus", serverController::toggleStatus);
        javalinConfig.routes.post("/todos/setFilter/{filter}", serverController::setFilter);
        javalinConfig.routes.get("/todos/{id}/edit", serverController::showEditForm);
        javalinConfig.routes.post("/todos/{id}/edit", serverController::updateTextOfToDo);
        javalinConfig.routes.post("/todos/{id}/delete", serverController::deleteToDo);
        javalinConfig.routes.post("/todos/clearCompletedToDos", serverController::clearCompletedToDos);
        javalinConfig.staticFiles.enableWebjars();
    }
}
