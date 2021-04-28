
public class Secondsum {
	
public static void main(String[] args) {
		
		int input[] = {5,3,4,2,6,8,1};
		
		int target = 11;
		
		int[] indices = checkSecondSum1(input, target);
		
		if (indices.length == 2) {
            System.out.println(indices[0] + "\n" + indices[1]);
            
        } else {
        	System.out.println("Not found");        }
	}

	private static int[] checkSecondSum1(int[] input, int target) {
		
	return null;
}

	// this is brute force solution with time complexity O(n2)
	@SuppressWarnings("unused")
	private static int[] checkSecondSum(int[] input, int target) {
		
		for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
		
		return null;
	}

private static int[] checkTwoSum2(int[] nums, int target) {
    Map<Integer, Integer> numMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (numMap.containsKey(complement)) {
            return new int[] { numMap.get(complement), i };
        } else {
            numMap.put(nums[i], i);
        }
    }
    return new int[] {};
}

}	

