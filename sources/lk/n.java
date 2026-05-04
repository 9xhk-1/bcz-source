package lk;

import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class n<K, V> extends TreeMap<K, V> {
    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("( ");
        for (Map.Entry<K, V> entry : entrySet()) {
            sb2.append(l50.b.f69927i);
            sb2.append(entry.getKey());
            sb2.append(':');
            sb2.append(entry.getValue());
            sb2.append("}, ");
        }
        if (!isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
