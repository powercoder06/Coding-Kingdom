struct Node {
        int data;
        struct Node *left;
        struct Node *right;

        Node(int val) {
                data=val;
                left=right=nullptr;
        }
};

void preorder(Node *root) {
        if(root==nullptr)
                return;
        printf(root->data);
        preorder(root->left);
        preorder(root->right);
}

int main() {
        struct Node *root=new Node(1);
        root->left=new Node(2);
        root->right=new Node(3);
        root->left->right=new Node(5);
        preorder(root);
}