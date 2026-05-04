package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$itemsIndexed$4$1 extends Lambda implements l<Integer, StaggeredGridItemSpan> {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ p<Integer, T, StaggeredGridItemSpan> $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$itemsIndexed$4$1(p<? super Integer, ? super T, StaggeredGridItemSpan> pVar, List<? extends T> list) {
        super(1);
        this.$span = pVar;
        this.$items = list;
    }

    public final StaggeredGridItemSpan invoke(int i11) {
        return this.$span.invoke(Integer.valueOf(i11), this.$items.get(i11));
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ StaggeredGridItemSpan invoke(Integer num) {
        return invoke(num.intValue());
    }
}
