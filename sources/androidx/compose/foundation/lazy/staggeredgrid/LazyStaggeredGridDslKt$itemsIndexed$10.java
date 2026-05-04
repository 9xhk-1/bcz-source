package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.Lambda;
import x00.r;
import x00.s;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$itemsIndexed$10 extends Lambda implements r<LazyStaggeredGridItemScope, Integer, Composer, Integer, g2> {
    final /* synthetic */ s<LazyStaggeredGridItemScope, Integer, T, Composer, Integer, g2> $itemContent;
    final /* synthetic */ T[] $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$itemsIndexed$10(s<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, g2> sVar, T[] tArr) {
        super(4);
        this.$itemContent = sVar;
        this.$items = tArr;
    }

    @Override // x00.r
    public /* bridge */ /* synthetic */ g2 invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
        return g2.f100423a;
    }

    @Composable
    public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i11, Composer composer, int i12) {
        int i13;
        if ((i12 & 6) == 0) {
            i13 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= composer.changed(i11) ? 32 : 16;
        }
        if (!composer.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-804487775, i13, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:516)");
        }
        this.$itemContent.invoke(lazyStaggeredGridItemScope, Integer.valueOf(i11), this.$items[i11], composer, Integer.valueOf(i13 & 126));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
