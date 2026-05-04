package vg;

import a00.h0;
import androidx.compose.runtime.internal.StabilityInferred;
import f50.a0;
import j50.l2;
import j50.o0;
import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlinx.serialization.UnknownFieldException;
import vg.x;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@a0
/* loaded from: classes4.dex */
public final class h {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f93872f = 8;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final c0<f50.i<Object>>[] f93873g;

    /* renamed from: a, reason: collision with root package name */
    public final float f93874a;

    /* renamed from: b, reason: collision with root package name */
    public final float f93875b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Float> f93876c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<Float> f93877d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final List<x> f93878e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements p0<h> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f93879a;

        /* renamed from: b, reason: collision with root package name */
        public static final int f93880b;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f93879a = aVar;
            f93880b = 8;
            l2 l2Var = new l2("com.baicizhan.main.home.player.data.animation2.Opacity", aVar, 5);
            l2Var.q("beginTime", true);
            l2Var.q("duration", true);
            l2Var.q("keyTimes", true);
            l2Var.q("values", true);
            l2Var.q("timingFunctions", true);
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            c0[] c0VarArr = h.f93873g;
            o0 o0Var = o0.f63436a;
            return new f50.i[]{o0Var, o0Var, c0VarArr[2].getValue(), c0VarArr[3].getValue(), c0VarArr[4].getValue()};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final h e(@m80.k i50.f decoder) {
            float f11;
            int i11;
            float f12;
            List list;
            List list2;
            List list3;
            g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            c0[] c0VarArr = h.f93873g;
            if (beginStructure.decodeSequentially()) {
                f11 = beginStructure.decodeFloatElement(fVar, 0);
                float decodeFloatElement = beginStructure.decodeFloatElement(fVar, 1);
                List list4 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), null);
                List list5 = (List) beginStructure.decodeSerializableElement(fVar, 3, (f50.e) c0VarArr[3].getValue(), null);
                list3 = (List) beginStructure.decodeSerializableElement(fVar, 4, (f50.e) c0VarArr[4].getValue(), null);
                list2 = list5;
                i11 = 31;
                list = list4;
                f12 = decodeFloatElement;
            } else {
                f11 = 0.0f;
                float f13 = 0.0f;
                boolean z11 = true;
                List list6 = null;
                List list7 = null;
                List list8 = null;
                int i12 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        f11 = beginStructure.decodeFloatElement(fVar, 0);
                        i12 |= 1;
                    } else if (decodeElementIndex == 1) {
                        f13 = beginStructure.decodeFloatElement(fVar, 1);
                        i12 |= 2;
                    } else if (decodeElementIndex == 2) {
                        list6 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), list6);
                        i12 |= 4;
                    } else if (decodeElementIndex == 3) {
                        list7 = (List) beginStructure.decodeSerializableElement(fVar, 3, (f50.e) c0VarArr[3].getValue(), list7);
                        i12 |= 8;
                    } else {
                        if (decodeElementIndex != 4) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        list8 = (List) beginStructure.decodeSerializableElement(fVar, 4, (f50.e) c0VarArr[4].getValue(), list8);
                        i12 |= 16;
                    }
                }
                i11 = i12;
                f12 = f13;
                list = list6;
                list2 = list7;
                list3 = list8;
            }
            float f14 = f11;
            beginStructure.endStructure(fVar);
            return new h(i11, f14, f12, list, list2, list3, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k h value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            h.t(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<h> serializer() {
            return a.f93879a;
        }

        public b() {
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f93873g = new c0[]{null, null, e0.b(lazyThreadSafetyMode, new x00.a() { // from class: vg.e
            @Override // x00.a
            public final Object invoke() {
                f50.i d11;
                d11 = h.d();
                return d11;
            }
        }), e0.b(lazyThreadSafetyMode, new x00.a() { // from class: vg.f
            @Override // x00.a
            public final Object invoke() {
                f50.i e11;
                e11 = h.e();
                return e11;
            }
        }), e0.b(lazyThreadSafetyMode, new x00.a() { // from class: vg.g
            @Override // x00.a
            public final Object invoke() {
                f50.i f11;
                f11 = h.f();
                return f11;
            }
        })};
    }

    public h() {
        this(0.0f, 0.0f, (List) null, (List) null, (List) null, 31, (kotlin.jvm.internal.v) null);
    }

    public static final /* synthetic */ f50.i d() {
        return new j50.f(o0.f63436a);
    }

    public static final /* synthetic */ f50.i e() {
        return new j50.f(o0.f63436a);
    }

    public static final /* synthetic */ f50.i f() {
        return new j50.f(x.a.f93929a);
    }

    public static /* synthetic */ h n(h hVar, float f11, float f12, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = hVar.f93874a;
        }
        if ((i11 & 2) != 0) {
            f12 = hVar.f93875b;
        }
        if ((i11 & 4) != 0) {
            list = hVar.f93876c;
        }
        if ((i11 & 8) != 0) {
            list2 = hVar.f93877d;
        }
        if ((i11 & 16) != 0) {
            list3 = hVar.f93878e;
        }
        List list4 = list3;
        List list5 = list;
        return hVar.m(f11, f12, list5, list2, list4);
    }

    @w00.o
    public static final /* synthetic */ void t(h hVar, i50.e eVar, h50.f fVar) {
        c0<f50.i<Object>>[] c0VarArr = f93873g;
        if (eVar.shouldEncodeElementDefault(fVar, 0) || Float.compare(hVar.f93874a, 0.0f) != 0) {
            eVar.encodeFloatElement(fVar, 0, hVar.f93874a);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 1) || Float.compare(hVar.f93875b, 0.0f) != 0) {
            eVar.encodeFloatElement(fVar, 1, hVar.f93875b);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 2) || !g0.g(hVar.f93876c, h0.J())) {
            eVar.encodeSerializableElement(fVar, 2, c0VarArr[2].getValue(), hVar.f93876c);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 3) || !g0.g(hVar.f93877d, h0.J())) {
            eVar.encodeSerializableElement(fVar, 3, c0VarArr[3].getValue(), hVar.f93877d);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 4) && g0.g(hVar.f93878e, h0.J())) {
            return;
        }
        eVar.encodeSerializableElement(fVar, 4, c0VarArr[4].getValue(), hVar.f93878e);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f93874a, hVar.f93874a) == 0 && Float.compare(this.f93875b, hVar.f93875b) == 0 && g0.g(this.f93876c, hVar.f93876c) && g0.g(this.f93877d, hVar.f93877d) && g0.g(this.f93878e, hVar.f93878e);
    }

    public final float h() {
        return this.f93874a;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.f93874a) * 31) + Float.hashCode(this.f93875b)) * 31) + this.f93876c.hashCode()) * 31) + this.f93877d.hashCode()) * 31) + this.f93878e.hashCode();
    }

    public final float i() {
        return this.f93875b;
    }

    @m80.k
    public final List<Float> j() {
        return this.f93876c;
    }

    @m80.k
    public final List<Float> k() {
        return this.f93877d;
    }

    @m80.k
    public final List<x> l() {
        return this.f93878e;
    }

    @m80.k
    public final h m(float f11, float f12, @m80.k List<Float> keyTimes, @m80.k List<Float> values, @m80.k List<x> timingFunctions) {
        g0.p(keyTimes, "keyTimes");
        g0.p(values, "values");
        g0.p(timingFunctions, "timingFunctions");
        return new h(f11, f12, keyTimes, values, timingFunctions);
    }

    public final float o() {
        return this.f93874a;
    }

    public final float p() {
        return this.f93875b;
    }

    @m80.k
    public final List<Float> q() {
        return this.f93876c;
    }

    @m80.k
    public final List<x> r() {
        return this.f93878e;
    }

    @m80.k
    public final List<Float> s() {
        return this.f93877d;
    }

    @m80.k
    public String toString() {
        return "Opacity(beginTime=" + this.f93874a + ", duration=" + this.f93875b + ", keyTimes=" + this.f93876c + ", values=" + this.f93877d + ", timingFunctions=" + this.f93878e + pn.j.f81007d;
    }

    public h(float f11, float f12, @m80.k List<Float> keyTimes, @m80.k List<Float> values, @m80.k List<x> timingFunctions) {
        g0.p(keyTimes, "keyTimes");
        g0.p(values, "values");
        g0.p(timingFunctions, "timingFunctions");
        this.f93874a = f11;
        this.f93875b = f12;
        this.f93876c = keyTimes;
        this.f93877d = values;
        this.f93878e = timingFunctions;
    }

    public /* synthetic */ h(int i11, float f11, float f12, List list, List list2, List list3, x2 x2Var) {
        if ((i11 & 1) == 0) {
            this.f93874a = 0.0f;
        } else {
            this.f93874a = f11;
        }
        if ((i11 & 2) == 0) {
            this.f93875b = 0.0f;
        } else {
            this.f93875b = f12;
        }
        if ((i11 & 4) == 0) {
            this.f93876c = h0.J();
        } else {
            this.f93876c = list;
        }
        if ((i11 & 8) == 0) {
            this.f93877d = h0.J();
        } else {
            this.f93877d = list2;
        }
        if ((i11 & 16) == 0) {
            this.f93878e = h0.J();
        } else {
            this.f93878e = list3;
        }
    }

    public /* synthetic */ h(float f11, float f12, List list, List list2, List list3, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) != 0 ? 0.0f : f12, (i11 & 4) != 0 ? h0.J() : list, (i11 & 8) != 0 ? h0.J() : list2, (i11 & 16) != 0 ? h0.J() : list3);
    }
}
