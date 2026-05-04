package com.tencent.liteav.basic.module;

import com.tencent.liteav.basic.util.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class Monitor {
    static {
        h.d();
    }

    public static void a(int i11, String str, String str2, int i12) {
        nativeOnlineLog(i11, str, str2, i12);
    }

    private static native void nativeOnlineLog(int i11, String str, String str2, int i12);
}
