package l50;

import a00.w1;
import a00.x1;
import h50.m;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonTreeDecoder\n+ 2 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n+ 5 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n*L\n1#1,348:1\n133#2,18:349\n1#3:367\n73#4:368\n270#5,8:369\n*S KotlinDebug\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonTreeDecoder\n*L\n212#1:349,18\n271#1:368\n271#1:369,8\n*E\n"})
/* loaded from: classes8.dex */
public class x0 extends c {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final k50.i0 f70086j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public final h50.f f70087k;

    /* renamed from: l, reason: collision with root package name */
    public int f70088l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f70089m;

    public /* synthetic */ x0(k50.a aVar, k50.i0 i0Var, String str, h50.f fVar, int i11, kotlin.jvm.internal.v vVar) {
        this(aVar, i0Var, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : fVar);
    }

    @Override // j50.s1
    @m80.k
    public String O(@m80.k h50.f descriptor, int i11) {
        Object obj;
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        k50.e0 p11 = p0.p(descriptor, a());
        String i12 = descriptor.i(i11);
        if (p11 != null || (this.f69952i.u() && !o0().keySet().contains(i12))) {
            Map<String, Integer> f11 = p0.f(a(), descriptor);
            Iterator<T> it = o0().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Integer num = f11.get((String) obj);
                if (num != null && num.intValue() == i11) {
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
            String a11 = p11 != null ? p11.a(descriptor, i11, i12) : null;
            if (a11 != null) {
                return a11;
            }
        }
        return i12;
    }

    @Override // l50.c
    @m80.k
    public k50.k W(@m80.k String tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        return (k50.k) a00.l1.K(o0(), tag);
    }

    @Override // l50.c, j50.h3, i50.f
    @m80.k
    public i50.d beginStructure(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        if (descriptor != this.f70087k) {
            return super.beginStructure(descriptor);
        }
        k50.a a11 = a();
        k50.k X = X();
        String k11 = this.f70087k.k();
        if (X instanceof k50.i0) {
            return new x0(a11, (k50.i0) X, l0(), this.f70087k);
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.i0.class).C() + ", but had " + kotlin.jvm.internal.o0.d(X.getClass()).C() + " as the serialized body of " + k11 + " at element: " + R(), X.toString());
    }

    public int decodeElementIndex(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        while (this.f70088l < descriptor.h()) {
            int i11 = this.f70088l;
            this.f70088l = i11 + 1;
            String I = I(descriptor, i11);
            int i12 = this.f70088l - 1;
            this.f70089m = false;
            if (o0().containsKey(I) || t0(descriptor, i12)) {
                if (this.f69952i.j()) {
                    k50.a a11 = a();
                    boolean l11 = descriptor.l(i12);
                    h50.f e11 = descriptor.e(i12);
                    if (!l11 || e11.b() || !(r0(I) instanceof k50.f0)) {
                        if (kotlin.jvm.internal.g0.g(e11.getKind(), m.b.f58540a)) {
                            if (e11.b() && (r0(I) instanceof k50.f0)) {
                                return i12;
                            }
                            k50.k r02 = r0(I);
                            k50.l0 l0Var = r02 instanceof k50.l0 ? (k50.l0) r02 : null;
                            String o11 = l0Var != null ? k50.o.o(l0Var) : null;
                            if (o11 == null) {
                                return i12;
                            }
                            int j11 = p0.j(e11, a11, o11);
                            boolean z11 = !a11.i().n() && e11.b();
                            if (j11 == -3 && ((l11 || z11) && !t0(descriptor, i12))) {
                            }
                        }
                    }
                }
                return i12;
            }
        }
        return -1;
    }

    @Override // l50.c, j50.h3, i50.f
    public boolean decodeNotNullMark() {
        return !this.f70089m && super.decodeNotNullMark();
    }

    @Override // l50.c, j50.h3, i50.d
    public void endStructure(@m80.k h50.f descriptor) {
        Set<String> C;
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        if (p0.o(descriptor, a()) || (descriptor.getKind() instanceof h50.d)) {
            return;
        }
        k50.e0 p11 = p0.p(descriptor, a());
        if (p11 == null && !this.f69952i.u()) {
            C = j50.b1.a(descriptor);
        } else if (p11 != null) {
            C = p0.f(a(), descriptor).keySet();
        } else {
            Set<String> a11 = j50.b1.a(descriptor);
            Map map = (Map) k50.n0.a(a()).a(descriptor, p0.h());
            Set keySet = map != null ? map.keySet() : null;
            if (keySet == null) {
                keySet = w1.k();
            }
            C = x1.C(a11, keySet);
        }
        for (String str : o0().keySet()) {
            if (!C.contains(str) && !kotlin.jvm.internal.g0.g(str, l0())) {
                throw i0.e(-1, "Encountered an unknown key '" + str + "' at element: " + R() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) i0.j(o0().toString(), 0, 1, null)));
            }
        }
    }

    @m80.l
    public final k50.k r0(@m80.k String tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        return (k50.k) o0().get(tag);
    }

    @Override // l50.c
    @m80.k
    /* renamed from: s0 */
    public k50.i0 o0() {
        return this.f70086j;
    }

    public final boolean t0(h50.f fVar, int i11) {
        boolean z11 = (a().i().n() || fVar.l(i11) || !fVar.e(i11).b()) ? false : true;
        this.f70089m = z11;
        return z11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(@m80.k k50.a json, @m80.k k50.i0 value, @m80.l String str, @m80.l h50.f fVar) {
        super(json, value, str, null);
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(value, "value");
        this.f70086j = value;
        this.f70087k = fVar;
    }
}
