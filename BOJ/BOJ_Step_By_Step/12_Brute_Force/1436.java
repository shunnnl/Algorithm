import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 - str.isEmpty(): 문자열 비어있는지 유무
 - str1.compareTo(str2): 사전에 따른 str1, str2 비교(-1,0,1)
 - str.indexOf(char, int start), str.lastIndexOf(char, int start) : 문자열에서 문자 위치 찾기(*뒤에껀 마지막부터, start있으면 시작점 선정 가능)
 - str1.contains(str2): 문자열 안에 특정문자열 포함되었는지 유무
 - str.substring(int start, int end): 문자열 자르기
 - str.replace(str1, str2): 문자열 치환(str1을 찾아 모두 str2으로 변환)
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int cnt=0;
        int num=665;

        while(cnt!=n){
            num++;
            if(Integer.toString(num).contains("666")){
                cnt++;
            }
        }

        System.out.println(num);
    }
}