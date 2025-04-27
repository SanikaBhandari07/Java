
# Tree Traversal 

    # DFS :

        1. PreOrder     Root  left Right     o(n)
        2. InOrder      left  Root Right     o(n)
        3. PostOrder    left Right Root      o(n)


    # BFS :
        1. Level Order Traversal   o(2n)  = o(n)  

# 

                                               1
                                         /         \
                                      2              3
                                    /   \          /    \
                                  4      5        6      7
                                /  \   /   \    /  \    /  \
                               -1  -1 -1   8   -1  -1  -1   -1
                                          / \
                                        -1   -1


# For Building Tree

    PreOrder Sequence   :  1  2   4  -1 -1 5  -1 8 -1 -1  3 6 -1 -1  7 -1 -1
    Inorder Sequence    : -1  4  -1   2 -1 5  -1 8 -1  1 -1 6 -1  3 -1  7 -1
    PostOrder Sequence  : -1 -1   4  -1 -1 -1  8 5  2 -1 -1 6 -1 -1  7  3  1


# PreOrder                    Inorder                   PostOrder
      1) Printroot            1) left                   1) left
      2) left                 2) Print Root             2) right
      3) right                3) Right                  3) Print Root
                    

# Level Order
    
    Queue <Node> q = new LinkedList<>();

    q.add(root);
    q.add(null);

    while q is not empty
      remove the peek element
      if element == null & q is Empty then return;
      if element == null but q is not empty then again add the null to queue

      if element != null 
        then print that element
        add element.left
        add element.right


# Height of Tree      o(n)

    if root == null return 0 
    else 
      find height(root.left)  height(root.right)
      return 1 + Math.max(left_height, right_height) 


      

# Count No of Nodes    o(n)

    if root == null return 0 
     else 
      find count(root.left)  count(root.right)
      return 1 + left_count + right_count



# Sum of Nodes        o(n)

    if root == null return 0 
    else 
      find sum(root.left)  sum(root.right)
      return root.data + left_sum + right_sum

  
# Diameter of the Tree :


  The diameter can be passes throught
  1 ) left subtree
  2 ) right subtree
  3 ) self node


    If the diameter passes through the self node 
    Then the formula ia : left_height + right_height + 1;

    if(root == null){
        return -1;
    }

    The diameter passes through the left node is always been the selft diamenter
    & The it will be a left diameter for its parent node.

    The diameter passes through the right node is always been the selft diamenter
    & The it will be a right diameter for its parent node.

    retrun Max(left_diam, right_dia, self)






    