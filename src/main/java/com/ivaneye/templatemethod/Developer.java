package com.ivaneye.templatemethod;

/**
 * 开发
 *
 * @author ivaneye
 * @since 2021-02-10 23:18:04
 */
public class Developer extends ProjectParticipant {

    @Override
    protected void reviewReq() {
        System.out.println("开发者参加需求评审");
    }

    @Override
    protected void claimTask() {
        System.out.println("开发者认领任务");
    }

    @Override
    protected void doTask() {
        System.out.println("开发者开发任务");
    }

    @Override
    protected void testTask() {
        System.out.println("开发者提测");
    }

    @Override
    protected void release() {
        System.out.println("开发者发布项目");
    }
}
