package androidx.compose.foundation.text.input.internal.undo;

import a00.h0;
import a00.m0;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,162:1\n1#2:163\n96#3,5:164\n96#3,5:169\n50#3,5:174\n50#3,5:179\n*S KotlinDebug\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager\n*L\n55#1:164,5\n56#1:169,5\n78#1:174,5\n96#1:179,5\n*E\n"})
/* loaded from: classes.dex */
public final class UndoManager<T> {
    private final int capacity;

    @k
    private SnapshotStateList<T> redoStack;

    @k
    private SnapshotStateList<T> undoStack;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        public final /* synthetic */ <T> Saver<UndoManager<T>, Object> createSaver(final Saver<T, Object> saver) {
            g0.w();
            return new Saver<UndoManager<T>, Object>() { // from class: androidx.compose.foundation.text.input.internal.undo.UndoManager$Companion$createSaver$1
                @Override // androidx.compose.runtime.saveable.Saver
                public UndoManager<T> restore(Object obj) {
                    g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                    List list = (List) obj;
                    int intValue = ((Number) list.get(0)).intValue();
                    int intValue2 = ((Number) list.get(1)).intValue();
                    int intValue3 = ((Number) list.get(2)).intValue();
                    Saver<T, Object> saver2 = saver;
                    List j11 = a00.g0.j();
                    int i11 = 3;
                    while (i11 < intValue2 + 3) {
                        T restore = saver2.restore(list.get(i11));
                        g0.m(restore);
                        j11.add(restore);
                        i11++;
                    }
                    List b11 = a00.g0.b(j11);
                    Saver<T, Object> saver3 = saver;
                    List j12 = a00.g0.j();
                    while (i11 < intValue2 + intValue3 + 3) {
                        T restore2 = saver3.restore(list.get(i11));
                        g0.m(restore2);
                        j12.add(restore2);
                        i11++;
                    }
                    return new UndoManager<>(b11, a00.g0.b(j12), intValue);
                }

                @Override // androidx.compose.runtime.saveable.Saver
                public Object save(SaverScope saverScope, UndoManager<T> undoManager) {
                    int i11;
                    SnapshotStateList snapshotStateList;
                    SnapshotStateList snapshotStateList2;
                    SnapshotStateList snapshotStateList3;
                    SnapshotStateList snapshotStateList4;
                    Saver<T, Object> saver2 = saver;
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
        }

        private Companion() {
        }
    }

    public UndoManager() {
        this(null, null, 0, 7, null);
    }

    public final void clearHistory() {
        this.undoStack.clear();
        this.redoStack.clear();
    }

    public final boolean getCanRedo$foundation_release() {
        return !this.redoStack.isEmpty();
    }

    public final boolean getCanUndo$foundation_release() {
        return !this.undoStack.isEmpty();
    }

    public final int getSize() {
        return this.undoStack.size() + this.redoStack.size();
    }

    public final void record(T t11) {
        this.redoStack.clear();
        while (getSize() > this.capacity - 1) {
            m0.O0(this.undoStack);
        }
        this.undoStack.add(t11);
    }

    public final T redo() {
        if (!getCanRedo$foundation_release()) {
            InlineClassHelperKt.throwIllegalStateException("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
        }
        T t11 = (T) m0.Q0(this.redoStack);
        this.undoStack.add(t11);
        return t11;
    }

    public final T undo() {
        if (!getCanUndo$foundation_release()) {
            InlineClassHelperKt.throwIllegalStateException("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
        }
        T t11 = (T) m0.Q0(this.undoStack);
        this.redoStack.add(t11);
        return t11;
    }

    public UndoManager(@k List<? extends T> list, @k List<? extends T> list2, int i11) {
        this.capacity = i11;
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(list);
        this.undoStack = snapshotStateList;
        SnapshotStateList<T> snapshotStateList2 = new SnapshotStateList<>();
        snapshotStateList2.addAll(list2);
        this.redoStack = snapshotStateList2;
        if (!(i11 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Capacity must be a positive integer");
        }
        if (getSize() <= i11) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Initial list of undo and redo operations have a size greater than the given capacity.");
    }

    public /* synthetic */ UndoManager(List list, List list2, int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? h0.J() : list, (i12 & 2) != 0 ? h0.J() : list2, (i12 & 4) != 0 ? 100 : i11);
    }
}
