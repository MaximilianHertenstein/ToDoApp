package gg.jte.generated.ondemand.mobile;
import org.example.ToDo;
@SuppressWarnings("unchecked")
public final class JteeditingFormGenerated {
	public static final String JTE_NAME = "mobile/editingForm.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,2,6,6,6,9,9,10,10,14,14,15,15,23,23,23,2,2,2,2};
	public static void render(gg.jte.TemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, ToDo toDo) {
		jteOutput.writeContent("\n\n\n<item xmlns=\"https://hyperview.org/hyperview\" id=\"");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("  >\n    <form>\n        <text-field\n                placeholder=\"");
		jteOutput.writeUserContent(toDo.text());
		jteOutput.writeContent("\"\n                value=\"");
		jteOutput.writeUserContent(toDo.text());
		jteOutput.writeContent("\"\n               name=\"updated_text_of_new_todo\"\n        />\n            <text verb=\"post\"\n                  href=\"todos/");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("/edit\"\n                  target=\"");
		jteOutput.writeUserContent(toDo.id());
		jteOutput.writeContent("\"\n                  action = \"replace\"\n            > Submit </text>\n\n    </form>\n\n</item>\n\n");
	}
	public static void renderMap(gg.jte.TemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		ToDo toDo = (ToDo)params.get("toDo");
		render(jteOutput, jteHtmlInterceptor, toDo);
	}
}
