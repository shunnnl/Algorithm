import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 - toCharArray() : char[]으로 변환
 - charAt(index) : index의 값 반환
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        String B=br.readLine();
        char[] b = B.toCharArray();
        
        System.out.println(a*(b[2]-'0'));
        System.out.println(a*(b[1]-'0'));
        System.out.println(a*(b[0]-'0'));
        System.out.println(a*Integer.parseInt(B));
    }
}