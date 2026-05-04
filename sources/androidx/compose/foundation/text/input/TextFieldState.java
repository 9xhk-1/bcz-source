package androidx.compose.foundation.text.input;

import a00.h0;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextUndoManager;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import u30.f0;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,765:1\n1101#2:766\n1083#2,2:767\n85#3:769\n113#3,2:770\n85#3:772\n113#3,2:773\n602#4,8:775\n602#4,8:783\n50#5,5:791\n1#6:796\n423#7,9:797\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n593#1:766\n593#1:767,2\n96#1:769\n96#1:770,2\n110#1:772\n110#1:773,2\n180#1:775,8\n197#1:783,8\n198#1:791,5\n447#1:797,9\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldState {
    public static final int $stable = 0;

    @k
    private final MutableState isEditing$delegate;

    @k
    private TextFieldBuffer mainBuffer;

    @k
    private final MutableVector<NotifyImeListener> notifyImeListeners;

    @k
    private final TextUndoManager textUndoManager;

    @k
    private final UndoState undoState;

    @k
    private final MutableState value$delegate;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface NotifyImeListener {
        void onChange(@k TextFieldCharSequence textFieldCharSequence, @k TextFieldCharSequence textFieldCharSequence2, boolean z11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState$Saver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,765:1\n1#2:766\n*E\n"})
    public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextFieldState, Object> {
        public static final int $stable = 0;

        @k
        public static final Saver INSTANCE = new Saver();

        private Saver() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.runtime.saveable.Saver
        @l
        public TextFieldState restore(@k Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object obj3 = list.get(1);
            Object obj4 = list.get(2);
            Object obj5 = list.get(3);
            g0.n(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            g0.n(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj3).intValue();
            g0.n(obj4, "null cannot be cast to non-null type kotlin.Int");
            long TextRange = TextRangeKt.TextRange(intValue, ((Integer) obj4).intValue());
            TextUndoManager.Companion.Saver saver = TextUndoManager.Companion.Saver.INSTANCE;
            g0.m(obj5);
            TextUndoManager restore = saver.restore(obj5);
            g0.m(restore);
            return new TextFieldState(str, TextRange, restore, (v) null);
        }

        @Override // androidx.compose.runtime.saveable.Saver
        @l
        public Object save(@k SaverScope saverScope, @k TextFieldState textFieldState) {
            return h0.Q(textFieldState.getText().toString(), Integer.valueOf(TextRange.m4559getStartimpl(textFieldState.m1191getSelectiond9O1mEE())), Integer.valueOf(TextRange.m4554getEndimpl(textFieldState.m1191getSelectiond9O1mEE())), TextUndoManager.Companion.Saver.INSTANCE.save(saverScope, textFieldState.getTextUndoManager$foundation_release()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextFieldEditUndoBehavior.values().length];
            try {
                iArr[TextFieldEditUndoBehavior.ClearHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldEditUndoBehavior.MergeIfPossible.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextFieldEditUndoBehavior.NeverMerge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ TextFieldState(String str, long j11, TextUndoManager textUndoManager, v vVar) {
        this(str, j11, textUndoManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void commitEditAsUser(InputTransformation inputTransformation, boolean z11, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        List m1193finalizeComposingAnnotationsitr0ztk;
        List m1193finalizeComposingAnnotationsitr0ztk2;
        TextFieldCharSequence value$foundation_release = getValue$foundation_release();
        if (this.mainBuffer.getChangeTracker$foundation_release().getChangeCount() == 0 && TextRange.m4552equalsimpl0(value$foundation_release.m1189getSelectiond9O1mEE(), this.mainBuffer.m1181getSelectiond9O1mEE())) {
            if (g0.g(value$foundation_release.m1188getCompositionMzsxiRA(), this.mainBuffer.m1179getCompositionMzsxiRA$foundation_release()) && g0.g(value$foundation_release.getHighlight(), this.mainBuffer.getHighlight$foundation_release()) && g0.g(value$foundation_release.getComposingAnnotations(), this.mainBuffer.getComposingAnnotations$foundation_release())) {
                return;
            }
            TextFieldCharSequence value$foundation_release2 = getValue$foundation_release();
            String textFieldBuffer = this.mainBuffer.toString();
            long m1181getSelectiond9O1mEE = this.mainBuffer.m1181getSelectiond9O1mEE();
            TextRange m1179getCompositionMzsxiRA$foundation_release = this.mainBuffer.m1179getCompositionMzsxiRA$foundation_release();
            Pair<TextHighlightType, TextRange> highlight$foundation_release = this.mainBuffer.getHighlight$foundation_release();
            m1193finalizeComposingAnnotationsitr0ztk2 = TextFieldStateKt.m1193finalizeComposingAnnotationsitr0ztk(this.mainBuffer.m1179getCompositionMzsxiRA$foundation_release(), this.mainBuffer.getComposingAnnotations$foundation_release());
            updateValueAndNotifyListeners(value$foundation_release2, new TextFieldCharSequence(textFieldBuffer, m1181getSelectiond9O1mEE, m1179getCompositionMzsxiRA$foundation_release, highlight$foundation_release, m1193finalizeComposingAnnotationsitr0ztk2, null), z11);
            return;
        }
        boolean z12 = false;
        boolean z13 = this.mainBuffer.getChangeTracker$foundation_release().getChangeCount() != 0;
        String textFieldBuffer2 = this.mainBuffer.toString();
        long m1181getSelectiond9O1mEE2 = this.mainBuffer.m1181getSelectiond9O1mEE();
        TextRange m1179getCompositionMzsxiRA$foundation_release2 = this.mainBuffer.m1179getCompositionMzsxiRA$foundation_release();
        Pair<TextHighlightType, TextRange> highlight$foundation_release2 = this.mainBuffer.getHighlight$foundation_release();
        m1193finalizeComposingAnnotationsitr0ztk = TextFieldStateKt.m1193finalizeComposingAnnotationsitr0ztk(this.mainBuffer.m1179getCompositionMzsxiRA$foundation_release(), this.mainBuffer.getComposingAnnotations$foundation_release());
        TextFieldCharSequence textFieldCharSequence = new TextFieldCharSequence(textFieldBuffer2, m1181getSelectiond9O1mEE2, m1179getCompositionMzsxiRA$foundation_release2, highlight$foundation_release2, m1193finalizeComposingAnnotationsitr0ztk, null);
        if (inputTransformation == null) {
            if (z13 && z11) {
                z12 = true;
            }
            updateValueAndNotifyListeners(value$foundation_release, textFieldCharSequence, z12);
            recordEditForUndo(value$foundation_release, textFieldCharSequence, this.mainBuffer.getChangeTracker$foundation_release(), textFieldEditUndoBehavior);
            return;
        }
        TextFieldBuffer textFieldBuffer3 = new TextFieldBuffer(textFieldCharSequence, this.mainBuffer.getChangeTracker$foundation_release(), value$foundation_release, null, 8, null);
        inputTransformation.transformInput(textFieldBuffer3);
        boolean O1 = f0.O1(textFieldBuffer3.asCharSequence(), textFieldCharSequence);
        boolean z14 = !O1;
        boolean m4552equalsimpl0 = TextRange.m4552equalsimpl0(textFieldBuffer3.m1181getSelectiond9O1mEE(), textFieldCharSequence.m1189getSelectiond9O1mEE());
        boolean z15 = !m4552equalsimpl0;
        if (O1 && m4552equalsimpl0) {
            updateValueAndNotifyListeners(value$foundation_release, TextFieldBuffer.m1178toTextFieldCharSequenceI88jaVs$foundation_release$default(textFieldBuffer3, 0L, textFieldCharSequence.m1188getCompositionMzsxiRA(), null, 5, null), z11);
        } else {
            syncMainBufferToTemporaryBuffer$foundation_release(textFieldBuffer3, z14, z15);
        }
        recordEditForUndo(value$foundation_release, getValue$foundation_release(), textFieldBuffer3.getChanges(), textFieldEditUndoBehavior);
    }

    public static /* synthetic */ void commitEditAsUser$default(TextFieldState textFieldState, InputTransformation inputTransformation, boolean z11, TextFieldEditUndoBehavior textFieldEditUndoBehavior, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        textFieldState.commitEditAsUser(inputTransformation, z11, textFieldEditUndoBehavior);
    }

    public static /* synthetic */ void editAsUser$foundation_release$default(TextFieldState textFieldState, InputTransformation inputTransformation, boolean z11, TextFieldEditUndoBehavior textFieldEditUndoBehavior, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        lVar.invoke(textFieldState.getMainBuffer$foundation_release());
        textFieldState.commitEditAsUser(inputTransformation, z11, textFieldEditUndoBehavior);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isEditing() {
        return ((Boolean) this.isEditing$delegate.getValue()).booleanValue();
    }

    private final void recordEditForUndo(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, TextFieldBuffer.ChangeList changeList, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[textFieldEditUndoBehavior.ordinal()];
        if (i11 == 1) {
            this.textUndoManager.clearHistory();
        } else if (i11 == 2) {
            TextUndoManagerKt.recordChanges(this.textUndoManager, textFieldCharSequence, textFieldCharSequence2, changeList, true);
        } else {
            if (i11 != 3) {
                return;
            }
            TextUndoManagerKt.recordChanges(this.textUndoManager, textFieldCharSequence, textFieldCharSequence2, changeList, false);
        }
    }

    private final void setEditing(boolean z11) {
        this.isEditing$delegate.setValue(Boolean.valueOf(z11));
    }

    private final void setValue(TextFieldCharSequence textFieldCharSequence) {
        this.value$delegate.setValue(textFieldCharSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateValueAndNotifyListeners(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z11) {
        setValue(textFieldCharSequence2);
        finishEditing();
        MutableVector<NotifyImeListener> mutableVector = this.notifyImeListeners;
        NotifyImeListener[] notifyImeListenerArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            notifyImeListenerArr[i11].onChange(textFieldCharSequence, textFieldCharSequence2, (!z11 || textFieldCharSequence.contentEquals(textFieldCharSequence2) || textFieldCharSequence.m1188getCompositionMzsxiRA() == null) ? false : true);
        }
    }

    public final void addNotifyImeListener$foundation_release(@k NotifyImeListener notifyImeListener) {
        this.notifyImeListeners.add(notifyImeListener);
    }

    @v0
    public final void commitEdit(@k TextFieldBuffer textFieldBuffer) {
        boolean z11 = textFieldBuffer.getChanges().getChangeCount() > 0;
        boolean m4552equalsimpl0 = true ^ TextRange.m4552equalsimpl0(textFieldBuffer.m1181getSelectiond9O1mEE(), this.mainBuffer.m1181getSelectiond9O1mEE());
        if (z11) {
            this.textUndoManager.clearHistory();
        }
        syncMainBufferToTemporaryBuffer$foundation_release(textFieldBuffer, z11, m4552equalsimpl0);
    }

    public final void edit(@k x00.l<? super TextFieldBuffer, g2> lVar) {
        TextFieldBuffer startEdit = startEdit();
        try {
            lVar.invoke(startEdit);
            commitEdit(startEdit);
        } finally {
            d0.d(1);
            finishEditing();
            d0.c(1);
        }
    }

    public final void editAsUser$foundation_release(@l InputTransformation inputTransformation, boolean z11, @k TextFieldEditUndoBehavior textFieldEditUndoBehavior, @k x00.l<? super TextFieldBuffer, g2> lVar) {
        getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        lVar.invoke(getMainBuffer$foundation_release());
        commitEditAsUser(inputTransformation, z11, textFieldEditUndoBehavior);
    }

    public final void editWithNoSideEffects$foundation_release(@k x00.l<? super TextFieldBuffer, g2> lVar) {
        getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        lVar.invoke(getMainBuffer$foundation_release());
        updateValueAndNotifyListeners(getValue$foundation_release(), TextFieldBuffer.m1178toTextFieldCharSequenceI88jaVs$foundation_release$default(getMainBuffer$foundation_release(), 0L, null, null, 7, null), true);
    }

    @v0
    public final void finishEditing() {
        setEditing(false);
    }

    @l
    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m1190getCompositionMzsxiRA() {
        return getValue$foundation_release().m1188getCompositionMzsxiRA();
    }

    @k
    public final TextFieldBuffer getMainBuffer$foundation_release() {
        return this.mainBuffer;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1191getSelectiond9O1mEE() {
        return getValue$foundation_release().m1189getSelectiond9O1mEE();
    }

    @k
    public final CharSequence getText() {
        return getValue$foundation_release().getText();
    }

    @k
    public final TextUndoManager getTextUndoManager$foundation_release() {
        return this.textUndoManager;
    }

    @ExperimentalFoundationApi
    @k
    public final UndoState getUndoState() {
        return this.undoState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final TextFieldCharSequence getValue$foundation_release() {
        return (TextFieldCharSequence) this.value$delegate.getValue();
    }

    public final void removeNotifyImeListener$foundation_release(@k NotifyImeListener notifyImeListener) {
        this.notifyImeListeners.remove(notifyImeListener);
    }

    public final void setMainBuffer$foundation_release(@k TextFieldBuffer textFieldBuffer) {
        this.mainBuffer = textFieldBuffer;
    }

    @v0
    @k
    public final TextFieldBuffer startEdit() {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        x00.l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (isEditing()) {
                InlineClassHelperKt.throwIllegalStateException("TextFieldState does not support concurrent or nested editing.");
            }
            setEditing(true);
            return new TextFieldBuffer(getValue$foundation_release(), null, null, null, 14, null);
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    @VisibleForTesting
    public final void syncMainBufferToTemporaryBuffer$foundation_release(@k TextFieldBuffer textFieldBuffer, boolean z11, boolean z12) {
        TextFieldCharSequence m1178toTextFieldCharSequenceI88jaVs$foundation_release$default = TextFieldBuffer.m1178toTextFieldCharSequenceI88jaVs$foundation_release$default(this.mainBuffer, 0L, null, null, 7, null);
        if (z11) {
            this.mainBuffer = new TextFieldBuffer(new TextFieldCharSequence(textFieldBuffer.toString(), textFieldBuffer.m1181getSelectiond9O1mEE(), null, null, null, 28, null), null, null, null, 14, null);
        } else if (z12) {
            this.mainBuffer.m1183setSelection5zctL8(TextRangeKt.TextRange(TextRange.m4559getStartimpl(textFieldBuffer.m1181getSelectiond9O1mEE()), TextRange.m4554getEndimpl(textFieldBuffer.m1181getSelectiond9O1mEE())));
        }
        if (z11 || z12 || !g0.g(m1178toTextFieldCharSequenceI88jaVs$foundation_release$default.m1188getCompositionMzsxiRA(), textFieldBuffer.m1179getCompositionMzsxiRA$foundation_release())) {
            this.mainBuffer.commitComposition$foundation_release();
        }
        updateValueAndNotifyListeners(m1178toTextFieldCharSequenceI88jaVs$foundation_release$default, TextFieldBuffer.m1178toTextFieldCharSequenceI88jaVs$foundation_release$default(this.mainBuffer, 0L, null, null, 7, null), true);
    }

    @k
    public String toString() {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        x00.l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            return "TextFieldState(selection=" + ((Object) TextRange.m4562toStringimpl(m1191getSelectiond9O1mEE())) + ", text=\"" + ((Object) getText()) + "\")";
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    public /* synthetic */ TextFieldState(String str, long j11, v vVar) {
        this(str, j11);
    }

    private TextFieldState(String str, long j11, TextUndoManager textUndoManager) {
        this.textUndoManager = textUndoManager;
        this.mainBuffer = new TextFieldBuffer(new TextFieldCharSequence(str, TextRangeKt.m4565coerceIn8ffj60Q(j11, 0, str.length()), null, null, null, 28, null), null, null, null, 14, null);
        this.isEditing$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldCharSequence(str, j11, null, null, null, 28, null), null, 2, null);
        this.undoState = new UndoState(this);
        this.notifyImeListeners = new MutableVector<>(new NotifyImeListener[16], 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextFieldState(java.lang.String r1, long r2, int r4, kotlin.jvm.internal.v r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = ""
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto L12
            int r2 = r1.length()
            long r2 = androidx.compose.ui.text.TextRangeKt.TextRange(r2)
        L12:
            r4 = 0
            r0.<init>(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.TextFieldState.<init>(java.lang.String, long, int, kotlin.jvm.internal.v):void");
    }

    @VisibleForTesting
    public static /* synthetic */ void getMainBuffer$foundation_release$annotations() {
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getUndoState$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldState(String str, long j11) {
        this(str, j11, new TextUndoManager(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), (v) null);
    }
}
