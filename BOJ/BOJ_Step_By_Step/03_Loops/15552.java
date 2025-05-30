import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 - BufferedWriter: 버퍼를 사용해 시간적인 측면에서 빠르게 출력 가능
 - bw.write(): 출력할 문자열을 버퍼에 저장 (즉시 출력 아님)
 - bw.flush(): 출력 마지막에 한 번만 호출하여 실제 출력
*/
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());

        for(int i=1;i<=n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
        }
        bw.flush();
    }
}
