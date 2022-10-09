package Comparable;

public class Worker implements Comparable<Worker> {
    int id;
    String name;
    String surname;
    int Salary;

    public Worker(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    @Override
    public int compareTo(Worker o) {
        return this.name.compareTo(o.name);
    }
}
