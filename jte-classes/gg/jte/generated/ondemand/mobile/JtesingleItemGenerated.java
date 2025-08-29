package gg.jte.generated.ondemand.mobile;
import org.example.ToDo;
import org.example.Utils;
@SuppressWarnings("unchecked")
public final class JtesingleItemGenerated {
	public static final String JTE_NAME = "mobile/singleItem.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,3,9,9,9,10,10,13,13,15,15,16,16,17,17,19,19,21,21,23,23,24,24,28,28,32,32,32,3,3,3,3};
	public static void render(gg.jte.TemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, ToDo toDo) {
		jteOutput.writeContent("\n\n\n\n<item xmlns=\"https://hyperview.org/hyperview\"\n      id=\"");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("\"\n      key=\"");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("\"\n      style=\"toDoItem\"\n>\n    <text style=\"");
		jteOutput.writeUserContent(Utils.computeToggleClass(toDo.completed()));
		jteOutput.writeContent("\"\n          verb=\"post\"\n          href=\"/todos/");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("/toggleStatus\"\n          target=\"");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("\"\n          action=\"replace\">");
		jteOutput.writeUserContent(Utils.statusToCheckMark(toDo.completed()));
		jteOutput.writeContent(" </text>\n    <text\n          href=\"/todos/");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("/edit\"\n          trigger=\"press\"\n          target=\"");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("\"\n          action=\"replace\"\n        style=\"");
		jteOutput.writeUserContent(org.example.Utils.statusToCompletedOrActive(toDo.completed()));
		jteOutput.writeContent("\">\n            ");
		jteOutput.writeUserContent(toDo.text());
		jteOutput.writeContent("\n        </text>\n    <text style=\"destroy\"\n          verb=\"post\"\n          href=\"/todos/");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("/delete?replace=true\"\n          target=\"body\"\n          action=\"replace-inner\">X</text>\n</item>\n");
	}
	public static void renderMap(gg.jte.TemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		ToDo toDo = (ToDo)params.get("toDo");
		render(jteOutput, jteHtmlInterceptor, toDo);
	}
}
