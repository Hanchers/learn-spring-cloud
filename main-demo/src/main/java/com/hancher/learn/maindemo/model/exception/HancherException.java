package com.hancher.learn.maindemo.model.exception;
/**
 * 业务异常
 *
 * <p/>
 * @author Hancher
 * @date Created in 2020年12月02日 21:01
 * @version 1.0
 * @since 1.0
 */
public class HancherException extends RuntimeException {
    private static final long serialVersionUID = 7169135303020650214L;

    public HancherException(String msg) {
        super(msg);
    }

    public HancherException() {
        super();
    }
}
