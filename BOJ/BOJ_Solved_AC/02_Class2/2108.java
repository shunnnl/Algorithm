import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
 - Arrays.sort()  : 배열 전용 정렬 (int[], String[] 등)
 - Collections.sort() : List 전용 정렬 (ArrayList, LinkedList 등)
 → 내부 자료구조에 따라 정렬 메서드 선택 필요
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        int sum=0;
        int[] arr=new int[n];

        HashMap<Integer,Integer> map=new HashMap<>();

        int max=-4000;
        int min=4000;

        for(int i=0;i<n;i++){
            int num=Integer.parseInt(br.readLine());
            sum+=num;

            arr[i]=num;

            if(map.containsKey(num)) map.put(num,map.get(num)+1);
            else map.put(num,1);

            max=Math.max(max,num);
            min=Math.min(min,num);
        }

        System.out.println(Math.round(sum/(double)n)); //(1) 산술평균

        Arrays.sort(arr);
        System.out.println(arr[n/2]); //(2) 중앙값

        int maxValue=0;
        for(int value:map.values()){
            maxValue=Math.max(maxValue,value);
        }

        LinkedList <Integer> linkList=new LinkedList<>();

        for(int value:map.keySet()){
            if(map.get(value)==maxValue) linkList.offer(value);
        }

        Collections.sort(linkList);

        //(3) 최빈값
        if(linkList.size()>=2) System.out.println(linkList.get(1));
        else System.out.println(linkList.get(0));;

        System.out.println(max-min); //(4) 범위
    }
}
