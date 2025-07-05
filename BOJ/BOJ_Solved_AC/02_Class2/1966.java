import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
 - Queue처럼 사용하면서도 get(i)로 우선순위 비교가 필요하므로
 - List 기능이 포함된 LinkedList를 사용
 - (Queue/Deque 인터페이스는 get(index) 미지원)
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<t;i++){
            st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken()); // 문서의 개수
            int m=Integer.parseInt(st.nextToken()); // 몇번쨰로 인쇄돼었는지 궁금한 문서

            LinkedList <int[]>deque=new LinkedList<>();
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                deque.offer(new int[]{j,Integer.parseInt(st.nextToken())});
            }

            int cnt=1;
            loop:while(!deque.isEmpty()){
                int[] front=deque.poll();
                boolean success=true;

                for(int j=0;j<deque.size();j++){
                    if(front[1]<deque.get(j)[1]){
                        success=false;
                        break;
                    }
                }

                if(!success){
                    deque.offer(front);
                }else{
                     if(front[0]==m){
                       sb.append(cnt).append("\n");
                        break loop;
                    }else{
                        cnt++;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}