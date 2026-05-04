package io.ktor.serialization.kotlinx.json;

import c40.h1;
import c40.i;
import c40.r0;
import k50.p0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m80.k;
import m80.l;
import q30.m;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt$deserializeSequence$2", f = "JsonExtensionsJvm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super m<? extends Object>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61228a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f61229b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ gz.a f61230c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k50.a f61231d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.ktor.utils.io.g gVar, gz.a aVar, k50.a aVar2, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f61229b = gVar;
            this.f61230c = aVar;
            this.f61231d = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f61229b, this.f61230c, this.f61231d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super m<? extends Object>> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f61228a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return p0.e(this.f61231d, mz.a.b(this.f61229b, null, 1, null), io.ktor.serialization.kotlinx.g.d(this.f61231d.getSerializersModule(), g.a(this.f61230c)), null, 4, null);
        }
    }

    @l
    public static final Object a(@k k50.a aVar, @k io.ktor.utils.io.g gVar, @k gz.a aVar2, @k j00.c<? super m<? extends Object>> cVar) {
        return i.h(h1.c(), new a(gVar, aVar2, aVar, null), cVar);
    }
}
