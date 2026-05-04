package com.tencent.liteav.basic.module;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXCEventRecorderProxy {

    /* renamed from: a, reason: collision with root package name */
    private long f43395a;

    public static void a(String str, int i11, long j11, long j12, String str2, int i12) {
        if (str == null || str2 == null) {
            return;
        }
        nativeAddEventMsg(str, i11, j11, j12, str2, i12);
    }

    private static native void nativeAddEventMsg(String str, int i11, long j11, long j12, String str2, int i12);

    private static native void nativeRelease(long j11);

    public void finalize() throws Throwable {
        nativeRelease(this.f43395a);
        this.f43395a = 0L;
        super.finalize();
    }
}
