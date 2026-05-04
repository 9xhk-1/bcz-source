package com.baicizhan.client.fm.data.db;

import com.alipay.sdk.m.u.i;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FmIdPathMapRecord {
    public static final Map<String, String> COLUMN_MAP;
    String fmid;
    String hdpath;
    String path;

    static {
        HashMap hashMap = new HashMap();
        COLUMN_MAP = hashMap;
        hashMap.put("fmid", "ws_id");
        hashMap.put("path", "ws_audio");
        hashMap.put("hdpath", a.o.C0256a.f16277i);
    }

    public String getFmid() {
        return this.fmid;
    }

    public String getHdpath() {
        return this.hdpath;
    }

    public String getPath() {
        return this.path;
    }

    public void setFmid(String fmid) {
        this.fmid = fmid;
    }

    public void setHdpath(String hdpath) {
        this.hdpath = hdpath;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String toString() {
        return "FmIdPathMapRecord {fmid:" + this.fmid + ", path:" + this.path + ", hdpath:" + this.hdpath + i.f11099d;
    }
}
