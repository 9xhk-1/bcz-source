package io.ktor.serialization.kotlinx.json;

import f50.i;
import io.ktor.utils.io.m;
import java.nio.charset.Charset;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.j;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n+ 2 FlowExceptions.common.kt\nkotlinx/coroutines/flow/internal/FlowExceptions_commonKt\n+ 3 KotlinxSerializationJsonExtensions.kt\nio/ktor/serialization/kotlinx/json/KotlinxSerializationJsonExtensions\n*L\n1#1,114:1\n29#2,4:115\n80#3,7:119\n*S KotlinDebug\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n*L\n58#1:115,4\n*E\n"})
/* loaded from: classes8.dex */
public final class KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1<T> implements j<T> {

    /* renamed from: a, reason: collision with root package name */
    public int f61192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f61193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f61194c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ KotlinxSerializationJsonExtensions f61195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f61196e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Charset f61197f;

    @l00.d(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1", f = "KotlinxSerializationJsonExtensions.kt", i = {0, 0, 1}, l = {120, 123, 124}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
    /* renamed from: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(j00.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.this.emit(null, this);
        }
    }

    public KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1(m mVar, b bVar, KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions, i iVar, Charset charset) {
        this.f61193b = mVar;
        this.f61194c = bVar;
        this.f61195d = kotlinxSerializationJsonExtensions;
        this.f61196e = iVar;
        this.f61197f = charset;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        if (r12.g(r5) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        if (io.ktor.utils.io.q.s(r1, r2, 0, 0, r5, 6, null) == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // kotlinx.coroutines.flow.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(T r12, j00.c<? super yz.g2> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r13
            io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1$1 r0 = (io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1$1 r0 = new io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1$1
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r5.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r5.label
            r8 = 0
            r9 = 3
            r10 = 2
            r2 = 1
            if (r1 == 0) goto L4d
            if (r1 == r2) goto L43
            if (r1 == r10) goto L3b
            if (r1 != r9) goto L33
            kotlin.e.n(r13)
            goto Lae
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3b:
            java.lang.Object r12 = r5.L$0
            io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1 r12 = (io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1) r12
            kotlin.e.n(r13)
            goto La1
        L43:
            java.lang.Object r12 = r5.L$1
            java.lang.Object r1 = r5.L$0
            io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1 r1 = (io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1) r1
            kotlin.e.n(r13)
            goto L75
        L4d:
            kotlin.e.n(r13)
            int r13 = r11.f61192a
            int r1 = r13 + 1
            r11.f61192a = r1
            if (r13 < 0) goto Lb1
            if (r13 <= 0) goto L78
            io.ktor.utils.io.m r1 = r11.f61193b
            io.ktor.serialization.kotlinx.json.b r13 = r11.f61194c
            byte[] r13 = r13.c()
            r5.L$0 = r11
            r5.L$1 = r12
            r5.label = r2
            r3 = 0
            r4 = 0
            r6 = 6
            r7 = 0
            r2 = r13
            java.lang.Object r13 = io.ktor.utils.io.q.s(r1, r2, r3, r4, r5, r6, r7)
            if (r13 != r0) goto L74
            goto Lad
        L74:
            r1 = r11
        L75:
            r13 = r12
            r12 = r1
            goto L7a
        L78:
            r13 = r12
            r12 = r11
        L7a:
            io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions r1 = r12.f61195d
            k50.a r1 = io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.c(r1)
            f50.i r2 = r12.f61196e
            f50.b0 r2 = (f50.b0) r2
            java.lang.String r13 = r1.a(r2, r13)
            io.ktor.utils.io.m r1 = r12.f61193b
            java.nio.charset.Charset r2 = r12.f61197f
            byte[] r2 = jz.s.l(r13, r2)
            r5.L$0 = r12
            r5.L$1 = r8
            r5.label = r10
            r3 = 0
            r4 = 0
            r6 = 6
            r7 = 0
            java.lang.Object r13 = io.ktor.utils.io.q.s(r1, r2, r3, r4, r5, r6, r7)
            if (r13 != r0) goto La1
            goto Lad
        La1:
            io.ktor.utils.io.m r12 = r12.f61193b
            r5.L$0 = r8
            r5.label = r9
            java.lang.Object r12 = r12.g(r5)
            if (r12 != r0) goto Lae
        Lad:
            return r0
        Lae:
            yz.g2 r12 = yz.g2.f100423a
            return r12
        Lb1:
            java.lang.ArithmeticException r12 = new java.lang.ArithmeticException
            java.lang.String r13 = "Index overflow has happened"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.emit(java.lang.Object, j00.c):java.lang.Object");
    }
}
