import io.javalin.Javalin;
import org.example.ServerController;
import org.example.Utils;

void main(){
    var app = Javalin.create(Utils::configureJavalinApp);
    var serverController = new ServerController();

    app.get("/todos",serverController::renderMain);


    app.post("/todos/new", serverController::addToDo);
    app.post("/todos/{i}/toggleStatus",serverController::toggleStatus);
    app.delete("/todos/{i}",serverController::deleteToDo);


    app.get("/todos/{i}/edit",serverController::editToDo);
    app.post("/todos/{i}/edit",serverController::updateToDo);
    app.start();
}

