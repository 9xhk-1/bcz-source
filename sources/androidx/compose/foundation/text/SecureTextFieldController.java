package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusState;
import e40.o;
import e40.r;
import e40.s;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SecureTextFieldController {
    public static final int $stable = 8;

    @k
    private final State<Character> obfuscationMaskState;

    @k
    private final PasswordInputTransformation passwordInputTransformation = new PasswordInputTransformation(new SecureTextFieldController$passwordInputTransformation$1(this));

    @k
    private final CodepointTransformation codepointTransformation = new CodepointTransformation() { // from class: androidx.compose.foundation.text.b
        @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
        public final int transform(int i11, int i12) {
            int codepointTransformation$lambda$0;
            codepointTransformation$lambda$0 = SecureTextFieldController.codepointTransformation$lambda$0(SecureTextFieldController.this, i11, i12);
            return codepointTransformation$lambda$0;
        }
    };

    @k
    private final Modifier focusChangeModifier = FocusChangedModifierKt.onFocusChanged(Modifier.Companion, new l<FocusState, g2>() { // from class: androidx.compose.foundation.text.SecureTextFieldController$focusChangeModifier$1
        {
            super(1);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(FocusState focusState) {
            invoke2(focusState);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FocusState focusState) {
            if (focusState.isFocused()) {
                return;
            }
            SecureTextFieldController.this.getPasswordInputTransformation().hide();
        }
    });

    @k
    private final o<g2> resetTimerSignal = r.d(Integer.MAX_VALUE, null, null, 6, null);

    public SecureTextFieldController(@k State<Character> state) {
        this.obfuscationMaskState = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int codepointTransformation$lambda$0(SecureTextFieldController secureTextFieldController, int i11, int i12) {
        return i11 == secureTextFieldController.passwordInputTransformation.getRevealCodepointIndex$foundation_release() ? i12 : secureTextFieldController.obfuscationMaskState.getValue().charValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleHide() {
        if (s.l(this.resetTimerSignal.m(g2.f100423a))) {
            this.passwordInputTransformation.hide();
        }
    }

    @k
    public final CodepointTransformation getCodepointTransformation() {
        return this.codepointTransformation;
    }

    @k
    public final Modifier getFocusChangeModifier() {
        return this.focusChangeModifier;
    }

    @k
    public final PasswordInputTransformation getPasswordInputTransformation() {
        return this.passwordInputTransformation;
    }

    @m80.l
    public final Object observeHideEvents(@k j00.c<? super g2> cVar) {
        Object C = kotlinx.coroutines.flow.k.C(kotlinx.coroutines.flow.k.Z(this.resetTimerSignal), new SecureTextFieldController$observeHideEvents$2(this, null), cVar);
        return C == kotlin.coroutines.intrinsics.b.l() ? C : g2.f100423a;
    }
}
