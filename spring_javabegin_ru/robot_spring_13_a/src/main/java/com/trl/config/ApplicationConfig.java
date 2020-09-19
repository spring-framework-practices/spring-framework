package com.trl.config;

import com.trl.enums.ColorStyle;
import com.trl.impls.robot.ModelT1000;
import com.trl.impls.sony.SonyHand;
import com.trl.impls.sony.SonyHead;
import com.trl.impls.sony.SonyLeg;
import com.trl.impls.toshiba.ToshibaHand;
import com.trl.impls.toshiba.ToshibaHead;
import com.trl.impls.toshiba.ToshibaLeg;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class ApplicationConfig {

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelT1000 model1() {
        return new ModelT1000();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelT1000 model2() {
        return new ModelT1000(ColorStyle.BLACK, 2005, true);
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ToshibaHead toshibaHead() {
        return new ToshibaHead();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ToshibaHand toshibaHand() {
        return new ToshibaHand();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ToshibaLeg toshibaLeg() {
        return new ToshibaLeg();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SonyHead sonyHead() {
        return new SonyHead();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SonyHand sonyHand() {
        return new SonyHand();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SonyLeg sonyLeg() {
        return new SonyLeg();
    }

}
