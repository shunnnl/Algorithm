import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

/*
 - Comparator는 기본 정렬 기준 외에 사용자 정의 기준으로 정렬할 때 사용
 - compare(a, b)에서 음수 → a가 먼저, 0 → 같음, 양수 → b가 먼저
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        int arr[][]=new int[n][2];

        StringTokenizer st;
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,new Comparator<int[]>() {
            public int compare(int[] e1,int[] e2){
                if(e1[0]==e2[0]) return e1[1]-e2[1];
                else return e1[0]-e2[0]; 
            }
        });

        for(int i=0;i<n;i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }

        System.out.println(sb);

    }
}
