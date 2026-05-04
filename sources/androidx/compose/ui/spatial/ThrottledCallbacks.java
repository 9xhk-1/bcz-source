package androidx.compose.ui.spatial;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nThrottledCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacks\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n+ 7 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,488:1\n404#1,6:489\n394#1:495\n395#1,6:512\n401#1:525\n386#1,3:526\n389#1,3:534\n394#1:537\n395#1,6:554\n401#1:567\n386#1,6:568\n397#2,3:496\n354#2,6:499\n364#2,3:506\n367#2,2:510\n370#2,6:518\n400#2:524\n397#2,3:538\n354#2,6:541\n364#2,3:548\n367#2,2:552\n370#2,6:560\n400#2:566\n397#2,3:574\n354#2,6:577\n364#2,3:584\n367#2,9:588\n400#2:597\n1399#3:505\n1270#3:509\n1399#3:547\n1270#3:551\n1399#3:583\n1270#3:587\n54#4:529\n59#4:531\n85#5:530\n90#5:532\n787#6:533\n679#7:598\n1#8:599\n*S KotlinDebug\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacks\n*L\n171#1:489,6\n181#1:495\n181#1:512,6\n181#1:525\n197#1:526,3\n197#1:534,3\n226#1:537\n226#1:554,6\n226#1:567\n237#1:568,6\n181#1:496,3\n181#1:499,6\n181#1:506,3\n181#1:510,2\n181#1:518,6\n181#1:524\n226#1:538,3\n226#1:541,6\n226#1:548,3\n226#1:552,2\n226#1:560,6\n226#1:566\n394#1:574,3\n394#1:577,6\n394#1:584,3\n394#1:588,9\n394#1:597\n181#1:505\n181#1:509\n226#1:547\n226#1:551\n394#1:583\n394#1:587\n205#1:529\n205#1:531\n205#1:530\n205#1:532\n205#1:533\n412#1:598\n412#1:599\n*E\n"})
/* loaded from: classes2.dex */
public final class ThrottledCallbacks {
    public static final int $stable = 8;

    @l
    private Entry globalChangeEntries;
    private long screenOffset;

    @l
    private float[] viewToWindowMatrix;
    private long windowOffset;

    @k
    private final MutableIntObjectMap<Entry> rectChangedMap = IntObjectMapKt.mutableIntObjectMapOf();
    private long minDebounceDeadline = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class Entry implements DelegatableNode.RegistrationHandle {
        private long bottomRight;

        @k
        private final x00.l<RelativeLayoutBounds, g2> callback;
        private final long debounceMillis;

        /* renamed from: id, reason: collision with root package name */
        private final int f4227id;
        private long lastInvokeMillis;
        private long lastUninvokedFireMillis = -1;

        @l
        private Entry next;

        @k
        private final DelegatableNode node;
        private final long throttleMillis;
        private long topLeft;

        /* JADX WARN: Multi-variable type inference failed */
        public Entry(int i11, long j11, long j12, @k DelegatableNode delegatableNode, @k x00.l<? super RelativeLayoutBounds, g2> lVar) {
            this.f4227id = i11;
            this.throttleMillis = j11;
            this.debounceMillis = j12;
            this.node = delegatableNode;
            this.callback = lVar;
            this.lastInvokeMillis = -j11;
        }

        /* renamed from: fire-9b-9wPM, reason: not valid java name */
        public final void m4365fire9b9wPM(long j11, long j12, long j13, long j14, @l float[] fArr) {
            RelativeLayoutBounds m4366rectInfoForQMZNJw = ThrottledCallbacksKt.m4366rectInfoForQMZNJw(this.node, j11, j12, j13, j14, fArr);
            if (m4366rectInfoForQMZNJw == null) {
                return;
            }
            this.callback.invoke(m4366rectInfoForQMZNJw);
        }

        public final long getBottomRight() {
            return this.bottomRight;
        }

        @k
        public final x00.l<RelativeLayoutBounds, g2> getCallback() {
            return this.callback;
        }

        public final long getDebounceMillis() {
            return this.debounceMillis;
        }

        public final int getId() {
            return this.f4227id;
        }

        public final long getLastInvokeMillis() {
            return this.lastInvokeMillis;
        }

        public final long getLastUninvokedFireMillis() {
            return this.lastUninvokedFireMillis;
        }

        @l
        public final Entry getNext() {
            return this.next;
        }

        @k
        public final DelegatableNode getNode() {
            return this.node;
        }

        public final long getThrottleMillis() {
            return this.throttleMillis;
        }

        public final long getTopLeft() {
            return this.topLeft;
        }

        public final void setBottomRight(long j11) {
            this.bottomRight = j11;
        }

        public final void setLastInvokeMillis(long j11) {
            this.lastInvokeMillis = j11;
        }

        public final void setLastUninvokedFireMillis(long j11) {
            this.lastUninvokedFireMillis = j11;
        }

        public final void setNext(@l Entry entry) {
            this.next = entry;
        }

        public final void setTopLeft(long j11) {
            this.topLeft = j11;
        }

        @Override // androidx.compose.ui.node.DelegatableNode.RegistrationHandle
        public void unregister() {
            ThrottledCallbacks throttledCallbacks = ThrottledCallbacks.this;
            if (throttledCallbacks.multiRemove(throttledCallbacks.getRectChangedMap(), this.f4227id, this)) {
                return;
            }
            ThrottledCallbacks.this.removeFromGlobalEntries(this);
        }
    }

    public ThrottledCallbacks() {
        IntOffset.Companion companion = IntOffset.Companion;
        this.windowOffset = companion.m5254getZeronOccac();
        this.screenOffset = companion.m5254getZeronOccac();
    }

    private final void addToGlobalEntries(Entry entry) {
        entry.setNext(this.globalChangeEntries);
        this.globalChangeEntries = entry;
    }

    /* renamed from: debounceEntry-b8qMvQI, reason: not valid java name */
    private final long m4356debounceEntryb8qMvQI(Entry entry, long j11, long j12, float[] fArr, long j13, long j14) {
        if (entry.getDebounceMillis() <= 0 || entry.getLastUninvokedFireMillis() <= 0) {
            return j14;
        }
        if (j13 - entry.getLastUninvokedFireMillis() <= entry.getDebounceMillis()) {
            return Math.min(j14, entry.getLastUninvokedFireMillis() + entry.getDebounceMillis());
        }
        entry.setLastInvokeMillis(j13);
        entry.setLastUninvokedFireMillis(-1L);
        entry.m4365fire9b9wPM(entry.getTopLeft(), entry.getBottomRight(), j11, j12, fArr);
        return j14;
    }

    /* renamed from: fire-WY9HvpM, reason: not valid java name */
    private final void m4357fireWY9HvpM(Entry entry, long j11, long j12, float[] fArr, long j13) {
        boolean z11 = j13 - entry.getLastInvokeMillis() > entry.getThrottleMillis();
        boolean z12 = entry.getDebounceMillis() == 0;
        entry.setLastUninvokedFireMillis(j13);
        if (z11 && z12) {
            entry.setLastInvokeMillis(j13);
            entry.m4365fire9b9wPM(entry.getTopLeft(), entry.getBottomRight(), j11, j12, fArr);
        }
        if (z12) {
            return;
        }
        long j14 = this.minDebounceDeadline;
        long debounceMillis = entry.getDebounceMillis() + j13;
        if (j14 <= 0 || debounceMillis >= j14) {
            return;
        }
        this.minDebounceDeadline = j14;
    }

    private final void fireWithUpdatedRect(Entry entry, long j11, long j12, long j13) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        long throttleMillis = entry.getThrottleMillis();
        long debounceMillis = entry.getDebounceMillis();
        boolean z11 = j13 - lastInvokeMillis >= throttleMillis;
        boolean z12 = debounceMillis == 0;
        boolean z13 = throttleMillis == 0;
        entry.setTopLeft(j11);
        entry.setBottomRight(j12);
        boolean z14 = !(z12 || z13) || z12;
        if (z11 && z14) {
            entry.setLastUninvokedFireMillis(-1L);
            entry.setLastInvokeMillis(j13);
            entry.m4365fire9b9wPM(j11, j12, this.windowOffset, this.screenOffset, this.viewToWindowMatrix);
        } else {
            if (z12) {
                return;
            }
            entry.setLastUninvokedFireMillis(j13);
            long j14 = this.minDebounceDeadline;
            long j15 = j13 + debounceMillis;
            if (j14 <= 0 || j15 >= j14) {
                return;
            }
            this.minDebounceDeadline = j14;
        }
    }

    private final void linkedForEach(Entry entry, x00.l<? super Entry, g2> lVar) {
        while (entry != null) {
            lVar.invoke(entry);
            entry = entry.getNext();
        }
    }

    private final void multiForEach(MutableIntObjectMap<Entry> mutableIntObjectMap, x00.l<? super Entry, g2> lVar) {
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        for (Entry entry = (Entry) objArr[(i11 << 3) + i13]; entry != null; entry = entry.getNext()) {
                            lVar.invoke(entry);
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    private final Entry multiPut(MutableIntObjectMap<Entry> mutableIntObjectMap, int i11, Entry entry) {
        Entry entry2 = mutableIntObjectMap.get(i11);
        if (entry2 == null) {
            mutableIntObjectMap.set(i11, entry);
            entry2 = entry;
        }
        Entry entry3 = entry2;
        if (entry3 != entry) {
            while (entry3.getNext() != null) {
                entry3 = entry3.getNext();
                g0.m(entry3);
            }
            entry3.setNext(entry);
        }
        return entry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean multiRemove(MutableIntObjectMap<Entry> mutableIntObjectMap, int i11, Entry entry) {
        Entry remove = mutableIntObjectMap.remove(i11);
        if (remove == null) {
            return false;
        }
        if (g0.g(remove, entry)) {
            Entry next = entry.getNext();
            entry.setNext(null);
            if (next != null) {
                mutableIntObjectMap.put(i11, next);
            }
            return true;
        }
        mutableIntObjectMap.put(i11, remove);
        while (true) {
            if (remove == null) {
                break;
            }
            Entry next2 = remove.getNext();
            if (next2 == null) {
                return false;
            }
            if (next2 == entry) {
                remove.setNext(entry.getNext());
                entry.setNext(null);
                break;
            }
            remove = remove.getNext();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeFromGlobalEntries(Entry entry) {
        Entry entry2 = this.globalChangeEntries;
        if (entry2 == entry) {
            this.globalChangeEntries = entry2.getNext();
            entry.setNext(null);
            return true;
        }
        Entry next = entry2 != null ? entry2.getNext() : null;
        while (true) {
            Entry entry3 = next;
            Entry entry4 = entry2;
            entry2 = entry3;
            if (entry2 == null) {
                return false;
            }
            if (entry2 == entry) {
                if (entry4 != null) {
                    entry4.setNext(entry2.getNext());
                }
                entry.setNext(null);
                return true;
            }
            next = entry2.getNext();
        }
    }

    private final long roundDownToMultipleOf8(long j11) {
        return (j11 >> 3) << 3;
    }

    private final void runFor(MutableIntObjectMap<Entry> mutableIntObjectMap, int i11, x00.l<? super Entry, g2> lVar) {
        for (Entry entry = mutableIntObjectMap.get(i11); entry != null; entry = entry.getNext()) {
            lVar.invoke(entry);
        }
    }

    public final void fireGlobalChangeEntries(long j11) {
        long j12 = this.windowOffset;
        long j13 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        Entry entry = this.globalChangeEntries;
        if (entry != null) {
            for (Entry entry2 = entry; entry2 != null; entry2 = entry2.getNext()) {
                LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(entry2.getNode());
                long m4032getOffsetFromRootnOccac$ui_release = requireLayoutNode.m4032getOffsetFromRootnOccac$ui_release();
                long m4031getLastSizeYbymL2g$ui_release = requireLayoutNode.m4031getLastSizeYbymL2g$ui_release();
                entry2.setTopLeft(m4032getOffsetFromRootnOccac$ui_release);
                entry2.setBottomRight(((IntOffset.m5243getXimpl(m4032getOffsetFromRootnOccac$ui_release) + ((int) (m4031getLastSizeYbymL2g$ui_release >> 32))) << 32) | ((IntOffset.m5244getYimpl(m4032getOffsetFromRootnOccac$ui_release) + ((int) (m4031getLastSizeYbymL2g$ui_release & 4294967295L))) & 4294967295L));
                m4357fireWY9HvpM(entry2, j12, j13, fArr, j11);
            }
        }
    }

    public final void fireOnRectChangedEntries(long j11) {
        ThrottledCallbacks throttledCallbacks = this;
        long j12 = throttledCallbacks.windowOffset;
        long j13 = throttledCallbacks.screenOffset;
        float[] fArr = throttledCallbacks.viewToWindowMatrix;
        MutableIntObjectMap<Entry> mutableIntObjectMap = throttledCallbacks.rectChangedMap;
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j14 = jArr[i11];
            if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                long j15 = j14;
                int i13 = 0;
                while (i13 < i12) {
                    if ((j15 & 255) < 128) {
                        Entry entry = (Entry) objArr[(i11 << 3) + i13];
                        while (entry != null) {
                            int i14 = i13;
                            Entry entry2 = entry;
                            throttledCallbacks.m4357fireWY9HvpM(entry2, j12, j13, fArr, j11);
                            entry = entry2.getNext();
                            throttledCallbacks = this;
                            i13 = i14;
                        }
                    }
                    j15 >>= 8;
                    i13++;
                    throttledCallbacks = this;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            }
            i11++;
            throttledCallbacks = this;
        }
    }

    public final void fireOnUpdatedRect(int i11, long j11, long j12, long j13) {
        for (Entry entry = this.rectChangedMap.get(i11); entry != null; entry = entry.getNext()) {
            fireWithUpdatedRect(entry, j11, j12, j13);
        }
    }

    @l
    public final Entry getGlobalChangeEntries() {
        return this.globalChangeEntries;
    }

    public final long getMinDebounceDeadline() {
        return this.minDebounceDeadline;
    }

    @k
    public final MutableIntObjectMap<Entry> getRectChangedMap() {
        return this.rectChangedMap;
    }

    /* renamed from: getScreenOffset-nOcc-ac, reason: not valid java name */
    public final long m4358getScreenOffsetnOccac() {
        return this.screenOffset;
    }

    @l
    /* renamed from: getViewToWindowMatrix-3i98HWw, reason: not valid java name */
    public final float[] m4359getViewToWindowMatrix3i98HWw() {
        return this.viewToWindowMatrix;
    }

    /* renamed from: getWindowOffset-nOcc-ac, reason: not valid java name */
    public final long m4360getWindowOffsetnOccac() {
        return this.windowOffset;
    }

    @k
    public final DelegatableNode.RegistrationHandle registerOnGlobalChange(int i11, long j11, long j12, @k DelegatableNode delegatableNode, @k x00.l<? super RelativeLayoutBounds, g2> lVar) {
        Entry entry = new Entry(i11, j11, j12 == 0 ? j11 : j12, delegatableNode, lVar);
        addToGlobalEntries(entry);
        return entry;
    }

    @k
    public final DelegatableNode.RegistrationHandle registerOnRectChanged(int i11, long j11, long j12, @k DelegatableNode delegatableNode, @k x00.l<? super RelativeLayoutBounds, g2> lVar) {
        return multiPut(this.rectChangedMap, i11, new Entry(i11, j11, j12 == 0 ? j11 : j12, delegatableNode, lVar));
    }

    public final void setGlobalChangeEntries(@l Entry entry) {
        this.globalChangeEntries = entry;
    }

    public final void setMinDebounceDeadline(long j11) {
        this.minDebounceDeadline = j11;
    }

    /* renamed from: setScreenOffset--gyyYBs, reason: not valid java name */
    public final void m4361setScreenOffsetgyyYBs(long j11) {
        this.screenOffset = j11;
    }

    /* renamed from: setViewToWindowMatrix-Q8lPUPs, reason: not valid java name */
    public final void m4362setViewToWindowMatrixQ8lPUPs(@l float[] fArr) {
        this.viewToWindowMatrix = fArr;
    }

    /* renamed from: setWindowOffset--gyyYBs, reason: not valid java name */
    public final void m4363setWindowOffsetgyyYBs(long j11) {
        this.windowOffset = j11;
    }

    public final void triggerDebounced(long j11) {
        long j12;
        long j13;
        int i11;
        if (this.minDebounceDeadline > j11) {
            return;
        }
        long j14 = this.windowOffset;
        long j15 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        MutableIntObjectMap<Entry> mutableIntObjectMap = this.rectChangedMap;
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            j13 = Long.MAX_VALUE;
            while (true) {
                long j16 = jArr[i12];
                j12 = Long.MAX_VALUE;
                if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    long j17 = j16;
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j17 & 255) < 128) {
                            Entry entry = (Entry) objArr[(i12 << 3) + i14];
                            while (entry != null) {
                                int i15 = i12;
                                Entry entry2 = entry;
                                j13 = m4356debounceEntryb8qMvQI(entry2, j14, j15, fArr, j11, j13);
                                i14 = i14;
                                entry = entry2.getNext();
                                i12 = i15;
                            }
                            i11 = i14;
                        } else {
                            i11 = i14;
                        }
                        j17 >>= 8;
                        i14 = i11 + 1;
                        i12 = i12;
                    }
                    int i16 = i12;
                    if (i13 != 8) {
                        break;
                    } else {
                        i12 = i16;
                    }
                }
                if (i12 == length) {
                    break;
                } else {
                    i12++;
                }
            }
        } else {
            j12 = Long.MAX_VALUE;
            j13 = Long.MAX_VALUE;
        }
        Entry entry3 = this.globalChangeEntries;
        if (entry3 != null) {
            long j18 = j13;
            while (entry3 != null) {
                j18 = m4356debounceEntryb8qMvQI(entry3, j14, j15, fArr, j11, j18);
                entry3 = entry3.getNext();
            }
            j13 = j18;
        }
        if (j13 == j12) {
            j13 = -1;
        }
        this.minDebounceDeadline = j13;
    }

    /* renamed from: updateOffsets-bT0EZQs, reason: not valid java name */
    public final boolean m4364updateOffsetsbT0EZQs(long j11, long j12, @l float[] fArr) {
        boolean z11;
        if (IntOffset.m5242equalsimpl0(j12, this.windowOffset)) {
            z11 = false;
        } else {
            this.windowOffset = j12;
            z11 = true;
        }
        if (!IntOffset.m5242equalsimpl0(j11, this.screenOffset)) {
            this.screenOffset = j11;
            z11 = true;
        }
        if (fArr == null) {
            return z11;
        }
        this.viewToWindowMatrix = fArr;
        return true;
    }
}
