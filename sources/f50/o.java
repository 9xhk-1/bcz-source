package f50;

import h50.d;
import h50.m;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.w0;
import u30.u0;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o<T> extends j50.b<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final h10.d<T> f51048a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public List<? extends Annotation> f51049b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final yz.c0 f51050c;

    public o(@m80.k h10.d<T> baseClass) {
        kotlin.jvm.internal.g0.p(baseClass, "baseClass");
        this.f51048a = baseClass;
        this.f51049b = a00.h0.J();
        this.f51050c = yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: f50.n
            @Override // x00.a
            public final Object invoke() {
                h50.f n11;
                n11 = o.n(o.this);
                return n11;
            }
        });
    }

    public static final h50.f n(final o oVar) {
        return h50.b.e(h50.l.h("kotlinx.serialization.Polymorphic", d.a.f58509a, new h50.f[0], new x00.l() { // from class: f50.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 o11;
                o11 = o.o(o.this, (h50.a) obj);
                return o11;
            }
        }), oVar.k());
    }

    public static final g2 o(o oVar, h50.a buildSerialDescriptor) {
        kotlin.jvm.internal.g0.p(buildSerialDescriptor, "$this$buildSerialDescriptor");
        h50.a.b(buildSerialDescriptor, "type", g50.a.F(w0.f67050a).a(), null, false, 12, null);
        h50.a.b(buildSerialDescriptor, "value", h50.l.i("kotlinx.serialization.Polymorphic<" + oVar.k().C() + u0.f91710f, m.a.f58539a, new h50.f[0], null, 8, null), null, false, 12, null);
        buildSerialDescriptor.l(oVar.f51049b);
        return g2.f100423a;
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return (h50.f) this.f51050c.getValue();
    }

    @Override // j50.b
    @m80.k
    public h10.d<T> k() {
        return this.f51048a;
    }

    @m80.k
    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + k() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @v0
    public o(@m80.k h10.d<T> baseClass, @m80.k Annotation[] classAnnotations) {
        this(baseClass);
        kotlin.jvm.internal.g0.p(baseClass, "baseClass");
        kotlin.jvm.internal.g0.p(classAnnotations, "classAnnotations");
        this.f51049b = a00.q.t(classAnnotations);
    }
}
