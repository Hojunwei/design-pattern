package com.hjw.chainOfResponsibilityPattern.spring;

/**
 * chain模板实现
 */
abstract class AbstractHandler implements Handler {

    /**
     * 串行处理
     *
     * @param params
     */
    public void execute(Object params) {

        if (!match(params)) {
            return;
        }

        this.process(params);
    }

    /**
     * 是否该handler处理
     *
     * @param params
     * @return
     */
    protected abstract boolean match(Object params);

}
