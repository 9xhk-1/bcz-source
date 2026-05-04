package androidx.collection;

import a00.q;
import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCircularIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,212:1\n59#2,5:213\n59#2,5:218\n24#3:223\n24#3:224\n24#3:225\n24#3:226\n24#3:227\n24#3:228\n24#3:229\n*S KotlinDebug\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n*L\n37#1:213,5\n38#1:218,5\n101#1:223\n114#1:224\n138#1:225\n155#1:226\n168#1:227\n180#1:228\n192#1:229\n*E\n"})
/* loaded from: classes.dex */
public final class CircularIntArray {
    private int capacityBitmask;

    @k
    private int[] elements;
    private int head;
    private int tail;

    @w00.k
    public CircularIntArray() {
        this(0, 1, null);
    }

    private final void doubleCapacity() {
        int[] iArr = this.elements;
        int length = iArr.length;
        int i11 = this.head;
        int i12 = length - i11;
        int i13 = length << 1;
        if (i13 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i13];
        q.z0(iArr, iArr2, 0, i11, length);
        q.z0(this.elements, iArr2, i12, 0, this.head);
        this.elements = iArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i13 - 1;
    }

    public final void addFirst(int i11) {
        int i12 = (this.head - 1) & this.capacityBitmask;
        this.head = i12;
        this.elements[i12] = i11;
        if (i12 == this.tail) {
            doubleCapacity();
        }
    }

    public final void addLast(int i11) {
        int[] iArr = this.elements;
        int i12 = this.tail;
        iArr[i12] = i11;
        int i13 = this.capacityBitmask & (i12 + 1);
        this.tail = i13;
        if (i13 == this.head) {
            doubleCapacity();
        }
    }

    public final void clear() {
        this.tail = this.head;
    }

    public final int get(int i11) {
        if (i11 < 0 || i11 >= size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.elements[this.capacityBitmask & (this.head + i11)];
    }

    public final int getFirst() {
        int i11 = this.head;
        if (i11 != this.tail) {
            return this.elements[i11];
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int getLast() {
        int i11 = this.head;
        int i12 = this.tail;
        if (i11 != i12) {
            return this.elements[(i12 - 1) & this.capacityBitmask];
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final boolean isEmpty() {
        return this.head == this.tail;
    }

    public final int popFirst() {
        int i11 = this.head;
        if (i11 == this.tail) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.elements[i11];
        this.head = (i11 + 1) & this.capacityBitmask;
        return i12;
    }

    public final int popLast() {
        int i11 = this.head;
        int i12 = this.tail;
        if (i11 == i12) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i13 = this.capacityBitmask & (i12 - 1);
        int i14 = this.elements[i13];
        this.tail = i13;
        return i14;
    }

    public final void removeFromEnd(int i11) {
        if (i11 <= 0) {
            return;
        }
        if (i11 > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        this.tail = this.capacityBitmask & (this.tail - i11);
    }

    public final void removeFromStart(int i11) {
        if (i11 <= 0) {
            return;
        }
        if (i11 > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        this.head = this.capacityBitmask & (this.head + i11);
    }

    public final int size() {
        return (this.tail - this.head) & this.capacityBitmask;
    }

    @w00.k
    public CircularIntArray(int i11) {
        if (!(i11 >= 1)) {
            RuntimeHelpersKt.throwIllegalArgumentException("capacity must be >= 1");
        }
        if (!(i11 <= 1073741824)) {
            RuntimeHelpersKt.throwIllegalArgumentException("capacity must be <= 2^30");
        }
        i11 = Integer.bitCount(i11) != 1 ? Integer.highestOneBit(i11 - 1) << 1 : i11;
        this.capacityBitmask = i11 - 1;
        this.elements = new int[i11];
    }

    public /* synthetic */ CircularIntArray(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 8 : i11);
    }
}
