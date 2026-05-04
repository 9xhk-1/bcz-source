package m3;

import j50.d3;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class n {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f71999a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72000b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f72001c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<n> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72002a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72002a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.EnableSpellReqVo", aVar, 3);
            l2Var.q("gameId", false);
            l2Var.q("bookId", false);
            l2Var.q(k3.u0.f65628b, false);
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
            return new f50.i[]{d3.f63348a, j50.z0.f63517a, j50.i.f63378a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final n e(@m80.k i50.f decoder) {
            String str;
            boolean z11;
            int i11;
            int i12;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                str = beginStructure.decodeStringElement(fVar, 0);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                z11 = beginStructure.decodeBooleanElement(fVar, 2);
                i11 = decodeIntElement;
                i12 = 7;
            } else {
                str = null;
                boolean z12 = true;
                boolean z13 = false;
                int i13 = 0;
                int i14 = 0;
                while (z12) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z12 = false;
                    } else if (decodeElementIndex == 0) {
                        str = beginStructure.decodeStringElement(fVar, 0);
                        i14 |= 1;
                    } else if (decodeElementIndex == 1) {
                        i13 = beginStructure.decodeIntElement(fVar, 1);
                        i14 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        z13 = beginStructure.decodeBooleanElement(fVar, 2);
                        i14 |= 4;
                    }
                }
                z11 = z13;
                i11 = i13;
                i12 = i14;
            }
            String str2 = str;
            beginStructure.endStructure(fVar);
            return new n(i12, str2, i11, z11, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k n value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            n.l(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<n> serializer() {
            return a.f72002a;
        }

        public b() {
        }
    }

    public /* synthetic */ n(int i11, String str, int i12, boolean z11, x2 x2Var) {
        if (7 != (i11 & 7)) {
            j50.h2.b(i11, 7, a.f72002a.a());
        }
        this.f71999a = str;
        this.f72000b = i12;
        this.f72001c = z11;
    }

    public static /* synthetic */ n e(n nVar, String str, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = nVar.f71999a;
        }
        if ((i12 & 2) != 0) {
            i11 = nVar.f72000b;
        }
        if ((i12 & 4) != 0) {
            z11 = nVar.f72001c;
        }
        return nVar.d(str, i11, z11);
    }

    @w00.o
    public static final /* synthetic */ void l(n nVar, i50.e eVar, h50.f fVar) {
        eVar.encodeStringElement(fVar, 0, nVar.f71999a);
        eVar.encodeIntElement(fVar, 1, nVar.f72000b);
        eVar.encodeBooleanElement(fVar, 2, nVar.f72001c);
    }

    @m80.k
    public final String a() {
        return this.f71999a;
    }

    public final int b() {
        return this.f72000b;
    }

    public final boolean c() {
        return this.f72001c;
    }

    @m80.k
    public final n d(@m80.k String gameId, int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        return new n(gameId, i11, z11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.g0.g(this.f71999a, nVar.f71999a) && this.f72000b == nVar.f72000b && this.f72001c == nVar.f72001c;
    }

    public final int f() {
        return this.f72000b;
    }

    public final boolean h() {
        return this.f72001c;
    }

    public int hashCode() {
        return (((this.f71999a.hashCode() * 31) + Integer.hashCode(this.f72000b)) * 31) + Boolean.hashCode(this.f72001c);
    }

    @m80.k
    public final String j() {
        return this.f71999a;
    }

    @m80.k
    public String toString() {
        return "EnableSpellReqVo(gameId=" + this.f71999a + ", bookId=" + this.f72000b + ", enable=" + this.f72001c + ')';
    }

    public n(@m80.k String gameId, int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        this.f71999a = gameId;
        this.f72000b = i11;
        this.f72001c = z11;
    }

    @f50.z("bookId")
    public static /* synthetic */ void g() {
    }

    @f50.z(k3.u0.f65628b)
    public static /* synthetic */ void i() {
    }

    @f50.z("gameId")
    public static /* synthetic */ void k() {
    }
}
