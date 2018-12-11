import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Student {

    private String name;
    private String surname;
    private String group;
    private int age;

    public Student() {
    }

    public Student(String name, String surname, String group, int age) {

        this.name = name;
        this.surname = surname;
        this.group = group;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public JSONObject serialize() {

        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("surname", surname);
        json.put("group", group);
        json.put("age", age);
        return json;

    }

    public static Student deserialize(JSONObject json) {

        Student student = new Student(
            (String) json.get("name"),
            (String) json.get("surname"),
            (String) json.get("group"),
            (Integer) json.get("age")
        );

        return student;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nSurname: " + surname + "\nGroup: " + group + "\nAge: " + age;
    }
}
