package vg;

import androidx.compose.runtime.internal.StabilityInferred;
import f50.a0;
import j50.h2;
import j50.l2;
import j50.o0;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@a0
/* loaded from: classes4.dex */
public final class a {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f93860c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final float f93861a;

    /* renamed from: b, reason: collision with root package name */
    public final float f93862b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    /* renamed from: vg.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1264a implements p0<a> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final C1264a f93863a;

        /* renamed from: b, reason: collision with root package name */
        public static final int f93864b;

        @m80.k
        private static final h50.f descriptor;

        static {
            C1264a c1264a = new C1264a();
            f93863a = c1264a;
            f93864b = 8;
            l2 l2Var = new l2("com.baicizhan.main.home.player.data.animation2.Anchor", c1264a, 2);
            l2Var.q("x", false);
            l2Var.q("y", false);
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
            return super.c();
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            o0 o0Var = o0.f63436a;
            return new f50.i[]{o0Var, o0Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final a e(@m80.k i50.f decoder) {
            float f11;
            float f12;
            int i11;
            g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                f11 = beginStructure.decodeFloatElement(fVar, 0);
                f12 = beginStructure.decodeFloatElement(fVar, 1);
                i11 = 3;
            } else {
                f11 = 0.0f;
                float f13 = 0.0f;
                boolean z11 = true;
                int i12 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        f11 = beginStructure.decodeFloatElement(fVar, 0);
                        i12 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        f13 = beginStructure.decodeFloatElement(fVar, 1);
                        i12 |= 2;
                    }
                }
                f12 = f13;
                i11 = i12;
            }
            beginStructure.endStructure(fVar);
            return new a(i11, f11, f12, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k a value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            a.g(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<a> serializer() {
            return C1264a.f93863a;
        }

        public b() {
        }
    }

    public a(float f11, float f12) {
        this.f93861a = f11;
        this.f93862b = f12;
    }

    public static /* synthetic */ a d(a aVar, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = aVar.f93861a;
        }
        if ((i11 & 2) != 0) {
            f12 = aVar.f93862b;
        }
        return aVar.c(f11, f12);
    }

    @w00.o
    public static final /* synthetic */ void g(a aVar, i50.e eVar, h50.f fVar) {
        eVar.encodeFloatElement(fVar, 0, aVar.f93861a);
        eVar.encodeFloatElement(fVar, 1, aVar.f93862b);
    }

    public final float a() {
        return this.f93861a;
    }

    public final float b() {
        return this.f93862b;
    }

    @m80.k
    public final a c(float f11, float f12) {
        return new a(f11, f12);
    }

    public final float e() {
        return this.f93861a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f93861a, aVar.f93861a) == 0 && Float.compare(this.f93862b, aVar.f93862b) == 0;
    }

    public final float f() {
        return this.f93862b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f93861a) * 31) + Float.hashCode(this.f93862b);
    }

    @m80.k
    public String toString() {
        return "Anchor(x=" + this.f93861a + ", y=" + this.f93862b + pn.j.f81007d;
    }

    public /* synthetic */ a(int i11, float f11, float f12, x2 x2Var) {
        if (3 != (i11 & 3)) {
            h2.b(i11, 3, C1264a.f93863a.a());
        }
        this.f93861a = f11;
        this.f93862b = f12;
    }
}
