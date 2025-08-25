package gg.jte.generated.ondemand;
import org.example.ToDoItem;
@SuppressWarnings("unchecked")
public final class JtesingleItemGenerated {
	public static final String JTE_NAME = "singleItem.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,2,5,5,5,5,5,5,5,5,5,5,6,6,6,6,6,6,6,6,6,8,8,8,8,8,8,8,9,9,9,9,10,10,10,2,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, int index, ToDoItem toDo) {
		jteOutput.writeContent("\n<li");
		var __jte_html_attribute_0 = org.example.Utils.statusToCompleted(toDo.completed());
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" class=\"");
			jteOutput.setContext("li", "class");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("li", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">\n    <input class=\"toggle\" type=\"checkbox\"");
		var __jte_html_attribute_1 = toDo.completed();
		if (__jte_html_attribute_1) {
		jteOutput.writeContent(" checked");
		}
		jteOutput.writeContent(" hx-post=\"todos/");
		jteOutput.setContext("input", "hx-post");
		jteOutput.writeUserContent(index);
		jteOutput.setContext("input", null);
		jteOutput.writeContent("/toggleStatus\"\n           hx-target=\"body\" hx-trigger=\"click\">\n    <label hx-get=\"/todos/");
		jteOutput.setContext("label", "hx-get");
		jteOutput.writeUserContent(index);
		jteOutput.setContext("label", null);
		jteOutput.writeContent("/edit\" hx-target=\"closest li\"> ");
		jteOutput.setContext("label", null);
		jteOutput.writeUserContent(toDo.text());
		jteOutput.writeContent("</label>\n    <button class=\"destroy\" hx-delete=\"todos/");
		jteOutput.setContext("button", "hx-delete");
		jteOutput.writeUserContent(index);
		jteOutput.setContext("button", null);
		jteOutput.writeContent("\" hx-target=\"body\"></button>\n</li>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		int index = (int)params.get("index");
		ToDoItem toDo = (ToDoItem)params.get("toDo");
		render(jteOutput, jteHtmlInterceptor, index, toDo);
	}
}
