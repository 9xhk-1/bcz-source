package b00;

import a00.j;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends j<E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((a<E, K, V>) obj);
        }
        return false;
    }

    public abstract boolean containsEntry(@k Map.Entry<? extends K, ? extends V> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return remove((Map.Entry<?, ?>) obj);
        }
        return false;
    }

    public final boolean contains(@k E element) {
        g0.p(element, "element");
        return containsEntry(element);
    }

    public /* bridge */ boolean remove(Map.Entry<?, ?> entry) {
        return super.remove((Object) entry);
    }
}
