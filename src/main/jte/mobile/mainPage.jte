@import org.example.ToDo
@import org.example.UIState


@param UIState uiState
<%-- language=HXML --%>

<doc xmlns="https://hyperview.org/hyperview">
    <screen>
        <styles>
            <style id="screen"
                   backgroundColor="#000000"
                   height="100%"
                   width="100%"
                   justifyContent="center"
            />
            <style id="todoapp"
                   width="100%"
                   backgroundColor="#000000"
                   flexDirection="column"
                   height="90%"
                   justifyContent="center"
            />
            <style id="header"
                   alignItems="center"
                   marginVertical="24"
            />
            <style id="heading"
                   fontSize="36"
                   fontWeight="bold"
                   textAlign="center"
                   color="#FFFFFF"
                   fontFamily="Helvetica"
                   marginBottom="16"
            />
            <style id="ordinary-text"
                   fontSize="18"
                   color="#CCCCCC"
                   textAlign="center"
                   marginVertical="8"
            />
            <style id="new-todo"
                   fontSize="18"
                   width="80%"
                   backgroundColor="#1A1A1A"
                   color="#FFFFFF"
                   borderRadius="8"
                   padding="12"
                   alignSelf="center"
                   marginBottom="16"
            />
            <style id="todo-list"
                   flexDirection="column"
                   height="60%"
                   marginVertical="8"
            />
            <style id="toDoItem"
                   flexDirection="row"
                   width="90%"
                   alignSelf="center"
                   justifyContent="space-between"
                   backgroundColor="#181818"
                   borderRadius="8"
                   padding="12"
                   marginVertical="6"
            />
            <style id="completed"
                   textDecorationLine="line-through"
                   color="#555555"
            />
            <style id="destroy"
                   color="#FF5555"
                   fontSize="18"
                   textAlign="center"
            />
            <style id="filters"
                   flexDirection="row"
                   justifyContent="center"
                   alignSelf="center"
                   width="60%"
                   marginVertical="12"
            />
            <style id="filter"
                   marginHorizontal="8"
                   color="#CCCCCC"
            />
            <style id="selected"
                   color="#00FFAA"
                   fontWeight="bold"
            />
            <style id="footer"
                   flexDirection="row"
                   width="90%"
                   justifyContent="space-between"
                   alignSelf="center"
                   marginTop="16"
            />
        </styles>

        <body id="body" style="screen">
        @template.app(uiState = uiState)

        </body>

    </screen>

</doc>