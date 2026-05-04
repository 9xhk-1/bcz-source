package gi;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public static Pattern f53847a;

    public static List<String> a(String word, String text) {
        if (TextUtils.isEmpty(text)) {
            return Collections.EMPTY_LIST;
        }
        if (f53847a == null) {
            f53847a = Pattern.compile("(-?[a-zA-Z]+-?)");
        }
        Matcher matcher = f53847a.matcher(text);
        ArrayList arrayList = new ArrayList(6);
        int i11 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            if (word.startsWith(group, i11)) {
                arrayList.add(group);
                i11 += group.length();
                if (i11 == word.length()) {
                    return arrayList;
                }
            }
        }
        return Collections.singletonList(word);
    }
}
