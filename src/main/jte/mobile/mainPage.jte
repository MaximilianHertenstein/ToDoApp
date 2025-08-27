@import org.example.ToDo
@import java.util.List


@param List<ToDo> toDos
@param String countOfActiveToDosDisplay
@param String appliedFilter


<doc xmlns="https://hyperview.org/hyperview">
    <screen>
<styles>


</styles>

<body id = "body">

@template.mobile.app(toDos = toDos, countOfActiveToDosDisplay = countOfActiveToDosDisplay, appliedFilter = appliedFilter)
</body>
        </screen>
</doc>
