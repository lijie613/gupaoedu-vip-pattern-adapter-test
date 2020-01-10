package com.gupaoedu.vip.pattern.adapter.loginadapter.v2;

import com.gupaoedu.vip.pattern.adapter.loginadapter.ResultMsg;
import com.gupaoedu.vip.pattern.adapter.loginadapter.v1.service.SigninService;
import com.gupaoedu.vip.pattern.adapter.loginadapter.v2.adapters.*;

/**
 * 第三方登录自由适配
 * 简单工厂模式 + 策略模式 + 适配器模式
 */
public class PassportForThirdAdapter extends SigninService implements IPassportForThird {
    public ResultMsg loginForQQ(String id) {
        return proccessLogin(id, LoginForQQAdapter.class);
    }

    public ResultMsg loginForWechat(String id) {
        return proccessLogin(id, LoginForWechatAdapter.class);
    }

    public ResultMsg loginForToken(String token) {
        return proccessLogin(token, LoginForTokenAdapter.class);
    }

    public ResultMsg loginForTelphone(String telphone, String code) {
        return proccessLogin(telphone, LoginForTelAdapter.class);
    }

    public ResultMsg loginForRegist(String username, String password) {
        super.regist(username, null);
        return super.login(username, null);
    }

    /**
     * 使用简单工厂模式
     * @param key
     * @param clazz
     * @return
     */
    private ResultMsg proccessLogin(String key, Class<? extends LoginAdapter> clazz) {
        try {
            LoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(key, adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
