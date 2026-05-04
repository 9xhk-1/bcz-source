package androidx.navigation;

import a00.l1;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.serialization.RouteDeserializerKt;
import androidx.navigation.serialization.RouteSerializerKt;
import f50.i;
import f50.k0;
import h10.d;
import h10.r;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/navigation/SavedStateHandleKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n2634#2:54\n1#3:55\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/navigation/SavedStateHandleKt\n*L\n50#1:54\n50#1:55\n*E\n"})
/* loaded from: classes3.dex */
public final class SavedStateHandleKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public static final <T> T internalToRoute(@k SavedStateHandle savedStateHandle, @k d<T> route, @k Map<r, ? extends NavType<?>> typeMap) {
        g0.p(savedStateHandle, "<this>");
        g0.p(route, "route");
        g0.p(typeMap, "typeMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i h11 = k0.h(route);
        for (NamedNavArgument namedNavArgument : RouteSerializerKt.generateNavArguments(h11, typeMap)) {
            linkedHashMap.put(namedNavArgument.getName(), namedNavArgument.getArgument().getType());
        }
        return (T) RouteDeserializerKt.decodeArguments(h11, savedStateHandle, linkedHashMap);
    }

    public static final /* synthetic */ <T> T toRoute(SavedStateHandle savedStateHandle, Map<r, NavType<?>> typeMap) {
        g0.p(savedStateHandle, "<this>");
        g0.p(typeMap, "typeMap");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) internalToRoute(savedStateHandle, o0.d(Object.class), typeMap);
    }

    public static /* synthetic */ Object toRoute$default(SavedStateHandle savedStateHandle, Map typeMap, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            typeMap = l1.z();
        }
        g0.p(savedStateHandle, "<this>");
        g0.p(typeMap, "typeMap");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return internalToRoute(savedStateHandle, o0.d(Object.class), typeMap);
    }
}
