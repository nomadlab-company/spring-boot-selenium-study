package kr.co.nomadlab.springseleniumstudy.config;


import kr.co.nomadlab.springseleniumstudy.annotation.LazyConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.time.Duration;

@LazyConfiguration
public class WebDriverWaitConfig {

    @Value("${default.timeout:30}")
    private int timeout;

    // https://chromedriver.chromium.org/downloads 도움말 -> 크롬 정보에 버전 있음
    @Bean
    public WebDriverWait webdriverWait(WebDriver driver){
        return new WebDriverWait(driver, Duration.ofSeconds(this.timeout));
    }

}
