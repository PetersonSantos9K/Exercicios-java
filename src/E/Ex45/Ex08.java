package E.Ex45;

import java.util.HashSet;
import java.util.Set;

public class Ex08 {

    void main(){

        String[] words = "java python c++ java go".split(" ");

        Set<String> set = new HashSet<>();

        String word = "";
        int len = words.length;

        for (String s : words) {
            if (!set.add(s)) {
                word = s;
                break;
            }
        }

        if(!word.isEmpty()){
            IO.println(word);
        }
    }


}
