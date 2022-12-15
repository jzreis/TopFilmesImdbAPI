import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        // Conectando a url
        String apiKey = "https://imdb-api.com/en/API/Top250Movies/k_h7wclvsv";
        String json = new ImdbApiClient(apiKey).getBody();

        // Tranformando em uma list
        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(json);

        // armazenando os dados
        List<Movie> movieList = new ArrayList<>();
        for (Map<String, String> movies : listaDeFilmes) {
            Movie filme = new Movie(movies.get("title"), movies.get("image"),movies.get("rank"), movies.get("imDbRating"),
                    movies.get("year"));
            movieList.add(filme);
        }

        // Passando pra arquivo html
        HtmlGenerator html = new HtmlGenerator(new PrintStream("Html/content.html"));
        html.generate(movieList);
        System.out.println("Feito");
    }
}