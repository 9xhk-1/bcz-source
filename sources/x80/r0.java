package x80;

import ba0.g4;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.k2;
import org.junit.jupiter.api.s2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class r0 implements s2 {

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f97881a;

    /* renamed from: b, reason: collision with root package name */
    public final List<? extends k2> f97882b;

    /* renamed from: c, reason: collision with root package name */
    public final v80.e0 f97883c;

    public r0(Class<?> testClass, List<? extends k2> methodDescriptors, v80.e0 configuration) {
        this.f97881a = testClass;
        this.f97882b = methodDescriptors;
        this.f97883c = configuration;
    }

    @Override // org.junit.jupiter.api.s2
    public List<? extends k2> a() {
        return this.f97882b;
    }

    @Override // org.junit.jupiter.api.s2
    public final Class<?> c() {
        return this.f97881a;
    }

    @Override // org.junit.jupiter.api.s2
    public Optional<String> i(String key) {
        return this.f97883c.h(key);
    }

    public String toString() {
        return new g4(this).a("testClass", this.f97881a.getName()).toString();
    }
}
