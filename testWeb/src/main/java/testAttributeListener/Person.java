package testAttributeListener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Created by wuqiong6 on 2017/12/6.
 */
public class Person implements HttpSessionBindingListener{

    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
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

    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("Attribute Person Bound: "+httpSessionBindingEvent.getName()+" "+httpSessionBindingEvent.getValue());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("Attributed Person Unbound: "+httpSessionBindingEvent.getName()+" "+httpSessionBindingEvent.getValue());
    }
}
