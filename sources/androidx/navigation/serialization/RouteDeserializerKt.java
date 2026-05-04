package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavType;
import f50.i;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class RouteDeserializerKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> T decodeArguments(@k i<T> iVar, @k Bundle bundle, @k Map<String, ? extends NavType<?>> typeMap) {
        g0.p(iVar, "<this>");
        g0.p(bundle, "bundle");
        g0.p(typeMap, "typeMap");
        return (T) new RouteDecoder(bundle, typeMap).decodeRouteWithArgs$navigation_common_release(iVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> T decodeArguments(@k i<T> iVar, @k SavedStateHandle handle, @k Map<String, ? extends NavType<?>> typeMap) {
        g0.p(iVar, "<this>");
        g0.p(handle, "handle");
        g0.p(typeMap, "typeMap");
        return (T) new RouteDecoder(handle, typeMap).decodeRouteWithArgs$navigation_common_release(iVar);
    }
}
