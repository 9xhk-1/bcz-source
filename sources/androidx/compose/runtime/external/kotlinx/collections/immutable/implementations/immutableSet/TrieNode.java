package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import a00.a0;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n+ 2 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt\n+ 3 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,851:1\n54#2,13:852\n50#2,17:865\n50#2,17:882\n50#2,10:918\n60#2,7:929\n50#2,10:945\n60#2,7:956\n10#3,5:899\n15#3,4:905\n10#3,9:909\n10#3,9:936\n10#3,9:965\n1#4:904\n53#5:928\n53#5:955\n12271#6,2:963\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n*L\n297#1:852,13\n324#1:865,17\n347#1:882,17\n594#1:918,10\n594#1:929,7\n701#1:945,10\n701#1:956,7\n423#1:899,5\n423#1:905,4\n525#1:909,9\n621#1:936,9\n717#1:965,9\n594#1:928\n701#1:955\n710#1:963,2\n*E\n"})
/* loaded from: classes.dex */
public final class TrieNode<E> {
    private int bitmap;

    @k
    private Object[] buffer;

    @l
    private MutabilityOwnership ownedBy;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final TrieNode EMPTY = new TrieNode(0, new Object[0]);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.EMPTY;
        }

        private Companion() {
        }
    }

    public TrieNode(int i11, @k Object[] objArr, @l MutabilityOwnership mutabilityOwnership) {
        this.bitmap = i11;
        this.buffer = objArr;
        this.ownedBy = mutabilityOwnership;
    }

    private final TrieNode<E> addElementAt(int i11, E e11) {
        Object[] addElementAtIndex;
        addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime_release(i11), e11);
        return new TrieNode<>(i11 | this.bitmap, addElementAtIndex);
    }

    private final int calculateSize() {
        if (this.bitmap == 0) {
            return this.buffer.length;
        }
        int i11 = 0;
        for (Object obj : this.buffer) {
            i11 += obj instanceof TrieNode ? ((TrieNode) obj).calculateSize() : 1;
        }
        return i11;
    }

    private final TrieNode<E> collisionAdd(E e11) {
        Object[] addElementAtIndex;
        if (collisionContainsElement(e11)) {
            return this;
        }
        addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, 0, e11);
        return new TrieNode<>(0, addElementAtIndex);
    }

    private final boolean collisionContainsElement(E e11) {
        return a0.B8(this.buffer, e11);
    }

    private final TrieNode<E> collisionRemove(E e11) {
        int bg2 = a0.bg(this.buffer, e11);
        return bg2 != -1 ? collisionRemoveElementAtIndex(bg2) : this;
    }

    private final TrieNode<E> collisionRemoveElementAtIndex(int i11) {
        Object[] removeCellAtIndex;
        removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, i11);
        return new TrieNode<>(0, removeCellAtIndex);
    }

    private final E elementAtIndex(int i11) {
        return (E) this.buffer[i11];
    }

    private final boolean elementsIdentityEquals(TrieNode<E> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.bitmap != trieNode.bitmap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.buffer[i11] != trieNode.buffer[i11]) {
                return false;
            }
        }
        return true;
    }

    private final boolean hasNoCellAt(int i11) {
        return (i11 & this.bitmap) == 0;
    }

    private final TrieNode<E> makeNode(int i11, E e11, int i12, E e12, int i13, MutabilityOwnership mutabilityOwnership) {
        if (i13 > 30) {
            return new TrieNode<>(0, new Object[]{e11, e12}, mutabilityOwnership);
        }
        int indexSegment = TrieNodeKt.indexSegment(i11, i13);
        int indexSegment2 = TrieNodeKt.indexSegment(i12, i13);
        if (indexSegment != indexSegment2) {
            return new TrieNode<>((1 << indexSegment) | (1 << indexSegment2), indexSegment < indexSegment2 ? new Object[]{e11, e12} : new Object[]{e12, e11}, mutabilityOwnership);
        }
        return new TrieNode<>(1 << indexSegment, new Object[]{makeNode(i11, e11, i12, e12, i13 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    private final TrieNode<E> makeNodeAtIndex(int i11, int i12, E e11, int i13, MutabilityOwnership mutabilityOwnership) {
        E elementAtIndex = elementAtIndex(i11);
        return makeNode(elementAtIndex != null ? elementAtIndex.hashCode() : 0, elementAtIndex, i12, e11, i13 + 5, mutabilityOwnership);
    }

    private final TrieNode<E> moveElementToNode(int i11, int i12, E e11, int i13) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        g0.o(copyOf, "copyOf(...)");
        copyOf[i11] = makeNodeAtIndex(i11, i12, e11, i13, null);
        return new TrieNode<>(this.bitmap, copyOf);
    }

    private final TrieNode<E> mutableAddElementAt(int i11, E e11, MutabilityOwnership mutabilityOwnership) {
        Object[] addElementAtIndex;
        Object[] addElementAtIndex2;
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(i11);
        if (this.ownedBy != mutabilityOwnership) {
            addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime_release, e11);
            return new TrieNode<>(i11 | this.bitmap, addElementAtIndex, mutabilityOwnership);
        }
        addElementAtIndex2 = TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime_release, e11);
        this.buffer = addElementAtIndex2;
        this.bitmap = i11 | this.bitmap;
        return this;
    }

    private final TrieNode<E> mutableCollisionAdd(E e11, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        Object[] addElementAtIndex;
        Object[] addElementAtIndex2;
        if (collisionContainsElement(e11)) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
        if (this.ownedBy != persistentHashSetBuilder.getOwnership$runtime_release()) {
            addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, 0, e11);
            return new TrieNode<>(0, addElementAtIndex, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        addElementAtIndex2 = TrieNodeKt.addElementAtIndex(this.buffer, 0, e11);
        this.buffer = addElementAtIndex2;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<E> mutableCollisionAddAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        g0.o(copyOf, "copyOf(...)");
        Object[] objArr2 = trieNode.buffer;
        int length = this.buffer.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < objArr2.length) {
            CommonFunctionsKt.m2064assert(i12 <= i11);
            if (!collisionContainsElement(objArr2[i11])) {
                copyOf[length + i12] = objArr2[i11];
                i12++;
                CommonFunctionsKt.m2064assert(length + i12 <= copyOf.length);
            }
            i11++;
        }
        int length2 = i12 + this.buffer.length;
        deltaCounter.plusAssign(copyOf.length - length2);
        if (length2 == this.buffer.length) {
            return this;
        }
        if (length2 == trieNode.buffer.length) {
            return trieNode;
        }
        if (length2 != copyOf.length) {
            copyOf = Arrays.copyOf(copyOf, length2);
            g0.o(copyOf, "copyOf(...)");
        }
        if (!g0.g(this.ownedBy, mutabilityOwnership)) {
            return new TrieNode<>(0, copyOf, mutabilityOwnership);
        }
        this.buffer = copyOf;
        return this;
    }

    private final TrieNode<E> mutableCollisionRemove(E e11, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int bg2 = a0.bg(this.buffer, e11);
        if (bg2 == -1) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
        return mutableCollisionRemoveElementAtIndex(bg2, persistentHashSetBuilder.getOwnership$runtime_release());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRemoveAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return EMPTY;
        }
        Object[] objArr = g0.g(mutabilityOwnership, this.ownedBy) ? this.buffer : new Object[this.buffer.length];
        Object[] objArr2 = this.buffer;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.m2064assert(i12 <= i11);
            if (!trieNode.collisionContainsElement(objArr2[i11])) {
                objArr[i12] = objArr2[i11];
                i12++;
                CommonFunctionsKt.m2064assert(i12 <= objArr.length);
            }
            i11++;
        }
        deltaCounter.plusAssign(this.buffer.length - i12);
        if (i12 == 0) {
            return EMPTY;
        }
        if (i12 == 1) {
            return objArr[0];
        }
        if (i12 == this.buffer.length) {
            return this;
        }
        if (i12 == objArr.length) {
            return new TrieNode(0, objArr, mutabilityOwnership);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i12);
        g0.o(copyOf, "copyOf(...)");
        return new TrieNode(0, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableCollisionRemoveElementAtIndex(int i11, MutabilityOwnership mutabilityOwnership) {
        Object[] removeCellAtIndex;
        Object[] removeCellAtIndex2;
        if (this.ownedBy != mutabilityOwnership) {
            removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, i11);
            return new TrieNode<>(0, removeCellAtIndex, mutabilityOwnership);
        }
        removeCellAtIndex2 = TrieNodeKt.removeCellAtIndex(this.buffer, i11);
        this.buffer = removeCellAtIndex2;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRetainAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = g0.g(mutabilityOwnership, this.ownedBy) ? this.buffer : new Object[Math.min(this.buffer.length, trieNode.buffer.length)];
        Object[] objArr2 = this.buffer;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.m2064assert(i12 <= i11);
            if (trieNode.collisionContainsElement(objArr2[i11])) {
                objArr[i12] = objArr2[i11];
                i12++;
                CommonFunctionsKt.m2064assert(i12 <= objArr.length);
            }
            i11++;
        }
        deltaCounter.plusAssign(i12);
        if (i12 == 0) {
            return EMPTY;
        }
        if (i12 == 1) {
            return objArr[0];
        }
        if (i12 == this.buffer.length) {
            return this;
        }
        if (i12 == trieNode.buffer.length) {
            return trieNode;
        }
        if (i12 == objArr.length) {
            return new TrieNode(0, objArr, mutabilityOwnership);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i12);
        g0.o(copyOf, "copyOf(...)");
        return new TrieNode(0, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableMoveElementToNode(int i11, int i12, E e11, int i13, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer[i11] = makeNodeAtIndex(i11, i12, e11, i13, mutabilityOwnership);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        g0.o(copyOf, "copyOf(...)");
        copyOf[i11] = makeNodeAtIndex(i11, i12, e11, i13, mutabilityOwnership);
        return new TrieNode<>(this.bitmap, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableRemoveCellAtIndex(int i11, int i12, MutabilityOwnership mutabilityOwnership) {
        Object[] removeCellAtIndex;
        Object[] removeCellAtIndex2;
        if (this.ownedBy != mutabilityOwnership) {
            removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, i11);
            return new TrieNode<>(i12 ^ this.bitmap, removeCellAtIndex, mutabilityOwnership);
        }
        removeCellAtIndex2 = TrieNodeKt.removeCellAtIndex(this.buffer, i11);
        this.buffer = removeCellAtIndex2;
        this.bitmap ^= i12;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4 */
    private final TrieNode<E> mutableUpdateNodeAtIndex(int i11, TrieNode<E> trieNode, MutabilityOwnership mutabilityOwnership) {
        ?? r02 = trieNode.buffer;
        if (r02.length == 1) {
            ?? r03 = r02[0];
            if (!(r03 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode = r03;
            }
        }
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer[i11] = trieNode;
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        g0.o(copyOf, "copyOf(...)");
        copyOf[i11] = trieNode;
        return new TrieNode<>(this.bitmap, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> nodeAtIndex(int i11) {
        Object obj = this.buffer[i11];
        g0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode) obj;
    }

    private final TrieNode<E> removeCellAtIndex(int i11, int i12) {
        Object[] removeCellAtIndex;
        removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, i11);
        return new TrieNode<>(i12 ^ this.bitmap, removeCellAtIndex);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v3 */
    private final TrieNode<E> updateNodeAtIndex(int i11, TrieNode<E> trieNode) {
        ?? r02 = trieNode.buffer;
        if (r02.length == 1) {
            ?? r03 = r02[0];
            if (!(r03 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode = r03;
            }
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        g0.o(copyOf, "copyOf(...)");
        copyOf[i11] = trieNode;
        return new TrieNode<>(this.bitmap, copyOf);
    }

    @k
    public final TrieNode<E> add(int i11, E e11, int i12) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i11, i12);
        if (hasNoCellAt(indexSegment)) {
            return addElementAt(indexSegment, e11);
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            TrieNode<E> collisionAdd = i12 == 30 ? nodeAtIndex.collisionAdd(e11) : nodeAtIndex.add(i11, e11, i12 + 5);
            if (nodeAtIndex != collisionAdd) {
                return updateNodeAtIndex(indexOfCellAt$runtime_release, collisionAdd);
            }
        } else if (!g0.g(e11, obj)) {
            return moveElementToNode(indexOfCellAt$runtime_release, i11, e11, i12);
        }
        return this;
    }

    public final boolean contains(int i11, E e11, int i12) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i11, i12);
        if (hasNoCellAt(indexSegment)) {
            return false;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (!(obj instanceof TrieNode)) {
            return g0.g(e11, obj);
        }
        TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
        return i12 == 30 ? nodeAtIndex.collisionContainsElement(e11) : nodeAtIndex.contains(i11, e11, i12 + 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(@k TrieNode<E> trieNode, int i11) {
        if (this == trieNode) {
            return true;
        }
        if (i11 > 30) {
            for (Object obj : trieNode.buffer) {
                if (!a0.B8(this.buffer, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i12 = this.bitmap;
        int i13 = trieNode.bitmap;
        int i14 = i12 & i13;
        if (i14 != i13) {
            return false;
        }
        while (i14 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i14);
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
            int indexOfCellAt$runtime_release2 = trieNode.indexOfCellAt$runtime_release(lowestOneBit);
            Object obj2 = this.buffer[indexOfCellAt$runtime_release];
            Object obj3 = trieNode.buffer[indexOfCellAt$runtime_release2];
            boolean z11 = obj2 instanceof TrieNode;
            boolean z12 = obj3 instanceof TrieNode;
            if (z11 && z12) {
                g0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                g0.n(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (!((TrieNode) obj2).containsAll((TrieNode) obj3, i11 + 5)) {
                    return false;
                }
            } else if (z11) {
                g0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (!((TrieNode) obj2).contains(obj3 != null ? obj3.hashCode() : 0, obj3, i11 + 5)) {
                    return false;
                }
            } else if (z12 || !g0.g(obj2, obj3)) {
                return false;
            }
            i14 ^= lowestOneBit;
        }
        return true;
    }

    public final int getBitmap() {
        return this.bitmap;
    }

    @k
    public final Object[] getBuffer() {
        return this.buffer;
    }

    @l
    public final MutabilityOwnership getOwnedBy() {
        return this.ownedBy;
    }

    public final int indexOfCellAt$runtime_release(int i11) {
        return Integer.bitCount((i11 - 1) & this.bitmap);
    }

    @k
    public final TrieNode<E> mutableAdd(int i11, E e11, int i12, @k PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i11, i12);
        if (hasNoCellAt(indexSegment)) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
            return mutableAddElementAt(indexSegment, e11, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            TrieNode<E> mutableCollisionAdd = i12 == 30 ? nodeAtIndex.mutableCollisionAdd(e11, persistentHashSetBuilder) : nodeAtIndex.mutableAdd(i11, e11, i12 + 5, persistentHashSetBuilder);
            if (nodeAtIndex != mutableCollisionAdd) {
                return mutableUpdateNodeAtIndex(indexOfCellAt$runtime_release, mutableCollisionAdd, persistentHashSetBuilder.getOwnership$runtime_release());
            }
        } else if (!g0.g(e11, obj)) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
            return mutableMoveElementToNode(indexOfCellAt$runtime_release, i11, e11, i12, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final TrieNode<E> mutableAddAll(@k TrieNode<E> trieNode, int i11, @k DeltaCounter deltaCounter, @k PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        Object obj;
        Object[] objArr;
        if (this == trieNode) {
            deltaCounter.setCount(deltaCounter.getCount() + calculateSize());
            return this;
        }
        if (i11 > 30) {
            return mutableCollisionAddAll(trieNode, deltaCounter, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int i12 = this.bitmap;
        int i13 = trieNode.bitmap | i12;
        TrieNode<E> trieNode2 = (i13 == i12 && g0.g(this.ownedBy, persistentHashSetBuilder.getOwnership$runtime_release())) ? this : new TrieNode<>(i13, new Object[Integer.bitCount(i13)], persistentHashSetBuilder.getOwnership$runtime_release());
        int i14 = i13;
        int i15 = 0;
        while (i14 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i14);
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
            int indexOfCellAt$runtime_release2 = trieNode.indexOfCellAt$runtime_release(lowestOneBit);
            Object[] objArr2 = trieNode2.buffer;
            if (hasNoCellAt(lowestOneBit)) {
                obj = trieNode.buffer[indexOfCellAt$runtime_release2];
            } else if (trieNode.hasNoCellAt(lowestOneBit)) {
                obj = this.buffer[indexOfCellAt$runtime_release];
            } else {
                obj = this.buffer[indexOfCellAt$runtime_release];
                Object obj2 = trieNode.buffer[indexOfCellAt$runtime_release2];
                boolean z11 = obj instanceof TrieNode;
                boolean z12 = obj2 instanceof TrieNode;
                if (z11 && z12) {
                    g0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    g0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    obj = ((TrieNode) obj).mutableAddAll((TrieNode) obj2, i11 + 5, deltaCounter, persistentHashSetBuilder);
                } else if (z11) {
                    g0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    TrieNode trieNode3 = (TrieNode) obj;
                    int size = persistentHashSetBuilder.size();
                    obj = trieNode3.mutableAdd(obj2 != null ? obj2.hashCode() : 0, obj2, i11 + 5, persistentHashSetBuilder);
                    if (persistentHashSetBuilder.size() == size) {
                        deltaCounter.setCount(deltaCounter.getCount() + 1);
                    }
                    g2 g2Var = g2.f100423a;
                } else if (z12) {
                    g0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    TrieNode trieNode4 = (TrieNode) obj2;
                    int size2 = persistentHashSetBuilder.size();
                    obj = trieNode4.mutableAdd(obj != null ? obj.hashCode() : 0, obj, i11 + 5, persistentHashSetBuilder);
                    if (persistentHashSetBuilder.size() == size2) {
                        deltaCounter.setCount(deltaCounter.getCount() + 1);
                    }
                    g2 g2Var2 = g2.f100423a;
                } else if (g0.g(obj, obj2)) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                    g2 g2Var3 = g2.f100423a;
                } else {
                    objArr = objArr2;
                    obj = makeNode(obj != null ? obj.hashCode() : 0, obj, obj2 != null ? obj2.hashCode() : 0, obj2, i11 + 5, persistentHashSetBuilder.getOwnership$runtime_release());
                    objArr[i15] = obj;
                    i15++;
                    i14 ^= lowestOneBit;
                }
            }
            objArr = objArr2;
            objArr[i15] = obj;
            i15++;
            i14 ^= lowestOneBit;
        }
        return elementsIdentityEquals(trieNode2) ? this : trieNode.elementsIdentityEquals(trieNode2) ? trieNode : trieNode2;
    }

    @k
    public final TrieNode<E> mutableRemove(int i11, E e11, int i12, @k PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i11, i12);
        if (!hasNoCellAt(indexSegment)) {
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
            Object obj = this.buffer[indexOfCellAt$runtime_release];
            if (obj instanceof TrieNode) {
                TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
                TrieNode<E> mutableCollisionRemove = i12 == 30 ? nodeAtIndex.mutableCollisionRemove(e11, persistentHashSetBuilder) : nodeAtIndex.mutableRemove(i11, e11, i12 + 5, persistentHashSetBuilder);
                if (this.ownedBy == persistentHashSetBuilder.getOwnership$runtime_release() || nodeAtIndex != mutableCollisionRemove) {
                    return mutableUpdateNodeAtIndex(indexOfCellAt$runtime_release, mutableCollisionRemove, persistentHashSetBuilder.getOwnership$runtime_release());
                }
            } else if (g0.g(e11, obj)) {
                persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
                return mutableRemoveCellAtIndex(indexOfCellAt$runtime_release, indexSegment, persistentHashSetBuilder.getOwnership$runtime_release());
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        if ((r13 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) == false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mutableRemoveAll(@m80.k androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> r18, int r19, @m80.k androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter r20, @m80.k androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> r21) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final Object mutableRetainAll(@k TrieNode<E> trieNode, int i11, @k DeltaCounter deltaCounter, @k PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        if (this == trieNode) {
            deltaCounter.plusAssign(calculateSize());
            return this;
        }
        if (i11 > 30) {
            return mutableCollisionRetainAll(trieNode, deltaCounter, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int i12 = this.bitmap & trieNode.bitmap;
        if (i12 == 0) {
            return EMPTY;
        }
        TrieNode<E> trieNode2 = (g0.g(this.ownedBy, persistentHashSetBuilder.getOwnership$runtime_release()) && i12 == this.bitmap) ? this : new TrieNode<>(i12, new Object[Integer.bitCount(i12)], persistentHashSetBuilder.getOwnership$runtime_release());
        int i13 = i12;
        int i14 = 0;
        int i15 = 0;
        while (i13 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i13);
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
            int indexOfCellAt$runtime_release2 = trieNode.indexOfCellAt$runtime_release(lowestOneBit);
            Object obj = this.buffer[indexOfCellAt$runtime_release];
            Object obj2 = trieNode.buffer[indexOfCellAt$runtime_release2];
            boolean z11 = obj instanceof TrieNode;
            boolean z12 = obj2 instanceof TrieNode;
            if (z11 && z12) {
                g0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                g0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                obj = ((TrieNode) obj).mutableRetainAll((TrieNode) obj2, i11 + 5, deltaCounter, persistentHashSetBuilder);
            } else if (z11) {
                g0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (((TrieNode) obj).contains(obj2 != null ? obj2.hashCode() : 0, obj2, i11 + 5)) {
                    deltaCounter.plusAssign(1);
                    obj = obj2;
                } else {
                    obj = EMPTY;
                }
            } else if (z12) {
                g0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (((TrieNode) obj2).contains(obj != null ? obj.hashCode() : 0, obj, i11 + 5)) {
                    deltaCounter.plusAssign(1);
                } else {
                    obj = EMPTY;
                }
            } else if (g0.g(obj, obj2)) {
                deltaCounter.plusAssign(1);
            } else {
                obj = EMPTY;
            }
            if (obj != EMPTY) {
                i14 |= lowestOneBit;
            }
            trieNode2.buffer[i15] = obj;
            i15++;
            i13 ^= lowestOneBit;
        }
        int bitCount = Integer.bitCount(i14);
        if (i14 == 0) {
            return EMPTY;
        }
        if (i14 == i12) {
            return trieNode2.elementsIdentityEquals(this) ? this : trieNode2.elementsIdentityEquals(trieNode) ? trieNode : trieNode2;
        }
        if (bitCount == 1 && i11 != 0) {
            Object obj3 = trieNode2.buffer[trieNode2.indexOfCellAt$runtime_release(i14)];
            return obj3 instanceof TrieNode ? new TrieNode(i14, new Object[]{obj3}, persistentHashSetBuilder.getOwnership$runtime_release()) : obj3;
        }
        Object[] objArr = new Object[bitCount];
        Object[] objArr2 = trieNode2.buffer;
        int i16 = 0;
        int i17 = 0;
        while (i16 < objArr2.length) {
            CommonFunctionsKt.m2064assert(i17 <= i16);
            if (objArr2[i16] != Companion.getEMPTY$runtime_release()) {
                objArr[i17] = objArr2[i16];
                i17++;
                CommonFunctionsKt.m2064assert(i17 <= bitCount);
            }
            i16++;
        }
        return new TrieNode(i14, objArr, persistentHashSetBuilder.getOwnership$runtime_release());
    }

    @k
    public final TrieNode<E> remove(int i11, E e11, int i12) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i11, i12);
        if (!hasNoCellAt(indexSegment)) {
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
            Object obj = this.buffer[indexOfCellAt$runtime_release];
            if (obj instanceof TrieNode) {
                TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
                TrieNode<E> collisionRemove = i12 == 30 ? nodeAtIndex.collisionRemove(e11) : nodeAtIndex.remove(i11, e11, i12 + 5);
                if (nodeAtIndex != collisionRemove) {
                    return updateNodeAtIndex(indexOfCellAt$runtime_release, collisionRemove);
                }
            } else if (g0.g(e11, obj)) {
                return removeCellAtIndex(indexOfCellAt$runtime_release, indexSegment);
            }
        }
        return this;
    }

    public final void setBitmap(int i11) {
        this.bitmap = i11;
    }

    public final void setBuffer(@k Object[] objArr) {
        this.buffer = objArr;
    }

    public final void setOwnedBy(@l MutabilityOwnership mutabilityOwnership) {
        this.ownedBy = mutabilityOwnership;
    }

    public TrieNode(int i11, @k Object[] objArr) {
        this(i11, objArr, null);
    }
}
