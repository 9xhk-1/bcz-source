package androidx.compose.ui.node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class HitTestResultKt {
    private static final long IS_IN_EXPANDED_BOUNDS = 2;
    private static final long IS_IN_LAYER = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final long DistanceAndFlags(float f11, boolean z11, boolean z12) {
        return DistanceAndFlags.m3996constructorimpl((((z11 ? 1L : 0L) | (z12 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    public static /* synthetic */ long DistanceAndFlags$default(float f11, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        return DistanceAndFlags(f11, z11, z12);
    }
}
