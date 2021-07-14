class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int stack[] = new int[900];
        int pointer = 0;

        for(int i=0; i<moves.length; i++) {
            for(int j=0; j<board.length; j++) {
                if(board[j][moves[i] - 1] != 0) {
                    if(stack[pointer] == board[j][moves[i]-1]) {
                        pointer -= 1;
                        answer += 2;
                    }
                    else {
                        pointer += 1;
                        stack[pointer] = board[j][moves[i]-1];
                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}