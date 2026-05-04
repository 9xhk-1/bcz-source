package com.baicizhan.client.business.util;

import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import rx.Emitter;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.client.business.util.RxFlowUtilsKt$asRxJava$1$1", f = "RxFlowUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes4.dex */
public final class RxFlowUtilsKt$asRxJava$1$1 extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ Emitter<T> $emitter;
    final /* synthetic */ kotlinx.coroutines.flow.i<T> $this_asRxJava;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.client.business.util.RxFlowUtilsKt$asRxJava$1$1$1", f = "RxFlowUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: com.baicizhan.client.business.util.RxFlowUtilsKt$asRxJava$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> extends SuspendLambda implements x00.p<T, j00.c<? super g2>, Object> {
        final /* synthetic */ Emitter<T> $emitter;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Emitter<T> emitter, j00.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$emitter = emitter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$emitter, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t11, j00.c<? super g2> cVar) {
            return ((AnonymousClass1) create(t11, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            this.$emitter.onNext(obj2);
            return g2.f100423a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, j00.c<? super g2> cVar) {
            return invoke2((AnonymousClass1<T>) obj, cVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.client.business.util.RxFlowUtilsKt$asRxJava$1$1$2", f = "RxFlowUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: com.baicizhan.client.business.util.RxFlowUtilsKt$asRxJava$1$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super T>, Throwable, j00.c<? super g2>, Object> {
        final /* synthetic */ Emitter<T> $emitter;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Emitter<T> emitter, j00.c<? super AnonymousClass2> cVar) {
            super(3, cVar);
            this.$emitter = emitter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.L$0;
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            this.$emitter.onError(th2);
            return g2.f100423a;
        }

        @Override // x00.q
        public final Object invoke(kotlinx.coroutines.flow.j<? super T> jVar, Throwable th2, j00.c<? super g2> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$emitter, cVar);
            anonymousClass2.L$0 = th2;
            return anonymousClass2.invokeSuspend(g2.f100423a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.client.business.util.RxFlowUtilsKt$asRxJava$1$1$3", f = "RxFlowUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: com.baicizhan.client.business.util.RxFlowUtilsKt$asRxJava$1$1$3, reason: invalid class name */
    public static final class AnonymousClass3<T> extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super T>, Throwable, j00.c<? super g2>, Object> {
        final /* synthetic */ Emitter<T> $emitter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Emitter<T> emitter, j00.c<? super AnonymousClass3> cVar) {
            super(3, cVar);
            this.$emitter = emitter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            this.$emitter.onCompleted();
            return g2.f100423a;
        }

        @Override // x00.q
        public final Object invoke(kotlinx.coroutines.flow.j<? super T> jVar, Throwable th2, j00.c<? super g2> cVar) {
            return new AnonymousClass3(this.$emitter, cVar).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RxFlowUtilsKt$asRxJava$1$1(kotlinx.coroutines.flow.i<? extends T> iVar, Emitter<T> emitter, j00.c<? super RxFlowUtilsKt$asRxJava$1$1> cVar) {
        super(2, cVar);
        this.$this_asRxJava = iVar;
        this.$emitter = emitter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        RxFlowUtilsKt$asRxJava$1$1 rxFlowUtilsKt$asRxJava$1$1 = new RxFlowUtilsKt$asRxJava$1$1(this.$this_asRxJava, this.$emitter, cVar);
        rxFlowUtilsKt$asRxJava$1$1.L$0 = obj;
        return rxFlowUtilsKt$asRxJava$1$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((RxFlowUtilsKt$asRxJava$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var = (r0) this.L$0;
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.e.n(obj);
        kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.g1(kotlinx.coroutines.flow.k.v(kotlinx.coroutines.flow.k.h1(this.$this_asRxJava, new AnonymousClass1(this.$emitter, null)), new AnonymousClass2(this.$emitter, null)), new AnonymousClass3(this.$emitter, null)), r0Var);
        return g2.f100423a;
    }
}
