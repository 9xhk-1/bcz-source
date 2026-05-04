package androidx.compose.foundation.text;

import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$2$1", f = "BasicSecureTextField.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class BasicSecureTextFieldKt$BasicSecureTextField$2$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ boolean $revealLastTypedEnabled;
    final /* synthetic */ SecureTextFieldController $secureTextFieldController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicSecureTextFieldKt$BasicSecureTextField$2$1(boolean z11, SecureTextFieldController secureTextFieldController, j00.c<? super BasicSecureTextFieldKt$BasicSecureTextField$2$1> cVar) {
        super(2, cVar);
        this.$revealLastTypedEnabled = z11;
        this.$secureTextFieldController = secureTextFieldController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new BasicSecureTextFieldKt$BasicSecureTextField$2$1(this.$revealLastTypedEnabled, this.$secureTextFieldController, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((BasicSecureTextFieldKt$BasicSecureTextField$2$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        if (!this.$revealLastTypedEnabled) {
            this.$secureTextFieldController.getPasswordInputTransformation().hide();
        }
        return g2.f100423a;
    }
}
