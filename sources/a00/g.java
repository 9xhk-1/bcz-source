package a00;

import java.util.AbstractCollection;
import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.y0(version = "1.1")
/* loaded from: classes8.dex */
public abstract class g<E> extends AbstractCollection<E> implements Collection<E>, y00.b {
    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E e11);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
