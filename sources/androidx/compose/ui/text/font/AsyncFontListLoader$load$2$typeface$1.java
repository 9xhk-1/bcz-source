package androidx.compose.ui.text.font;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class AsyncFontListLoader$load$2$typeface$1 extends SuspendLambda implements l<j00.c<? super Object>, Object> {
    final /* synthetic */ Font $font;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, Font font, j00.c<? super AsyncFontListLoader$load$2$typeface$1> cVar) {
        super(1, cVar);
        this.this$0 = asyncFontListLoader;
        this.$font = font;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(j00.c<?> cVar) {
        return new AsyncFontListLoader$load$2$typeface$1(this.this$0, this.$font, cVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(j00.c<Object> cVar) {
        return ((AsyncFontListLoader$load$2$typeface$1) create(cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return obj;
        }
        kotlin.e.n(obj);
        AsyncFontListLoader asyncFontListLoader = this.this$0;
        Font font = this.$font;
        this.label = 1;
        Object loadWithTimeoutOrNull$ui_text_release = asyncFontListLoader.loadWithTimeoutOrNull$ui_text_release(font, this);
        return loadWithTimeoutOrNull$ui_text_release == l11 ? l11 : loadWithTimeoutOrNull$ui_text_release;
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ Object invoke(j00.c<? super Object> cVar) {
        return invoke2((j00.c<Object>) cVar);
    }
}
