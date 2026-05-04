package com.google.accompanist.pager;

import androidx.compose.runtime.SnapshotStateKt;
import c40.r0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.google.accompanist.pager.Pager$Pager$4$1", f = "Pager.kt", i = {}, l = {415}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class Pager$Pager$4$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f30300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f30301b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f30302a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar) {
            super(0);
            this.f30302a = fVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @k
        public final Boolean invoke() {
            return Boolean.valueOf(this.f30302a.isScrollInProgress());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements j<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f30303a;

        public b(f fVar) {
            this.f30303a = fVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @l
        public Object emit(Boolean bool, @k j00.c<? super g2> cVar) {
            bool.getClass();
            this.f30303a.s();
            return g2.f100423a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pager$Pager$4$1(f fVar, j00.c<? super Pager$Pager$4$1> cVar) {
        super(2, cVar);
        this.f30301b = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
        return new Pager$Pager$4$1(this.f30301b, cVar);
    }

    @Override // x00.p
    @l
    public final Object invoke(@k r0 r0Var, @l j00.c<? super g2> cVar) {
        return ((Pager$Pager$4$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.f30300a;
        if (i11 == 0) {
            kotlin.e.n(obj);
            final i snapshotFlow = SnapshotStateKt.snapshotFlow(new a(this.f30301b));
            i l02 = kotlinx.coroutines.flow.k.l0(new i<Boolean>() { // from class: com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                /* renamed from: com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2 implements j<Boolean> {

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ j f30295a;

                    @l00.d(c = "com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1$2", f = "Pager.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                    /* renamed from: com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(j00.c cVar) {
                            super(cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @l
                        public final Object invokeSuspend(@k Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(j jVar) {
                        this.f30295a = jVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // kotlinx.coroutines.flow.j
                    @m80.l
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public java.lang.Object emit(java.lang.Boolean r5, @m80.k j00.c r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.e.n(r6)
                            goto L48
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            kotlin.e.n(r6)
                            kotlinx.coroutines.flow.j r6 = r4.f30295a
                            r2 = r5
                            java.lang.Boolean r2 = (java.lang.Boolean) r2
                            boolean r2 = r2.booleanValue()
                            if (r2 != 0) goto L48
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L48
                            return r1
                        L48:
                            yz.g2 r5 = yz.g2.f100423a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.i
                @l
                public Object collect(@k j<? super Boolean> jVar, @k j00.c cVar) {
                    Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                    return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
                }
            }, 1);
            b bVar = new b(this.f30301b);
            this.f30300a = 1;
            if (l02.collect(bVar, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        return g2.f100423a;
    }
}
