package m3;

import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class r {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f72058a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<r> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72059a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72059a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.GetCurrentGameReqVo", aVar, 1);
            l2Var.q("gameType", false);
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
            return new f50.i[]{j50.z0.f63517a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final r e(@m80.k i50.f decoder) {
            int i11;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            int i12 = 1;
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
            } else {
                boolean z11 = true;
                i11 = 0;
                int i13 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else {
                        if (decodeElementIndex != 0) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i13 = 1;
                    }
                }
                i12 = i13;
            }
            beginStructure.endStructure(fVar);
            return new r(i12, i11, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k r value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            r.f(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<r> serializer() {
            return a.f72059a;
        }

        public b() {
        }
    }

    public r(int i11) {
        this.f72058a = i11;
    }

    public static /* synthetic */ r c(r rVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = rVar.f72058a;
        }
        return rVar.b(i11);
    }

    @w00.o
    public static final /* synthetic */ void f(r rVar, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, rVar.f72058a);
    }

    public final int a() {
        return this.f72058a;
    }

    @m80.k
    public final r b(int i11) {
        return new r(i11);
    }

    public final int d() {
        return this.f72058a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f72058a == ((r) obj).f72058a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f72058a);
    }

    @m80.k
    public String toString() {
        return "GetCurrentGameReqVo(gameType=" + this.f72058a + ')';
    }

    public /* synthetic */ r(int i11, int i12, x2 x2Var) {
        if (1 != (i11 & 1)) {
            j50.h2.b(i11, 1, a.f72059a.a());
        }
        this.f72058a = i12;
    }

    @f50.z("gameType")
    public static /* synthetic */ void e() {
    }
}
