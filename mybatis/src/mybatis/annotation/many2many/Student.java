package mybatis.annotation.many2many;

import java.util.List;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-03-12 11:08:44
 **/
public class Student {
    private int id;
    private int age;
    private String name;
    private String gender;
    private String address;

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }

    private List<Mark> marks;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
