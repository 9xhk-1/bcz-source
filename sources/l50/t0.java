package l50;

import h50.m;
import h50.n;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlinx.serialization.json.ClassDiscriminatorMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class t0 implements o50.j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f70068a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f70069b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f70070c;

    public t0(@m80.k k50.g configuration) {
        kotlin.jvm.internal.g0.p(configuration, "configuration");
        this.f70068a = configuration.g();
        this.f70069b = configuration.v();
        this.f70070c = configuration.h() != ClassDiscriminatorMode.NONE;
    }

    @Override // o50.j
    public <Base> void b(@m80.k h10.d<Base> baseClass, @m80.k x00.l<? super String, ? extends f50.e<? extends Base>> defaultDeserializerProvider) {
        kotlin.jvm.internal.g0.p(baseClass, "baseClass");
        kotlin.jvm.internal.g0.p(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // o50.j
    public <Base> void c(@m80.k h10.d<Base> baseClass, @m80.k x00.l<? super Base, ? extends f50.b0<? super Base>> defaultSerializerProvider) {
        kotlin.jvm.internal.g0.p(baseClass, "baseClass");
        kotlin.jvm.internal.g0.p(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // o50.j
    public <T> void d(@m80.k h10.d<T> dVar, @m80.k f50.i<T> iVar) {
        super.d(dVar, iVar);
    }

    @Override // o50.j
    public <Base, Sub extends Base> void e(@m80.k h10.d<Base> baseClass, @m80.k h10.d<Sub> actualClass, @m80.k f50.i<Sub> actualSerializer) {
        kotlin.jvm.internal.g0.p(baseClass, "baseClass");
        kotlin.jvm.internal.g0.p(actualClass, "actualClass");
        kotlin.jvm.internal.g0.p(actualSerializer, "actualSerializer");
        h50.f a11 = actualSerializer.a();
        l(a11, actualClass);
        if (this.f70069b || !this.f70070c) {
            return;
        }
        k(a11, actualClass);
    }

    @Override // o50.j
    @yz.n(level = DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @yz.w0(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
    public <Base> void f(@m80.k h10.d<Base> dVar, @m80.k x00.l<? super String, ? extends f50.e<? extends Base>> lVar) {
        super.f(dVar, lVar);
    }

    @Override // o50.j
    public <T> void g(@m80.k h10.d<T> kClass, @m80.k x00.l<? super List<? extends f50.i<?>>, ? extends f50.i<?>> provider) {
        kotlin.jvm.internal.g0.p(kClass, "kClass");
        kotlin.jvm.internal.g0.p(provider, "provider");
    }

    public final void k(h50.f fVar, h10.d<?> dVar) {
        int h11 = fVar.h();
        for (int i11 = 0; i11 < h11; i11++) {
            String i12 = fVar.i(i11);
            if (kotlin.jvm.internal.g0.g(i12, this.f70068a)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + dVar + " has property '" + i12 + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    public final void l(h50.f fVar, h10.d<?> dVar) {
        h50.m kind = fVar.getKind();
        if ((kind instanceof h50.d) || kotlin.jvm.internal.g0.g(kind, m.a.f58539a)) {
            throw new IllegalArgumentException("Serializer for " + dVar.C() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (!this.f70069b && this.f70070c) {
            if (kotlin.jvm.internal.g0.g(kind, n.b.f58542a) || kotlin.jvm.internal.g0.g(kind, n.c.f58543a) || (kind instanceof h50.e) || (kind instanceof m.b)) {
                throw new IllegalArgumentException("Serializer for " + dVar.C() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }
}
