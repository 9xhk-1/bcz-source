package androidx.lifecycle;

import c40.r0;
import e40.i0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", i = {0, 1, 2}, l = {107, 112, 113, 115}, m = "invokeSuspend", n = {"observer", "observer", "observer"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes2.dex */
public final class FlowLiveDataConversions$asFlow$1<T> extends SuspendLambda implements p<i0<? super T>, j00.c<? super g2>, Object> {
    final /* synthetic */ LiveData<T> $this_asFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
        final /* synthetic */ Observer<T> $observer;
        final /* synthetic */ LiveData<T> $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LiveData<T> liveData, Observer<T> observer, j00.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$this_asFlow = liveData;
            this.$observer = observer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
            return new AnonymousClass1(this.$this_asFlow, this.$observer, cVar);
        }

        @Override // x00.p
        @l
        public final Object invoke(@k r0 r0Var, @l j00.c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            this.$this_asFlow.observeForever(this.$observer);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
        final /* synthetic */ Observer<T> $observer;
        final /* synthetic */ LiveData<T> $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LiveData<T> liveData, Observer<T> observer, j00.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$this_asFlow = liveData;
            this.$observer = observer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
            return new AnonymousClass2(this.$this_asFlow, this.$observer, cVar);
        }

        @Override // x00.p
        @l
        public final Object invoke(@k r0 r0Var, @l j00.c<? super g2> cVar) {
            return ((AnonymousClass2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            this.$this_asFlow.observeForever(this.$observer);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
        final /* synthetic */ Observer<T> $observer;
        final /* synthetic */ LiveData<T> $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LiveData<T> liveData, Observer<T> observer, j00.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$this_asFlow = liveData;
            this.$observer = observer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
            return new AnonymousClass3(this.$this_asFlow, this.$observer, cVar);
        }

        @Override // x00.p
        @l
        public final Object invoke(@k r0 r0Var, @l j00.c<? super g2> cVar) {
            return ((AnonymousClass3) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            this.$this_asFlow.removeObserver(this.$observer);
            return g2.f100423a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asFlow$1(LiveData<T> liveData, j00.c<? super FlowLiveDataConversions$asFlow$1> cVar) {
        super(2, cVar);
        this.$this_asFlow = liveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.$this_asFlow, cVar);
        flowLiveDataConversions$asFlow$1.L$0 = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    @Override // x00.p
    @l
    public final Object invoke(@k i0<? super T> i0Var, @l j00.c<? super g2> cVar) {
        return ((FlowLiveDataConversions$asFlow$1) create(i0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        if (c40.i.h(r10, r7, r9) == r0) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.Observer] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@m80.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r9.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L40
            if (r1 == r5) goto L38
            if (r1 == r4) goto L30
            if (r1 == r3) goto L26
            if (r1 == r2) goto L1d
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            java.lang.Object r0 = r9.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.e.n(r10)
            goto Lb2
        L26:
            java.lang.Object r1 = r9.L$0
            androidx.lifecycle.Observer r1 = (androidx.lifecycle.Observer) r1
            kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L2e
            goto L8b
        L2e:
            r10 = move-exception
            goto L91
        L30:
            java.lang.Object r1 = r9.L$0
            androidx.lifecycle.Observer r1 = (androidx.lifecycle.Observer) r1
            kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L2e
            goto L80
        L38:
            java.lang.Object r1 = r9.L$0
            androidx.lifecycle.Observer r1 = (androidx.lifecycle.Observer) r1
            kotlin.e.n(r10)
            goto L66
        L40:
            kotlin.e.n(r10)
            java.lang.Object r10 = r9.L$0
            e40.i0 r10 = (e40.i0) r10
            androidx.lifecycle.d r1 = new androidx.lifecycle.d
            r1.<init>()
            c40.v2 r10 = c40.h1.e()
            c40.v2 r10 = r10.q()
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1 r7 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1
            androidx.lifecycle.LiveData<T> r8 = r9.$this_asFlow
            r7.<init>(r8, r1, r6)
            r9.L$0 = r1
            r9.label = r5
            java.lang.Object r10 = c40.i.h(r10, r7, r9)
            if (r10 != r0) goto L66
            goto Lb0
        L66:
            c40.v2 r10 = c40.h1.e()     // Catch: java.lang.Throwable -> L2e
            c40.v2 r10 = r10.q()     // Catch: java.lang.Throwable -> L2e
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2 r5 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2     // Catch: java.lang.Throwable -> L2e
            androidx.lifecycle.LiveData<T> r7 = r9.$this_asFlow     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r7, r1, r6)     // Catch: java.lang.Throwable -> L2e
            r9.L$0 = r1     // Catch: java.lang.Throwable -> L2e
            r9.label = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = c40.i.h(r10, r5, r9)     // Catch: java.lang.Throwable -> L2e
            if (r10 != r0) goto L80
            goto Lb0
        L80:
            r9.L$0 = r1     // Catch: java.lang.Throwable -> L2e
            r9.label = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = c40.a1.a(r9)     // Catch: java.lang.Throwable -> L2e
            if (r10 != r0) goto L8b
            goto Lb0
        L8b:
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L2e
            r10.<init>()     // Catch: java.lang.Throwable -> L2e
            throw r10     // Catch: java.lang.Throwable -> L2e
        L91:
            c40.v2 r3 = c40.h1.e()
            c40.v2 r3 = r3.q()
            c40.x2 r4 = c40.x2.f8011a
            kotlin.coroutines.d r3 = r3.plus(r4)
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3 r4 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3
            androidx.lifecycle.LiveData<T> r5 = r9.$this_asFlow
            r4.<init>(r5, r1, r6)
            r9.L$0 = r10
            r9.label = r2
            java.lang.Object r1 = c40.i.h(r3, r4, r9)
            if (r1 != r0) goto Lb1
        Lb0:
            return r0
        Lb1:
            r0 = r10
        Lb2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FlowLiveDataConversions$asFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
