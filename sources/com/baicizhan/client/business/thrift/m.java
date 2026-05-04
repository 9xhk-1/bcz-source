package com.baicizhan.client.business.thrift;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import org.apache.thrift.TServiceClient;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final m f16659a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static final int f16660b = 0;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.client.business.thrift.ThriftFlow$createClient$1", f = "ThriftFlow.kt", i = {0}, l = {14}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"}, v = 1)
    public static final class a<T> extends SuspendLambda implements x00.p<kotlinx.coroutines.flow.j<? super T>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16661a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16662b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l<T> f16663c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l<T> lVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f16663c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f16663c, cVar);
            aVar.f16662b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f16662b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f16661a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                T a11 = this.f16663c.a();
                this.f16662b = l00.k.a(jVar);
                this.f16661a = 1;
                if (jVar.emit(a11, this) == l11) {
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

        @Override // x00.p
        public final Object invoke(kotlinx.coroutines.flow.j<? super T> jVar, j00.c<? super g2> cVar) {
            return ((a) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    @m80.k
    public final <T extends TServiceClient> kotlinx.coroutines.flow.i<T> a(@m80.k l<T> builder) {
        g0.p(builder, "builder");
        return kotlinx.coroutines.flow.k.K0(new a(builder, null));
    }

    @m80.k
    public final <T extends TServiceClient> kotlinx.coroutines.flow.i<T> b(@m80.k String domain) {
        g0.p(domain, "domain");
        return a(new l<>(domain));
    }
}
