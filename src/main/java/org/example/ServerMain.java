import io.javalin.Javalin;
import org.example.ServerController;
import org.example.Utils;

void main() {
    runApp();
}

private static void runApp() {
    var app =  Javalin.create();
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
