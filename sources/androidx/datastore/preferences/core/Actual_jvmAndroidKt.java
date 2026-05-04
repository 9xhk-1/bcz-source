package androidx.datastore.preferences.core;

import a00.r0;
import androidx.annotation.RestrictTo;
import c40.h1;
import c40.m0;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class Actual_jvmAndroidKt {
    @k
    public static final <T> Set<T> immutableCopyOfSet(@k Set<? extends T> set) {
        g0.p(set, "set");
        Set<T> unmodifiableSet = Collections.unmodifiableSet(r0.f6(set));
        g0.o(unmodifiableSet, "unmodifiableSet(set.toSet())");
        return unmodifiableSet;
    }

    @k
    public static final <K, V> Map<K, V> immutableMap(@k Map<K, ? extends V> map) {
        g0.p(map, "map");
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(map);
        g0.o(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    @k
    public static final m0 ioDispatcher() {
        return h1.c();
    }
}
