package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextUndoOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoOperation.kt\nandroidx/compose/foundation/text/input/internal/undo/TextUndoOperationKt\n+ 2 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,171:1\n281#2,11:172\n281#2,11:183\n*S KotlinDebug\n*F\n+ 1 TextUndoOperation.kt\nandroidx/compose/foundation/text/input/internal/undo/TextUndoOperationKt\n*L\n114#1:172,11\n122#1:183,11\n*E\n"})
/* loaded from: classes.dex */
public final class TextUndoOperationKt {
    public static final void redo(@k TextFieldState textFieldState, @k TextUndoOperation textUndoOperation) {
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPreText().length(), textUndoOperation.getPostText());
        TextFieldBufferKt.setSelectionCoerced(mainBuffer$foundation_release, TextRange.m4559getStartimpl(textUndoOperation.m1382getPostSelectiond9O1mEE()), TextRange.m4554getEndimpl(textUndoOperation.m1382getPostSelectiond9O1mEE()));
        textFieldState.updateValueAndNotifyListeners(textFieldState.getValue$foundation_release(), TextFieldBuffer.m1178toTextFieldCharSequenceI88jaVs$foundation_release$default(textFieldState.getMainBuffer$foundation_release(), 0L, null, null, 7, null), true);
    }

    public static final void undo(@k TextFieldState textFieldState, @k TextUndoOperation textUndoOperation) {
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPostText().length(), textUndoOperation.getPreText());
        TextFieldBufferKt.setSelectionCoerced(mainBuffer$foundation_release, TextRange.m4559getStartimpl(textUndoOperation.m1383getPreSelectiond9O1mEE()), TextRange.m4554getEndimpl(textUndoOperation.m1383getPreSelectiond9O1mEE()));
        textFieldState.updateValueAndNotifyListeners(textFieldState.getValue$foundation_release(), TextFieldBuffer.m1178toTextFieldCharSequenceI88jaVs$foundation_release$default(textFieldState.getMainBuffer$foundation_release(), 0L, null, null, 7, null), true);
    }
}
