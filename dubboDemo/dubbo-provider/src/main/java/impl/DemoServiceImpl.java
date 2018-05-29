package impl;

import com.dubbo.api.DemoService;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> get(long id) {
        System.out.println(11111);
        return null;
    }
}
