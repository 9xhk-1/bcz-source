package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import g10.j;
import g10.u;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.s;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n+ 2 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,899:1\n10#2,9:900\n10#2,9:914\n10#2,9:923\n57#3,5:909\n84#4:932\n1#5:933\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n*L\n630#1:900,9\n648#1:914,9\n652#1:923,9\n640#1:909,5\n700#1:932\n700#1:933\n*E\n"})
/* loaded from: classes.dex */
public final class TrieNode<K, V> {

    @k
    private Object[] buffer;
    private int dataMap;
    private int nodeMap;

    @l
    private final MutabilityOwnership ownedBy;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0]);

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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @u0({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,899:1\n1#2:900\n*E\n"})
    public static final class ModificationResult<K, V> {
        public static final int $stable = 8;

        @k
        private TrieNode<K, V> node;
        private final int sizeDelta;

        public ModificationResult(@k TrieNode<K, V> trieNode, int i11) {
            this.node = trieNode;
            this.sizeDelta = i11;
        }

        @k
        public final TrieNode<K, V> getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        @k
        public final ModificationResult<K, V> replaceNode(@k x00.l<? super TrieNode<K, V>, TrieNode<K, V>> lVar) {
            setNode(lVar.invoke(getNode()));
            return this;
        }

        public final void setNode(@k TrieNode<K, V> trieNode) {
            this.node = trieNode;
        }
    }

    public TrieNode(int i11, int i12, @k Object[] objArr, @l MutabilityOwnership mutabilityOwnership) {
        this.dataMap = i11;
        this.nodeMap = i12;
        this.ownedBy = mutabilityOwnership;
        this.buffer = objArr;
    }

    private final void accept(s<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, g2> sVar, int i11, int i12) {
        sVar.invoke(this, Integer.valueOf(i12), Integer.valueOf(i11), Integer.valueOf(this.dataMap), Integer.valueOf(this.nodeMap));
        int i13 = this.nodeMap;
        while (i13 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i13);
            nodeAtIndex$runtime_release(nodeIndex$runtime_release(lowestOneBit)).accept(sVar, (Integer.numberOfTrailingZeros(lowestOneBit) << i12) + i11, i12 + 5);
            i13 -= lowestOneBit;
        }
    }

    private final ModificationResult<K, V> asInsertResult() {
        return new ModificationResult<>(this, 1);
    }

    private final ModificationResult<K, V> asUpdateResult() {
        return new ModificationResult<>(this, 0);
    }

    private final Object[] bufferMoveEntryToNode(int i11, int i12, int i13, K k11, V v11, int i14, MutabilityOwnership mutabilityOwnership) {
        Object[] replaceEntryWithNode;
        K keyAtIndex = keyAtIndex(i11);
        replaceEntryWithNode = TrieNodeKt.replaceEntryWithNode(this.buffer, i11, nodeIndex$runtime_release(i12) + 1, makeNode(keyAtIndex != null ? keyAtIndex.hashCode() : 0, keyAtIndex, valueAtKeyIndex(i11), i13, k11, v11, i14 + 5, mutabilityOwnership));
        return replaceEntryWithNode;
    }

    private final int calculateSize() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int bitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i11 = bitCount * 2; i11 < length; i11++) {
            bitCount += nodeAtIndex$runtime_release(i11).calculateSize();
        }
        return bitCount;
    }

    private final boolean collisionContainsKey(K k11) {
        j B1 = u.B1(u.W1(0, this.buffer.length), 2);
        int d11 = B1.d();
        int f11 = B1.f();
        int g11 = B1.g();
        if ((g11 > 0 && d11 <= f11) || (g11 < 0 && f11 <= d11)) {
            while (!g0.g(k11, this.buffer[d11])) {
                if (d11 != f11) {
                    d11 += g11;
                }
            }
            return true;
        }
        return false;
    }

    private final V collisionGet(K k11) {
        j B1 = u.B1(u.W1(0, this.buffer.length), 2);
        int d11 = B1.d();
        int f11 = B1.f();
        int g11 = B1.g();
        if ((g11 <= 0 || d11 > f11) && (g11 >= 0 || f11 > d11)) {
            return null;
        }
        while (!g0.g(k11, keyAtIndex(d11))) {
            if (d11 == f11) {
                return null;
            }
            d11 += g11;
        }
        return valueAtKeyIndex(d11);
    }

    private final ModificationResult<K, V> collisionPut(K k11, V v11) {
        Object[] insertEntryAtIndex;
        j B1 = u.B1(u.W1(0, this.buffer.length), 2);
        int d11 = B1.d();
        int f11 = B1.f();
        int g11 = B1.g();
        if ((g11 > 0 && d11 <= f11) || (g11 < 0 && f11 <= d11)) {
            while (!g0.g(k11, keyAtIndex(d11))) {
                if (d11 != f11) {
                    d11 += g11;
                }
            }
            if (v11 == valueAtKeyIndex(d11)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            g0.o(copyOf, "copyOf(...)");
            copyOf[d11 + 1] = v11;
            return new TrieNode(0, 0, copyOf).asUpdateResult();
        }
        insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(this.buffer, 0, k11, v11);
        return new TrieNode(0, 0, insertEntryAtIndex).asInsertResult();
    }

    private final TrieNode<K, V> collisionRemove(K k11) {
        j B1 = u.B1(u.W1(0, this.buffer.length), 2);
        int d11 = B1.d();
        int f11 = B1.f();
        int g11 = B1.g();
        if ((g11 > 0 && d11 <= f11) || (g11 < 0 && f11 <= d11)) {
            while (!g0.g(k11, keyAtIndex(d11))) {
                if (d11 != f11) {
                    d11 += g11;
                }
            }
            return collisionRemoveEntryAtIndex(d11);
        }
        return this;
    }

    private final TrieNode<K, V> collisionRemoveEntryAtIndex(int i11) {
        Object[] removeEntryAtIndex;
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(objArr, i11);
        return new TrieNode<>(0, 0, removeEntryAtIndex);
    }

    private final boolean elementsIdentityEquals(TrieNode<K, V> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.nodeMap != trieNode.nodeMap || this.dataMap != trieNode.dataMap) {
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

    private final boolean hasNodeAt(int i11) {
        return (i11 & this.nodeMap) != 0;
    }

    private final TrieNode<K, V> insertEntryAt(int i11, K k11, V v11) {
        Object[] insertEntryAtIndex;
        insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release(i11), k11, v11);
        return new TrieNode<>(i11 | this.dataMap, this.nodeMap, insertEntryAtIndex);
    }

    private final K keyAtIndex(int i11) {
        return (K) this.buffer[i11];
    }

    private final TrieNode<K, V> makeNode(int i11, K k11, V v11, int i12, K k12, V v12, int i13, MutabilityOwnership mutabilityOwnership) {
        if (i13 > 30) {
            return new TrieNode<>(0, 0, new Object[]{k11, v11, k12, v12}, mutabilityOwnership);
        }
        int indexSegment = TrieNodeKt.indexSegment(i11, i13);
        int indexSegment2 = TrieNodeKt.indexSegment(i12, i13);
        if (indexSegment != indexSegment2) {
            return new TrieNode<>((1 << indexSegment) | (1 << indexSegment2), 0, indexSegment < indexSegment2 ? new Object[]{k11, v11, k12, v12} : new Object[]{k12, v12, k11, v11}, mutabilityOwnership);
        }
        return new TrieNode<>(0, 1 << indexSegment, new Object[]{makeNode(i11, k11, v11, i12, k12, v12, i13 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    private final TrieNode<K, V> moveEntryToNode(int i11, int i12, int i13, K k11, V v11, int i14) {
        return new TrieNode<>(this.dataMap ^ i12, this.nodeMap | i12, bufferMoveEntryToNode(i11, i12, i13, k11, v11, i14, null));
    }

    private final TrieNode<K, V> mutableCollisionPut(K k11, V v11, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        Object[] insertEntryAtIndex;
        j B1 = u.B1(u.W1(0, this.buffer.length), 2);
        int d11 = B1.d();
        int f11 = B1.f();
        int g11 = B1.g();
        if ((g11 > 0 && d11 <= f11) || (g11 < 0 && f11 <= d11)) {
            while (!g0.g(k11, keyAtIndex(d11))) {
                if (d11 != f11) {
                    d11 += g11;
                }
            }
            persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(d11));
            if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
                this.buffer[d11 + 1] = v11;
                return this;
            }
            persistentHashMapBuilder.setModCount$runtime_release(persistentHashMapBuilder.getModCount$runtime_release() + 1);
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            g0.o(copyOf, "copyOf(...)");
            copyOf[d11 + 1] = v11;
            return new TrieNode<>(0, 0, copyOf, persistentHashMapBuilder.getOwnership());
        }
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
        insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(this.buffer, 0, k11, v11);
        return new TrieNode<>(0, 0, insertEntryAtIndex, persistentHashMapBuilder.getOwnership());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<K, V> mutableCollisionPutAll(TrieNode<K, V> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        CommonFunctionsKt.m2064assert(this.nodeMap == 0);
        CommonFunctionsKt.m2064assert(this.dataMap == 0);
        CommonFunctionsKt.m2064assert(trieNode.nodeMap == 0);
        CommonFunctionsKt.m2064assert(trieNode.dataMap == 0);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        g0.o(copyOf, "copyOf(...)");
        int length = this.buffer.length;
        j B1 = u.B1(u.W1(0, trieNode.buffer.length), 2);
        int d11 = B1.d();
        int f11 = B1.f();
        int g11 = B1.g();
        if ((g11 > 0 && d11 <= f11) || (g11 < 0 && f11 <= d11)) {
            while (true) {
                if (collisionContainsKey(trieNode.buffer[d11])) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                } else {
                    Object[] objArr2 = trieNode.buffer;
                    copyOf[length] = objArr2[d11];
                    copyOf[length + 1] = objArr2[d11 + 1];
                    length += 2;
                }
                if (d11 == f11) {
                    break;
                }
                d11 += g11;
            }
        }
        if (length == this.buffer.length) {
            return this;
        }
        if (length == trieNode.buffer.length) {
            return trieNode;
        }
        if (length == copyOf.length) {
            return new TrieNode<>(0, 0, copyOf, mutabilityOwnership);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        g0.o(copyOf2, "copyOf(...)");
        return new TrieNode<>(0, 0, copyOf2, mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k11, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        j B1 = u.B1(u.W1(0, this.buffer.length), 2);
        int d11 = B1.d();
        int f11 = B1.f();
        int g11 = B1.g();
        if ((g11 > 0 && d11 <= f11) || (g11 < 0 && f11 <= d11)) {
            while (!g0.g(k11, keyAtIndex(d11))) {
                if (d11 != f11) {
                    d11 += g11;
                }
            }
            return mutableCollisionRemoveEntryAtIndex(d11, persistentHashMapBuilder);
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemoveEntryAtIndex(int i11, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        Object[] removeEntryAtIndex;
        Object[] removeEntryAtIndex2;
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(i11));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy != persistentHashMapBuilder.getOwnership()) {
            removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(this.buffer, i11);
            return new TrieNode<>(0, 0, removeEntryAtIndex, persistentHashMapBuilder.getOwnership());
        }
        removeEntryAtIndex2 = TrieNodeKt.removeEntryAtIndex(this.buffer, i11);
        this.buffer = removeEntryAtIndex2;
        return this;
    }

    private final TrieNode<K, V> mutableInsertEntryAt(int i11, K k11, V v11, MutabilityOwnership mutabilityOwnership) {
        Object[] insertEntryAtIndex;
        Object[] insertEntryAtIndex2;
        int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(i11);
        if (this.ownedBy != mutabilityOwnership) {
            insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release, k11, v11);
            return new TrieNode<>(i11 | this.dataMap, this.nodeMap, insertEntryAtIndex, mutabilityOwnership);
        }
        insertEntryAtIndex2 = TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release, k11, v11);
        this.buffer = insertEntryAtIndex2;
        this.dataMap = i11 | this.dataMap;
        return this;
    }

    private final TrieNode<K, V> mutableMoveEntryToNode(int i11, int i12, int i13, K k11, V v11, int i14, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy != mutabilityOwnership) {
            return new TrieNode<>(this.dataMap ^ i12, i12 | this.nodeMap, bufferMoveEntryToNode(i11, i12, i13, k11, v11, i14, mutabilityOwnership), mutabilityOwnership);
        }
        this.buffer = bufferMoveEntryToNode(i11, i12, i13, k11, v11, i14, mutabilityOwnership);
        this.dataMap ^= i12;
        this.nodeMap |= i12;
        return this;
    }

    private final TrieNode<K, V> mutablePutAllFromOtherNodeCell(TrieNode<K, V> trieNode, int i11, int i12, DeltaCounter deltaCounter, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (hasNodeAt(i11)) {
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(i11));
            if (trieNode.hasNodeAt(i11)) {
                return nodeAtIndex$runtime_release.mutablePutAll(trieNode.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i11)), i12 + 5, deltaCounter, persistentHashMapBuilder);
            }
            if (!trieNode.hasEntryAt$runtime_release(i11)) {
                return nodeAtIndex$runtime_release;
            }
            int entryKeyIndex$runtime_release = trieNode.entryKeyIndex$runtime_release(i11);
            K keyAtIndex = trieNode.keyAtIndex(entryKeyIndex$runtime_release);
            V valueAtKeyIndex = trieNode.valueAtKeyIndex(entryKeyIndex$runtime_release);
            int size = persistentHashMapBuilder.size();
            TrieNode<K, V> mutablePut = nodeAtIndex$runtime_release.mutablePut(keyAtIndex != null ? keyAtIndex.hashCode() : 0, keyAtIndex, valueAtKeyIndex, i12 + 5, persistentHashMapBuilder);
            if (persistentHashMapBuilder.size() == size) {
                deltaCounter.setCount(deltaCounter.getCount() + 1);
            }
            return mutablePut;
        }
        if (!trieNode.hasNodeAt(i11)) {
            int entryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(i11);
            K keyAtIndex2 = keyAtIndex(entryKeyIndex$runtime_release2);
            V valueAtKeyIndex2 = valueAtKeyIndex(entryKeyIndex$runtime_release2);
            int entryKeyIndex$runtime_release3 = trieNode.entryKeyIndex$runtime_release(i11);
            K keyAtIndex3 = trieNode.keyAtIndex(entryKeyIndex$runtime_release3);
            return makeNode(keyAtIndex2 != null ? keyAtIndex2.hashCode() : 0, keyAtIndex2, valueAtKeyIndex2, keyAtIndex3 != null ? keyAtIndex3.hashCode() : 0, keyAtIndex3, trieNode.valueAtKeyIndex(entryKeyIndex$runtime_release3), i12 + 5, persistentHashMapBuilder.getOwnership());
        }
        TrieNode<K, V> nodeAtIndex$runtime_release2 = trieNode.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i11));
        if (!hasEntryAt$runtime_release(i11)) {
            return nodeAtIndex$runtime_release2;
        }
        int entryKeyIndex$runtime_release4 = entryKeyIndex$runtime_release(i11);
        K keyAtIndex4 = keyAtIndex(entryKeyIndex$runtime_release4);
        int i13 = i12 + 5;
        if (!nodeAtIndex$runtime_release2.containsKey(keyAtIndex4 != null ? keyAtIndex4.hashCode() : 0, keyAtIndex4, i13)) {
            return nodeAtIndex$runtime_release2.mutablePut(keyAtIndex4 != null ? keyAtIndex4.hashCode() : 0, keyAtIndex4, valueAtKeyIndex(entryKeyIndex$runtime_release4), i13, persistentHashMapBuilder);
        }
        deltaCounter.setCount(deltaCounter.getCount() + 1);
        return nodeAtIndex$runtime_release2;
    }

    private final TrieNode<K, V> mutableRemoveEntryAtIndex(int i11, int i12, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        Object[] removeEntryAtIndex;
        Object[] removeEntryAtIndex2;
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(i11));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy != persistentHashMapBuilder.getOwnership()) {
            removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(this.buffer, i11);
            return new TrieNode<>(i12 ^ this.dataMap, this.nodeMap, removeEntryAtIndex, persistentHashMapBuilder.getOwnership());
        }
        removeEntryAtIndex2 = TrieNodeKt.removeEntryAtIndex(this.buffer, i11);
        this.buffer = removeEntryAtIndex2;
        this.dataMap ^= i12;
        return this;
    }

    private final TrieNode<K, V> mutableRemoveNodeAtIndex(int i11, int i12, MutabilityOwnership mutabilityOwnership) {
        Object[] removeNodeAtIndex;
        Object[] removeNodeAtIndex2;
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy != mutabilityOwnership) {
            removeNodeAtIndex = TrieNodeKt.removeNodeAtIndex(objArr, i11);
            return new TrieNode<>(this.dataMap, i12 ^ this.nodeMap, removeNodeAtIndex, mutabilityOwnership);
        }
        removeNodeAtIndex2 = TrieNodeKt.removeNodeAtIndex(objArr, i11);
        this.buffer = removeNodeAtIndex2;
        this.nodeMap ^= i12;
        return this;
    }

    private final TrieNode<K, V> mutableReplaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i11, int i12, MutabilityOwnership mutabilityOwnership) {
        return trieNode2 == null ? mutableRemoveNodeAtIndex(i11, i12, mutabilityOwnership) : (this.ownedBy == mutabilityOwnership || trieNode != trieNode2) ? mutableUpdateNodeAtIndex(i11, trieNode2, mutabilityOwnership) : this;
    }

    private final TrieNode<K, V> mutableUpdateNodeAtIndex(int i11, TrieNode<K, V> trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && trieNode.buffer.length == 2 && trieNode.nodeMap == 0) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        }
        if (this.ownedBy == mutabilityOwnership) {
            objArr[i11] = trieNode;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        g0.o(copyOf, "copyOf(...)");
        copyOf[i11] = trieNode;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableUpdateValueAtIndex(int i11, V v11, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
            this.buffer[i11 + 1] = v11;
            return this;
        }
        persistentHashMapBuilder.setModCount$runtime_release(persistentHashMapBuilder.getModCount$runtime_release() + 1);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        g0.o(copyOf, "copyOf(...)");
        copyOf[i11 + 1] = v11;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, persistentHashMapBuilder.getOwnership());
    }

    private final TrieNode<K, V> removeEntryAtIndex(int i11, int i12) {
        Object[] removeEntryAtIndex;
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(objArr, i11);
        return new TrieNode<>(i12 ^ this.dataMap, this.nodeMap, removeEntryAtIndex);
    }

    private final TrieNode<K, V> removeNodeAtIndex(int i11, int i12) {
        Object[] removeNodeAtIndex;
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        removeNodeAtIndex = TrieNodeKt.removeNodeAtIndex(objArr, i11);
        return new TrieNode<>(this.dataMap, i12 ^ this.nodeMap, removeNodeAtIndex);
    }

    private final TrieNode<K, V> replaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i11, int i12) {
        return trieNode2 == null ? removeNodeAtIndex(i11, i12) : trieNode != trieNode2 ? updateNodeAtIndex(i11, i12, trieNode2) : this;
    }

    private final TrieNode<K, V> updateNodeAtIndex(int i11, int i12, TrieNode<K, V> trieNode) {
        Object[] replaceNodeWithEntry;
        Object[] objArr = trieNode.buffer;
        if (objArr.length != 2 || trieNode.nodeMap != 0) {
            Object[] objArr2 = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            g0.o(copyOf, "copyOf(...)");
            copyOf[i11] = trieNode;
            return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
        }
        if (this.buffer.length == 1) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        }
        replaceNodeWithEntry = TrieNodeKt.replaceNodeWithEntry(this.buffer, i11, entryKeyIndex$runtime_release(i12), objArr[0], objArr[1]);
        return new TrieNode<>(this.dataMap ^ i12, i12 ^ this.nodeMap, replaceNodeWithEntry);
    }

    private final TrieNode<K, V> updateValueAtIndex(int i11, V v11) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        g0.o(copyOf, "copyOf(...)");
        copyOf[i11 + 1] = v11;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
    }

    private final V valueAtKeyIndex(int i11) {
        return (V) this.buffer[i11 + 1];
    }

    public final void accept$runtime_release(@k s<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, g2> sVar) {
        accept(sVar, 0, 0);
    }

    public final boolean containsKey(int i11, K k11, int i12) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i11, i12);
        if (hasEntryAt$runtime_release(indexSegment)) {
            return g0.g(k11, keyAtIndex(entryKeyIndex$runtime_release(indexSegment)));
        }
        if (!hasNodeAt(indexSegment)) {
            return false;
        }
        TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(indexSegment));
        return i12 == 30 ? nodeAtIndex$runtime_release.collisionContainsKey(k11) : nodeAtIndex$runtime_release.containsKey(i11, k11, i12 + 5);
    }

    public final int entryCount$runtime_release() {
        return Integer.bitCount(this.dataMap);
    }

    public final int entryKeyIndex$runtime_release(int i11) {
        return Integer.bitCount((i11 - 1) & this.dataMap) * 2;
    }

    @l
    public final V get(int i11, K k11, int i12) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i11, i12);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (g0.g(k11, keyAtIndex(entryKeyIndex$runtime_release))) {
                return valueAtKeyIndex(entryKeyIndex$runtime_release);
            }
            return null;
        }
        if (!hasNodeAt(indexSegment)) {
            return null;
        }
        TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(indexSegment));
        return i12 == 30 ? nodeAtIndex$runtime_release.collisionGet(k11) : nodeAtIndex$runtime_release.get(i11, k11, i12 + 5);
    }

    @k
    public final Object[] getBuffer$runtime_release() {
        return this.buffer;
    }

    public final boolean hasEntryAt$runtime_release(int i11) {
        return (i11 & this.dataMap) != 0;
    }

    @k
    public final TrieNode<K, V> mutablePut(int i11, K k11, V v11, int i12, @k PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        PersistentHashMapBuilder<K, V> persistentHashMapBuilder2;
        TrieNode<K, V> mutablePut;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i11, i12);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (g0.g(k11, keyAtIndex(entryKeyIndex$runtime_release))) {
                persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(entryKeyIndex$runtime_release));
                return valueAtKeyIndex(entryKeyIndex$runtime_release) == v11 ? this : mutableUpdateValueAtIndex(entryKeyIndex$runtime_release, v11, persistentHashMapBuilder);
            }
            persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
            return mutableMoveEntryToNode(entryKeyIndex$runtime_release, indexSegment, i11, k11, v11, i12, persistentHashMapBuilder.getOwnership());
        }
        if (!hasNodeAt(indexSegment)) {
            persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
            return mutableInsertEntryAt(indexSegment, k11, v11, persistentHashMapBuilder.getOwnership());
        }
        int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
        if (i12 == 30) {
            mutablePut = nodeAtIndex$runtime_release.mutableCollisionPut(k11, v11, persistentHashMapBuilder);
            persistentHashMapBuilder2 = persistentHashMapBuilder;
        } else {
            persistentHashMapBuilder2 = persistentHashMapBuilder;
            mutablePut = nodeAtIndex$runtime_release.mutablePut(i11, k11, v11, i12 + 5, persistentHashMapBuilder2);
        }
        return nodeAtIndex$runtime_release == mutablePut ? this : mutableUpdateNodeAtIndex(nodeIndex$runtime_release, mutablePut, persistentHashMapBuilder2.getOwnership());
    }

    @k
    public final TrieNode<K, V> mutablePutAll(@k TrieNode<K, V> trieNode, int i11, @k DeltaCounter deltaCounter, @k PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (this == trieNode) {
            deltaCounter.plusAssign(calculateSize());
            return this;
        }
        int i12 = i11;
        if (i12 > 30) {
            return mutableCollisionPutAll(trieNode, deltaCounter, persistentHashMapBuilder.getOwnership());
        }
        int i13 = this.nodeMap | trieNode.nodeMap;
        int i14 = this.dataMap;
        int i15 = trieNode.dataMap;
        int i16 = (i14 ^ i15) & (~i13);
        int i17 = i14 & i15;
        while (i17 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i17);
            if (g0.g(keyAtIndex(entryKeyIndex$runtime_release(lowestOneBit)), trieNode.keyAtIndex(trieNode.entryKeyIndex$runtime_release(lowestOneBit)))) {
                i16 |= lowestOneBit;
            } else {
                i13 |= lowestOneBit;
            }
            i17 ^= lowestOneBit;
        }
        int i18 = 0;
        if (!((i13 & i16) == 0)) {
            PreconditionsKt.throwIllegalStateException("Check failed.");
        }
        TrieNode<K, V> trieNode2 = (g0.g(this.ownedBy, persistentHashMapBuilder.getOwnership()) && this.dataMap == i16 && this.nodeMap == i13) ? this : new TrieNode<>(i16, i13, new Object[(Integer.bitCount(i16) * 2) + Integer.bitCount(i13)]);
        int i19 = i13;
        int i21 = 0;
        while (i19 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i19);
            Object[] objArr = trieNode2.buffer;
            objArr[(objArr.length - 1) - i21] = mutablePutAllFromOtherNodeCell(trieNode, lowestOneBit2, i12, deltaCounter, persistentHashMapBuilder);
            i21++;
            i19 ^= lowestOneBit2;
            i12 = i11;
        }
        while (i16 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i16);
            int i22 = i18 * 2;
            if (trieNode.hasEntryAt$runtime_release(lowestOneBit3)) {
                int entryKeyIndex$runtime_release = trieNode.entryKeyIndex$runtime_release(lowestOneBit3);
                trieNode2.buffer[i22] = trieNode.keyAtIndex(entryKeyIndex$runtime_release);
                trieNode2.buffer[i22 + 1] = trieNode.valueAtKeyIndex(entryKeyIndex$runtime_release);
                if (hasEntryAt$runtime_release(lowestOneBit3)) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                }
            } else {
                int entryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(lowestOneBit3);
                trieNode2.buffer[i22] = keyAtIndex(entryKeyIndex$runtime_release2);
                trieNode2.buffer[i22 + 1] = valueAtKeyIndex(entryKeyIndex$runtime_release2);
            }
            i18++;
            i16 ^= lowestOneBit3;
        }
        return elementsIdentityEquals(trieNode2) ? this : trieNode.elementsIdentityEquals(trieNode2) ? trieNode : trieNode2;
    }

    @l
    public final TrieNode<K, V> mutableRemove(int i11, K k11, int i12, @k PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i11, i12);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (g0.g(k11, keyAtIndex(entryKeyIndex$runtime_release))) {
                return mutableRemoveEntryAtIndex(entryKeyIndex$runtime_release, indexSegment, persistentHashMapBuilder);
            }
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            return mutableReplaceNode(nodeAtIndex$runtime_release, i12 == 30 ? nodeAtIndex$runtime_release.mutableCollisionRemove(k11, persistentHashMapBuilder) : nodeAtIndex$runtime_release.mutableRemove(i11, k11, i12 + 5, persistentHashMapBuilder), nodeIndex$runtime_release, indexSegment, persistentHashMapBuilder.getOwnership());
        }
        return this;
    }

    @k
    public final TrieNode<K, V> nodeAtIndex$runtime_release(int i11) {
        Object obj = this.buffer[i11];
        g0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode) obj;
    }

    public final int nodeIndex$runtime_release(int i11) {
        return (this.buffer.length - 1) - Integer.bitCount((i11 - 1) & this.nodeMap);
    }

    @l
    public final ModificationResult<K, V> put(int i11, K k11, V v11, int i12) {
        ModificationResult<K, V> put;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i11, i12);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (!g0.g(k11, keyAtIndex(entryKeyIndex$runtime_release))) {
                return moveEntryToNode(entryKeyIndex$runtime_release, indexSegment, i11, k11, v11, i12).asInsertResult();
            }
            if (valueAtKeyIndex(entryKeyIndex$runtime_release) == v11) {
                return null;
            }
            return updateValueAtIndex(entryKeyIndex$runtime_release, v11).asUpdateResult();
        }
        if (!hasNodeAt(indexSegment)) {
            return insertEntryAt(indexSegment, k11, v11).asInsertResult();
        }
        int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
        if (i12 == 30) {
            put = nodeAtIndex$runtime_release.collisionPut(k11, v11);
            if (put == null) {
                return null;
            }
        } else {
            put = nodeAtIndex$runtime_release.put(i11, k11, v11, i12 + 5);
            if (put == null) {
                return null;
            }
        }
        put.setNode(updateNodeAtIndex(nodeIndex$runtime_release, indexSegment, put.getNode()));
        return put;
    }

    @l
    public final TrieNode<K, V> remove(int i11, K k11, int i12) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i11, i12);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (g0.g(k11, keyAtIndex(entryKeyIndex$runtime_release))) {
                return removeEntryAtIndex(entryKeyIndex$runtime_release, indexSegment);
            }
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            return replaceNode(nodeAtIndex$runtime_release, i12 == 30 ? nodeAtIndex$runtime_release.collisionRemove(k11) : nodeAtIndex$runtime_release.remove(i11, k11, i12 + 5), nodeIndex$runtime_release, indexSegment);
        }
        return this;
    }

    private final TrieNode<K, V> collisionRemove(K k11, V v11) {
        j B1 = u.B1(u.W1(0, this.buffer.length), 2);
        int d11 = B1.d();
        int f11 = B1.f();
        int g11 = B1.g();
        if ((g11 > 0 && d11 <= f11) || (g11 < 0 && f11 <= d11)) {
            while (true) {
                if (!g0.g(k11, keyAtIndex(d11)) || !g0.g(v11, valueAtKeyIndex(d11))) {
                    if (d11 == f11) {
                        break;
                    }
                    d11 += g11;
                } else {
                    return collisionRemoveEntryAtIndex(d11);
                }
            }
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k11, V v11, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        j B1 = u.B1(u.W1(0, this.buffer.length), 2);
        int d11 = B1.d();
        int f11 = B1.f();
        int g11 = B1.g();
        if ((g11 > 0 && d11 <= f11) || (g11 < 0 && f11 <= d11)) {
            while (true) {
                if (!g0.g(k11, keyAtIndex(d11)) || !g0.g(v11, valueAtKeyIndex(d11))) {
                    if (d11 == f11) {
                        break;
                    }
                    d11 += g11;
                } else {
                    return mutableCollisionRemoveEntryAtIndex(d11, persistentHashMapBuilder);
                }
            }
        }
        return this;
    }

    public TrieNode(int i11, int i12, @k Object[] objArr) {
        this(i11, i12, objArr, null);
    }

    @l
    public final TrieNode<K, V> mutableRemove(int i11, K k11, V v11, int i12, @k PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> mutableRemove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i11, i12);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (g0.g(k11, keyAtIndex(entryKeyIndex$runtime_release)) && g0.g(v11, valueAtKeyIndex(entryKeyIndex$runtime_release))) {
                return mutableRemoveEntryAtIndex(entryKeyIndex$runtime_release, indexSegment, persistentHashMapBuilder);
            }
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i12 == 30) {
                mutableRemove = nodeAtIndex$runtime_release.mutableCollisionRemove(k11, v11, persistentHashMapBuilder);
            } else {
                mutableRemove = nodeAtIndex$runtime_release.mutableRemove(i11, k11, v11, i12 + 5, persistentHashMapBuilder);
            }
            return mutableReplaceNode(nodeAtIndex$runtime_release, mutableRemove, nodeIndex$runtime_release, indexSegment, persistentHashMapBuilder.getOwnership());
        }
        return this;
    }

    @l
    public final TrieNode<K, V> remove(int i11, K k11, V v11, int i12) {
        TrieNode<K, V> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i11, i12);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (g0.g(k11, keyAtIndex(entryKeyIndex$runtime_release)) && g0.g(v11, valueAtKeyIndex(entryKeyIndex$runtime_release))) {
                return removeEntryAtIndex(entryKeyIndex$runtime_release, indexSegment);
            }
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i12 == 30) {
                remove = nodeAtIndex$runtime_release.collisionRemove(k11, v11);
            } else {
                remove = nodeAtIndex$runtime_release.remove(i11, k11, v11, i12 + 5);
            }
            return replaceNode(nodeAtIndex$runtime_release, remove, nodeIndex$runtime_release, indexSegment);
        }
        return this;
    }
}
