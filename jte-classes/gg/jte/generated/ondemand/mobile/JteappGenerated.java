package gg.jte.generated.ondemand.mobile;
import org.example.ToDo;
import org.example.Utils;
import java.util.List;
@SuppressWarnings("unchecked")
public final class JteappGenerated {
	public static final String JTE_NAME = "mobile/app.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,5,5,5,5,19,19,19,32,32,33,33,34,34,37,37,41,41,43,43,44,44,44,44,46,46,53,53,53,5,6,7,7,7,7};
	public static void render(gg.jte.TemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<ToDo> toDos, String countOfActiveToDosDisplay, String appliedFilter) {
		jteOutput.writeContent("\n\n<view style=\"todoapp\" id=\"app\">\n    <header style=\"header\">\n        <text>todos</text>\n        <form>\n            <text-field target=\"body\"\n                        trigger=\"blur\"\n                        style=\"new-todo\"\n                        placeholder=\"What needs to be done?\"\n                        name=\"text_of_new_todo\"\n                        autofocus=\"");
		jteOutput.writeUserContent(true);
		jteOutput.writeContent("\"/>\n\n                <text verb=\"post\" href=\"/todos/new\" action=\"replace-inner\" target=\"body\">\n                    Submit\n                </text>\n\n\n        </form>\n\n    </header>\n\n\n    <list style=\"todo-list\">\n        ");
		for (var toDo: toDos) {
			jteOutput.writeContent("\n            ");
			gg.jte.generated.ondemand.mobile.JtesingleItemGenerated.render(jteOutput, jteHtmlInterceptor, toDo);
			jteOutput.writeContent("\n        ");
		}
		jteOutput.writeContent("\n    </list>\n\n    <view class=\"footer\"><text style=\"todo-count\"> ");
		jteOutput.writeUserContent(countOfActiveToDosDisplay);
		jteOutput.writeContent("</text>\n\n\n        <list style=\"filters\">\n            ");
		for (var filter: List.of("All", "Active", "Completed")) {
			jteOutput.writeContent("\n                <item>\n                    <text verb=\"post\" href=\"/todos/");
			jteOutput.writeUserContent(filter);
			jteOutput.writeContent("\" target=\"body\" action=\"replace-inner\"\n                          class=\"");
			jteOutput.writeUserContent(Utils.computeLinkClass(appliedFilter, filter));
			jteOutput.writeContent("\">");
			jteOutput.writeUserContent(filter);
			jteOutput.writeContent("</text>\n                </item>\n            ");
		}
		jteOutput.writeContent("\n        </list>\n\n        <text style=\"clear-completed\" verb=\"delete\" href=\"/todos/completed\" target=\"body\" action=\"replace-inner\">Clear\n            completed\n        </text>\n    </view>\n</view>");
	}
	public static void renderMap(gg.jte.TemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<ToDo> toDos = (List<ToDo>)params.get("toDos");
		String countOfActiveToDosDisplay = (String)params.get("countOfActiveToDosDisplay");
		String appliedFilter = (String)params.get("appliedFilter");
		render(jteOutput, jteHtmlInterceptor, toDos, countOfActiveToDosDisplay, appliedFilter);
	}
}
