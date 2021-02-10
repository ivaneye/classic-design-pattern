package com.ivaneye.templatemethod;

/**
 * 项目参与者
 *
 * @author ivaneye
 * @since 2021-02-10 20:03:00
 */
public abstract class ProjectParticipant {

    /**
     * 进行项目开发流程
     */
    public void doProcess() {
        reviewReq();
        claimTask();
        doTask();
        testTask();
        release();
    }

    protected abstract void reviewReq();

    protected abstract void claimTask();

    protected abstract void doTask();

    protected abstract void testTask();

    protected abstract void release();
}
