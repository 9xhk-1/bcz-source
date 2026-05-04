package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Comparator;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 2)
/* loaded from: classes2.dex */
public final class TreeSet<E> extends java.util.TreeSet<E> {
    public static final int $stable = 0;

    public TreeSet(@k Comparator<? super E> comparator) {
        super(comparator);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
