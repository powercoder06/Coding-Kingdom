class Solution {
        public:
                vector<vector<int>> levelorder(TreeNode *root) {
                        vector<vector<int>> ans;
                        if(root==NULL)
                                return ans;
                        queue<TreeNode*> q;
                        q.push(root);
                        while(!q.empty()) {
                                int size = q.size();
                                vector<int> level;
                                while(size--) {
                                        TreeNode *node = q.front();
                                        q.pop();
                                        if(node->left!=NULL)
                                                q.push(node->left);
                                        if(node->right!=NULL)
                                                q.push(node->right);
                                        level.push_back(node->val);
                                }
                                ans.push_back(level);
                        }
                        return ans;
                }
};