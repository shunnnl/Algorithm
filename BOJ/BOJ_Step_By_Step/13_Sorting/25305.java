import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

/*
 - Arrays.sort(): 기본 정렬 메서드
 - 내림차순 경우에는 Wrapper Class 사용만 가능(Primitive Type 불가능)
 - Collections.reverseOrder() 사용해서 내림차순 정렬
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        Integer arr[]=new Integer[n];

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)arr[i]=Integer.parseInt(st.nextToken());


        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(arr[k-1]);
    }
}