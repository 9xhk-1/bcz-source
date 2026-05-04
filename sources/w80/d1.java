package w80;

import java.util.Optional;
import java.util.function.Predicate;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final /* synthetic */ class d1 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((Optional) obj).isPresent();
    }
}
