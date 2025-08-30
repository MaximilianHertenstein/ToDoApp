package gg.jte.generated.ondemand.mobile;
import org.example.ToDo;
import org.example.Utils;
import java.util.List;
@SuppressWarnings("unchecked")
public final class JteappGenerated {
	public static final String JTE_NAME = "mobile/app.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,5,5,5,5,26,26,26,27,27,28,28,32,32,35,35,36,36,38,38,38,38,39,39,46,46,46,5,6,7,7,7,7};
	public static void render(gg.jte.TemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<ToDo> toDos, String countOfActiveToDosDisplay, String appliedFilter) {
		jteOutput.writeContent("\n\n<view xmlns=\"https://hyperview.org/hyperview\" style=\"todoapp\" id=\"app\">\n    <header style=\"header\">\n        <text style=\"heading\">todos</text>\n        <form style=\"input-container\">\n            <text-field\n                    style=\"new-todo\"\n                    placeholder=\"What needs to be done?\"\n                    name=\"text_of_new_todo\"\n            />\n            <text verb=\"post\" href=\"/todos/new?replace=true\" action=\"replace-inner\" target=\"body\" style=\"ordinary-text\">\n                Add\n            </text>\n        </form>\n    </header>\n\n    <list style=\"todo-list\">\n        ");
		for (var toDo: toDos) {
			jteOutput.writeContent("\n            ");
			gg.jte.generated.ondemand.mobile.JtesingleItemGenerated.render(jteOutput, jteHtmlInterceptor, toDo);
			jteOutput.writeContent("\n        ");
		}
		jteOutput.writeContent("\n    </list>\n\n    <view style=\"footer\">\n        <text style=\"ordinary-text\">");
		jteOutput.writeUserContent(countOfActiveToDosDisplay);
		jteOutput.writeContent("</text>\n\n        <view style=\"filters\">\n            ");
		for (var filter: List.of("All", "Active", "Completed")) {
			jteOutput.writeContent("\n                <text verb=\"post\" href=\"/todos/setFilter/");
			jteOutput.writeUserContent(filter);
			jteOutput.writeContent("?replace=true\" target=\"body\"\n                      action=\"replace-inner\"\n                      style=\"ordinary-text ");
			jteOutput.writeUserContent(Utils.computeFilterClass(appliedFilter, filter));
			jteOutput.writeContent(" \">");
			jteOutput.writeUserContent(filter);
			jteOutput.writeContent("</text>\n            ");
		}
		jteOutput.writeContent("\n        </view>\n\n        <text style=\"ordinary-text\" verb=\"post\" href=\"/todos/clearCompleted?replace=true\" target=\"body\"\n              action=\"replace-inner\">Clear completed</text>\n    </view>\n</view>\n");
	}
	public static void renderMap(gg.jte.TemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<ToDo> toDos = (List<ToDo>)params.get("toDos");
		String countOfActiveToDosDisplay = (String)params.get("countOfActiveToDosDisplay");
		String appliedFilter = (String)params.get("appliedFilter");
		render(jteOutput, jteHtmlInterceptor, toDos, countOfActiveToDosDisplay, appliedFilter);
	}
}
