import io.javalin.Javalin;
import org.example.ServerController;
import org.example.Utils;

void main(){
    var app = Javalin.create(Utils::configureJavalinApp);
    var serverController = new ServerController();



    app.get("/todos",serverController::renderApp);
    app.get("/todos",serverController::renderApp);


    app.post("/todos/new", serverController::addToDo);
    app.post("/todos/{id}/toggleStatus",serverController::toggleStatus);
    app.delete("/todos/completed",serverController::deleteCompletedToDos);
    app.delete("/todos/{id}",serverController::deleteToDo);
    app.get("/todos/{id}/edit",serverController::editToDo);
    app.post("/todos/{id}/edit",serverController::updateToDo);
    app.start();
}

