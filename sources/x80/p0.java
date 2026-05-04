package x80;

import java.util.List;
import java.util.Optional;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class p0 implements org.junit.jupiter.api.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final List<? extends org.junit.jupiter.api.d1> f97878a;

    /* renamed from: b, reason: collision with root package name */
    public final v80.e0 f97879b;

    public p0(List<? extends org.junit.jupiter.api.d1> classDescriptors, v80.e0 configuration) {
        this.f97878a = classDescriptors;
        this.f97879b = configuration;
    }

    @Override // org.junit.jupiter.api.l1
    public Optional<String> i(String key) {
        return this.f97879b.h(key);
    }

    @Override // org.junit.jupiter.api.l1
    public List<? extends org.junit.jupiter.api.d1> j() {
        return this.f97878a;
    }
}
