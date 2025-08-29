package gg.jte.generated.ondemand.web;
import org.example.ToDo;
import org.example.Utils;
import java.util.List;
@SuppressWarnings("unchecked")
public final class JteappGenerated {
	public static final String JTE_NAME = "web/app.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,5,5,5,5,15,15,15,15,15,15,20,20,21,21,22,22,25,25,25,29,29,30,30,30,30,31,31,31,31,31,31,31,31,31,31,31,31,32,32,37,37,37,5,6,7,7,7,7};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<ToDo> toDos, String countOfActiveToDosDisplay, String appliedFilter) {
		jteOutput.writeContent("\n\n<section class=\"todoapp\" id=\"app\">\n    <header class=\"header\">\n        <h1>todos</h1>\n\n        <input hx-post=\"/todos/new\" hx-target=\"body\" hx-trigger=\"keyup[keyCode==13]\" type=\"text\" class=\"new-todo\" placeholder=\"What needs to be done?\" name=\"text_of_new_todo\"\n              ");
		var __jte_html_attribute_0 = true;
		if (__jte_html_attribute_0) {
		jteOutput.writeContent(" autofocus");
		}
		jteOutput.writeContent(">\n    </header>\n\n    <main>\n        <ul class=\"todo-list\">\n            ");
		for (var toDo: toDos) {
			jteOutput.writeContent("\n                ");
			gg.jte.generated.ondemand.web.JtesingleItemGenerated.render(jteOutput, jteHtmlInterceptor, toDo);
			jteOutput.writeContent("\n            ");
		}
		jteOutput.writeContent("\n        </ul>\n    </main>\n    <footer class=\"footer\"><span class=\"todo-count\"><strong>");
		jteOutput.setContext("strong", null);
		jteOutput.writeUserContent(countOfActiveToDosDisplay);
		jteOutput.writeContent("</strong></span>\n\n\n        <ul class=\"filters\">\n            ");
		for (var filter: List.of("All", "Active", "Completed")) {
			jteOutput.writeContent("\n                <li><a hx-post=\"/todos/setFilter/");
			jteOutput.setContext("a", "hx-post");
			jteOutput.writeUserContent(filter);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\" hx-target=\"body\"\n                      ");
			var __jte_html_attribute_1 = Utils.computeLinkClass(appliedFilter, filter);
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
				jteOutput.writeContent(" class=\"");
				jteOutput.setContext("a", "class");
				jteOutput.writeUserContent(__jte_html_attribute_1);
				jteOutput.setContext("a", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">");
			jteOutput.setContext("a", null);
			jteOutput.writeUserContent(filter);
			jteOutput.writeContent("</a></li>\n            ");
		}
		jteOutput.writeContent("\n        </ul>\n\n        <button class=\"clear-completed\" hx-delete=\"/todos/completed\" hx-target=\"body\" >Clear completed</button>\n    </footer>\n    </section>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<ToDo> toDos = (List<ToDo>)params.get("toDos");
		String countOfActiveToDosDisplay = (String)params.get("countOfActiveToDosDisplay");
		String appliedFilter = (String)params.get("appliedFilter");
		render(jteOutput, jteHtmlInterceptor, toDos, countOfActiveToDosDisplay, appliedFilter);
	}
}
