package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import a00.j;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import java.util.Map.Entry;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 8)
/* loaded from: classes.dex */
public abstract class AbstractMapBuilderEntries<E extends Map.Entry<? extends K, ? extends V>, K, V> extends j<E> {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((AbstractMapBuilderEntries<E, K, V>) obj);
        }
        return false;
    }

    public abstract boolean containsEntry(@k Map.Entry<? extends K, ? extends V> entry);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return remove((AbstractMapBuilderEntries<E, K, V>) obj);
        }
        return false;
    }

    public abstract boolean removeEntry(@k Map.Entry<? extends K, ? extends V> entry);

    public final boolean contains(@k E e11) {
        if ((e11 instanceof Object ? e11 : null) instanceof Map.Entry) {
            return containsEntry(e11);
        }
        return false;
    }

    public final boolean remove(@k E e11) {
        if ((e11 instanceof Object ? e11 : null) instanceof Map.Entry) {
            return removeEntry(e11);
        }
        return false;
    }
}
