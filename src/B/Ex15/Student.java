package B.Ex15;

public class Student implements Comparable<Student>{
    private String name;
    private Integer age;

    public Student(String name,Integer age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", getName(), getAge());
    }


    @Override
    public int compareTo(Student o) {
        return getAge() - o.getAge();
    }
}
