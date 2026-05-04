package androidx.compose.foundation.gestures;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface AnchoredDragScope {
    static /* synthetic */ void dragTo$default(AnchoredDragScope anchoredDragScope, float f11, float f12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        anchoredDragScope.dragTo(f11, f12);
    }

    void dragTo(float f11, float f12);
}
