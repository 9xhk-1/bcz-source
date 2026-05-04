package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface InputTransformation {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    @l
    default KeyboardOptions getKeyboardOptions() {
        return null;
    }

    void transformInput(@k TextFieldBuffer textFieldBuffer);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion implements InputTransformation {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.foundation.text.input.InputTransformation
        public void transformInput(@k TextFieldBuffer textFieldBuffer) {
        }
    }

    default void applySemantics(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }
}
