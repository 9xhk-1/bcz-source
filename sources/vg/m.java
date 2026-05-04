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
import vg.i;
import vg.x;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@a0
/* loaded from: classes4.dex */
public final class m {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f93888f = 8;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final c0<f50.i<Object>>[] f93889g;

    /* renamed from: a, reason: collision with root package name */
    public final float f93890a;

    /* renamed from: b, reason: collision with root package name */
    public final float f93891b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Float> f93892c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<x> f93893d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final List<i> f93894e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements p0<m> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f93895a;

        /* renamed from: b, reason: collision with root package name */
        public static final int f93896b;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f93895a = aVar;
            f93896b = 8;
            l2 l2Var = new l2("com.baicizhan.main.home.player.data.animation2.Position", aVar, 5);
            l2Var.q("beginTime", true);
            l2Var.q("duration", true);
            l2Var.q("keyTimes", true);
            l2Var.q("timingFunctions", true);
            l2Var.q("path", true);
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
            c0[] c0VarArr = m.f93889g;
            o0 o0Var = o0.f63436a;
            return new f50.i[]{o0Var, o0Var, c0VarArr[2].getValue(), c0VarArr[3].getValue(), c0VarArr[4].getValue()};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final m e(@m80.k i50.f decoder) {
            float f11;
            int i11;
            float f12;
            List list;
            List list2;
            List list3;
            g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            c0[] c0VarArr = m.f93889g;
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
            return new m(i11, f14, f12, list, list2, list3, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k m value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            m.t(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<m> serializer() {
            return a.f93895a;
        }

        public b() {
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f93889g = new c0[]{null, null, e0.b(lazyThreadSafetyMode, new x00.a() { // from class: vg.j
            @Override // x00.a
            public final Object invoke() {
                f50.i d11;
                d11 = m.d();
                return d11;
            }
        }), e0.b(lazyThreadSafetyMode, new x00.a() { // from class: vg.k
            @Override // x00.a
            public final Object invoke() {
                f50.i e11;
                e11 = m.e();
                return e11;
            }
        }), e0.b(lazyThreadSafetyMode, new x00.a() { // from class: vg.l
            @Override // x00.a
            public final Object invoke() {
                f50.i f11;
                f11 = m.f();
                return f11;
            }
        })};
    }

    public m() {
        this(0.0f, 0.0f, (List) null, (List) null, (List) null, 31, (kotlin.jvm.internal.v) null);
    }

    public static final /* synthetic */ f50.i d() {
        return new j50.f(o0.f63436a);
    }

    public static final /* synthetic */ f50.i e() {
        return new j50.f(x.a.f93929a);
    }

    public static final /* synthetic */ f50.i f() {
        return new j50.f(i.a.f93886a);
    }

    public static /* synthetic */ m n(m mVar, float f11, float f12, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = mVar.f93890a;
        }
        if ((i11 & 2) != 0) {
            f12 = mVar.f93891b;
        }
        if ((i11 & 4) != 0) {
            list = mVar.f93892c;
        }
        if ((i11 & 8) != 0) {
            list2 = mVar.f93893d;
        }
        if ((i11 & 16) != 0) {
            list3 = mVar.f93894e;
        }
        List list4 = list3;
        List list5 = list;
        return mVar.m(f11, f12, list5, list2, list4);
    }

    @w00.o
    public static final /* synthetic */ void t(m mVar, i50.e eVar, h50.f fVar) {
        c0<f50.i<Object>>[] c0VarArr = f93889g;
        if (eVar.shouldEncodeElementDefault(fVar, 0) || Float.compare(mVar.f93890a, 0.0f) != 0) {
            eVar.encodeFloatElement(fVar, 0, mVar.f93890a);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 1) || Float.compare(mVar.f93891b, 0.0f) != 0) {
            eVar.encodeFloatElement(fVar, 1, mVar.f93891b);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 2) || !g0.g(mVar.f93892c, h0.J())) {
            eVar.encodeSerializableElement(fVar, 2, c0VarArr[2].getValue(), mVar.f93892c);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 3) || !g0.g(mVar.f93893d, h0.J())) {
            eVar.encodeSerializableElement(fVar, 3, c0VarArr[3].getValue(), mVar.f93893d);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 4) && g0.g(mVar.f93894e, h0.J())) {
            return;
        }
        eVar.encodeSerializableElement(fVar, 4, c0VarArr[4].getValue(), mVar.f93894e);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f93890a, mVar.f93890a) == 0 && Float.compare(this.f93891b, mVar.f93891b) == 0 && g0.g(this.f93892c, mVar.f93892c) && g0.g(this.f93893d, mVar.f93893d) && g0.g(this.f93894e, mVar.f93894e);
    }

    public final float h() {
        return this.f93890a;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.f93890a) * 31) + Float.hashCode(this.f93891b)) * 31) + this.f93892c.hashCode()) * 31) + this.f93893d.hashCode()) * 31) + this.f93894e.hashCode();
    }

    public final float i() {
        return this.f93891b;
    }

    @m80.k
    public final List<Float> j() {
        return this.f93892c;
    }

    @m80.k
    public final List<x> k() {
        return this.f93893d;
    }

    @m80.k
    public final List<i> l() {
        return this.f93894e;
    }

    @m80.k
    public final m m(float f11, float f12, @m80.k List<Float> keyTimes, @m80.k List<x> timingFunctions, @m80.k List<i> path) {
        g0.p(keyTimes, "keyTimes");
        g0.p(timingFunctions, "timingFunctions");
        g0.p(path, "path");
        return new m(f11, f12, keyTimes, timingFunctions, path);
    }

    public final float o() {
        return this.f93890a;
    }

    public final float p() {
        return this.f93891b;
    }

    @m80.k
    public final List<Float> q() {
        return this.f93892c;
    }

    @m80.k
    public final List<i> r() {
        return this.f93894e;
    }

    @m80.k
    public final List<x> s() {
        return this.f93893d;
    }

    @m80.k
    public String toString() {
        return "Position(beginTime=" + this.f93890a + ", duration=" + this.f93891b + ", keyTimes=" + this.f93892c + ", timingFunctions=" + this.f93893d + ", path=" + this.f93894e + pn.j.f81007d;
    }

    public m(float f11, float f12, @m80.k List<Float> keyTimes, @m80.k List<x> timingFunctions, @m80.k List<i> path) {
        g0.p(keyTimes, "keyTimes");
        g0.p(timingFunctions, "timingFunctions");
        g0.p(path, "path");
        this.f93890a = f11;
        this.f93891b = f12;
        this.f93892c = keyTimes;
        this.f93893d = timingFunctions;
        this.f93894e = path;
    }

    public /* synthetic */ m(int i11, float f11, float f12, List list, List list2, List list3, x2 x2Var) {
        if ((i11 & 1) == 0) {
            this.f93890a = 0.0f;
        } else {
            this.f93890a = f11;
        }
        if ((i11 & 2) == 0) {
            this.f93891b = 0.0f;
        } else {
            this.f93891b = f12;
        }
        if ((i11 & 4) == 0) {
            this.f93892c = h0.J();
        } else {
            this.f93892c = list;
        }
        if ((i11 & 8) == 0) {
            this.f93893d = h0.J();
        } else {
            this.f93893d = list2;
        }
        if ((i11 & 16) == 0) {
            this.f93894e = h0.J();
        } else {
            this.f93894e = list3;
        }
    }

    public /* synthetic */ m(float f11, float f12, List list, List list2, List list3, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) != 0 ? 0.0f : f12, (i11 & 4) != 0 ? h0.J() : list, (i11 & 8) != 0 ? h0.J() : list2, (i11 & 16) != 0 ? h0.J() : list3);
    }
}
