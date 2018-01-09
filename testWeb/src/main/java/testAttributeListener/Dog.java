package testAttributeListener;

/**
 * Created by wuqiong6 on 2017/12/6.
 */
public class Dog {
    String name;

    Integer age;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public Integer getAge() {
        return age;
    }
}
