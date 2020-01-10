package com.gupaoedu.vip.pattern.adapter.objectadapter;

/**
 * 电源适配器
 * 通过适配器兼容220V交流电 与 5V直流电
 */
public class PowerAdapter implements DC5 {

    private  AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    public int outputDC5V() {
        int adapterInput = ac220.outputAC220();
        //变压器
        int adapterOutput = adapterInput / 44;
        System.out.println("使用 PowerAdapter 输入 AC:"+adapterInput+"V"+"输出 DC:"+adapterOutput+"V");
        return adapterOutput;
    }
}
