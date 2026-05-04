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
import vg.w;
import vg.x;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@a0
/* loaded from: classes4.dex */
public final class v {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f93912f = 8;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final c0<f50.i<Object>>[] f93913g;

    /* renamed from: a, reason: collision with root package name */
    public final float f93914a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<Float> f93915b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<w> f93916c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<x> f93917d;

    /* renamed from: e, reason: collision with root package name */
    public final float f93918e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements p0<v> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f93919a;

        /* renamed from: b, reason: collision with root package name */
        public static final int f93920b;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f93919a = aVar;
            f93920b = 8;
            l2 l2Var = new l2("com.baicizhan.main.home.player.data.animation2.Scale", aVar, 5);
            l2Var.q("duration", true);
            l2Var.q("keyTimes", true);
            l2Var.q("values", true);
            l2Var.q("timingFunctions", true);
            l2Var.q("beginTime", true);
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
            c0[] c0VarArr = v.f93913g;
            o0 o0Var = o0.f63436a;
            return new f50.i[]{o0Var, c0VarArr[1].getValue(), c0VarArr[2].getValue(), c0VarArr[3].getValue(), o0Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final v e(@m80.k i50.f decoder) {
            float f11;
            float f12;
            int i11;
            List list;
            List list2;
            List list3;
            g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            c0[] c0VarArr = v.f93913g;
            if (beginStructure.decodeSequentially()) {
                f11 = beginStructure.decodeFloatElement(fVar, 0);
                List list4 = (List) beginStructure.decodeSerializableElement(fVar, 1, (f50.e) c0VarArr[1].getValue(), null);
                List list5 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), null);
                list3 = (List) beginStructure.decodeSerializableElement(fVar, 3, (f50.e) c0VarArr[3].getValue(), null);
                f12 = beginStructure.decodeFloatElement(fVar, 4);
                i11 = 31;
                list2 = list5;
                list = list4;
            } else {
                f11 = 0.0f;
                boolean z11 = true;
                int i12 = 0;
                List list6 = null;
                List list7 = null;
                List list8 = null;
                float f13 = 0.0f;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        f11 = beginStructure.decodeFloatElement(fVar, 0);
                        i12 |= 1;
                    } else if (decodeElementIndex == 1) {
                        list6 = (List) beginStructure.decodeSerializableElement(fVar, 1, (f50.e) c0VarArr[1].getValue(), list6);
                        i12 |= 2;
                    } else if (decodeElementIndex == 2) {
                        list7 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), list7);
                        i12 |= 4;
                    } else if (decodeElementIndex == 3) {
                        list8 = (List) beginStructure.decodeSerializableElement(fVar, 3, (f50.e) c0VarArr[3].getValue(), list8);
                        i12 |= 8;
                    } else {
                        if (decodeElementIndex != 4) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        f13 = beginStructure.decodeFloatElement(fVar, 4);
                        i12 |= 16;
                    }
                }
                f12 = f13;
                i11 = i12;
                list = list6;
                list2 = list7;
                list3 = list8;
            }
            float f14 = f11;
            beginStructure.endStructure(fVar);
            return new v(i11, f14, list, list2, list3, f12, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k v value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            v.t(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<v> serializer() {
            return a.f93919a;
        }

        public b() {
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f93913g = new c0[]{null, e0.b(lazyThreadSafetyMode, new x00.a() { // from class: vg.s
            @Override // x00.a
            public final Object invoke() {
                f50.i d11;
                d11 = v.d();
                return d11;
            }
        }), e0.b(lazyThreadSafetyMode, new x00.a() { // from class: vg.t
            @Override // x00.a
            public final Object invoke() {
                f50.i e11;
                e11 = v.e();
                return e11;
            }
        }), e0.b(lazyThreadSafetyMode, new x00.a() { // from class: vg.u
            @Override // x00.a
            public final Object invoke() {
                f50.i f11;
                f11 = v.f();
                return f11;
            }
        }), null};
    }

    public v() {
        this(0.0f, (List) null, (List) null, (List) null, 0.0f, 31, (kotlin.jvm.internal.v) null);
    }

    public static final /* synthetic */ f50.i d() {
        return new j50.f(o0.f63436a);
    }

    public static final /* synthetic */ f50.i e() {
        return new j50.f(w.a.f93924a);
    }

    public static final /* synthetic */ f50.i f() {
        return new j50.f(x.a.f93929a);
    }

    public static /* synthetic */ v n(v vVar, float f11, List list, List list2, List list3, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = vVar.f93914a;
        }
        if ((i11 & 2) != 0) {
            list = vVar.f93915b;
        }
        if ((i11 & 4) != 0) {
            list2 = vVar.f93916c;
        }
        if ((i11 & 8) != 0) {
            list3 = vVar.f93917d;
        }
        if ((i11 & 16) != 0) {
            f12 = vVar.f93918e;
        }
        float f13 = f12;
        List list4 = list2;
        return vVar.m(f11, list, list4, list3, f13);
    }

    @w00.o
    public static final /* synthetic */ void t(v vVar, i50.e eVar, h50.f fVar) {
        c0<f50.i<Object>>[] c0VarArr = f93913g;
        if (eVar.shouldEncodeElementDefault(fVar, 0) || Float.compare(vVar.f93914a, 0.0f) != 0) {
            eVar.encodeFloatElement(fVar, 0, vVar.f93914a);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 1) || !g0.g(vVar.f93915b, h0.J())) {
            eVar.encodeSerializableElement(fVar, 1, c0VarArr[1].getValue(), vVar.f93915b);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 2) || !g0.g(vVar.f93916c, h0.J())) {
            eVar.encodeSerializableElement(fVar, 2, c0VarArr[2].getValue(), vVar.f93916c);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 3) || !g0.g(vVar.f93917d, h0.J())) {
            eVar.encodeSerializableElement(fVar, 3, c0VarArr[3].getValue(), vVar.f93917d);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 4) && Float.compare(vVar.f93918e, 0.0f) == 0) {
            return;
        }
        eVar.encodeFloatElement(fVar, 4, vVar.f93918e);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f93914a, vVar.f93914a) == 0 && g0.g(this.f93915b, vVar.f93915b) && g0.g(this.f93916c, vVar.f93916c) && g0.g(this.f93917d, vVar.f93917d) && Float.compare(this.f93918e, vVar.f93918e) == 0;
    }

    public final float h() {
        return this.f93914a;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.f93914a) * 31) + this.f93915b.hashCode()) * 31) + this.f93916c.hashCode()) * 31) + this.f93917d.hashCode()) * 31) + Float.hashCode(this.f93918e);
    }

    @m80.k
    public final List<Float> i() {
        return this.f93915b;
    }

    @m80.k
    public final List<w> j() {
        return this.f93916c;
    }

    @m80.k
    public final List<x> k() {
        return this.f93917d;
    }

    public final float l() {
        return this.f93918e;
    }

    @m80.k
    public final v m(float f11, @m80.k List<Float> keyTimes, @m80.k List<w> values, @m80.k List<x> timingFunctions, float f12) {
        g0.p(keyTimes, "keyTimes");
        g0.p(values, "values");
        g0.p(timingFunctions, "timingFunctions");
        return new v(f11, keyTimes, values, timingFunctions, f12);
    }

    public final float o() {
        return this.f93918e;
    }

    public final float p() {
        return this.f93914a;
    }

    @m80.k
    public final List<Float> q() {
        return this.f93915b;
    }

    @m80.k
    public final List<x> r() {
        return this.f93917d;
    }

    @m80.k
    public final List<w> s() {
        return this.f93916c;
    }

    @m80.k
    public String toString() {
        return "Scale(duration=" + this.f93914a + ", keyTimes=" + this.f93915b + ", values=" + this.f93916c + ", timingFunctions=" + this.f93917d + ", beginTime=" + this.f93918e + pn.j.f81007d;
    }

    public v(float f11, @m80.k List<Float> keyTimes, @m80.k List<w> values, @m80.k List<x> timingFunctions, float f12) {
        g0.p(keyTimes, "keyTimes");
        g0.p(values, "values");
        g0.p(timingFunctions, "timingFunctions");
        this.f93914a = f11;
        this.f93915b = keyTimes;
        this.f93916c = values;
        this.f93917d = timingFunctions;
        this.f93918e = f12;
    }

    public /* synthetic */ v(int i11, float f11, List list, List list2, List list3, float f12, x2 x2Var) {
        if ((i11 & 1) == 0) {
            this.f93914a = 0.0f;
        } else {
            this.f93914a = f11;
        }
        if ((i11 & 2) == 0) {
            this.f93915b = h0.J();
        } else {
            this.f93915b = list;
        }
        if ((i11 & 4) == 0) {
            this.f93916c = h0.J();
        } else {
            this.f93916c = list2;
        }
        if ((i11 & 8) == 0) {
            this.f93917d = h0.J();
        } else {
            this.f93917d = list3;
        }
        if ((i11 & 16) == 0) {
            this.f93918e = 0.0f;
        } else {
            this.f93918e = f12;
        }
    }

    public /* synthetic */ v(float f11, List list, List list2, List list3, float f12, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) != 0 ? h0.J() : list, (i11 & 4) != 0 ? h0.J() : list2, (i11 & 8) != 0 ? h0.J() : list3, (i11 & 16) != 0 ? 0.0f : f12);
    }
}
