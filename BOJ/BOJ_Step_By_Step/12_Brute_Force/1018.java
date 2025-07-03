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
        char[][] arr=new char[n][m];
        int min=64;

        for(int i=0;i<n;i++){
            arr[i]=br.readLine().toCharArray();
        }

        for(int startN=0;startN<=n-8;startN++){
            for(int startM=0;startM<=m-8;startM++){
                int cnt=0;
                int cntR=0;
                 for(int i=startN;i<startN+8;i++){
                    for(int j=startM;j<startM+8;j++){
                        if((i+j)%2==0 && arr[i][j]=='W')cnt++;
                        if((i+j)%2!=0 && arr[i][j]=='B')cnt++;
                        if((i+j)%2==0 && arr[i][j]=='B')cntR++;
                        if((i+j)%2!=0 && arr[i][j]=='W')cntR++;
                    }
                }
                min=Math.min(min,Math.min(cnt,cntR));
            }
        }
        System.out.println(min);

    }
}