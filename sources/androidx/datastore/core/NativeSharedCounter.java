package androidx.datastore.core;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int i11);

    public final native int nativeGetCounterValue(long j11);

    public final native int nativeIncrementAndGetCounterValue(long j11);

    public final native int nativeTruncateFile(int i11);
}
