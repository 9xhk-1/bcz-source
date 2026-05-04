package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$5 extends FunctionReferenceImpl implements x00.a<Rect> {
    public AndroidComposeView$focusOwner$5(Object obj) {
        super(0, obj, AndroidComposeView.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // x00.a
    public final Rect invoke() {
        Rect onFetchFocusRect;
        onFetchFocusRect = ((AndroidComposeView) this.receiver).onFetchFocusRect();
        return onFetchFocusRect;
    }
}
