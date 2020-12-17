class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        String alabama = getType()+" " + getDetails() + this.title;

        return alabama;
        // write your code here
    }

    public String getType() {
        return "Publication:";
    }

    public String getDetails() {
        return "";
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    @Override
    public String getType() {
        return "Newspaper";
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "(source - " + source + "): ";
    }
    // write your code here

}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public String getType() {
        return "Article";
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "(author - " + author + "): ";
    }
    // write your code here

}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    @Override
    public String getType() {
        return "Announcement";
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "(days to expire - " + daysToExpire + "): ";
    }
    // write your code here

}
