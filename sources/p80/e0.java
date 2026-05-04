package p80;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.7", status = API.Status.STABLE)
@FunctionalInterface
/* loaded from: classes9.dex */
public interface e0 extends m {
    @API(since = "5.10", status = API.Status.STABLE)
    static void I(n context, Consumer<Object> callback) {
        final ArrayList arrayList = new ArrayList(context.r().a());
        while (true) {
            Optional<n> parent = context.getParent();
            if (!parent.isPresent()) {
                Collections.reverse(arrayList);
                arrayList.forEach(callback);
                return;
            } else {
                parent.get().I().map(new Function() { // from class: p80.c0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((f0) obj).a();
                    }
                }).ifPresent(new Consumer() { // from class: p80.d0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        arrayList.removeAll((List) obj);
                    }
                });
                context = parent.get();
            }
        }
    }

    void f(n context) throws Exception;
}
