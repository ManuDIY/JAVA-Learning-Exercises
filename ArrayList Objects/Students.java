import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Students
{
    private ArrayList<Student> students;

    public Students()
    {
        students = new ArrayList<Student>();
    }

    public void readStudentData(String filename){
        String info;
        try{
            Scanner fileReader = new Scanner(new File(filename)); 
            Scanner lineReader;

            while(fileReader.hasNext()) {
                info = fileReader.nextLine();

                lineReader = new Scanner(info);
                lineReader.useDelimiter(",");

                String last = lineReader.next();
                String first = lineReader.next();
                int ID = lineReader.nextInt(); 
                double gpa = lineReader.nextDouble();                
                Student s = new Student(last, first, ID, gpa);

                students.add(s);          
            }

        }catch(FileNotFoundException error) {
            System.out.println("File not found ");

        }catch(IOException error){
            System.out.println("Oops!  Something went wrong.");

        }
    }

    public void printRoster()
    {
        for (Student s : students)
        {
            System.out.println(s.toString());
        }
    }

    public ArrayList<Student> probationList()
    {
        ArrayList<Student> probation = new ArrayList<Student>();

        for (Student s: students)
        {
            if (s.getGPA() < 2.0)
            {
                probation.add(s);
            }

        }
        return probation;
    }

    public Student findHighestGrade()
    {
        Student summa = students.get( 0 );

        for (Student s: students)
        {
            if (s.getGPA() > summa.getGPA())
            {
                summa = s;
            }
        }
        return summa;
    }

    private void openFile()
    {
        JFileChooser fc = new JFileChooser(new File(System.getProperty("user.dir")));
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int returnVAL = fc.showOpenDialog(null);
        
        if (returnVAL == JFileChooser.APPROVE_OPTION)
        {
            String filename = fc.getSelectedFile().getName();
            readStudentData(filename);
        }
    }
    
    public static void main()
    {
        Students gvsu = new Students();
        
        gvsu.openFile();
        
        System.out.println( "Course Roster" );
        gvsu.printRoster();
        
        System.out.println( "\r\nThe highest GPA is: ");
        System.out.println( gvsu.findHighestGrade());
        
        ArrayList<Student> p = gvsu.probationList();
        System.out.println( "\r\nThe Probation List (GPA < 2.0) " + p.size() + " students.");
        
        for (Student s:p)
        {
            System.out.println( s.toString() );
        }
    }
}
    
    
   