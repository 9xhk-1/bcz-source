package m3;

import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class c2 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f71881a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71882b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<c2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71883a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71883a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.WinningStreakReqVo", aVar, 2);
            l2Var.q("topicId", false);
            l2Var.q(ma.b.N, false);
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
        public final c2 e(@m80.k i50.f decoder) {
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
            return new c2(i13, i11, i12, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k c2 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            c2.i(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<c2> serializer() {
            return a.f71883a;
        }

        public b() {
        }
    }

    public c2(int i11, int i12) {
        this.f71881a = i11;
        this.f71882b = i12;
    }

    public static /* synthetic */ c2 d(c2 c2Var, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = c2Var.f71881a;
        }
        if ((i13 & 2) != 0) {
            i12 = c2Var.f71882b;
        }
        return c2Var.c(i11, i12);
    }

    @w00.o
    public static final /* synthetic */ void i(c2 c2Var, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, c2Var.f71881a);
        eVar.encodeIntElement(fVar, 1, c2Var.f71882b);
    }

    public final int a() {
        return this.f71881a;
    }

    public final int b() {
        return this.f71882b;
    }

    @m80.k
    public final c2 c(int i11, int i12) {
        return new c2(i11, i12);
    }

    public final int e() {
        return this.f71882b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return this.f71881a == c2Var.f71881a && this.f71882b == c2Var.f71882b;
    }

    public final int g() {
        return this.f71881a;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f71881a) * 31) + Integer.hashCode(this.f71882b);
    }

    @m80.k
    public String toString() {
        return "WinningStreakReqVo(topicId=" + this.f71881a + ", questionId=" + this.f71882b + ')';
    }

    public /* synthetic */ c2(int i11, int i12, int i13, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f71883a.a());
        }
        this.f71881a = i12;
        this.f71882b = i13;
    }

    @f50.z(ma.b.N)
    public static /* synthetic */ void f() {
    }

    @f50.z("topicId")
    public static /* synthetic */ void h() {
    }
}
