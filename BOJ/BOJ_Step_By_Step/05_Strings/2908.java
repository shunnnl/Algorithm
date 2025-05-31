import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 - StringBuilder 주요 메서드 정리

 (1) .append(String str or int i)
      → 문자열 또는 숫자를 이어 붙입니다.
      예: sb.append("abc"), sb.append(123)

 (2) .insert(int offset, String str)
      → 지정한 위치(offset)에 문자열을 삽입합니다.
      예: sb.insert(2, "ccc")  // 2번째 인덱스에 "ccc" 삽입

 (3) .replace(int start, int end, String str)
      → start부터 end-1까지의 문자를 str로 대체합니다.
      예: sb.replace(3, 6, "ye")

 (4) .substring(int start) / .substring(int start, int end)
      → 문자열의 일부를 잘라 반환합니다.
      예: sb.substring(5), sb.substring(3, 7)

 (5) .deleteCharAt(int index)
      → 지정한 인덱스의 문자 하나를 삭제합니다.
      예: sb.deleteCharAt(3)

 (6) .delete(int start, int end)
      → start부터 end-1까지의 문자열을 삭제합니다.
      예: sb.delete(3, sb.length())

 (7) .toString()
      → StringBuilder 객체를 문자열(String)로 변환합니다.
      예: sb.toString()

 (8) .reverse()
      → 문자열 전체를 뒤집습니다.
      예: sb.reverse()

 (9) .setCharAt(int index, char ch)
      → 지정한 인덱스의 문자를 ch로 변경합니다.
      예: sb.setCharAt(2, 'X')

 (10) .setLength(int newLength)
      → 문자열의 길이를 조정합니다.
      → 늘리면 빈 공간은 '\u0000'(널 문자)로 채워지고, 줄이면 뒷부분이 잘립니다.
      예: sb.setLength(5)

 (11) .trimToSize()
      → 내부 char[] 배열의 크기를 현재 문자열 길이에 맞게 줄입니다.
      → 메모리 최적화용 (공백 문자 제거 아님)
      예: sb.trimToSize()
 */

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int a=Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int b=Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        if(a>b)System.out.println(a);
        else System.out.println(b);

    }
}