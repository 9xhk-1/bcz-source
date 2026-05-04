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
import s7.a;
import w00.o;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0
/* loaded from: classes3.dex */
public final class c {

    @k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f88072a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final s7.a f88073b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f88074c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f88075d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements p0<c> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f88076a;

        @k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f88076a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.userinfo.local.UserInfoRecord", aVar, 4);
            l2Var.q("birthday", false);
            l2Var.q("educationInfo", false);
            l2Var.q("position", false);
            l2Var.q("ipDesc", false);
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
            i<?> v11 = g50.a.v(a.C1152a.f88071a);
            d3 d3Var = d3.f63348a;
            return new i[]{z0.f63517a, v11, d3Var, d3Var};
        }

        @Override // f50.e
        @k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final c e(@k i50.f decoder) {
            int i11;
            int i12;
            s7.a aVar;
            String str;
            String str2;
            g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                s7.a aVar2 = (s7.a) beginStructure.decodeNullableSerializableElement(fVar, 1, a.C1152a.f88071a, null);
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 2);
                str2 = beginStructure.decodeStringElement(fVar, 3);
                str = decodeStringElement;
                aVar = aVar2;
                i12 = 15;
            } else {
                boolean z11 = true;
                i11 = 0;
                s7.a aVar3 = null;
                String str3 = null;
                String str4 = null;
                int i13 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i13 |= 1;
                    } else if (decodeElementIndex == 1) {
                        aVar3 = (s7.a) beginStructure.decodeNullableSerializableElement(fVar, 1, a.C1152a.f88071a, aVar3);
                        i13 |= 2;
                    } else if (decodeElementIndex == 2) {
                        str3 = beginStructure.decodeStringElement(fVar, 2);
                        i13 |= 4;
                    } else {
                        if (decodeElementIndex != 3) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        str4 = beginStructure.decodeStringElement(fVar, 3);
                        i13 |= 8;
                    }
                }
                i12 = i13;
                aVar = aVar3;
                str = str3;
                str2 = str4;
            }
            int i14 = i11;
            beginStructure.endStructure(fVar);
            return new c(i12, i14, aVar, str, str2, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@k h encoder, @k c value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            c.k(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @k
        public final i<c> serializer() {
            return a.f88076a;
        }

        public b() {
        }
    }

    public /* synthetic */ c(int i11, int i12, s7.a aVar, String str, String str2, x2 x2Var) {
        if (15 != (i11 & 15)) {
            h2.b(i11, 15, a.f88076a.a());
        }
        this.f88072a = i12;
        this.f88073b = aVar;
        this.f88074c = str;
        this.f88075d = str2;
    }

    public static /* synthetic */ c f(c cVar, int i11, s7.a aVar, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = cVar.f88072a;
        }
        if ((i12 & 2) != 0) {
            aVar = cVar.f88073b;
        }
        if ((i12 & 4) != 0) {
            str = cVar.f88074c;
        }
        if ((i12 & 8) != 0) {
            str2 = cVar.f88075d;
        }
        return cVar.e(i11, aVar, str, str2);
    }

    @o
    public static final /* synthetic */ void k(c cVar, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, cVar.f88072a);
        eVar.encodeNullableSerializableElement(fVar, 1, a.C1152a.f88071a, cVar.f88073b);
        eVar.encodeStringElement(fVar, 2, cVar.f88074c);
        eVar.encodeStringElement(fVar, 3, cVar.f88075d);
    }

    public final int a() {
        return this.f88072a;
    }

    @l
    public final s7.a b() {
        return this.f88073b;
    }

    @k
    public final String c() {
        return this.f88074c;
    }

    @k
    public final String d() {
        return this.f88075d;
    }

    @k
    public final c e(int i11, @l s7.a aVar, @k String position, @k String ipDesc) {
        g0.p(position, "position");
        g0.p(ipDesc, "ipDesc");
        return new c(i11, aVar, position, ipDesc);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f88072a == cVar.f88072a && g0.g(this.f88073b, cVar.f88073b) && g0.g(this.f88074c, cVar.f88074c) && g0.g(this.f88075d, cVar.f88075d);
    }

    public final int g() {
        return this.f88072a;
    }

    @l
    public final s7.a h() {
        return this.f88073b;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f88072a) * 31;
        s7.a aVar = this.f88073b;
        return ((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f88074c.hashCode()) * 31) + this.f88075d.hashCode();
    }

    @k
    public final String i() {
        return this.f88075d;
    }

    @k
    public final String j() {
        return this.f88074c;
    }

    @k
    public String toString() {
        return "UserInfoRecord(birthday=" + this.f88072a + ", educationInfo=" + this.f88073b + ", position=" + this.f88074c + ", ipDesc=" + this.f88075d + ')';
    }

    public c(int i11, @l s7.a aVar, @k String position, @k String ipDesc) {
        g0.p(position, "position");
        g0.p(ipDesc, "ipDesc");
        this.f88072a = i11;
        this.f88073b = aVar;
        this.f88074c = position;
        this.f88075d = ipDesc;
    }
}
