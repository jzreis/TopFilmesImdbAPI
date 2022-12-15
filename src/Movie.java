class Movie{
    private String title;
    private String urlImage;
    private String rank;
    private String rating;
    private String year;

    public Movie(String title,String urlImage,String rank,String rating,String year){
        this.title = title;
        this.urlImage = urlImage;
        this.rank = rank;
        this.rating = rating;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public String getRank(){
        return rank;
    }

    public String getRating() {
        return rating;
    }

    public String getYear() {
        return year;
    }

    public String toString(){
        return "   <h1>"+this.getTitle()+"</h1>"+"\n   <img src=\""+this.getUrlImage()+"\">"+"\n        <p>Rank:"+this.getRank()+" - Rate: "+this.getRating()+" - Year: "+this.getYear()+"</p>\n";
    }
}