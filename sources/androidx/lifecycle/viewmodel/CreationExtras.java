package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class CreationExtras {

    @k
    private final Map<Key<?>, Object> map = new LinkedHashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Empty extends CreationExtras {

        @k
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        @l
        public <T> T get(@k Key<T> key) {
            g0.p(key, "key");
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Key<T> {
    }

    @l
    public abstract <T> T get(@k Key<T> key);

    @k
    public final Map<Key<?>, Object> getMap$lifecycle_viewmodel_release() {
        return this.map;
    }
}
