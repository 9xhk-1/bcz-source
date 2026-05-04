package com.baicizhan.client.business.dataset.models;

import com.alipay.sdk.m.u.i;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class WordMediaUpdRecord {
    public static final Map<String, String> COLUMN_MAP;
    private long fmupdate;
    private long tvupdate;
    private String wordid;

    static {
        HashMap hashMap = new HashMap();
        COLUMN_MAP = hashMap;
        hashMap.put("wordid", "word_topic_id");
        hashMap.put("fmupdate", "fm_updated_at");
        hashMap.put("tvupdate", "tv_updated_at");
    }

    public long getFmupdate() {
        return this.fmupdate;
    }

    public long getTvupdate() {
        return this.tvupdate;
    }

    public String getWordid() {
        return this.wordid;
    }

    public void setFmupdate(long fmupdate) {
        this.fmupdate = fmupdate;
    }

    public void setTvupdate(long tvupdate) {
        this.tvupdate = tvupdate;
    }

    public void setWordid(String wordid) {
        this.wordid = wordid;
    }

    public String toString() {
        return "WordMediaUpdRecord {wordid:" + this.wordid + ", fmupdate:" + this.fmupdate + ", tvupdate:" + this.tvupdate + i.f11099d;
    }
}
