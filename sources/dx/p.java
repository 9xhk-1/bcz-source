package dx;

import ix.p0;
import ix.q0;
import ix.r0;
import ix.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import mx.b0;
import y40.c0;
import y40.x;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nformDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 formDsl.kt\nio/ktor/client/request/forms/FormDslKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,235:1\n193#1,2:241\n13409#2,2:236\n37#3,2:238\n1#4:240\n*S KotlinDebug\n*F\n+ 1 formDsl.kt\nio/ktor/client/request/forms/FormDslKt\n*L\n233#1:241,2\n32#1:236,2\n77#1:238,2\n*E\n"})
/* loaded from: classes8.dex */
public final class p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nformDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 formDsl.kt\nio/ktor/client/request/forms/FormDslKt$append$1\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,235:1\n15#2,3:236\n*S KotlinDebug\n*F\n+ 1 formDsl.kt\nio/ktor/client/request/forms/FormDslKt$append$1\n*L\n193#1:236,3\n*E\n"})
    public static final class a implements x00.a<c0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l<x, g2> f48219a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.l<? super x, g2> lVar) {
            this.f48219a = lVar;
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c0 invoke() {
            x00.l<x, g2> lVar = this.f48219a;
            y40.b bVar = new y40.b();
            lVar.invoke(bVar);
            return bVar;
        }
    }

    public static final void i(@m80.k b bVar, @m80.k String key, @m80.k q0 headers, @m80.l Long l11, @m80.k x00.l<? super x, g2> bodyBuilder) {
        g0.p(bVar, "<this>");
        g0.p(key, "key");
        g0.p(headers, "headers");
        g0.p(bodyBuilder, "bodyBuilder");
        bVar.a(new q(key, new r(l11, new a(bodyBuilder)), headers));
    }

    public static final void j(@m80.k b bVar, @m80.k String key, @m80.k String filename, @m80.l ix.k kVar, @m80.l Long l11, @m80.k x00.l<? super x, g2> bodyBuilder) {
        g0.p(bVar, "<this>");
        g0.p(key, "key");
        g0.p(filename, "filename");
        g0.p(bodyBuilder, "bodyBuilder");
        r0 r0Var = new r0(0, 1, null);
        y0 y0Var = y0.f63006a;
        r0Var.d(y0Var.w(), "filename=" + p0.c(filename));
        if (kVar != null) {
            r0Var.d(y0Var.C(), kVar.toString());
        }
        bVar.a(new q(key, new r(l11, new a(bodyBuilder)), r0Var.build()));
    }

    public static /* synthetic */ void k(b bVar, String key, q0 headers, Long l11, x00.l bodyBuilder, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            headers = q0.f62976a.b();
        }
        if ((i11 & 4) != 0) {
            l11 = null;
        }
        g0.p(bVar, "<this>");
        g0.p(key, "key");
        g0.p(headers, "headers");
        g0.p(bodyBuilder, "bodyBuilder");
        bVar.a(new q(key, new r(l11, new a(bodyBuilder)), headers));
    }

    public static /* synthetic */ void l(b bVar, String str, String str2, ix.k kVar, Long l11, x00.l lVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            kVar = null;
        }
        if ((i11 & 8) != 0) {
            l11 = null;
        }
        j(bVar, str, str2, kVar, l11, lVar);
    }

    @m80.k
    public static final List<b0> m(@m80.k x00.l<? super b, g2> block) {
        g0.p(block, "block");
        b bVar = new b();
        block.invoke(bVar);
        q[] qVarArr = (q[]) bVar.x().toArray(new q[0]);
        return n((q[]) Arrays.copyOf(qVarArr, qVarArr.length));
    }

    @m80.k
    public static final List<b0> n(@m80.k q<?>... values) {
        b0 aVar;
        g0.p(values, "values");
        ArrayList arrayList = new ArrayList();
        for (q<?> qVar : values) {
            String a11 = qVar.a();
            final Object b11 = qVar.b();
            q0 c11 = qVar.c();
            r0 r0Var = new r0(0, 1, null);
            y0 y0Var = y0.f63006a;
            r0Var.k(y0Var.w(), "form-data; name=" + p0.c(a11));
            r0Var.j(c11);
            if (b11 instanceof String) {
                aVar = new b0.d((String) b11, new x00.a() { // from class: dx.h
                    @Override // x00.a
                    public final Object invoke() {
                        g2 o11;
                        o11 = p.o();
                        return o11;
                    }
                }, r0Var.build());
            } else if (b11 instanceof Number) {
                aVar = new b0.d(b11.toString(), new x00.a() { // from class: dx.i
                    @Override // x00.a
                    public final Object invoke() {
                        g2 p11;
                        p11 = p.p();
                        return p11;
                    }
                }, r0Var.build());
            } else if (b11 instanceof Boolean) {
                aVar = new b0.d(String.valueOf(((Boolean) b11).booleanValue()), new x00.a() { // from class: dx.j
                    @Override // x00.a
                    public final Object invoke() {
                        g2 q11;
                        q11 = p.q();
                        return q11;
                    }
                }, r0Var.build());
            } else if (b11 instanceof byte[]) {
                r0Var.k(y0Var.z(), String.valueOf(((byte[]) b11).length));
                aVar = new b0.b(new x00.a() { // from class: dx.k
                    @Override // x00.a
                    public final Object invoke() {
                        c0 r11;
                        r11 = p.r(b11);
                        return r11;
                    }
                }, new x00.a() { // from class: dx.l
                    @Override // x00.a
                    public final Object invoke() {
                        g2 s11;
                        s11 = p.s();
                        return s11;
                    }
                }, r0Var.build());
            } else if (b11 instanceof c0) {
                r0Var.k(y0Var.z(), String.valueOf(jz.j.j((c0) b11)));
                aVar = new b0.b(new x00.a() { // from class: dx.m
                    @Override // x00.a
                    public final Object invoke() {
                        c0 t11;
                        t11 = p.t(b11);
                        return t11;
                    }
                }, new x00.a() { // from class: dx.n
                    @Override // x00.a
                    public final Object invoke() {
                        g2 u11;
                        u11 = p.u(b11);
                        return u11;
                    }
                }, r0Var.build());
            } else if (b11 instanceof r) {
                r rVar = (r) b11;
                Long b12 = rVar.b();
                if (b12 != null) {
                    r0Var.k(y0Var.z(), b12.toString());
                }
                aVar = new b0.b(rVar.a(), new x00.a() { // from class: dx.o
                    @Override // x00.a
                    public final Object invoke() {
                        g2 v11;
                        v11 = p.v();
                        return v11;
                    }
                }, r0Var.build());
            } else {
                if (!(b11 instanceof dx.a)) {
                    throw new IllegalStateException(("Unknown form content type: " + b11).toString());
                }
                dx.a aVar2 = (dx.a) b11;
                Long b13 = aVar2.b();
                if (b13 != null) {
                    r0Var.k(y0Var.z(), b13.toString());
                }
                aVar = new b0.a(aVar2.a(), r0Var.build());
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public static final g2 o() {
        return g2.f100423a;
    }

    public static final g2 p() {
        return g2.f100423a;
    }

    public static final g2 q() {
        return g2.f100423a;
    }

    public static final c0 r(Object obj) {
        return jz.j.c((byte[]) obj, 0, 0, 6, null);
    }

    public static final g2 s() {
        return g2.f100423a;
    }

    public static final c0 t(Object obj) {
        return jz.j.f((c0) obj);
    }

    public static final g2 u(Object obj) {
        ((c0) obj).close();
        return g2.f100423a;
    }

    public static final g2 v() {
        return g2.f100423a;
    }
}
