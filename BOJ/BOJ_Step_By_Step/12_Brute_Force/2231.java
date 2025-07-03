import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int success=0;

        for(int i=n-9*Integer.toString(n).length();i<=n;i++){
            int sum=i;
            for(int j=0;j<Integer.toString(i).length();j++){
                sum+=Integer.toString(i).charAt(j)-'0';
            }
            if(sum==n) {
                System.out.println(i);
                success=1;
                break;
            }
        }
        if(success==0)System.out.println(0);

    }
}