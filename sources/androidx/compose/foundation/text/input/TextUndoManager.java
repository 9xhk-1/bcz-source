package androidx.compose.foundation.text.input;

import a00.h0;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperationKt;
import androidx.compose.foundation.text.input.internal.undo.UndoManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTextUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,251:1\n85#2:252\n113#2,2:253\n602#3,8:255\n602#3,8:263\n1#4:271\n*S KotlinDebug\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager\n*L\n44#1:252\n44#1:253,2\n70#1:255,8\n95#1:263,8\n*E\n"})
/* loaded from: classes.dex */
public final class TextUndoManager {

    @k
    private final MutableState stagingUndo$delegate;

    @k
    private final UndoManager<TextUndoOperation> undoManager;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @StabilityInferred(parameters = 0)
        @u0({"SMAP\nTextUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager$Companion$Saver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion\n*L\n1#1,251:1\n1#2:252\n121#3:253\n159#3:254\n*S KotlinDebug\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager$Companion$Saver\n*L\n102#1:253\n102#1:254\n*E\n"})
        public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextUndoManager, Object> {
            public static final int $stable;

            @k
            public static final Saver INSTANCE = new Saver();

            @k
            private static final androidx.compose.runtime.saveable.Saver<UndoManager<TextUndoOperation>, Object> undoManagerSaver;

            static {
                UndoManager.Companion companion = UndoManager.Companion;
                final androidx.compose.runtime.saveable.Saver<TextUndoOperation, Object> saver = TextUndoOperation.Companion.getSaver();
                undoManagerSaver = new androidx.compose.runtime.saveable.Saver<UndoManager<TextUndoOperation>, Object>() { // from class: androidx.compose.foundation.text.input.TextUndoManager$Companion$Saver$special$$inlined$createSaver$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // androidx.compose.runtime.saveable.Saver
                    public UndoManager<TextUndoOperation> restore(Object obj) {
                        g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list = (List) obj;
                        int intValue = ((Number) list.get(0)).intValue();
                        int intValue2 = ((Number) list.get(1)).intValue();
                        int intValue3 = ((Number) list.get(2)).intValue();
                        Saver saver2 = Saver.this;
                        List j11 = a00.g0.j();
                        int i11 = 3;
                        while (i11 < intValue2 + 3) {
                            Object restore = saver2.restore(list.get(i11));
                            g0.m(restore);
                            j11.add(restore);
                            i11++;
                        }
                        List b11 = a00.g0.b(j11);
                        Saver saver3 = Saver.this;
                        List j12 = a00.g0.j();
                        while (i11 < intValue2 + intValue3 + 3) {
                            Object restore2 = saver3.restore(list.get(i11));
                            g0.m(restore2);
                            j12.add(restore2);
                            i11++;
                        }
                        return new UndoManager<>(b11, a00.g0.b(j12), intValue);
                    }

                    @Override // androidx.compose.runtime.saveable.Saver
                    public Object save(SaverScope saverScope, UndoManager<TextUndoOperation> undoManager) {
                        int i11;
                        SnapshotStateList snapshotStateList;
                        SnapshotStateList snapshotStateList2;
                        SnapshotStateList snapshotStateList3;
                        SnapshotStateList snapshotStateList4;
                        Saver saver2 = Saver.this;
                        List j11 = a00.g0.j();
                        i11 = ((UndoManager) undoManager).capacity;
                        j11.add(Integer.valueOf(i11));
                        snapshotStateList = ((UndoManager) undoManager).undoStack;
                        j11.add(Integer.valueOf(snapshotStateList.size()));
                        snapshotStateList2 = ((UndoManager) undoManager).redoStack;
                        j11.add(Integer.valueOf(snapshotStateList2.size()));
                        snapshotStateList3 = ((UndoManager) undoManager).undoStack;
                        int size = snapshotStateList3.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            j11.add(saver2.save(saverScope, snapshotStateList3.get(i12)));
                        }
                        snapshotStateList4 = ((UndoManager) undoManager).redoStack;
                        int size2 = snapshotStateList4.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            j11.add(saver2.save(saverScope, snapshotStateList4.get(i13)));
                        }
                        return a00.g0.b(j11);
                    }
                };
                $stable = 8;
            }

            private Saver() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.compose.runtime.saveable.Saver
            @l
            public TextUndoManager restore(@k Object obj) {
                g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Object obj3 = list.get(1);
                TextUndoOperation restore = obj2 != null ? TextUndoOperation.Companion.getSaver().restore(obj2) : null;
                androidx.compose.runtime.saveable.Saver<UndoManager<TextUndoOperation>, Object> saver = undoManagerSaver;
                g0.m(obj3);
                UndoManager<TextUndoOperation> restore2 = saver.restore(obj3);
                g0.m(restore2);
                return new TextUndoManager(restore, restore2);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            @k
            public Object save(@k SaverScope saverScope, @k TextUndoManager textUndoManager) {
                TextUndoOperation stagingUndo = textUndoManager.getStagingUndo();
                return h0.Q(stagingUndo != null ? TextUndoOperation.Companion.getSaver().save(saverScope, stagingUndo) : null, undoManagerSaver.save(saverScope, textUndoManager.undoManager));
            }
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextUndoManager() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final void flush() {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        x00.l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextUndoOperation stagingUndo = getStagingUndo();
            if (stagingUndo != null) {
                this.undoManager.record(stagingUndo);
            }
            setStagingUndo(null);
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final TextUndoOperation getStagingUndo() {
        return (TextUndoOperation) this.stagingUndo$delegate.getValue();
    }

    private final void setStagingUndo(TextUndoOperation textUndoOperation) {
        this.stagingUndo$delegate.setValue(textUndoOperation);
    }

    public final void clearHistory() {
        setStagingUndo(null);
        this.undoManager.clearHistory();
    }

    public final boolean getCanRedo() {
        return this.undoManager.getCanRedo$foundation_release() && getStagingUndo() == null;
    }

    public final boolean getCanUndo() {
        return this.undoManager.getCanUndo$foundation_release() || getStagingUndo() != null;
    }

    public final void record(@k TextUndoOperation textUndoOperation) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        x00.l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextUndoOperation stagingUndo = getStagingUndo();
            if (stagingUndo == null) {
                setStagingUndo(textUndoOperation);
                return;
            }
            TextUndoOperation merge = TextUndoManagerKt.merge(stagingUndo, textUndoOperation);
            if (merge != null) {
                setStagingUndo(merge);
            } else {
                flush();
                setStagingUndo(textUndoOperation);
            }
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    public final void redo(@k TextFieldState textFieldState) {
        if (getCanRedo()) {
            TextUndoOperationKt.redo(textFieldState, this.undoManager.redo());
        }
    }

    public final void undo(@k TextFieldState textFieldState) {
        if (getCanUndo()) {
            flush();
            TextUndoOperationKt.undo(textFieldState, this.undoManager.undo());
        }
    }

    public TextUndoManager(@l TextUndoOperation textUndoOperation, @k UndoManager<TextUndoOperation> undoManager) {
        this.undoManager = undoManager;
        this.stagingUndo$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(textUndoOperation, null, 2, null);
    }

    public /* synthetic */ TextUndoManager(TextUndoOperation textUndoOperation, UndoManager undoManager, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : textUndoOperation, (i11 & 2) != 0 ? new UndoManager(null, null, 100, 3, null) : undoManager);
    }
}
