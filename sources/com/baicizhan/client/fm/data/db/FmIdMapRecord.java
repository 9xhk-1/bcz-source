package com.baicizhan.client.fm.data.db;

import com.alipay.sdk.m.u.i;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FmIdMapRecord {
    public static final Map<String, String> COLUMN_MAP;
    String fmid;
    String wordid;

    static {
        HashMap hashMap = new HashMap();
        COLUMN_MAP = hashMap;
        hashMap.put("wordid", "topic_id");
        hashMap.put("fmid", a.C0239a.C0240a.f16096d);
    }

    public String getFmid() {
        return this.fmid;
    }

    public String getWordid() {
        return this.wordid;
    }

    public void setFmid(String fmid) {
        this.fmid = fmid;
    }

    public void setWordid(String wordid) {
        this.wordid = wordid;
    }

    public String toString() {
        return "FmIdMapRecord {wordid:" + this.wordid + ", fmid:" + this.fmid + i.f11099d;
    }
}
