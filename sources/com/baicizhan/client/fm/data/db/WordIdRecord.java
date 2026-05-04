package com.baicizhan.client.fm.data.db;

import com.alipay.sdk.m.u.i;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class WordIdRecord {
    public static final Map<String, String> COLUMN_MAP;

    /* renamed from: id, reason: collision with root package name */
    String f17426id;

    static {
        HashMap hashMap = new HashMap();
        COLUMN_MAP = hashMap;
        hashMap.put("id", "topic_id");
    }

    public String getId() {
        return this.f17426id;
    }

    public String toString() {
        return "WordIdRecord {id:" + this.f17426id + i.f11099d;
    }
}
