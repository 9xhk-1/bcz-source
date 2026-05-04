package io.ktor.serialization.kotlinx.json;

import f50.i;
import io.ktor.utils.io.m;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import mx.v;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKotlinxSerializationJsonExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinxSerializationJsonExtensions.kt\nio/ktor/serialization/kotlinx/json/KotlinxSerializationJsonExtensions\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt\n*L\n1#1,110:1\n381#2,7:111\n56#3,4:118\n*S KotlinDebug\n*F\n+ 1 KotlinxSerializationJsonExtensions.kt\nio/ktor/serialization/kotlinx/json/KotlinxSerializationJsonExtensions\n*L\n76#1:111,7\n79#1:118,4\n*E\n"})
/* loaded from: classes8.dex */
public final class KotlinxSerializationJsonExtensions implements io.ktor.serialization.kotlinx.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final k50.a f61190a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<Charset, io.ktor.serialization.kotlinx.json.b> f61191b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions", f = "KotlinxSerializationJsonExtensions.kt", i = {}, l = {64}, m = "deserialize", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f61198a;

        /* renamed from: c, reason: collision with root package name */
        public int f61200c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f61198a = obj;
            this.f61200c |= Integer.MIN_VALUE;
            return KotlinxSerializationJsonExtensions.this.b(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$2", f = "KotlinxSerializationJsonExtensions.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<m, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61201a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61202b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f61204d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i<?> f61205e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Charset f61206f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, i<?> iVar, Charset charset, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f61204d = obj;
            this.f61205e = iVar;
            this.f61206f = charset;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = KotlinxSerializationJsonExtensions.this.new b(this.f61204d, this.f61205e, this.f61206f, cVar);
            bVar.f61202b = obj;
            return bVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m mVar, j00.c<? super g2> cVar) {
            return ((b) create(mVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f61201a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                m mVar = (m) this.f61202b;
                KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions = KotlinxSerializationJsonExtensions.this;
                Object obj2 = this.f61204d;
                g0.n(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<*>");
                i<?> iVar = this.f61205e;
                g0.n(iVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
                Charset charset = this.f61206f;
                this.f61201a = 1;
                if (kotlinxSerializationJsonExtensions.e((kotlinx.coroutines.flow.i) obj2, iVar, charset, mVar, this) == l11) {
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions", f = "KotlinxSerializationJsonExtensions.kt", i = {0, 0, 0, 0, 0, 0, 1, 1}, l = {78, 118, 87}, m = "serialize", n = {"this", "$this$serialize", "serializer", "charset", "channel", "jsonArraySymbols", "channel", "jsonArraySymbols"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1"})
    public static final class c<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61207a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61208b;

        /* renamed from: c, reason: collision with root package name */
        public Object f61209c;

        /* renamed from: d, reason: collision with root package name */
        public Object f61210d;

        /* renamed from: e, reason: collision with root package name */
        public Object f61211e;

        /* renamed from: f, reason: collision with root package name */
        public Object f61212f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f61213g;

        /* renamed from: i, reason: collision with root package name */
        public int f61215i;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f61213g = obj;
            this.f61215i |= Integer.MIN_VALUE;
            return KotlinxSerializationJsonExtensions.this.e(null, null, null, null, this);
        }
    }

    public KotlinxSerializationJsonExtensions(@k k50.a format) {
        g0.p(format, "format");
        this.f61190a = format;
        this.f61191b = new LinkedHashMap();
    }

    @Override // io.ktor.serialization.kotlinx.d
    @l
    public Object a(@k ix.k kVar, @k Charset charset, @k gz.a aVar, @l Object obj, @k j00.c<? super v> cVar) {
        if (!g0.g(charset, u30.d.f91599b) || !g0.g(aVar.b(), o0.d(kotlinx.coroutines.flow.i.class))) {
            return null;
        }
        return new mx.f(new b(obj, io.ktor.serialization.kotlinx.g.d(this.f61190a.getSerializersModule(), g.a(aVar)), charset, null), ix.m.c(kVar, charset), null, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // io.ktor.serialization.kotlinx.d
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k java.nio.charset.Charset r5, @m80.k gz.a r6, @m80.k io.ktor.utils.io.g r7, @m80.k j00.c<java.lang.Object> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.a
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$a r0 = (io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.a) r0
            int r1 = r0.f61200c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61200c = r1
            goto L18
        L13:
            io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$a r0 = new io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f61198a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61200c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.e.n(r8)     // Catch: java.lang.Throwable -> L29
            return r8
        L29:
            r5 = move-exception
            goto L5b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.e.n(r8)
            java.nio.charset.Charset r8 = u30.d.f91599b
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r8)
            if (r5 == 0) goto L76
            h10.d r5 = r6.b()
            java.lang.Class<q30.m> r8 = q30.m.class
            h10.d r8 = kotlin.jvm.internal.o0.d(r8)
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r8)
            if (r5 != 0) goto L4f
            goto L76
        L4f:
            k50.a r5 = r4.f61190a     // Catch: java.lang.Throwable -> L29
            r0.f61200c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = io.ktor.serialization.kotlinx.json.c.a(r5, r7, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r5 != r1) goto L5a
            return r1
        L5a:
            return r5
        L5b:
            io.ktor.serialization.JsonConvertException r6 = new io.ktor.serialization.JsonConvertException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Illegal input: "
            r7.append(r8)
            java.lang.String r8 = r5.getMessage()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7, r5)
            throw r6
        L76:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.b(java.nio.charset.Charset, gz.a, io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00eb, code lost:
    
        if (io.ktor.utils.io.q.s(r4, r5, 0, 0, r8, 6, null) == r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d6, code lost:
    
        if (r14.collect(r15, r8) != r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object e(kotlinx.coroutines.flow.i<? extends T> r22, f50.i<T> r23, java.nio.charset.Charset r24, io.ktor.utils.io.m r25, j00.c<? super yz.g2> r26) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.e(kotlinx.coroutines.flow.i, f50.i, java.nio.charset.Charset, io.ktor.utils.io.m, j00.c):java.lang.Object");
    }
}
