package com.bixingyu.gulimall.member;

import com.bixingyu.gulimall.member.entity.MemberEntity;
import com.bixingyu.gulimall.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
@Slf4j
@SpringBootTest
class GulimallMemberApplicationTests {
    @Resource
    private MemberService memberService;
    @Test
    void contextLoads() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setUsername("BiXingyu");
        memberService.save(memberEntity);

        log.info("保存成功{}" , memberEntity);



    }

}
