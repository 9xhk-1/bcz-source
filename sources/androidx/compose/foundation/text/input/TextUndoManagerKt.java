package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.UndoManagerKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.undo.TextDeleteType;
import androidx.compose.foundation.text.input.internal.undo.TextEditType;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextUndoManagerKt {
    private static final int TEXT_UNDO_CAPACITY = 100;

    private static final boolean isNewLineInsert(TextUndoOperation textUndoOperation) {
        return g0.g(textUndoOperation.getPostText(), "\n") || g0.g(textUndoOperation.getPostText(), "\r\n");
    }

    @l
    public static final TextUndoOperation merge(@k TextUndoOperation textUndoOperation, @k TextUndoOperation textUndoOperation2) {
        if (!textUndoOperation.getCanMerge() || !textUndoOperation2.getCanMerge() || textUndoOperation2.getTimeInMillis() < textUndoOperation.getTimeInMillis() || textUndoOperation2.getTimeInMillis() - textUndoOperation.getTimeInMillis() >= UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS() || isNewLineInsert(textUndoOperation) || isNewLineInsert(textUndoOperation2) || textUndoOperation.getTextEditType() != textUndoOperation2.getTextEditType()) {
            return null;
        }
        if (textUndoOperation.getTextEditType() == TextEditType.Insert && textUndoOperation.getIndex() + textUndoOperation.getPostText().length() == textUndoOperation2.getIndex()) {
            return new TextUndoOperation(textUndoOperation.getIndex(), "", textUndoOperation.getPostText() + textUndoOperation2.getPostText(), textUndoOperation.m1383getPreSelectiond9O1mEE(), textUndoOperation2.m1382getPostSelectiond9O1mEE(), textUndoOperation.getTimeInMillis(), false, 64, null);
        }
        if (textUndoOperation.getTextEditType() == TextEditType.Delete && textUndoOperation.getDeletionType() == textUndoOperation2.getDeletionType() && (textUndoOperation.getDeletionType() == TextDeleteType.Start || textUndoOperation.getDeletionType() == TextDeleteType.End)) {
            if (textUndoOperation.getIndex() == textUndoOperation2.getIndex() + textUndoOperation2.getPreText().length()) {
                return new TextUndoOperation(textUndoOperation2.getIndex(), textUndoOperation2.getPreText() + textUndoOperation.getPreText(), "", textUndoOperation.m1383getPreSelectiond9O1mEE(), textUndoOperation2.m1382getPostSelectiond9O1mEE(), textUndoOperation.getTimeInMillis(), false, 64, null);
            }
            if (textUndoOperation.getIndex() == textUndoOperation2.getIndex()) {
                return new TextUndoOperation(textUndoOperation.getIndex(), textUndoOperation.getPreText() + textUndoOperation2.getPreText(), "", textUndoOperation.m1383getPreSelectiond9O1mEE(), textUndoOperation2.m1382getPostSelectiond9O1mEE(), textUndoOperation.getTimeInMillis(), false, 64, null);
            }
        }
        return null;
    }

    public static final void recordChanges(@k TextUndoManager textUndoManager, @k TextFieldCharSequence textFieldCharSequence, @k TextFieldCharSequence textFieldCharSequence2, @k TextFieldBuffer.ChangeList changeList, boolean z11) {
        if (changeList.getChangeCount() > 1) {
            textUndoManager.record(new TextUndoOperation(0, textFieldCharSequence.toString(), textFieldCharSequence2.toString(), textFieldCharSequence.m1189getSelectiond9O1mEE(), textFieldCharSequence2.m1189getSelectiond9O1mEE(), 0L, false, 32, null));
            return;
        }
        if (changeList.getChangeCount() == 1) {
            long mo1185getOriginalRangejx7JFs = changeList.mo1185getOriginalRangejx7JFs(0);
            long mo1186getRangejx7JFs = changeList.mo1186getRangejx7JFs(0);
            if (TextRange.m4553getCollapsedimpl(mo1185getOriginalRangejx7JFs) && TextRange.m4553getCollapsedimpl(mo1186getRangejx7JFs)) {
                return;
            }
            textUndoManager.record(new TextUndoOperation(TextRange.m4557getMinimpl(mo1185getOriginalRangejx7JFs), TextRangeKt.m4566substringFDrldGo(textFieldCharSequence, mo1185getOriginalRangejx7JFs), TextRangeKt.m4566substringFDrldGo(textFieldCharSequence2, mo1186getRangejx7JFs), textFieldCharSequence.m1189getSelectiond9O1mEE(), textFieldCharSequence2.m1189getSelectiond9O1mEE(), 0L, z11, 32, null));
        }
    }

    public static /* synthetic */ void recordChanges$default(TextUndoManager textUndoManager, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, TextFieldBuffer.ChangeList changeList, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        recordChanges(textUndoManager, textFieldCharSequence, textFieldCharSequence2, changeList, z11);
    }
}
