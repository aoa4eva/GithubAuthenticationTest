package me.afua.githubauthenticationtest;

import org.springframework.boot.autoconfigure.security.oauth2.client.servlet.OAuth2ClientAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import static java.lang.Thread.sleep;

@Controller
public class MainController {

    @RequestMapping("/")
    public @ResponseBody
    String authenticate(){

        RestTemplate t = new RestTemplate();
        String token = "your_github_access_token";
        String url = "https://api.github.com?access_token="+token;
        url = "https://api.github.com/users/username?access_token="+token;
        System.out.println(t.getForObject(url,String.class));
        System.out.println(url);

        for(int i=0; i<200; i++)
        {
            System.out.println(i);
            System.out.println(t.getForObject(url,String.class));
        }
        return "Check github authentication";

 }
}
