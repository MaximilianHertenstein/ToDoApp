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
                   backgroundColor="#f5f5f5"
                   height="100vh"
                   width="100%"/>
            <style id="todoapp"
                   flex="1"
                   backgroundColor="#ffffff"
                   padding="0"
                   width="100%"
                   height="100%"/>

            <style id="header" marginBottom="24" alignItems="center"/>
            <style id="heading" fontSize="100" fontWeight="200" textAlign="center" color="#b83f45" marginBottom="10"/>
            <style id="new-todo" borderWidth="1" borderColor="#ededed" borderRadius="0" padding="16" fontSize="24" marginBottom="0" backgroundColor="#fff"/>
            <style id="todo-list" flexDirection="column" gap="0"/>
            <style id="toDoItem" flexDirection="row" backgroundColor="#ffffff"  borderColor="#ededed" padding="12" alignItems="center" justifyContent="center" textAlign="center"/>
            <style id="toggle"
                   width="36"
                   height="36"
                   fontSize="24"
                   marginRight="12"
                   color="#4d4d4d"
                   borderWidth="1"
                   borderColor="#ededed"
                   borderRadius="18"
                   alignItems="center"
                   justifyContent="center"
                   textAlign="center"
                   backgroundColor="#fff"/>
            <style id="destroy"
                   width="36"
                   height="36"
                   fontSize="24"
                   marginLeft="12"
                   color="#cc9a9a"
                   borderWidth="1"
                   borderColor="#ededed"
                   borderRadius="18"
                   alignItems="center"
                   justifyContent="center"
                   textAlign="center"
                   backgroundColor="#fff"/>
            <style id="active" fontSize="18" color="#2d3436" flex="1"/>
            <style id="completed" textDecorationLine="line-through" color="#636e72" fontSize="18"/>
                        <style id="footer" marginTop="32" borderTopWidth="1" borderColor="#dfe6e9" paddingTop="20" flexDirection="column" alignItems="center"/>
            <style id="todo-count" fontSize="16" color="#636e72"/>
            <style id="filters" flexDirection="row" marginTop="16" gap="20"/>
            <style id="filter" color="#0984e3"/>
            <style id="selected" color="#74b9ff" fontWeight="bold"/>
            <style id="clear-completed" marginTop="20" padding="10" borderRadius="6" backgroundColor="#dfe6e9" color="#2d3436"/>
            <style id="primary-button"
                   marginTop="12"
                   padding="14"
                   paddingHorizontal="18"
                   fontSize="18"
                   color="#ffffff"
                   backgroundColor="#0984e3"
                   borderRadius="10"
                   textAlign="center"
                   shadowColor="#000"
                   shadowOffset="0 2"
                   shadowOpacity="0.08"/>
            <style id="toggle-completed"
                   width="36"
                   height="36"
                   fontSize="24"
                   marginRight="12"
                   color="#ffffff"
                   borderWidth="0"
                   borderColor="#27ae60"
                   borderRadius="18"
                   alignItems="center"
                   justifyContent="center"
                   textAlign="center"
                   backgroundColor="#27ae60"/>
        </styles>
        <body id="body">
        @template.mobile.app(toDos = toDos, countOfActiveToDosDisplay = countOfActiveToDosDisplay, appliedFilter = appliedFilter)
        </body>
    </screen>
</doc>