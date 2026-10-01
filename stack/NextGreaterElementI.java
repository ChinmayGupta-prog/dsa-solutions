import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> visit = new Stack<>();
        Map<Integer,Integer> nextGreater = new HashMap<>();
        for(int num: nums2){
            while(!visit.empty()&&visit.peek()<num){
                nextGreater.put(visit.pop(),num);
            }
            visit.push(num);
        }
        int res[] = new int[nums1.length];
        for(int i=0;i<res.length;i++){
            res[i] = nextGreater.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}
