import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Deque;
import java.util.StringTokenizer;

/*
 Queue 주요 메서드 정리 (java.util.Queue 인터페이스 기준)

 (1) offer(value)     : 큐의 뒤에 요소 추가 (용량 초과 시 false 반환)
 (2) poll()           : 큐의 앞 요소 제거 및 반환 (비어 있으면 null 반환)
 (3) peek()           : 큐의 앞 요소 조회 (제거 X, 비어 있으면 null 반환)
 (4) isEmpty()        : 큐가 비어 있는지 여부 반환
 (5) size()           : 큐에 포함된 요소 개수 반환

 ※ Deque을 사용할 경우 뒤쪽 요소 접근도 가능

 (6) offerFirst(value): 큐의 앞(front)에 요소 추가
 (7) pollLast()       : 큐의 뒤(rear) 요소 제거 및 반환 (비어 있으면 null 반환)
 (8) peekLast()       : 큐의 뒤(rear) 요소 조회 (제거 X, 비어 있으면 null 반환)
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push")) {
                deque.offer(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop")) {
                sb.append(deque.isEmpty() ? -1 : deque.poll()).append("\n");
            } else if (command.equals("size")) {
                sb.append(deque.size()).append("\n");
            } else if (command.equals("empty")) {
                sb.append(deque.isEmpty() ? 1 : 0).append("\n");
            } else if (command.equals("front")) {
                sb.append(deque.isEmpty() ? -1 : deque.peek()).append("\n");
            } else if (command.equals("back")) {
                sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
            }
        }

        System.out.print(sb);
    }
}
