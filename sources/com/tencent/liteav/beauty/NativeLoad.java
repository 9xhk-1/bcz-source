package com.tencent.liteav.beauty;

import android.util.Log;
import com.tencent.liteav.basic.util.h;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class NativeLoad {
    private static final String TAG = "NativeLoad";

    static {
        h.d();
        OnLoadBeauty();
        Log.i(TAG, "NativeLoad: load jni");
    }

    private NativeLoad() {
    }

    public static native void OnLoadBeauty();

    public static native void nativeClearQueue();

    public static native void nativeDeleteYuv2Yuv();

    public static native void nativeGlMapBufferToQueue(int i11, int i12, ByteBuffer byteBuffer);

    public static native void nativeGlReadPixs(int i11, int i12, byte[] bArr);

    public static native boolean nativeGlReadPixsFromQueue(int i11, int i12, byte[] bArr);

    public static native void nativeGlReadPixsToQueue(int i11, int i12);

    public static native int nativeLoadGLProgram(int i11);

    public static native void nativeglTexImage2D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, byte[] bArr, int i19);
}
