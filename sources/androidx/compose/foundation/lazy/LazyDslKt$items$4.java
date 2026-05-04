package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyDslKt$items$4 extends Lambda implements r<LazyItemScope, Integer, Composer, Integer, g2> {
    final /* synthetic */ r<LazyItemScope, T, Composer, Integer, g2> $itemContent;
    final /* synthetic */ List<T> $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyDslKt$items$4(r<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, g2> rVar, List<? extends T> list) {
        super(4);
        this.$itemContent = rVar;
        this.$items = list;
    }

    @Override // x00.r
    public /* bridge */ /* synthetic */ g2 invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return g2.f100423a;
    }

    @Composable
    public final void invoke(LazyItemScope lazyItemScope, int i11, Composer composer, int i12) {
        int i13;
        if ((i12 & 6) == 0) {
            i13 = (composer.changed(lazyItemScope) ? 4 : 2) | i12;
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
            ComposerKt.traceEventStart(-632812321, i13, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
        }
        this.$itemContent.invoke(lazyItemScope, this.$items.get(i11), composer, Integer.valueOf(i13 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
