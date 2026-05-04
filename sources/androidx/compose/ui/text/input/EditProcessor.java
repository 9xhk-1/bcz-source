package androidx.compose.ui.text.input;

import a00.r0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nEditProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n34#2,6:173\n1#3:179\n*S KotlinDebug\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n*L\n104#1:173,6\n*E\n"})
/* loaded from: classes2.dex */
public final class EditProcessor {
    public static final int $stable = 8;

    @k
    private TextFieldValue mBufferState = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.Companion.m4564getZerod9O1mEE(), (TextRange) null, (v) null);

    @k
    private EditingBuffer mBuffer = new EditingBuffer(this.mBufferState.getAnnotatedString(), this.mBufferState.m4807getSelectiond9O1mEE(), (v) null);

    private final String generateBatchErrorMessage(List<? extends EditCommand> list, final EditCommand editCommand) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text_release() + ", composition=" + this.mBuffer.m4719getCompositionMzsxiRA$ui_text_release() + ", selection=" + ((Object) TextRange.m4562toStringimpl(this.mBuffer.m4720getSelectiond9O1mEE$ui_text_release())) + "):");
        g0.o(sb2, "append(...)");
        sb2.append('\n');
        g0.o(sb2, "append(...)");
        r0.p3(list, sb2, "\n", null, null, 0, null, new l<EditCommand, CharSequence>() { // from class: androidx.compose.ui.text.input.EditProcessor$generateBatchErrorMessage$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final CharSequence invoke(EditCommand editCommand2) {
                String stringForLog;
                String str = EditCommand.this == editCommand2 ? " > " : "   ";
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                stringForLog = this.toStringForLog(editCommand2);
                sb3.append(stringForLog);
                return sb3.toString();
            }
        }, 60, null);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toStringForLog(EditCommand editCommand) {
        if (editCommand instanceof CommitTextCommand) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
            sb2.append(commitTextCommand.getText().length());
            sb2.append(", newCursorPosition=");
            sb2.append(commitTextCommand.getNewCursorPosition());
            sb2.append(')');
            return sb2.toString();
        }
        if (editCommand instanceof SetComposingTextCommand) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
            sb3.append(setComposingTextCommand.getText().length());
            sb3.append(", newCursorPosition=");
            sb3.append(setComposingTextCommand.getNewCursorPosition());
            sb3.append(')');
            return sb3.toString();
        }
        if (editCommand instanceof SetComposingRegionCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof DeleteSurroundingTextCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof DeleteSurroundingTextInCodePointsCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof SetSelectionCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof FinishComposingTextCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof BackspaceCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof MoveCursorCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof DeleteAllCommand) {
            return editCommand.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Unknown EditCommand: ");
        String C = o0.d(editCommand.getClass()).C();
        if (C == null) {
            C = "{anonymous EditCommand}";
        }
        sb4.append(C);
        return sb4.toString();
    }

    @k
    public final TextFieldValue apply(@k List<? extends EditCommand> list) {
        EditCommand editCommand;
        EditCommand editCommand2 = null;
        try {
            int size = list.size();
            int i11 = 0;
            EditCommand editCommand3 = null;
            while (i11 < size) {
                try {
                    editCommand = list.get(i11);
                } catch (Exception e11) {
                    e = e11;
                    editCommand2 = editCommand3;
                }
                try {
                    editCommand.applyTo(this.mBuffer);
                    i11++;
                    editCommand3 = editCommand;
                } catch (Exception e12) {
                    e = e12;
                    editCommand2 = editCommand;
                    throw new RuntimeException(generateBatchErrorMessage(list, editCommand2), e);
                }
            }
            AnnotatedString annotatedString$ui_text_release = this.mBuffer.toAnnotatedString$ui_text_release();
            long m4720getSelectiond9O1mEE$ui_text_release = this.mBuffer.m4720getSelectiond9O1mEE$ui_text_release();
            TextRange m4547boximpl = TextRange.m4547boximpl(m4720getSelectiond9O1mEE$ui_text_release);
            m4547boximpl.m4563unboximpl();
            TextRange textRange = TextRange.m4558getReversedimpl(this.mBufferState.m4807getSelectiond9O1mEE()) ? null : m4547boximpl;
            TextFieldValue textFieldValue = new TextFieldValue(annotatedString$ui_text_release, textRange != null ? textRange.m4563unboximpl() : TextRangeKt.TextRange(TextRange.m4556getMaximpl(m4720getSelectiond9O1mEE$ui_text_release), TextRange.m4557getMinimpl(m4720getSelectiond9O1mEE$ui_text_release)), this.mBuffer.m4719getCompositionMzsxiRA$ui_text_release(), (v) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e13) {
            e = e13;
        }
    }

    @k
    public final EditingBuffer getMBuffer$ui_text_release() {
        return this.mBuffer;
    }

    @k
    public final TextFieldValue getMBufferState$ui_text_release() {
        return this.mBufferState;
    }

    public final void reset(@k TextFieldValue textFieldValue, @m80.l TextInputSession textInputSession) {
        boolean g11 = g0.g(textFieldValue.m4806getCompositionMzsxiRA(), this.mBuffer.m4719getCompositionMzsxiRA$ui_text_release());
        boolean z11 = true;
        boolean z12 = false;
        if (!g0.g(this.mBufferState.getAnnotatedString().getText(), textFieldValue.getAnnotatedString().getText())) {
            this.mBuffer = new EditingBuffer(textFieldValue.getAnnotatedString(), textFieldValue.m4807getSelectiond9O1mEE(), (v) null);
        } else if (TextRange.m4552equalsimpl0(this.mBufferState.m4807getSelectiond9O1mEE(), textFieldValue.m4807getSelectiond9O1mEE())) {
            z11 = false;
        } else {
            this.mBuffer.setSelection$ui_text_release(TextRange.m4557getMinimpl(textFieldValue.m4807getSelectiond9O1mEE()), TextRange.m4556getMaximpl(textFieldValue.m4807getSelectiond9O1mEE()));
            z12 = true;
            z11 = false;
        }
        if (textFieldValue.m4806getCompositionMzsxiRA() == null) {
            this.mBuffer.commitComposition$ui_text_release();
        } else if (!TextRange.m4553getCollapsedimpl(textFieldValue.m4806getCompositionMzsxiRA().m4563unboximpl())) {
            this.mBuffer.setComposition$ui_text_release(TextRange.m4557getMinimpl(textFieldValue.m4806getCompositionMzsxiRA().m4563unboximpl()), TextRange.m4556getMaximpl(textFieldValue.m4806getCompositionMzsxiRA().m4563unboximpl()));
        }
        if (z11 || (!z12 && !g11)) {
            this.mBuffer.commitComposition$ui_text_release();
            textFieldValue = TextFieldValue.m4802copy3r_uNRQ$default(textFieldValue, (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue2 = this.mBufferState;
        this.mBufferState = textFieldValue;
        if (textInputSession != null) {
            textInputSession.updateState(textFieldValue2, textFieldValue);
        }
    }

    @k
    public final TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }
}
