import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.*;

/*
 (1) set → array : set.toArray(new Type[0])
     - ex) String[] arr = set.toArray(new String[0]);
     - 제네릭 타입 유지를 위해 new String[0] 사용 (컴파일 타임에 타입 안정성 확보)

 (2) array → set : new HashSet<>(Arrays.asList(arr))
     * Arrays.asList(arr)
     - 배열을 List로 변환하는 메서드 (고정 크기 리스트 반환)
     - List의 크기를 변경하는 add/remove는 불가능
     - 기본형 배열(int[], double[])은 원소 1개짜리 List로 변환되므로 주의 필요 -> Wrapper Class 사용해야함
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st;
        HashSet<String> set=new HashSet<>();

        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            String name=st.nextToken();
            if(st.nextToken().equals("enter")) set.add(name);
            else set.remove(name);
        }
        String[] arr=set.toArray(new String[0]);
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)System.out.println(arr[i]);
    }
}