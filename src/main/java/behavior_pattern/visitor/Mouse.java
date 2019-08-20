package behavior_pattern.visitor;

/**
 * User: lanxinghua
 * Date: 2019/8/20 11:09
 * Desc:
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "mouse";
    }
}
