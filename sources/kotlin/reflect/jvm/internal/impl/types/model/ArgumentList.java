package kotlin.reflect.jvm.internal.impl.types.model;

import i30.j;
import i30.k;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class ArgumentList extends ArrayList<k> implements j {
    public ArgumentList(int i11) {
        super(i11);
    }

    public /* bridge */ boolean contains(k kVar) {
        return super.contains((Object) kVar);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(k kVar) {
        return super.indexOf((Object) kVar);
    }

    public /* bridge */ int lastIndexOf(k kVar) {
        return super.lastIndexOf((Object) kVar);
    }

    public /* bridge */ boolean remove(k kVar) {
        return super.remove((Object) kVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof k) {
            return contains((k) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof k) {
            return indexOf((k) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof k) {
            return lastIndexOf((k) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof k) {
            return remove((k) obj);
        }
        return false;
    }
}
