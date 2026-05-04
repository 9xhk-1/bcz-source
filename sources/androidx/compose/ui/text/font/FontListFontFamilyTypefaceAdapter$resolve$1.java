package androidx.compose.ui.text.font;

import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class FontListFontFamilyTypefaceAdapter$resolve$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ AsyncFontListLoader $asyncLoader;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontListFontFamilyTypefaceAdapter$resolve$1(AsyncFontListLoader asyncFontListLoader, j00.c<? super FontListFontFamilyTypefaceAdapter$resolve$1> cVar) {
        super(2, cVar);
        this.$asyncLoader = asyncFontListLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new FontListFontFamilyTypefaceAdapter$resolve$1(this.$asyncLoader, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((FontListFontFamilyTypefaceAdapter$resolve$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            AsyncFontListLoader asyncFontListLoader = this.$asyncLoader;
            this.label = 1;
            if (asyncFontListLoader.load(this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        return g2.f100423a;
    }
}
