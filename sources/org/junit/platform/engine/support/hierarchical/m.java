package org.junit.platform.engine.support.hierarchical;

import ba0.c2;
import ba0.h4;
import ba0.o1;
import java.util.function.Predicate;
import org.apiguardian.api.API;
import org.junit.platform.engine.TestExecutionResult;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.3", status = API.Status.MAINTAINED)
/* loaded from: classes9.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final Predicate<? super Throwable> f78316a;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f78317b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @FunctionalInterface
    public interface a {
        void execute() throws Throwable;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        m create();
    }

    public m(Predicate<? super Throwable> abortedExecutionPredicate) {
        this.f78316a = (Predicate) c2.r(abortedExecutionPredicate, "abortedExecutionPredicate must not be null");
    }

    public final void a(Throwable t11) {
        c2.r(t11, "Throwable must not be null");
        Throwable th2 = this.f78317b;
        if (th2 == null) {
            this.f78317b = t11;
            return;
        }
        if (e(th2) && !e(t11)) {
            t11.addSuppressed(this.f78317b);
            this.f78317b = t11;
        } else {
            Throwable th3 = this.f78317b;
            if (th3 != t11) {
                th3.addSuppressed(t11);
            }
        }
    }

    public void b() {
        if (!f()) {
            throw o1.e(this.f78317b);
        }
    }

    public void c(a executable) {
        try {
            executable.execute();
        } catch (Throwable th2) {
            h4.a(th2);
            a(th2);
        }
    }

    public Throwable d() {
        return this.f78317b;
    }

    public final boolean e(Throwable t11) {
        return this.f78316a.test(t11);
    }

    public boolean f() {
        return this.f78317b == null;
    }

    public boolean g() {
        return this.f78317b != null;
    }

    @API(since = "1.6", status = API.Status.MAINTAINED)
    public TestExecutionResult h() {
        return f() ? TestExecutionResult.e() : e(this.f78317b) ? TestExecutionResult.a(this.f78317b) : TestExecutionResult.b(this.f78317b);
    }
}
