package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$3\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$1\n*L\n1#1,213:1\n207#2:214\n*E\n"})
/* loaded from: classes.dex */
public final class LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1 extends Lambda implements l<Integer, Object> {
    final /* synthetic */ List $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(List list) {
        super(1);
        this.$items = list;
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int i11) {
        this.$items.get(i11);
        return null;
    }
}
