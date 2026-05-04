package com.baicizhan.client.fm.data.db;

import com.alipay.sdk.m.u.i;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class WordInfoRecord {
    public static final Map<String, String> COLUMN_MAP;
    String accent;
    String cnmean;
    String example;
    String word;
    String wordid;

    static {
        HashMap hashMap = new HashMap();
        COLUMN_MAP = hashMap;
        hashMap.put("wordid", "topic_id");
        hashMap.put("word", "topic_word");
        hashMap.put("accent", a.m.C0254a.f16257p);
        hashMap.put(a.r.C0259a.f16293f, a.m.C0254a.f16247f);
        hashMap.put(a.r.C0259a.f16295h, a.m.C0254a.f16248g);
    }

    public String getAccent() {
        return this.accent;
    }

    public String getCnmean() {
        return this.cnmean;
    }

    public String getExample() {
        return this.example;
    }

    public String getWord() {
        return this.word;
    }

    public String getWordid() {
        return this.wordid;
    }

    public void setAccent(String accent) {
        this.accent = accent;
    }

    public void setCnmean(String cnmean) {
        this.cnmean = cnmean;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setWordid(String wordid) {
        this.wordid = wordid;
    }

    public String toString() {
        return "WordInfoRecord {wordid:" + this.wordid + ", word:" + this.word + ", accent:" + this.accent + ", cnmean:" + this.cnmean + ", example:" + this.example + i.f11099d;
    }
}
