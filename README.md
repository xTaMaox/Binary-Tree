# Binary-Tree

If an upper limit of 100,000 nodes is assumed, what should the MaximumStackDepth constant be set to?
17: 100000 / (2^17) = 0.76

If the binary tree is not balanced, what is at risk of occurring with the code above?
This code assumes that each given node has both Left and Right children nodes. This might be reasonable for a balanced tree. However, if the branching is uneven such as if a node only has a Left child, there will be runtime errors because of a null object.

The code above has a major performance issue. What is it?
The 'findPredicate' check should be at the beginning of the function and not the end. Otherwise the search will go deeper than necessary. Recursion should be called after this check.
