import java.util.*;

class Demo {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		List<Integer> ans=fun(arr);
		System.out.println("ONTPUT :"+ans);
	}
       	static List<Integer> fun(int[] nums) {
            List<Integer> result = new ArrayList<>();
	    for (int i = 0; i < nums.length; i++) {
		    int index = Math.abs(nums[i]) - 1;
		    if (nums[index] < 0) {
			    result.add(Math.abs(nums[i]));
		    } else { 
			    nums[index] = -nums[index];
		    } 
	    } 
	    for (int i = 0; i < nums.length; i++) { 
		    nums[i] = Math.abs(nums[i]); 
	    } 
	    return result;
	}
}
