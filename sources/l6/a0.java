package l6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a0 {
    @m80.k
    public static final String a(@m80.k List<t8.f> list) {
        StringBuilder sb2;
        g0.p(list, "<this>");
        if (list.isEmpty()) {
            return "";
        }
        HashMap hashMap = new HashMap();
        for (t8.f fVar : list) {
            String str = fVar.f90019c;
            if (hashMap.containsKey(str)) {
                Object obj = hashMap.get(str);
                g0.m(obj);
                sb2 = (StringBuilder) obj;
                sb2.append(fVar.f90020d);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(fVar.f90020d);
                hashMap.put(str, sb3);
                sb2 = sb3;
            }
            sb2.append("；");
        }
        for (StringBuilder sb4 : hashMap.values()) {
            g0.o(sb4.delete(sb4.length() - 1, sb4.length()), "delete(...)");
        }
        StringBuilder sb5 = new StringBuilder();
        Iterator<t8.f> it = list.iterator();
        while (it.hasNext()) {
            String str2 = it.next().f90019c;
            if (hashMap.containsKey(str2)) {
                sb5.append(str2);
                if (str2.length() > 0) {
                    sb5.append(" ");
                }
                Object obj2 = hashMap.get(str2);
                g0.m(obj2);
                sb5.append((CharSequence) obj2);
                sb5.append("\n");
                hashMap.remove(str2);
            }
        }
        if (sb5.length() > 0) {
            g0.o(sb5.delete(sb5.length() - 1, sb5.length()), "delete(...)");
        }
        String sb6 = sb5.toString();
        g0.o(sb6, "toString(...)");
        return sb6;
    }
}
