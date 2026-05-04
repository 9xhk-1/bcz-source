package ko;

import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@f
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final char[][] f66886b = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final char[][] f66887a;

    public b(char[][] replacementArray) {
        this.f66887a = replacementArray;
    }

    public static b a(Map<Character, String> replacements) {
        return new b(b(replacements));
    }

    @go.e
    public static char[][] b(Map<Character, String> map) {
        Preconditions.checkNotNull(map);
        if (map.isEmpty()) {
            return f66886b;
        }
        char[][] cArr = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
        for (Character ch2 : map.keySet()) {
            cArr[ch2.charValue()] = map.get(ch2).toCharArray();
        }
        return cArr;
    }

    public char[][] c() {
        return this.f66887a;
    }
}
