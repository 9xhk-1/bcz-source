package k20;

import a00.h0;
import a00.i0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTypeTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeTable.kt\norg/jetbrains/kotlin/metadata/deserialization/TypeTable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1567#2:37\n1598#2,4:38\n*S KotlinDebug\n*F\n+ 1 TypeTable.kt\norg/jetbrains/kotlin/metadata/deserialization/TypeTable\n*L\n26#1:37\n26#1:38,4\n*E\n"})
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<ProtoBuf.Type> f65195a;

    public g(@k ProtoBuf.TypeTable typeTable) {
        g0.p(typeTable, "typeTable");
        List<ProtoBuf.Type> typeList = typeTable.getTypeList();
        if (typeTable.hasFirstNullable()) {
            int firstNullable = typeTable.getFirstNullable();
            List<ProtoBuf.Type> typeList2 = typeTable.getTypeList();
            g0.o(typeList2, "getTypeList(...)");
            List<ProtoBuf.Type> list = typeList2;
            ArrayList arrayList = new ArrayList(i0.d0(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    h0.b0();
                }
                ProtoBuf.Type type = (ProtoBuf.Type) obj;
                if (i11 >= firstNullable) {
                    type = type.toBuilder().Y(true).build();
                }
                arrayList.add(type);
                i11 = i12;
            }
            typeList = arrayList;
        }
        g0.o(typeList, "run(...)");
        this.f65195a = typeList;
    }

    @k
    public final ProtoBuf.Type a(int i11) {
        return this.f65195a.get(i11);
    }
}
