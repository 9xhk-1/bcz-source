package com.baicizhan.client.business.dataset.models;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class UniverseTopicId {
    private static final long TOPIC_ID_MASK = 4294967295L;

    public static int getBookId(long universeTopicId) {
        return (int) (universeTopicId >> 32);
    }

    public static int getTopicId(long universeTopicId) {
        return (int) (universeTopicId & 4294967295L);
    }

    public static long make(int bookId, int topicId) {
        return topicId | (bookId << 32);
    }
}
