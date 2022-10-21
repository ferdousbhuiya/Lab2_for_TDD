package MockTesting;

import java.util.HashMap;

public class CostCalc {

    private HashMap<Student, Integer> cost;

    public HashMap<Student, Integer> calcCost(AClass aClass)
    {
        HashMap<Student, Integer> costs = new HashMap<Student, Integer>();
        for(int i=0; aClass.getStudents().size>i; i++)
        {
           Student stu = aClass.getstudents().get(i);
           int cost = weeksCost(aClass.getClassLength());
           cost += residentCost(cost, stu.getStateRes());
           cost -= yearsDiscount(stu.getYearsStudent());
           cost -= classSizeDiscount(aClass.getstudents().size(), cost);
           costs.put(stu,cost);
        }
        return cost;
    }
    public int yearsDiscount(int yearsAttended) {
        int discount = yearsAttended*50;
        return discount;
    }
    int weeksCost(int weeks) {
        int cost = 0;
        switch (weeks) {
            case 3:
                cost = 500;
                break;
            case 4:
                cost = 700;
                break;
            case 6:
                cost = 1100;
                break;
            case 8:
                cost = 1500;
                break;
            case 12:
                cost = 2000;
                break;
        }
        return cost;
    }

    public double classSizeDiscount(int classSize, int cost) {
        double discountNum = 0;
        double discount = 0;
        if(classSize>20)
        {
            classSize-=20;
            for(int i=0; classSize>i; i++)
            {
                discountNum+=0.02;
            }
            discount = (cost*discountNum);
        }
        return discount;
    }

    public int residentCost(int currentCost, boolean stateRes) {
        int additional =0;
        if( !stateRes)
        {
            additional = (int) (currentCost*0.1);

        }
        return additional;
    }
}

