struct Node {
        int data;
        struct Node *left;
        struct Node *right;

        Node(int val) {
                data=val;
                left=right=nullptr;
        }
};

void postorder(Node *root) {
        if(root==nullptr)
                return;
        postorder(root->left);
        postorder(root->right);
        printf(root->data);
}

int main() {
        struct Node *root=new Node(1);
        root->left=new Node(2);
        root->right=new Node(3);
        root->left->right=new Node(5);
        postorder(root);
}