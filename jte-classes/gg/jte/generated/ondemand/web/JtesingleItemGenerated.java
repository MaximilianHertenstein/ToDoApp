package gg.jte.generated.ondemand.web;
import org.example.ToDo;
@SuppressWarnings("unchecked")
public final class JtesingleItemGenerated {
	public static final String JTE_NAME = "web/singleItem.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,9,9,9,9,9,10,10,10,10,17,17,17,17,17,17,17,17,17,17,17,18,18,18,18,19,19,19,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, ToDo toDo) {
		jteOutput.writeContent("\n<li id=\"todo");
		jteOutput.setContext("li", "id");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.setContext("li", null);
		jteOutput.writeContent("\"");
		var __jte_html_attribute_0 = org.example.Utils.statusToCompleted(toDo.completed());
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" class=\"");
			jteOutput.setContext("li", "class");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("li", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" >\n\n\n    <input class=\"toggle\"\n           type=\"checkbox\"\n          ");
		var __jte_html_attribute_1 = toDo.completed();
		if (__jte_html_attribute_1) {
		jteOutput.writeContent(" checked");
		}
		jteOutput.writeContent("\n           hx-post=\"todos/");
		jteOutput.setContext("input", "hx-post");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.setContext("input", null);
		jteOutput.writeContent("/toggleStatus\"\n           hx-target=\"body\"\n           hx-trigger=\"click\"\n           hx-swap=\"outerHTML\"\n    />\n\n\n    <label hx-get=\"/todos/");
		jteOutput.setContext("label", "hx-get");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.setContext("label", null);
		jteOutput.writeContent("/edit\" hx-target=\"#todo");
		jteOutput.setContext("label", "hx-target");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.setContext("label", null);
		jteOutput.writeContent("\" hx-swap=\"outerHTML\"> ");
		jteOutput.setContext("label", null);
		jteOutput.writeUserContent(toDo.text());
		jteOutput.writeContent("</label>\n    <button class=\"destroy\" hx-delete=\"todos/");
		jteOutput.setContext("button", "hx-delete");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.setContext("button", null);
		jteOutput.writeContent("\" hx-target=\"body\"></button>\n</li>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		ToDo toDo = (ToDo)params.get("toDo");
		render(jteOutput, jteHtmlInterceptor, toDo);
	}
}
