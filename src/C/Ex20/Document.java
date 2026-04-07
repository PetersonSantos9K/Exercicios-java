package C.Ex20;

public class Document implements Comparable<Document>{

    private String title;

    public Document(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle();
    }


    @Override
    public int compareTo(Document o) {

        String t1 = this.title;
        String t2 = o.getTitle();

        if(t1.equals(t2)) return 0;

        if(t1 == null) return 1;

        if(t2 == null) return -1;

        return getTitle().compareTo(o.getTitle());
    }
}
