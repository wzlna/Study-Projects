package com.rj.bd.test0917.duotai;

/**
 * @desc 测试类:测试Java语言三特性之多态
 * @desc 多态--接口的多种形态
 */
public class Test {
    public static void main(String[] args) {
        IHero [] heroes = new HeroImpl[3];
        heroes[0] = new HouYi();
        heroes[1] = new AnQiLa();
        heroes[2] = new LuBan();

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].run();
        }
    }
}
