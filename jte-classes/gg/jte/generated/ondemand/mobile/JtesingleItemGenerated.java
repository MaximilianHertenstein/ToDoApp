package gg.jte.generated.ondemand.mobile;
import org.example.ToDo;
@SuppressWarnings("unchecked")
public final class JtesingleItemGenerated {
	public static final String JTE_NAME = "mobile/singleItem.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,2,4,4,4,4,4,4,4,4,4,4,5,8,8,8,8,8,8,8,8,8,9,9,9,9,14,15,16,17,18,19,20,22,25,25,25,25,31,31,31,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, ToDo toDo) {
		jteOutput.writeContent("\n<view");
		var __jte_html_attribute_0 = org.example.Utils.statusToCompleted(toDo.completed());
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" style=\"");
			jteOutput.setContext("view", "style");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("view", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">\n    ");
		jteOutput.writeContent("\n    <switch\n            style=\"toggle\"\n           ");
		var __jte_html_attribute_1 = toDo.completed();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("switch", "value");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("switch", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("\n            action=\"/todos/");
		jteOutput.setContext("switch", "action");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.setContext("switch", null);
		jteOutput.writeContent("/toggleStatus\"\n            target=\"replaceSelf\"\n            trigger=\"onChange\"\n    />\n\n    ");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n\n    ");
		jteOutput.writeContent("\n    <button\n            style=\"destroy\"\n            action=\"/todos/");
		jteOutput.setContext("button", "action");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.setContext("button", null);
		jteOutput.writeContent("\"\n            method=\"delete\"\n            target=\"replaceBody\"\n    >\n        <text>×</text>\n    </button>\n</view>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		ToDo toDo = (ToDo)params.get("toDo");
		render(jteOutput, jteHtmlInterceptor, toDo);
	}
}
