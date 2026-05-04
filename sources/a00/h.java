package a00;

import java.util.AbstractList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.y0(version = "1.1")
/* loaded from: classes8.dex */
public abstract class h<E> extends AbstractList<E> implements List<E>, y00.e {
    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i11, E e11);

    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i11) {
        return removeAt(i11);
    }

    public abstract E removeAt(int i11);

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int i11, E e11);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
