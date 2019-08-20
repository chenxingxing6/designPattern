package behavior_pattern.visitor;

/**
 * User: lanxinghua
 * Date: 2019/8/20 11:05
 * Desc:
 */
public class Visitor {
    public void visit(ComputerPart part){
        System.out.println("访问者行为："+part.getSubject());
    }
}
