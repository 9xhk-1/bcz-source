package a90;

import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;
import org.junit.jupiter.api.m0;
import p80.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class q0<T> implements q.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final q.a<T> f2429a;

    /* renamed from: b, reason: collision with root package name */
    public final k2 f2430b;

    /* renamed from: c, reason: collision with root package name */
    public final Supplier<String> f2431c;

    public q0(q.a<T> delegate, k2 timeout, Supplier<String> descriptionSupplier) {
        this.f2429a = delegate;
        this.f2430b = timeout;
        this.f2431c = descriptionSupplier;
    }

    public static /* synthetic */ TimeoutException a(q0 q0Var, Duration duration, Supplier supplier, Throwable th2) {
        q0Var.getClass();
        TimeoutException b11 = n2.b((String) supplier.get(), q0Var.f2430b, null);
        b11.initCause(th2);
        return b11;
    }

    @Override // p80.q.a
    public T b() throws Throwable {
        Duration f11 = this.f2430b.f();
        final q.a<T> aVar = this.f2429a;
        Objects.requireNonNull(aVar);
        return (T) org.junit.jupiter.api.m0.q4(f11, new r80.c() { // from class: a90.o0
            @Override // r80.c
            public final Object get() {
                return q.a.this.b();
            }
        }, this.f2431c, new m0.a() { // from class: a90.p0
            @Override // org.junit.jupiter.api.m0.a
            public final Throwable a(Duration duration, Supplier supplier, Throwable th2) {
                return q0.a(q0.this, duration, supplier, th2);
            }
        });
    }
}
