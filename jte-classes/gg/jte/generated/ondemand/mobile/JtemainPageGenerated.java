package gg.jte.generated.ondemand.mobile;
import org.example.ToDo;
import java.util.List;
@SuppressWarnings("unchecked")
public final class JtemainPageGenerated {
	public static final String JTE_NAME = "mobile/mainPage.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,4,4,4,4,17,17,23,30,43,54,59,88,107,125,138,138,144,144,144,4,5,6,6,6,6};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<ToDo> toDos, String countOfActiveToDosDisplay, String appliedFilter) {
		jteOutput.writeContent("\n\n<doc xmlns=\"https://hyperview.org/hyperview\">\n<screen>\n    <head>\n        <title>ToDo-App</title>\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n\n\n        <styles>\n            ");
		jteOutput.writeContent("\n            <style name=\"screen\">\n                <flex>1</flex>\n                <backgroundColor>#f5f5f5</backgroundColor>\n            </style>\n\n            ");
		jteOutput.writeContent("\n            <style name=\"todoapp\">\n                <flex>1</flex>\n                <backgroundColor>#fff</backgroundColor>\n                <padding>20</padding>\n            </style>\n\n            ");
		jteOutput.writeContent("\n            <style name=\"header\">\n                <marginBottom>20</marginBottom>\n                <alignItems>center</alignItems>\n            </style>\n\n            <style name=\"h1\">\n                <fontSize>36</fontSize>\n                <fontWeight>bold</fontWeight>\n                <textAlign>center</textAlign>\n                <color>#b83f45</color>\n            </style>\n\n            ");
		jteOutput.writeContent("\n            <style name=\"new-todo\">\n                <borderWidth>1</borderWidth>\n                <borderColor>#999</borderColor>\n                <borderRadius>4</borderRadius>\n                <padding>10</padding>\n                <fontSize>18</fontSize>\n                <marginTop>10</marginTop>\n                <marginBottom>10</marginBottom>\n            </style>\n\n            ");
		jteOutput.writeContent("\n            <style name=\"todo-list\">\n                <flexDirection>column</flexDirection>\n            </style>\n\n            ");
		jteOutput.writeContent("\n            <style name=\"toggle\">\n                <marginRight>10</marginRight>\n            </style>\n\n            <style name=\"destroy\">\n                <marginLeft>10</marginLeft>\n                <color>#cc9a9a</color>\n                <fontSize>20</fontSize>\n            </style>\n\n            <style name=\"completed\">\n                <textDecorationLine>line-through</textDecorationLine>\n                <color>#d9d9d9</color>\n            </style>\n\n            <style name=\"editing\">\n                <backgroundColor>#fffbe6</backgroundColor>\n                <padding>10</padding>\n            </style>\n\n            <style name=\"edit\">\n                <borderWidth>1</borderWidth>\n                <borderColor>#999</borderColor>\n                <padding>10</padding>\n                <fontSize>18</fontSize>\n                <flex>1</flex>\n            </style>\n\n            ");
		jteOutput.writeContent("\n            <style name=\"footer\">\n                <marginTop>20</marginTop>\n                <borderTopWidth>1</borderTopWidth>\n                <borderColor>#eee</borderColor>\n                <paddingTop>10</paddingTop>\n                <flexDirection>column</flexDirection>\n                <alignItems>center</alignItems>\n            </style>\n\n            <style name=\"todo-count\">\n                <fontSize>14</fontSize>\n                <color>#555</color>\n            </style>\n\n            <style name=\"strong\">\n                <fontWeight>bold</fontWeight>\n            </style>\n\n            ");
		jteOutput.writeContent("\n            <style name=\"filters\">\n                <flexDirection>row</flexDirection>\n                <justifyContent>center</justifyContent>\n                <marginTop>10</marginTop>\n            </style>\n\n            <style name=\"filters-link\">\n                <marginLeft>5</marginLeft>\n                <marginRight>5</marginRight>\n                <color>#555</color>\n            </style>\n\n            <style name=\"filters-link-active\">\n                <color>#000</color>\n                <fontWeight>bold</fontWeight>\n            </style>\n\n            ");
		jteOutput.writeContent("\n            <style name=\"clear-completed\">\n                <marginTop>10</marginTop>\n                <padding>8</padding>\n                <borderWidth>1</borderWidth>\n                <borderColor>#ddd</borderColor>\n                <borderRadius>4</borderRadius>\n                <backgroundColor>#f5f5f5</backgroundColor>\n            </style>\n        </styles>\n\n    </head>\n\n    ");
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
