package s7;

import f50.a0;
import f50.i;
import i50.h;
import j50.d3;
import j50.h2;
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
import w00.o;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0
/* loaded from: classes3.dex */
public final class a {

    @k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f88064a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f88065b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f88066c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f88067d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f88068e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f88069f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Boolean f88070g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    /* renamed from: s7.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1152a implements p0<a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1152a f88071a;

        @k
        private static final h50.f descriptor;

        static {
            C1152a c1152a = new C1152a();
            f88071a = c1152a;
            l2 l2Var = new l2("com.baicizhan.app.biz.userinfo.local.EducationInfo", c1152a, 7);
            l2Var.q("schoolId", false);
            l2Var.q("schoolName", false);
            l2Var.q("schoolYear", false);
            l2Var.q("majorId", false);
            l2Var.q("majorName", false);
            l2Var.q("schoolBg", false);
            l2Var.q("isUniversity", false);
            descriptor = l2Var;
        }

        @Override // f50.i, f50.b0, f50.e
        @k
        public final h50.f a() {
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
            z0 z0Var = z0.f63517a;
            d3 d3Var = d3.f63348a;
            return new i[]{z0Var, d3Var, g50.a.v(z0Var), g50.a.v(z0Var), g50.a.v(d3Var), g50.a.v(z0Var), g50.a.v(j50.i.f63378a)};
        }

        @Override // f50.e
        @k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final a e(@k i50.f decoder) {
            int i11;
            Boolean bool;
            int i12;
            String str;
            Integer num;
            Integer num2;
            String str2;
            Integer num3;
            g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                z0 z0Var = z0.f63517a;
                Integer num4 = (Integer) beginStructure.decodeNullableSerializableElement(fVar, 2, z0Var, null);
                Integer num5 = (Integer) beginStructure.decodeNullableSerializableElement(fVar, 3, z0Var, null);
                String str3 = (String) beginStructure.decodeNullableSerializableElement(fVar, 4, d3.f63348a, null);
                Integer num6 = (Integer) beginStructure.decodeNullableSerializableElement(fVar, 5, z0Var, null);
                bool = (Boolean) beginStructure.decodeNullableSerializableElement(fVar, 6, j50.i.f63378a, null);
                num3 = num6;
                num2 = num5;
                str2 = str3;
                num = num4;
                str = decodeStringElement;
                i12 = 127;
            } else {
                boolean z11 = true;
                i11 = 0;
                String str4 = null;
                Integer num7 = null;
                Integer num8 = null;
                String str5 = null;
                Integer num9 = null;
                int i13 = 0;
                Boolean bool2 = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z11 = false;
                            break;
                        case 0:
                            i13 |= 1;
                            i11 = beginStructure.decodeIntElement(fVar, 0);
                            continue;
                        case 1:
                            str4 = beginStructure.decodeStringElement(fVar, 1);
                            i13 |= 2;
                            continue;
                        case 2:
                            num7 = (Integer) beginStructure.decodeNullableSerializableElement(fVar, 2, z0.f63517a, num7);
                            i13 |= 4;
                            break;
                        case 3:
                            num8 = (Integer) beginStructure.decodeNullableSerializableElement(fVar, 3, z0.f63517a, num8);
                            i13 |= 8;
                            break;
                        case 4:
                            str5 = (String) beginStructure.decodeNullableSerializableElement(fVar, 4, d3.f63348a, str5);
                            i13 |= 16;
                            break;
                        case 5:
                            num9 = (Integer) beginStructure.decodeNullableSerializableElement(fVar, 5, z0.f63517a, num9);
                            i13 |= 32;
                            break;
                        case 6:
                            bool2 = (Boolean) beginStructure.decodeNullableSerializableElement(fVar, 6, j50.i.f63378a, bool2);
                            i13 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                bool = bool2;
                i12 = i13;
                str = str4;
                num = num7;
                num2 = num8;
                str2 = str5;
                num3 = num9;
            }
            int i14 = i11;
            beginStructure.endStructure(fVar);
            return new a(i12, i14, str, num, num2, str2, num3, bool, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@k h encoder, @k a value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            a.q(value, beginStructure, fVar);
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
            return C1152a.f88071a;
        }

        public b() {
        }
    }

    public /* synthetic */ a(int i11, int i12, String str, Integer num, Integer num2, String str2, Integer num3, Boolean bool, x2 x2Var) {
        if (127 != (i11 & 127)) {
            h2.b(i11, 127, C1152a.f88071a.a());
        }
        this.f88064a = i12;
        this.f88065b = str;
        this.f88066c = num;
        this.f88067d = num2;
        this.f88068e = str2;
        this.f88069f = num3;
        this.f88070g = bool;
    }

    public static /* synthetic */ a i(a aVar, int i11, String str, Integer num, Integer num2, String str2, Integer num3, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = aVar.f88064a;
        }
        if ((i12 & 2) != 0) {
            str = aVar.f88065b;
        }
        if ((i12 & 4) != 0) {
            num = aVar.f88066c;
        }
        if ((i12 & 8) != 0) {
            num2 = aVar.f88067d;
        }
        if ((i12 & 16) != 0) {
            str2 = aVar.f88068e;
        }
        if ((i12 & 32) != 0) {
            num3 = aVar.f88069f;
        }
        if ((i12 & 64) != 0) {
            bool = aVar.f88070g;
        }
        Integer num4 = num3;
        Boolean bool2 = bool;
        String str3 = str2;
        Integer num5 = num;
        return aVar.h(i11, str, num5, num2, str3, num4, bool2);
    }

    @o
    public static final /* synthetic */ void q(a aVar, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, aVar.f88064a);
        eVar.encodeStringElement(fVar, 1, aVar.f88065b);
        z0 z0Var = z0.f63517a;
        eVar.encodeNullableSerializableElement(fVar, 2, z0Var, aVar.f88066c);
        eVar.encodeNullableSerializableElement(fVar, 3, z0Var, aVar.f88067d);
        eVar.encodeNullableSerializableElement(fVar, 4, d3.f63348a, aVar.f88068e);
        eVar.encodeNullableSerializableElement(fVar, 5, z0Var, aVar.f88069f);
        eVar.encodeNullableSerializableElement(fVar, 6, j50.i.f63378a, aVar.f88070g);
    }

    public final int a() {
        return this.f88064a;
    }

    @k
    public final String b() {
        return this.f88065b;
    }

    @l
    public final Integer c() {
        return this.f88066c;
    }

    @l
    public final Integer d() {
        return this.f88067d;
    }

    @l
    public final String e() {
        return this.f88068e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f88064a == aVar.f88064a && g0.g(this.f88065b, aVar.f88065b) && g0.g(this.f88066c, aVar.f88066c) && g0.g(this.f88067d, aVar.f88067d) && g0.g(this.f88068e, aVar.f88068e) && g0.g(this.f88069f, aVar.f88069f) && g0.g(this.f88070g, aVar.f88070g);
    }

    @l
    public final Integer f() {
        return this.f88069f;
    }

    @l
    public final Boolean g() {
        return this.f88070g;
    }

    @k
    public final a h(int i11, @k String schoolName, @l Integer num, @l Integer num2, @l String str, @l Integer num3, @l Boolean bool) {
        g0.p(schoolName, "schoolName");
        return new a(i11, schoolName, num, num2, str, num3, bool);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f88064a) * 31) + this.f88065b.hashCode()) * 31;
        Integer num = this.f88066c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f88067d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f88068e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.f88069f;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.f88070g;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    @l
    public final Integer j() {
        return this.f88067d;
    }

    @l
    public final String k() {
        return this.f88068e;
    }

    @l
    public final Integer l() {
        return this.f88069f;
    }

    public final int m() {
        return this.f88064a;
    }

    @k
    public final String n() {
        return this.f88065b;
    }

    @l
    public final Integer o() {
        return this.f88066c;
    }

    @l
    public final Boolean p() {
        return this.f88070g;
    }

    @k
    public String toString() {
        return "EducationInfo(schoolId=" + this.f88064a + ", schoolName=" + this.f88065b + ", schoolYear=" + this.f88066c + ", majorId=" + this.f88067d + ", majorName=" + this.f88068e + ", schoolBg=" + this.f88069f + ", isUniversity=" + this.f88070g + ')';
    }

    public a(int i11, @k String schoolName, @l Integer num, @l Integer num2, @l String str, @l Integer num3, @l Boolean bool) {
        g0.p(schoolName, "schoolName");
        this.f88064a = i11;
        this.f88065b = schoolName;
        this.f88066c = num;
        this.f88067d = num2;
        this.f88068e = str;
        this.f88069f = num3;
        this.f88070g = bool;
    }
}
