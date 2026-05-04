package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$7\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$5\n*L\n1#1,285:1\n279#2:286\n*E\n"})
/* loaded from: classes.dex */
public final class LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2 extends Lambda implements l<Integer, Object> {
    final /* synthetic */ Object[] $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(Object[] objArr) {
        super(1);
        this.$items = objArr;
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int i11) {
        Object obj = this.$items[i11];
        return null;
    }
}
