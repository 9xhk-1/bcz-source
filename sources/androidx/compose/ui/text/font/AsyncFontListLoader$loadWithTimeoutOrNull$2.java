package androidx.compose.ui.text.font;

import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {315}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class AsyncFontListLoader$loadWithTimeoutOrNull$2 extends SuspendLambda implements p<r0, j00.c<? super Object>, Object> {
    final /* synthetic */ Font $this_loadWithTimeoutOrNull;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$2(AsyncFontListLoader asyncFontListLoader, Font font, j00.c<? super AsyncFontListLoader$loadWithTimeoutOrNull$2> cVar) {
        super(2, cVar);
        this.this$0 = asyncFontListLoader;
        this.$this_loadWithTimeoutOrNull = font;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new AsyncFontListLoader$loadWithTimeoutOrNull$2(this.this$0, this.$this_loadWithTimeoutOrNull, cVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(r0 r0Var, j00.c<Object> cVar) {
        return ((AsyncFontListLoader$loadWithTimeoutOrNull$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PlatformFontLoader platformFontLoader;
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
        platformFontLoader = this.this$0.platformFontLoader;
        Font font = this.$this_loadWithTimeoutOrNull;
        this.label = 1;
        Object awaitLoad = platformFontLoader.awaitLoad(font, this);
        return awaitLoad == l11 ? l11 : awaitLoad;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Object> cVar) {
        return invoke2(r0Var, (j00.c<Object>) cVar);
    }
}
