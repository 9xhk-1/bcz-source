package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface PersistentCompositionLocalMap extends PersistentMap<CompositionLocal<Object>, ValueHolder<Object>>, CompositionLocalMap, CompositionLocalAccessorScope {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Builder extends PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
        @k
        PersistentMap<CompositionLocal<Object>, ValueHolder<Object>> build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @k
    PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builder();

    @Override // androidx.compose.runtime.CompositionLocalAccessorScope
    default <T> T getCurrentValue(@k CompositionLocal<T> compositionLocal) {
        return (T) CompositionLocalMapKt.read(this, compositionLocal);
    }

    @k
    PersistentCompositionLocalMap putValue(@k CompositionLocal<Object> compositionLocal, @k ValueHolder<Object> valueHolder);
}
