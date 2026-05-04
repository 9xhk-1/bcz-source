package com.baicizhan.client.business.dataset.models;

import com.alipay.sdk.m.u.i;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class WordMediaMidRecord {
    public static final Map<String, String> COLUMN_MAP;
    public static final Map<String, String> OLD_COLUMN_MAP;
    private String path;
    private int type;

    static {
        HashMap hashMap = new HashMap();
        COLUMN_MAP = hashMap;
        HashMap hashMap2 = new HashMap();
        OLD_COLUMN_MAP = hashMap2;
        hashMap.put("path", "path");
        hashMap.put("type", "type");
        hashMap2.put("path", "ws_audio");
        hashMap2.put("type", a.n.C0255a.f16266f);
    }

    public String getPath() {
        return this.path;
    }

    public int getType() {
        return this.type;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String toString() {
        return "WordMediaMidRecord {path:" + this.path + ", type:" + this.type + i.f11099d;
    }
}
