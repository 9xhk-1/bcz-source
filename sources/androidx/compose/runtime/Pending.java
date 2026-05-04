package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.collection.MultiValueMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,4891:1\n33#2,5:4892\n397#3,3:4897\n354#3,6:4900\n364#3,3:4907\n367#3,9:4911\n400#3:4920\n397#3,3:4921\n354#3,6:4924\n364#3,3:4931\n367#3,9:4935\n400#3:4944\n397#3,3:4945\n354#3,6:4948\n364#3,3:4955\n367#3,9:4959\n400#3:4968\n397#3,3:4969\n354#3,6:4972\n364#3,3:4979\n367#3,9:4983\n400#3:4992\n397#3,3:4993\n354#3,6:4996\n364#3,3:5003\n367#3,9:5007\n400#3:5016\n1399#4:4906\n1270#4:4910\n1399#4:4930\n1270#4:4934\n1399#4:4954\n1270#4:4958\n1399#4:4978\n1270#4:4982\n1399#4:5002\n1270#4:5006\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n*L\n135#1:4892,5\n179#1:4897,3\n179#1:4900,6\n179#1:4907,3\n179#1:4911,9\n179#1:4920\n185#1:4921,3\n185#1:4924,6\n185#1:4931,3\n185#1:4935,9\n185#1:4944\n195#1:4945,3\n195#1:4948,6\n195#1:4955,3\n195#1:4959,9\n195#1:4968\n201#1:4969,3\n201#1:4972,6\n201#1:4979,3\n201#1:4983,9\n201#1:4992\n221#1:4993,3\n221#1:4996,6\n221#1:5003,3\n221#1:5007,9\n221#1:5016\n179#1:4906\n179#1:4910\n185#1:4930\n185#1:4934\n195#1:4954\n195#1:4958\n201#1:4978\n201#1:4982\n221#1:5002\n221#1:5006\n*E\n"})
/* loaded from: classes.dex */
final class Pending {
    private int groupIndex;

    @k
    private final MutableIntObjectMap<GroupInfo> groupInfos;

    @k
    private final List<KeyInfo> keyInfos;

    @k
    private final c0 keyMap$delegate;
    private final int startIndex;

    @k
    private final List<KeyInfo> usedKeys;

    public Pending(@k List<KeyInfo> list, int i11) {
        this.keyInfos = list;
        this.startIndex = i11;
        if (!(i11 >= 0)) {
            PreconditionsKt.throwIllegalArgumentException("Invalid start index");
        }
        this.usedKeys = new ArrayList();
        MutableIntObjectMap<GroupInfo> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            KeyInfo keyInfo = this.keyInfos.get(i13);
            mutableIntObjectMap.set(keyInfo.getLocation(), new GroupInfo(i13, i12, keyInfo.getNodes()));
            i12 += keyInfo.getNodes();
        }
        this.groupInfos = mutableIntObjectMap;
        this.keyMap$delegate = e0.c(new x00.a<MultiValueMap<Object, KeyInfo>>() { // from class: androidx.compose.runtime.Pending$keyMap$2
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ MultiValueMap<Object, KeyInfo> invoke() {
                return MultiValueMap.m2027boximpl(m1909invokefVlnmYg());
            }

            /* renamed from: invoke-fVlnmYg, reason: not valid java name */
            public final MutableScatterMap<Object, Object> m1909invokefVlnmYg() {
                MutableScatterMap<Object, Object> multiMap;
                Object joinedKey;
                multiMap = ComposerKt.multiMap(Pending.this.getKeyInfos().size());
                Pending pending = Pending.this;
                int size2 = pending.getKeyInfos().size();
                for (int i14 = 0; i14 < size2; i14++) {
                    KeyInfo keyInfo2 = pending.getKeyInfos().get(i14);
                    joinedKey = ComposerKt.getJoinedKey(keyInfo2);
                    MultiValueMap.m2026addimpl(multiMap, joinedKey, keyInfo2);
                }
                return multiMap;
            }
        });
    }

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    @k
    public final List<KeyInfo> getKeyInfos() {
        return this.keyInfos;
    }

    @k
    /* renamed from: getKeyMap-fVlnmYg, reason: not valid java name */
    public final MutableScatterMap<Object, Object> m1908getKeyMapfVlnmYg() {
        return ((MultiValueMap) this.keyMap$delegate.getValue()).m2044unboximpl();
    }

    @l
    public final KeyInfo getNext(int i11, @l Object obj) {
        return (KeyInfo) MultiValueMap.m2039removeFirstimpl(m1908getKeyMapfVlnmYg(), obj != null ? new JoinedKey(Integer.valueOf(i11), obj) : Integer.valueOf(i11));
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    @k
    public final List<KeyInfo> getUsed() {
        return this.usedKeys;
    }

    public final int nodePositionOf(@k KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(keyInfo.getLocation());
        if (groupInfo != null) {
            return groupInfo.getNodeIndex();
        }
        return -1;
    }

    public final boolean recordUsed(@k KeyInfo keyInfo) {
        return this.usedKeys.add(keyInfo);
    }

    public final void registerInsert(@k KeyInfo keyInfo, int i11) {
        this.groupInfos.set(keyInfo.getLocation(), new GroupInfo(-1, i11, 0));
    }

    public final void registerMoveNode(int i11, int i12, int i13) {
        char c11;
        long j11;
        char c12;
        long j12;
        char c13 = 7;
        long j13 = -9187201950435737472L;
        if (i11 > i12) {
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap = this.groupInfos;
            Object[] objArr = mutableIntObjectMap.values;
            long[] jArr = mutableIntObjectMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i14 = 0;
            while (true) {
                long j14 = jArr[i14];
                if ((((~j14) << c13) & j14 & j13) != j13) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j14 & 255) < 128) {
                            c12 = c13;
                            GroupInfo groupInfo = (GroupInfo) objArr[(i14 << 3) + i16];
                            j12 = j13;
                            int nodeIndex = groupInfo.getNodeIndex();
                            if (i11 <= nodeIndex && nodeIndex < i11 + i13) {
                                groupInfo.setNodeIndex((nodeIndex - i11) + i12);
                            } else if (i12 <= nodeIndex && nodeIndex < i11) {
                                groupInfo.setNodeIndex(nodeIndex + i13);
                            }
                        } else {
                            c12 = c13;
                            j12 = j13;
                        }
                        j14 >>= 8;
                        i16++;
                        c13 = c12;
                        j13 = j12;
                    }
                    c11 = c13;
                    j11 = j13;
                    if (i15 != 8) {
                        return;
                    }
                } else {
                    c11 = c13;
                    j11 = j13;
                }
                if (i14 == length) {
                    return;
                }
                i14++;
                c13 = c11;
                j13 = j11;
            }
        } else {
            if (i12 <= i11) {
                return;
            }
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap2 = this.groupInfos;
            Object[] objArr2 = mutableIntObjectMap2.values;
            long[] jArr2 = mutableIntObjectMap2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i17 = 0;
            while (true) {
                long j15 = jArr2[i17];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                    for (int i19 = 0; i19 < i18; i19++) {
                        if ((j15 & 255) < 128) {
                            GroupInfo groupInfo2 = (GroupInfo) objArr2[(i17 << 3) + i19];
                            int nodeIndex2 = groupInfo2.getNodeIndex();
                            if (i11 <= nodeIndex2 && nodeIndex2 < i11 + i13) {
                                groupInfo2.setNodeIndex((nodeIndex2 - i11) + i12);
                            } else if (i11 + 1 <= nodeIndex2 && nodeIndex2 < i12) {
                                groupInfo2.setNodeIndex(nodeIndex2 - i13);
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i18 != 8) {
                        return;
                    }
                }
                if (i17 == length2) {
                    return;
                } else {
                    i17++;
                }
            }
        }
    }

    public final void registerMoveSlot(int i11, int i12) {
        char c11;
        long j11;
        char c12;
        long j12;
        char c13 = 7;
        long j13 = -9187201950435737472L;
        if (i11 > i12) {
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap = this.groupInfos;
            Object[] objArr = mutableIntObjectMap.values;
            long[] jArr = mutableIntObjectMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                long j14 = jArr[i13];
                if ((((~j14) << c13) & j14 & j13) != j13) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j14 & 255) < 128) {
                            c12 = c13;
                            GroupInfo groupInfo = (GroupInfo) objArr[(i13 << 3) + i15];
                            j12 = j13;
                            int slotIndex = groupInfo.getSlotIndex();
                            if (slotIndex == i11) {
                                groupInfo.setSlotIndex(i12);
                            } else if (i12 <= slotIndex && slotIndex < i11) {
                                groupInfo.setSlotIndex(slotIndex + 1);
                            }
                        } else {
                            c12 = c13;
                            j12 = j13;
                        }
                        j14 >>= 8;
                        i15++;
                        c13 = c12;
                        j13 = j12;
                    }
                    c11 = c13;
                    j11 = j13;
                    if (i14 != 8) {
                        return;
                    }
                } else {
                    c11 = c13;
                    j11 = j13;
                }
                if (i13 == length) {
                    return;
                }
                i13++;
                c13 = c11;
                j13 = j11;
            }
        } else {
            if (i12 <= i11) {
                return;
            }
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap2 = this.groupInfos;
            Object[] objArr2 = mutableIntObjectMap2.values;
            long[] jArr2 = mutableIntObjectMap2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i16 = 0;
            while (true) {
                long j15 = jArr2[i16];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((j15 & 255) < 128) {
                            GroupInfo groupInfo2 = (GroupInfo) objArr2[(i16 << 3) + i18];
                            int slotIndex2 = groupInfo2.getSlotIndex();
                            if (slotIndex2 == i11) {
                                groupInfo2.setSlotIndex(i12);
                            } else if (i11 + 1 <= slotIndex2 && slotIndex2 < i12) {
                                groupInfo2.setSlotIndex(slotIndex2 - 1);
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i17 != 8) {
                        return;
                    }
                }
                if (i16 == length2) {
                    return;
                } else {
                    i16++;
                }
            }
        }
    }

    public final void setGroupIndex(int i11) {
        this.groupIndex = i11;
    }

    public final int slotPositionOf(@k KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(keyInfo.getLocation());
        if (groupInfo != null) {
            return groupInfo.getSlotIndex();
        }
        return -1;
    }

    public final boolean updateNodeCount(int i11, int i12) {
        int nodeIndex;
        GroupInfo groupInfo = this.groupInfos.get(i11);
        if (groupInfo == null) {
            return false;
        }
        int nodeIndex2 = groupInfo.getNodeIndex();
        int nodeCount = i12 - groupInfo.getNodeCount();
        groupInfo.setNodeCount(i12);
        if (nodeCount == 0) {
            return true;
        }
        MutableIntObjectMap<GroupInfo> mutableIntObjectMap = this.groupInfos;
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i13 = 0;
        while (true) {
            long j11 = jArr[i13];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j11) < 128) {
                        GroupInfo groupInfo2 = (GroupInfo) objArr[(i13 << 3) + i15];
                        if (groupInfo2.getNodeIndex() >= nodeIndex2 && !g0.g(groupInfo2, groupInfo) && (nodeIndex = groupInfo2.getNodeIndex() + nodeCount) >= 0) {
                            groupInfo2.setNodeIndex(nodeIndex);
                        }
                    }
                    j11 >>= 8;
                }
                if (i14 != 8) {
                    return true;
                }
            }
            if (i13 == length) {
                return true;
            }
            i13++;
        }
    }

    public final int updatedNodeCountOf(@k KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(keyInfo.getLocation());
        return groupInfo != null ? groupInfo.getNodeCount() : keyInfo.getNodes();
    }
}
