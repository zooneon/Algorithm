import java.util.HashMap;
class NotFinishedPlayer {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> participantMap = new HashMap<>();

        for (String p : participant) {
            participantMap.put(p, participantMap.getOrDefault(p, 0) + 1);
        }
        for (String c : completion) {
            participantMap.put(c, participantMap.get(c) - 1);
        }
        for (HashMap.Entry<String, Integer> entry : participantMap.entrySet()) {
            if(entry.getValue() == 1) {
                answer = entry.getKey();
                break;
            }
        }

        return answer;
    }
}