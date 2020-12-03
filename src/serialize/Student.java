package serialize;

import java.io.Serializable;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-02
 */
public class Student implements Serializable {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
