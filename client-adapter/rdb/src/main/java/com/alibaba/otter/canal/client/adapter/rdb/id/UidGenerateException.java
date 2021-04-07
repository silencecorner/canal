package com.alibaba.otter.canal.client.adapter.rdb.id;

public class UidGenerateException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public UidGenerateException(String message) {
        super(message);
    }

    public UidGenerateException(Throwable throwable) {
        super(throwable);
    }

    public UidGenerateException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
