package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.Lambda;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyGridDslKt$items$9 extends Lambda implements l<Integer, Object> {
    final /* synthetic */ l<T, Object> $contentType;
    final /* synthetic */ T[] $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$items$9(l<? super T, ? extends Object> lVar, T[] tArr) {
        super(1);
        this.$contentType = lVar;
        this.$items = tArr;
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int i11) {
        return this.$contentType.invoke(this.$items[i11]);
    }
}
