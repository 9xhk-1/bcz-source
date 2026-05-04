package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCompositionLocalMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
/* loaded from: classes.dex */
public final class CompositionLocalMapKt {
    public static final <T> boolean contains(@k PersistentCompositionLocalMap persistentCompositionLocalMap, @k CompositionLocal<T> compositionLocal) {
        g0.n(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return persistentCompositionLocalMap.containsKey(compositionLocal);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    @k
    public static final PersistentCompositionLocalMap mutate(@k PersistentCompositionLocalMap persistentCompositionLocalMap, @k l<? super Map<CompositionLocal<Object>, ValueHolder<Object>>, g2> lVar) {
        PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builder2 = persistentCompositionLocalMap.builder2();
        lVar.invoke(builder2);
        return builder2.build2();
    }

    public static final <T> T read(@k PersistentCompositionLocalMap persistentCompositionLocalMap, @k CompositionLocal<T> compositionLocal) {
        g0.n(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        ValueHolder valueHolder = persistentCompositionLocalMap.get((Object) compositionLocal);
        if (valueHolder == null) {
            valueHolder = compositionLocal.getDefaultValueHolder$runtime_release();
        }
        return (T) valueHolder.readValue(persistentCompositionLocalMap);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    @k
    public static final PersistentCompositionLocalMap updateCompositionMap(@k ProvidedValue<?>[] providedValueArr, @k PersistentCompositionLocalMap persistentCompositionLocalMap, @k PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builder2 = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf().builder2();
        for (ProvidedValue<?> providedValue : providedValueArr) {
            CompositionLocal<?> compositionLocal = providedValue.getCompositionLocal();
            g0.n(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            ProvidableCompositionLocal providableCompositionLocal = (ProvidableCompositionLocal) compositionLocal;
            if (providedValue.getCanOverride() || !contains(persistentCompositionLocalMap, providableCompositionLocal)) {
                ValueHolder<Object> valueHolder = (ValueHolder) persistentCompositionLocalMap2.get((Object) providableCompositionLocal);
                g0.n(providedValue, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                builder2.put(providableCompositionLocal, providableCompositionLocal.updatedStateOf$runtime_release(providedValue, valueHolder));
            }
        }
        return builder2.build2();
    }

    public static /* synthetic */ PersistentCompositionLocalMap updateCompositionMap$default(ProvidedValue[] providedValueArr, PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            persistentCompositionLocalMap2 = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
        }
        return updateCompositionMap(providedValueArr, persistentCompositionLocalMap, persistentCompositionLocalMap2);
    }
}
