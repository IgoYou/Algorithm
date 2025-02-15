package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author：sanhuzhen
 * @time：2025/2/15 16:35
 * @description：二叉树
 */
public class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }

    public static void main(String[] args) {
        // 你可以这样构建一棵二叉树：
        // 构建出来的二叉树是这样的：
        //     1
        //    / \
        //   2   3
        //  /   / \
        // 4   5   6
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        System.out.println("前序遍历：");
        traverse(root);
        System.out.println("层序遍历：");
        levelOrderTraverse(root);
        System.out.println("带层次的遍历：");
        levelOrderTraverse2(root);
    }

    // 遍历二叉树
    static void traverse(TreeNode root) {
        if (root == null)
            return;
        // 前序
        System.out.println(root.val);
        traverse(root.left);
        // 中序
        traverse(root.right);
        // 后序
    }

    // 层序遍历 这种写法不知道这是第几层的节点，故加个变量depth得到该层的节点
    static void levelOrderTraverse(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();

        // 将其加入队列
        q.offer(root);

        while (!q.isEmpty()) {
            // 出队
            TreeNode cur = q.poll();

            System.out.println(cur.val);

            // 遍历cur的左右子树
            if (cur.left != null) {
                q.offer(cur.left);
            }
            if (cur.right != null) {
                q.offer(cur.right);
            }
        }
    }

    static void levelOrderTraverse2(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();

        // 将其加入队列
        q.offer(root);
        int depth = 1;

        while (!q.isEmpty()) {
            int size = q.size();
            // 将该层节点全部打印出来
            for (int i = 0; i < size; i++) {
                // 出队
                TreeNode cur = q.poll();

                assert cur != null;

                System.out.println("depth = " + depth + ", val = " + cur.val);

                // 遍历cur的左右子树
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }
            depth++;
        }
    }
}
