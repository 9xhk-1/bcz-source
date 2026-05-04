package a90;

import ba0.g4;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.lang.reflect.Method;
import java.util.Optional;
import java.util.Set;
import org.junit.jupiter.api.i3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class r1 implements p80.u {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements i3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f2433a;

        /* renamed from: b, reason: collision with root package name */
        public final Set<String> f2434b;

        /* renamed from: c, reason: collision with root package name */
        public final Optional<Class<?>> f2435c;

        /* renamed from: d, reason: collision with root package name */
        public final Optional<Method> f2436d;

        public a(p80.n extensionContext) {
            this.f2433a = extensionContext.a();
            this.f2434b = extensionContext.f();
            this.f2435c = extensionContext.c();
            this.f2436d = extensionContext.k();
        }

        public static Object b(Optional<?> optional) {
            if (optional != null) {
                return optional.orElse(null);
            }
            return null;
        }

        @Override // org.junit.jupiter.api.i3
        public String a() {
            return this.f2433a;
        }

        @Override // org.junit.jupiter.api.i3
        public Optional<Class<?>> c() {
            return this.f2435c;
        }

        @Override // org.junit.jupiter.api.i3
        public Set<String> f() {
            return this.f2434b;
        }

        @Override // org.junit.jupiter.api.i3
        public Optional<Method> k() {
            return this.f2436d;
        }

        public String toString() {
            return new g4(this).a(CommonConstant.KEY_DISPLAY_NAME, this.f2433a).a("tags", this.f2434b).a("testClass", b(this.f2435c)).a("testMethod", b(this.f2436d)).toString();
        }
    }

    @Override // p80.u
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public i3 u(p80.t parameterContext, p80.n extensionContext) {
        return new a(extensionContext);
    }

    @Override // p80.u
    public boolean a(p80.t parameterContext, p80.n extensionContext) {
        Class type;
        type = parameterContext.b().getType();
        return type == i3.class;
    }
}
