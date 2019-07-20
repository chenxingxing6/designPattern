package create_pattern.build;

/**
 * User: lanxinghua
 * Date: 2019/7/20 17:16
 * Desc: 建造者模式的精髓 导演
 */
public class Director {
    public Human createHumanByDirector(IBuildHuman buildHuman){
        buildHuman.buildHead();
        buildHuman.buildBody();
        buildHuman.buildHand();
        buildHuman.buildFoot();
        return buildHuman.createHuman();
    }
}
