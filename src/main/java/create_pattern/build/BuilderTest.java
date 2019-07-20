package create_pattern.build;

/**
 * User: lanxinghua
 * Date: 2019/7/20 17:17
 * Desc:
 */
public class BuilderTest {
    public static void main(String[] args) {
        Director director = new Director();
        IBuildHuman buildHuman = new MarsManBuild();
        Human human = director.createHumanByDirector(buildHuman);
        System.out.println(human.toString());
    }
}
