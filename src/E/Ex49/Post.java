package E.Ex49;

import java.util.HashSet;
import java.util.Set;

public class Post {

    private final String title;
    private final Set<String> tags = new HashSet<>();

    public Post(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Set<String> getTags() {
        return tags;
    }

    public boolean AddTag(String tag){
        if(verifyTag(tag)) return false;
        return tags.add(tag);
    }

    public boolean removeTag(String tag){
        if(verifyTag(tag)) return false;
        return tags.remove(tag);
    }

    public void listTags(){
        IO.println("Tags:");
        for(String tag : tags){
            IO.println(tag);
        }
    }

    private boolean verifyTag(String tag){
        if(tag == null){
            IO.println("Invalid value.");
            return true;
        }
        return false;
    }

}
