package com.alibaba.otter.canal.client.adapter.rdb.id;

public final class ExceptionUtils {
    private ExceptionUtils() {
    }

    public static UidGenerateException mpe(String msg, Throwable t, Object... params) {
        return new UidGenerateException(String.format(msg, params), t);
    }

    public static UidGenerateException mpe(String msg, Object... params) {
        return new UidGenerateException(String.format(msg, params));
    }

    public static UidGenerateException mpe(Throwable t) {
        return new UidGenerateException(t);
    }
}