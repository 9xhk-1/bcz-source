package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import a00.q;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.internal.StabilityInferred;
import g10.u;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n33#2,5:329\n1#3:334\n*S KotlinDebug\n*F\n+ 1 PersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector\n*L\n30#1:329,5\n*E\n"})
/* loaded from: classes.dex */
public final class PersistentVector<E> extends AbstractPersistentList<E> implements PersistentList<E> {
    public static final int $stable = 8;

    @k
    private final Object[] root;
    private final int rootShift;
    private final int size;

    @k
    private final Object[] tail;

    public PersistentVector(@k Object[] objArr, @k Object[] objArr2, int i11, int i12) {
        this.root = objArr;
        this.tail = objArr2;
        this.size = i11;
        this.rootShift = i12;
        if (!(size() > 32)) {
            PreconditionsKt.throwIllegalArgumentException("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        CommonFunctionsKt.m2064assert(size() - UtilsKt.rootSize(size()) <= u.B(objArr2.length, 32));
    }

    private final Object[] bufferFor(int i11) {
        if (rootSize() <= i11) {
            return this.tail;
        }
        Object[] objArr = this.root;
        for (int i12 = this.rootShift; i12 > 0; i12 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i11, i12)];
            g0.n(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i11, int i12, Object obj, ObjectRef objectRef) {
        Object[] copyOf;
        int indexSegment = UtilsKt.indexSegment(i12, i11);
        if (i11 == 0) {
            if (indexSegment == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                g0.o(copyOf, "copyOf(...)");
            }
            q.B0(objArr, copyOf, indexSegment + 1, indexSegment, 31);
            objectRef.setValue(objArr[31]);
            copyOf[indexSegment] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        g0.o(copyOf2, "copyOf(...)");
        int i13 = i11 - 5;
        Object obj2 = objArr[indexSegment];
        g0.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[indexSegment] = insertIntoRoot((Object[]) obj2, i13, i12, obj, objectRef);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || copyOf2[indexSegment] == null) {
                break;
            }
            Object obj3 = objArr[indexSegment];
            g0.n(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[indexSegment] = insertIntoRoot((Object[]) obj3, i13, 0, objectRef.getValue(), objectRef);
        }
        return copyOf2;
    }

    private final PersistentVector<E> insertIntoTail(Object[] objArr, int i11, Object obj) {
        int size = size() - rootSize();
        Object[] copyOf = Arrays.copyOf(this.tail, 32);
        g0.o(copyOf, "copyOf(...)");
        if (size < 32) {
            q.B0(this.tail, copyOf, i11 + 1, i11, size);
            copyOf[i11] = obj;
            return new PersistentVector<>(objArr, copyOf, size() + 1, this.rootShift);
        }
        Object[] objArr2 = this.tail;
        Object obj2 = objArr2[31];
        q.B0(objArr2, copyOf, i11 + 1, i11, size - 1);
        copyOf[i11] = obj;
        return pushFilledTail(objArr, copyOf, UtilsKt.presizedBufferWith(obj2));
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i11, int i12, ObjectRef objectRef) {
        Object[] pullLastBuffer;
        int indexSegment = UtilsKt.indexSegment(i12, i11);
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
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        g0.o(copyOf, "copyOf(...)");
        copyOf[indexSegment] = pullLastBuffer;
        return copyOf;
    }

    private final PersistentList<E> pullLastBufferFromRoot(Object[] objArr, int i11, int i12) {
        if (i12 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                g0.o(objArr, "copyOf(...)");
            }
            return new SmallPersistentVector(objArr);
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] pullLastBuffer = pullLastBuffer(objArr, i12, i11 - 1, objectRef);
        g0.m(pullLastBuffer);
        Object value = objectRef.getValue();
        g0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) value;
        if (pullLastBuffer[1] != null) {
            return new PersistentVector(pullLastBuffer, objArr2, i11, i12);
        }
        Object obj = pullLastBuffer[0];
        g0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new PersistentVector((Object[]) obj, objArr2, i11, i12 - 5);
    }

    private final PersistentVector<E> pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i11 = this.rootShift;
        if (size <= (1 << i11)) {
            return new PersistentVector<>(pushTail(objArr, i11, objArr2), objArr3, size() + 1, this.rootShift);
        }
        Object[] presizedBufferWith = UtilsKt.presizedBufferWith(objArr);
        int i12 = this.rootShift + 5;
        return new PersistentVector<>(pushTail(presizedBufferWith, i12, objArr2), objArr3, size() + 1, i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r4 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object[] pushTail(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(r0, r5)
            r1 = 32
            if (r4 == 0) goto L19
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r4, r2)
            if (r4 != 0) goto L1b
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r5 != r1) goto L21
            r4[r0] = r6
            return r4
        L21:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.pushTail(r2, r5, r6)
            r4[r0] = r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector.pushTail(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i11, int i12, ObjectRef objectRef) {
        Object[] copyOf;
        int indexSegment = UtilsKt.indexSegment(i12, i11);
        if (i11 == 0) {
            if (indexSegment == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                g0.o(copyOf, "copyOf(...)");
            }
            q.B0(objArr, copyOf, indexSegment, indexSegment + 1, 32);
            copyOf[31] = objectRef.getValue();
            objectRef.setValue(objArr[indexSegment]);
            return copyOf;
        }
        int indexSegment2 = objArr[31] == null ? UtilsKt.indexSegment(rootSize() - 1, i11) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        g0.o(copyOf2, "copyOf(...)");
        int i13 = i11 - 5;
        int i14 = indexSegment + 1;
        if (i14 <= indexSegment2) {
            while (true) {
                Object obj = copyOf2[indexSegment2];
                g0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[indexSegment2] = removeFromRootAt((Object[]) obj, i13, 0, objectRef);
                if (indexSegment2 == i14) {
                    break;
                }
                indexSegment2--;
            }
        }
        Object obj2 = copyOf2[indexSegment];
        g0.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[indexSegment] = removeFromRootAt((Object[]) obj2, i13, i12, objectRef);
        return copyOf2;
    }

    private final PersistentList<E> removeFromTailAt(Object[] objArr, int i11, int i12, int i13) {
        int size = size() - i11;
        CommonFunctionsKt.m2064assert(i13 < size);
        if (size == 1) {
            return pullLastBufferFromRoot(objArr, i11, i12);
        }
        Object[] copyOf = Arrays.copyOf(this.tail, 32);
        g0.o(copyOf, "copyOf(...)");
        int i14 = size - 1;
        if (i13 < i14) {
            q.B0(this.tail, copyOf, i13, i13 + 1, size);
        }
        copyOf[i14] = null;
        return new PersistentVector(objArr, copyOf, (i11 + size) - 1, i12);
    }

    private final int rootSize() {
        return UtilsKt.rootSize(size());
    }

    private final Object[] setInRoot(Object[] objArr, int i11, int i12, Object obj) {
        int indexSegment = UtilsKt.indexSegment(i12, i11);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        g0.o(copyOf, "copyOf(...)");
        if (i11 == 0) {
            copyOf[indexSegment] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[indexSegment];
        g0.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf[indexSegment] = setInRoot((Object[]) obj2, i11 - 5, i12, obj);
        return copyOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection add(Object obj) {
        return add((PersistentVector<E>) obj);
    }

    @Override // a00.d, java.util.List
    public E get(int i11) {
        ListImplementation.checkElementIndex$runtime_release(i11, size());
        return (E) bufferFor(i11)[i11 & 31];
    }

    @Override // a00.d, a00.b
    public int getSize() {
        return this.size;
    }

    @Override // a00.d, java.util.List
    @k
    public ListIterator<E> listIterator(int i11) {
        ListImplementation.checkPositionIndex$runtime_release(i11, size());
        return new PersistentVectorIterator(this.root, this.tail, i11, size(), (this.rootShift / 5) + 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @k
    public PersistentList<E> removeAt(int i11) {
        ListImplementation.checkElementIndex$runtime_release(i11, size());
        int rootSize = rootSize();
        return i11 >= rootSize ? removeFromTailAt(this.root, rootSize, this.rootShift, i11 - rootSize) : removeFromTailAt(removeFromRootAt(this.root, this.rootShift, i11, new ObjectRef(this.tail[0])), rootSize, this.rootShift, 0);
    }

    @Override // a00.d, java.util.List
    @k
    public PersistentList<E> set(int i11, E e11) {
        ListImplementation.checkElementIndex$runtime_release(i11, size());
        if (rootSize() > i11) {
            return new PersistentVector(setInRoot(this.root, this.rootShift, i11, e11), this.tail, size(), this.rootShift);
        }
        Object[] copyOf = Arrays.copyOf(this.tail, 32);
        g0.o(copyOf, "copyOf(...)");
        copyOf[i11 & 31] = e11;
        return new PersistentVector(this.root, copyOf, size(), this.rootShift);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    public PersistentList<E> add(E e11) {
        int size = size() - rootSize();
        if (size >= 32) {
            return pushFilledTail(this.root, this.tail, UtilsKt.presizedBufferWith(e11));
        }
        Object[] copyOf = Arrays.copyOf(this.tail, 32);
        g0.o(copyOf, "copyOf(...)");
        copyOf[size] = e11;
        return new PersistentVector(this.root, copyOf, size() + 1, this.rootShift);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    public PersistentList<E> removeAll(@k l<? super E, Boolean> lVar) {
        PersistentVectorBuilder<E> builder = builder();
        builder.removeAllWithPredicate(lVar);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @k
    public PersistentVectorBuilder<E> builder() {
        return new PersistentVectorBuilder<>(this, this.root, this.tail, this.rootShift);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @k
    public PersistentList<E> add(int i11, E e11) {
        ListImplementation.checkPositionIndex$runtime_release(i11, size());
        if (i11 == size()) {
            return add((PersistentVector<E>) e11);
        }
        int rootSize = rootSize();
        if (i11 >= rootSize) {
            return insertIntoTail(this.root, i11 - rootSize, e11);
        }
        ObjectRef objectRef = new ObjectRef(null);
        return insertIntoTail(insertIntoRoot(this.root, this.rootShift, i11, e11, objectRef), 0, objectRef.getValue());
    }
}
