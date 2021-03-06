package com.harmony.kindless.core.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.harmony.kindless.core.domain.User;

/**
 * @author wuxii@foxmail.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void test() {
        String test = restTemplate.getForObject("/view/wuxii", String.class);
        System.out.println(test);
    }

    @Test
    public void testCreate() {
        String test = restTemplate.postForObject("/user/create", new User("test", "test1"), String.class);
        System.out.println(test);
    }

}
