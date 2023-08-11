public class Student extends Exception {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        if (age<-100 || age>0){
            System.out.println(age);
        }else {
            System.out.println("tuura emes jash");
        }
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<-100 || age>0){
            System.out.println(age);
        }else {
            System.out.println("tuura emes jash");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}