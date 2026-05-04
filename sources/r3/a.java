package r3;

import f50.a0;
import f50.i;
import h50.f;
import j50.d3;
import j50.h2;
import j50.l1;
import j50.l2;
import j50.p0;
import j50.x2;
import j50.z0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlinx.serialization.UnknownFieldException;
import m80.k;
import m80.l;
import q9.h;
import w00.o;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0
/* loaded from: classes3.dex */
public final class a {

    @k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f82880a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f82881b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f82882c;

    /* renamed from: d, reason: collision with root package name */
    public final int f82883d;

    /* renamed from: e, reason: collision with root package name */
    public final int f82884e;

    /* renamed from: f, reason: collision with root package name */
    public final int f82885f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f82886g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f82887h;

    /* renamed from: i, reason: collision with root package name */
    public final long f82888i;

    /* renamed from: j, reason: collision with root package name */
    public final int f82889j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f82890k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    /* renamed from: r3.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1027a implements p0<a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1027a f82891a;

        @k
        private static final f descriptor;

        static {
            C1027a c1027a = new C1027a();
            f82891a = c1027a;
            l2 l2Var = new l2("com.baicizhan.app.biz.auth.local.UserRecord", c1027a, 11);
            l2Var.q("name", false);
            l2Var.q("uid", false);
            l2Var.q(h.f81940d, false);
            l2Var.q("gender", false);
            l2Var.q("roleUp", false);
            l2Var.q("grade", false);
            l2Var.q("token", false);
            l2Var.q("phone", false);
            l2Var.q("loginTime", false);
            l2Var.q("loginType", false);
            l2Var.q("isNewUser", true);
            descriptor = l2Var;
        }

        @Override // f50.i, f50.b0, f50.e
        @k
        public final f a() {
            return descriptor;
        }

        @Override // j50.p0
        @k
        public /* bridge */ i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // j50.p0
        @k
        public final i<?>[] f() {
            d3 d3Var = d3.f63348a;
            i<?> v11 = g50.a.v(d3Var);
            z0 z0Var = z0.f63517a;
            return new i[]{d3Var, d3Var, d3Var, z0Var, z0Var, z0Var, d3Var, v11, l1.f63406a, z0Var, j50.i.f63378a};
        }

        @Override // f50.e
        @k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final a e(@k i50.f decoder) {
            boolean z11;
            String str;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            long j11;
            String str2;
            String str3;
            String str4;
            String str5;
            g0.p(decoder, "decoder");
            f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            int i16 = 10;
            int i17 = 0;
            if (beginStructure.decodeSequentially()) {
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 0);
                String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 1);
                String decodeStringElement3 = beginStructure.decodeStringElement(fVar, 2);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 3);
                int decodeIntElement2 = beginStructure.decodeIntElement(fVar, 4);
                int decodeIntElement3 = beginStructure.decodeIntElement(fVar, 5);
                String decodeStringElement4 = beginStructure.decodeStringElement(fVar, 6);
                String str6 = (String) beginStructure.decodeNullableSerializableElement(fVar, 7, d3.f63348a, null);
                long decodeLongElement = beginStructure.decodeLongElement(fVar, 8);
                int decodeIntElement4 = beginStructure.decodeIntElement(fVar, 9);
                str2 = decodeStringElement;
                z11 = beginStructure.decodeBooleanElement(fVar, 10);
                i12 = decodeIntElement4;
                str = str6;
                str5 = decodeStringElement4;
                i13 = decodeIntElement3;
                i14 = decodeIntElement;
                i11 = 2047;
                i15 = decodeIntElement2;
                str4 = decodeStringElement3;
                str3 = decodeStringElement2;
                j11 = decodeLongElement;
            } else {
                boolean z12 = true;
                boolean z13 = false;
                int i18 = 0;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                long j12 = 0;
                int i19 = 0;
                int i21 = 0;
                int i22 = 0;
                while (z12) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z12 = false;
                            i16 = 10;
                        case 0:
                            str8 = beginStructure.decodeStringElement(fVar, 0);
                            i17 |= 1;
                            i16 = 10;
                        case 1:
                            str9 = beginStructure.decodeStringElement(fVar, 1);
                            i17 |= 2;
                            i16 = 10;
                        case 2:
                            str10 = beginStructure.decodeStringElement(fVar, 2);
                            i17 |= 4;
                        case 3:
                            i22 = beginStructure.decodeIntElement(fVar, 3);
                            i17 |= 8;
                        case 4:
                            i18 = beginStructure.decodeIntElement(fVar, 4);
                            i17 |= 16;
                        case 5:
                            i21 = beginStructure.decodeIntElement(fVar, 5);
                            i17 |= 32;
                        case 6:
                            str11 = beginStructure.decodeStringElement(fVar, 6);
                            i17 |= 64;
                        case 7:
                            str7 = (String) beginStructure.decodeNullableSerializableElement(fVar, 7, d3.f63348a, str7);
                            i17 |= 128;
                        case 8:
                            j12 = beginStructure.decodeLongElement(fVar, 8);
                            i17 |= 256;
                        case 9:
                            i19 = beginStructure.decodeIntElement(fVar, 9);
                            i17 |= 512;
                        case 10:
                            z13 = beginStructure.decodeBooleanElement(fVar, i16);
                            i17 |= 1024;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                z11 = z13;
                str = str7;
                i11 = i17;
                i12 = i19;
                i13 = i21;
                i14 = i22;
                i15 = i18;
                j11 = j12;
                str2 = str8;
                str3 = str9;
                str4 = str10;
                str5 = str11;
            }
            beginStructure.endStructure(fVar);
            return new a(i11, str2, str3, str4, i14, i15, i13, str5, str, j11, i12, z11, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@k i50.h encoder, @k a value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            a.y(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @k
        public final i<a> serializer() {
            return C1027a.f82891a;
        }

        public b() {
        }
    }

    public /* synthetic */ a(int i11, String str, String str2, String str3, int i12, int i13, int i14, String str4, String str5, long j11, int i15, boolean z11, x2 x2Var) {
        if (1023 != (i11 & 1023)) {
            h2.b(i11, 1023, C1027a.f82891a.a());
        }
        this.f82880a = str;
        this.f82881b = str2;
        this.f82882c = str3;
        this.f82883d = i12;
        this.f82884e = i13;
        this.f82885f = i14;
        this.f82886g = str4;
        this.f82887h = str5;
        this.f82888i = j11;
        this.f82889j = i15;
        if ((i11 & 1024) == 0) {
            this.f82890k = true;
        } else {
            this.f82890k = z11;
        }
    }

    public static /* synthetic */ a m(a aVar, String str, String str2, String str3, int i11, int i12, int i13, String str4, String str5, long j11, int i14, boolean z11, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = aVar.f82880a;
        }
        if ((i15 & 2) != 0) {
            str2 = aVar.f82881b;
        }
        if ((i15 & 4) != 0) {
            str3 = aVar.f82882c;
        }
        if ((i15 & 8) != 0) {
            i11 = aVar.f82883d;
        }
        if ((i15 & 16) != 0) {
            i12 = aVar.f82884e;
        }
        if ((i15 & 32) != 0) {
            i13 = aVar.f82885f;
        }
        if ((i15 & 64) != 0) {
            str4 = aVar.f82886g;
        }
        if ((i15 & 128) != 0) {
            str5 = aVar.f82887h;
        }
        if ((i15 & 256) != 0) {
            j11 = aVar.f82888i;
        }
        if ((i15 & 512) != 0) {
            i14 = aVar.f82889j;
        }
        if ((i15 & 1024) != 0) {
            z11 = aVar.f82890k;
        }
        long j12 = j11;
        String str6 = str4;
        String str7 = str5;
        int i16 = i12;
        int i17 = i13;
        String str8 = str3;
        int i18 = i11;
        return aVar.l(str, str2, str8, i18, i16, i17, str6, str7, j12, i14, z11);
    }

    @o
    public static final /* synthetic */ void y(a aVar, i50.e eVar, f fVar) {
        eVar.encodeStringElement(fVar, 0, aVar.f82880a);
        eVar.encodeStringElement(fVar, 1, aVar.f82881b);
        eVar.encodeStringElement(fVar, 2, aVar.f82882c);
        eVar.encodeIntElement(fVar, 3, aVar.f82883d);
        eVar.encodeIntElement(fVar, 4, aVar.f82884e);
        eVar.encodeIntElement(fVar, 5, aVar.f82885f);
        eVar.encodeStringElement(fVar, 6, aVar.f82886g);
        eVar.encodeNullableSerializableElement(fVar, 7, d3.f63348a, aVar.f82887h);
        eVar.encodeLongElement(fVar, 8, aVar.f82888i);
        eVar.encodeIntElement(fVar, 9, aVar.f82889j);
        if (!eVar.shouldEncodeElementDefault(fVar, 10) && aVar.f82890k) {
            return;
        }
        eVar.encodeBooleanElement(fVar, 10, aVar.f82890k);
    }

    @k
    public final String a() {
        return this.f82880a;
    }

    public final int b() {
        return this.f82889j;
    }

    public final boolean c() {
        return this.f82890k;
    }

    @k
    public final String d() {
        return this.f82881b;
    }

    @k
    public final String e() {
        return this.f82882c;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f82880a, aVar.f82880a) && g0.g(this.f82881b, aVar.f82881b) && g0.g(this.f82882c, aVar.f82882c) && this.f82883d == aVar.f82883d && this.f82884e == aVar.f82884e && this.f82885f == aVar.f82885f && g0.g(this.f82886g, aVar.f82886g) && g0.g(this.f82887h, aVar.f82887h) && this.f82888i == aVar.f82888i && this.f82889j == aVar.f82889j && this.f82890k == aVar.f82890k;
    }

    public final int f() {
        return this.f82883d;
    }

    public final int g() {
        return this.f82884e;
    }

    public final int h() {
        return this.f82885f;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f82880a.hashCode() * 31) + this.f82881b.hashCode()) * 31) + this.f82882c.hashCode()) * 31) + Integer.hashCode(this.f82883d)) * 31) + Integer.hashCode(this.f82884e)) * 31) + Integer.hashCode(this.f82885f)) * 31) + this.f82886g.hashCode()) * 31;
        String str = this.f82887h;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.f82888i)) * 31) + Integer.hashCode(this.f82889j)) * 31) + Boolean.hashCode(this.f82890k);
    }

    @k
    public final String i() {
        return this.f82886g;
    }

    @l
    public final String j() {
        return this.f82887h;
    }

    public final long k() {
        return this.f82888i;
    }

    @k
    public final a l(@k String name, @k String uid, @k String avatar, int i11, int i12, int i13, @k String token, @l String str, long j11, int i14, boolean z11) {
        g0.p(name, "name");
        g0.p(uid, "uid");
        g0.p(avatar, "avatar");
        g0.p(token, "token");
        return new a(name, uid, avatar, i11, i12, i13, token, str, j11, i14, z11);
    }

    @k
    public final String n() {
        return this.f82882c;
    }

    public final int o() {
        return this.f82883d;
    }

    public final int p() {
        return this.f82885f;
    }

    public final long q() {
        return this.f82888i;
    }

    public final int r() {
        return this.f82889j;
    }

    @k
    public final String s() {
        return this.f82880a;
    }

    @l
    public final String t() {
        return this.f82887h;
    }

    @k
    public String toString() {
        return "UserRecord(name=" + this.f82880a + ", uid=" + this.f82881b + ", avatar=" + this.f82882c + ", gender=" + this.f82883d + ", roleUp=" + this.f82884e + ", grade=" + this.f82885f + ", token=" + this.f82886g + ", phone=" + this.f82887h + ", loginTime=" + this.f82888i + ", loginType=" + this.f82889j + ", isNewUser=" + this.f82890k + ')';
    }

    public final int u() {
        return this.f82884e;
    }

    @k
    public final String v() {
        return this.f82886g;
    }

    @k
    public final String w() {
        return this.f82881b;
    }

    public final boolean x() {
        return this.f82890k;
    }

    public a(@k String name, @k String uid, @k String avatar, int i11, int i12, int i13, @k String token, @l String str, long j11, int i14, boolean z11) {
        g0.p(name, "name");
        g0.p(uid, "uid");
        g0.p(avatar, "avatar");
        g0.p(token, "token");
        this.f82880a = name;
        this.f82881b = uid;
        this.f82882c = avatar;
        this.f82883d = i11;
        this.f82884e = i12;
        this.f82885f = i13;
        this.f82886g = token;
        this.f82887h = str;
        this.f82888i = j11;
        this.f82889j = i14;
        this.f82890k = z11;
    }

    public /* synthetic */ a(String str, String str2, String str3, int i11, int i12, int i13, String str4, String str5, long j11, int i14, boolean z11, int i15, v vVar) {
        this(str, str2, str3, i11, i12, i13, str4, str5, j11, i14, (i15 & 1024) != 0 ? true : z11);
    }
}
