package gg.jte.generated.ondemand.mobile;
import org.example.ToDo;
import java.util.List;
@SuppressWarnings("unchecked")
public final class JtemainPageGenerated {
	public static final String JTE_NAME = "mobile/mainPage.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,4,4,4,4,17,17,17,23,23,23,4,5,6,6,6,6};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<ToDo> toDos, String countOfActiveToDosDisplay, String appliedFilter) {
		jteOutput.writeContent("\n\n<doc xmlns=\"https://hyperview.org/hyperview\">\n<screen>\n    <head>\n        <title>ToDo-App</title>\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n        <styles href=\"/styles.xml\"/>\n    </head>\n\n    ");
		gg.jte.generated.ondemand.mobile.JteappGenerated.render(jteOutput, jteHtmlInterceptor, toDos, countOfActiveToDosDisplay, appliedFilter);
		jteOutput.writeContent("\n\n</screen>\n</doc>\n\n\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<ToDo> toDos = (List<ToDo>)params.get("toDos");
		String countOfActiveToDosDisplay = (String)params.get("countOfActiveToDosDisplay");
		String appliedFilter = (String)params.get("appliedFilter");
		render(jteOutput, jteHtmlInterceptor, toDos, countOfActiveToDosDisplay, appliedFilter);
	}
}
