package c90;

import c90.o0;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.t2;
import p80.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class o0 implements p80.u, p80.c {

    /* renamed from: d, reason: collision with root package name */
    public static final n.a f8432d = n.a.b(o0.class);

    /* renamed from: a, reason: collision with root package name */
    public final o f8433a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f8434b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8435c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements n.b.a {

        /* renamed from: a, reason: collision with root package name */
        public final AutoCloseable f8436a;

        public a(AutoCloseable autoCloseable) {
            this.f8436a = autoCloseable;
        }

        @Override // p80.n.b.a
        public void close() throws Throwable {
            androidx.documentfile.provider.a.a(this.f8436a);
        }
    }

    public o0(o methodContext, Object[] arguments, int invocationIndex) {
        this.f8433a = methodContext;
        this.f8434b = arguments;
        this.f8435c = invocationIndex;
    }

    public static /* synthetic */ Object M(Object obj) {
        return obj instanceof t2 ? ((t2) obj).a() : obj;
    }

    @Override // p80.c
    public void H(p80.n context) {
        if (((c90.a) org.junit.platform.commons.util.a.m(context.a0(), c90.a.class).get()).autoCloseArguments()) {
            final n.b U = context.U(f8432d);
            final AtomicInteger atomicInteger = new AtomicInteger();
            final Class<AutoCloseable> cls = AutoCloseable.class;
            Arrays.stream(this.f8434b).filter(new Predicate() { // from class: c90.k0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return cls.isInstance(obj);
                }
            }).map(new Function() { // from class: c90.l0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (AutoCloseable) cls.cast(obj);
                }
            }).map(new Function() { // from class: c90.m0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new o0.a((AutoCloseable) obj);
                }
            }).forEach(new Consumer() { // from class: c90.n0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    n.b.this.put("closeableArgument#" + atomicInteger.incrementAndGet(), (o0.a) obj);
                }
            });
        }
    }

    public final Object[] N(Object[] arguments) {
        return Arrays.stream(arguments).map(new Function() { // from class: c90.j0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return o0.M(obj);
            }
        }).toArray();
    }

    @Override // p80.u
    public boolean a(p80.t parameterContext, p80.n extensionContext) {
        Executable c11 = parameterContext.c();
        Method orElse = extensionContext.k().orElse(null);
        int index = parameterContext.getIndex();
        if (!c11.equals(orElse)) {
            return false;
        }
        if (this.f8433a.h(index)) {
            return true;
        }
        return this.f8433a.e() ? index < this.f8433a.g() : index < this.f8434b.length;
    }

    @Override // p80.u
    public Object u(p80.t parameterContext, p80.n extensionContext) throws ParameterResolutionException {
        return this.f8433a.k(parameterContext, N(this.f8434b), this.f8435c);
    }
}
