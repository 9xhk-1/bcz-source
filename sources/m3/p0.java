package m3;

import j50.d3;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class p0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f72042a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72043b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<p0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72044a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72044a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.RechargeStarReqVo", aVar, 2);
            l2Var.q("gameId", false);
            l2Var.q("rechargeType", true);
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
            return new f50.i[]{d3.f63348a, j50.z0.f63517a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final p0 e(@m80.k i50.f decoder) {
            String str;
            int i11;
            int i12;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            x2 x2Var = null;
            if (beginStructure.decodeSequentially()) {
                str = beginStructure.decodeStringElement(fVar, 0);
                i11 = beginStructure.decodeIntElement(fVar, 1);
                i12 = 3;
            } else {
                boolean z11 = true;
                int i13 = 0;
                int i14 = 0;
                str = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        str = beginStructure.decodeStringElement(fVar, 0);
                        i14 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        i13 = beginStructure.decodeIntElement(fVar, 1);
                        i14 |= 2;
                    }
                }
                i11 = i13;
                i12 = i14;
            }
            beginStructure.endStructure(fVar);
            return new p0(i12, str, i11, x2Var);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k p0 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            p0.i(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<p0> serializer() {
            return a.f72044a;
        }

        public b() {
        }
    }

    public /* synthetic */ p0(int i11, String str, int i12, x2 x2Var) {
        if (1 != (i11 & 1)) {
            j50.h2.b(i11, 1, a.f72044a.a());
        }
        this.f72042a = str;
        if ((i11 & 2) == 0) {
            this.f72043b = 1;
        } else {
            this.f72043b = i12;
        }
    }

    public static /* synthetic */ p0 d(p0 p0Var, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = p0Var.f72042a;
        }
        if ((i12 & 2) != 0) {
            i11 = p0Var.f72043b;
        }
        return p0Var.c(str, i11);
    }

    @w00.o
    public static final /* synthetic */ void i(p0 p0Var, i50.e eVar, h50.f fVar) {
        eVar.encodeStringElement(fVar, 0, p0Var.f72042a);
        if (!eVar.shouldEncodeElementDefault(fVar, 1) && p0Var.f72043b == 1) {
            return;
        }
        eVar.encodeIntElement(fVar, 1, p0Var.f72043b);
    }

    @m80.k
    public final String a() {
        return this.f72042a;
    }

    public final int b() {
        return this.f72043b;
    }

    @m80.k
    public final p0 c(@m80.k String gameId, int i11) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        return new p0(gameId, i11);
    }

    @m80.k
    public final String e() {
        return this.f72042a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return kotlin.jvm.internal.g0.g(this.f72042a, p0Var.f72042a) && this.f72043b == p0Var.f72043b;
    }

    public final int g() {
        return this.f72043b;
    }

    public int hashCode() {
        return (this.f72042a.hashCode() * 31) + Integer.hashCode(this.f72043b);
    }

    @m80.k
    public String toString() {
        return "RechargeStarReqVo(gameId=" + this.f72042a + ", rechargeType=" + this.f72043b + ')';
    }

    public p0(@m80.k String gameId, int i11) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        this.f72042a = gameId;
        this.f72043b = i11;
    }

    public /* synthetic */ p0(String str, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(str, (i12 & 2) != 0 ? 1 : i11);
    }

    @f50.z("gameId")
    public static /* synthetic */ void f() {
    }

    @f50.z("rechargeType")
    public static /* synthetic */ void h() {
    }
}
