package create_pattern.build;

/**
 * User: lanxinghua
 * Date: 2019/7/20 17:16
 * Desc:
 */
public interface IBuildHuman {
    public void buildHead();
    public void buildBody();
    public void buildHand();
    public void buildFoot();

    public Human createHuman();
}
