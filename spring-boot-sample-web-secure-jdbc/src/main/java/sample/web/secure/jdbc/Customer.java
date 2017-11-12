package sample.web.secure.jdbc;


public class Customer {
    private final long id;
    private final String content;
    private final String name;

    public Customer(long id, String name, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getName() { return name; }

    public String getContent() {
        return content;
    }
}
