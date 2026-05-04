package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import a00.h;
import a00.q;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import g10.u;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nPersistentVectorBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,995:1\n33#2,5:996\n33#2,5:1001\n33#2,5:1007\n33#2,5:1012\n33#2,5:1017\n1#3:1006\n*S KotlinDebug\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n*L\n242#1:996,5\n243#1:1001,5\n480#1:1007,5\n746#1:1012,5\n769#1:1017,5\n*E\n"})
/* loaded from: classes.dex */
public final class PersistentVectorBuilder<E> extends h<E> implements PersistentList.Builder<E> {
    public static final int $stable = 8;

    @k
    private MutabilityOwnership ownership = new MutabilityOwnership();

    @l
    private Object[] root;
    private int rootShift;
    private int size;

    @k
    private Object[] tail;

    @k
    private PersistentList<? extends E> vector;

    @l
    private Object[] vectorRoot;

    @k
    private Object[] vectorTail;

    public PersistentVectorBuilder(@k PersistentList<? extends E> persistentList, @l Object[] objArr, @k Object[] objArr2, int i11) {
        this.vector = persistentList;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i11;
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    private final Object[] bufferFor(int i11) {
        if (rootSize() <= i11) {
            return this.tail;
        }
        Object[] objArr = this.root;
        g0.m(objArr);
        for (int i12 = this.rootShift; i12 > 0; i12 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i11, i12)];
            g0.n(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] copyToBuffer(Object[] objArr, int i11, Iterator<? extends Object> it) {
        while (i11 < 32 && it.hasNext()) {
            objArr[i11] = it.next();
            i11++;
        }
        return objArr;
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i11, int i12, Object obj, ObjectRef objectRef) {
        Object obj2;
        int indexSegment = UtilsKt.indexSegment(i12, i11);
        if (i11 == 0) {
            objectRef.setValue(objArr[31]);
            Object[] B0 = q.B0(objArr, makeMutable(objArr), indexSegment + 1, indexSegment, 31);
            B0[indexSegment] = obj;
            return B0;
        }
        Object[] makeMutable = makeMutable(objArr);
        int i13 = i11 - 5;
        Object obj3 = makeMutable[indexSegment];
        g0.n(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        makeMutable[indexSegment] = insertIntoRoot((Object[]) obj3, i13, i12, obj, objectRef);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || (obj2 = makeMutable[indexSegment]) == null) {
                break;
            }
            g0.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            makeMutable[indexSegment] = insertIntoRoot((Object[]) obj2, i13, 0, objectRef.getValue(), objectRef);
        }
        return makeMutable;
    }

    private final void insertIntoTail(Object[] objArr, int i11, E e11) {
        int tailSize = tailSize();
        Object[] makeMutable = makeMutable(this.tail);
        if (tailSize < 32) {
            q.B0(this.tail, makeMutable, i11 + 1, i11, tailSize);
            makeMutable[i11] = e11;
            this.root = objArr;
            this.tail = makeMutable;
            this.size = size() + 1;
            return;
        }
        Object[] objArr2 = this.tail;
        Object obj = objArr2[31];
        q.B0(objArr2, makeMutable, i11 + 1, i11, 31);
        makeMutable[i11] = e11;
        pushFilledTail(objArr, makeMutable, mutableBufferWith(obj));
    }

    private final boolean isMutable(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.ownership;
    }

    private final ListIterator<Object[]> leafBufferIterator(int i11) {
        Object[] objArr = this.root;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int rootSize = rootSize() >> 5;
        ListImplementation.checkPositionIndex$runtime_release(i11, rootSize);
        int i12 = this.rootShift;
        return i12 == 0 ? new SingleElementListIterator(objArr, i11) : new TrieIterator(objArr, i11, rootSize, i12 / 5);
    }

    private final Object[] makeMutable(Object[] objArr) {
        return objArr == null ? mutableBuffer() : isMutable(objArr) ? objArr : q.K0(objArr, mutableBuffer(), 0, 0, u.B(objArr.length, 32), 6, null);
    }

    private final Object[] makeMutableShiftingRight(Object[] objArr, int i11) {
        return isMutable(objArr) ? q.B0(objArr, objArr, i11, 0, 32 - i11) : q.B0(objArr, mutableBuffer(), i11, 0, 32 - i11);
    }

    private final Object[] mutableBuffer() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] mutableBufferWith(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] nullifyAfter(Object[] objArr, int i11, int i12) {
        if (!(i12 >= 0)) {
            PreconditionsKt.throwIllegalArgumentException("shift should be positive");
        }
        if (i12 == 0) {
            return objArr;
        }
        int indexSegment = UtilsKt.indexSegment(i11, i12);
        Object obj = objArr[indexSegment];
        g0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object nullifyAfter = nullifyAfter((Object[]) obj, i11, i12 - 5);
        if (indexSegment < 31) {
            int i13 = indexSegment + 1;
            if (objArr[i13] != null) {
                if (isMutable(objArr)) {
                    q.M1(objArr, null, i13, 32);
                }
                objArr = q.B0(objArr, mutableBuffer(), 0, 0, i13);
            }
        }
        if (nullifyAfter == objArr[indexSegment]) {
            return objArr;
        }
        Object[] makeMutable = makeMutable(objArr);
        makeMutable[indexSegment] = nullifyAfter;
        return makeMutable;
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i11, int i12, ObjectRef objectRef) {
        Object[] pullLastBuffer;
        int indexSegment = UtilsKt.indexSegment(i12 - 1, i11);
        if (i11 == 5) {
            objectRef.setValue(objArr[indexSegment]);
            pullLastBuffer = null;
        } else {
            Object obj = objArr[indexSegment];
            g0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            pullLastBuffer = pullLastBuffer((Object[]) obj, i11 - 5, i12, objectRef);
        }
        if (pullLastBuffer == null && indexSegment == 0) {
            return null;
        }
        Object[] makeMutable = makeMutable(objArr);
        makeMutable[indexSegment] = pullLastBuffer;
        return makeMutable;
    }

    private final void pullLastBufferFromRoot(Object[] objArr, int i11, int i12) {
        if (i12 == 0) {
            this.root = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.tail = objArr;
            this.size = i11;
            this.rootShift = i12;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        g0.m(objArr);
        Object[] pullLastBuffer = pullLastBuffer(objArr, i12, i11, objectRef);
        g0.m(pullLastBuffer);
        Object value = objectRef.getValue();
        g0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.tail = (Object[]) value;
        this.size = i11;
        if (pullLastBuffer[1] == null) {
            this.root = (Object[]) pullLastBuffer[0];
            this.rootShift = i12 - 5;
        } else {
            this.root = pullLastBuffer;
            this.rootShift = i12;
        }
    }

    private final Object[] pushBuffers(Object[] objArr, int i11, int i12, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            PreconditionsKt.throwIllegalArgumentException("invalid buffersIterator");
        }
        if (!(i12 >= 0)) {
            PreconditionsKt.throwIllegalArgumentException("negative shift");
        }
        if (i12 == 0) {
            return it.next();
        }
        Object[] makeMutable = makeMutable(objArr);
        int indexSegment = UtilsKt.indexSegment(i11, i12);
        int i13 = i12 - 5;
        makeMutable[indexSegment] = pushBuffers((Object[]) makeMutable[indexSegment], i11, i13, it);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || !it.hasNext()) {
                break;
            }
            makeMutable[indexSegment] = pushBuffers((Object[]) makeMutable[indexSegment], 0, i13, it);
        }
        return makeMutable;
    }

    private final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] objArr, int i11, Object[][] objArr2) {
        Iterator<Object[]> a11 = kotlin.jvm.internal.h.a(objArr2);
        int i12 = i11 >> 5;
        int i13 = this.rootShift;
        Object[] pushBuffers = i12 < (1 << i13) ? pushBuffers(objArr, i11, i13, a11) : makeMutable(objArr);
        while (a11.hasNext()) {
            this.rootShift += 5;
            pushBuffers = mutableBufferWith(pushBuffers);
            int i14 = this.rootShift;
            pushBuffers(pushBuffers, 1 << i14, i14, a11);
        }
        return pushBuffers;
    }

    private final void pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i11 = this.rootShift;
        if (size > (1 << i11)) {
            this.root = pushTail(mutableBufferWith(objArr), objArr2, this.rootShift + 5);
            this.tail = objArr3;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (objArr == null) {
            this.root = objArr2;
            this.tail = objArr3;
            this.size = size() + 1;
        } else {
            this.root = pushTail(objArr, objArr2, i11);
            this.tail = objArr3;
            this.size = size() + 1;
        }
    }

    private final Object[] pushTail(Object[] objArr, Object[] objArr2, int i11) {
        int indexSegment = UtilsKt.indexSegment(size() - 1, i11);
        Object[] makeMutable = makeMutable(objArr);
        if (i11 == 5) {
            makeMutable[indexSegment] = objArr2;
            return makeMutable;
        }
        makeMutable[indexSegment] = pushTail((Object[]) makeMutable[indexSegment], objArr2, i11 - 5);
        return makeMutable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int recyclableRemoveAll(x00.l<? super E, Boolean> lVar, Object[] objArr, int i11, int i12, ObjectRef objectRef, List<Object[]> list, List<Object[]> list2) {
        if (isMutable(objArr)) {
            list.add(objArr);
        }
        Object value = objectRef.getValue();
        g0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) value;
        Object[] objArr3 = objArr2;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (!lVar.invoke(obj).booleanValue()) {
                if (i12 == 32) {
                    objArr3 = !list.isEmpty() ? list.remove(list.size() - 1) : mutableBuffer();
                    i12 = 0;
                }
                objArr3[i12] = obj;
                i12++;
            }
        }
        objectRef.setValue(objArr3);
        if (objArr2 != objectRef.getValue()) {
            list2.add(objArr2);
        }
        return i12;
    }

    private final int removeAllFromTail(x00.l<? super E, Boolean> lVar, int i11, ObjectRef objectRef) {
        int removeAll = removeAll(lVar, this.tail, i11, objectRef);
        if (removeAll == i11) {
            CommonFunctionsKt.m2064assert(objectRef.getValue() == this.tail);
            return i11;
        }
        Object value = objectRef.getValue();
        g0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        q.M1(objArr, null, removeAll, i11);
        this.tail = objArr;
        this.size = size() - (i11 - removeAll);
        return removeAll;
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i11, int i12, ObjectRef objectRef) {
        int indexSegment = UtilsKt.indexSegment(i12, i11);
        if (i11 == 0) {
            Object obj = objArr[indexSegment];
            Object[] B0 = q.B0(objArr, makeMutable(objArr), indexSegment, indexSegment + 1, 32);
            B0[31] = objectRef.getValue();
            objectRef.setValue(obj);
            return B0;
        }
        int indexSegment2 = objArr[31] == null ? UtilsKt.indexSegment(rootSize() - 1, i11) : 31;
        Object[] makeMutable = makeMutable(objArr);
        int i13 = i11 - 5;
        int i14 = indexSegment + 1;
        if (i14 <= indexSegment2) {
            while (true) {
                Object obj2 = makeMutable[indexSegment2];
                g0.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                makeMutable[indexSegment2] = removeFromRootAt((Object[]) obj2, i13, 0, objectRef);
                if (indexSegment2 == i14) {
                    break;
                }
                indexSegment2--;
            }
        }
        Object obj3 = makeMutable[indexSegment];
        g0.n(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        makeMutable[indexSegment] = removeFromRootAt((Object[]) obj3, i13, i12, objectRef);
        return makeMutable;
    }

    private final Object removeFromTailAt(Object[] objArr, int i11, int i12, int i13) {
        int size = size() - i11;
        CommonFunctionsKt.m2064assert(i13 < size);
        if (size == 1) {
            Object obj = this.tail[0];
            pullLastBufferFromRoot(objArr, i11, i12);
            return obj;
        }
        Object[] objArr2 = this.tail;
        Object obj2 = objArr2[i13];
        Object[] B0 = q.B0(objArr2, makeMutable(objArr2), i13, i13 + 1, size);
        B0[size - 1] = null;
        this.root = objArr;
        this.tail = B0;
        this.size = (i11 + size) - 1;
        this.rootShift = i12;
        return obj2;
    }

    private final Object[] retainFirst(Object[] objArr, int i11) {
        if (!((i11 & 31) == 0)) {
            PreconditionsKt.throwIllegalArgumentException("invalid size");
        }
        if (i11 == 0) {
            this.rootShift = 0;
            return null;
        }
        int i12 = i11 - 1;
        while (true) {
            int i13 = this.rootShift;
            if ((i12 >> i13) != 0) {
                return nullifyAfter(objArr, i12, i13);
            }
            this.rootShift = i13 - 5;
            Object[] objArr2 = objArr[0];
            g0.n(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
    }

    private final int rootSize() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.rootSize(size());
    }

    private final Object[] setInRoot(Object[] objArr, int i11, int i12, E e11, ObjectRef objectRef) {
        int indexSegment = UtilsKt.indexSegment(i12, i11);
        Object[] makeMutable = makeMutable(objArr);
        if (i11 != 0) {
            Object obj = makeMutable[indexSegment];
            g0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            makeMutable[indexSegment] = setInRoot((Object[]) obj, i11 - 5, i12, e11, objectRef);
            return makeMutable;
        }
        if (makeMutable != objArr) {
            ((AbstractList) this).modCount++;
        }
        objectRef.setValue(makeMutable[indexSegment]);
        makeMutable[indexSegment] = e11;
        return makeMutable;
    }

    private final Object[] shiftLeafBuffers(int i11, int i12, Object[][] objArr, int i13, Object[] objArr2) {
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator<Object[]> leafBufferIterator = leafBufferIterator(rootSize() >> 5);
        while (leafBufferIterator.previousIndex() != i11) {
            Object[] previous = leafBufferIterator.previous();
            q.B0(previous, objArr2, 0, 32 - i12, 32);
            objArr2 = makeMutableShiftingRight(previous, i12);
            i13--;
            objArr[i13] = objArr2;
        }
        return leafBufferIterator.previous();
    }

    private final void splitToBuffers(Collection<? extends E> collection, int i11, Object[] objArr, int i12, Object[][] objArr2, int i13, Object[] objArr3) {
        Object[] mutableBuffer;
        if (!(i13 >= 1)) {
            PreconditionsKt.throwIllegalArgumentException("requires at least one nullBuffer");
        }
        Object[] makeMutable = makeMutable(objArr);
        objArr2[0] = makeMutable;
        int i14 = i11 & 31;
        int size = ((i11 + collection.size()) - 1) & 31;
        int i15 = (i12 - i14) + size;
        if (i15 < 32) {
            q.B0(makeMutable, objArr3, size + 1, i14, i12);
        } else {
            int i16 = i15 - 31;
            if (i13 == 1) {
                mutableBuffer = makeMutable;
            } else {
                mutableBuffer = mutableBuffer();
                i13--;
                objArr2[i13] = mutableBuffer;
            }
            int i17 = i12 - i16;
            q.B0(makeMutable, objArr3, 0, i17, i12);
            q.B0(makeMutable, mutableBuffer, size + 1, i14, i17);
            objArr3 = mutableBuffer;
        }
        Iterator<? extends E> it = collection.iterator();
        copyToBuffer(makeMutable, i14, it);
        for (int i18 = 1; i18 < i13; i18++) {
            objArr2[i18] = copyToBuffer(mutableBuffer(), 0, it);
        }
        copyToBuffer(objArr3, 0, it);
    }

    private final int tailSize(int i11) {
        return i11 <= 32 ? i11 : i11 - UtilsKt.rootSize(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e11) {
        ((AbstractList) this).modCount++;
        int tailSize = tailSize();
        if (tailSize < 32) {
            Object[] makeMutable = makeMutable(this.tail);
            makeMutable[tailSize] = e11;
            this.tail = makeMutable;
            this.size = size() + 1;
        } else {
            pushFilledTail(this.root, this.tail, mutableBufferWith(e11));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@k Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int tailSize = tailSize();
        Iterator<? extends E> it = collection.iterator();
        if (32 - tailSize >= collection.size()) {
            this.tail = copyToBuffer(makeMutable(this.tail), tailSize, it);
            this.size = size() + collection.size();
        } else {
            int size = ((collection.size() + tailSize) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = copyToBuffer(makeMutable(this.tail), tailSize, it);
            for (int i11 = 1; i11 < size; i11++) {
                objArr[i11] = copyToBuffer(mutableBuffer(), 0, it);
            }
            this.root = pushBuffersIncreasingHeightIfNeeded(this.root, rootSize(), objArr);
            this.tail = copyToBuffer(mutableBuffer(), 0, it);
            this.size = size() + collection.size();
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i11) {
        ListImplementation.checkElementIndex$runtime_release(i11, size());
        return (E) bufferFor(i11)[i11 & 31];
    }

    public final int getModCount$runtime_release() {
        return ((AbstractList) this).modCount;
    }

    @l
    public final Object[] getRoot$runtime_release() {
        return this.root;
    }

    public final int getRootShift$runtime_release() {
        return this.rootShift;
    }

    @Override // a00.h
    public int getSize() {
        return this.size;
    }

    @k
    public final Object[] getTail$runtime_release() {
        return this.tail;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @k
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    @k
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@k final Collection<? extends Object> collection) {
        return removeAllWithPredicate(new x00.l<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder$removeAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.l
            public final Boolean invoke(E e11) {
                return Boolean.valueOf(collection.contains(e11));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.l
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((PersistentVectorBuilder$removeAll$1<E>) obj);
            }
        });
    }

    public final boolean removeAllWithPredicate(@k x00.l<? super E, Boolean> lVar) {
        boolean removeAll = removeAll(lVar);
        if (removeAll) {
            ((AbstractList) this).modCount++;
        }
        return removeAll;
    }

    @Override // a00.h
    public E removeAt(int i11) {
        ListImplementation.checkElementIndex$runtime_release(i11, size());
        ((AbstractList) this).modCount++;
        int rootSize = rootSize();
        if (i11 >= rootSize) {
            return (E) removeFromTailAt(this.root, rootSize, this.rootShift, i11 - rootSize);
        }
        ObjectRef objectRef = new ObjectRef(this.tail[0]);
        Object[] objArr = this.root;
        g0.m(objArr);
        removeFromTailAt(removeFromRootAt(objArr, this.rootShift, i11, objectRef), rootSize, this.rootShift, 0);
        return (E) objectRef.getValue();
    }

    @Override // a00.h, java.util.AbstractList, java.util.List
    public E set(int i11, E e11) {
        ListImplementation.checkElementIndex$runtime_release(i11, size());
        if (rootSize() > i11) {
            ObjectRef objectRef = new ObjectRef(null);
            Object[] objArr = this.root;
            g0.m(objArr);
            this.root = setInRoot(objArr, this.rootShift, i11, e11, objectRef);
            return (E) objectRef.getValue();
        }
        Object[] makeMutable = makeMutable(this.tail);
        if (makeMutable != this.tail) {
            ((AbstractList) this).modCount++;
        }
        int i12 = i11 & 31;
        E e12 = (E) makeMutable[i12];
        makeMutable[i12] = e11;
        this.tail = makeMutable;
        return e12;
    }

    public final void setRootShift$runtime_release(int i11) {
        this.rootShift = i11;
    }

    private final boolean removeAll(x00.l<? super E, Boolean> lVar) {
        Object[] pushBuffers;
        int tailSize = tailSize();
        ObjectRef objectRef = new ObjectRef(null);
        if (this.root == null) {
            return removeAllFromTail(lVar, tailSize, objectRef) != tailSize;
        }
        ListIterator<Object[]> leafBufferIterator = leafBufferIterator(0);
        int i11 = 32;
        while (i11 == 32 && leafBufferIterator.hasNext()) {
            i11 = removeAll(lVar, leafBufferIterator.next(), 32, objectRef);
        }
        if (i11 == 32) {
            CommonFunctionsKt.m2064assert(!leafBufferIterator.hasNext());
            int removeAllFromTail = removeAllFromTail(lVar, tailSize, objectRef);
            if (removeAllFromTail == 0) {
                pullLastBufferFromRoot(this.root, size(), this.rootShift);
            }
            return removeAllFromTail != tailSize;
        }
        int previousIndex = leafBufferIterator.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i12 = i11;
        while (leafBufferIterator.hasNext()) {
            i12 = recyclableRemoveAll(lVar, leafBufferIterator.next(), 32, i12, objectRef, arrayList2, arrayList);
        }
        int recyclableRemoveAll = recyclableRemoveAll(lVar, this.tail, tailSize, i12, objectRef, arrayList2, arrayList);
        Object value = objectRef.getValue();
        g0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        q.M1(objArr, null, recyclableRemoveAll, 32);
        if (arrayList.isEmpty()) {
            pushBuffers = this.root;
            g0.m(pushBuffers);
        } else {
            pushBuffers = pushBuffers(this.root, previousIndex, this.rootShift, arrayList.iterator());
        }
        int size = previousIndex + (arrayList.size() << 5);
        this.root = retainFirst(pushBuffers, size);
        this.tail = objArr;
        this.size = size + recyclableRemoveAll;
        return true;
    }

    private final int tailSize() {
        return tailSize(size());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    @k
    public PersistentList<E> build() {
        PersistentVector persistentVector;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            persistentVector = this.vector;
        } else {
            this.ownership = new MutabilityOwnership();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.root;
                g0.m(objArr3);
                persistentVector = new PersistentVector(objArr3, this.tail, size(), this.rootShift);
            } else if (objArr2.length == 0) {
                persistentVector = UtilsKt.persistentVectorOf();
            } else {
                Object[] copyOf = Arrays.copyOf(this.tail, size());
                g0.o(copyOf, "copyOf(...)");
                persistentVector = new SmallPersistentVector(copyOf);
            }
        }
        this.vector = persistentVector;
        return (PersistentList<E>) persistentVector;
    }

    @Override // java.util.AbstractList, java.util.List
    @k
    public ListIterator<E> listIterator(int i11) {
        ListImplementation.checkPositionIndex$runtime_release(i11, size());
        return new PersistentVectorMutableIterator(this, i11);
    }

    private final void insertIntoRoot(Collection<? extends E> collection, int i11, int i12, Object[][] objArr, int i13, Object[] objArr2) {
        Object[] objArr3;
        if (this.root != null) {
            int i14 = i11 >> 5;
            Object[] shiftLeafBuffers = shiftLeafBuffers(i14, i12, objArr, i13, objArr2);
            int rootSize = i13 - (((rootSize() >> 5) - 1) - i14);
            if (rootSize < i13) {
                Object[] objArr4 = objArr[rootSize];
                g0.m(objArr4);
                objArr3 = objArr4;
            } else {
                objArr3 = objArr2;
            }
            splitToBuffers(collection, i11, shiftLeafBuffers, 32, objArr, rootSize, objArr3);
            return;
        }
        throw new IllegalStateException("root is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a00.h, java.util.AbstractList, java.util.List
    public void add(int i11, E e11) {
        ListImplementation.checkPositionIndex$runtime_release(i11, size());
        if (i11 == size()) {
            add(e11);
            return;
        }
        ((AbstractList) this).modCount++;
        int rootSize = rootSize();
        if (i11 >= rootSize) {
            insertIntoTail(this.root, i11 - rootSize, e11);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        g0.m(objArr);
        insertIntoTail(insertIntoRoot(objArr, this.rootShift, i11, e11, objectRef), 0, objectRef.getValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i11, @k Collection<? extends E> collection) {
        PersistentVectorBuilder<E> persistentVectorBuilder;
        Collection<? extends E> collection2;
        Object[] B0;
        Object[][] objArr;
        ListImplementation.checkPositionIndex$runtime_release(i11, size());
        if (i11 == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i12 = (i11 >> 5) << 5;
        int size = (((size() - i12) + collection.size()) - 1) / 32;
        if (size == 0) {
            CommonFunctionsKt.m2064assert(i11 >= rootSize());
            int i13 = i11 & 31;
            int size2 = ((i11 + collection.size()) - 1) & 31;
            Object[] objArr2 = this.tail;
            Object[] B02 = q.B0(objArr2, makeMutable(objArr2), size2 + 1, i13, tailSize());
            copyToBuffer(B02, i13, collection.iterator());
            this.tail = B02;
            this.size = size() + collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int tailSize = tailSize();
        int tailSize2 = tailSize(size() + collection.size());
        if (i11 >= rootSize()) {
            B0 = mutableBuffer();
            objArr = objArr3;
            persistentVectorBuilder = this;
            collection2 = collection;
            persistentVectorBuilder.splitToBuffers(collection2, i11, this.tail, tailSize, objArr, size, B0);
        } else {
            persistentVectorBuilder = this;
            collection2 = collection;
            if (tailSize2 > tailSize) {
                int i14 = tailSize2 - tailSize;
                Object[] makeMutableShiftingRight = makeMutableShiftingRight(persistentVectorBuilder.tail, i14);
                persistentVectorBuilder.insertIntoRoot(collection2, i11, i14, objArr3, size, makeMutableShiftingRight);
                objArr = objArr3;
                B0 = makeMutableShiftingRight;
            } else {
                int i15 = tailSize - tailSize2;
                B0 = q.B0(persistentVectorBuilder.tail, mutableBuffer(), 0, i15, tailSize);
                int i16 = 32 - i15;
                Object[] makeMutableShiftingRight2 = makeMutableShiftingRight(persistentVectorBuilder.tail, i16);
                int i17 = size - 1;
                objArr3[i17] = makeMutableShiftingRight2;
                persistentVectorBuilder.insertIntoRoot(collection2, i11, i16, objArr3, i17, makeMutableShiftingRight2);
                collection2 = collection2;
                objArr = objArr3;
                persistentVectorBuilder = persistentVectorBuilder;
            }
        }
        persistentVectorBuilder.root = pushBuffersIncreasingHeightIfNeeded(persistentVectorBuilder.root, i12, objArr);
        persistentVectorBuilder.tail = B0;
        persistentVectorBuilder.size = size() + collection2.size();
        return true;
    }

    private final int removeAll(x00.l<? super E, Boolean> lVar, Object[] objArr, int i11, ObjectRef objectRef) {
        Object[] objArr2 = objArr;
        int i12 = i11;
        boolean z11 = false;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z11) {
                    objArr2 = makeMutable(objArr);
                    z11 = true;
                    i12 = i13;
                }
            } else if (z11) {
                objArr2[i12] = obj;
                i12++;
            }
        }
        objectRef.setValue(objArr2);
        return i12;
    }
}
