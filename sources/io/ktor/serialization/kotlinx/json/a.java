package io.ktor.serialization.kotlinx.json;

import f50.i;
import io.ktor.utils.io.m;
import java.nio.charset.Charset;
import jz.j;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlinx.serialization.SerializationException;
import m80.k;
import m80.l;
import mx.v;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a implements io.ktor.serialization.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final k50.a f61216a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter", f = "ExperimentalJsonConverter.kt", i = {0, 0}, l = {51}, m = "deserialize", n = {"this", "serializer"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.serialization.kotlinx.json.a$a, reason: collision with other inner class name */
    public static final class C0707a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61217a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61218b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f61219c;

        /* renamed from: e, reason: collision with root package name */
        public int f61221e;

        public C0707a(j00.c<? super C0707a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f61219c = obj;
            this.f61221e |= Integer.MIN_VALUE;
            return a.this.b(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter$serialize$2", f = "ExperimentalJsonConverter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<m, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61222a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61223b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y40.b f61224c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y40.b bVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f61224c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f61224c, cVar);
            bVar.f61223b = obj;
            return bVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m mVar, j00.c<? super g2> cVar) {
            return ((b) create(mVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f61222a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            ((m) this.f61223b).i().T(this.f61224c);
            return g2.f100423a;
        }
    }

    public a(@k k50.a format) {
        g0.p(format, "format");
        this.f61216a = format;
    }

    @Override // io.ktor.serialization.c
    @l
    public Object a(@k ix.k kVar, @k Charset charset, @k gz.a aVar, @l Object obj, @k j00.c<? super v> cVar) {
        i<?> b11;
        try {
            b11 = io.ktor.serialization.kotlinx.g.d(this.f61216a.getSerializersModule(), aVar);
        } catch (SerializationException unused) {
            b11 = io.ktor.serialization.kotlinx.g.b(obj, this.f61216a.getSerializersModule());
        }
        y40.b bVar = new y40.b();
        k50.a aVar2 = this.f61216a;
        g0.n(b11, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
        m50.a.g(aVar2, b11, obj, bVar);
        return new mx.f(new b(bVar, null), kVar, null, l00.a.g(j.j(bVar)), 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.ktor.serialization.c
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k java.nio.charset.Charset r4, @m80.k gz.a r5, @m80.k io.ktor.utils.io.g r6, @m80.k j00.c<java.lang.Object> r7) {
        /*
            r3 = this;
            boolean r4 = r7 instanceof io.ktor.serialization.kotlinx.json.a.C0707a
            if (r4 == 0) goto L13
            r4 = r7
            io.ktor.serialization.kotlinx.json.a$a r4 = (io.ktor.serialization.kotlinx.json.a.C0707a) r4
            int r0 = r4.f61221e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f61221e = r0
            goto L18
        L13:
            io.ktor.serialization.kotlinx.json.a$a r4 = new io.ktor.serialization.kotlinx.json.a$a
            r4.<init>(r7)
        L18:
            java.lang.Object r7 = r4.f61219c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f61221e
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r5 = r4.f61218b
            f50.i r5 = (f50.i) r5
            java.lang.Object r4 = r4.f61217a
            io.ktor.serialization.kotlinx.json.a r4 = (io.ktor.serialization.kotlinx.json.a) r4
            kotlin.e.n(r7)
            goto L54
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.e.n(r7)
            k50.a r7 = r3.f61216a
            o50.f r7 = r7.getSerializersModule()
            f50.i r5 = io.ktor.serialization.kotlinx.g.d(r7, r5)
            r4.f61217a = r3
            r4.f61218b = r5
            r4.f61221e = r2
            java.lang.Object r7 = io.ktor.utils.io.j.G(r6, r4)
            if (r7 != r0) goto L53
            return r0
        L53:
            r4 = r3
        L54:
            y40.c0 r7 = (y40.c0) r7
            k50.a r4 = r4.f61216a     // Catch: java.lang.Throwable -> L5f
            f50.e r5 = (f50.e) r5     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r4 = m50.a.a(r4, r5, r7)     // Catch: java.lang.Throwable -> L5f
            return r4
        L5f:
            r4 = move-exception
            io.ktor.serialization.JsonConvertException r5 = new io.ktor.serialization.JsonConvertException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Illegal input: "
            r6.append(r7)
            java.lang.String r7 = r4.getMessage()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.json.a.b(java.nio.charset.Charset, gz.a, io.ktor.utils.io.g, j00.c):java.lang.Object");
    }
}
