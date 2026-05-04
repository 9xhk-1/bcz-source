package androidx.databinding;

import androidx.databinding.ObservableList;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class ObservableArrayList<T> extends ArrayList<T> implements ObservableList<T> {
    private transient ListChangeRegistry mListeners = new ListChangeRegistry();

    private void notifyAdd(int i11, int i12) {
        ListChangeRegistry listChangeRegistry = this.mListeners;
        if (listChangeRegistry != null) {
            listChangeRegistry.notifyInserted(this, i11, i12);
        }
    }

    private void notifyRemove(int i11, int i12) {
        ListChangeRegistry listChangeRegistry = this.mListeners;
        if (listChangeRegistry != null) {
            listChangeRegistry.notifyRemoved(this, i11, i12);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t11) {
        super.add(t11);
        notifyAdd(size() - 1, 1);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends T> collection) {
        int size = size();
        boolean addAll = super.addAll(collection);
        if (addAll) {
            notifyAdd(size, size() - size);
        }
        return addAll;
    }

    @Override // androidx.databinding.ObservableList
    public void addOnListChangedCallback(ObservableList.OnListChangedCallback onListChangedCallback) {
        if (this.mListeners == null) {
            this.mListeners = new ListChangeRegistry();
        }
        this.mListeners.add(onListChangedCallback);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int size = size();
        super.clear();
        if (size != 0) {
            notifyRemove(0, size);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T remove(int i11) {
        T t11 = (T) super.remove(i11);
        notifyRemove(i11, 1);
        return t11;
    }

    @Override // androidx.databinding.ObservableList
    public void removeOnListChangedCallback(ObservableList.OnListChangedCallback onListChangedCallback) {
        ListChangeRegistry listChangeRegistry = this.mListeners;
        if (listChangeRegistry != null) {
            listChangeRegistry.remove(onListChangedCallback);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public void removeRange(int i11, int i12) {
        super.removeRange(i11, i12);
        notifyRemove(i11, i12 - i11);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T set(int i11, T t11) {
        T t12 = (T) super.set(i11, t11);
        ListChangeRegistry listChangeRegistry = this.mListeners;
        if (listChangeRegistry != null) {
            listChangeRegistry.notifyChanged(this, i11, 1);
        }
        return t12;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i11, T t11) {
        super.add(i11, t11);
        notifyAdd(i11, 1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i11, Collection<? extends T> collection) {
        boolean addAll = super.addAll(i11, collection);
        if (addAll) {
            notifyAdd(i11, collection.size());
        }
        return addAll;
    }
}
