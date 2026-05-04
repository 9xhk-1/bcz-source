package m3;

import j50.d3;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class u1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f72089a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f72090b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<u1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72091a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72091a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.SyncStateVo", aVar, 2);
            l2Var.q("gameId", false);
            l2Var.q("state", false);
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
            d3 d3Var = d3.f63348a;
            return new f50.i[]{d3Var, d3Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final u1 e(@m80.k i50.f decoder) {
            String str;
            String str2;
            int i11;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            x2 x2Var = null;
            if (beginStructure.decodeSequentially()) {
                str = beginStructure.decodeStringElement(fVar, 0);
                str2 = beginStructure.decodeStringElement(fVar, 1);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                str = null;
                String str3 = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        str = beginStructure.decodeStringElement(fVar, 0);
                        i12 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        str3 = beginStructure.decodeStringElement(fVar, 1);
                        i12 |= 2;
                    }
                }
                str2 = str3;
                i11 = i12;
            }
            beginStructure.endStructure(fVar);
            return new u1(i11, str, str2, x2Var);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k u1 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            u1.i(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<u1> serializer() {
            return a.f72091a;
        }

        public b() {
        }
    }

    public /* synthetic */ u1(int i11, String str, String str2, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f72091a.a());
        }
        this.f72089a = str;
        this.f72090b = str2;
    }

    public static /* synthetic */ u1 d(u1 u1Var, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = u1Var.f72089a;
        }
        if ((i11 & 2) != 0) {
            str2 = u1Var.f72090b;
        }
        return u1Var.c(str, str2);
    }

    @w00.o
    public static final /* synthetic */ void i(u1 u1Var, i50.e eVar, h50.f fVar) {
        eVar.encodeStringElement(fVar, 0, u1Var.f72089a);
        eVar.encodeStringElement(fVar, 1, u1Var.f72090b);
    }

    @m80.k
    public final String a() {
        return this.f72089a;
    }

    @m80.k
    public final String b() {
        return this.f72090b;
    }

    @m80.k
    public final u1 c(@m80.k String gameId, @m80.k String state) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        kotlin.jvm.internal.g0.p(state, "state");
        return new u1(gameId, state);
    }

    @m80.k
    public final String e() {
        return this.f72089a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return kotlin.jvm.internal.g0.g(this.f72089a, u1Var.f72089a) && kotlin.jvm.internal.g0.g(this.f72090b, u1Var.f72090b);
    }

    @m80.k
    public final String g() {
        return this.f72090b;
    }

    public int hashCode() {
        return (this.f72089a.hashCode() * 31) + this.f72090b.hashCode();
    }

    @m80.k
    public String toString() {
        return "SyncStateVo(gameId=" + this.f72089a + ", state=" + this.f72090b + ')';
    }

    public u1(@m80.k String gameId, @m80.k String state) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        kotlin.jvm.internal.g0.p(state, "state");
        this.f72089a = gameId;
        this.f72090b = state;
    }

    @f50.z("gameId")
    public static /* synthetic */ void f() {
    }

    @f50.z("state")
    public static /* synthetic */ void h() {
    }
}
