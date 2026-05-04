package p80;

import java.util.Collections;
import java.util.List;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface g0 {
    default String a(int invocationIndex) {
        return "[" + invocationIndex + "]";
    }

    default List<m> b() {
        return Collections.EMPTY_LIST;
    }
}
