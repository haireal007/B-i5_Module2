package AccessmodifierStudent;

public class TestStudent {
    public static void main(String[] args) {
        Student student=new Student();
        student.setClasses("C033");
        student.setName("hai");
        System.out.println("Họ tên: " +student.getName()+" lớp: " + student.getClasses());
    }
}
