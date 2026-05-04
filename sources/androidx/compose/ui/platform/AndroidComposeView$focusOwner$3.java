package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusDirection;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$3 extends FunctionReferenceImpl implements x00.l<FocusDirection, Boolean> {
    public AndroidComposeView$focusOwner$3(Object obj) {
        super(1, obj, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0);
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ Boolean invoke(FocusDirection focusDirection) {
        return m4231invoke3ESFkO8(focusDirection.m2155unboximpl());
    }

    /* renamed from: invoke-3ESFkO8, reason: not valid java name */
    public final Boolean m4231invoke3ESFkO8(int i11) {
        boolean m4223onMoveFocusInChildren3ESFkO8;
        m4223onMoveFocusInChildren3ESFkO8 = ((AndroidComposeView) this.receiver).m4223onMoveFocusInChildren3ESFkO8(i11);
        return Boolean.valueOf(m4223onMoveFocusInChildren3ESFkO8);
    }
}
