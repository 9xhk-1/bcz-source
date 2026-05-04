package ca0;

import java.util.List;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface q {
    <T extends l> List<T> a(Class<T> selectorType);

    <T extends k<?>> List<T> b(Class<T> filterType);

    @API(since = "1.10", status = API.Status.STABLE)
    default p c() {
        return p.f8471a;
    }

    j d();
}
