package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nInputTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/MaxLengthFilter\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,243:1\n96#2,5:244\n*S KotlinDebug\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/MaxLengthFilter\n*L\n226#1:244,5\n*E\n"})
/* loaded from: classes.dex */
final class MaxLengthFilter implements InputTransformation {
    private final int maxLength;

    public MaxLengthFilter(int i11) {
        this.maxLength = i11;
        if (i11 >= 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("maxLength must be at least zero");
    }

    private final int component1() {
        return this.maxLength;
    }

    public static /* synthetic */ MaxLengthFilter copy$default(MaxLengthFilter maxLengthFilter, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = maxLengthFilter.maxLength;
        }
        return maxLengthFilter.copy(i11);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void applySemantics(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setMaxTextLength(semanticsPropertyReceiver, this.maxLength);
    }

    @k
    public final MaxLengthFilter copy(int i11) {
        return new MaxLengthFilter(i11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MaxLengthFilter) && this.maxLength == ((MaxLengthFilter) obj).maxLength;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxLength);
    }

    @k
    public String toString() {
        return "InputTransformation.maxLength(" + this.maxLength + ')';
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(@k TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.getLength() > this.maxLength) {
            textFieldBuffer.revertAllChanges();
        }
    }
}
