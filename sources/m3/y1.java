package m3;

import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;
import m3.h0;
import m3.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class y1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f72118d = {null, null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: m3.x1
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = y1.b();
            return b11;
        }
    })};

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final h0 f72119a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final p f72120b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<h0> f72121c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<y1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72122a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72122a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.UserEntitlementSaleInfoModel", aVar, 3);
            l2Var.q("memberSaleInfo", true);
            l2Var.q("wordEnergySaleInfo", true);
            l2Var.q("memberSaleInfoList", true);
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{g50.a.v(h0.a.f71936a), g50.a.v(p.a.f72041a), y1.f72118d[2].getValue()};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final y1 e(@m80.k i50.f decoder) {
            int i11;
            h0 h0Var;
            p pVar;
            List list;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = y1.f72118d;
            h0 h0Var2 = null;
            if (beginStructure.decodeSequentially()) {
                h0 h0Var3 = (h0) beginStructure.decodeNullableSerializableElement(fVar, 0, h0.a.f71936a, null);
                p pVar2 = (p) beginStructure.decodeNullableSerializableElement(fVar, 1, p.a.f72041a, null);
                list = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), null);
                h0Var = h0Var3;
                i11 = 7;
                pVar = pVar2;
            } else {
                boolean z11 = true;
                int i12 = 0;
                p pVar3 = null;
                List list2 = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        h0Var2 = (h0) beginStructure.decodeNullableSerializableElement(fVar, 0, h0.a.f71936a, h0Var2);
                        i12 |= 1;
                    } else if (decodeElementIndex == 1) {
                        pVar3 = (p) beginStructure.decodeNullableSerializableElement(fVar, 1, p.a.f72041a, pVar3);
                        i12 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        list2 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), list2);
                        i12 |= 4;
                    }
                }
                i11 = i12;
                h0Var = h0Var2;
                pVar = pVar3;
                list = list2;
            }
            beginStructure.endStructure(fVar);
            return new y1(i11, h0Var, pVar, list, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k y1 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            y1.o(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<y1> serializer() {
            return a.f72122a;
        }

        public b() {
        }
    }

    public y1() {
        this((h0) null, (p) null, (List) null, 7, (kotlin.jvm.internal.v) null);
    }

    public static final /* synthetic */ f50.i b() {
        return new j50.f(h0.a.f71936a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ y1 h(y1 y1Var, h0 h0Var, p pVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            h0Var = y1Var.f72119a;
        }
        if ((i11 & 2) != 0) {
            pVar = y1Var.f72120b;
        }
        if ((i11 & 4) != 0) {
            list = y1Var.f72121c;
        }
        return y1Var.g(h0Var, pVar, list);
    }

    @w00.o
    public static final /* synthetic */ void o(y1 y1Var, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f72118d;
        if (eVar.shouldEncodeElementDefault(fVar, 0) || y1Var.f72119a != null) {
            eVar.encodeNullableSerializableElement(fVar, 0, h0.a.f71936a, y1Var.f72119a);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 1) || y1Var.f72120b != null) {
            eVar.encodeNullableSerializableElement(fVar, 1, p.a.f72041a, y1Var.f72120b);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 2) && kotlin.jvm.internal.g0.g(y1Var.f72121c, a00.h0.J())) {
            return;
        }
        eVar.encodeSerializableElement(fVar, 2, c0VarArr[2].getValue(), y1Var.f72121c);
    }

    @m80.l
    public final h0 d() {
        return this.f72119a;
    }

    @m80.l
    public final p e() {
        return this.f72120b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return kotlin.jvm.internal.g0.g(this.f72119a, y1Var.f72119a) && kotlin.jvm.internal.g0.g(this.f72120b, y1Var.f72120b) && kotlin.jvm.internal.g0.g(this.f72121c, y1Var.f72121c);
    }

    @m80.k
    public final List<h0> f() {
        return this.f72121c;
    }

    @m80.k
    public final y1 g(@m80.l h0 h0Var, @m80.l p pVar, @m80.k List<h0> memberSaleInfoList) {
        kotlin.jvm.internal.g0.p(memberSaleInfoList, "memberSaleInfoList");
        return new y1(h0Var, pVar, memberSaleInfoList);
    }

    public int hashCode() {
        h0 h0Var = this.f72119a;
        int hashCode = (h0Var == null ? 0 : h0Var.hashCode()) * 31;
        p pVar = this.f72120b;
        return ((hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31) + this.f72121c.hashCode();
    }

    @m80.l
    public final h0 i() {
        return this.f72119a;
    }

    @m80.k
    public final List<h0> k() {
        return this.f72121c;
    }

    @m80.l
    public final p m() {
        return this.f72120b;
    }

    @m80.k
    public String toString() {
        return "UserEntitlementSaleInfoModel(memberSaleInfo=" + this.f72119a + ", wordEnergySaleInfo=" + this.f72120b + ", memberSaleInfoList=" + this.f72121c + ')';
    }

    public /* synthetic */ y1(int i11, h0 h0Var, p pVar, List list, x2 x2Var) {
        if ((i11 & 1) == 0) {
            this.f72119a = null;
        } else {
            this.f72119a = h0Var;
        }
        if ((i11 & 2) == 0) {
            this.f72120b = null;
        } else {
            this.f72120b = pVar;
        }
        if ((i11 & 4) == 0) {
            this.f72121c = a00.h0.J();
        } else {
            this.f72121c = list;
        }
    }

    public y1(@m80.l h0 h0Var, @m80.l p pVar, @m80.k List<h0> memberSaleInfoList) {
        kotlin.jvm.internal.g0.p(memberSaleInfoList, "memberSaleInfoList");
        this.f72119a = h0Var;
        this.f72120b = pVar;
        this.f72121c = memberSaleInfoList;
    }

    public /* synthetic */ y1(h0 h0Var, p pVar, List list, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : pVar, (i11 & 4) != 0 ? a00.h0.J() : list);
    }

    @f50.z("memberSaleInfo")
    public static /* synthetic */ void j() {
    }

    @f50.z("memberSaleInfoList")
    public static /* synthetic */ void l() {
    }

    @f50.z("wordEnergySaleInfo")
    public static /* synthetic */ void n() {
    }
}
