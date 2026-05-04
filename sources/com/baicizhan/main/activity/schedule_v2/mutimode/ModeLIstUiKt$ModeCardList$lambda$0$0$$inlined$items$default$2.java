package com.baicizhan.main.activity.schedule_v2.mutimode;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$2\n*L\n1#1,176:1\n*E\n"})
/* loaded from: classes4.dex */
public final class ModeLIstUiKt$ModeCardList$lambda$0$0$$inlined$items$default$2 extends Lambda implements x00.l<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ x00.l $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModeLIstUiKt$ModeCardList$lambda$0$0$$inlined$items$default$2(x00.l lVar, List list) {
        super(1);
        this.$key = lVar;
        this.$items = list;
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int i11) {
        return this.$key.invoke(this.$items.get(i11));
    }
}
