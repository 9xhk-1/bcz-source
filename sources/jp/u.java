package jp;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class u extends t {
    public static void q(Collection<String> collection, Collection<String> collection2, String str) {
        int indexOf = str.indexOf(59);
        if (indexOf < 0) {
            collection.add(str);
            collection2.add(null);
        } else {
            collection.add(str.substring(0, indexOf));
            String substring = str.substring(indexOf + 1);
            collection2.add(substring.startsWith("via=") ? substring.substring(4) : null);
        }
    }

    @Override // jp.t
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public v k(com.google.zxing.k kVar) {
        boolean z11;
        String str;
        String c11 = t.c(kVar);
        String str2 = null;
        if (!c11.startsWith("sms:") && !c11.startsWith("SMS:") && !c11.startsWith("mms:") && !c11.startsWith("MMS:")) {
            return null;
        }
        Map<String, String> m11 = t.m(c11);
        if (m11 == null || m11.isEmpty()) {
            z11 = false;
            str = null;
        } else {
            str2 = m11.get("subject");
            str = m11.get(TtmlNode.TAG_BODY);
            z11 = true;
        }
        int indexOf = c11.indexOf(63, 4);
        String substring = (indexOf < 0 || !z11) ? c11.substring(4) : c11.substring(4, indexOf);
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        int i11 = -1;
        while (true) {
            int i12 = i11 + 1;
            int indexOf2 = substring.indexOf(44, i12);
            if (indexOf2 <= i11) {
                q(arrayList, arrayList2, substring.substring(i12));
                return new v((String[]) arrayList.toArray(new String[arrayList.size()]), (String[]) arrayList2.toArray(new String[arrayList2.size()]), str2, str);
            }
            q(arrayList, arrayList2, substring.substring(i12, indexOf2));
            i11 = indexOf2;
        }
    }
}
