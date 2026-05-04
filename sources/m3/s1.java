package m3;

import j50.d3;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;
import m3.a0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class s1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f72072a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final a0 f72073b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<s1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72074a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72074a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.SyncBehaviorModel", aVar, 2);
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
            return new f50.i[]{d3.f63348a, a0.a.f71838a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final s1 e(@m80.k i50.f decoder) {
            String str;
            a0 a0Var;
            int i11;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            x2 x2Var = null;
            if (beginStructure.decodeSequentially()) {
                str = beginStructure.decodeStringElement(fVar, 0);
                a0Var = (a0) beginStructure.decodeSerializableElement(fVar, 1, a0.a.f71838a, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                str = null;
                a0 a0Var2 = null;
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
                        a0Var2 = (a0) beginStructure.decodeSerializableElement(fVar, 1, a0.a.f71838a, a0Var2);
                        i12 |= 2;
                    }
                }
                a0Var = a0Var2;
                i11 = i12;
            }
            beginStructure.endStructure(fVar);
            return new s1(i11, str, a0Var, x2Var);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k s1 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            s1.i(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<s1> serializer() {
            return a.f72074a;
        }

        public b() {
        }
    }

    public /* synthetic */ s1(int i11, String str, a0 a0Var, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f72074a.a());
        }
        this.f72072a = str;
        this.f72073b = a0Var;
    }

    public static /* synthetic */ s1 d(s1 s1Var, String str, a0 a0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = s1Var.f72072a;
        }
        if ((i11 & 2) != 0) {
            a0Var = s1Var.f72073b;
        }
        return s1Var.c(str, a0Var);
    }

    @w00.o
    public static final /* synthetic */ void i(s1 s1Var, i50.e eVar, h50.f fVar) {
        eVar.encodeStringElement(fVar, 0, s1Var.f72072a);
        eVar.encodeSerializableElement(fVar, 1, a0.a.f71838a, s1Var.f72073b);
    }

    @m80.k
    public final String a() {
        return this.f72072a;
    }

    @m80.k
    public final a0 b() {
        return this.f72073b;
    }

    @m80.k
    public final s1 c(@m80.k String gameId, @m80.k a0 behavior) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        kotlin.jvm.internal.g0.p(behavior, "behavior");
        return new s1(gameId, behavior);
    }

    @m80.k
    public final a0 e() {
        return this.f72073b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return kotlin.jvm.internal.g0.g(this.f72072a, s1Var.f72072a) && kotlin.jvm.internal.g0.g(this.f72073b, s1Var.f72073b);
    }

    @m80.k
    public final String g() {
        return this.f72072a;
    }

    public int hashCode() {
        return (this.f72072a.hashCode() * 31) + this.f72073b.hashCode();
    }

    @m80.k
    public String toString() {
        return "SyncBehaviorModel(gameId=" + this.f72072a + ", behavior=" + this.f72073b + ')';
    }

    public s1(@m80.k String gameId, @m80.k a0 behavior) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        kotlin.jvm.internal.g0.p(behavior, "behavior");
        this.f72072a = gameId;
        this.f72073b = behavior;
    }

    @f50.z("behavior")
    public static /* synthetic */ void f() {
    }

    @f50.z("gameId")
    public static /* synthetic */ void h() {
    }
}
