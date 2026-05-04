package androidx.compose.foundation.lazy.grid;

import androidx.annotation.IntRange;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyGridSpan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSpan.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,66:1\n96#2,5:67\n*S KotlinDebug\n*F\n+ 1 LazyGridSpan.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanKt\n*L\n40#1:67,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridSpanKt {
    public static final long GridItemSpan(@IntRange(from = 1) int i11) {
        if (!(i11 > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("The span value should be higher than 0");
        }
        return GridItemSpan.m848constructorimpl(i11);
    }
}
