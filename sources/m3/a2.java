package m3;

import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;
import m3.h0;
import m3.o;
import m3.p;
import m3.q0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class a2 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f71839h = {null, null, null, null, null, null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: m3.z1
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = a2.b();
            return b11;
        }
    })};

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final h0 f71840a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final p f71841b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final o f71842c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final q0 f71843d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final p f71844e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final o f71845f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final List<h0> f71846g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<a2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71847a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71847a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.UserEntitlementSaleInfoVo", aVar, 7);
            l2Var.q("memberSaleInfo", true);
            l2Var.q("wordEnergySaleInfo", true);
            l2Var.q("wordEnergyAdInfo", true);
            l2Var.q("redHeartSaleInfo", true);
            l2Var.q("sentenceEnergySaleInfo", true);
            l2Var.q("sentenceEnergyAdInfo", true);
            l2Var.q("memberSaleInfoList", false);
            descriptor = l2Var;
        }

        @Override // f50.i, f50.b0, f50.e
        @m80.k
        public final h50.f a() {
            return descriptor;
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            yz.c0[] c0VarArr = a2.f71839h;
            f50.i<?> v11 = g50.a.v(h0.a.f71936a);
            p.a aVar = p.a.f72041a;
            f50.i<?> v12 = g50.a.v(aVar);
            o.a aVar2 = o.a.f72017a;
            return new f50.i[]{v11, v12, g50.a.v(aVar2), g50.a.v(q0.a.f72057a), g50.a.v(aVar), g50.a.v(aVar2), g50.a.v((f50.i) c0VarArr[6].getValue())};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final a2 e(@m80.k i50.f decoder) {
            int i11;
            List list;
            o oVar;
            h0 h0Var;
            p pVar;
            o oVar2;
            q0 q0Var;
            p pVar2;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = a2.f71839h;
            int i12 = 5;
            h0 h0Var2 = null;
            if (beginStructure.decodeSequentially()) {
                h0 h0Var3 = (h0) beginStructure.decodeNullableSerializableElement(fVar, 0, h0.a.f71936a, null);
                p.a aVar = p.a.f72041a;
                p pVar3 = (p) beginStructure.decodeNullableSerializableElement(fVar, 1, aVar, null);
                o.a aVar2 = o.a.f72017a;
                o oVar3 = (o) beginStructure.decodeNullableSerializableElement(fVar, 2, aVar2, null);
                q0 q0Var2 = (q0) beginStructure.decodeNullableSerializableElement(fVar, 3, q0.a.f72057a, null);
                p pVar4 = (p) beginStructure.decodeNullableSerializableElement(fVar, 4, aVar, null);
                o oVar4 = (o) beginStructure.decodeNullableSerializableElement(fVar, 5, aVar2, null);
                list = (List) beginStructure.decodeNullableSerializableElement(fVar, 6, (f50.e) c0VarArr[6].getValue(), null);
                h0Var = h0Var3;
                oVar = oVar4;
                q0Var = q0Var2;
                pVar2 = pVar4;
                oVar2 = oVar3;
                i11 = 127;
                pVar = pVar3;
            } else {
                boolean z11 = true;
                int i13 = 0;
                List list2 = null;
                o oVar5 = null;
                p pVar5 = null;
                o oVar6 = null;
                q0 q0Var3 = null;
                p pVar6 = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z11 = false;
                            i12 = 5;
                        case 0:
                            h0Var2 = (h0) beginStructure.decodeNullableSerializableElement(fVar, 0, h0.a.f71936a, h0Var2);
                            i13 |= 1;
                            i12 = 5;
                        case 1:
                            pVar5 = (p) beginStructure.decodeNullableSerializableElement(fVar, 1, p.a.f72041a, pVar5);
                            i13 |= 2;
                            i12 = 5;
                        case 2:
                            oVar6 = (o) beginStructure.decodeNullableSerializableElement(fVar, 2, o.a.f72017a, oVar6);
                            i13 |= 4;
                            i12 = 5;
                        case 3:
                            q0Var3 = (q0) beginStructure.decodeNullableSerializableElement(fVar, 3, q0.a.f72057a, q0Var3);
                            i13 |= 8;
                        case 4:
                            pVar6 = (p) beginStructure.decodeNullableSerializableElement(fVar, 4, p.a.f72041a, pVar6);
                            i13 |= 16;
                        case 5:
                            oVar5 = (o) beginStructure.decodeNullableSerializableElement(fVar, i12, o.a.f72017a, oVar5);
                            i13 |= 32;
                        case 6:
                            list2 = (List) beginStructure.decodeNullableSerializableElement(fVar, 6, (f50.e) c0VarArr[6].getValue(), list2);
                            i13 |= 64;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                i11 = i13;
                list = list2;
                oVar = oVar5;
                h0Var = h0Var2;
                pVar = pVar5;
                oVar2 = oVar6;
                q0Var = q0Var3;
                pVar2 = pVar6;
            }
            beginStructure.endStructure(fVar);
            return new a2(i11, h0Var, pVar, oVar2, q0Var, pVar2, oVar, list, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k a2 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            a2.A(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<a2> serializer() {
            return a.f71847a;
        }

        public b() {
        }
    }

    public /* synthetic */ a2(int i11, h0 h0Var, p pVar, o oVar, q0 q0Var, p pVar2, o oVar2, List list, x2 x2Var) {
        if (64 != (i11 & 64)) {
            j50.h2.b(i11, 64, a.f71847a.a());
        }
        if ((i11 & 1) == 0) {
            this.f71840a = null;
        } else {
            this.f71840a = h0Var;
        }
        if ((i11 & 2) == 0) {
            this.f71841b = null;
        } else {
            this.f71841b = pVar;
        }
        if ((i11 & 4) == 0) {
            this.f71842c = null;
        } else {
            this.f71842c = oVar;
        }
        if ((i11 & 8) == 0) {
            this.f71843d = null;
        } else {
            this.f71843d = q0Var;
        }
        if ((i11 & 16) == 0) {
            this.f71844e = null;
        } else {
            this.f71844e = pVar2;
        }
        if ((i11 & 32) == 0) {
            this.f71845f = null;
        } else {
            this.f71845f = oVar2;
        }
        this.f71846g = list;
    }

    @w00.o
    public static final /* synthetic */ void A(a2 a2Var, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f71839h;
        if (eVar.shouldEncodeElementDefault(fVar, 0) || a2Var.f71840a != null) {
            eVar.encodeNullableSerializableElement(fVar, 0, h0.a.f71936a, a2Var.f71840a);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 1) || a2Var.f71841b != null) {
            eVar.encodeNullableSerializableElement(fVar, 1, p.a.f72041a, a2Var.f71841b);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 2) || a2Var.f71842c != null) {
            eVar.encodeNullableSerializableElement(fVar, 2, o.a.f72017a, a2Var.f71842c);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 3) || a2Var.f71843d != null) {
            eVar.encodeNullableSerializableElement(fVar, 3, q0.a.f72057a, a2Var.f71843d);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 4) || a2Var.f71844e != null) {
            eVar.encodeNullableSerializableElement(fVar, 4, p.a.f72041a, a2Var.f71844e);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 5) || a2Var.f71845f != null) {
            eVar.encodeNullableSerializableElement(fVar, 5, o.a.f72017a, a2Var.f71845f);
        }
        eVar.encodeNullableSerializableElement(fVar, 6, c0VarArr[6].getValue(), a2Var.f71846g);
    }

    public static final /* synthetic */ f50.i b() {
        return new j50.f(h0.a.f71936a);
    }

    public static /* synthetic */ a2 l(a2 a2Var, h0 h0Var, p pVar, o oVar, q0 q0Var, p pVar2, o oVar2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            h0Var = a2Var.f71840a;
        }
        if ((i11 & 2) != 0) {
            pVar = a2Var.f71841b;
        }
        if ((i11 & 4) != 0) {
            oVar = a2Var.f71842c;
        }
        if ((i11 & 8) != 0) {
            q0Var = a2Var.f71843d;
        }
        if ((i11 & 16) != 0) {
            pVar2 = a2Var.f71844e;
        }
        if ((i11 & 32) != 0) {
            oVar2 = a2Var.f71845f;
        }
        if ((i11 & 64) != 0) {
            list = a2Var.f71846g;
        }
        o oVar3 = oVar2;
        List list2 = list;
        p pVar3 = pVar2;
        o oVar4 = oVar;
        return a2Var.k(h0Var, pVar, oVar4, q0Var, pVar3, oVar3, list2);
    }

    @m80.l
    public final h0 d() {
        return this.f71840a;
    }

    @m80.l
    public final p e() {
        return this.f71841b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return kotlin.jvm.internal.g0.g(this.f71840a, a2Var.f71840a) && kotlin.jvm.internal.g0.g(this.f71841b, a2Var.f71841b) && kotlin.jvm.internal.g0.g(this.f71842c, a2Var.f71842c) && kotlin.jvm.internal.g0.g(this.f71843d, a2Var.f71843d) && kotlin.jvm.internal.g0.g(this.f71844e, a2Var.f71844e) && kotlin.jvm.internal.g0.g(this.f71845f, a2Var.f71845f) && kotlin.jvm.internal.g0.g(this.f71846g, a2Var.f71846g);
    }

    @m80.l
    public final o f() {
        return this.f71842c;
    }

    @m80.l
    public final q0 g() {
        return this.f71843d;
    }

    @m80.l
    public final p h() {
        return this.f71844e;
    }

    public int hashCode() {
        h0 h0Var = this.f71840a;
        int hashCode = (h0Var == null ? 0 : h0Var.hashCode()) * 31;
        p pVar = this.f71841b;
        int hashCode2 = (hashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        o oVar = this.f71842c;
        int hashCode3 = (hashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        q0 q0Var = this.f71843d;
        int hashCode4 = (hashCode3 + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        p pVar2 = this.f71844e;
        int hashCode5 = (hashCode4 + (pVar2 == null ? 0 : pVar2.hashCode())) * 31;
        o oVar2 = this.f71845f;
        int hashCode6 = (hashCode5 + (oVar2 == null ? 0 : oVar2.hashCode())) * 31;
        List<h0> list = this.f71846g;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    @m80.l
    public final o i() {
        return this.f71845f;
    }

    @m80.l
    public final List<h0> j() {
        return this.f71846g;
    }

    @m80.k
    public final a2 k(@m80.l h0 h0Var, @m80.l p pVar, @m80.l o oVar, @m80.l q0 q0Var, @m80.l p pVar2, @m80.l o oVar2, @m80.l List<h0> list) {
        return new a2(h0Var, pVar, oVar, q0Var, pVar2, oVar2, list);
    }

    @m80.l
    public final h0 m() {
        return this.f71840a;
    }

    @m80.l
    public final List<h0> o() {
        return this.f71846g;
    }

    @m80.l
    public final q0 q() {
        return this.f71843d;
    }

    @m80.l
    public final o s() {
        return this.f71845f;
    }

    @m80.k
    public String toString() {
        return "UserEntitlementSaleInfoVo(memberSaleInfo=" + this.f71840a + ", wordEnergySaleInfo=" + this.f71841b + ", wordEnergyAdInfo=" + this.f71842c + ", redHeartSaleInfo=" + this.f71843d + ", sentenceEnergySaleInfo=" + this.f71844e + ", sentenceEnergyAdInfo=" + this.f71845f + ", memberSaleInfoList=" + this.f71846g + ')';
    }

    @m80.l
    public final p u() {
        return this.f71844e;
    }

    @m80.l
    public final o w() {
        return this.f71842c;
    }

    @m80.l
    public final p y() {
        return this.f71841b;
    }

    public a2(@m80.l h0 h0Var, @m80.l p pVar, @m80.l o oVar, @m80.l q0 q0Var, @m80.l p pVar2, @m80.l o oVar2, @m80.l List<h0> list) {
        this.f71840a = h0Var;
        this.f71841b = pVar;
        this.f71842c = oVar;
        this.f71843d = q0Var;
        this.f71844e = pVar2;
        this.f71845f = oVar2;
        this.f71846g = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ a2(m3.h0 r2, m3.p r3, m3.o r4, m3.q0 r5, m3.p r6, m3.o r7, java.util.List r8, int r9, kotlin.jvm.internal.v r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            r0 = 0
            if (r10 == 0) goto L6
            r2 = r0
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lb
            r3 = r0
        Lb:
            r10 = r9 & 4
            if (r10 == 0) goto L10
            r4 = r0
        L10:
            r10 = r9 & 8
            if (r10 == 0) goto L15
            r5 = r0
        L15:
            r10 = r9 & 16
            if (r10 == 0) goto L1a
            r6 = r0
        L1a:
            r9 = r9 & 32
            if (r9 == 0) goto L27
            r9 = r8
            r8 = r0
        L20:
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            goto L2a
        L27:
            r9 = r8
            r8 = r7
            goto L20
        L2a:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.a2.<init>(m3.h0, m3.p, m3.o, m3.q0, m3.p, m3.o, java.util.List, int, kotlin.jvm.internal.v):void");
    }

    @f50.z("memberSaleInfo")
    public static /* synthetic */ void n() {
    }

    @f50.z("memberSaleInfoList")
    public static /* synthetic */ void p() {
    }

    @f50.z("redHeartSaleInfo")
    public static /* synthetic */ void r() {
    }

    @f50.z("sentenceEnergyAdInfo")
    public static /* synthetic */ void t() {
    }

    @f50.z("sentenceEnergySaleInfo")
    public static /* synthetic */ void v() {
    }

    @f50.z("wordEnergyAdInfo")
    public static /* synthetic */ void x() {
    }

    @f50.z("wordEnergySaleInfo")
    public static /* synthetic */ void z() {
    }
}
