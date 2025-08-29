package gg.jte.generated.ondemand.mobile;
import org.example.ToDo;
@SuppressWarnings("unchecked")
public final class JtesingleItemGenerated {
	public static final String JTE_NAME = "mobile/singleItem.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,2,7,7,7,7,7,7,7,12,12,13,13,19,19,20,20,22,22,26,26,30,30,30,2,2,2,2};
	public static void render(gg.jte.TemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, ToDo toDo) {
		jteOutput.writeContent("\n\n\n\n<item xmlns=\"https://hyperview.org/hyperview\" id = \"");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("\"  key = \"");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("\" style=\"");
		jteOutput.writeUserContent(org.example.Utils.statusToCompleted(toDo.completed()));
		jteOutput.writeContent("\">\n\n\n    <text style=\"toggle\"\n          verb=\"post\"\n          href=\"/todos/");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("/toggleStatus\"\n          target=\"");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("\"\n          action=\"replace\">\n        toggle\n    </text>\n\n    <text verb=\"get\"\n          href=\"/todos/");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("/edit\"\n          target=\"");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("\"\n          action=\"replace\">\n        ");
		jteOutput.writeUserContent(toDo.text());
		jteOutput.writeContent("\n    </text>\n    <text style=\"destroy\"\n          verb = \"post\"\n          href=\"/todos/");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("/delete?q=replace\"\n          target=\"body\"\n          action=\"replace\">\n        destroy</text>\n</item>");
	}
	public static void renderMap(gg.jte.TemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		ToDo toDo = (ToDo)params.get("toDo");
		render(jteOutput, jteHtmlInterceptor, toDo);
	}
}
