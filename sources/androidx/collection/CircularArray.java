package androidx.collection;

import a00.q;
import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCircularArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,266:1\n59#2,5:267\n59#2,5:272\n24#3:277\n24#3:278\n24#3:279\n24#3:280\n24#3:281\n24#3:282\n24#3:283\n*S KotlinDebug\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n*L\n38#1:267,5\n39#1:272,5\n104#1:277\n121#1:278\n148#1:279\n183#1:280\n217#1:281\n231#1:282\n245#1:283\n*E\n"})
/* loaded from: classes.dex */
public final class CircularArray<E> {
    private int capacityBitmask;

    @k
    private E[] elements;
    private int head;
    private int tail;

    @w00.k
    public CircularArray() {
        this(0, 1, null);
    }

    private final void doubleCapacity() {
        E[] eArr = this.elements;
        int length = eArr.length;
        int i11 = this.head;
        int i12 = length - i11;
        int i13 = length << 1;
        if (i13 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i13];
        q.B0(eArr, eArr2, 0, i11, length);
        q.B0(this.elements, eArr2, i12, 0, this.head);
        this.elements = eArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i13 - 1;
    }

    public final void addFirst(E e11) {
        int i11 = (this.head - 1) & this.capacityBitmask;
        this.head = i11;
        this.elements[i11] = e11;
        if (i11 == this.tail) {
            doubleCapacity();
        }
    }

    public final void addLast(E e11) {
        E[] eArr = this.elements;
        int i11 = this.tail;
        eArr[i11] = e11;
        int i12 = this.capacityBitmask & (i11 + 1);
        this.tail = i12;
        if (i12 == this.head) {
            doubleCapacity();
        }
    }

    public final void clear() {
        removeFromStart(size());
    }

    public final E get(int i11) {
        if (i11 < 0 || i11 >= size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e11 = this.elements[this.capacityBitmask & (this.head + i11)];
        g0.m(e11);
        return e11;
    }

    public final E getFirst() {
        int i11 = this.head;
        if (i11 == this.tail) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e11 = this.elements[i11];
        g0.m(e11);
        return e11;
    }

    public final E getLast() {
        int i11 = this.head;
        int i12 = this.tail;
        if (i11 == i12) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e11 = this.elements[(i12 - 1) & this.capacityBitmask];
        g0.m(e11);
        return e11;
    }

    public final boolean isEmpty() {
        return this.head == this.tail;
    }

    public final E popFirst() {
        int i11 = this.head;
        if (i11 == this.tail) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.elements;
        E e11 = eArr[i11];
        eArr[i11] = null;
        this.head = (i11 + 1) & this.capacityBitmask;
        return e11;
    }

    public final E popLast() {
        int i11 = this.head;
        int i12 = this.tail;
        if (i11 == i12) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i13 = this.capacityBitmask & (i12 - 1);
        E[] eArr = this.elements;
        E e11 = eArr[i13];
        eArr[i13] = null;
        this.tail = i13;
        return e11;
    }

    public final void removeFromEnd(int i11) {
        if (i11 <= 0) {
            return;
        }
        if (i11 > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.tail;
        int i13 = i11 < i12 ? i12 - i11 : 0;
        for (int i14 = i13; i14 < i12; i14++) {
            this.elements[i14] = null;
        }
        int i15 = this.tail;
        int i16 = i15 - i13;
        int i17 = i11 - i16;
        this.tail = i15 - i16;
        if (i17 > 0) {
            int length = this.elements.length;
            this.tail = length;
            int i18 = length - i17;
            for (int i19 = i18; i19 < length; i19++) {
                this.elements[i19] = null;
            }
            this.tail = i18;
        }
    }

    public final void removeFromStart(int i11) {
        if (i11 <= 0) {
            return;
        }
        if (i11 > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.elements.length;
        int i12 = this.head;
        if (i11 < length - i12) {
            length = i12 + i11;
        }
        while (i12 < length) {
            this.elements[i12] = null;
            i12++;
        }
        int i13 = this.head;
        int i14 = length - i13;
        int i15 = i11 - i14;
        this.head = this.capacityBitmask & (i13 + i14);
        if (i15 > 0) {
            for (int i16 = 0; i16 < i15; i16++) {
                this.elements[i16] = null;
            }
            this.head = i15;
        }
    }

    public final int size() {
        return (this.tail - this.head) & this.capacityBitmask;
    }

    @w00.k
    public CircularArray(int i11) {
        if (!(i11 >= 1)) {
            RuntimeHelpersKt.throwIllegalArgumentException("capacity must be >= 1");
        }
        if (!(i11 <= 1073741824)) {
            RuntimeHelpersKt.throwIllegalArgumentException("capacity must be <= 2^30");
        }
        i11 = Integer.bitCount(i11) != 1 ? Integer.highestOneBit(i11 - 1) << 1 : i11;
        this.capacityBitmask = i11 - 1;
        this.elements = (E[]) new Object[i11];
    }

    public /* synthetic */ CircularArray(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 8 : i11);
    }
}
