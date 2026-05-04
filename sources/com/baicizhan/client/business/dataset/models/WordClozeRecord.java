package com.baicizhan.client.business.dataset.models;

import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.util.JsonSerializer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class WordClozeRecord {
    public static final Map<String, String> COLUMN_MAP;
    public static final Map<String, String> COLUMN_MAP_IGNORE_DATA;
    private String clozeData;
    private TopicRecord.TopicExtra formatClozeData;
    private int topicId;

    static {
        HashMap hashMap = new HashMap();
        COLUMN_MAP = hashMap;
        HashMap hashMap2 = new HashMap();
        COLUMN_MAP_IGNORE_DATA = hashMap2;
        hashMap.put("topicId", "topic_id");
        hashMap.put("clozeData", a.q.C0258a.f16285b);
        hashMap2.put("topicId", "topic_id");
    }

    public String getClozeData() {
        return this.clozeData;
    }

    public TopicRecord.TopicExtra getFormatClozeData() {
        TopicRecord.TopicExtra topicExtra = this.formatClozeData;
        if (topicExtra != null) {
            return topicExtra;
        }
        TopicRecord.TopicExtra topicExtra2 = (TopicRecord.TopicExtra) new JsonSerializer(new bp.a<TopicRecord.TopicExtra>() { // from class: com.baicizhan.client.business.dataset.models.WordClozeRecord.1
        }.getType()).readFromJson(this.clozeData);
        this.formatClozeData = topicExtra2;
        return topicExtra2;
    }

    public int getTopicId() {
        return this.topicId;
    }

    public void setClozeData(String clozeData) {
        this.clozeData = clozeData;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String toString() {
        return new JsonSerializer(new bp.a<WordClozeRecord>() { // from class: com.baicizhan.client.business.dataset.models.WordClozeRecord.2
        }.getType()).writeToJson(this);
    }
}
