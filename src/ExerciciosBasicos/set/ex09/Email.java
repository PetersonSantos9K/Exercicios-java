package ExerciciosBasicos.set.ex09;

import java.util.Objects;

public record Email(String email) implements Comparable<Email>{

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Email email1 = (Email) o;
        return Objects.equals(email, email1.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }

    @Override
    public int compareTo(Email o) {
        return email.compareTo(o.email);
    }
}
