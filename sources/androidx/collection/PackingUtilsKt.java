package androidx.collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PackingUtilsKt {
    public static final long packFloats(float f11, float f12) {
        return (Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    public static final long packInts(int i11, int i12) {
        return (i12 & 4294967295L) | (i11 << 32);
    }
}
