package student;

/**
 * Created by wuqiong6 on 2018/1/8.
 */
public class Student {
    private Integer flowId;

    private Integer type;

    private String idCard;

    private String examCard;

    private String location;

    private String studentName;

    private Integer grade;

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void setExamCard(String examCard) {
        this.examCard = examCard;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getFlowId() {

        return flowId;
    }

    public Integer getType() {
        return type;
    }

    public String getIdCard() {
        return idCard;
    }

    public String getExamCard() {
        return examCard;
    }

    public String getLocation() {
        return location;
    }

    public String getStudentName() {
        return studentName;
    }

    public Integer getGrade() {
        return grade;
    }

    public Student() {
    }

    public Student(Integer flowId, Integer type, String idCard, String examCard, String location, String studentName, Integer grade) {

        this.flowId = flowId;
        this.type = type;
        this.idCard = idCard;
        this.examCard = examCard;
        this.location = location;
        this.studentName = studentName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "flowId=" + flowId +
                ", type=" + type +
                ", idCard='" + idCard + '\'' +
                ", examCard='" + examCard + '\'' +
                ", location='" + location + '\'' +
                ", studentName='" + studentName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
