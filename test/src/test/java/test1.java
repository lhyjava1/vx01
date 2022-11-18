import cn.hutool.core.bean.copier.CopyOptions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.HashMap;
import java.util.Map;
import org.springframework.data.redis.core.StringRedisTemplate;
import static cn.hutool.core.bean.BeanUtil.beanToMap;
@SpringBootTest
public class test1 {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
     @Test
    public void test(){
    pojo pojo = new pojo();
    Map<String, Object> stringObjectMap = beanToMap(pojo,new HashMap<>(), CopyOptions.create().setIgnoreNullValue(true).setFieldValueEditor((filedName, value)->
            value.toString()) );
}}
