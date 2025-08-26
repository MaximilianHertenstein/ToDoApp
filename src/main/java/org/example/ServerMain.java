import io.javalin.Javalin;
import org.example.ServerController;
import org.example.Utils;

void main(){
    var app = Javalin.create(Utils::configureJavalinApp);
    var serverController = new ServerController();
    app.get("/",serverController::index);
    app.get("/todos",serverController::renderApp);
    app.post("/todos/new", serverController::addToDo);
    app.delete("/todos/{id}",serverController::deleteToDo);
    app.delete("/todos/completed",serverController::deleteCompletedToDos);
    app.post("/todos/{id}/toggleStatus",serverController::toggleStatus);
    app.post("/todos/{filter}",serverController::setFilter);
    app.get("/todos/{id}/edit",serverController::editToDo);
    app.post("/todos/{id}/edit",serverController::updateToDo);
    app.start();
}

