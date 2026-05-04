package androidx.compose.foundation;

import kotlin.jvm.internal.FunctionReferenceImpl;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public /* synthetic */ class AbstractClickableNode$focusableNode$1 extends FunctionReferenceImpl implements l<Boolean, g2> {
    public AbstractClickableNode$focusableNode$1(Object obj) {
        super(1, obj, AbstractClickableNode.class, "onFocusChange", "onFocusChange(Z)V", 0);
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ g2 invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return g2.f100423a;
    }

    public final void invoke(boolean z11) {
        ((AbstractClickableNode) this.receiver).onFocusChange(z11);
    }
}
