public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private String lastname;

    public Student(int id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+lastname;
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }
}
