package src;
import java.util.*;
public class PriorityQueue_basics {
    static class Student  implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank ){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("Aman", 3));
        pq.add(new Student("Rohit", 1));
        pq.add(new Student("Satyam", 2));
         while(!pq.isEmpty()){
             System.out.println(pq.peek().name + " with rank " + pq.peek().rank);
             pq.remove();
         }
    }

}
