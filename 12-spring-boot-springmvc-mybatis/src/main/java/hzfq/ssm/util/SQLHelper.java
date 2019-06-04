package hzfq.ssm.util;

import static org.assertj.core.api.Assertions.in;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月3日
 */
public class SQLHelper {

    public static <T> List<T> parse(List<Object[]> content, Class<T> clazz) {
        if (content == null || content.isEmpty()) {
            return null;
        }
        Object[] row = content.get(0);
        int rowSize = row.length;
        Class[] rowClasses = new Class[rowSize];
        for (int i = 0; i < rowSize; i++) {
            rowClasses[i] = row[i].getClass();
        }
        try {
            List<T> result = new ArrayList<>();
            for (Object[] con : content) {
                Constructor<T> constructor = clazz.getConstructor(rowClasses);
                result.add(constructor.newInstance(con));
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
