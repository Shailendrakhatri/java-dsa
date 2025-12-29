public class OOPS {
    public static void main(String args[]) {
//        Pen p1 = new Pen();
//        p1.setColor("bule");
//        System.out.println(p1.getColor());
//        p1.setTip(5);
//        System.out.println(p1.gettip());
//
//        BankAccount myAcc = new BankAccount();
//        myAcc.username = "professor";
//        myAcc.Setpassword("hello");


        Student s1= new Student();
        s1.name = "professor";
        s1.roll = 345;
        s1.password = "hello" ;
        s1.marks[0]= 100;
        s1.marks[1]= 90;
        s1.marks[2]= 98;
        Student s2 = new Student (s1);
        s2.password= "xyz";
        s1.marks[2] = 100;
        for(int i = 0; i<3;i++){
            System.out.println(s2.marks[i]);
        }



    }
}

//    class BankAccount{
//        public String username;
//        private String password;
//        public void Setpassword(String PWD){
//            password= PWD;
//        }
//    }
//    class Pen {
//        private String color;
//        private int tip;
//        String getColor(){
//            return this.color;
//
//        }
//        void setColor(String newcolor) {
//            this.color = newcolor;
//        }
//        int gettip(){
//            return  this.tip;
//        }
//        void setTip(int newTip) {
//            this.tip = newTip;
//        }
//    }
//
//    class Student {
//        String name;
//        int age;
//        float percentage;
//
//        void calpercentage(int phy, int chem, int maths) {
//            percentage = (phy + chem + maths) / 3;
//
//        }
//    }
    class Student {
    String name ;
    int roll;
    String password;
    int marks[];

    Student(){

        System.out.println("constructor is called:");

    }
    Student(int roll){
        marks  = new int [3];
        this.roll=roll;

    }
    Student(String name){
        marks  = new int [3];
        this.name= name;
    }
    //shallow copy constructor
//    Student ( Student s1) {
//        marks  = new int [3];
//        this.name= s1.name;
//        this.roll = s1.roll;
//        this.marks = s1.marks;
//    }
    //deep copy cnstructor
    Student (Student s1){
        marks  = new int [3];
        this.name= s1.name;
        this.roll = s1.roll;
        for (int i= 0;i< marks.length;i++){
            this.marks[i]= s1.marks[i];


        }
    }
}
