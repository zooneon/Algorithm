import java.util.ArrayList;
class MockTest {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (first[i % 5] == answers[i]) {
                scores[0] += 1;
            }
            if (second[i % 8] == answers[i]) {
                scores[1] += 1;
            }
            if (third[i % 10] == answers[i]) {
                scores[2] += 1;
            }
        }

        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        ArrayList<Integer> answerList = new ArrayList<>();

        if (scores[0] == max) {
            answerList.add(1);
        }
        if (scores[1] == max) {
            answerList.add(2);
        }
        if (scores[2] == max) {
            answerList.add(3);
        }

        answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}