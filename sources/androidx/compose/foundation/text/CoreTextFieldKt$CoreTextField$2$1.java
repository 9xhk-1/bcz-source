package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextInputService;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1", f = "CoreTextField.kt", i = {}, l = {347}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$2$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ LegacyTextFieldState $state;
    final /* synthetic */ TextInputService $textInputService;
    final /* synthetic */ State<Boolean> $writeable$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$2$1(LegacyTextFieldState legacyTextFieldState, State<Boolean> state, TextInputService textInputService, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, j00.c<? super CoreTextFieldKt$CoreTextField$2$1> cVar) {
        super(2, cVar);
        this.$state = legacyTextFieldState;
        this.$writeable$delegate = state;
        this.$textInputService = textInputService;
        this.$manager = textFieldSelectionManager;
        this.$imeOptions = imeOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new CoreTextFieldKt$CoreTextField$2$1(this.$state, this.$writeable$delegate, this.$textInputService, this.$manager, this.$imeOptions, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((CoreTextFieldKt$CoreTextField$2$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                e.n(obj);
                final State<Boolean> state = this.$writeable$delegate;
                i snapshotFlow = SnapshotStateKt.snapshotFlow(new x00.a<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // x00.a
                    public final Boolean invoke() {
                        boolean CoreTextField$lambda$11;
                        CoreTextField$lambda$11 = CoreTextFieldKt.CoreTextField$lambda$11(state);
                        return Boolean.valueOf(CoreTextField$lambda$11);
                    }
                });
                final LegacyTextFieldState legacyTextFieldState = this.$state;
                final TextInputService textInputService = this.$textInputService;
                final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                final ImeOptions imeOptions = this.$imeOptions;
                j jVar = new j() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1.2
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, j00.c cVar) {
                        return emit(((Boolean) obj2).booleanValue(), (j00.c<? super g2>) cVar);
                    }

                    public final Object emit(boolean z11, j00.c<? super g2> cVar) {
                        if (z11 && LegacyTextFieldState.this.getHasFocus()) {
                            CoreTextFieldKt.startInputSession(textInputService, LegacyTextFieldState.this, textFieldSelectionManager.getValue$foundation_release(), imeOptions, textFieldSelectionManager.getOffsetMapping$foundation_release());
                        } else {
                            CoreTextFieldKt.endInputSession(LegacyTextFieldState.this);
                        }
                        return g2.f100423a;
                    }
                };
                this.label = 1;
                if (snapshotFlow.collect(jVar, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.n(obj);
            }
            CoreTextFieldKt.endInputSession(this.$state);
            return g2.f100423a;
        } catch (Throwable th2) {
            CoreTextFieldKt.endInputSession(this.$state);
            throw th2;
        }
    }
}
