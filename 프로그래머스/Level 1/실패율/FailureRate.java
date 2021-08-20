import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class RateData implements Comparable<RateData> {

    private int index;
    private double rate;

    public RateData(int index, double rate) {
        this.index = index;
        this.rate = rate;
    }

    public int getIndex() {
        return index;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public int compareTo(RateData o) {
        //실패율이 같은 경우 작은 인덱스가 먼저
        if (rate == o.getRate()) {
            return index > o.getIndex() ? 1 : -1;
        } else {
            return rate > o.getRate() ? -1 : 1;
        }
    }
}

public class FailureRate {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        List<RateData> rateDataList = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            int challenge = 0;
            int failure = 0;
            for (int j = 0; j < stages.length; j++) {
                //스테이지에 도전한 사용자 수
                if (stages[j] >= i) {
                    challenge += 1;
                }
                //스테이지에 실패한 사용자 수
                if (stages[j] == i) {
                    failure += 1;
                }
            }
            //스테이지에 도전한 사용자가 없을 경우 실패율은 0.0
            if (challenge == 0) {
                rateDataList.add(new RateData(i, 0.0));
            } else {
                rateDataList.add(new RateData(i, (double) failure / challenge));
            }
        }
        //실패율 순서대로 정렬
        Collections.sort(rateDataList);

        for (int i = 0; i < N; i++) {
            answer[i] = rateDataList.get(i).getIndex();
        }

        return answer;
    }
}
