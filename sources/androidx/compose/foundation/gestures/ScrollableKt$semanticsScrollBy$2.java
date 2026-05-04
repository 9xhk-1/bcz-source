package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.Ref;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", i = {}, l = {1024}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ScrollableKt$semanticsScrollBy$2 extends SuspendLambda implements p<NestedScrollScope, c<? super g2>, Object> {
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref.FloatRef $previousValue;
    final /* synthetic */ ScrollingLogic $this_semanticsScrollBy;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$semanticsScrollBy$2(ScrollingLogic scrollingLogic, long j11, Ref.FloatRef floatRef, c<? super ScrollableKt$semanticsScrollBy$2> cVar) {
        super(2, cVar);
        this.$this_semanticsScrollBy = scrollingLogic;
        this.$offset = j11;
        this.$previousValue = floatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(this.$this_semanticsScrollBy, this.$offset, this.$previousValue, cVar);
        scrollableKt$semanticsScrollBy$2.L$0 = obj;
        return scrollableKt$semanticsScrollBy$2;
    }

    @Override // x00.p
    public final Object invoke(NestedScrollScope nestedScrollScope, c<? super g2> cVar) {
        return ((ScrollableKt$semanticsScrollBy$2) create(nestedScrollScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            float m515toFloatk4lQ0M = this.$this_semanticsScrollBy.m515toFloatk4lQ0M(this.$offset);
            final Ref.FloatRef floatRef = this.$previousValue;
            final ScrollingLogic scrollingLogic = this.$this_semanticsScrollBy;
            p<Float, Float, g2> pVar = new p<Float, Float, g2>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Float f11, Float f12) {
                    invoke(f11.floatValue(), f12.floatValue());
                    return g2.f100423a;
                }

                public final void invoke(float f11, float f12) {
                    float f13 = f11 - Ref.FloatRef.this.element;
                    ScrollingLogic scrollingLogic2 = scrollingLogic;
                    Ref.FloatRef.this.element += scrollingLogic2.reverseIfNeeded(scrollingLogic2.m515toFloatk4lQ0M(nestedScrollScope.mo469scrollByOzD1aCk(scrollingLogic2.m516toOffsettuRUvjQ(scrollingLogic2.reverseIfNeeded(f13)), NestedScrollSource.Companion.m3625getUserInputWNlRxjI())));
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animate$default(0.0f, m515toFloatk4lQ0M, 0.0f, null, pVar, this, 12, null) == l11) {
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
