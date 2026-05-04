package androidx.compose.animation.core;

import androidx.compose.runtime.State;
import c40.r0;
import e40.o;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", i = {0}, l = {418}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class AnimateAsStateKt$animateValueAsState$3$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
    final /* synthetic */ Animatable<T, V> $animatable;
    final /* synthetic */ o<T> $channel;
    final /* synthetic */ State<l<T, g2>> $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
        final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
        final /* synthetic */ Animatable<T, V> $animatable;
        final /* synthetic */ State<l<T, g2>> $listener$delegate;
        final /* synthetic */ T $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(T t11, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends l<? super T, g2>> state2, j00.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$newTarget = t11;
            this.$animatable = animatable;
            this.$animSpec$delegate = state;
            this.$listener$delegate = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new AnonymousClass1(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnimationSpec animateValueAsState$lambda$6;
            AnonymousClass1 anonymousClass1;
            l animateValueAsState$lambda$4;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.label;
            if (i11 == 0) {
                kotlin.e.n(obj);
                if (g0.g(this.$newTarget, this.$animatable.getTargetValue())) {
                    return g2.f100423a;
                }
                Animatable<T, V> animatable = this.$animatable;
                T t11 = this.$newTarget;
                animateValueAsState$lambda$6 = AnimateAsStateKt.animateValueAsState$lambda$6(this.$animSpec$delegate);
                this.label = 1;
                anonymousClass1 = this;
                if (Animatable.animateTo$default(animatable, t11, animateValueAsState$lambda$6, null, null, anonymousClass1, 12, null) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                anonymousClass1 = this;
            }
            animateValueAsState$lambda$4 = AnimateAsStateKt.animateValueAsState$lambda$4(anonymousClass1.$listener$delegate);
            if (animateValueAsState$lambda$4 != null) {
                animateValueAsState$lambda$4.invoke(anonymousClass1.$animatable.getValue());
            }
            return g2.f100423a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimateAsStateKt$animateValueAsState$3$1(o<T> oVar, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends l<? super T, g2>> state2, j00.c<? super AnimateAsStateKt$animateValueAsState$3$1> cVar) {
        super(2, cVar);
        this.$channel = oVar;
        this.$animatable = animatable;
        this.$animSpec$delegate = state;
        this.$listener$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, cVar);
        animateAsStateKt$animateValueAsState$3$1.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((AnimateAsStateKt$animateValueAsState$3$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0037 -> B:5:0x003a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r11.label
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r11.L$1
            e40.q r1 = (e40.q) r1
            java.lang.Object r3 = r11.L$0
            c40.r0 r3 = (c40.r0) r3
            kotlin.e.n(r12)
            goto L3a
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            kotlin.e.n(r12)
            java.lang.Object r12 = r11.L$0
            c40.r0 r12 = (c40.r0) r12
            e40.o<T> r1 = r11.$channel
            e40.q r1 = r1.iterator()
            r3 = r12
        L2d:
            r11.L$0 = r3
            r11.L$1 = r1
            r11.label = r2
            java.lang.Object r12 = r1.a(r11)
            if (r12 != r0) goto L3a
            return r0
        L3a:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L6a
            java.lang.Object r12 = r1.next()
            e40.o<T> r4 = r11.$channel
            java.lang.Object r4 = r4.O()
            java.lang.Object r4 = e40.s.h(r4)
            if (r4 != 0) goto L54
            r6 = r12
            goto L55
        L54:
            r6 = r4
        L55:
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1 r5 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1
            androidx.compose.animation.core.Animatable<T, V> r7 = r11.$animatable
            androidx.compose.runtime.State<androidx.compose.animation.core.AnimationSpec<T>> r8 = r11.$animSpec$delegate
            androidx.compose.runtime.State<x00.l<T, yz.g2>> r9 = r11.$listener$delegate
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r7 = 3
            r8 = 0
            r4 = 0
            r6 = r5
            r5 = 0
            c40.i.e(r3, r4, r5, r6, r7, r8)
            goto L2d
        L6a:
            yz.g2 r12 = yz.g2.f100423a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
