package androidx.compose.foundation.text;

import c40.r0;
import com.jiongji.andriod.card.R;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", f = "TextLinkScope.kt", i = {}, l = {R.styleable.Theme_drawable_walk_sound3}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TextLinkScope$LinksComposables$1$3$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ LinkStateInteractionSourceObserver $linkStateObserver;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLinkScope$LinksComposables$1$3$1(LinkStateInteractionSourceObserver linkStateInteractionSourceObserver, j00.c<? super TextLinkScope$LinksComposables$1$3$1> cVar) {
        super(2, cVar);
        this.$linkStateObserver = linkStateInteractionSourceObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new TextLinkScope$LinksComposables$1$3$1(this.$linkStateObserver, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((TextLinkScope$LinksComposables$1$3$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = this.$linkStateObserver;
            this.label = 1;
            if (linkStateInteractionSourceObserver.collectInteractionsForLinks(this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }
}
