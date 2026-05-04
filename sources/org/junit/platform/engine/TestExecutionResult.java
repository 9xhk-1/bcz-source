package org.junit.platform.engine;

import ba0.c2;
import ba0.g4;
import java.util.Optional;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class TestExecutionResult {

    /* renamed from: c, reason: collision with root package name */
    public static final TestExecutionResult f78247c = new TestExecutionResult(Status.SUCCESSFUL, null);

    /* renamed from: a, reason: collision with root package name */
    public final Status f78248a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f78249b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Status {
        SUCCESSFUL,
        ABORTED,
        FAILED
    }

    public TestExecutionResult(Status status, Throwable throwable) {
        this.f78248a = (Status) c2.r(status, "Status must not be null");
        this.f78249b = throwable;
    }

    public static TestExecutionResult a(Throwable throwable) {
        return new TestExecutionResult(Status.ABORTED, throwable);
    }

    public static TestExecutionResult b(Throwable throwable) {
        return new TestExecutionResult(Status.FAILED, throwable);
    }

    public static TestExecutionResult e() {
        return f78247c;
    }

    public Status c() {
        return this.f78248a;
    }

    public Optional<Throwable> d() {
        return Optional.ofNullable(this.f78249b);
    }

    public String toString() {
        return new g4(this).a("status", this.f78248a).a("throwable", this.f78249b).toString();
    }
}
