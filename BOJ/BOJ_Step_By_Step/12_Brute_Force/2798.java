import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int max=0;

        st=new StringTokenizer(br.readLine());
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=Integer.parseInt(st.nextToken());


        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]<=m) max=Math.max(max,arr[i]+arr[j]+arr[k]);
                }
            }
        }
        System.out.println(max);
    }
}