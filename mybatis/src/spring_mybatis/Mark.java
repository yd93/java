package spring_mybatis;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-03-13 15:45:42
 **/
public class Mark {
    private int mark;
    private int year;
    private int sid;
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
