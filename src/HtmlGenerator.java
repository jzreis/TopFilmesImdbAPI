import java.io.PrintStream;
import java.util.List;

public class HtmlGenerator {
    private PrintStream ps;

    public HtmlGenerator(PrintStream ps) {
        String Head = "<!DOCTYPE html>" +
                "<html lang=\"pt-br\">\n" +
                "<head>\n" +
                "   <meta charset=\"UTF-8\">\n" +
                "   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "   <link rel=\"stylesheet\" href=\"style.css\">"+
                "   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "   <title>Top 250 Filmes IMDB</title>\n" +
                "</head>";

        this.ps = ps;
        ps.print(Head);
    }

    public void generate(List<Movie> list) {
        String BodyHtml="\n<body>\n";
        for (Movie movie : list) {
            BodyHtml += "<div class=\"card\">"+
            movie.toString()+
            "</div>\n\n";
        }
        BodyHtml +="</body>\n</html>";
        ps.print(BodyHtml);
        ps.close();
    }
}
