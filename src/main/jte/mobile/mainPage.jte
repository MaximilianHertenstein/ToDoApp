@import org.example.ToDo
@import java.util.List


@param List<ToDo> toDos
@param String countOfActiveToDosDisplay
@param String appliedFilter


<doc xmlns="https://hyperview.org/hyperview">
    <screen>
<styles>
        <!-- Screen -->
        <style name="screen">
            <flex>1</flex>
            <backgroundColor>#f5f5f5</backgroundColor>
        </style>

        <!-- Root app container -->
        <style name="todoapp">
            <flex>1</flex>
            <backgroundColor>#fff</backgroundColor>
            <padding>20</padding>
        </style>

        <!-- Header -->
        <style name="header">
            <marginBottom>20</marginBottom>
            <alignItems>center</alignItems>
        </style>

        <style name="heading">
            <fontSize>70</fontSize>
            <fontWeight>bold</fontWeight>
            <textAlign>center</textAlign>
            <color>#b83f45</color>
        </style>

        <!-- Input for new todo -->
        <style name="new-todo">
            <borderWidth>1</borderWidth>
            <borderColor>#999</borderColor>
            <borderRadius>4</borderRadius>
            <padding>10</padding>
            <fontSize>18</fontSize>
            <marginTop>10</marginTop>
            <marginBottom>10</marginBottom>
        </style>

        <!-- Main list -->
        <style name="todo-list">
            <flexDirection>column</flexDirection>
        </style>

        <!-- Todo item states -->
        <style name="toggle">
            <marginRight>10</marginRight>
        </style>

        <style name="destroy">
            <marginLeft>10</marginLeft>
            <color>#cc9a9a</color>
            <fontSize>20</fontSize>
        </style>

        <style name="completed">
            <textDecorationLine>line-through</textDecorationLine>
            <color>#d9d9d9</color>
        </style>

        <style name="editing">
            <backgroundColor>#fffbe6</backgroundColor>
            <padding>10</padding>
        </style>

        <style name="edit">
            <borderWidth>1</borderWidth>
            <borderColor>#999</borderColor>
            <padding>10</padding>
            <fontSize>18</fontSize>
            <flex>1</flex>
        </style>

        <!-- Footer -->
        <style name="footer">
            <marginTop>20</marginTop>
            <borderTopWidth>1</borderTopWidth>
            <borderColor>#eee</borderColor>
            <paddingTop>10</paddingTop>
            <flexDirection>column</flexDirection>
            <alignItems>center</alignItems>
        </style>

        <style name="todo-count">
            <fontSize>14</fontSize>
            <color>#555</color>
        </style>

        <style name="strong">
            <fontWeight>bold</fontWeight>
        </style>

        <!-- Filters -->
        <style name="filters">
            <flexDirection>row</flexDirection>
            <justifyContent>center</justifyContent>
            <marginTop>10</marginTop>
        </style>

        <style name="filters-link">
            <marginLeft>5</marginLeft>
            <marginRight>5</marginRight>
            <color>#555</color>
        </style>

        <style name="filters-link-active">
            <color>#000</color>
            <fontWeight>bold</fontWeight>
        </style>

        <!-- Clear button -->
        <style name="clear-completed">
            <marginTop>10</marginTop>
            <padding>8</padding>
            <borderWidth>1</borderWidth>
            <borderColor>#ddd</borderColor>
            <borderRadius>4</borderRadius>
            <backgroundColor>#f5f5f5</backgroundColor>
        </style>
    </styles>



<body id = "body">

@template.mobile.app(toDos = toDos, countOfActiveToDosDisplay = countOfActiveToDosDisplay, appliedFilter = appliedFilter)

        </body>
        </screen>



</doc>
