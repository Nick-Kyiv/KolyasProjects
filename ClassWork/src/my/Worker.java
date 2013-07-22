package my;

import java.util.ArrayList;

public class Worker {
    private String name;
    private String secondName;
    private short age;
    private long salary;
    private String adress;
    private long[] salarys;
    private ArrayList<Worker> workers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public long[] getSalarys() {
        return salarys;
    }

    public void setSalarys(long[] salarys) {
        for (int i = 0; i < workers.size(); i++) {
            salarys[i] = getSalary();
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                "\n\tname='" + name + '\'' +
                "\n\tsecondName='" + secondName + '\'' +
                "\n\tadress='" + adress + '\'' +
                "\n\tsalary='" + salary + '\'' +
                "\n}";
    }
}
