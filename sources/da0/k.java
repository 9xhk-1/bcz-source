package da0;

import java.util.Optional;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.11", status = API.Status.EXPERIMENTAL)
/* loaded from: classes9.dex */
public interface k {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        Optional<? extends ca0.l> parse(String selector);
    }

    Optional<? extends ca0.l> a(ca0.o identifier, a context);

    String getPrefix();
}
