package chapter2_3.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import soundsystem.CDPlayer;
import soundsystem.CompactDisc;
import soundsystem.SgtPeppers;

//1.创建配置类
@Configuration
public class CDPlayerConfig {

	// 2.声明简单的Bean
	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}

	// 3.借助JavaConfig实现注入
	@Bean
	public CDPlayer cdPlayer() {
		return new CDPlayer(sgtPeppers());
	}

	/*
	 * @Bean public CDPlayer cdPlayer(CompactDisc compactDisc) { return new
	 * CDPlayer(compactDisc); }
	 */

	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		CDPlayer cdPlayer = new CDPlayer(compactDisc);
		cdPlayer.setCompactDisc(compactDisc);
		return cdPlayer;
	}

	// 默认情况下，Spring中的Bean都是单利模式
	@Bean
	public CDPlayer anotherCDPlayer() {
		return new CDPlayer(sgtPeppers());
	}
}
