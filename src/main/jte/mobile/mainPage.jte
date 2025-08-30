<%-- language=HXML --%>

@import org.example.ToDo
@import java.util.List


@param List<ToDo> toDos
@param String countOfActiveToDosDisplay
@param String appliedFilter
<%-- language=HXML --%>

<doc xmlns="https://hyperview.org/hyperview">
    <screen xmlns="https://hyperview.org/hyperview">
        <styles>
            <style id="screen"
                   backgroundColor="#000000"
                   height="100%"
                   width="100%"
                   justifyContent="space-evenly"
                   />
            <style id="todoapp"
                   width="100%"
                   backgroundColor="#000000"
                   flexDirection="column"
                   height="90%"
                   justifyContent="space-between"/>
            <style id="input-container"
                   flexDirection="row"
                    width="30%"
                   alignSelf="center"
                     justifyContent="space-evenly"
            />
            <style id="header"
                   alignItems="center"

                   />
            <style id="heading"
                   fontSize="60"
                   fontWeight="200"
                   textAlign="center"
                   color="#ff0000"
                   fontFamily="Helvetica"
                   />


            <style id="ordinary-text"
                   fontSize="20"
                   color="#FFFFFF"
                   textAlign="center"
                   />
            <style id="new-todo"
                   fontSize="20"
                   width="40%"
                   backgroundColor="#FFFFFF"
                   color="#000000"
                   />
            <style id="edit-todo"
                   fontSize="20"
                   width="100%"
                   backgroundColor="#FFFFFF"
                   color="#000000"
            />

            <style id="todo-list"
                   flexDirection="column"

                   height="60%"
                   />


            <style id="filters"
                   flexDirection="row"
                   justifyContent="space-evenly"
                   alignSelf="center"
                   width="30%"
            />
            <style id="footer"
                   flexDirection="row"
                   width="80%"
                   justifyContent="space-between"
                   alignSelf="center"
            />

            <style id="selected"
                   color="#FF0000"
                   />


            <style id="toDoItem"
                   flexDirection="row"
                    width="60%"
                    alignSelf="center"
                   justifyContent="space-between"/>


            <style id="toggle-completed"

                   color="#00FF00"
                   fontSize="20"
                   textAlign="center"/>
            <style id="toggle"

                   color="#FFFFFF"
                   fontSize="20"

                   textAlign="center"
                   />
            <style id="destroy"
                   color="#FF0000"/>

            <style id="completed"
                   textDecorationLine="line-through"
                   />
        </styles>

        <body id="body" style="screen">
        @template.mobile.app(toDos = toDos, countOfActiveToDosDisplay = countOfActiveToDosDisplay, appliedFilter = appliedFilter)

        </body>
                   paddingVertical="20"
    </screen>
</doc>