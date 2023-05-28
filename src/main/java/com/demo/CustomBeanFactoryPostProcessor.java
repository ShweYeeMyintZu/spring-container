package com.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        var itr = beanFactory.getBeanNamesIterator();
        System.out.println("Bean Names::");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
    }
}
