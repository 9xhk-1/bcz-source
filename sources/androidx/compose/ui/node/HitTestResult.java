package androidx.compose.ui.node;

import a00.h0;
import androidx.collection.MutableLongList;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,410:1\n100#1:411\n113#1,10:412\n113#1,10:422\n113#1,10:432\n113#1,10:442\n113#1,10:452\n100#1:462\n113#1,10:463\n100#1:473\n113#1,10:474\n1855#2,2:484\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n92#1:411\n92#1:412,10\n100#1:422,10\n131#1:432,10\n144#1:442,10\n156#1:452,10\n176#1:462\n176#1:463,10\n194#1:473\n194#1:474,10\n249#1:484,2\n*E\n"})
/* loaded from: classes2.dex */
public final class HitTestResult implements List<Modifier.Node>, y00.a {
    public static final int $stable = 8;

    @k
    private MutableObjectList<Object> values = new MutableObjectList<>(16);

    @k
    private MutableLongList distanceFromEdgeAndFlags = new MutableLongList(16);
    private int hitDepth = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class HitTestResultIterator implements ListIterator<Modifier.Node>, y00.a {
        private int index;
        private final int maxIndex;
        private final int minIndex;

        public HitTestResultIterator(int i11, int i12, int i13) {
            this.index = i11;
            this.minIndex = i12;
            this.maxIndex = i13;
        }

        /* renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i11) {
            this.index = i11;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator, java.util.Iterator
        @k
        public Modifier.Node next() {
            MutableObjectList mutableObjectList = HitTestResult.this.values;
            int i11 = this.index;
            this.index = i11 + 1;
            E e11 = mutableObjectList.get(i11);
            g0.n(e11, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) e11;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator
        @k
        public Modifier.Node previous() {
            MutableObjectList mutableObjectList = HitTestResult.this.values;
            int i11 = this.index - 1;
            this.index = i11;
            E e11 = mutableObjectList.get(i11);
            g0.n(e11, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) e11;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ HitTestResultIterator(HitTestResult hitTestResult, int i11, int i12, int i13, int i14, v vVar) {
            this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? hitTestResult.size() : i13);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,410:1\n1855#2,2:411\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n*L\n323#1:411,2\n*E\n"})
    public final class SubList implements List<Modifier.Node>, y00.a {
        private final int maxIndex;
        private final int minIndex;

        public SubList(int i11, int i12) {
            this.minIndex = i11;
            this.maxIndex = i12;
        }

        /* renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(int i11, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i11, Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void addFirst(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void addLast(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Modifier.Node) {
                return contains((Modifier.Node) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@k Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        public int getSize() {
            return this.maxIndex - this.minIndex;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return indexOf((Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @k
        public Iterator<Modifier.Node> iterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i11 = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i11, i11, this.maxIndex);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return lastIndexOf((Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List
        @k
        public ListIterator<Modifier.Node> listIterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i11 = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i11, i11, this.maxIndex);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        public Modifier.Node remove(int i11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Modifier.Node removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Modifier.Node removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public Modifier.Node set2(int i11, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public void sort(Comparator<? super Modifier.Node> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @k
        public List<Modifier.Node> subList(int i11, int i12) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i13 = this.minIndex;
            return hitTestResult.new SubList(i11 + i13, i13 + i12);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return u.a(this);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i11, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean contains(@k Modifier.Node node) {
            return indexOf((Object) node) != -1;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        @k
        public Modifier.Node get(int i11) {
            E e11 = HitTestResult.this.values.get(i11 + this.minIndex);
            g0.n(e11, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) e11;
        }

        public int indexOf(@k Modifier.Node node) {
            int i11 = this.minIndex;
            int i12 = this.maxIndex;
            if (i11 > i12) {
                return -1;
            }
            while (!g0.g(HitTestResult.this.values.get(i11), node)) {
                if (i11 == i12) {
                    return -1;
                }
                i11++;
            }
            return i11 - this.minIndex;
        }

        public int lastIndexOf(@k Modifier.Node node) {
            int i11 = this.maxIndex;
            int i12 = this.minIndex;
            if (i12 > i11) {
                return -1;
            }
            while (!g0.g(HitTestResult.this.values.get(i11), node)) {
                if (i11 == i12) {
                    return -1;
                }
                i11--;
            }
            return i11 - this.minIndex;
        }

        @Override // java.util.List
        @k
        public ListIterator<Modifier.Node> listIterator(int i11) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i12 = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i11 + i12, i12, this.maxIndex);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node remove(int i11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: removeFirst, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Object m4021removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: removeLast, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Object m4022removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node set(int i11, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) u.b(this, tArr);
        }

        public boolean add(Modifier.Node node) {
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

    /* renamed from: findBestHitDistance-fn2tFes, reason: not valid java name */
    private final long m4018findBestHitDistancefn2tFes() {
        long DistanceAndFlags$default = HitTestResultKt.DistanceAndFlags$default(Float.POSITIVE_INFINITY, false, false, 4, null);
        int i11 = this.hitDepth + 1;
        int L = h0.L(this);
        if (i11 <= L) {
            while (true) {
                long m3996constructorimpl = DistanceAndFlags.m3996constructorimpl(this.distanceFromEdgeAndFlags.get(i11));
                if (DistanceAndFlags.m3995compareTo9YPOF3E(m3996constructorimpl, DistanceAndFlags$default) < 0) {
                    DistanceAndFlags$default = m3996constructorimpl;
                }
                if ((DistanceAndFlags.m3999getDistanceimpl(DistanceAndFlags$default) < 0.0f && DistanceAndFlags.m4002isInLayerimpl(DistanceAndFlags$default)) || i11 == L) {
                    break;
                }
                i11++;
            }
        }
        return DistanceAndFlags$default;
    }

    private final void removeNodeAtDepth(int i11) {
        this.values.removeAt(i11);
        this.distanceFromEdgeAndFlags.removeAt(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeNodesInRange(int i11, int i12) {
        if (i11 >= i12) {
            return;
        }
        this.values.removeRange(i11, i12);
        this.distanceFromEdgeAndFlags.removeRange(i11, i12);
    }

    public final void acceptHits() {
        this.hitDepth = size() - 1;
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i11, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addFirst(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addLast(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        this.values.clear();
        this.distanceFromEdgeAndFlags.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Modifier.Node) {
            return contains((Modifier.Node) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@k Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.values.getSize();
    }

    public final boolean hasHit() {
        long m4018findBestHitDistancefn2tFes = m4018findBestHitDistancefn2tFes();
        return DistanceAndFlags.m3999getDistanceimpl(m4018findBestHitDistancefn2tFes) < 0.0f && DistanceAndFlags.m4002isInLayerimpl(m4018findBestHitDistancefn2tFes) && !DistanceAndFlags.m4001isInExpandedBoundsimpl(m4018findBestHitDistancefn2tFes);
    }

    public final void hit(@k Modifier.Node node, boolean z11, @k x00.a<g2> aVar) {
        long DistanceAndFlags;
        int i11 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        MutableLongList mutableLongList = this.distanceFromEdgeAndFlags;
        DistanceAndFlags = HitTestResultKt.DistanceAndFlags(-1.0f, z11, false);
        mutableLongList.add(DistanceAndFlags);
        aVar.invoke();
        this.hitDepth = i11;
    }

    public final void hitExpandedTouchBounds(@k Modifier.Node node, boolean z11, @k x00.a<g2> aVar) {
        long DistanceAndFlags;
        long DistanceAndFlags2;
        long DistanceAndFlags3;
        if (this.hitDepth == h0.L(this)) {
            int i11 = this.hitDepth;
            removeNodesInRange(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.add(node);
            MutableLongList mutableLongList = this.distanceFromEdgeAndFlags;
            DistanceAndFlags3 = HitTestResultKt.DistanceAndFlags(0.0f, z11, true);
            mutableLongList.add(DistanceAndFlags3);
            aVar.invoke();
            this.hitDepth = i11;
            return;
        }
        long m4018findBestHitDistancefn2tFes = m4018findBestHitDistancefn2tFes();
        int i12 = this.hitDepth;
        if (!DistanceAndFlags.m4001isInExpandedBoundsimpl(m4018findBestHitDistancefn2tFes)) {
            if (DistanceAndFlags.m3999getDistanceimpl(m4018findBestHitDistancefn2tFes) > 0.0f) {
                int i13 = this.hitDepth;
                removeNodesInRange(this.hitDepth + 1, size());
                this.hitDepth++;
                this.values.add(node);
                MutableLongList mutableLongList2 = this.distanceFromEdgeAndFlags;
                DistanceAndFlags = HitTestResultKt.DistanceAndFlags(0.0f, z11, true);
                mutableLongList2.add(DistanceAndFlags);
                aVar.invoke();
                this.hitDepth = i13;
                return;
            }
            return;
        }
        this.hitDepth = h0.L(this);
        int i14 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        MutableLongList mutableLongList3 = this.distanceFromEdgeAndFlags;
        DistanceAndFlags2 = HitTestResultKt.DistanceAndFlags(0.0f, z11, true);
        mutableLongList3.add(DistanceAndFlags2);
        aVar.invoke();
        this.hitDepth = i14;
        if (DistanceAndFlags.m3999getDistanceimpl(m4018findBestHitDistancefn2tFes()) < 0.0f) {
            removeNodesInRange(i12 + 1, this.hitDepth + 1);
        }
        this.hitDepth = i12;
    }

    public final void hitInMinimumTouchTarget(@k Modifier.Node node, float f11, boolean z11, boolean z12, @k x00.a<g2> aVar) {
        long DistanceAndFlags;
        int i11 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        MutableLongList mutableLongList = this.distanceFromEdgeAndFlags;
        DistanceAndFlags = HitTestResultKt.DistanceAndFlags(f11, z11, z12);
        mutableLongList.add(DistanceAndFlags);
        aVar.invoke();
        this.hitDepth = i11;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return indexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    public final boolean isHitInMinimumTouchTargetBetter(float f11, boolean z11) {
        if (this.hitDepth == h0.L(this)) {
            return true;
        }
        return DistanceAndFlags.m3995compareTo9YPOF3E(m4018findBestHitDistancefn2tFes(), HitTestResultKt.DistanceAndFlags$default(f11, z11, false, 4, null)) > 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @k
    public Iterator<Modifier.Node> iterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return lastIndexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @k
    public ListIterator<Modifier.Node> listIterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Modifier.Node remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Modifier.Node removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Modifier.Node removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public Modifier.Node set2(int i11, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void siblingHits(@k x00.a<g2> aVar) {
        int i11 = this.hitDepth;
        aVar.invoke();
        this.hitDepth = i11;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super Modifier.Node> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void speculativeHit(@k Modifier.Node node, float f11, boolean z11, @k x00.a<g2> aVar) {
        long DistanceAndFlags;
        long DistanceAndFlags2;
        if (this.hitDepth == h0.L(this)) {
            int i11 = this.hitDepth;
            removeNodesInRange(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.add(node);
            MutableLongList mutableLongList = this.distanceFromEdgeAndFlags;
            DistanceAndFlags2 = HitTestResultKt.DistanceAndFlags(f11, z11, false);
            mutableLongList.add(DistanceAndFlags2);
            aVar.invoke();
            this.hitDepth = i11;
            if (this.hitDepth + 1 == h0.L(this) || DistanceAndFlags.m4001isInExpandedBoundsimpl(m4018findBestHitDistancefn2tFes())) {
                removeNodeAtDepth(this.hitDepth + 1);
                return;
            }
            return;
        }
        long m4018findBestHitDistancefn2tFes = m4018findBestHitDistancefn2tFes();
        int i12 = this.hitDepth;
        this.hitDepth = h0.L(this);
        int i13 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        MutableLongList mutableLongList2 = this.distanceFromEdgeAndFlags;
        DistanceAndFlags = HitTestResultKt.DistanceAndFlags(f11, z11, false);
        mutableLongList2.add(DistanceAndFlags);
        aVar.invoke();
        this.hitDepth = i13;
        long m4018findBestHitDistancefn2tFes2 = m4018findBestHitDistancefn2tFes();
        if (this.hitDepth + 1 >= h0.L(this) || DistanceAndFlags.m3995compareTo9YPOF3E(m4018findBestHitDistancefn2tFes, m4018findBestHitDistancefn2tFes2) <= 0) {
            removeNodesInRange(this.hitDepth + 1, size());
        } else {
            removeNodesInRange(i12 + 1, DistanceAndFlags.m4001isInExpandedBoundsimpl(m4018findBestHitDistancefn2tFes2) ? this.hitDepth + 2 : this.hitDepth + 1);
        }
        this.hitDepth = i12;
    }

    @Override // java.util.List
    @k
    public List<Modifier.Node> subList(int i11, int i12) {
        return new SubList(i11, i12);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return u.a(this);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i11, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@k Modifier.Node node) {
        return indexOf((Object) node) != -1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    @k
    public Modifier.Node get(int i11) {
        Object obj = this.values.get(i11);
        g0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Modifier.Node) obj;
    }

    public int indexOf(@k Modifier.Node node) {
        int L = h0.L(this);
        if (L < 0) {
            return -1;
        }
        int i11 = 0;
        while (!g0.g(this.values.get(i11), node)) {
            if (i11 == L) {
                return -1;
            }
            i11++;
        }
        return i11;
    }

    public int lastIndexOf(@k Modifier.Node node) {
        for (int L = h0.L(this); -1 < L; L--) {
            if (g0.g(this.values.get(L), node)) {
                return L;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @k
    public ListIterator<Modifier.Node> listIterator(int i11) {
        return new HitTestResultIterator(this, i11, 0, 0, 6, null);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeFirst, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m4019removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeLast, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m4020removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node set(int i11, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) u.b(this, tArr);
    }

    public boolean add(Modifier.Node node) {
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

    public final void hitInMinimumTouchTarget(@k Modifier.Node node, float f11, boolean z11, @k x00.a<g2> aVar) {
        long DistanceAndFlags;
        int i11 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.add(node);
        MutableLongList mutableLongList = this.distanceFromEdgeAndFlags;
        DistanceAndFlags = HitTestResultKt.DistanceAndFlags(f11, z11, false);
        mutableLongList.add(DistanceAndFlags);
        aVar.invoke();
        this.hitDepth = i11;
    }
}
