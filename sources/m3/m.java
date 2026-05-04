package m3;

import j50.d3;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class m {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f71993a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71994b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<m> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71995a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71995a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.ComboReqVo", aVar, 2);
            l2Var.q("gameId", false);
            l2Var.q("comboCount", false);
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
        public final m e(@m80.k i50.f decoder) {
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
            return new m(i12, str, i11, x2Var);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k m value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            m.i(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<m> serializer() {
            return a.f71995a;
        }

        public b() {
        }
    }

    public /* synthetic */ m(int i11, String str, int i12, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f71995a.a());
        }
        this.f71993a = str;
        this.f71994b = i12;
    }

    public static /* synthetic */ m d(m mVar, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = mVar.f71993a;
        }
        if ((i12 & 2) != 0) {
            i11 = mVar.f71994b;
        }
        return mVar.c(str, i11);
    }

    @w00.o
    public static final /* synthetic */ void i(m mVar, i50.e eVar, h50.f fVar) {
        eVar.encodeStringElement(fVar, 0, mVar.f71993a);
        eVar.encodeIntElement(fVar, 1, mVar.f71994b);
    }

    @m80.k
    public final String a() {
        return this.f71993a;
    }

    public final int b() {
        return this.f71994b;
    }

    @m80.k
    public final m c(@m80.k String gameId, int i11) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        return new m(gameId, i11);
    }

    public final int e() {
        return this.f71994b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.g0.g(this.f71993a, mVar.f71993a) && this.f71994b == mVar.f71994b;
    }

    @m80.k
    public final String g() {
        return this.f71993a;
    }

    public int hashCode() {
        return (this.f71993a.hashCode() * 31) + Integer.hashCode(this.f71994b);
    }

    @m80.k
    public String toString() {
        return "ComboReqVo(gameId=" + this.f71993a + ", comboCount=" + this.f71994b + ')';
    }

    public m(@m80.k String gameId, int i11) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        this.f71993a = gameId;
        this.f71994b = i11;
    }

    @f50.z("comboCount")
    public static /* synthetic */ void f() {
    }

    @f50.z("gameId")
    public static /* synthetic */ void h() {
    }
}
