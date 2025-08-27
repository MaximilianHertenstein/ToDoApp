package gg.jte.generated.ondemand.mobile;
import org.example.ToDo;
import org.example.Utils;
import java.util.List;
@SuppressWarnings("unchecked")
public final class JteappGenerated {
	public static final String JTE_NAME = "mobile/app.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,5,5,5,5,27,27,27,29,29,31,31,37,37,37,41,41,43,44,45,46,47,48,49,51,51,64,64,64,5,6,7,7,7,7};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<ToDo> toDos, String countOfActiveToDosDisplay, String appliedFilter) {
		jteOutput.writeContent("\n\n<body>\n    <view id=\"app\" style=\"todoapp\" >\n        <view style=\"header\">\n            <text style=\"h1\">todos</text>\n\n            <input\n                    name=\"text_of_new_todo\"\n                    placeholder=\"What needs to be done?\"\n                    autofocus=\"true\"\n                    action=\"/todos/new\"\n                    trigger=\"onSubmit\"\n                    target=\"replaceBody\"\n            />\n        </view>\n\n        <view style=\"main\">\n            <list style=\"todo-list\">\n                ");
		for (var toDo: toDos) {
			jteOutput.writeContent("\n                    <view>\n                        ");
			gg.jte.generated.ondemand.mobile.JtesingleItemGenerated.render(jteOutput, jteHtmlInterceptor, toDo);
			jteOutput.writeContent("\n                    </view>\n                ");
		}
		jteOutput.writeContent("\n            </list>\n        </view>\n\n        <view style=\"footer\">\n            <text style=\"todo-count\">\n                <text style=\"strong\">");
		jteOutput.setContext("text", null);
		jteOutput.writeUserContent(countOfActiveToDosDisplay);
		jteOutput.writeContent("</text>\n            </text>\n\n            <list style=\"filters\">\n                ");
		for (var filter: List.of("All", "Active", "Completed")) {
			jteOutput.writeContent("\n                    <view>\n");
			jteOutput.writeContent("\n");
			jteOutput.writeContent("\n");
			jteOutput.writeContent("\n");
			jteOutput.writeContent("\n");
			jteOutput.writeContent("\n");
			jteOutput.writeContent("\n");
			jteOutput.writeContent("\n                    </view>\n                ");
		}
		jteOutput.writeContent("\n            </list>\n\n            <button\n                    style=\"clear-completed\"\n                    action=\"/todos/completed\"\n                    method=\"delete\"\n                    target=\"replaceBody\"\n            >\n                <text>Clear completed</text>\n            </button>\n        </view>\n    </view>\n</body>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<ToDo> toDos = (List<ToDo>)params.get("toDos");
		String countOfActiveToDosDisplay = (String)params.get("countOfActiveToDosDisplay");
		String appliedFilter = (String)params.get("appliedFilter");
		render(jteOutput, jteHtmlInterceptor, toDos, countOfActiveToDosDisplay, appliedFilter);
	}
}
