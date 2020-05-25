package com.ss.safe.service;

import com.ss.safe.BaseSpringTest;
import com.ss.safe.service.api.SecurityService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xueshansheng
 * @date 2020/5/25 下午 5:00
 */
@Slf4j
public class SecurityServiceTest  extends BaseSpringTest {

    @Autowired
    private SecurityService securityService;

    @Test
    public void oneTest(){
        String ss = securityService.getStrint();
        log.info("响应结果,{}",ss);
    }

}
