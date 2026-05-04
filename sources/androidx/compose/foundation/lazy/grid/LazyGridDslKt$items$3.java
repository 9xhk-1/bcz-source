package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyGridDslKt$items$3 extends Lambda implements p<LazyGridItemSpanScope, Integer, GridItemSpan> {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ p<LazyGridItemSpanScope, T, GridItemSpan> $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$items$3(p<? super LazyGridItemSpanScope, ? super T, GridItemSpan> pVar, List<? extends T> list) {
        super(2);
        this.$span = pVar;
        this.$items = list;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        return GridItemSpan.m847boximpl(m856invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m856invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i11) {
        return this.$span.invoke(lazyGridItemSpanScope, this.$items.get(i11)).m854unboximpl();
    }
}
