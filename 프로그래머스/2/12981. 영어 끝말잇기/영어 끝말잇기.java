class Solution {
    public int[] solution(int n, String[] words) {

        // words 배열을 앞에서부터 확인한다.
        // i는 현재 보고 있는 단어의 위치다.
        // 첫 번째 단어는 비교할 이전 단어가 없으니까 i = 1부터 시작
        for (int i = 1; i < words.length; i++) {

            // 바로 앞 사람이 말한 단어
            String beforeWord = words[i - 1];

            // 지금 사람이 말한 단어
            String nowWord = words[i];

            // 앞 단어의 마지막 글자
            char beforeLast = beforeWord.charAt(beforeWord.length() - 1);

            // 지금 단어의 첫 글자
            char nowFirst = nowWord.charAt(0);

            // 1. 끝말잇기가 안 이어지는 경우
            // 예: hello 다음에 apple
            // hello 마지막 글자는 o인데 apple 첫 글자는 a
            if (beforeLast != nowFirst) {

                // i % n + 1 : 몇 번 사람인지
                // i / n + 1 : 그 사람의 몇 번째 차례인지
                return new int[] { i % n + 1, i / n + 1 };
            }

            // 2. 이미 전에 나온 단어인지 확인
            // j는 지금 단어보다 앞에 있는 단어들을 하나씩 확인한다.
            for (int j = 0; j < i; j++) {

                // 지금 단어와 이전 단어가 같으면
                // 예: tank가 전에 나왔는데 또 tank를 말한 경우
                if (nowWord.equals(words[j])) {

                    // 탈락한 사람 번호와 차례 반환
                    return new int[] { i % n + 1, i / n + 1 };
                }
            }
        }

        // 끝까지 문제가 없으면 탈락자 없음
        return new int[] { 0, 0 };
    }
}