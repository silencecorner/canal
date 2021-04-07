package com.alibaba.otter.canal.client.adapter.rdb.id;


public interface IdentifierGenerator {
    Number nextId();

    default String nextUUID() {
        return IdWorker.get32UUID();
    }
}
