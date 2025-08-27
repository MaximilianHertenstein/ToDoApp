package gg.jte.generated.ondemand.mobile;
import org.example.ToDo;
import java.util.List;
@SuppressWarnings("unchecked")
public final class JtemainPageGenerated {
	public static final String JTE_NAME = "mobile/mainPage.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,4,4,4,4,18,18,18,22,22,22,4,5,6,6,6,6};
	public static void render(gg.jte.TemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<ToDo> toDos, String countOfActiveToDosDisplay, String appliedFilter) {
		jteOutput.writeContent("\n\n<doc xmlns=\"https://hyperview.org/hyperview\">\n    <screen>\n<styles>\n\n\n</styles>\n\n<body id = \"body\">\n\n");
		gg.jte.generated.ondemand.mobile.JteappGenerated.render(jteOutput, jteHtmlInterceptor, toDos, countOfActiveToDosDisplay, appliedFilter);
		jteOutput.writeContent("\n</body>\n        </screen>\n</doc>\n");
	}
	public static void renderMap(gg.jte.TemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<ToDo> toDos = (List<ToDo>)params.get("toDos");
		String countOfActiveToDosDisplay = (String)params.get("countOfActiveToDosDisplay");
		String appliedFilter = (String)params.get("appliedFilter");
		render(jteOutput, jteHtmlInterceptor, toDos, countOfActiveToDosDisplay, appliedFilter);
	}
}
