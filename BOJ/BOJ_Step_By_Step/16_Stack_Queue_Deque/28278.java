import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/*
 Stack 주요 메서드 정리

 (1) push(value)   : 스택 맨 위에 값 추가
 (2) pop()         : 스택 맨 위 값을 제거하고 반환
                    → 비어 있으면 EmptyStackException 발생
 (3) peek()        : 스택 맨 위 값을 제거하지 않고 조회
                    → 비어 있으면 EmptyStackException 발생
 (4) isEmpty()     : 스택이 비어 있으면 true 반환
                    → pop(), peek() 호출 전에 반드시 체크!
 (5) size()        : 현재 스택에 저장된 원소 개수 반환
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st;

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int num=Integer.parseInt(st.nextToken());
            if(num==1){
                stack.push(Integer.parseInt(st.nextToken()));
            }else if(num==2){
                if(stack.isEmpty())System.out.println(-1);
                else System.out.println(stack.pop()); 
            }else if(num==3){
                System.out.println(stack.size());
            }else if(num==4){
                System.out.println(stack.isEmpty()?1:0);
            }else{
                if(stack.isEmpty())System.out.println(-1);
                else System.out.println(stack.peek());
            }
        }
    }
}