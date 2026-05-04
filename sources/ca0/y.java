package ca0;

import androidx.camera.core.CameraInfo;
import ba0.g4;
import java.util.Optional;
import java.util.function.Supplier;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8479a;

    /* renamed from: b, reason: collision with root package name */
    public final Optional<String> f8480b;

    public y(boolean included, String reason) {
        this.f8479a = included;
        this.f8480b = Optional.ofNullable(reason);
    }

    public static /* synthetic */ String a() {
        return null;
    }

    public static /* synthetic */ String b() {
        return null;
    }

    public static y c(String reason) {
        return new y(false, reason);
    }

    public static y f(String reason) {
        return new y(true, reason);
    }

    public static y h(boolean included) {
        return i(included, new Supplier() { // from class: ca0.w
            @Override // java.util.function.Supplier
            public final Object get() {
                return y.b();
            }
        }, new Supplier() { // from class: ca0.x
            @Override // java.util.function.Supplier
            public final Object get() {
                return y.a();
            }
        });
    }

    public static y i(boolean included, Supplier<String> inclusionReasonSupplier, Supplier<String> exclusionReasonSupplier) {
        return included ? f(inclusionReasonSupplier.get()) : c(exclusionReasonSupplier.get());
    }

    public boolean d() {
        return !g();
    }

    public Optional<String> e() {
        return this.f8480b;
    }

    public boolean g() {
        return this.f8479a;
    }

    public String toString() {
        return new g4(this).a("included", Boolean.valueOf(this.f8479a)).a("reason", this.f8480b.orElse(CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN)).toString();
    }
}
