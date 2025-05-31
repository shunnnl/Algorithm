import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 - trim(): 문자열 앞뒤의 공백을 제거합니다. (중간 공백은 제거하지 않음)
 - split(" "): 문자열을 구분자로 잘라 배열로 반환합니다.
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine().trim();

        String[] arr=str.split(" ");

        if(str.equals(""))System.out.println(0);
        else System.out.println(arr.length);
    }
}