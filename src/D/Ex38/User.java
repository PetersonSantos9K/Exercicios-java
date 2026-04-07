package D.Ex38;

import java.time.LocalDateTime;
import java.util.Objects;

public class User implements Comparable<User>{

    private final String name;
    private final LocalDateTime dateTime;

    public User(String name, String dateTime) {
        this.name = name;
        this.dateTime = LocalDateTime.parse(dateTime);
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(User o) {

        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
