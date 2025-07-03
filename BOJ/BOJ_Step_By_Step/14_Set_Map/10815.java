import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/*
 - Set 관련 주요 메서드 정리

 (1) set.add(value)      : 값 추가 (중복된 값은 무시됨)
 (2) set.remove(value)   : 특정 값 제거
 (3) set.contains(value) : 값 존재 여부 확인 (탐색 용도)
 (4) set.isEmpty()       : 비어 있는지 여부 확인
 (5) set.size()          : 현재 원소 개수 반환
 (6) set.clear()         : 모든 원소 제거 (초기화)
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());

        HashSet<Integer> set=new HashSet<>();

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) set.add(Integer.parseInt(st.nextToken()));

        int m=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++) sb.append(set.contains(Integer.parseInt(st.nextToken()))?1:0).append(" ");
        System.out.println(sb);
    }
}