import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class WordPuzzle {
  public static void main(String[] args) {
    // staticFileLocation("/public");
    // String layout ="templates/layout.vtl";

    // get("/", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/main.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());

    // get("/scorepage", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/scorepage.vtl");
    //   String userString = request.queryParams("word");
    //   Integer results = 0;
    //   results = Scrabble.scrabbleScore(userString);

    //   model.put("results", results);
    //   model.put("userString", userString);
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
  }

  public static String puzzleSentence(String userString) {
    Integer wordScore = 0;
    char[] wordArray = userString.toCharArray();
    HashMap<Character, Integer> letterValues = new HashMap<Character, Integer>();
      letterValues.put('a', '-');
      letterValues.put('e', '-');
      letterValues.put('i', '-');
      letterValues.put('o', '-');
      letterValues.put('u', '-');
      letterValues.put('A', '-');
      letterValues.put('E', '-');
      letterValues.put('I', '-');
      letterValues.put('O', '-');
      letterValues.put('U', '-');

    for(char letter : scrabbleArray) {
        wordScore += letterValues.get(letter);
        }
        return userString;
        }
    }
