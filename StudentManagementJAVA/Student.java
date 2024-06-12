public class Student{
    private String name;
    private int age;
    private String course;
    private int id;

    public Student(String name, int age, String course, int id){
        this.name = name;
        this.age = age;
        this.course = course;
        this.id = id;
    }


    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    } 
    public String getCourse(){
        return course;
    }
    public int getId(){
        return id;
    } 
}