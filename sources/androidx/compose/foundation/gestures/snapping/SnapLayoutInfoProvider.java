package androidx.compose.foundation.gestures.snapping;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface SnapLayoutInfoProvider {
    float calculateSnapOffset(float f11);

    default float calculateApproachOffset(float f11, float f12) {
        return f12;
    }
}
