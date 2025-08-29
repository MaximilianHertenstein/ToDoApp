package gg.jte.generated.ondemand.web;
import org.example.ToDo;
import java.util.List;
@SuppressWarnings("unchecked")
public final class JtemainPageGenerated {
	public static final String JTE_NAME = "web/mainPage.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,4,4,4,4,22,22,22,26,26,26,4,5,6,6,6,6};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<ToDo> toDos, String countOfActiveToDosDisplay, String appliedFilter) {
		jteOutput.writeContent("\n\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"utf-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n    <link rel=\"stylesheet\" href=\"/webjars/todomvc-app-css/2.4.1/index.css\" type=\"text/css\">\n    <script src=\"/webjars/htmx.org/2.0.6/dist/htmx.min.js\"></script>\n    <title>ToDo-App</title>\n\n</head>\n\n<body>\n\n");
		gg.jte.generated.ondemand.web.JteappGenerated.render(jteOutput, jteHtmlInterceptor, toDos, countOfActiveToDosDisplay, appliedFilter);
		jteOutput.writeContent("\n</body>\n\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<ToDo> toDos = (List<ToDo>)params.get("toDos");
		String countOfActiveToDosDisplay = (String)params.get("countOfActiveToDosDisplay");
		String appliedFilter = (String)params.get("appliedFilter");
		render(jteOutput, jteHtmlInterceptor, toDos, countOfActiveToDosDisplay, appliedFilter);
	}
}
