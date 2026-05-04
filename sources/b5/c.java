package b5;

import j50.d3;
import j50.l2;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class c implements c1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f5792a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final String f5793b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final c1 f5794c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<c> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5795a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5795a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.game.impl.unity.command.ApiRsp", aVar, 3);
            l2Var.q("code", false);
            l2Var.q("errorMsg", true);
            l2Var.q("data", true);
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
            return new f50.i[]{j50.z0.f63517a, g50.a.v(d3.f63348a), g50.a.v(c5.b.f8021a)};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final c e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            String str;
            c1 c1Var;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                String str2 = (String) beginStructure.decodeNullableSerializableElement(fVar, 1, d3.f63348a, null);
                c1Var = (c1) beginStructure.decodeNullableSerializableElement(fVar, 2, c5.b.f8021a, null);
                str = str2;
                i12 = 7;
            } else {
                boolean z11 = true;
                i11 = 0;
                String str3 = null;
                c1 c1Var2 = null;
                int i13 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i13 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str3 = (String) beginStructure.decodeNullableSerializableElement(fVar, 1, d3.f63348a, str3);
                        i13 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        c1Var2 = (c1) beginStructure.decodeNullableSerializableElement(fVar, 2, c5.b.f8021a, c1Var2);
                        i13 |= 4;
                    }
                }
                i12 = i13;
                str = str3;
                c1Var = c1Var2;
            }
            int i14 = i11;
            beginStructure.endStructure(fVar);
            return new c(i12, i14, str, c1Var, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k c value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            c.l(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<c> serializer() {
            return a.f5795a;
        }

        public b() {
        }
    }

    public /* synthetic */ c(int i11, int i12, String str, c1 c1Var, x2 x2Var) {
        if (1 != (i11 & 1)) {
            j50.h2.b(i11, 1, a.f5795a.a());
        }
        this.f5792a = i12;
        if ((i11 & 2) == 0) {
            this.f5793b = null;
        } else {
            this.f5793b = str;
        }
        if ((i11 & 4) == 0) {
            this.f5794c = null;
        } else {
            this.f5794c = c1Var;
        }
    }

    public static /* synthetic */ c e(c cVar, int i11, String str, c1 c1Var, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = cVar.f5792a;
        }
        if ((i12 & 2) != 0) {
            str = cVar.f5793b;
        }
        if ((i12 & 4) != 0) {
            c1Var = cVar.f5794c;
        }
        return cVar.d(i11, str, c1Var);
    }

    @w00.o
    public static final /* synthetic */ void l(c cVar, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, cVar.f5792a);
        if (eVar.shouldEncodeElementDefault(fVar, 1) || cVar.f5793b != null) {
            eVar.encodeNullableSerializableElement(fVar, 1, d3.f63348a, cVar.f5793b);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 2) && cVar.f5794c == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(fVar, 2, c5.b.f8021a, cVar.f5794c);
    }

    public final int a() {
        return this.f5792a;
    }

    @m80.l
    public final String b() {
        return this.f5793b;
    }

    @m80.l
    public final c1 c() {
        return this.f5794c;
    }

    @m80.k
    public final c d(int i11, @m80.l String str, @m80.l c1 c1Var) {
        return new c(i11, str, c1Var);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f5792a == cVar.f5792a && kotlin.jvm.internal.g0.g(this.f5793b, cVar.f5793b) && kotlin.jvm.internal.g0.g(this.f5794c, cVar.f5794c);
    }

    public final int f() {
        return this.f5792a;
    }

    @m80.l
    public final c1 h() {
        return this.f5794c;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f5792a) * 31;
        String str = this.f5793b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        c1 c1Var = this.f5794c;
        return hashCode2 + (c1Var != null ? c1Var.hashCode() : 0);
    }

    @m80.l
    public final String j() {
        return this.f5793b;
    }

    @m80.k
    public String toString() {
        return "ApiRsp(code=" + this.f5792a + ", errorMsg=" + this.f5793b + ", data=" + this.f5794c + ')';
    }

    public c(int i11, @m80.l String str, @m80.l c1 c1Var) {
        this.f5792a = i11;
        this.f5793b = str;
        this.f5794c = c1Var;
    }

    public /* synthetic */ c(int i11, String str, c1 c1Var, int i12, kotlin.jvm.internal.v vVar) {
        this(i11, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : c1Var);
    }

    @f50.z("code")
    public static /* synthetic */ void g() {
    }

    @f50.a0(with = c5.b.class)
    @f50.z("data")
    public static /* synthetic */ void i() {
    }

    @f50.z("errorMsg")
    public static /* synthetic */ void k() {
    }
}
