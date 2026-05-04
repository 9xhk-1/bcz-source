package l9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {
    public static List<Integer> a(List<String> tos) {
        if (tos == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(tos.size());
        try {
            Iterator<String> it = tos.iterator();
            while (it.hasNext()) {
                Integer valueOf = Integer.valueOf(it.next());
                valueOf.intValue();
                arrayList.add(valueOf);
            }
            return arrayList;
        } catch (NumberFormatException e11) {
            qb.c.c("", "invalid convert. ", e11);
            return null;
        }
    }
}
