import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();

        int n=Integer.parseInt(br.readLine());
        String arr[][]=new String[n][2];

        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0]=st.nextToken();
            arr[i][1]=st.nextToken();
        }

        Arrays.sort(arr,new Comparator<String[]>() {
            public int compare(String[] s1, String[] s2){
                return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
            }
        });


        for(int i=0;i<n;i++) sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        System.out.println(sb);

    }
}