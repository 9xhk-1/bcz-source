package androidx.compose.ui.platform;

import androidx.compose.runtime.SnapshotStateKt;
import com.jiongji.andriod.card.R;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", i = {}, l = {R.styleable.Theme_drawable_tab_mall_new}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 extends SuspendLambda implements x00.p<g2, j00.c<?>, Object> {
    final /* synthetic */ PlatformTextInputSessionScope $parentSession;
    final /* synthetic */ PlatformTextInputMethodRequest $request;
    int label;
    final /* synthetic */ ChainedPlatformTextInputInterceptor this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", i = {}, l = {R.styleable.Theme_drawable_tab_review}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements x00.p<PlatformTextInputInterceptor, j00.c<? super g2>, Object> {
        final /* synthetic */ PlatformTextInputSessionScope $parentSession;
        final /* synthetic */ PlatformTextInputMethodRequest $request;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlatformTextInputMethodRequest platformTextInputMethodRequest, PlatformTextInputSessionScope platformTextInputSessionScope, j00.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$request = platformTextInputMethodRequest;
            this.$parentSession = platformTextInputSessionScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.$parentSession, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // x00.p
        public final Object invoke(PlatformTextInputInterceptor platformTextInputInterceptor, j00.c<? super g2> cVar) {
            return ((AnonymousClass2) create(platformTextInputInterceptor, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.label;
            if (i11 == 0) {
                kotlin.e.n(obj);
                PlatformTextInputInterceptor platformTextInputInterceptor = (PlatformTextInputInterceptor) this.L$0;
                PlatformTextInputMethodRequest platformTextInputMethodRequest = this.$request;
                PlatformTextInputSessionScope platformTextInputSessionScope = this.$parentSession;
                this.label = 1;
                if (platformTextInputInterceptor.interceptStartInputMethod(platformTextInputMethodRequest, platformTextInputSessionScope, this) == l11) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, PlatformTextInputMethodRequest platformTextInputMethodRequest, PlatformTextInputSessionScope platformTextInputSessionScope, j00.c<? super ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3> cVar) {
        super(2, cVar);
        this.this$0 = chainedPlatformTextInputInterceptor;
        this.$request = platformTextInputMethodRequest;
        this.$parentSession = platformTextInputSessionScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(this.this$0, this.$request, this.$parentSession, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            final ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = this.this$0;
            kotlinx.coroutines.flow.i snapshotFlow = SnapshotStateKt.snapshotFlow(new x00.a<PlatformTextInputInterceptor>() { // from class: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final PlatformTextInputInterceptor invoke() {
                    PlatformTextInputInterceptor interceptor;
                    interceptor = ChainedPlatformTextInputInterceptor.this.getInterceptor();
                    return interceptor;
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.$parentSession, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.k.C(snapshotFlow, anonymousClass2, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        throw new IllegalStateException("Interceptors flow should never terminate.");
    }

    @Override // x00.p
    public final Object invoke(g2 g2Var, j00.c<?> cVar) {
        return ((ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3) create(g2Var, cVar)).invokeSuspend(g2.f100423a);
    }
}
