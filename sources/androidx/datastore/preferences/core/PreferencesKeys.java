package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Set;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "PreferencesKeys")
/* loaded from: classes2.dex */
public final class PreferencesKeys {
    @j(name = "booleanKey")
    @k
    public static final Preferences.Key<Boolean> booleanKey(@k String name) {
        g0.p(name, "name");
        return new Preferences.Key<>(name);
    }

    @j(name = "byteArrayKey")
    @k
    public static final Preferences.Key<byte[]> byteArrayKey(@k String name) {
        g0.p(name, "name");
        return new Preferences.Key<>(name);
    }

    @j(name = "doubleKey")
    @k
    public static final Preferences.Key<Double> doubleKey(@k String name) {
        g0.p(name, "name");
        return new Preferences.Key<>(name);
    }

    @j(name = "floatKey")
    @k
    public static final Preferences.Key<Float> floatKey(@k String name) {
        g0.p(name, "name");
        return new Preferences.Key<>(name);
    }

    @j(name = "intKey")
    @k
    public static final Preferences.Key<Integer> intKey(@k String name) {
        g0.p(name, "name");
        return new Preferences.Key<>(name);
    }

    @j(name = "longKey")
    @k
    public static final Preferences.Key<Long> longKey(@k String name) {
        g0.p(name, "name");
        return new Preferences.Key<>(name);
    }

    @j(name = "stringKey")
    @k
    public static final Preferences.Key<String> stringKey(@k String name) {
        g0.p(name, "name");
        return new Preferences.Key<>(name);
    }

    @j(name = "stringSetKey")
    @k
    public static final Preferences.Key<Set<String>> stringSetKey(@k String name) {
        g0.p(name, "name");
        return new Preferences.Key<>(name);
    }
}
