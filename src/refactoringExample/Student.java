/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoringExample;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 1795516
 */
public class Student extends Person {
    String studentId;
    
    public Student(String lastName, String firstName, Date dateBirth) {
        this.setLastName(lastName);
        this.setFirstName(firstName);
        this.setDateBirth(dateBirth);
        this.studentId = createStudentId(lastName, firstName, dateBirth);
    }
    
    public String createStudentId(String lName, String fName, Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        String end = cal.get(Calendar.YEAR) + "-" + cal.get(Calendar.MONTH);
        return lName.substring(0, 3) + getFirstName().charAt(0) + end;
    }
    

    public String getStudent_id() {
        return studentId;
    }

    public void setStudent_id(String student_id) {
        this.studentId = student_id;
    }

    public void study() {
        System.out.println("I study.");
    }    
    
}
