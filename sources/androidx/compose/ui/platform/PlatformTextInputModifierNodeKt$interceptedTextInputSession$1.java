package androidx.compose.ui.platform;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", i = {}, l = {184, 186}, m = "interceptedTextInputSession", n = {}, s = {})
/* loaded from: classes2.dex */
public final class PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public PlatformTextInputModifierNodeKt$interceptedTextInputSession$1(j00.c<? super PlatformTextInputModifierNodeKt$interceptedTextInputSession$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    public final Object invokeSuspend(@m80.k Object obj) {
        Object interceptedTextInputSession;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        interceptedTextInputSession = PlatformTextInputModifierNodeKt.interceptedTextInputSession(null, null, null, this);
        return interceptedTextInputSession;
    }
}
