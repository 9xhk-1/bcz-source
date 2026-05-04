package androidx.compose.foundation.gestures.snapping;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SnapPositionKt {
    public static final float calculateDistanceToDesiredSnapPosition(int i11, int i12, int i13, int i14, int i15, int i16, @k SnapPosition snapPosition, int i17) {
        return i15 - snapPosition.position(i11, i14, i12, i13, i16, i17);
    }
}
