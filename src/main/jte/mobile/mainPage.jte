@import org.example.ToDo
@import java.util.List


@param List<ToDo> toDos
@param String countOfActiveToDosDisplay
@param String appliedFilter


<doc xmlns="https://hyperview.org/hyperview">
<screen >
    <head>
        <title>ToDo-App</title>
        <meta name="viewport" content="width=device-width, initial-scale=1"/>
    </head>

    <body>
    @template.mobile.app(toDos = toDos, countOfActiveToDosDisplay = countOfActiveToDosDisplay, appliedFilter = appliedFilter)

    </body>
</screen>


