import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int min=5000; // 봉지 최소 개수

        for(int i=n/5;i>=0;i--){ // 5킬로그램 봉지
            if((n-5*i)%3==0){
                min=Math.min(min,i+(n-5*i)/3);
            }
        }

        if(min==5000)System.out.println(-1);
        else System.out.println(min);
    }
}