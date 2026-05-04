package v10;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c0 extends e0 implements f20.v {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Class<?> f92827b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Collection<f20.a> f92828c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f92829d;

    public c0(@m80.k Class<?> reflectType) {
        kotlin.jvm.internal.g0.p(reflectType, "reflectType");
        this.f92827b = reflectType;
        this.f92828c = a00.h0.J();
    }

    @Override // v10.e0
    @m80.k
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public Class<?> O() {
        return this.f92827b;
    }

    @Override // f20.d
    @m80.k
    public Collection<f20.a> getAnnotations() {
        return this.f92828c;
    }

    @Override // f20.v
    @m80.l
    public PrimitiveType getType() {
        if (kotlin.jvm.internal.g0.g(O(), Void.TYPE)) {
            return null;
        }
        return JvmPrimitiveType.get(O().getName()).getPrimitiveType();
    }

    @Override // f20.d
    public boolean x() {
        return this.f92829d;
    }
}
