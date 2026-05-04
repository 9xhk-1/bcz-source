package com.baicizhan.client.business.dataset.models;

import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.lookup.Word;
import com.baicizhan.client.business.util.WordMeanUtils;
import com.baicizhan.online.resource_api.TopicResourceV2;
import com.baicizhan.online.user_study_api.UserCollectWordV2;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l50.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class CollectWordRecord {
    public static Map<String, String> COLUMN_MAP;
    public String accent;
    public String audio;
    public long createAt;
    public String meanCn;
    public int score;
    public long universeTopicId;
    public String word;

    static {
        HashMap hashMap = new HashMap();
        COLUMN_MAP = hashMap;
        hashMap.put("universeTopicId", a.b.C0242a.f16105a);
        COLUMN_MAP.put("createAt", "create_at");
        COLUMN_MAP.put(a.b.C0242a.f16107c, a.b.C0242a.f16107c);
        COLUMN_MAP.put("word", "word");
        COLUMN_MAP.put(a.b.C0242a.f16109e, a.b.C0242a.f16109e);
        COLUMN_MAP.put("accent", "accent");
        COLUMN_MAP.put("audio", "audio");
    }

    public static CollectWordRecord fromBBCollectWord(UserCollectWordV2 word) {
        if (word == null) {
            return null;
        }
        CollectWordRecord collectWordRecord = new CollectWordRecord();
        collectWordRecord.universeTopicId = UniverseTopicId.make(word.getBook_id(), word.getTopic_id());
        collectWordRecord.createAt = TimeUnit.MILLISECONDS.convert(word.getCreated_at(), TimeUnit.SECONDS);
        collectWordRecord.word = word.word;
        return collectWordRecord;
    }

    public static CollectWordRecord fromTopicRecord(TopicRecord topicRecord) {
        if (topicRecord == null) {
            return null;
        }
        CollectWordRecord collectWordRecord = new CollectWordRecord();
        collectWordRecord.universeTopicId = UniverseTopicId.make(topicRecord.bookId, topicRecord.topicId);
        collectWordRecord.word = topicRecord.word;
        collectWordRecord.meanCn = topicRecord.wordMean;
        collectWordRecord.accent = topicRecord.phonetic;
        collectWordRecord.audio = topicRecord.wordAudio;
        return collectWordRecord;
    }

    public static CollectWordRecord fromTopicRes(TopicResourceV2 topicRes, int bookId) {
        if (topicRes == null || topicRes.getDict() == null) {
            return null;
        }
        CollectWordRecord collectWordRecord = new CollectWordRecord();
        collectWordRecord.universeTopicId = UniverseTopicId.make(bookId, topicRes.getDict().getWord_basic_info().topic_id);
        collectWordRecord.word = topicRes.getDict().getWord_basic_info().word;
        collectWordRecord.meanCn = WordMeanUtils.assembleCnMean(topicRes.getDict().getChn_means());
        collectWordRecord.accent = topicRes.getDict().getWord_basic_info().getAccent_usa();
        collectWordRecord.audio = topicRes.getDict().getWord_basic_info().getAccent_usa_audio_uri();
        return collectWordRecord;
    }

    public static CollectWordRecord fromWord(Word word) {
        if (word == null) {
            return null;
        }
        CollectWordRecord collectWordRecord = new CollectWordRecord();
        collectWordRecord.universeTopicId = UniverseTopicId.make(word.getBookId(), Integer.valueOf(word.getId()).intValue());
        collectWordRecord.word = word.getWord();
        collectWordRecord.meanCn = word.getCnmean();
        collectWordRecord.accent = word.getAccent();
        collectWordRecord.audio = word.getAudio();
        return collectWordRecord;
    }

    public static TopicRecord toTopicRecord(CollectWordRecord r11) {
        if (r11 == null) {
            return null;
        }
        TopicRecord topicRecord = new TopicRecord();
        topicRecord.bookId = r11.getBookId();
        topicRecord.topicId = r11.getTopicId();
        topicRecord.word = r11.word;
        topicRecord.phonetic = r11.accent;
        topicRecord.wordMean = r11.meanCn;
        topicRecord.wordAudio = r11.audio;
        return topicRecord;
    }

    public CollectWordRecord copy() {
        CollectWordRecord collectWordRecord = new CollectWordRecord();
        collectWordRecord.universeTopicId = this.universeTopicId;
        collectWordRecord.createAt = this.createAt;
        collectWordRecord.score = this.score;
        collectWordRecord.word = this.word;
        collectWordRecord.meanCn = this.meanCn;
        collectWordRecord.accent = this.accent;
        collectWordRecord.audio = this.audio;
        return collectWordRecord;
    }

    public boolean equals(Object o11) {
        return o11 != null && (o11 instanceof CollectWordRecord) && this.universeTopicId == ((CollectWordRecord) o11).universeTopicId;
    }

    public int getBookId() {
        return UniverseTopicId.getBookId(this.universeTopicId);
    }

    public int getTopicId() {
        return UniverseTopicId.getTopicId(this.universeTopicId);
    }

    public String toString() {
        return "CollectWordRecord{createAt=" + this.createAt + ", universeTopicId=" + this.universeTopicId + b.f69928j;
    }
}
