package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.Lambda;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt$measure$1$29$1 extends Lambda implements l<LazyStaggeredGridMeasuredItem, CharSequence> {
    public static final LazyStaggeredGridMeasureKt$measure$1$29$1 INSTANCE = new LazyStaggeredGridMeasureKt$measure$1$29$1();

    public LazyStaggeredGridMeasureKt$measure$1$29$1() {
        super(1);
    }

    @Override // x00.l
    public final CharSequence invoke(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem) {
        return String.valueOf(lazyStaggeredGridMeasuredItem.getIndex());
    }
}
