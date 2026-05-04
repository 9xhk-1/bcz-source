package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class UNKNOWN extends NavType<String> {

    @k
    public static final UNKNOWN INSTANCE = new UNKNOWN();

    private UNKNOWN() {
        super(false);
    }

    @Override // androidx.navigation.NavType
    @l
    public String get(@k Bundle bundle, @k String key) {
        g0.p(bundle, "bundle");
        g0.p(key, "key");
        return null;
    }

    @Override // androidx.navigation.NavType
    @k
    public String getName() {
        return "unknown";
    }

    @Override // androidx.navigation.NavType
    public void put(@k Bundle bundle, @k String key, @k String value) {
        g0.p(bundle, "bundle");
        g0.p(key, "key");
        g0.p(value, "value");
    }

    @Override // androidx.navigation.NavType
    @k
    public String parseValue(@k String value) {
        g0.p(value, "value");
        return "null";
    }
}
