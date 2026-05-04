package v10;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.jvm.internal.u0;
import v10.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReflectJavaWildcardType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaWildcardType.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaWildcardType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* loaded from: classes8.dex */
public final class h0 extends e0 implements f20.c0 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final WildcardType f92846b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Collection<f20.a> f92847c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f92848d;

    public h0(@m80.k WildcardType reflectType) {
        kotlin.jvm.internal.g0.p(reflectType, "reflectType");
        this.f92846b = reflectType;
        this.f92847c = a00.h0.J();
    }

    @Override // f20.c0
    public boolean M() {
        kotlin.jvm.internal.g0.o(O().getUpperBounds(), "getUpperBounds(...)");
        return !kotlin.jvm.internal.g0.g(a00.a0.Fc(r0), Object.class);
    }

    @Override // f20.c0
    @m80.l
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public e0 s() {
        Type[] upperBounds = O().getUpperBounds();
        Type[] lowerBounds = O().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + O());
        }
        if (lowerBounds.length == 1) {
            e0.a aVar = e0.f92833a;
            kotlin.jvm.internal.g0.m(lowerBounds);
            Object At = a00.a0.At(lowerBounds);
            kotlin.jvm.internal.g0.o(At, "single(...)");
            return aVar.a((Type) At);
        }
        if (upperBounds.length == 1) {
            kotlin.jvm.internal.g0.m(upperBounds);
            Type type = (Type) a00.a0.At(upperBounds);
            if (!kotlin.jvm.internal.g0.g(type, Object.class)) {
                e0.a aVar2 = e0.f92833a;
                kotlin.jvm.internal.g0.m(type);
                return aVar2.a(type);
            }
        }
        return null;
    }

    @Override // v10.e0
    @m80.k
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public WildcardType O() {
        return this.f92846b;
    }

    @Override // f20.d
    @m80.k
    public Collection<f20.a> getAnnotations() {
        return this.f92847c;
    }

    @Override // f20.d
    public boolean x() {
        return this.f92848d;
    }
}
