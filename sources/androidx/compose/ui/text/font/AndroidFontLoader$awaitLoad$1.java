package androidx.compose.ui.text.font;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", i = {1, 1}, l = {55, 57}, m = "awaitLoad", n = {"this", qo.h.f82539q}, s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
public final class AndroidFontLoader$awaitLoad$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidFontLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader$awaitLoad$1(AndroidFontLoader androidFontLoader, j00.c<? super AndroidFontLoader$awaitLoad$1> cVar) {
        super(cVar);
        this.this$0 = androidFontLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitLoad(null, this);
    }
}
