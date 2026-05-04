package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.a;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", f = "TransformableState.kt", i = {}, l = {443}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class DefaultTransformableState$transform$2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ p<TransformScope, c<? super g2>, Object> $block;
    final /* synthetic */ MutatePriority $transformPriority;
    int label;
    final /* synthetic */ DefaultTransformableState this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", f = "TransformableState.kt", i = {}, l = {446}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<TransformScope, c<? super g2>, Object> {
        final /* synthetic */ p<TransformScope, c<? super g2>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DefaultTransformableState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(DefaultTransformableState defaultTransformableState, p<? super TransformScope, ? super c<? super g2>, ? extends Object> pVar, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = defaultTransformableState;
            this.$block = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // x00.p
        public final Object invoke(TransformScope transformScope, c<? super g2> cVar) {
            return ((AnonymousClass1) create(transformScope, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableState mutableState;
            MutableState mutableState2;
            MutableState mutableState3;
            Object l11 = b.l();
            int i11 = this.label;
            try {
                if (i11 == 0) {
                    e.n(obj);
                    TransformScope transformScope = (TransformScope) this.L$0;
                    mutableState2 = this.this$0.isTransformingState;
                    mutableState2.setValue(a.a(true));
                    p<TransformScope, c<? super g2>, Object> pVar = this.$block;
                    this.label = 1;
                    if (pVar.invoke(transformScope, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.n(obj);
                }
                mutableState3 = this.this$0.isTransformingState;
                mutableState3.setValue(a.a(false));
                return g2.f100423a;
            } catch (Throwable th2) {
                mutableState = this.this$0.isTransformingState;
                mutableState.setValue(a.a(false));
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DefaultTransformableState$transform$2(DefaultTransformableState defaultTransformableState, MutatePriority mutatePriority, p<? super TransformScope, ? super c<? super g2>, ? extends Object> pVar, c<? super DefaultTransformableState$transform$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultTransformableState;
        this.$transformPriority = mutatePriority;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new DefaultTransformableState$transform$2(this.this$0, this.$transformPriority, this.$block, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((DefaultTransformableState$transform$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutatorMutex mutatorMutex;
        TransformScope transformScope;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            mutatorMutex = this.this$0.transformMutex;
            transformScope = this.this$0.transformScope;
            MutatePriority mutatePriority = this.$transformPriority;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, null);
            this.label = 1;
            if (mutatorMutex.mutateWith(transformScope, mutatePriority, anonymousClass1, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }
}
