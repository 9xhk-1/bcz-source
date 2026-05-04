package ko;

import com.google.common.base.Preconditions;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@f
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public int f66896b = -1;

    /* renamed from: a, reason: collision with root package name */
    public final Map<Character, String> f66895a = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends d {

        /* renamed from: c, reason: collision with root package name */
        public final char[][] f66897c;

        /* renamed from: d, reason: collision with root package name */
        public final int f66898d;

        public a(char[][] replacements) {
            this.f66897c = replacements;
            this.f66898d = replacements.length;
        }

        @Override // ko.d, ko.h
        public String b(String s11) {
            int length = s11.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = s11.charAt(i11);
                char[][] cArr = this.f66897c;
                if (charAt < cArr.length && cArr[charAt] != null) {
                    return d(s11, i11);
                }
            }
            return s11;
        }

        @Override // ko.d
        @CheckForNull
        public char[] c(char c11) {
            if (c11 < this.f66898d) {
                return this.f66897c[c11];
            }
            return null;
        }
    }

    @uo.a
    public e a(char c11, String r11) {
        this.f66895a.put(Character.valueOf(c11), (String) Preconditions.checkNotNull(r11));
        if (c11 > this.f66896b) {
            this.f66896b = c11;
        }
        return this;
    }

    @uo.a
    public e b(char[] cs2, String r11) {
        Preconditions.checkNotNull(r11);
        for (char c11 : cs2) {
            a(c11, r11);
        }
        return this;
    }

    public char[][] c() {
        char[][] cArr = new char[this.f66896b + 1][];
        for (Map.Entry<Character, String> entry : this.f66895a.entrySet()) {
            cArr[entry.getKey().charValue()] = entry.getValue().toCharArray();
        }
        return cArr;
    }

    public h d() {
        return new a(c());
    }
}
