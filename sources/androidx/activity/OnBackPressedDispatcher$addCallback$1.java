package androidx.activity;

import kotlin.jvm.internal.FunctionReferenceImpl;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public /* synthetic */ class OnBackPressedDispatcher$addCallback$1 extends FunctionReferenceImpl implements x00.a<g2> {
    public OnBackPressedDispatcher$addCallback$1(Object obj) {
        super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    @Override // x00.a
    public /* bridge */ /* synthetic */ g2 invoke() {
        invoke2();
        return g2.f100423a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OnBackPressedDispatcher) this.receiver).updateEnabledCallbacks();
    }
}
