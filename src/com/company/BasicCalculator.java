package com.company;

//TODO Notes, Add to main?, upload to Git
public class BasicCalculator
{
    public static int calculator(int num1, char operator, int num2)
    {
        int Total;
        if (operator == '*')
        {
            Total = num1 * num2;
            return Total;
        }
        if (operator == '+')
        {
            Total = num1 + num2;
            return Total;
        }
        if (operator == '-')
        {
            Total = num1 - num2;
            return Total;
        }
        if (operator == '/' && num2 != 0)
        {
            Total = num1 / num2;
            return Total;
        }
            else return 0;
    }
}
