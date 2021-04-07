package com.alibaba.otter.canal.client.adapter.rdb.id;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class IdWorker {
    private static IdentifierGenerator IDENTIFIER_GENERATOR = new DefaultIdentifierGenerator();
    public static final DateTimeFormatter MILLISECOND = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");

    public IdWorker() {
    }

    public static long getId() {
        return getId(new Object());
    }

    public static long getId(Object entity) {
        return IDENTIFIER_GENERATOR.nextId().longValue();
    }

    public static String getIdStr() {
        return IDENTIFIER_GENERATOR.nextId().toString();
    }

    public static String getMillisecond() {
        return LocalDateTime.now().format(MILLISECOND);
    }

    public static String getTimeId() {
        return getMillisecond() + getIdStr();
    }

    public static void initSequence(long workerId, long dataCenterId) {
        IDENTIFIER_GENERATOR = new DefaultIdentifierGenerator(workerId, dataCenterId);
    }

    public static void setIdentifierGenerator(IdentifierGenerator identifierGenerator) {
        IDENTIFIER_GENERATOR = identifierGenerator;
    }

    public static String get32UUID() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return (new UUID(random.nextLong(), random.nextLong())).toString().replace("-", "");
    }
}
