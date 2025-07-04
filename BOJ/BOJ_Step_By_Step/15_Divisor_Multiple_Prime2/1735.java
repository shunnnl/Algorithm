import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 - 유클리드 호제법을 이용한 최대공약수(GCD) 계산
   gcd(a, b) = gcd(b, a % b) 를 반복하여 b가 0이 될 때까지 재귀
   최종적으로 b가 0이 되면, a가 최대공약수
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();
        long a1=Integer.parseInt(st.nextToken());
        long b1=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        long a2=Integer.parseInt(st.nextToken());
        long b2=Integer.parseInt(st.nextToken());
        long max=0;
        long min=0;

        if(b1>b2) max=gcd(b1,b2);
        else max=gcd(b2,b1);
        min=b2*b1/max;
        long divisor=(min/b1*a1)+(min/b2*a2);
    

        if(divisor>min) max=gcd(divisor,min);
        else max=gcd(min,divisor);
        sb.append(divisor/max).append(" ").append(min/max);
        System.out.println(sb);

    }

    public static long gcd(long a,long b){
        if(b==0) return a;

        return gcd(b,a%b);
    }
}