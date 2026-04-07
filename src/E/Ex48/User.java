package E.Ex48;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class User {

    private final String name;
    private Set<User> friends;

    public User(String name) {
        this.name = name;
        friends = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<User> getFriends() {
        return friends;
    }

    public void addFriend(User... user) {
        boolean verify = verifyUser(user);
        if(!verify) return;
        if(user[0] == this){
            IO.println("A user cannot add themselves.");
            return;
        }


        boolean add = friends.add(user[0]);
        if (user.length > 1) {
            for (User u : user) {
                if(u == this){
                    IO.println("A user cannot add themselves.");
                    return;
                }
                add = friends.add(u);
            }
        }

        if (!add) {
            IO.println("You already follow this user.");
        }

    }

    public void removeFriend(User user) {
        boolean verify = verifyUser(user);
        if(!verify) return;

        boolean remove = friends.remove(user);
        if (!remove) {
            IO.println("You don't follow this user, so it wasn't possible to remove them.");
        }
    }

    public Set<User> mutualFriends(User user) {
        Set<User> mutual = new HashSet<>();
        boolean verify = verifyUser(user);
        if(!verify) return mutual;
        mutual.addAll(friends);

        boolean mutualVerify = mutual.retainAll(user.getFriends());

        if (!mutualVerify) {
            IO.println("It was not possible to reconnect with mutual friends.");
        }
        return mutual;
    }

    private boolean verifyUser(User... user) {
        if (user == null) {
            IO.println("Invalid value");
            return false;
        }

        if (user.length == 0) {
            IO.println("Invalid size");
            return false;
        }

        for (User u : user) {
            if (u == null) {
                IO.println("Invalid value");
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(friends, user.friends);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

