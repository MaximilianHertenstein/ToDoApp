import io.javalin.Javalin;
import org.example.ServerView;
import org.example.ServerController;
import org.example.Utils;

void main() {
    runMobileApp();
}

private static void hostCommonRoutes(Javalin webApp, ServerController serverController) {
    webApp.get("/todos", serverController::renderApp);
    webApp.post("/todos/new", serverController::addToDo);

    webApp.post("/todos/{id}/toggleStatus", serverController::toggleStatus);
    webApp.post("/todos/setFilter/{filter}", serverController::setFilter);
    webApp.get("/todos/{id}/edit", serverController::editToDo);
    webApp.post("/todos/{id}/edit", serverController::updateToDo);

}


private static void runWebApp(){
    var serverController = new ServerController();
    var webApp = Javalin.create(Utils::configureJavalinForWeb);
    hostCommonRoutes(webApp, serverController);
    webApp.delete("/todos/completed", serverController::deleteCompletedToDos);
    webApp.delete("/todos/{id}", serverController::deleteToDo);
    webApp.start();
}

private static void runMobileApp(){
    var mobileApp = Javalin.create(Utils::configureJavalinForMobile);
    var serverController = new ServerController();
    hostCommonRoutes(mobileApp, serverController);
    mobileApp.post("/todos/{id}/delete", serverController::deleteToDo);
    mobileApp.post("/todos/clearCompleted", serverController::deleteCompletedToDos);
    mobileApp.start();
}
