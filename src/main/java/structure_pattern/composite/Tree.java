package structure_pattern.composite;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * User: lanxinghua
 * Date: 2019/7/21 21:50
 * Desc: 组合模式
 * 将多个对象组合在一起，比如常见的树形结构
 */
public class Tree implements Serializable {
    private TreeNode root = null;

    public Tree(String name){
        this.root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("根菜单");

        TreeNode menu1 = new TreeNode("菜单1");
        TreeNode menu2 = new TreeNode("菜单2");
        tree.root.add(menu1);

        TreeNode submenu1 = new TreeNode("菜单sub1");
        TreeNode submenu2 = new TreeNode("菜单sub2");
        menu2.add(submenu1);
        menu2.add(submenu2);
        tree.root.add(menu2);
        System.out.println(JSON.toJSONString(tree.root));
    }
}
