import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
 HashMap 주요 메서드 정리

 (1) put(key, value)       : 키-값 쌍 추가 (중복 키 입력 시 기존 값 덮어씀)
 (2) get(key)              : 키에 해당하는 값 반환 (없으면 null 반환)
 (3) containsKey(key)      : 해당 키 존재 여부 확인 (true/false)
 (4) containsValue(value)  : 해당 값 존재 여부 확인 (true/false)
 (5) remove(key)           : 해당 키-값 쌍 삭제
 (6) size()                : 현재 저장된 키-값 쌍 개수 반환
 (7) isEmpty()             : 맵이 비어있는지 확인
 (8) clear()               : 모든 키-값 쌍 제거
 (9) keySet()              : 모든 키를 Set 형태로 반환
 (10) values()             : 모든 값을 Collection 형태로 반환
 (11) entrySet()           : 모든 키-값 쌍을 Set<Map.Entry<K,V>> 형태로 반환
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        HashMap<String,Integer> map1=new HashMap<>();
        HashMap<Integer,String> map2=new HashMap<>();
        

        for(int i=0;i<n;i++) {
            String name=br.readLine();
            map1.put(name, i+1);
            map2.put(i+1,name);
        }

        for(int i=0;i<m;i++){
            String str=br.readLine();
            if(str.charAt(0)>='0'&&str.charAt(0)<='9') System.out.println(map2.get(Integer.parseInt(str)));
            else System.out.println(map1.get(str));
        }

    }
}