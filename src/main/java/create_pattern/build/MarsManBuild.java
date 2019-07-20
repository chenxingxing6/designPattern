package create_pattern.build;

/**
 * User: lanxinghua
 * Date: 2019/7/20 17:18
 * Desc: 火星人构建
 */
public class MarsManBuild implements IBuildHuman {

    private Human human;

    public MarsManBuild(){
        this.human = new Human();
    }

    @Override
    public void buildHead() {
        human.setHead("火星人的头");
    }

    @Override
    public void buildBody() {
        human.setBody("火星人的身体");
    }

    @Override
    public void buildHand() {
        human.setHand("火星人的手");
    }

    @Override
    public void buildFoot() {
        human.setFoot("火星人的腿");

    }

    @Override
    public Human createHuman() {
        return human;
    }
}
