package io.ktor.serialization;

import androidx.media3.extractor.text.ttml.TtmlNode;
import io.ktor.utils.io.g;
import ix.m0;
import ix.q0;
import ix.x0;
import ix.y0;
import java.nio.charset.Charset;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nContentConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentConverter.kt\nio/ktor/serialization/ContentConverterKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,106:1\n49#2:107\n51#2:111\n46#3:108\n51#3:110\n105#4:109\n*S KotlinDebug\n*F\n+ 1 ContentConverter.kt\nio/ktor/serialization/ContentConverterKt\n*L\n96#1:107\n96#1:111\n96#1:108\n96#1:110\n96#1:109\n*E\n"})
/* loaded from: classes8.dex */
public final class ContentConverterKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.serialization.ContentConverterKt", f = "ContentConverter.kt", i = {0, 0}, l = {97}, m = "deserialize", n = {TtmlNode.TAG_BODY, "typeInfo"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61141a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61142b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f61143c;

        /* renamed from: d, reason: collision with root package name */
        public int f61144d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f61143c = obj;
            this.f61144d |= Integer.MIN_VALUE;
            return ContentConverterKt.a(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.serialization.ContentConverterKt$deserialize$result$2", f = "ContentConverter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<Object, j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61145a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61146b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f61147c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f61147c = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f61147c, cVar);
            bVar.f61146b = obj;
            return bVar;
        }

        @Override // x00.p
        public final Object invoke(Object obj, j00.c<? super Boolean> cVar) {
            return ((b) create(obj, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f61145a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return l00.a.a(this.f61146b != null || this.f61147c.f());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    @io.ktor.utils.io.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k java.util.List<? extends io.ktor.serialization.c> r5, @m80.k final io.ktor.utils.io.g r6, @m80.k final gz.a r7, @m80.k final java.nio.charset.Charset r8, @m80.k j00.c<java.lang.Object> r9) {
        /*
            boolean r0 = r9 instanceof io.ktor.serialization.ContentConverterKt.a
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.serialization.ContentConverterKt$a r0 = (io.ktor.serialization.ContentConverterKt.a) r0
            int r1 = r0.f61144d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61144d = r1
            goto L18
        L13:
            io.ktor.serialization.ContentConverterKt$a r0 = new io.ktor.serialization.ContentConverterKt$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f61143c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61144d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r5 = r0.f61142b
            r7 = r5
            gz.a r7 = (gz.a) r7
            java.lang.Object r5 = r0.f61141a
            r6 = r5
            io.ktor.utils.io.g r6 = (io.ktor.utils.io.g) r6
            kotlin.e.n(r9)
            goto L5c
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            kotlin.e.n(r9)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            kotlinx.coroutines.flow.i r5 = kotlinx.coroutines.flow.k.e(r5)
            io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1 r9 = new io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1
            r9.<init>()
            io.ktor.serialization.ContentConverterKt$b r5 = new io.ktor.serialization.ContentConverterKt$b
            r5.<init>(r6, r3)
            r0.f61141a = r6
            r0.f61142b = r7
            r0.f61144d = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.k.z0(r9, r5, r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            if (r9 != 0) goto L8c
            boolean r5 = r6.f()
            if (r5 != 0) goto L65
            return r6
        L65:
            h10.r r5 = r7.a()
            if (r5 == 0) goto L74
            boolean r5 = r5.e()
            if (r5 != r4) goto L74
            mx.u r5 = mx.u.f73831a
            return r5
        L74:
            io.ktor.serialization.ContentConvertException r5 = new io.ktor.serialization.ContentConvertException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "No suitable converter found for "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 2
            r5.<init>(r6, r3, r7, r3)
            throw r5
        L8c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.ContentConverterKt.a(java.util.List, io.ktor.utils.io.g, gz.a, java.nio.charset.Charset, j00.c):java.lang.Object");
    }

    @k
    public static final Charset b(@k q0 q0Var, @k Charset defaultCharset) {
        g0.p(q0Var, "<this>");
        g0.p(defaultCharset, "defaultCharset");
        Charset d11 = d(q0Var, defaultCharset);
        return d11 == null ? defaultCharset : d11;
    }

    public static /* synthetic */ Charset c(q0 q0Var, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        return b(q0Var, charset);
    }

    @l
    public static final Charset d(@k q0 q0Var, @k Charset defaultCharset) {
        g0.p(q0Var, "<this>");
        g0.p(defaultCharset, "defaultCharset");
        Iterator<m0> it = x0.e(q0Var.get(y0.f63006a.e())).iterator();
        while (it.hasNext()) {
            String a11 = it.next().a();
            if (g0.g(a11, "*")) {
                return defaultCharset;
            }
            u30.d dVar = u30.d.f91598a;
            if (iz.a.m(dVar, a11)) {
                return iz.a.i(dVar, a11);
            }
        }
        return null;
    }

    public static /* synthetic */ Charset e(q0 q0Var, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        return d(q0Var, charset);
    }
}
