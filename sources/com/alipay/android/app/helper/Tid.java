package com.alipay.android.app.helper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Tid extends com.alipay.sdk.tid.Tid {
    public Tid(String str, String str2, long j11) {
        super(str, str2, j11);
    }

    public static Tid fromRealTidModel(com.alipay.sdk.tid.Tid tid) {
        if (tid == null) {
            return null;
        }
        return new Tid(tid.getTid(), tid.getTidSeed(), tid.getTimestamp());
    }
}
