import java.util.*;

class DuplicateDemo {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int ans=fun(arr);
		System.out.println("ONTPUT :"+ans);
	}
       	static int fun(int[] nums) {
	       	/*Arrays.sort(nums);
		 *  int index=0; 
		 *  for(int i=0;i<nums.length-1;i++){ 
		 *  if(nums[i]==nums[i+1]){
		 *   index=i;
		 *    break;
		 *   } 
		 *   }
		 *  return nums[index];*/ 
		Set<Integer> seen = new HashSet<>();
	       	for (int num : nums) {
		       	if (seen.contains(num)) {
			       	return num; 
			}
		       	seen.add(num);
	       	}
		return -1;
	}
}
