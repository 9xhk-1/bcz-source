package io.ktor.serialization.kotlinx;

import f50.i;
import f50.p0;
import f50.w;
import ix.m;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import mx.c0;
import mx.v;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKotlinxSerializationConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinxSerializationConverter.kt\nio/ktor/serialization/kotlinx/KotlinxSerializationConverter\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,120:1\n49#2:121\n51#2:125\n49#2:126\n51#2:130\n46#3:122\n51#3:124\n46#3:127\n51#3:129\n105#4:123\n105#4:128\n*S KotlinDebug\n*F\n+ 1 KotlinxSerializationConverter.kt\nio/ktor/serialization/kotlinx/KotlinxSerializationConverter\n*L\n45#1:121\n45#1:125\n60#1:126\n60#1:130\n45#1:122\n45#1:124\n60#1:127\n60#1:129\n45#1:123\n60#1:128\n*E\n"})
/* loaded from: classes8.dex */
public final class KotlinxSerializationConverter implements io.ktor.serialization.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final w f61148a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<io.ktor.serialization.kotlinx.d> f61149b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {61, 65}, m = "deserialize", n = {"this", "charset", "typeInfo", "content", "this", "charset", "serializer"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61168a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61169b;

        /* renamed from: c, reason: collision with root package name */
        public Object f61170c;

        /* renamed from: d, reason: collision with root package name */
        public Object f61171d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f61172e;

        /* renamed from: g, reason: collision with root package name */
        public int f61174g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f61172e = obj;
            this.f61174g |= Integer.MIN_VALUE;
            return KotlinxSerializationConverter.this.b(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$fromExtension$2", f = "KotlinxSerializationConverter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<Object, j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61175a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61176b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f61177c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.ktor.utils.io.g gVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f61177c = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f61177c, cVar);
            bVar.f61176b = obj;
            return bVar;
        }

        @Override // x00.p
        public final Object invoke(Object obj, j00.c<? super Boolean> cVar) {
            return ((b) create(obj, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f61175a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return l00.a.a(this.f61176b != null || this.f61177c.f());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", i = {0, 0, 0, 0, 0}, l = {46}, m = "serialize", n = {"this", "contentType", "charset", "typeInfo", "value"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61178a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61179b;

        /* renamed from: c, reason: collision with root package name */
        public Object f61180c;

        /* renamed from: d, reason: collision with root package name */
        public Object f61181d;

        /* renamed from: e, reason: collision with root package name */
        public Object f61182e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f61183f;

        /* renamed from: h, reason: collision with root package name */
        public int f61185h;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f61183f = obj;
            this.f61185h |= Integer.MIN_VALUE;
            return KotlinxSerializationConverter.this.a(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$fromExtension$2", f = "KotlinxSerializationConverter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<v, j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61186a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61187b;

        public d(j00.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            d dVar = new d(cVar);
            dVar.f61187b = obj;
            return dVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v vVar, j00.c<? super Boolean> cVar) {
            return ((d) create(vVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f61186a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return l00.a.a(((v) this.f61187b) != null);
        }
    }

    public KotlinxSerializationConverter(@k w format) {
        g0.p(format, "format");
        this.f61148a = format;
        this.f61149b = io.ktor.serialization.kotlinx.b.a(format);
        if ((format instanceof f50.a) || (format instanceof p0)) {
            return;
        }
        throw new IllegalArgumentException(("Only binary and string formats are supported, " + format + " is not supported.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.ktor.serialization.c
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k ix.k r11, @m80.k java.nio.charset.Charset r12, @m80.k final gz.a r13, @m80.l final java.lang.Object r14, @m80.k j00.c<? super mx.v> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof io.ktor.serialization.kotlinx.KotlinxSerializationConverter.c
            if (r0 == 0) goto L13
            r0 = r15
            io.ktor.serialization.kotlinx.KotlinxSerializationConverter$c r0 = (io.ktor.serialization.kotlinx.KotlinxSerializationConverter.c) r0
            int r1 = r0.f61185h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61185h = r1
            goto L18
        L13:
            io.ktor.serialization.kotlinx.KotlinxSerializationConverter$c r0 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$c
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f61183f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61185h
            r3 = 1
            if (r2 == 0) goto L49
            if (r2 != r3) goto L41
            java.lang.Object r14 = r0.f61182e
            java.lang.Object r11 = r0.f61181d
            r13 = r11
            gz.a r13 = (gz.a) r13
            java.lang.Object r11 = r0.f61180c
            r12 = r11
            java.nio.charset.Charset r12 = (java.nio.charset.Charset) r12
            java.lang.Object r11 = r0.f61179b
            ix.k r11 = (ix.k) r11
            java.lang.Object r0 = r0.f61178a
            io.ktor.serialization.kotlinx.KotlinxSerializationConverter r0 = (io.ktor.serialization.kotlinx.KotlinxSerializationConverter) r0
            kotlin.e.n(r15)
            r6 = r11
            r7 = r12
            r5 = r14
            r2 = r0
            goto L79
        L41:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L49:
            kotlin.e.n(r15)
            java.util.List<io.ktor.serialization.kotlinx.d> r15 = r10.f61149b
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            kotlinx.coroutines.flow.i r5 = kotlinx.coroutines.flow.k.e(r15)
            io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1 r4 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r4.<init>()
            io.ktor.serialization.kotlinx.KotlinxSerializationConverter$d r11 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$d
            r12 = 0
            r11.<init>(r12)
            r0.f61178a = r10
            r0.f61179b = r6
            r0.f61180c = r7
            r0.f61181d = r8
            r0.f61182e = r9
            r0.f61185h = r3
            java.lang.Object r15 = kotlinx.coroutines.flow.k.z0(r4, r11, r0)
            if (r15 != r1) goto L76
            return r1
        L76:
            r2 = r10
            r13 = r8
            r5 = r9
        L79:
            mx.v r15 = (mx.v) r15
            if (r15 == 0) goto L7e
            return r15
        L7e:
            f50.w r11 = r2.f61148a     // Catch: kotlinx.serialization.SerializationException -> L8a
            o50.f r11 = r11.getSerializersModule()     // Catch: kotlinx.serialization.SerializationException -> L8a
            f50.i r11 = io.ktor.serialization.kotlinx.g.d(r11, r13)     // Catch: kotlinx.serialization.SerializationException -> L8a
        L88:
            r3 = r11
            goto L95
        L8a:
            f50.w r11 = r2.f61148a
            o50.f r11 = r11.getSerializersModule()
            f50.i r11 = io.ktor.serialization.kotlinx.g.b(r5, r11)
            goto L88
        L95:
            f50.w r4 = r2.f61148a
            mx.v$a r11 = r2.c(r3, r4, r5, r6, r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.KotlinxSerializationConverter.a(ix.k, java.nio.charset.Charset, gz.a, java.lang.Object, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00be A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:13:0x00b8, B:15:0x00be, B:18:0x00ce, B:20:0x00d2, B:22:0x00df, B:23:0x0100), top: B:12:0x00b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:13:0x00b8, B:15:0x00be, B:18:0x00ce, B:20:0x00d2, B:22:0x00df, B:23:0x0100), top: B:12:0x00b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // io.ktor.serialization.c
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k final java.nio.charset.Charset r9, @m80.k final gz.a r10, @m80.k final io.ktor.utils.io.g r11, @m80.k j00.c<java.lang.Object> r12) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.KotlinxSerializationConverter.b(java.nio.charset.Charset, gz.a, io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    public final v.a c(i<?> iVar, w wVar, Object obj, ix.k kVar, Charset charset) {
        if (wVar instanceof p0) {
            g0.n(iVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            return new c0(((p0) wVar).a(iVar, obj), m.c(kVar, charset), null, 4, null);
        }
        if (wVar instanceof f50.a) {
            g0.n(iVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            return new mx.c(((f50.a) wVar).b(iVar, obj), kVar, null, 4, null);
        }
        throw new IllegalStateException(("Unsupported format " + wVar).toString());
    }
}
