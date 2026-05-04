package com.baicizhan.main.word_book.list;

import java.util.List;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$2\n*L\n1#1,212:1\n*E\n"})
/* loaded from: classes5.dex */
public final class FavoritesIntentWidgetsKt$ListContent$lambda$0$0$0$0$0$$inlined$itemsIndexed$default$1 extends Lambda implements x00.l<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ x00.p $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoritesIntentWidgetsKt$ListContent$lambda$0$0$0$0$0$$inlined$itemsIndexed$default$1(x00.p pVar, List list) {
        super(1);
        this.$key = pVar;
        this.$items = list;
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int i11) {
        return this.$key.invoke(Integer.valueOf(i11), this.$items.get(i11));
    }
}
