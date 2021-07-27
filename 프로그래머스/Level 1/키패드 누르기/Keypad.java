class Keypad {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftIndex = 10;
        int rightIndex = 12;

        for (int number : numbers) {
            if (number == 0) {
                number = 11;
            }
            if (number % 3 == 1) {
                answer += "L";
                leftIndex = number;
            } else if (number % 3 == 0) {
                answer += "R";
                rightIndex = number;
            }
            else {
                int leftDistance = (Math.abs(leftIndex - number) % 3) + (Math.abs(leftIndex - number) / 3);
                int rightDistance = (Math.abs(rightIndex - number) % 3) + (Math.abs(rightIndex - number) / 3);
                if (leftDistance < rightDistance) {
                    answer += 'L';
                    leftIndex = number;
                }
                else if (leftDistance > rightDistance) {
                    answer += 'R';
                    rightIndex = number;
                }
                else {
                    if (hand.equals("right")) {
                        answer += 'R';
                        rightIndex = number;
                    }
                    else {
                        answer += 'L';
                        leftIndex = number;
                    }
                }
            }
        }

        return answer;
    }
}
