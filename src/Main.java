    import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Student[] students = new Student[3];
            students[0] = new Student("Столыпин Александр Викторович",2023,"Лодочная 10-2","89279564052",2, "Филологический");
            students[1] = new Student("Семёнов Владимир Алексеевич",2023,"Проектирумая, 17","89371349193", 2,"Инженерный");
            students[2] = new Student("Жмышенко Валерий Альбертович",2024,"Комсомольская, 111А","89471131724",1, "Филологический");
            FIO(students);
            Facl(students);
            Receipt(students);
        }
        public static void FIO(Student[] students){
            System.out.println("Список студентов: ");
            for (Student student : students) {
                System.out.println(student.getFullNAME());
            }
        }
        public static void Facl(Student[] students){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите название факультета: ");
            String facult = in.next();
            System.out.printf("В %s факультет входят:\n", facult);
            for (Student student : students) {
                if (facult.equalsIgnoreCase(student.getFaculty())) {
                    System.out.println(student.getFullNAME());
                }
            }
        }
        public static void Receipt(Student[] students){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите год: ");
            int year = in.nextInt();
            System.out.printf("Студенты, поступившие после %d года:\n",year);
            for (Student student : students) {
                if (student.getReceiptDate() > year) {
                    System.out.println(student.getFullNAME() + " - " + student.getReceiptDate());
                }
            }
        }
    }
    class Student{
        private String fullNAME;
        private int receiptDate;
        private String address;
        private String phone;
        private int course;
        private String faculty;
        public Student(String fullNAME,int receiptDate, String address, String phone,int course,String faculty){
            this.fullNAME = fullNAME;
            this.receiptDate = receiptDate;
            this.address = address;
            this.phone = phone;
            this.course = course;
            this.faculty = faculty;
        }
        public String getFullNAME(){return this.fullNAME;}
        public void setFullNAME(String fullNAME){this.fullNAME = fullNAME;}
        public int getReceiptDate(){return this.receiptDate;}//добавил геттер даты поступления, так как без него выполнение задания невозможно.
        public void setReceiptDate(int receiptDate){this.receiptDate = receiptDate;}
        public String getAddress(){return this.address;}
        public String getPhone(){return this.phone;}
        public void setPhone(String phone){this.phone = phone;}
        public void setCourse(int course){this.course = course;}
        public String getFaculty(){return this.faculty;}

    }
