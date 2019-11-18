/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsbinarysearchtree;

/**
 *
 * @author K00215698
 */
// Class TreeNode definition
class TreeNode
{
    // package access members

    TreeNode left;   // left node
    String data;        // data item	          - data will differ depending on the application.
    TreeNode right;  // right node

    // Constructor: initialize data to d and make this a leaf node
    public TreeNode(String d)
    {
        data = d;
        left = right = null;  // this node has no children
    }
    // Insert a TreeNode into a Tree that contains nodes.( Ignore duplicate values).


    public synchronized void insert(String d)
    {
        if (d.compareTo(data) == ComparisonResult.lessThan)
        {
            if (left == null)
            {
                left = new TreeNode(d);
            } else
            {
                left.insert(d);
            }
        } else if (d.compareTo(data) == ComparisonResult.greaterThan)
        {
            if (right == null)
            {
                right = new TreeNode(d);
            } else
            {
                right.insert(d);
            }
        }
    }
}
