package BookExplorerManager;

public class Books {
    
    private String title;
    private String auther;

    public Books(String title, String auther) {
        this.title = title;
        this.auther = auther;
    }

    public Books() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    @Override
    public String toString() {
        return "Books{" + "title=" + title + ", auther=" + auther + '}';
    }
    

}