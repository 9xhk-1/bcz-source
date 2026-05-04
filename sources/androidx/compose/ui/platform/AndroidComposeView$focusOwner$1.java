package androidx.compose.ui.platform;

import kotlin.jvm.internal.FunctionReferenceImpl;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$1 extends FunctionReferenceImpl implements x00.l<x00.a<? extends g2>, g2> {
    public AndroidComposeView$focusOwner$1(Object obj) {
        super(1, obj, AndroidComposeView.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ g2 invoke(x00.a<? extends g2> aVar) {
        invoke2((x00.a<g2>) aVar);
        return g2.f100423a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(x00.a<g2> aVar) {
        ((AndroidComposeView) this.receiver).registerOnEndApplyChangesListener(aVar);
    }
}
