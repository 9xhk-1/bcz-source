package androidx.compose.ui.platform;

import androidx.compose.ui.SessionMutex;
import com.jiongji.andriod.card.R;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", i = {}, l = {R.styleable.Theme_drawable_walk_sound4}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ChainedPlatformTextInputInterceptor$textInputSession$2 extends SuspendLambda implements x00.p<PlatformTextInputSessionScope, j00.c<?>, Object> {
    final /* synthetic */ x00.p<PlatformTextInputSessionScope, j00.c<?>, Object> $session;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChainedPlatformTextInputInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChainedPlatformTextInputInterceptor$textInputSession$2(x00.p<? super PlatformTextInputSessionScope, ? super j00.c<?>, ? extends Object> pVar, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, j00.c<? super ChainedPlatformTextInputInterceptor$textInputSession$2> cVar) {
        super(2, cVar);
        this.$session = pVar;
        this.this$0 = chainedPlatformTextInputInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        ChainedPlatformTextInputInterceptor$textInputSession$2 chainedPlatformTextInputInterceptor$textInputSession$2 = new ChainedPlatformTextInputInterceptor$textInputSession$2(this.$session, this.this$0, cVar);
        chainedPlatformTextInputInterceptor$textInputSession$2.L$0 = obj;
        return chainedPlatformTextInputInterceptor$textInputSession$2;
    }

    @Override // x00.p
    public final Object invoke(PlatformTextInputSessionScope platformTextInputSessionScope, j00.c<?> cVar) {
        return ((ChainedPlatformTextInputInterceptor$textInputSession$2) create(platformTextInputSessionScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1 = new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1((PlatformTextInputSessionScope) this.L$0, SessionMutex.m2088constructorimpl(), this.this$0);
            x00.p<PlatformTextInputSessionScope, j00.c<?>, Object> pVar = this.$session;
            this.label = 1;
            if (pVar.invoke(chainedPlatformTextInputInterceptor$textInputSession$2$scope$1, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        throw new KotlinNothingValueException();
    }
}
