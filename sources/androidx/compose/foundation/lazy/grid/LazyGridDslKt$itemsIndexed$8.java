package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.Lambda;
import x00.p;
import x00.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyGridDslKt$itemsIndexed$8 extends Lambda implements p<LazyGridItemSpanScope, Integer, GridItemSpan> {
    final /* synthetic */ T[] $items;
    final /* synthetic */ q<LazyGridItemSpanScope, Integer, T, GridItemSpan> $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$8(q<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> qVar, T[] tArr) {
        super(2);
        this.$span = qVar;
        this.$items = tArr;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        return GridItemSpan.m847boximpl(m859invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m859invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i11) {
        return this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i11), this.$items[i11]).m854unboximpl();
    }
}
