package com.gupaoedu.vip.pattern.adapter.loginadapter.v2;

public class PassportTest {
    public static void main(String[] args) {
        IPassportForThird passportForThird = new PassportForThirdAdapter();
        passportForThird.loginForQQ("fdsafdfd2dxf");
    }
}
