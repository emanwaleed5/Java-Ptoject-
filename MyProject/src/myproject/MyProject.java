package myproject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class MyProject {
    public static void main(String[] args) {
        Scanner inputFromConcole = new Scanner(System.in);
        Course[] coursesArray = new Course[2];
        Course course1 = new Course(1, "JAva", 10);
        Course course2 = new Course(2, "HTML", 5);
        coursesArray[0] = course1;
        coursesArray[1] = course2;
        Student[] studentsArray = new Student[2];
        Student student1 = new Student(220200552, "Eman", coursesArray);
        Student student2 = new Student(220200551, "Nour", coursesArray);
        studentsArray[0] = student1;
        studentsArray[1] = student2;
        Admin[] adminsArray = new Admin[2];
        Admin admin1 = new Admin(220200554, "Roba");
        Admin admin2 = new Admin(220200555, "Yasmeen");
        adminsArray[0] = admin1;
        adminsArray[1] = admin2;
        Exam[] examsArray = new Exam[2];
        Exam exam1 = new Exam(202, true, 1000);
        Exam exam2 = new Exam(303, true, 500000);
        examsArray[0] = exam1;
        examsArray[1] = exam2;
        Question[] questionArray = new Question[2];
        Question question1 = new Question(2020, 1, "Multiple choice", "D", 5);
        Question question2 = new Question(2020, 2, "Multiple choice", "C", 3);
//        ArrayList<Question> questionArray=new ArrayList<>();
//        questionArray.add(question1);
//        questionArray.add(question2);
        questionArray[0] = question1;
        questionArray[1] = question2;
        ArrayList<Double> mark = new ArrayList<>();
        System.out.print("Enter your ID : ");
        int idFromConcole = inputFromConcole.nextInt();
        System.out.print("Enter your password : ");
        String passFromConcole = inputFromConcole.next();
        for (Student elementStudent : studentsArray) {
            if (idFromConcole == elementStudent.getStudentId() && passFromConcole.equals(elementStudent.getStudentPassword())) {
                printCoursesArray(coursesArray);
                System.out.print("Select number of course: ");
                int selectCourse = inputFromConcole.nextInt();
                if (examsArray[selectCourse - 1].isExamActive()) {
                    long startTime = System.currentTimeMillis();
                    try {
                        String fileName = "exam" + selectCourse;
                        File file = new File(fileName);
                        Scanner input = new Scanner(file);
                        while (input.hasNext()) {
                            String s = input.next();
                            if (s.contains("?") || s.contains(".")) {
                                System.out.println(s);
                            } else {
                                System.out.print(s);
                            }
                        }
                    } catch (FileNotFoundException ex) {
                        System.out.println("File can't be opend");
                    }
                    int i = 0;
                    do {
                        System.out.println("Answer of the following question: ");

                        for (Question elementQuestion : questionArray) {
                            String answer = inputFromConcole.next();
                            double mark_ = 0;
                            //System.out.println("Q"+  elementQuestion.getQuestionAnswer()+" A"+answer);
                            //Boolean x = (answer  == elementQuestion.getCorrectAnswer() + "");
                            if (answer.equals(elementQuestion.getQuestionAnswer())) {
                                mark_ = elementQuestion.getQuestionmark();
                            }
                            mark.add(mark_);
                        }
                        i++;
                    } 
                    while (examsArray[selectCourse - 1].getExamPeriod() > (startTime / Math.pow(10, 6)) && i < questionArray.length);
                    double totalMarks = 0;
                    for(int e=0;e<mark.size();e++){
                        totalMarks += mark.get(e);
                    }
                    
                    System.out.println(totalMarks + " " + elementStudent.getStudentId());
                    
                    
                    MarksFile.write(elementStudent.getStudentId() + ":" + totalMarks , "examAnswers" + selectCourse);
                    // Open file with name examAnswers1
                    // write into fille StudentId-Mark
                }
                break;
            }
        }
        for (Admin e : adminsArray) {
            if (idFromConcole == e.getAdminId() && passFromConcole.equals(e.getAdminPassword())) {
                printCoursesArray(coursesArray);
                System.out.print("Select number of course: ");
                int selectCourse = inputFromConcole.nextInt();
                System.out.print("If you want to show grades press 1 , If you want to add question press 2: ");
                int choose = inputFromConcole.nextInt();
                if (choose == 1) {
                    MarksFile.print("examAnswers" + selectCourse);
                } else if (choose == 2) {
                    System.out.print("Enter question: ");
                    String newQuestion = inputFromConcole.next();
                }
                break;
            }
        }
    }
    public static void printCoursesArray(Course[] coursesArray) {
        int i = 1;
        for (Course e : coursesArray) {
            System.out.println(i + "." + e.getCourseName());
            i++;
        }
    }
}
