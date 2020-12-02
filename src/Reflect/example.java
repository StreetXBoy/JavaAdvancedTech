package Reflect;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-01
 */
public class example {
    int age;
    String name;
    String sex;

    public example(int age, String name, String sex, int id) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.id = id;
    }
    public example() {
        this.age = 1;
        this.name = "2";
        this.sex = "ggg";
        this.id = 11;
    }

    public example(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private  int id;

    public int getAge() {
        return age;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private void xprint(int s){
        System.out.println("sb :"+s);
    }
}
