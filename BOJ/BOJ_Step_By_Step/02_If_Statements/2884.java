import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int H=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        if(M>=45) M-=45;
        else{
            if(H==0) H=23;
            else H-=1;
            M+=15;
        }

        System.out.println(H + " " + M);
    }
}