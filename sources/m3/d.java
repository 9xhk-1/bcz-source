package m3;

import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class d {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f71884a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<d> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71885a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71885a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.CheckNextLevelReqVo", aVar, 1);
            l2Var.q("enterDay", false);
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
        public final d e(@m80.k i50.f decoder) {
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
            return new d(i12, i11, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k d value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            d.f(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<d> serializer() {
            return a.f71885a;
        }

        public b() {
        }
    }

    public d(int i11) {
        this.f71884a = i11;
    }

    public static /* synthetic */ d c(d dVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = dVar.f71884a;
        }
        return dVar.b(i11);
    }

    @w00.o
    public static final /* synthetic */ void f(d dVar, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, dVar.f71884a);
    }

    public final int a() {
        return this.f71884a;
    }

    @m80.k
    public final d b(int i11) {
        return new d(i11);
    }

    public final int d() {
        return this.f71884a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f71884a == ((d) obj).f71884a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f71884a);
    }

    @m80.k
    public String toString() {
        return "CheckNextLevelReqVo(enterDay=" + this.f71884a + ')';
    }

    public /* synthetic */ d(int i11, int i12, x2 x2Var) {
        if (1 != (i11 & 1)) {
            j50.h2.b(i11, 1, a.f71885a.a());
        }
        this.f71884a = i12;
    }

    @f50.z("enterDay")
    public static /* synthetic */ void e() {
    }
}
