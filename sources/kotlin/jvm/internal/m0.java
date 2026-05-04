package kotlin.jvm.internal;

import java.util.Collection;
import kotlin.jvm.KotlinReflectionNotSupportedError;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.y0(version = "1.1")
/* loaded from: classes8.dex */
public final class m0 implements s {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Class<?> f67003a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f67004b;

    public m0(@m80.k Class<?> jClass, @m80.k String moduleName) {
        g0.p(jClass, "jClass");
        g0.p(moduleName, "moduleName");
        this.f67003a = jClass;
        this.f67004b = moduleName;
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof m0) && g0.g(g(), ((m0) obj).g());
    }

    @Override // kotlin.jvm.internal.s
    @m80.k
    public Class<?> g() {
        return this.f67003a;
    }

    public int hashCode() {
        return g().hashCode();
    }

    @Override // h10.h
    @m80.k
    public Collection<h10.c<?>> q() {
        throw new KotlinReflectionNotSupportedError();
    }

    @m80.k
    public String toString() {
        return g().toString() + o0.f67014b;
    }
}
