<header class="header">
    <h1>todos</h1>

        <input hx-post="/todos/new" hx-target="body" hx-trigger="keyup[keyCode==13]" type="text" class="new-todo" placeholder="What needs to be done?" name="text_of_new_todo"
               autofocus="${true}">
</header>