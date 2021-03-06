public class App {
  public static void main(String[] args) {
    
    StudentDao studentDao = new StudentDaoImpl();
    
    //print all students
    for (Student student : studentDao.getAllStudents()) {
      System.out.println("Student: [IdNo : " + student.getId() + ", Name : " + student.getName() + " ]");
    }
    
    /*
    //update student
    Student student =studentDao.getAllStudents().get(0);
    student.setName("Michael");
    studentDao.updateStudent(student);
    
    //get the student
    studentDao.getStudent(0);
    System.out.println("Student: [IdNo : " + student.getId() + ", Name : " + student.getName() + " ]");
    */
  }
}
