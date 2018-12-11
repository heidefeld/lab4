import org.json.simple.JSONObject;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Иван");
        student.setSurname("Петров");
        student.setGroup("НАИ-166");
        student.setAge(20);


        JSONObject student_json = student.serialize();
        System.out.println("Сериализация:");
        System.out.println(student_json);

        System.out.println("Десериализация:");
        Student student2 = Student.deserialize(student_json);
        System.out.println(student2);


    }
}
