package com.baicizhan.main.plusreview.data.db;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class MatchResultRecord {
    public static final Map<String, String> COLUMN_MAP;
    public static final int RESULT_NONE = 0;
    public static final int RESULT_RIGHT = 1;
    public static final int RESULT_WRONG = -1;
    private int result;
    private int topicId;

    static {
        HashMap hashMap = new HashMap();
        COLUMN_MAP = hashMap;
        hashMap.put("topicId", "word_topic_id");
        hashMap.put("fmpath", "result");
    }

    public int getResult() {
        return this.result;
    }

    public int getTopicId() {
        return this.topicId;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String toString() {
        return "MatchResultRecord {[topicId: " + this.topicId + "]; [result: " + this.result + "]}";
    }
}
