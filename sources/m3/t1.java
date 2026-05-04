package m3;

import j50.d3;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;
import m3.b0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class t1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f72079a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final b0 f72080b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<t1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72081a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72081a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.SyncBehaviorReqVo", aVar, 2);
            l2Var.q("gameId", false);
            l2Var.q("behavior", false);
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
            return new f50.i[]{d3.f63348a, b0.a.f71858a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final t1 e(@m80.k i50.f decoder) {
            String str;
            b0 b0Var;
            int i11;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            x2 x2Var = null;
            if (beginStructure.decodeSequentially()) {
                str = beginStructure.decodeStringElement(fVar, 0);
                b0Var = (b0) beginStructure.decodeSerializableElement(fVar, 1, b0.a.f71858a, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                str = null;
                b0 b0Var2 = null;
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
                        b0Var2 = (b0) beginStructure.decodeSerializableElement(fVar, 1, b0.a.f71858a, b0Var2);
                        i12 |= 2;
                    }
                }
                b0Var = b0Var2;
                i11 = i12;
            }
            beginStructure.endStructure(fVar);
            return new t1(i11, str, b0Var, x2Var);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k t1 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            t1.i(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<t1> serializer() {
            return a.f72081a;
        }

        public b() {
        }
    }

    public /* synthetic */ t1(int i11, String str, b0 b0Var, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f72081a.a());
        }
        this.f72079a = str;
        this.f72080b = b0Var;
    }

    public static /* synthetic */ t1 d(t1 t1Var, String str, b0 b0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = t1Var.f72079a;
        }
        if ((i11 & 2) != 0) {
            b0Var = t1Var.f72080b;
        }
        return t1Var.c(str, b0Var);
    }

    @w00.o
    public static final /* synthetic */ void i(t1 t1Var, i50.e eVar, h50.f fVar) {
        eVar.encodeStringElement(fVar, 0, t1Var.f72079a);
        eVar.encodeSerializableElement(fVar, 1, b0.a.f71858a, t1Var.f72080b);
    }

    @m80.k
    public final String a() {
        return this.f72079a;
    }

    @m80.k
    public final b0 b() {
        return this.f72080b;
    }

    @m80.k
    public final t1 c(@m80.k String gameId, @m80.k b0 behavior) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        kotlin.jvm.internal.g0.p(behavior, "behavior");
        return new t1(gameId, behavior);
    }

    @m80.k
    public final b0 e() {
        return this.f72080b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return kotlin.jvm.internal.g0.g(this.f72079a, t1Var.f72079a) && kotlin.jvm.internal.g0.g(this.f72080b, t1Var.f72080b);
    }

    @m80.k
    public final String g() {
        return this.f72079a;
    }

    public int hashCode() {
        return (this.f72079a.hashCode() * 31) + this.f72080b.hashCode();
    }

    @m80.k
    public String toString() {
        return "SyncBehaviorReqVo(gameId=" + this.f72079a + ", behavior=" + this.f72080b + ')';
    }

    public t1(@m80.k String gameId, @m80.k b0 behavior) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        kotlin.jvm.internal.g0.p(behavior, "behavior");
        this.f72079a = gameId;
        this.f72080b = behavior;
    }

    @f50.z("behavior")
    public static /* synthetic */ void f() {
    }

    @f50.z("gameId")
    public static /* synthetic */ void h() {
    }
}
