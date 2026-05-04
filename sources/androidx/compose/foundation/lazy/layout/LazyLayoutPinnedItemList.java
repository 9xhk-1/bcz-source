package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.u;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyLayoutPinnedItemList implements List<PinnedItem>, y00.a {
    public static final int $stable = 8;

    @k
    private final List<PinnedItem> items;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface PinnedItem {
        int getIndex();

        @l
        Object getKey();
    }

    private LazyLayoutPinnedItemList(List<PinnedItem> list) {
        this.items = list;
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i11, PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection<? extends PinnedItem> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addFirst(PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addLast(PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@k PinnedItem pinnedItem) {
        return this.items.contains(pinnedItem);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@k Collection<? extends Object> collection) {
        return this.items.containsAll(collection);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    @k
    public PinnedItem get(int i11) {
        return this.items.get(i11);
    }

    public int getSize() {
        return this.items.size();
    }

    public int indexOf(@k PinnedItem pinnedItem) {
        return this.items.indexOf(pinnedItem);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @k
    public Iterator<PinnedItem> iterator() {
        return this.items.iterator();
    }

    public int lastIndexOf(@k PinnedItem pinnedItem) {
        return this.items.lastIndexOf(pinnedItem);
    }

    @Override // java.util.List
    @k
    public ListIterator<PinnedItem> listIterator() {
        return this.items.listIterator();
    }

    public final void pin$foundation_release(@k PinnedItem pinnedItem) {
        this.items.add(pinnedItem);
    }

    public final void release$foundation_release(@k PinnedItem pinnedItem) {
        this.items.remove(pinnedItem);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public PinnedItem remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public PinnedItem removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public PinnedItem removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<PinnedItem> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public PinnedItem set2(int i11, PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super PinnedItem> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @k
    public List<PinnedItem> subList(int i11, int i12) {
        return this.items.subList(i11, i12);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return u.a(this);
    }

    public LazyLayoutPinnedItemList() {
        this(new SnapshotStateList());
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i11, PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends PinnedItem> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof PinnedItem) {
            return contains((PinnedItem) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof PinnedItem) {
            return indexOf((PinnedItem) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof PinnedItem) {
            return lastIndexOf((PinnedItem) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @k
    public ListIterator<PinnedItem> listIterator(int i11) {
        return this.items.listIterator(i11);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ PinnedItem remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeFirst, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m901removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeLast, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m902removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ PinnedItem set(int i11, PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) u.b(this, tArr);
    }

    public boolean add(PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
