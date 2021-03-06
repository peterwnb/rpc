package com.github.houbb.rpc.server.config.service;

/**
 * 单个服务配置类
 *
 * 简化用户使用：
 * 在用户使用的时候，这个类应该是不可见的。
 * 直接提供对应的服务注册类即可。
 *
 * 后续拓展
 * （1）版本信息
 * （2）服务端超时时间
 *
 * @author binbin.hou
 * @since 0.0.6
 * @param <T> 实现类泛型
 */
public interface ServiceConfig<T> {

    /**
     * 获取唯一标识
     * @return 获取唯一标识
     * @since 0.0.6
     */
    String id();

    /**
     * 设置唯一标识
     * @param id 标识信息
     * @return this
     * @since 0.0.6
     */
    ServiceConfig<T> id(String id);

    /**
     * 获取引用实体实现
     * @return 实体实现
     * @since 0.0.6
     */
    T reference();

    /**
     * 设置引用实体实现
     * @param reference 引用实现
     * @return this
     * @since 0.0.6
     */
    ServiceConfig<T> reference(T reference);

    /**
     * 设置是否注册到注册中心
     * @param register 是否注册到配置中心
     * @since 0.0.8
     */
    ServiceConfig<T> register(final boolean register);

    /**
     * 返回是否注册到注册中心
     * @since 0.0.8
     * @return 是否进行注册到注册中心
     */
    boolean register();

}
