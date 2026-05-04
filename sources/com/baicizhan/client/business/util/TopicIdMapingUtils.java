package com.baicizhan.client.business.util;

import com.baicizhan.client.business.dataset.models.RoadmapRecord;
import com.baicizhan.online.resource_api.TopicKey;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class TopicIdMapingUtils {
    public static final String TAG = "RoadmapUtils";

    public static TopicKey buildTopicKey(int topicid, int bookId) {
        TopicKey topicKey = new TopicKey();
        topicKey.setTag_id(getTagId(Integer.valueOf(topicid)));
        topicKey.setWord_level_id(bookId);
        topicKey.setTopic_id(topicid);
        return topicKey;
    }

    public static List<TopicKey> buildTopicKeyList(List<Integer> topicids, int bookId) {
        ArrayList arrayList = new ArrayList();
        if (topicids != null) {
            for (Integer num : topicids) {
                TopicKey topicKey = new TopicKey();
                topicKey.setTag_id(getTagId(num));
                topicKey.setWord_level_id(bookId);
                topicKey.setTopic_id(num.intValue());
                arrayList.add(topicKey);
            }
        }
        return arrayList;
    }

    public static int getTagId(Integer topicid) {
        RoadmapRecord roadmapRecord = q9.x.r().n().get(topicid);
        if (roadmapRecord != null) {
            return roadmapRecord.tag_id;
        }
        qb.c.i("RoadmapUtils", "tagId not found %d", topicid);
        return 0;
    }
}
