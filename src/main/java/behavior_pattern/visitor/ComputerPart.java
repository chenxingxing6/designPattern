package behavior_pattern.visitor;

/**
 * User: lanxinghua
 * Date: 2019/8/20 11:06
 * Desc:
 */
public interface ComputerPart {
    void accept(Visitor visitor);

    String getSubject();

}
