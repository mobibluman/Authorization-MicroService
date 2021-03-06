package sample.web.secure.jdbc;

public class Catalog {
    private final long id;
    private final String content;

    public Catalog(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
