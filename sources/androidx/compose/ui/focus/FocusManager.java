package androidx.compose.ui.focus;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface FocusManager {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
    }

    static /* synthetic */ void clearFocus$default(FocusManager focusManager, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        focusManager.clearFocus(z11);
    }

    void clearFocus(boolean z11);

    /* renamed from: moveFocus-3ESFkO8, reason: not valid java name */
    boolean mo2165moveFocus3ESFkO8(int i11);
}
