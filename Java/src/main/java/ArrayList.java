import java.util.*;

public class ArrayList {

    public static void main(String[] args) {

        List<Student> students = new java.util.ArrayList<>();
        students.add(new Student(1, "Aigerim"));
        students.add(new Student(2, "Mederbek"));
        students.add(new Student(3, "Bermet"));
        students.add(new Student(4, "Saniya"));
        students.add(new Student(5, "Zukhra"));

        //System.out.println(students);

        //for loop
//        for (int i=0; i<=students.size(); i++){
//            System.out.println(students.get(i));
//        }

        System.out.println("----------------------------");
        //Iterator - forward iteration
        Iterator iter = students.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("----------------------------");
        //Iterator - backward iteration
        Iterator iter1 = students.listIterator();
        while(((ListIterator<?>) iter1).hasPrevious()){
            System.out.println(((ListIterator<?>) iter1).previous());
        }
    //for each
        System.out.println("----------------------------");
        for (Student student:students){
            System.out.println(student);
        }

        System.out.println("----------------------------");

        //lambda
        students.forEach(student -> System.out.println(student));

        //sorting elements in the list
        System.out.println("----------------------------");
        Collections.sort(students, new sortById());
        System.out.println("sorted by id in descending order "+ students);


        System.out.println("----------------------------");
        Collections.sort(students, new sortByName());
        System.out.println(students);







    }

    static class sortById implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.id -o1.id;
        }
    }

    static class sortByName implements  Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}
