import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[][]=new int[n][3];
        StringBuilder sb=new StringBuilder();

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=i;
        }
        Arrays.sort(arr,new Comparator<int[]>() {
            public int compare(int[] i1,int[] i2){
                return i1[0]-i2[0];
            }
        });

        int cnt=0;
        arr[0][2]=cnt;

        for(int i=1;i<n;i++) {
            if (arr[i-1][0]==arr[i][0]) {
                arr[i][2]=arr[i-1][2];
            }
            else arr[i][2]=++cnt;
        }

         Arrays.sort(arr,new Comparator<int[]>() {
            public int compare(int[] i1,int[] i2){
                return i1[1]-i2[1];
            }
        });

        for(int i=0;i<n;i++) sb.append(arr[i][2]).append(" ");
        System.out.println(sb);

    }
}