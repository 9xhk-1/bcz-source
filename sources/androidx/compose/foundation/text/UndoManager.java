package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class UndoManager {
    public static final int $stable = 8;
    private boolean forceNextSnapshot;

    @l
    private Long lastSnapshot;
    private final int maxStoredCharacters;

    @l
    private Entry redoStack;
    private int storedCharacters;

    @l
    private Entry undoStack;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Entry {

        @l
        private Entry next;

        @k
        private TextFieldValue value;

        public Entry(@l Entry entry, @k TextFieldValue textFieldValue) {
            this.next = entry;
            this.value = textFieldValue;
        }

        @l
        public final Entry getNext() {
            return this.next;
        }

        @k
        public final TextFieldValue getValue() {
            return this.value;
        }

        public final void setNext(@l Entry entry) {
            this.next = entry;
        }

        public final void setValue(@k TextFieldValue textFieldValue) {
            this.value = textFieldValue;
        }

        public /* synthetic */ Entry(Entry entry, TextFieldValue textFieldValue, int i11, v vVar) {
            this((i11 & 1) != 0 ? null : entry, textFieldValue);
        }
    }

    public UndoManager() {
        this(0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e A[LOOP:0: B:5:0x000e->B:10:0x001e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[EDGE_INSN: B:11:0x0023->B:12:0x0023 BREAK  A[LOOP:0: B:5:0x000e->B:10:0x001e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void removeLastUndo() {
        /*
            r3 = this;
            androidx.compose.foundation.text.UndoManager$Entry r0 = r3.undoStack
            r1 = 0
            if (r0 == 0) goto La
            androidx.compose.foundation.text.UndoManager$Entry r2 = r0.getNext()
            goto Lb
        La:
            r2 = r1
        Lb:
            if (r2 != 0) goto Le
            goto L25
        Le:
            if (r0 == 0) goto L1b
            androidx.compose.foundation.text.UndoManager$Entry r2 = r0.getNext()
            if (r2 == 0) goto L1b
            androidx.compose.foundation.text.UndoManager$Entry r2 = r2.getNext()
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L23
            androidx.compose.foundation.text.UndoManager$Entry r0 = r0.getNext()
            goto Le
        L23:
            if (r0 != 0) goto L26
        L25:
            return
        L26:
            r0.setNext(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.UndoManager.removeLastUndo():void");
    }

    public static /* synthetic */ void snapshotIfNeeded$default(UndoManager undoManager, TextFieldValue textFieldValue, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = UndoManager_jvmKt.timeNowMillis();
        }
        undoManager.snapshotIfNeeded(textFieldValue, j11);
    }

    public final void forceNextSnapshot() {
        this.forceNextSnapshot = true;
    }

    public final int getMaxStoredCharacters() {
        return this.maxStoredCharacters;
    }

    public final void makeSnapshot(@k TextFieldValue textFieldValue) {
        TextFieldValue value;
        this.forceNextSnapshot = false;
        Entry entry = this.undoStack;
        if (g0.g(textFieldValue, entry != null ? entry.getValue() : null)) {
            return;
        }
        String text = textFieldValue.getText();
        Entry entry2 = this.undoStack;
        if (g0.g(text, (entry2 == null || (value = entry2.getValue()) == null) ? null : value.getText())) {
            Entry entry3 = this.undoStack;
            if (entry3 == null) {
                return;
            }
            entry3.setValue(textFieldValue);
            return;
        }
        this.undoStack = new Entry(this.undoStack, textFieldValue);
        this.redoStack = null;
        int length = this.storedCharacters + textFieldValue.getText().length();
        this.storedCharacters = length;
        if (length > this.maxStoredCharacters) {
            removeLastUndo();
        }
    }

    @l
    public final TextFieldValue redo() {
        Entry entry = this.redoStack;
        if (entry == null) {
            return null;
        }
        this.redoStack = entry.getNext();
        this.undoStack = new Entry(this.undoStack, entry.getValue());
        this.storedCharacters += entry.getValue().getText().length();
        return entry.getValue();
    }

    public final void snapshotIfNeeded(@k TextFieldValue textFieldValue, long j11) {
        if (!this.forceNextSnapshot) {
            Long l11 = this.lastSnapshot;
            if (j11 <= (l11 != null ? l11.longValue() : 0L) + UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS()) {
                return;
            }
        }
        this.lastSnapshot = Long.valueOf(j11);
        makeSnapshot(textFieldValue);
    }

    @l
    public final TextFieldValue undo() {
        Entry next;
        Entry entry = this.undoStack;
        if (entry == null || (next = entry.getNext()) == null) {
            return null;
        }
        this.undoStack = next;
        this.storedCharacters -= entry.getValue().getText().length();
        this.redoStack = new Entry(this.redoStack, entry.getValue());
        return next.getValue();
    }

    public UndoManager(int i11) {
        this.maxStoredCharacters = i11;
    }

    public /* synthetic */ UndoManager(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 100000 : i11);
    }
}
