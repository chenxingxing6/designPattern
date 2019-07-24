package jooq;

import cn.hutool.core.collection.CollUtil;
import org.jooq.lambda.Seq;
import org.jooq.lambda.Unchecked;

import java.util.List;

/**
 * User: lanxinghua
 * Date: 2019/7/24 19:17
 * Desc:
 */
public class JooqTest {
    public static void main(String[] args) {
        List<String> list = CollUtil.newArrayList("1", "2", "3");
        list.stream().forEach(Unchecked.consumer((r -> {
            System.out.println("11");
        })));
        System.out.println(Seq.of(1, 2, 3).concat(Seq.of(4, 5, 6)));

        list.stream().forEach(r -> {
            try {
                int i = 1/0;
            }catch (Exception e){
                //lambdaThrowException(e);
                alertException();
            }
        });
    }

    static void alertException(){
        throw new RuntimeException("aaa");
    }

    /**
     * 把受检查异常包装成非受检查异常，避免破坏Java异常的结构，通过泛型的方式解决这个问题
     * @param e
     * @param <E>
     * @throws E
     */
    static <E extends Exception> void lambdaThrowException(Exception e) throws E{
        throw (E) e;
    }
}
