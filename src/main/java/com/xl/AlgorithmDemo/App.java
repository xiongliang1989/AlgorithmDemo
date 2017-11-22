package com.xl.AlgorithmDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.xl.tree.biTree.util.TreeNode;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	averageOfLevels(geRoot());
    }
    
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<Double>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        TreeNode innerNode;
        TreeNode outerNode;
        TreeNode node;
        int count = 0;
        double total = 0;
        queue.offer(root);
        queue.offer(null);
        while(queue.element()!=null){
            while((innerNode = queue.poll())!=null){
                total += innerNode.val;
                count += 1;
                if(innerNode.left != null){queue.offer(innerNode.left);}
                if(innerNode.right != null){queue.offer(innerNode.right);}
            }
                list.add(total/count);
                count = 0;
                total = 0;
                queue.offer(null);
        }
        
        return list;
    }
    
    public static TreeNode geRoot(){
    	TreeNode root = new TreeNode(10);
    	TreeNode t1 = new TreeNode(1);
    	TreeNode t2 = new TreeNode(2);
    	root.left = t1;
    	root.right = t2;
    	
		return root;
    	
    }
    
}
