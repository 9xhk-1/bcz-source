package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ScrollableNode$drag$2$1 extends SuspendLambda implements p<NestedScrollScope, c<? super g2>, Object> {
    final /* synthetic */ p<l<? super DragEvent.DragDelta, g2>, c<? super g2>, Object> $forEachDelta;
    final /* synthetic */ ScrollingLogic $this_with;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScrollableNode$drag$2$1(p<? super l<? super DragEvent.DragDelta, g2>, ? super c<? super g2>, ? extends Object> pVar, ScrollingLogic scrollingLogic, c<? super ScrollableNode$drag$2$1> cVar) {
        super(2, cVar);
        this.$forEachDelta = pVar;
        this.$this_with = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        ScrollableNode$drag$2$1 scrollableNode$drag$2$1 = new ScrollableNode$drag$2$1(this.$forEachDelta, this.$this_with, cVar);
        scrollableNode$drag$2$1.L$0 = obj;
        return scrollableNode$drag$2$1;
    }

    @Override // x00.p
    public final Object invoke(NestedScrollScope nestedScrollScope, c<? super g2> cVar) {
        return ((ScrollableNode$drag$2$1) create(nestedScrollScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            p<l<? super DragEvent.DragDelta, g2>, c<? super g2>, Object> pVar = this.$forEachDelta;
            final ScrollingLogic scrollingLogic = this.$this_with;
            l<DragEvent.DragDelta, g2> lVar = new l<DragEvent.DragDelta, g2>() { // from class: androidx.compose.foundation.gestures.ScrollableNode$drag$2$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(DragEvent.DragDelta dragDelta) {
                    invoke2(dragDelta);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DragEvent.DragDelta dragDelta) {
                    NestedScrollScope.this.mo470scrollByWithOverscrollOzD1aCk(scrollingLogic.m514singleAxisOffsetMKHz9U(dragDelta.m414getDeltaF1C5BW0()), NestedScrollSource.Companion.m3625getUserInputWNlRxjI());
                }
            };
            this.label = 1;
            if (pVar.invoke(lVar, this) == l11) {
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
