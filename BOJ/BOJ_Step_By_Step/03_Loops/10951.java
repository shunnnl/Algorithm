import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 - EOF 판별 -> (str=br.readLine())!=null
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;

        while((str=br.readLine())!=null){
            st=new StringTokenizer(str);
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            System.out.println(a+b);
        }
    }
}
