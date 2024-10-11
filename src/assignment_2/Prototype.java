package assignment_2;

import java.util.ArrayList;
import java.util.List;

interface Prototype extends Cloneable {
    Prototype clone();
}

class Employee implements Prototype {
    private String name;
    private String position;
    private List<String> skills;

    public Employee(String name, String position, List<String> skills) {
        this.name = name;
        this.position = position;
        this.skills = new ArrayList<>(skills);
    }

    @Override
    public Employee clone() {
        try {
            Employee cloned = (Employee) super.clone();
            cloned.skills = new ArrayList<>(this.skills);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", skills=" + skills +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}

class PrototypePatternDemo {
    public static void main(String[] args) {
        List<String> skills = new ArrayList<>();
        skills.add("Java");
        skills.add("Problem Solving");
        Employee employee1 = new Employee("Daniil Naumenko", "Software Engineer", skills);

        Employee employee2 = employee1.clone();
        // cloning,...
        employee2.setName("Abylay Slamzhanov");
        employee2.setPosition("Senior Software Engineer");
        employee2.addSkill("Team Leadership");
        // ragmbamboo,skibidi
        System.out.println(employee2);
        System.out.println(employee1);



    }
}
