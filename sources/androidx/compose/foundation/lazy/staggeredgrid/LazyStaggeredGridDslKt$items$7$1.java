package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.Lambda;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$items$7$1 extends Lambda implements l<Integer, Object> {
    final /* synthetic */ T[] $items;
    final /* synthetic */ l<T, Object> $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$items$7$1(l<? super T, ? extends Object> lVar, T[] tArr) {
        super(1);
        this.$key = lVar;
        this.$items = tArr;
    }

    public final Object invoke(int i11) {
        return this.$key.invoke(this.$items[i11]);
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}
