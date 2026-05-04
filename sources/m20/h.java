package m20;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {
    @k
    public static final List<JvmProtoBuf.StringTableTypes.Record> a(@k List<JvmProtoBuf.StringTableTypes.Record> list) {
        g0.p(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (JvmProtoBuf.StringTableTypes.Record record : list) {
            int range = record.getRange();
            for (int i11 = 0; i11 < range; i11++) {
                arrayList.add(record);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
