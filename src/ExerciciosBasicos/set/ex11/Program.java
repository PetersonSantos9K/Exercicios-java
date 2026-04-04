package ExerciciosBasicos.set.ex11;

import java.util.HashSet;
import java.util.Set;

public class Program {

    void main(){

        Set<User> users = new HashSet<>();

        User ana, joao, maria, pedro;

        users.add(ana = new User("Ana"));
        users.add(joao = new User("João"));
        users.add(maria = new User("Maria"));
        users.add(pedro =new User("Pedro"));

        ana.addFriend(joao, maria);
        joao.addFriend(ana, pedro, maria);

        for(User u : ana.mutualFriends(joao)){
            IO.println(u.getName());
        }

    }



}
