package gg.jte.generated.ondemand.mobile;
import org.example.ToDo;
import org.example.Utils;
@SuppressWarnings("unchecked")
public final class JtesingleItemGenerated {
	public static final String JTE_NAME = "mobile/singleItem.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,3,6,6,6,7,7,11,11,13,13,16,16,19,19,21,21,23,23,24,24,28,28,33,33,33,3,3,3,3};
	public static void render(gg.jte.TemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, ToDo toDo) {
		jteOutput.writeContent("\n<item xmlns=\"https://hyperview.org/hyperview\"\n      id=\"");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("\"\n      key=\"");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("\"\n      style=\"toDoItem\"\n>\n    <text\n            style=\"");
		jteOutput.writeUserContent(Utils.computeToggleClass(toDo.completed()));
		jteOutput.writeContent("\"\n          verb=\"post\"\n          href=\"/todos/");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("/toggleStatus?replace=true\"\n          target=\"body\"\n          action=\"replace-inner\">\n        ");
		jteOutput.writeUserContent(Utils.statusToSymbol(toDo.completed()));
		jteOutput.writeContent("\n    </text>\n    <text\n          href=\"/todos/");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("/edit\"\n          trigger=\"press\"\n          target=\"");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("\"\n          action=\"replace\"\n        style=\"");
		jteOutput.writeUserContent(org.example.Utils.statusToCompleted(toDo.completed()));
		jteOutput.writeContent(" ordinary-text\">\n            ");
		jteOutput.writeUserContent(toDo.text());
		jteOutput.writeContent("\n        </text>\n        <text style=\"ordinary-text destroy \"\n              verb=\"post\"\n              href=\"/todos/");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("/delete?replace=true\"\n              target=\"body\"\n              action=\"replace-inner\">×</text>\n\n</item>\n");
	}
	public static void renderMap(gg.jte.TemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		ToDo toDo = (ToDo)params.get("toDo");
		render(jteOutput, jteHtmlInterceptor, toDo);
	}
}
