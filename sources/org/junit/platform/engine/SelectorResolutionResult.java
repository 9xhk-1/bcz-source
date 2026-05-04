package org.junit.platform.engine;

import ba0.g4;
import java.util.Optional;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.10", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class SelectorResolutionResult {

    /* renamed from: c, reason: collision with root package name */
    public static final SelectorResolutionResult f78243c = new SelectorResolutionResult(Status.RESOLVED, null);

    /* renamed from: d, reason: collision with root package name */
    public static final SelectorResolutionResult f78244d = new SelectorResolutionResult(Status.UNRESOLVED, null);

    /* renamed from: a, reason: collision with root package name */
    public final Status f78245a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f78246b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Status {
        RESOLVED,
        UNRESOLVED,
        FAILED
    }

    public SelectorResolutionResult(Status status, Throwable throwable) {
        this.f78245a = status;
        this.f78246b = throwable;
    }

    public static SelectorResolutionResult a(Throwable throwable) {
        return new SelectorResolutionResult(Status.FAILED, throwable);
    }

    public static SelectorResolutionResult d() {
        return f78243c;
    }

    public static SelectorResolutionResult e() {
        return f78244d;
    }

    public Status b() {
        return this.f78245a;
    }

    public Optional<Throwable> c() {
        return Optional.ofNullable(this.f78246b);
    }

    public String toString() {
        return new g4(this).a("status", this.f78245a).a("throwable", this.f78246b).toString();
    }
}
