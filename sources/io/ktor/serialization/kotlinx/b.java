package io.ktor.serialization.kotlinx;

import f50.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nio/ktor/serialization/kotlinx/ExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1611#2,9:41\n1863#2:50\n1864#2:52\n1620#2:53\n1#3:51\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nio/ktor/serialization/kotlinx/ExtensionsKt\n*L\n17#1:41,9\n17#1:50\n17#1:52\n17#1:53\n17#1:51\n*E\n"})
/* loaded from: classes8.dex */
public final class b {
    @k
    public static final List<d> a(@k w format) {
        g0.p(format, "format");
        List<e> a11 = a.a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = a11.iterator();
        while (it.hasNext()) {
            d a12 = ((e) it.next()).a(format);
            if (a12 != null) {
                arrayList.add(a12);
            }
        }
        return arrayList;
    }
}
