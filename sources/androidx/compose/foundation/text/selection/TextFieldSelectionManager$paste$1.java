package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", f = "TextFieldSelectionManager.kt", i = {}, l = {647}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TextFieldSelectionManager$paste$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$paste$1(TextFieldSelectionManager textFieldSelectionManager, j00.c<? super TextFieldSelectionManager$paste$1> cVar) {
        super(2, cVar);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new TextFieldSelectionManager$paste$1(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((TextFieldSelectionManager$paste$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnnotatedString readAnnotatedString;
        TextFieldValue m1499createTextFieldValueFDrldGo;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            Clipboard clipboard$foundation_release = this.this$0.getClipboard$foundation_release();
            if (clipboard$foundation_release != null) {
                this.label = 1;
                obj = clipboard$foundation_release.getClipEntry(this);
                if (obj == l11) {
                    return l11;
                }
            }
            return g2.f100423a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.e.n(obj);
        ClipEntry clipEntry = (ClipEntry) obj;
        if (clipEntry != null && (readAnnotatedString = ClipboardUtils_androidKt.readAnnotatedString(clipEntry)) != null) {
            AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(this.this$0.getValue$foundation_release(), this.this$0.getValue$foundation_release().getText().length()).plus(readAnnotatedString).plus(TextFieldValueKt.getTextAfterSelection(this.this$0.getValue$foundation_release(), this.this$0.getValue$foundation_release().getText().length()));
            int m4557getMinimpl = TextRange.m4557getMinimpl(this.this$0.getValue$foundation_release().m4807getSelectiond9O1mEE()) + readAnnotatedString.length();
            m1499createTextFieldValueFDrldGo = this.this$0.m1499createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(m4557getMinimpl, m4557getMinimpl));
            this.this$0.getOnValueChange$foundation_release().invoke(m1499createTextFieldValueFDrldGo);
            this.this$0.setHandleState(HandleState.None);
            UndoManager undoManager = this.this$0.getUndoManager();
            if (undoManager != null) {
                undoManager.forceNextSnapshot();
            }
            return g2.f100423a;
        }
        return g2.f100423a;
    }
}
