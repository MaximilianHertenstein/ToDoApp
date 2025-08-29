package gg.jte.generated.ondemand.mobile;
import org.example.ToDo;
import org.example.Utils;
@SuppressWarnings("unchecked")
public final class JtesingleItemGenerated {
	public static final String JTE_NAME = "mobile/singleItem.jte";
	public static final int[] JTE_LINE_INFO = {2,2,3,5,5,5,5,11,11,11,12,12,16,16,18,18,21,21,24,24,26,26,28,28,29,29,33,33,37,37,37,5,5,5,5};
	public static void render(gg.jte.TemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, ToDo toDo) {
		jteOutput.writeContent("\n\n\n\n<item xmlns=\"https://hyperview.org/hyperview\"\n      id=\"");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("\"\n      key=\"");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("\"\n      style=\"toDoItem\"\n>\n    <text\n            style=\"");
		jteOutput.writeUserContent(Utils.computeToggleClass(toDo.completed()));
		jteOutput.writeContent("\"\n          verb=\"post\"\n          href=\"/todos/");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("/toggleStatus?replace=true\"\n          target=\"body\"\n          action=\"replace-inner\">\n        ");
		jteOutput.writeUserContent(Utils.statusToCheckMark(toDo.completed()));
		jteOutput.writeContent("\n    </text>\n    <text\n          href=\"/todos/");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("/edit\"\n          trigger=\"press\"\n          target=\"");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("\"\n          action=\"replace\"\n        style=\"");
		jteOutput.writeUserContent(org.example.Utils.statusToCompletedOrActive(toDo.completed()));
		jteOutput.writeContent("\">\n            ");
		jteOutput.writeUserContent(toDo.text());
		jteOutput.writeContent("\n        </text>\n        <text style=\"destroy\"\n              verb=\"post\"\n              href=\"/todos/");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("/delete?replace=true\"\n              target=\"body\"\n              action=\"replace-inner\"></text>\n</item>\n");
	}
	public static void renderMap(gg.jte.TemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		ToDo toDo = (ToDo)params.get("toDo");
		render(jteOutput, jteHtmlInterceptor, toDo);
	}
}
