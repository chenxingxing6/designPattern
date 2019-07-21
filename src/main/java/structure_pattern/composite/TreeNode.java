package structure_pattern.composite;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Vector;

/**
 * User: lanxinghua
 * Date: 2019/7/21 21:50
 * Desc:
 */
public class TreeNode implements Serializable {
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<TreeNode>();

    public TreeNode(String name){
        this.name = name;
    }

    // 添加孩子节点
    public void add(TreeNode node){
        children.add(node);
    }

    // 删除孩子节点
    public void remove(TreeNode node){
        children.remove(node);
    }

    // 获取孩子节点
    public Enumeration<TreeNode> listChildren(){
        return children.elements();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public Vector<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(Vector<TreeNode> children) {
        this.children = children;
    }
}
