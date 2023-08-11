import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        /**
         *  byte Byte
         *  short Short
         *  int Int
         *  long Long
         *  float Float
         *  double Double
         *  boolean Boolean
         *  char Char
         *
         *  int [] arr = new int []{}
         */
//
//        ArrayList<Integer> arraylist = new ArrayList<>();
//        arraylist.add(10);
//        arraylist.add(15);
//        arraylist.add(20);
//        System.out.println(arraylist.get(1));
//        for (int i = 0; i < arraylist.size(); i++) {
//            System.out.println(arraylist.add(i));
//        }

      try {
          Student student = new Student("Begimai", 16);
          Student student1 = new Student("Aidai", 18);
          Student student2 = new Student("Aizirek", -19);
          ArrayList<Student> arrayList = new ArrayList<>();
          arrayList.add(student);
          arrayList.add(student1);
          arrayList.add(student2);
          for (Student student3 : arrayList) {
              System.out.println(student3);
          }

      }catch (Exception e){
          throw new Exception(e.getMessage());
      }finally {
          System.out.println("Buttu");
      }
    }
}