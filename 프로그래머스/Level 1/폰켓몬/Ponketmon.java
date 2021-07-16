import java.util.HashSet;
class Ponketmon {
    public int solution(int[] nums) {
        int answer = 0;
        int limit = nums.length / 2;
        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            hs.add(num);
        }

        answer = limit > hs.size() ? hs.size() : limit;

        return answer;
    }
}
