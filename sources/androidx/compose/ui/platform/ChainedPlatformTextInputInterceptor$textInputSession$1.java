package androidx.compose.ui.platform;

import com.jiongji.andriod.card.R;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", i = {}, l = {R.styleable.Theme_drawable_searchwords}, m = "textInputSession", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ChainedPlatformTextInputInterceptor$textInputSession$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChainedPlatformTextInputInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$1(ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, j00.c<? super ChainedPlatformTextInputInterceptor$textInputSession$1> cVar) {
        super(cVar);
        this.this$0 = chainedPlatformTextInputInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    public final Object invokeSuspend(@m80.k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.textInputSession(null, null, this);
    }
}
