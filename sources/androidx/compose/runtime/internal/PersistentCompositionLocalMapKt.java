package androidx.compose.runtime.internal;

import a00.l1;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ValueHolder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPersistentCompositionLocalMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentCompositionLocalMap.kt\nandroidx/compose/runtime/internal/PersistentCompositionLocalMapKt\n+ 2 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n*L\n1#1,84:1\n80#2:85\n*S KotlinDebug\n*F\n+ 1 PersistentCompositionLocalMap.kt\nandroidx/compose/runtime/internal/PersistentCompositionLocalMapKt\n*L\n83#1:85\n*E\n"})
/* loaded from: classes.dex */
public final class PersistentCompositionLocalMapKt {
    @k
    public static final PersistentCompositionLocalHashMap persistentCompositionLocalHashMapOf() {
        return PersistentCompositionLocalHashMap.Companion.getEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    @k
    public static final PersistentCompositionLocalMap persistentCompositionLocalHashMapOf(@k Pair<? extends CompositionLocal<Object>, ? extends ValueHolder<Object>>... pairArr) {
        PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builder2 = PersistentCompositionLocalHashMap.Companion.getEmpty().builder2();
        l1.y0(builder2, pairArr);
        return builder2.build2();
    }
}
