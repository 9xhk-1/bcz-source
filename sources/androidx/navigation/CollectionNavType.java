package androidx.navigation;

import java.util.List;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class CollectionNavType<T> extends NavType<T> {
    public CollectionNavType(boolean z11) {
        super(z11);
    }

    public abstract T emptyCollection();

    @k
    public abstract List<String> serializeAsValues(T t11);
}
