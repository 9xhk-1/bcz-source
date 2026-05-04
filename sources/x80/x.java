package x80;

import androidx.camera.core.CameraInfo;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import org.junit.jupiter.api.g3;
import org.junit.platform.commons.util.ReflectionUtils;
import org.junit.platform.engine.TestDescriptor;
import w80.l2;
import x80.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class x extends n<l2, w80.o0, o0> {

    /* renamed from: b, reason: collision with root package name */
    public final v80.e0 f97899b;

    public x(v80.e0 configuration) {
        this.f97899b = configuration;
    }

    public static /* synthetic */ String k(l2 l2Var) {
        return "Failed to order classes";
    }

    public static /* synthetic */ org.junit.jupiter.api.f1 n(Class cls) {
        return (org.junit.jupiter.api.f1) ReflectionUtils.x1(cls, new Object[0]);
    }

    public static String q(org.junit.jupiter.api.f1 classOrderer) {
        return classOrderer != null ? classOrderer.getClass().getName() : CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN;
    }

    @Override // org.junit.platform.engine.TestDescriptor.a
    public void a(TestDescriptor testDescriptor) {
        final org.junit.jupiter.api.f1 orElse = this.f97899b.e().orElse(null);
        f(l2.class, testDescriptor, new Consumer() { // from class: x80.p
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                x.this.r((l2) obj, orElse);
            }
        }, new Function() { // from class: x80.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return x.k((l2) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.reflect.AnnotatedElement] */
    @Override // x80.n
    public n<l2, w80.o0, o0>.a g(n<l2, w80.o0, o0>.a inheritedDescriptorWrapperOrderer, a<?> descriptorWrapper) {
        return (n.a) org.junit.platform.commons.util.a.m(descriptorWrapper.b(), g3.class).map(new Function() { // from class: x80.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((g3) obj).value();
            }
        }).map(new Function() { // from class: x80.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return x.n((Class) obj);
            }
        }).map(new Function() { // from class: x80.t
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                n.a p11;
                p11 = x.this.p((org.junit.jupiter.api.f1) obj);
                return p11;
            }
        }).orElse(inheritedDescriptorWrapperOrderer);
    }

    public final n<l2, w80.o0, o0>.a p(final org.junit.jupiter.api.f1 classOrderer) {
        return new n.a(classOrderer == null ? null : new Consumer() { // from class: x80.u
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                classOrderer.a(new p0((List) obj, x.this.f97899b));
            }
        }, new n.b() { // from class: x80.v
            @Override // x80.n.b
            public final String a(int i11) {
                String format;
                format = String.format("ClassOrderer [%s] added %s ClassDescriptor(s) which will be ignored.", x.q(org.junit.jupiter.api.f1.this), Integer.valueOf(i11));
                return format;
            }
        }, new n.b() { // from class: x80.w
            @Override // x80.n.b
            public final String a(int i11) {
                String format;
                format = String.format("ClassOrderer [%s] removed %s ClassDescriptor(s) which will be retained with arbitrary ordering.", x.q(org.junit.jupiter.api.f1.this), Integer.valueOf(i11));
                return format;
            }
        });
    }

    public final void r(l2 jupiterEngineDescriptor, org.junit.jupiter.api.f1 classOrderer) {
        h(jupiterEngineDescriptor, w80.o0.class, new Function() { // from class: x80.o
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new o0((w80.o0) obj);
            }
        }, p(classOrderer));
    }
}
