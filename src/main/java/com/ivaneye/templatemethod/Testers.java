package com.ivaneye.templatemethod;

/**
 * 测试人员
 *
 * @author ivaneye
 * @since 2021-02-10 23:18:04
 */
public class Testers extends ProjectParticipant {

    @Override
    protected void reviewReq() {
        System.out.println("测试人员参加需求评审");
    }

    @Override
    protected void claimTask() {
        System.out.println("测试人员认领任务");
    }

    @Override
    protected void doTask() {
        System.out.println("测试人员编写测试用例");
    }

    @Override
    protected void testTask() {
        System.out.println("测试人员测试");
    }

    @Override
    protected void release() {
    }
}
