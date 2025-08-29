@import org.example.ToDo
@import java.util.List


@param List<ToDo> toDos
@param String countOfActiveToDosDisplay
@param String appliedFilter


<doc xmlns="https://hyperview.org/hyperview">
    <screen style="screen">
        <styles>

            <style id="screen"
                   flex="1"
                   backgroundColor="#f7f9fc"
                   height="100vh"
                   width="100%"/>
            <style id="todoapp"
                   flex="1"
                   backgroundColor="#ffffff"
                   padding="24"
                   width="100%"
                   height="100%"
                   borderRadius="16"/>

            <style id="header" marginBottom="32" alignItems="center"/>
            <style id="heading" fontSize="30" fontWeight="bold" textAlign="center" color="#2d3436" marginBottom="20"/>
            <style id="new-todo" borderWidth="1" borderColor="#dfe6e9" borderRadius="12" padding="14" fontSize="18" marginBottom="20" backgroundColor="#ffffff" shadowColor="#000" shadowOffset="0 2" shadowOpacity="0.05"/>
            <style id="todo-list" flexDirection="column" gap="16"/>
            <style id="toDoItem" flexDirection="row" alignItems="center" backgroundColor="#ffffff" borderWidth="1" borderColor="#dcdde1" padding="14" borderRadius="12" shadowColor="#000" shadowOffset="0 2" shadowOpacity="0.05"/>
            <style id="toggle"
                   width="32"
                   height="32"
                   fontSize="20"
                   marginRight="16"
                   color="#00b894"
                   borderWidth="2"
                   borderColor="#00b894"
                   borderRadius="16"
                   alignItems="center"
                   textAlign="center"
                   backgroundColor="#e8fff8"
                   opacity="0.95"

            />
            <style id="destroy"
                   width="32"
                   height="32"
                   marginLeft="16"
                   color="#ff6b6b"
                   borderWidth="2"
                   borderColor="#ff6b6b"
                   borderRadius="16"
                   alignItems="center"
                   justifyContent="center"
                   backgroundColor="#fff5f5"
                   opacity="0.95"

            />
            <style id="active" fontSize="18" color="#2d3436" flex="1"/>
            <style id="completed" textDecorationLine="line-through" color="#636e72" fontSize="18"/>
                        <style id="footer" marginTop="32" borderTopWidth="1" borderColor="#dfe6e9" paddingTop="20" flexDirection="column" alignItems="center"/>
            <style id="todo-count" fontSize="16" color="#636e72"/>
            <style id="filters" flexDirection="row" marginTop="16" gap="20"/>
            <style id="filter" color="#0984e3"/>
            <style id="selected" color="#74b9ff" fontWeight="bold"/>
            <style id="clear-completed" marginTop="20" padding="10" borderRadius="6" backgroundColor="#dfe6e9" color="#2d3436"/>
        </styles>
        <body id="body">
        @template.mobile.app(toDos = toDos, countOfActiveToDosDisplay = countOfActiveToDosDisplay, appliedFilter = appliedFilter)
        </body>
    </screen>
</doc>