package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRangeKt;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nChangeTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeTracker.kt\nandroidx/compose/foundation/text/input/internal/ChangeTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1101#2:199\n1083#2,2:200\n1101#2:202\n1083#2,2:203\n423#3,6:205\n641#3,2:211\n429#3,3:213\n472#3:216\n641#3,2:217\n472#3:219\n472#3:221\n435#3,9:222\n516#3:231\n641#3,2:232\n1#4:220\n*S KotlinDebug\n*F\n+ 1 ChangeTracker.kt\nandroidx/compose/foundation/text/input/internal/ChangeTracker\n*L\n31#1:199\n31#1:200,2\n32#1:202\n32#1:203,2\n35#1:205,6\n36#1:211,2\n35#1:213,3\n78#1:216\n109#1:217,2\n131#1:219\n134#1:221\n138#1:222,9\n155#1:231\n188#1:232,2\n*E\n"})
/* loaded from: classes.dex */
public final class ChangeTracker implements TextFieldBuffer.ChangeList {
    public static final int $stable = 8;

    @m80.k
    private MutableVector<Change> _changes;

    @m80.k
    private MutableVector<Change> _changesTemp;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Change {
        private int originalEnd;
        private int originalStart;
        private int preEnd;
        private int preStart;

        public Change(int i11, int i12, int i13, int i14) {
            this.preStart = i11;
            this.preEnd = i12;
            this.originalStart = i13;
            this.originalEnd = i14;
        }

        public static /* synthetic */ Change copy$default(Change change, int i11, int i12, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i11 = change.preStart;
            }
            if ((i15 & 2) != 0) {
                i12 = change.preEnd;
            }
            if ((i15 & 4) != 0) {
                i13 = change.originalStart;
            }
            if ((i15 & 8) != 0) {
                i14 = change.originalEnd;
            }
            return change.copy(i11, i12, i13, i14);
        }

        public final int component1() {
            return this.preStart;
        }

        public final int component2() {
            return this.preEnd;
        }

        public final int component3() {
            return this.originalStart;
        }

        public final int component4() {
            return this.originalEnd;
        }

        @m80.k
        public final Change copy(int i11, int i12, int i13, int i14) {
            return new Change(i11, i12, i13, i14);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Change)) {
                return false;
            }
            Change change = (Change) obj;
            return this.preStart == change.preStart && this.preEnd == change.preEnd && this.originalStart == change.originalStart && this.originalEnd == change.originalEnd;
        }

        public final int getOriginalEnd() {
            return this.originalEnd;
        }

        public final int getOriginalStart() {
            return this.originalStart;
        }

        public final int getPreEnd() {
            return this.preEnd;
        }

        public final int getPreStart() {
            return this.preStart;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.preStart) * 31) + Integer.hashCode(this.preEnd)) * 31) + Integer.hashCode(this.originalStart)) * 31) + Integer.hashCode(this.originalEnd);
        }

        public final void setOriginalEnd(int i11) {
            this.originalEnd = i11;
        }

        public final void setOriginalStart(int i11) {
            this.originalStart = i11;
        }

        public final void setPreEnd(int i11) {
            this.preEnd = i11;
        }

        public final void setPreStart(int i11) {
            this.preStart = i11;
        }

        @m80.k
        public String toString() {
            return "Change(preStart=" + this.preStart + ", preEnd=" + this.preEnd + ", originalStart=" + this.originalStart + ", originalEnd=" + this.originalEnd + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeTracker() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void appendNewChange(Change change, int i11, int i12, int i13) {
        int preEnd;
        if (this._changesTemp.getSize() == 0) {
            preEnd = 0;
        } else {
            Change last = this._changesTemp.last();
            preEnd = last.getPreEnd() - last.getOriginalEnd();
        }
        if (change == null) {
            int i14 = i11 - preEnd;
            change = new Change(i11, i12 + i13, i14, (i12 - i11) + i14);
        } else {
            if (change.getPreStart() > i11) {
                change.setPreStart(i11);
                change.setOriginalStart(i11);
            }
            if (i12 > change.getPreEnd()) {
                int preEnd2 = change.getPreEnd() - change.getOriginalEnd();
                change.setPreEnd(i12);
                change.setOriginalEnd(i12 - preEnd2);
            }
            change.setPreEnd(change.getPreEnd() + i13);
        }
        this._changesTemp.add(change);
    }

    public final void clearChanges() {
        this._changes.clear();
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    public int getChangeCount() {
        return this._changes.getSize();
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    /* renamed from: getOriginalRange--jx7JFs */
    public long mo1185getOriginalRangejx7JFs(int i11) {
        Change change = this._changes.content[i11];
        return TextRangeKt.TextRange(change.getOriginalStart(), change.getOriginalEnd());
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    /* renamed from: getRange--jx7JFs */
    public long mo1186getRangejx7JFs(int i11) {
        Change change = this._changes.content[i11];
        return TextRangeKt.TextRange(change.getPreStart(), change.getPreEnd());
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChangeList(changes=[");
        MutableVector<Change> mutableVector = this._changes;
        Change[] changeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            Change change = changeArr[i11];
            sb2.append('(' + change.getOriginalStart() + ',' + change.getOriginalEnd() + ")->(" + change.getPreStart() + ',' + change.getPreEnd() + ')');
            if (i11 < getChangeCount() - 1) {
                sb2.append(j2.O);
            }
        }
        sb2.append("])");
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    public final void trackChange(int i11, int i12, int i13) {
        int preEnd;
        if (i11 == i12 && i13 == 0) {
            return;
        }
        int min = Math.min(i11, i12);
        int max = Math.max(i11, i12);
        int i14 = i13 - (max - min);
        Change change = null;
        boolean z11 = false;
        for (int i15 = 0; i15 < this._changes.getSize(); i15++) {
            Change change2 = this._changes.content[i15];
            int preStart = change2.getPreStart();
            if ((min > preStart || preStart > max) && (min > (preEnd = change2.getPreEnd()) || preEnd > max)) {
                int preStart2 = change2.getPreStart();
                if (min > change2.getPreEnd() || preStart2 > min) {
                    int preStart3 = change2.getPreStart();
                    if (max > change2.getPreEnd() || preStart3 > max) {
                        if (change2.getPreStart() > max && !z11) {
                            appendNewChange(change, min, max, i14);
                            z11 = true;
                        }
                        if (z11) {
                            change2.setPreStart(change2.getPreStart() + i14);
                            change2.setPreEnd(change2.getPreEnd() + i14);
                        }
                        this._changesTemp.add(change2);
                    }
                }
            }
            if (change == null) {
                change = change2;
            } else {
                change.setPreEnd(change2.getPreEnd());
                change.setOriginalEnd(change2.getOriginalEnd());
            }
        }
        if (!z11) {
            appendNewChange(change, min, max, i14);
        }
        MutableVector<Change> mutableVector = this._changes;
        this._changes = this._changesTemp;
        this._changesTemp = mutableVector;
        mutableVector.clear();
    }

    public ChangeTracker(@m80.l ChangeTracker changeTracker) {
        MutableVector<Change> mutableVector;
        this._changes = new MutableVector<>(new Change[16], 0);
        this._changesTemp = new MutableVector<>(new Change[16], 0);
        if (changeTracker == null || (mutableVector = changeTracker._changes) == null) {
            return;
        }
        Change[] changeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            Change change = changeArr[i11];
            this._changes.add(new Change(change.getPreStart(), change.getPreEnd(), change.getOriginalStart(), change.getOriginalEnd()));
        }
    }

    public /* synthetic */ ChangeTracker(ChangeTracker changeTracker, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? null : changeTracker);
    }
}
