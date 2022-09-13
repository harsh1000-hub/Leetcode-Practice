class Solution {
public:
    int r;
    int c;
    
    vector<pair<int,int>>dir={{-1,0},{1,0},{0,-1},{0,1}};
    bool inRange(int u,int v)
    {
        return u>=0 and u<r and v>=0 and v<c ;
    }
    void dfs(vector<vector<int>>& image,vector<vector<bool>>&vis,int sr,int sc,int color,int oldC)
    {
        if(sr<0 or sr>=r or sc<0 or sc>=c or vis[sr][sc]==true or image[sr][sc]==color or image[sr][sc]!=oldC)
            return;
        vis[sr][sc]=true;
        image[sr][sc]=color;
        for(auto x:dir)
        {
            int u=sr+x.first;
            int v=sc+x.second;
            if(inRange(u,v))
            {
                dfs(image,vis,u,v,color,oldC);
            }
        }
        return ;
    }
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int color) 
    {
        r=image.size();
        c=image[0].size();
        vector<vector<bool>>vis(r,vector<bool>(c,false));
        dfs(image,vis,sr,sc,color,image[sr][sc]);
        return image;
    }
};