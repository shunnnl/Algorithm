import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/*
 - set1.addAll(set2)     : 합집합 → set1에 set2의 모든 요소 추가
 - set1.retainAll(set2)  : 교집합 → set1에 set2와 겹치는 요소만 남김
 - set1.removeAll(set2)  : 차집합 → set1에서 set2에 있는 요소 모두 제거
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());

        HashSet <Integer> set1=new HashSet<>();
        HashSet <Integer> set2=new HashSet<>();

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++) set1.add(Integer.parseInt(st.nextToken()));

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<b;i++) set2.add(Integer.parseInt(st.nextToken()));

        HashSet <Integer> copy=new HashSet<>(set1);
        set1.removeAll(set2);
        set2.removeAll(copy);
        set1.addAll(set2);
        System.out.println(set1.size());
    }
}