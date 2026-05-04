package p80;

import a90.c3;
import androidx.camera.core.CameraInfo;
import ba0.e4;
import ba0.g4;
import java.util.Optional;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f80293a;

    /* renamed from: b, reason: collision with root package name */
    public final Optional<String> f80294b;

    public h(boolean enabled, String reason) {
        this.f80293a = enabled;
        this.f80294b = Optional.ofNullable(reason);
    }

    public static h a(String reason) {
        return new h(false, reason);
    }

    @API(since = "5.7", status = API.Status.STABLE)
    public static h b(String reason, String customReason) {
        return e4.g(customReason) ? a(reason) : a(String.format("%s ==> %s", reason, customReason));
    }

    public static h c(String reason) {
        return new h(true, reason);
    }

    public Optional<String> d() {
        return this.f80294b;
    }

    public boolean e() {
        return !this.f80293a;
    }

    public String toString() {
        return new g4(this).a(c3.f2342e, Boolean.valueOf(this.f80293a)).a("reason", this.f80294b.orElse(CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN)).toString();
    }
}
