package me.yeonbn.moja.mail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailServiceImplTest {

    @Autowired
    EmailServiceImpl emailService;

    @Test
    public void sendSimpleMessage() {
        emailService.sendSimpleMessage("wjddusqls88@naver.com", "test", "test test");
    }

    // src/test/resources/photo.jpg
//    /Users/yeonbn88/IdeaProjects/Toy Project/moja/target/test-classes/photo.jpg
    @Test
    public void sendMessageWithAttachmentTest() {
        try {
            emailService.sendMessageWithAttachment("wjddusqls88@naver.com", "test", "test test",
                    "src/test/resources/photo.jpg");
        } catch (MessagingException e) {
            System.out.println("Exception Occured");
        }
    }
}