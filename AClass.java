package MockTesting;

import jdk.internal.org.objectweb.asm.tree.analysis.SourceValue;

import java.util.ArrayList;

public class AClass {


    private String className;
    private ArrayList<Student> students;
    private int classLength;
    AClass(String classNameIn, ArrayList<Student> studentsIn, int classLengthIn)
    {
className = classNameIn;
students=studentsIn;
setClassLength(classLengthIn);
    }
boolean addStudent(Student in)
{
    boolean added = students.add(in);
    return added;
}

boolean removeStudent(Student in)
{
    boolean added = students.remove(in);
    return added;
}

String getClassName()
{
    return className;
}

ArrayList<Student>getstudents()
{
    return students;
}

int getClassLength()
{
    return classLength;
}
    private void setClassLength(int weeksOfClass)
    {
        if(weeksOfClass== 3 || weeksOfClass==4 || weeksOfClass==8 || weeksOfClass == 12)
        {
            classLength = weeksOfClass;
        }
    }

    public SourceValue getStudents() {
        return null;
    }
}
