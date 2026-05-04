package androidx.compose.ui.text.font;

import androidx.media3.extractor.text.ttml.TtmlNode;
import ix.l1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.text.font.FontFamilyResolverImpl", f = "FontFamilyResolver.kt", i = {0, 0}, l = {43}, m = l1.b.f62936f, n = {"this", TtmlNode.ATTR_TTS_FONT_FAMILY}, s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
public final class FontFamilyResolverImpl$preload$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FontFamilyResolverImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$preload$1(FontFamilyResolverImpl fontFamilyResolverImpl, j00.c<? super FontFamilyResolverImpl$preload$1> cVar) {
        super(cVar);
        this.this$0 = fontFamilyResolverImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.preload(null, this);
    }
}
