package zzz.springframework.beans.factory;

/**
 * @author zhangzhongzhen wrote on 2023/9/12
 * @version 1.0
 * @description: 定义标记接口
 * 在 Spring 中有特别多类似这样的标记接口的设计方式，它们的存在就像是一种标签一样，可以方便统一摘取出属于此类接口的实现类，通常会有 instanceof 一起判断使用。
 */
public interface Aware {
}
