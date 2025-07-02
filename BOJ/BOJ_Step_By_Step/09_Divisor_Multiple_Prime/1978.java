import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 - 에라토스테네스의 체: √N까지만 돌며 i*2부터 i의 배수를 소수가 아님으로 표시
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        boolean isNotPrimeArr[]=new boolean[1001];
        isNotPrimeArr[1]=true;

        for(int i=2;i<=Math.sqrt(1000);i++){
            if(!isNotPrimeArr[i]){
                for(int j=i*2;j<=1000;j+=i){
                    isNotPrimeArr[j]=true;
                }
            }
        }

        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int cnt=0;

        for(int i=0;i<n;i++){
            if(isNotPrimeArr[Integer.parseInt(st.nextToken())]==false)cnt++;
        }

        System.out.println(cnt);

    }
}