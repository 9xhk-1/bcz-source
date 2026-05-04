package gj;

import java.util.List;
import xb.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {
    public static String a(List<String> exams) {
        if (e.h(exams)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : exams) {
            if (sb2.length() <= 0) {
                sb2.append(str);
            } else {
                sb2.append(" / ");
                sb2.append(str);
            }
        }
        return sb2.toString();
    }
}
