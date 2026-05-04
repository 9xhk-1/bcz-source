package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface TransformScope {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
    }

    /* renamed from: transformBy-d-4ec7I$default, reason: not valid java name */
    static /* synthetic */ void m527transformByd4ec7I$default(TransformScope transformScope, float f11, long j11, float f12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
        }
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        if ((i11 & 2) != 0) {
            j11 = Offset.Companion.m2284getZeroF1C5BW0();
        }
        if ((i11 & 4) != 0) {
            f12 = 0.0f;
        }
        transformScope.mo413transformByd4ec7I(f11, j11, f12);
    }

    /* renamed from: transformBy-d-4ec7I */
    void mo413transformByd4ec7I(float f11, long j11, float f12);
}
