class calc
{
    public int add(int num1, int num2)
    {
        int result = num1+num2;
        return result;
    }
    public int add(int num1, int num2, int num3)
    {
        int result =num1+num2+num3;
        return result;
    }
    public double add(double num1, double num2)
    {
        double result = num1+num2;
        return result;
    }
    
}
public class Method_Overloading {
    public static void main(String[] args) {
        calc obj= new calc();
        int result= obj.add(5, 3);
        int res1= obj.add(5, 3, 6);
        double res2= obj.add(4.5, 5.8);

        System.out.println(result);
        System.out.println(res1);
        System.out.println(res2);
        
    }
    
}