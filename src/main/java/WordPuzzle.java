import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Scrabble {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout ="templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/main.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/scorepage", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/scorepage.vtl");
      String userString = request.queryParams("word");
      Integer results = 0;
      results = Scrabble.scrabbleScore(userString);

      model.put("results", results);
      model.put("userString", userString);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static Integer scrabbleScore(String userString) {
    Integer wordScore = 0;
    char[] scrabbleArray = userString.toLowerCase().toCharArray();
    HashMap<Character, Integer> letterValues = new HashMap<Character, Integer>();
      letterValues.put('a', 1);
      letterValues.put('e', 1);
      letterValues.put('i', 1);
      letterValues.put('o', 1);
      letterValues.put('u', 1);
      letterValues.put('l', 1);
      letterValues.put('n', 1);
      letterValues.put('r', 1);
      letterValues.put('s', 1);
      letterValues.put('t', 1);
      letterValues.put('d', 2);
      letterValues.put('g', 2);
      letterValues.put('b', 3);
      letterValues.put('c', 3);
      letterValues.put('m', 3);
      letterValues.put('p', 3);
      letterValues.put('f', 4);
      letterValues.put('h', 4);
      letterValues.put('v', 4);
      letterValues.put('w', 4);
      letterValues.put('y', 4);
      letterValues.put('k', 5);
      letterValues.put('j', 8);
      letterValues.put('x', 8);
      letterValues.put('q', 10);
      letterValues.put('z', 10);

    for(char letter : scrabbleArray) {
        wordScore += letterValues.get(letter);
        }
        return wordScore;
      }
    }
