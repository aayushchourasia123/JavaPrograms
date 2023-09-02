class calc
{
    public int add(int num[])
    {
        int result=0;
        for(int n : num)
        {
            result=result+n;
        }
        return result;
    }
}
public class Anonymous_ArrayAddition {
    public static void main(String[] args) {
        
calc obj=new calc();
int result=obj.add(new int[]{5,3,4,7}); //anonymous array
System.out.println(result);
        
    }

}