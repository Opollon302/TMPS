import java.util.Date;

public class Book extends BookPool{
    String name;
    Date releaseDate;
    int pages;

    public Book(){}

    public Book(String name,Date releaseDate,int pages){
        this.name=name;
        this.releaseDate=releaseDate;
        this.pages=pages;
    }
//getters
    public Date getReleaseDate() {
        return releaseDate;
    }

    public int getPages() {
        return pages;
    }

    public String getName() {
        return name;
    }

    //setters

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setName(String name) {
        this.name = name;
    }
}
