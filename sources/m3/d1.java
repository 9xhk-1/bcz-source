package m3;

import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class d1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f71888a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71889b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<d1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71890a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71890a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.StartGameVo", aVar, 2);
            l2Var.q("gameType", false);
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
            j50.z0 z0Var = j50.z0.f63517a;
            return new f50.i[]{z0Var, z0Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final d1 e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                i12 = beginStructure.decodeIntElement(fVar, 1);
                i13 = 3;
            } else {
                boolean z11 = true;
                i11 = 0;
                int i14 = 0;
                int i15 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i15 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        i14 = beginStructure.decodeIntElement(fVar, 1);
                        i15 |= 2;
                    }
                }
                i12 = i14;
                i13 = i15;
            }
            beginStructure.endStructure(fVar);
            return new d1(i13, i11, i12, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k d1 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            d1.i(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<d1> serializer() {
            return a.f71890a;
        }

        public b() {
        }
    }

    public d1(int i11, int i12) {
        this.f71888a = i11;
        this.f71889b = i12;
    }

    public static /* synthetic */ d1 d(d1 d1Var, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = d1Var.f71888a;
        }
        if ((i13 & 2) != 0) {
            i12 = d1Var.f71889b;
        }
        return d1Var.c(i11, i12);
    }

    @w00.o
    public static final /* synthetic */ void i(d1 d1Var, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, d1Var.f71888a);
        eVar.encodeIntElement(fVar, 1, d1Var.f71889b);
    }

    public final int a() {
        return this.f71888a;
    }

    public final int b() {
        return this.f71889b;
    }

    @m80.k
    public final d1 c(int i11, int i12) {
        return new d1(i11, i12);
    }

    public final int e() {
        return this.f71889b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.f71888a == d1Var.f71888a && this.f71889b == d1Var.f71889b;
    }

    public final int g() {
        return this.f71888a;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f71888a) * 31) + Integer.hashCode(this.f71889b);
    }

    @m80.k
    public String toString() {
        return "StartGameVo(gameType=" + this.f71888a + ", enterDay=" + this.f71889b + ')';
    }

    public /* synthetic */ d1(int i11, int i12, int i13, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f71890a.a());
        }
        this.f71888a = i12;
        this.f71889b = i13;
    }

    @f50.z("enterDay")
    public static /* synthetic */ void f() {
    }

    @f50.z("gameType")
    public static /* synthetic */ void h() {
    }
}
