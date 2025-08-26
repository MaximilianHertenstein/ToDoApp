package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
public final class JteheaderGenerated {
	public static final String JTE_NAME = "header.jte";
	public static final int[] JTE_LINE_INFO = {4,4,4,4,4,4,4,4,4,4,4,5,5,5,5,5,5};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<header class=\"header\">\n    <h1>todos</h1>\n\n        <input hx-post=\"/todos/new\" hx-target=\"body\" hx-trigger=\"keyup[keyCode==13]\" type=\"text\" class=\"new-todo\" placeholder=\"What needs to be done?\" name=\"text_of_new_todo\"\n              ");
		var __jte_html_attribute_0 = true;
		if (__jte_html_attribute_0) {
		jteOutput.writeContent(" autofocus");
		}
		jteOutput.writeContent(">\n</header>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
