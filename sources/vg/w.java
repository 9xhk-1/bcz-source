package vg;

import androidx.compose.runtime.internal.StabilityInferred;
import f50.a0;
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
public final class w {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f93921c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final float f93922a;

    /* renamed from: b, reason: collision with root package name */
    public final float f93923b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements p0<w> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f93924a;

        /* renamed from: b, reason: collision with root package name */
        public static final int f93925b;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f93924a = aVar;
            f93925b = 8;
            l2 l2Var = new l2("com.baicizhan.main.home.player.data.animation2.ScaleValue", aVar, 2);
            l2Var.q("x", true);
            l2Var.q("y", true);
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
        public final w e(@m80.k i50.f decoder) {
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
            return new w(i11, f11, f12, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k w value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            w.g(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<w> serializer() {
            return a.f93924a;
        }

        public b() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.w.<init>():void");
    }

    public static /* synthetic */ w d(w wVar, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = wVar.f93922a;
        }
        if ((i11 & 2) != 0) {
            f12 = wVar.f93923b;
        }
        return wVar.c(f11, f12);
    }

    @w00.o
    public static final /* synthetic */ void g(w wVar, i50.e eVar, h50.f fVar) {
        if (eVar.shouldEncodeElementDefault(fVar, 0) || Float.compare(wVar.f93922a, 1.0f) != 0) {
            eVar.encodeFloatElement(fVar, 0, wVar.f93922a);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 1) && Float.compare(wVar.f93923b, 1.0f) == 0) {
            return;
        }
        eVar.encodeFloatElement(fVar, 1, wVar.f93923b);
    }

    public final float a() {
        return this.f93922a;
    }

    public final float b() {
        return this.f93923b;
    }

    @m80.k
    public final w c(float f11, float f12) {
        return new w(f11, f12);
    }

    public final float e() {
        return this.f93922a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f93922a, wVar.f93922a) == 0 && Float.compare(this.f93923b, wVar.f93923b) == 0;
    }

    public final float f() {
        return this.f93923b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f93922a) * 31) + Float.hashCode(this.f93923b);
    }

    @m80.k
    public String toString() {
        return "ScaleValue(x=" + this.f93922a + ", y=" + this.f93923b + pn.j.f81007d;
    }

    public w(float f11, float f12) {
        this.f93922a = f11;
        this.f93923b = f12;
    }

    public /* synthetic */ w(int i11, float f11, float f12, x2 x2Var) {
        if ((i11 & 1) == 0) {
            this.f93922a = 1.0f;
        } else {
            this.f93922a = f11;
        }
        if ((i11 & 2) == 0) {
            this.f93923b = 1.0f;
        } else {
            this.f93923b = f12;
        }
    }

    public /* synthetic */ w(float f11, float f12, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? 1.0f : f11, (i11 & 2) != 0 ? 1.0f : f12);
    }
}
