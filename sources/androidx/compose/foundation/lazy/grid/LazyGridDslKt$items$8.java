package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.Lambda;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyGridDslKt$items$8 extends Lambda implements p<LazyGridItemSpanScope, Integer, GridItemSpan> {
    final /* synthetic */ T[] $items;
    final /* synthetic */ p<LazyGridItemSpanScope, T, GridItemSpan> $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$items$8(p<? super LazyGridItemSpanScope, ? super T, GridItemSpan> pVar, T[] tArr) {
        super(2);
        this.$span = pVar;
        this.$items = tArr;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        return GridItemSpan.m847boximpl(m857invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m857invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i11) {
        return this.$span.invoke(lazyGridItemSpanScope, this.$items[i11]).m854unboximpl();
    }
}
