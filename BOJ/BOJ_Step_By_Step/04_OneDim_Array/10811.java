import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 - 구간 [i, j]를 양 끝에서 중앙으로 수렴하며 원소들을 swap하여 뒤집기
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int arr[]=new int[n+1];
        
        for(int i=1;i<=n;i++) arr[i]=i;

        for(int l=0;l<m;l++){
            st=new StringTokenizer(br.readLine());
            int i=Integer.parseInt(st.nextToken());
            int j=Integer.parseInt(st.nextToken());
            int tmp;

            for(int start=i,end=j;start<=(j+i)/2;start++, end--){
                tmp=arr[start];
                arr[start]=arr[end];
                arr[end]=tmp;
            }
        }

        for(int i=1;i<=n;i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}