package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.Lambda;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$itemsIndexed$7$1 extends Lambda implements l<Integer, Object> {
    final /* synthetic */ T[] $items;
    final /* synthetic */ p<Integer, T, Object> $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$itemsIndexed$7$1(p<? super Integer, ? super T, ? extends Object> pVar, T[] tArr) {
        super(1);
        this.$key = pVar;
        this.$items = tArr;
    }

    public final Object invoke(int i11) {
        return this.$key.invoke(Integer.valueOf(i11), this.$items[i11]);
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}
