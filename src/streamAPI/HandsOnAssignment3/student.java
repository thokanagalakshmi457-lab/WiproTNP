package streamAPI.HandsOnAssignment3;

public class student {
	int rollNo;
    String name;
    int mark;
    public student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo +
                ", name=" + name +
                ", mark=" + mark + "]";
    }
}