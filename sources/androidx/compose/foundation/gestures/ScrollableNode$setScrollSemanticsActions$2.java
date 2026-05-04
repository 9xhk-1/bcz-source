package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", i = {}, l = {522}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ScrollableNode$setScrollSemanticsActions$2 extends SuspendLambda implements p<Offset, c<? super Offset>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ ScrollableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$setScrollSemanticsActions$2(ScrollableNode scrollableNode, c<? super ScrollableNode$setScrollSemanticsActions$2> cVar) {
        super(2, cVar);
        this.this$0 = scrollableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        ScrollableNode$setScrollSemanticsActions$2 scrollableNode$setScrollSemanticsActions$2 = new ScrollableNode$setScrollSemanticsActions$2(this.this$0, cVar);
        scrollableNode$setScrollSemanticsActions$2.J$0 = ((Offset) obj).m2278unboximpl();
        return scrollableNode$setScrollSemanticsActions$2;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ Object invoke(Offset offset, c<? super Offset> cVar) {
        return m501invoke3MmeM6k(offset.m2278unboximpl(), cVar);
    }

    /* renamed from: invoke-3MmeM6k, reason: not valid java name */
    public final Object m501invoke3MmeM6k(long j11, c<? super Offset> cVar) {
        return ((ScrollableNode$setScrollSemanticsActions$2) create(Offset.m2257boximpl(j11), cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        Object m496semanticsScrollByd4ec7I;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            return obj;
        }
        e.n(obj);
        long j11 = this.J$0;
        scrollingLogic = this.this$0.scrollingLogic;
        this.label = 1;
        m496semanticsScrollByd4ec7I = ScrollableKt.m496semanticsScrollByd4ec7I(scrollingLogic, j11, this);
        return m496semanticsScrollByd4ec7I == l11 ? l11 : m496semanticsScrollByd4ec7I;
    }
}
