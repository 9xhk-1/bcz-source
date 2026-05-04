package m3;

import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import j50.d3;
import j50.x2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class b2 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final String f71862a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final Long f71863b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Integer f71864c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final Integer f71865d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final Long f71866e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final Integer f71867f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final Integer f71868g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public final Integer f71869h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<b2> serializer() {
            return a.f71870a;
        }

        public b() {
        }
    }

    public b2() {
        this((String) null, (Long) null, (Integer) null, (Integer) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, 255, (kotlin.jvm.internal.v) null);
    }

    @w00.o
    public static final /* synthetic */ void A(b2 b2Var, i50.e eVar, h50.f fVar) {
        if (eVar.shouldEncodeElementDefault(fVar, 0) || b2Var.f71862a != null) {
            eVar.encodeNullableSerializableElement(fVar, 0, d3.f63348a, b2Var.f71862a);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 1) || b2Var.f71863b != null) {
            eVar.encodeNullableSerializableElement(fVar, 1, j50.l1.f63406a, b2Var.f71863b);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 2) || b2Var.f71864c != null) {
            eVar.encodeNullableSerializableElement(fVar, 2, j50.z0.f63517a, b2Var.f71864c);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 3) || b2Var.f71865d != null) {
            eVar.encodeNullableSerializableElement(fVar, 3, j50.z0.f63517a, b2Var.f71865d);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 4) || b2Var.f71866e != null) {
            eVar.encodeNullableSerializableElement(fVar, 4, j50.l1.f63406a, b2Var.f71866e);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 5) || b2Var.f71867f != null) {
            eVar.encodeNullableSerializableElement(fVar, 5, j50.z0.f63517a, b2Var.f71867f);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 6) || b2Var.f71868g != null) {
            eVar.encodeNullableSerializableElement(fVar, 6, j50.z0.f63517a, b2Var.f71868g);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 7) && b2Var.f71869h == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(fVar, 7, j50.z0.f63517a, b2Var.f71869h);
    }

    public static /* synthetic */ b2 j(b2 b2Var, String str, Long l11, Integer num, Integer num2, Long l12, Integer num3, Integer num4, Integer num5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = b2Var.f71862a;
        }
        if ((i11 & 2) != 0) {
            l11 = b2Var.f71863b;
        }
        if ((i11 & 4) != 0) {
            num = b2Var.f71864c;
        }
        if ((i11 & 8) != 0) {
            num2 = b2Var.f71865d;
        }
        if ((i11 & 16) != 0) {
            l12 = b2Var.f71866e;
        }
        if ((i11 & 32) != 0) {
            num3 = b2Var.f71867f;
        }
        if ((i11 & 64) != 0) {
            num4 = b2Var.f71868g;
        }
        if ((i11 & 128) != 0) {
            num5 = b2Var.f71869h;
        }
        Integer num6 = num4;
        Integer num7 = num5;
        Long l13 = l12;
        Integer num8 = num3;
        return b2Var.i(str, l11, num, num2, l13, num8, num6, num7);
    }

    @m80.l
    public final String a() {
        return this.f71862a;
    }

    @m80.l
    public final Long b() {
        return this.f71863b;
    }

    @m80.l
    public final Integer c() {
        return this.f71864c;
    }

    @m80.l
    public final Integer d() {
        return this.f71865d;
    }

    @m80.l
    public final Long e() {
        return this.f71866e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return kotlin.jvm.internal.g0.g(this.f71862a, b2Var.f71862a) && kotlin.jvm.internal.g0.g(this.f71863b, b2Var.f71863b) && kotlin.jvm.internal.g0.g(this.f71864c, b2Var.f71864c) && kotlin.jvm.internal.g0.g(this.f71865d, b2Var.f71865d) && kotlin.jvm.internal.g0.g(this.f71866e, b2Var.f71866e) && kotlin.jvm.internal.g0.g(this.f71867f, b2Var.f71867f) && kotlin.jvm.internal.g0.g(this.f71868g, b2Var.f71868g) && kotlin.jvm.internal.g0.g(this.f71869h, b2Var.f71869h);
    }

    @m80.l
    public final Integer f() {
        return this.f71867f;
    }

    @m80.l
    public final Integer g() {
        return this.f71868g;
    }

    @m80.l
    public final Integer h() {
        return this.f71869h;
    }

    public int hashCode() {
        String str = this.f71862a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.f71863b;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num = this.f71864c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f71865d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l12 = this.f71866e;
        int hashCode5 = (hashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num3 = this.f71867f;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f71868g;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f71869h;
        return hashCode7 + (num5 != null ? num5.hashCode() : 0);
    }

    @m80.k
    public final b2 i(@m80.l String str, @m80.l Long l11, @m80.l Integer num, @m80.l Integer num2, @m80.l Long l12, @m80.l Integer num3, @m80.l Integer num4, @m80.l Integer num5) {
        return new b2(str, l11, num, num2, l12, num3, num4, num5);
    }

    @m80.l
    public final Integer k() {
        return this.f71865d;
    }

    @m80.l
    public final String m() {
        return this.f71862a;
    }

    @m80.l
    public final Long o() {
        return this.f71863b;
    }

    @m80.l
    public final Integer q() {
        return this.f71864c;
    }

    @m80.l
    public final Integer s() {
        return this.f71869h;
    }

    @m80.k
    public String toString() {
        return "UserEntitlementVo(entitlementKey=" + this.f71862a + ", expireTime=" + this.f71863b + ", maxValue=" + this.f71864c + ", currentValue=" + this.f71865d + ", nextRecoveryTime=" + this.f71866e + ", nextRecoveryAmount=" + this.f71867f + ", recoveryInterval=" + this.f71868g + ", memberType=" + this.f71869h + ')';
    }

    @m80.l
    public final Integer u() {
        return this.f71867f;
    }

    @m80.l
    public final Long w() {
        return this.f71866e;
    }

    @m80.l
    public final Integer y() {
        return this.f71868g;
    }

    public /* synthetic */ b2(int i11, String str, Long l11, Integer num, Integer num2, Long l12, Integer num3, Integer num4, Integer num5, x2 x2Var) {
        if ((i11 & 1) == 0) {
            this.f71862a = null;
        } else {
            this.f71862a = str;
        }
        if ((i11 & 2) == 0) {
            this.f71863b = null;
        } else {
            this.f71863b = l11;
        }
        if ((i11 & 4) == 0) {
            this.f71864c = null;
        } else {
            this.f71864c = num;
        }
        if ((i11 & 8) == 0) {
            this.f71865d = null;
        } else {
            this.f71865d = num2;
        }
        if ((i11 & 16) == 0) {
            this.f71866e = null;
        } else {
            this.f71866e = l12;
        }
        if ((i11 & 32) == 0) {
            this.f71867f = null;
        } else {
            this.f71867f = num3;
        }
        if ((i11 & 64) == 0) {
            this.f71868g = null;
        } else {
            this.f71868g = num4;
        }
        if ((i11 & 128) == 0) {
            this.f71869h = null;
        } else {
            this.f71869h = num5;
        }
    }

    public b2(@m80.l String str, @m80.l Long l11, @m80.l Integer num, @m80.l Integer num2, @m80.l Long l12, @m80.l Integer num3, @m80.l Integer num4, @m80.l Integer num5) {
        this.f71862a = str;
        this.f71863b = l11;
        this.f71864c = num;
        this.f71865d = num2;
        this.f71866e = l12;
        this.f71867f = num3;
        this.f71868g = num4;
        this.f71869h = num5;
    }

    public /* synthetic */ b2(String str, Long l11, Integer num, Integer num2, Long l12, Integer num3, Integer num4, Integer num5, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : num2, (i11 & 16) != 0 ? null : l12, (i11 & 32) != 0 ? null : num3, (i11 & 64) != 0 ? null : num4, (i11 & 128) != 0 ? null : num5);
    }

    @f50.z("currentValue")
    public static /* synthetic */ void l() {
    }

    @f50.z("entitlementKey")
    public static /* synthetic */ void n() {
    }

    @f50.z(HwPayConstant.KEY_EXPIRETIME)
    public static /* synthetic */ void p() {
    }

    @f50.z("maxValue")
    public static /* synthetic */ void r() {
    }

    @f50.z("memberType")
    public static /* synthetic */ void t() {
    }

    @f50.z("nextRecoveryAmount")
    public static /* synthetic */ void v() {
    }

    @f50.z("nextRecoveryTime")
    public static /* synthetic */ void x() {
    }

    @f50.z("recoveryInterval")
    public static /* synthetic */ void z() {
    }
}
