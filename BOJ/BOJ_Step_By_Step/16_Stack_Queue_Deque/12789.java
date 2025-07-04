import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Stack<Integer> stack=new Stack<>();
        int num=1; // 번호표
        boolean success=true;

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int order=Integer.parseInt(st.nextToken());
            if(order!=num) {
                while(!stack.isEmpty() && stack.peek()==num) {
                    stack.pop();
                    num++;
                }
                stack.push(order);
            }
            else num++;
        }


        while(!stack.isEmpty()){
            if(stack.pop()==num) num++;
            else {
                success=false;
                break;
            }
        }
        System.out.println(success?"Nice":"Sad");
    }
}