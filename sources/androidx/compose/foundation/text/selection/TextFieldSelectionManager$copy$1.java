package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", i = {}, l = {623}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TextFieldSelectionManager$copy$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ boolean $cancelSelection;
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$copy$1(TextFieldSelectionManager textFieldSelectionManager, boolean z11, j00.c<? super TextFieldSelectionManager$copy$1> cVar) {
        super(2, cVar);
        this.this$0 = textFieldSelectionManager;
        this.$cancelSelection = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new TextFieldSelectionManager$copy$1(this.this$0, this.$cancelSelection, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((TextFieldSelectionManager$copy$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TextFieldValue m1499createTextFieldValueFDrldGo;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            if (TextRange.m4553getCollapsedimpl(this.this$0.getValue$foundation_release().m4807getSelectiond9O1mEE())) {
                return g2.f100423a;
            }
            Clipboard clipboard$foundation_release = this.this$0.getClipboard$foundation_release();
            if (clipboard$foundation_release != null) {
                ClipEntry clipEntry = ClipboardUtils_androidKt.toClipEntry(TextFieldValueKt.getSelectedText(this.this$0.getValue$foundation_release()));
                this.label = 1;
                if (clipboard$foundation_release.setClipEntry(clipEntry, this) == l11) {
                    return l11;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        if (!this.$cancelSelection) {
            return g2.f100423a;
        }
        int m4556getMaximpl = TextRange.m4556getMaximpl(this.this$0.getValue$foundation_release().m4807getSelectiond9O1mEE());
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        m1499createTextFieldValueFDrldGo = textFieldSelectionManager.m1499createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(m4556getMaximpl, m4556getMaximpl));
        this.this$0.getOnValueChange$foundation_release().invoke(m1499createTextFieldValueFDrldGo);
        this.this$0.setHandleState(HandleState.None);
        return g2.f100423a;
    }
}
