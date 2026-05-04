package androidx.datastore.preferences.core;

import a00.l1;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class Preferences {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Key<T> {

        @k
        private final String name;

        public Key(@k String name) {
            g0.p(name, "name");
            this.name = name;
        }

        public boolean equals(@l Object obj) {
            if (obj instanceof Key) {
                return g0.g(this.name, ((Key) obj).name);
            }
            return false;
        }

        @k
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @k
        public final Pair<T> to(T t11) {
            return new Pair<>(this, t11);
        }

        @k
        public String toString() {
            return this.name;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Pair<T> {

        @k
        private final Key<T> key;
        private final T value;

        public Pair(@k Key<T> key, T t11) {
            g0.p(key, "key");
            this.key = key;
            this.value = t11;
        }

        @k
        public final Key<T> getKey$datastore_preferences_core_release() {
            return this.key;
        }

        public final T getValue$datastore_preferences_core_release() {
            return this.value;
        }
    }

    @k
    public abstract Map<Key<?>, Object> asMap();

    public abstract <T> boolean contains(@k Key<T> key);

    @l
    public abstract <T> T get(@k Key<T> key);

    @k
    public final MutablePreferences toMutablePreferences() {
        return new MutablePreferences(l1.J0(asMap()), false);
    }

    @k
    public final Preferences toPreferences() {
        return new MutablePreferences(l1.J0(asMap()), true);
    }
}
