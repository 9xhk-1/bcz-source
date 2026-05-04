package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "PreferencesFactory")
@u0({"SMAP\nPreferencesFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferencesFactory.kt\nandroidx/datastore/preferences/core/PreferencesFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
/* loaded from: classes2.dex */
public final class PreferencesFactory {
    @j(name = "create")
    @k
    public static final Preferences create(@k Preferences.Pair<?>... pairs) {
        g0.p(pairs, "pairs");
        return createMutable((Preferences.Pair[]) Arrays.copyOf(pairs, pairs.length));
    }

    @j(name = "createEmpty")
    @k
    public static final Preferences createEmpty() {
        return new MutablePreferences(null, true, 1, null);
    }

    @j(name = "createMutable")
    @k
    public static final MutablePreferences createMutable(@k Preferences.Pair<?>... pairs) {
        g0.p(pairs, "pairs");
        MutablePreferences mutablePreferences = new MutablePreferences(null, false, 1, null);
        mutablePreferences.putAll((Preferences.Pair[]) Arrays.copyOf(pairs, pairs.length));
        return mutablePreferences;
    }
}
