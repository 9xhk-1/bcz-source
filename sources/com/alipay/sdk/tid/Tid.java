package com.alipay.sdk.tid;

import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Tid {
    public final String key;
    public final String tid;
    public final long time;

    public Tid(String str, String str2, long j11) {
        this.tid = str;
        this.key = str2;
        this.time = j11;
    }

    public static boolean isEmpty(Tid tid) {
        return tid == null || TextUtils.isEmpty(tid.tid);
    }

    public String getTid() {
        return this.tid;
    }

    public String getTidSeed() {
        return this.key;
    }

    public long getTimestamp() {
        return this.time;
    }
}
