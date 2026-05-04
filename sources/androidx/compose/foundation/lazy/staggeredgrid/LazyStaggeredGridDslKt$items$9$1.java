package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.Lambda;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$items$9$1 extends Lambda implements l<Integer, StaggeredGridItemSpan> {
    final /* synthetic */ T[] $items;
    final /* synthetic */ l<T, StaggeredGridItemSpan> $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$items$9$1(l<? super T, StaggeredGridItemSpan> lVar, T[] tArr) {
        super(1);
        this.$span = lVar;
        this.$items = tArr;
    }

    public final StaggeredGridItemSpan invoke(int i11) {
        return this.$span.invoke(this.$items[i11]);
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ StaggeredGridItemSpan invoke(Integer num) {
        return invoke(num.intValue());
    }
}
