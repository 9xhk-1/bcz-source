package i50;

import a00.a0;
import a00.h0;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,508:1\n489#1,2:509\n491#1,2:514\n1878#2,3:511\n*S KotlinDebug\n*F\n+ 1 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n*L\n502#1:509,2\n502#1:514,2\n503#1:511,3\n*E\n"})
/* loaded from: classes8.dex */
public final class i {
    public static final void a(@k h hVar, @k h50.f descriptor, int i11, @k l<? super e, g2> block) {
        g0.p(hVar, "<this>");
        g0.p(descriptor, "descriptor");
        g0.p(block, "block");
        e beginCollection = hVar.beginCollection(descriptor, i11);
        block.invoke(beginCollection);
        beginCollection.endStructure(descriptor);
    }

    public static final <E> void b(@k h hVar, @k h50.f descriptor, @k Collection<? extends E> collection, @k q<? super e, ? super Integer, ? super E, g2> block) {
        g0.p(hVar, "<this>");
        g0.p(descriptor, "descriptor");
        g0.p(collection, "collection");
        g0.p(block, "block");
        e beginCollection = hVar.beginCollection(descriptor, collection.size());
        Iterator<T> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            a0.e eVar = (Object) it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            block.invoke(beginCollection, Integer.valueOf(i11), eVar);
            i11 = i12;
        }
        beginCollection.endStructure(descriptor);
    }

    public static final void c(@k h hVar, @k h50.f descriptor, @k l<? super e, g2> block) {
        g0.p(hVar, "<this>");
        g0.p(descriptor, "descriptor");
        g0.p(block, "block");
        e beginStructure = hVar.beginStructure(descriptor);
        block.invoke(beginStructure);
        beginStructure.endStructure(descriptor);
    }
}
