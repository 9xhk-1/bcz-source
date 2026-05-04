package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import c40.r0;
import com.squareup.picasso.h0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import l00.d;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.activity.compose.OnBackInstance$job$1", f = "PredictiveBackHandler.kt", i = {0}, l = {121}, m = "invokeSuspend", n = {h0.A}, s = {"L$0"})
@u0({"SMAP\nPredictiveBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/OnBackInstance$job$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
/* loaded from: classes.dex */
public final class OnBackInstance$job$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ OnBackPressedCallback $callback;
    final /* synthetic */ p<i<BackEventCompat>, c<? super g2>, Object> $onBack;
    Object L$0;
    int label;
    final /* synthetic */ OnBackInstance this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.activity.compose.OnBackInstance$job$1$1", f = "PredictiveBackHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.activity.compose.OnBackInstance$job$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements q<j<? super BackEventCompat>, Throwable, c<? super g2>, Object> {
        final /* synthetic */ Ref.BooleanRef $completed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.BooleanRef booleanRef, c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.$completed = booleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            this.$completed.element = true;
            return g2.f100423a;
        }

        @Override // x00.q
        public final Object invoke(j<? super BackEventCompat> jVar, Throwable th2, c<? super g2> cVar) {
            return new AnonymousClass1(this.$completed, cVar).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnBackInstance$job$1(OnBackPressedCallback onBackPressedCallback, p<? super i<BackEventCompat>, ? super c<? super g2>, ? extends Object> pVar, OnBackInstance onBackInstance, c<? super OnBackInstance$job$1> cVar) {
        super(2, cVar);
        this.$callback = onBackPressedCallback;
        this.$onBack = pVar;
        this.this$0 = onBackInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new OnBackInstance$job$1(this.$callback, this.$onBack, this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((OnBackInstance$job$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.BooleanRef booleanRef;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            if (this.$callback.isEnabled()) {
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                p<i<BackEventCompat>, c<? super g2>, Object> pVar = this.$onBack;
                i<BackEventCompat> g12 = k.g1(k.Z(this.this$0.getChannel()), new AnonymousClass1(booleanRef2, null));
                this.L$0 = booleanRef2;
                this.label = 1;
                if (pVar.invoke(g12, this) == l11) {
                    return l11;
                }
                booleanRef = booleanRef2;
            }
            return g2.f100423a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        booleanRef = (Ref.BooleanRef) this.L$0;
        e.n(obj);
        if (!booleanRef.element) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return g2.f100423a;
    }
}
