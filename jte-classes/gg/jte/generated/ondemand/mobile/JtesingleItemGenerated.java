package gg.jte.generated.ondemand.mobile;
import org.example.ToDo;
@SuppressWarnings("unchecked")
public final class JtesingleItemGenerated {
	public static final String JTE_NAME = "mobile/singleItem.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,2,7,7,7,7,7,10,10,10,10,12,12,12,12,12,12,13,13,14,14,14,2,2,2,2};
	public static void render(gg.jte.TemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, ToDo toDo) {
		jteOutput.writeContent("\n\n\n\n<item id = \"");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("\" style=\"");
		jteOutput.writeUserContent(org.example.Utils.statusToCompleted(toDo.completed()));
		jteOutput.writeContent("\">\n\n\n    <text style=\"toggle\" href=\"todos/");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("/toggleStatus\" verb=\"post\" target=\"");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("\" trigger=\"click\" action=\"replace\">toggle</text>\n\n    <text verb=\"get\" href=\"/todos/");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("/edit\" target=\"");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("\" action=\"replace\"> ");
		jteOutput.writeUserContent(toDo.text());
		jteOutput.writeContent("</text>\n    <text style=\"destroy\" verb = \"delete\" href=\"todos/");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("\" target=\"body\" action=\"replace\">destroy</text>\n</item>");
	}
	public static void renderMap(gg.jte.TemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		ToDo toDo = (ToDo)params.get("toDo");
		render(jteOutput, jteHtmlInterceptor, toDo);
	}
}
