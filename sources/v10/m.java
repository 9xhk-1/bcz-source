package v10;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import v10.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m extends e0 implements f20.f {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Type f92851b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final e0 f92852c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Collection<f20.a> f92853d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f92854e;

    public m(@m80.k Type reflectType) {
        e0 a11;
        kotlin.jvm.internal.g0.p(reflectType, "reflectType");
        this.f92851b = reflectType;
        Type O = O();
        if (!(O instanceof GenericArrayType)) {
            if (O instanceof Class) {
                Class cls = (Class) O;
                if (cls.isArray()) {
                    e0.a aVar = e0.f92833a;
                    Class<?> componentType = cls.getComponentType();
                    kotlin.jvm.internal.g0.o(componentType, "getComponentType(...)");
                    a11 = aVar.a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + O().getClass() + "): " + O());
        }
        e0.a aVar2 = e0.f92833a;
        Type genericComponentType = ((GenericArrayType) O).getGenericComponentType();
        kotlin.jvm.internal.g0.o(genericComponentType, "getGenericComponentType(...)");
        a11 = aVar2.a(genericComponentType);
        this.f92852c = a11;
        this.f92853d = a00.h0.J();
    }

    @Override // v10.e0
    @m80.k
    public Type O() {
        return this.f92851b;
    }

    @Override // f20.f
    @m80.k
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public e0 o() {
        return this.f92852c;
    }

    @Override // f20.d
    @m80.k
    public Collection<f20.a> getAnnotations() {
        return this.f92853d;
    }

    @Override // f20.d
    public boolean x() {
        return this.f92854e;
    }
}
