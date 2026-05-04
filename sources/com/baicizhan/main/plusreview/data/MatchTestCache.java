package com.baicizhan.main.plusreview.data;

import com.baicizhan.client.business.dataset.models.TopicRecord;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class MatchTestCache {
    private static MatchTestCache sCache = new MatchTestCache();
    private MatchTestlib mTestlib;
    private TopicRecord mTopicRecord;

    private MatchTestCache() {
    }

    public static MatchTestCache getCache() {
        return sCache;
    }

    public MatchTestlib getTestlib() {
        return this.mTestlib;
    }

    public TopicRecord getTopicRecord() {
        return this.mTopicRecord;
    }

    public void setTestlib(MatchTestlib lib) {
        this.mTestlib = lib;
    }

    public void setTopicRecord(TopicRecord record) {
        this.mTopicRecord = record;
    }
}
