package m3;

import j50.d3;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;
import m3.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class h0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f71931a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71932b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71933c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final q f71934d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f71935e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<h0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71936a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71936a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.MemberSaleInfoVo", aVar, 5);
            l2Var.q("memberType", false);
            l2Var.q("price", false);
            l2Var.q("originPrice", false);
            l2Var.q("mallGoodsInfo", true);
            l2Var.q("tag", true);
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
            f50.i<?> v11 = g50.a.v(q.a.f72055a);
            j50.z0 z0Var = j50.z0.f63517a;
            return new f50.i[]{z0Var, z0Var, z0Var, v11, d3.f63348a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final h0 e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            int i14;
            q qVar;
            String str;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                int decodeIntElement2 = beginStructure.decodeIntElement(fVar, 2);
                qVar = (q) beginStructure.decodeNullableSerializableElement(fVar, 3, q.a.f72055a, null);
                str = beginStructure.decodeStringElement(fVar, 4);
                i12 = decodeIntElement2;
                i13 = decodeIntElement;
                i14 = 31;
            } else {
                boolean z11 = true;
                i11 = 0;
                int i15 = 0;
                int i16 = 0;
                q qVar2 = null;
                String str2 = null;
                int i17 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i16 |= 1;
                    } else if (decodeElementIndex == 1) {
                        i15 = beginStructure.decodeIntElement(fVar, 1);
                        i16 |= 2;
                    } else if (decodeElementIndex == 2) {
                        i17 = beginStructure.decodeIntElement(fVar, 2);
                        i16 |= 4;
                    } else if (decodeElementIndex == 3) {
                        qVar2 = (q) beginStructure.decodeNullableSerializableElement(fVar, 3, q.a.f72055a, qVar2);
                        i16 |= 8;
                    } else {
                        if (decodeElementIndex != 4) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        str2 = beginStructure.decodeStringElement(fVar, 4);
                        i16 |= 16;
                    }
                }
                i12 = i17;
                i13 = i15;
                i14 = i16;
                qVar = qVar2;
                str = str2;
            }
            int i18 = i11;
            beginStructure.endStructure(fVar);
            return new h0(i14, i18, i13, i12, qVar, str, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k h0 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            h0.r(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<h0> serializer() {
            return a.f71936a;
        }

        public b() {
        }
    }

    public /* synthetic */ h0(int i11, int i12, int i13, int i14, q qVar, String str, x2 x2Var) {
        if (7 != (i11 & 7)) {
            j50.h2.b(i11, 7, a.f71936a.a());
        }
        this.f71931a = i12;
        this.f71932b = i13;
        this.f71933c = i14;
        if ((i11 & 8) == 0) {
            this.f71934d = null;
        } else {
            this.f71934d = qVar;
        }
        if ((i11 & 16) == 0) {
            this.f71935e = "";
        } else {
            this.f71935e = str;
        }
    }

    public static /* synthetic */ h0 g(h0 h0Var, int i11, int i12, int i13, q qVar, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = h0Var.f71931a;
        }
        if ((i14 & 2) != 0) {
            i12 = h0Var.f71932b;
        }
        if ((i14 & 4) != 0) {
            i13 = h0Var.f71933c;
        }
        if ((i14 & 8) != 0) {
            qVar = h0Var.f71934d;
        }
        if ((i14 & 16) != 0) {
            str = h0Var.f71935e;
        }
        String str2 = str;
        int i15 = i13;
        return h0Var.f(i11, i12, i15, qVar, str2);
    }

    @w00.o
    public static final /* synthetic */ void r(h0 h0Var, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, h0Var.f71931a);
        eVar.encodeIntElement(fVar, 1, h0Var.f71932b);
        eVar.encodeIntElement(fVar, 2, h0Var.f71933c);
        if (eVar.shouldEncodeElementDefault(fVar, 3) || h0Var.f71934d != null) {
            eVar.encodeNullableSerializableElement(fVar, 3, q.a.f72055a, h0Var.f71934d);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 4) && kotlin.jvm.internal.g0.g(h0Var.f71935e, "")) {
            return;
        }
        eVar.encodeStringElement(fVar, 4, h0Var.f71935e);
    }

    public final int a() {
        return this.f71931a;
    }

    public final int b() {
        return this.f71932b;
    }

    public final int c() {
        return this.f71933c;
    }

    @m80.l
    public final q d() {
        return this.f71934d;
    }

    @m80.k
    public final String e() {
        return this.f71935e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f71931a == h0Var.f71931a && this.f71932b == h0Var.f71932b && this.f71933c == h0Var.f71933c && kotlin.jvm.internal.g0.g(this.f71934d, h0Var.f71934d) && kotlin.jvm.internal.g0.g(this.f71935e, h0Var.f71935e);
    }

    @m80.k
    public final h0 f(int i11, int i12, int i13, @m80.l q qVar, @m80.k String tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        return new h0(i11, i12, i13, qVar, tag);
    }

    @m80.l
    public final q h() {
        return this.f71934d;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f71931a) * 31) + Integer.hashCode(this.f71932b)) * 31) + Integer.hashCode(this.f71933c)) * 31;
        q qVar = this.f71934d;
        return ((hashCode + (qVar == null ? 0 : qVar.hashCode())) * 31) + this.f71935e.hashCode();
    }

    public final int j() {
        return this.f71931a;
    }

    public final int l() {
        return this.f71933c;
    }

    public final int n() {
        return this.f71932b;
    }

    @m80.k
    public final String p() {
        return this.f71935e;
    }

    @m80.k
    public String toString() {
        return "MemberSaleInfoVo(memberType=" + this.f71931a + ", price=" + this.f71932b + ", originPrice=" + this.f71933c + ", mallGoodsInfo=" + this.f71934d + ", tag=" + this.f71935e + ')';
    }

    public h0(int i11, int i12, int i13, @m80.l q qVar, @m80.k String tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        this.f71931a = i11;
        this.f71932b = i12;
        this.f71933c = i13;
        this.f71934d = qVar;
        this.f71935e = tag;
    }

    public /* synthetic */ h0(int i11, int i12, int i13, q qVar, String str, int i14, kotlin.jvm.internal.v vVar) {
        this(i11, i12, i13, (i14 & 8) != 0 ? null : qVar, (i14 & 16) != 0 ? "" : str);
    }

    @f50.z("mallGoodsInfo")
    public static /* synthetic */ void i() {
    }

    @f50.z("memberType")
    public static /* synthetic */ void k() {
    }

    @f50.z("originPrice")
    public static /* synthetic */ void m() {
    }

    @f50.z("price")
    public static /* synthetic */ void o() {
    }

    @f50.z("tag")
    public static /* synthetic */ void q() {
    }
}
