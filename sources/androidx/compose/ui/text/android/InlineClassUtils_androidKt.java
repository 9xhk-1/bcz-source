package androidx.compose.ui.text.android;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class InlineClassUtils_androidKt {
    public static final long packInts(int i11, int i12) {
        return (i12 & 4294967295L) | (i11 << 32);
    }

    public static final int unpackInt1(long j11) {
        return (int) (j11 >> 32);
    }

    public static final int unpackInt2(long j11) {
        return (int) (j11 & 4294967295L);
    }
}
