package com.tencent.liteav.basic.module;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXCKeyPointReportProxy {
    public static void a(String str, int i11) {
        nativeTagKeyPointVideo(str, i11);
    }

    private static native void nativeTagKeyPointVideo(String str, int i11);

    private static native void nativesetRemoteQuality(String str, int i11, long j11, int i12);

    public static void a(String str, int i11, long j11, int i12) {
        nativesetRemoteQuality(str, i11, j11, i12);
    }
}
