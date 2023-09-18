package zzz.springframework.context.annotation;

import cn.hutool.core.util.ClassUtil;
import zzz.springframework.beans.factory.config.BeanDefinition;
import zzz.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author zhangzhongzhen wrote on 2023/9/18
 * @version 1.0
 * @description: 处理对象扫描装配
 *
 * 这里先要提供一个可以通过配置路径basePackage=cn.bugstack.springframework.test.bean，解析出
 * classes 信息的工具方法 findCandidateComponents，通过这个方法就可以扫描到所有 @Component 注解的 Bean 对象了。
 *
 */
public class ClassPathScanningCandidateComponentProvider {

    public Set<BeanDefinition> findCandidateComponents(String basePackage) {
        Set<BeanDefinition> candidates = new LinkedHashSet<>();
        Set<Class<?>> classes = ClassUtil.scanPackageByAnnotation(basePackage, Component.class);
        for (Class<?> clazz : classes) {
            candidates.add(new BeanDefinition(clazz));
        }
        return candidates;
    }

}
