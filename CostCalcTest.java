package MockTesting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
//import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static sun.nio.cs.Surrogate.is;

class CostCalcTest {

    static Student stu1;
    static Student stu2;
    static Student stu3;
    static Student stu4;
    static Student stu5;
   static CostCalc calc;
   static ArrayList<Student> students= new ArrayList<Student>();
   static AClass aClass;

@BeforeAll
    static void setUp()
{
    stu1 = new Student("George Frank", 24,3, true);
    calc = new CostCalc();
    stu2 = new Student("Hue", 24,3, true);
    stu3 = new Student("James", 25,5, false);
    stu4 = new Student("Samuel", 22,1, true);
    stu5 = new Student("Kyle", 21,2, false);
    students.add(stu2);
    students.add(stu3);
    students.add(stu4);
    students.add(stu5);
    aClass = new AClass("science", students,12);



}
@Test
    void calcCostTest()
{
    assertThat(calc.calcCost(aClass).get(stu2), is(1850));
    assertThat(calc.calcCost(aClass).get(stu3), is(1950));
    assertThat(calc.calcCost(aClass).get(stu4), is(1950));
    assertThat(calc.calcCost(aClass).get(stu5), is(2100));

}

    private void assertThat(Integer integer, boolean b) {

    }

    @Test
    void weeksCostTest()
{
    int expected = 2000;
    int actual = calc.weeksCost(12);
    assertEquals(expected, actual);
}
@Test
    void residentTest()
{
    int expected = 70;
    int actual = calc.residentCost(700,false);
    assertEquals(expected, actual);
}
    @Test
    void yearsDisTest()
    {
        int expected = 150;
        int actual = calc.yearsDiscount(3);
        assertEquals(expected, actual);
    }
    @Test
    void classSizeDiscountTest()
    {
        double expected = 150;
        double actual = calc.classSizeDiscount(25, 1500);
        assertEquals(expected, actual);
    }

}


/*

TDD
Explaining TDD
https://juristr.com/blog/2010/10/test-driven-development-and-automated/
https://martinfowler.com/bliki/TestDrivenDevelopment.html
https://www.barbarianmeetscoding.com/blog/learning-test-driven-development-with-kent-beck

 TDD Metaphors
How to Explain TDD
https://medium.com/@dagmaraszkurat/how-i-explained-tdd-to-a-non-developer-friend-and-got-a-job-offer-over-tacos-b881895182c5
TDD Metaphor
https://juristr.com/blog/2010/10/test-driven-development-and-automated/


 */