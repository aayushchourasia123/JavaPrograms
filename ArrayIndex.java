class demo
{
    public int findIndex(int nums[], int value)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==value)
            {
               return i;    // Element found, return its index
            }
        }
        return-1;           // Element not found in the array
    }
}
public class ArrayIndex {
    
    public static void main(String[] args) {
        int nums[]= {4,5,6,3,9,8};
        int value=4; //element for which index to be found
        demo obj= new demo();
        int result=obj.findIndex(nums, value);
        if(result!=-1)                              // Check if the element was found and print the result
        {
            System.out.println("index of "+value+" is "+result);

        }
        else{
            System.out.println("index of "+value+" is not found");
        }

        }
    }