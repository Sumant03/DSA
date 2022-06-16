// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution 
{   
    
    class meeting implements Comparable<meeting>{
    int start;
    int end;
     
    meeting(int start, int end)
    {
        this.start = start;
        this.end = end;

    }
     public int compareTo(meeting o) 
    {
        if (this.end < o.end)
            return -1;
        else if (this.end > o.end)
            return 1;
        return 0;    
     
    }
}

    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
       ArrayList<meeting> meet = new ArrayList<>();
        
        for(int i = 0; i < start.length; i++)
            meet.add(new meeting(start[i], end[i]));
        
        Collections.sort(meet); 
        int val=1;
        
        int limit = meet.get(0).end; 
        
        for(int i = 1;i<start.length;i++) {
            if(meet.get(i).start > limit) {
                limit = meet.get(i).end; 
                val++;
            }
        }
        
        return val;
    }
}
