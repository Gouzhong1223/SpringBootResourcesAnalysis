package com.gouzhong1223.springbootresourcesanalysis.pojo;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description :
 * @Date : create by QingSong in 2020-03-28 12:23 下午
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.springbootresourcesanalysis.pojo
 * @ProjectName : springboot-resources-analysis
 * @Version : 1.0.0
 */
public class Dog implements Pet {
    @Override
    public void move() {
        System.out.println("Running");
    }
}
