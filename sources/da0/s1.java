package da0;

import java.util.List;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface s1 extends ca0.k<String> {
    static s1 b(String... names) {
        return new t0(names);
    }

    static s1 c(List<String> names) {
        return b((String[]) names.toArray(new String[0]));
    }

    static s1 f(List<String> names) {
        return l((String[]) names.toArray(new String[0]));
    }

    static s1 l(String... names) {
        return new g0(names);
    }
}
