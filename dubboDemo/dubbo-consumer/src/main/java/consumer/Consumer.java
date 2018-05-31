package consumer;

import com.dubbo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Consumer {
    public static void main(String[] args) throws IOException {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.get(1L));
        System.in.read();
    }
}
