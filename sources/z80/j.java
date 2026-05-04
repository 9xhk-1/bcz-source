package z80;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ba0.c2;
import ba0.g4;
import java.lang.annotation.Annotation;
import java.lang.reflect.Parameter;
import java.util.List;
import java.util.Optional;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class j implements p80.t {

    /* renamed from: a, reason: collision with root package name */
    public final Parameter f102379a;

    /* renamed from: b, reason: collision with root package name */
    public final int f102380b;

    /* renamed from: c, reason: collision with root package name */
    public final Optional<Object> f102381c;

    public j(Parameter parameter, int index, Optional<Object> target) {
        c2.e(index >= 0, "index must be greater than or equal to zero");
        this.f102379a = i.a(c2.r(parameter, "parameter must not be null"));
        this.f102380b = index;
        this.f102381c = (Optional) c2.r(target, "target must not be null");
    }

    @Override // p80.t
    public Parameter b() {
        return this.f102379a;
    }

    @Override // p80.t, p80.d
    public <A extends Annotation> List<A> d(Class<A> annotationType) {
        return org.junit.platform.commons.util.a.t(this.f102379a, this.f102380b, annotationType);
    }

    @Override // p80.t, p80.d
    public boolean e(Class<? extends Annotation> annotationType) {
        return org.junit.platform.commons.util.a.z(this.f102379a, this.f102380b, annotationType);
    }

    @Override // p80.t, p80.d
    public <A extends Annotation> Optional<A> f(Class<A> annotationType) {
        return org.junit.platform.commons.util.a.o(this.f102379a, this.f102380b, annotationType);
    }

    @Override // p80.t
    public int getIndex() {
        return this.f102380b;
    }

    @Override // p80.t
    public Optional<Object> getTarget() {
        return this.f102381c;
    }

    public String toString() {
        return new g4(this).a("parameter", this.f102379a).a("index", Integer.valueOf(this.f102380b)).a(TypedValues.AttributesType.S_TARGET, this.f102381c).toString();
    }
}
