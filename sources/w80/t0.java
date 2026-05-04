package w80;

import java.util.Optional;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class t0 implements p80.z {

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f95933a;

    /* renamed from: b, reason: collision with root package name */
    public final Optional<Object> f95934b;

    public t0(Class<?> testClass, Optional<Object> outerInstance) {
        this.f95933a = testClass;
        this.f95934b = outerInstance;
    }

    @Override // p80.z
    public Optional<Object> a() {
        return this.f95934b;
    }

    @Override // p80.z
    public Class<?> c() {
        return this.f95933a;
    }

    public String toString() {
        return new ba0.g4(this).a("testClass", this.f95933a).a("outerInstance", this.f95934b).toString();
    }
}
