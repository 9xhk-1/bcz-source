package androidx.compose.foundation.text;

import c40.a1;
import com.jiongji.andriod.card.R;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.text.SecureTextFieldController$observeHideEvents$2", f = "BasicSecureTextField.kt", i = {}, l = {R.styleable.Theme_drawable_time}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SecureTextFieldController$observeHideEvents$2 extends SuspendLambda implements p<g2, j00.c<? super g2>, Object> {
    int label;
    final /* synthetic */ SecureTextFieldController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureTextFieldController$observeHideEvents$2(SecureTextFieldController secureTextFieldController, j00.c<? super SecureTextFieldController$observeHideEvents$2> cVar) {
        super(2, cVar);
        this.this$0 = secureTextFieldController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new SecureTextFieldController$observeHideEvents$2(this.this$0, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            this.label = 1;
            if (a1.b(1500L, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        this.this$0.getPasswordInputTransformation().hide();
        return g2.f100423a;
    }

    @Override // x00.p
    public final Object invoke(g2 g2Var, j00.c<? super g2> cVar) {
        return ((SecureTextFieldController$observeHideEvents$2) create(g2Var, cVar)).invokeSuspend(g2.f100423a);
    }
}
