package com.baicizhan.client.business.dataset.models.lookup;

import androidx.annotation.NonNull;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.lookup.Word;
import com.baicizhan.client.business.util.JsonSerializer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class DictionaryRecord {
    public static Map<String, String> COLUMN_MAP;
    public String accent;
    public int bookId;
    public float freq;
    public String meanCn;
    public int topicId;
    public String word;
    public int wordLength;

    static {
        HashMap hashMap = new HashMap();
        COLUMN_MAP = hashMap;
        hashMap.put("topicId", "topic_id");
        COLUMN_MAP.put("word", "word");
        COLUMN_MAP.put("accent", "accent");
        COLUMN_MAP.put(a.b.C0242a.f16109e, a.e.C0246a.f16184d);
        COLUMN_MAP.put(a.e.C0246a.f16185e, a.e.C0246a.f16185e);
        COLUMN_MAP.put("wordLength", a.e.C0246a.f16186f);
    }

    public DictionaryRecord() {
    }

    public String toString() {
        return new JsonSerializer(new bp.a<DictionaryRecord>() { // from class: com.baicizhan.client.business.dataset.models.lookup.DictionaryRecord.1
        }.getType()).writeToJson(this);
    }

    public Word toWord() {
        Word word = new Word();
        word.setId(String.valueOf(this.topicId));
        word.setWord(this.word);
        word.setAccent(this.accent);
        word.setCnmean(this.meanCn);
        word.setBase(true);
        word.setSearch(true);
        return word;
    }

    public DictionaryRecord(@NonNull Word word) {
        this.bookId = word.getBookId();
        this.topicId = Integer.valueOf(word.getId()).intValue();
        this.word = word.getWord();
        this.accent = word.getAccent();
        this.meanCn = word.getCnmean();
    }
}
