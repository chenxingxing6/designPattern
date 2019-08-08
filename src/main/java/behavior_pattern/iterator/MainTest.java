package behavior_pattern.iterator;

/**
 * User: lanxinghua
 * Date: 2019/8/8 16:18
 * Desc:
 */
public class MainTest {
    public static void main(String[] args) {
        NameRepository repository = new NameRepository();
        for (Iterator iterator = repository.getIterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
