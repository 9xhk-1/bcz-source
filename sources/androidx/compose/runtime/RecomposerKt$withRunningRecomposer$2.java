package androidx.compose.runtime;

import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import x00.q;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", f = "Recomposer.kt", i = {0}, l = {93, 95}, m = "invokeSuspend", n = {"recomposer"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class RecomposerKt$withRunningRecomposer$2<R> extends SuspendLambda implements p<r0, c<? super R>, Object> {
    final /* synthetic */ q<r0, Recomposer, c<? super R>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", f = "Recomposer.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
        final /* synthetic */ Recomposer $recomposer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Recomposer recomposer, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$recomposer = recomposer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$recomposer, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                Recomposer recomposer = this.$recomposer;
                this.label = 1;
                if (recomposer.runRecomposeAndApplyChanges(this) == l11) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecomposerKt$withRunningRecomposer$2(q<? super r0, ? super Recomposer, ? super c<? super R>, ? extends Object> qVar, c<? super RecomposerKt$withRunningRecomposer$2> cVar) {
        super(2, cVar);
        this.$block = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        RecomposerKt$withRunningRecomposer$2 recomposerKt$withRunningRecomposer$2 = new RecomposerKt$withRunningRecomposer$2(this.$block, cVar);
        recomposerKt$withRunningRecomposer$2.L$0 = obj;
        return recomposerKt$withRunningRecomposer$2;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super R> cVar) {
        return ((RecomposerKt$withRunningRecomposer$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r11 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r0 = r10.L$0
            kotlin.e.n(r11)
            return r0
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            java.lang.Object r1 = r10.L$0
            androidx.compose.runtime.Recomposer r1 = (androidx.compose.runtime.Recomposer) r1
            kotlin.e.n(r11)
            goto L4f
        L24:
            kotlin.e.n(r11)
            java.lang.Object r11 = r10.L$0
            r4 = r11
            c40.r0 r4 = (c40.r0) r4
            androidx.compose.runtime.Recomposer r1 = new androidx.compose.runtime.Recomposer
            kotlin.coroutines.d r11 = r4.getCoroutineContext()
            r1.<init>(r11)
            androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1 r7 = new androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1
            r11 = 0
            r7.<init>(r1, r11)
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            c40.i.e(r4, r5, r6, r7, r8, r9)
            x00.q<c40.r0, androidx.compose.runtime.Recomposer, j00.c<? super R>, java.lang.Object> r11 = r10.$block
            r10.L$0 = r1
            r10.label = r3
            java.lang.Object r11 = r11.invoke(r4, r1, r10)
            if (r11 != r0) goto L4f
            goto L5c
        L4f:
            r1.close()
            r10.L$0 = r11
            r10.label = r2
            java.lang.Object r1 = r1.join(r10)
            if (r1 != r0) goto L5d
        L5c:
            return r0
        L5d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
