package androidx.navigation;

import a00.k1;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.serialization.RouteDeserializerKt;
import f50.k0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNavBackStackEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntryKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,309:1\n453#2:310\n403#2:311\n1238#3,4:312\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntryKt\n*L\n306#1:310\n306#1:311\n306#1:312,4\n*E\n"})
/* loaded from: classes3.dex */
public final class NavBackStackEntryKt {
    public static final /* synthetic */ <T> T toRoute(NavBackStackEntry navBackStackEntry) {
        g0.p(navBackStackEntry, "<this>");
        Bundle arguments = navBackStackEntry.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        Map<String, NavArgument> arguments2 = navBackStackEntry.getDestination().getArguments();
        LinkedHashMap linkedHashMap = new LinkedHashMap(k1.j(arguments2.size()));
        Iterator<T> it = arguments2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).getType());
        }
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.simple");
        return (T) RouteDeserializerKt.decodeArguments(k0.j(null), arguments, linkedHashMap);
    }
}
