package androidx.compose.foundation.text.input;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class InputTransformationByValue implements InputTransformation {

    @k
    private final p<CharSequence, CharSequence, CharSequence> transformation;

    /* JADX WARN: Multi-variable type inference failed */
    public InputTransformationByValue(@k p<? super CharSequence, ? super CharSequence, ? extends CharSequence> pVar) {
        this.transformation = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputTransformationByValue copy$default(InputTransformationByValue inputTransformationByValue, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pVar = inputTransformationByValue.transformation;
        }
        return inputTransformationByValue.copy(pVar);
    }

    @k
    public final p<CharSequence, CharSequence, CharSequence> component1() {
        return this.transformation;
    }

    @k
    public final InputTransformationByValue copy(@k p<? super CharSequence, ? super CharSequence, ? extends CharSequence> pVar) {
        return new InputTransformationByValue(pVar);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InputTransformationByValue) && g0.g(this.transformation, ((InputTransformationByValue) obj).transformation);
    }

    @k
    public final p<CharSequence, CharSequence, CharSequence> getTransformation() {
        return this.transformation;
    }

    public int hashCode() {
        return this.transformation.hashCode();
    }

    @k
    public String toString() {
        return "InputTransformation.byValue(transformation=" + this.transformation + ')';
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(@k TextFieldBuffer textFieldBuffer) {
        TextFieldCharSequence m1178toTextFieldCharSequenceI88jaVs$foundation_release$default = TextFieldBuffer.m1178toTextFieldCharSequenceI88jaVs$foundation_release$default(textFieldBuffer, 0L, null, null, 7, null);
        CharSequence invoke = this.transformation.invoke(textFieldBuffer.getOriginalValue$foundation_release(), m1178toTextFieldCharSequenceI88jaVs$foundation_release$default);
        if (invoke == m1178toTextFieldCharSequenceI88jaVs$foundation_release$default) {
            return;
        }
        if (invoke == textFieldBuffer.getOriginalValue$foundation_release()) {
            textFieldBuffer.revertAllChanges();
        } else {
            textFieldBuffer.setTextIfChanged$foundation_release(invoke);
        }
    }
}
