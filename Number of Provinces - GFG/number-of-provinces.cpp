//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution {
  public:
    map<int,list<int>>graph;
    map<int,bool>vis;

    void dfs(int src)
    {
        vis[src]=true;
        for(auto nbrs:graph[src])
        {
            if(!vis[nbrs])
            {
                dfs(nbrs);
            }
        }
        return ;
    }
    int numProvinces(vector<vector<int>> isC, int n) 
    {
       for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isC[i][j]){
                graph[i].push_back(j);
                graph[j].push_back(i);
                }
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                dfs(i);
                cnt++;
            }
        }
        return cnt;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int V,x;
        cin>>V;
        
        vector<vector<int>> adj;
        
        for(int i=0; i<V; i++)
        {
            vector<int> temp;
            for(int j=0; j<V; j++)
            {
                cin>>x;
                temp.push_back(x);
            }
            adj.push_back(temp);
        }
        

        Solution ob;
        cout << ob.numProvinces(adj,V) << endl;
    }
    return 0;
}
// } Driver Code Ends