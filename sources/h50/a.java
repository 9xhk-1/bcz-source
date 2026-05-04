package h50;

import a00.h0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,393:1\n1#2:394\n*E\n"})
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f58498a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f58499b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public List<? extends Annotation> f58500c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<String> f58501d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Set<String> f58502e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final List<f> f58503f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final List<List<Annotation>> f58504g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final List<Boolean> f58505h;

    public a(@m80.k String serialName) {
        g0.p(serialName, "serialName");
        this.f58498a = serialName;
        this.f58500c = h0.J();
        this.f58501d = new ArrayList();
        this.f58502e = new HashSet();
        this.f58503f = new ArrayList();
        this.f58504g = new ArrayList();
        this.f58505h = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(a aVar, String str, f fVar, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = h0.J();
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        aVar.a(str, fVar, list, z11);
    }

    public final void a(@m80.k String elementName, @m80.k f descriptor, @m80.k List<? extends Annotation> annotations, boolean z11) {
        g0.p(elementName, "elementName");
        g0.p(descriptor, "descriptor");
        g0.p(annotations, "annotations");
        if (this.f58502e.add(elementName)) {
            this.f58501d.add(elementName);
            this.f58503f.add(descriptor);
            this.f58504g.add(annotations);
            this.f58505h.add(Boolean.valueOf(z11));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f58498a).toString());
    }

    @m80.k
    public final List<Annotation> c() {
        return this.f58500c;
    }

    @m80.k
    public final List<List<Annotation>> e() {
        return this.f58504g;
    }

    @m80.k
    public final List<f> f() {
        return this.f58503f;
    }

    @m80.k
    public final List<String> g() {
        return this.f58501d;
    }

    @m80.k
    public final List<Boolean> h() {
        return this.f58505h;
    }

    @m80.k
    public final String i() {
        return this.f58498a;
    }

    public final boolean j() {
        return this.f58499b;
    }

    public final void l(@m80.k List<? extends Annotation> list) {
        g0.p(list, "<set-?>");
        this.f58500c = list;
    }

    public final void m(boolean z11) {
        this.f58499b = z11;
    }

    @f50.f
    public static /* synthetic */ void d() {
    }

    @f50.f
    @yz.n(level = DeprecationLevel.ERROR, message = "isNullable inside buildSerialDescriptor is deprecated. Please use SerialDescriptor.nullable extension on a builder result.")
    public static /* synthetic */ void k() {
    }
}
