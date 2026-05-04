package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$2 extends FunctionReferenceImpl implements x00.p<FocusDirection, Rect, Boolean> {
    public AndroidComposeView$focusOwner$2(Object obj) {
        super(2, obj, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0);
    }

    @Override // x00.p
    /* renamed from: invoke-7o62pno, reason: not valid java name and merged with bridge method [inline-methods] */
    public final Boolean invoke(FocusDirection focusDirection, Rect rect) {
        boolean m4224onRequestFocusForOwner7o62pno;
        m4224onRequestFocusForOwner7o62pno = ((AndroidComposeView) this.receiver).m4224onRequestFocusForOwner7o62pno(focusDirection, rect);
        return Boolean.valueOf(m4224onRequestFocusForOwner7o62pno);
    }
}
