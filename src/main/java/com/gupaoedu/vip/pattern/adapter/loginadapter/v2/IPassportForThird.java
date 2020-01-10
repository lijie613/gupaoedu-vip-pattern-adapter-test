package com.gupaoedu.vip.pattern.adapter.loginadapter.v2;

import com.gupaoedu.vip.pattern.adapter.loginadapter.ResultMsg;

/**
 * 第三方登录兼容接口
 * 只承担扩展
 */
public interface IPassportForThird {
    /**
     * QQ登陆
     */
    ResultMsg loginForQQ(String id);

    /**
     * 微信登陆
     */
    ResultMsg loginForWechat(String id);

    /**
     * 记住登录状态后自动登录
     */
    ResultMsg loginForToken(String token);

    /**
     * 手机号登陆
     */
    ResultMsg loginForTelphone(String telphone, String code);

    /**
     * 注册后自动登陆
     */
    ResultMsg loginForRegist(String username, String password);
}
