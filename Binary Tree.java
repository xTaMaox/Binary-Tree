public Node FindInTree(Node node, Predicate<Node> findPredicate)
{
    return InnerFindInTree(node, findPredicate, 1);
}

private Node InnerFindInTree(Node node, Predicate<Node> findPredicate, int stackDepth)
{
    if (stackDepth > MaximumStackDepth)
        return null;
    if (node == null)
        return null;

    Node leftResult = InnerFindInTree(node.LeftChild, findPredicate, stackDepth + 1);
    Node rightResult = InnerFindInTree(node.RightChild, findPredicate, stackDepth + 1);
    
    if (findPredicate(node))
        return node;
    if (leftResult != null)
        return leftResult;
    if (rightResult != null)
        return rightResult;
    return null;
}