package a90;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public interface o {
    <E extends p80.m> Stream<E> a(Class<E> extensionType);

    default <E extends p80.m> List<E> c(Class<E> extensionType) {
        return (List) a(extensionType).collect(Collectors.toCollection(new x80.e()));
    }
}
