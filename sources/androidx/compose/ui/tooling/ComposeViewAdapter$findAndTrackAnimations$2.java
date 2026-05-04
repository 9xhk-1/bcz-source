package androidx.compose.ui.tooling;

import kotlin.jvm.internal.FunctionReferenceImpl;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public /* synthetic */ class ComposeViewAdapter$findAndTrackAnimations$2 extends FunctionReferenceImpl implements a<g2> {
    public ComposeViewAdapter$findAndTrackAnimations$2(Object obj) {
        super(0, obj, ComposeViewAdapter.class, "requestLayout", "requestLayout()V", 0);
    }

    @Override // x00.a
    public /* bridge */ /* synthetic */ g2 invoke() {
        invoke2();
        return g2.f100423a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ComposeViewAdapter) this.receiver).requestLayout();
    }
}
