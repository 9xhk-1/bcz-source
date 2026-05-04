package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nInputTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/FilterChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n1#2:244\n*E\n"})
/* loaded from: classes.dex */
final class FilterChain implements InputTransformation {

    @k
    private final InputTransformation first;

    @k
    private final InputTransformation second;

    public FilterChain(@k InputTransformation inputTransformation, @k InputTransformation inputTransformation2) {
        this.first = inputTransformation;
        this.second = inputTransformation2;
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void applySemantics(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.first.applySemantics(semanticsPropertyReceiver);
        this.second.applySemantics(semanticsPropertyReceiver);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FilterChain.class != obj.getClass()) {
            return false;
        }
        FilterChain filterChain = (FilterChain) obj;
        return g0.g(this.first, filterChain.first) && g0.g(this.second, filterChain.second) && g0.g(getKeyboardOptions(), filterChain.getKeyboardOptions());
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    @l
    public KeyboardOptions getKeyboardOptions() {
        KeyboardOptions fillUnspecifiedValuesWith$foundation_release;
        KeyboardOptions keyboardOptions = this.second.getKeyboardOptions();
        return (keyboardOptions == null || (fillUnspecifiedValuesWith$foundation_release = keyboardOptions.fillUnspecifiedValuesWith$foundation_release(this.first.getKeyboardOptions())) == null) ? this.first.getKeyboardOptions() : fillUnspecifiedValuesWith$foundation_release;
    }

    public int hashCode() {
        int hashCode = ((this.first.hashCode() * 31) + this.second.hashCode()) * 32;
        KeyboardOptions keyboardOptions = getKeyboardOptions();
        return hashCode + (keyboardOptions != null ? keyboardOptions.hashCode() : 0);
    }

    @k
    public String toString() {
        return this.first + ".then(" + this.second + ')';
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(@k TextFieldBuffer textFieldBuffer) {
        this.first.transformInput(textFieldBuffer);
        this.second.transformInput(textFieldBuffer);
    }
}
