package a3;

import java.text.MessageFormat;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    public MessageFormat f1730a;

    /* renamed from: b, reason: collision with root package name */
    public y0 f1731b = new y0();

    public z0(Locale locale, boolean z11) {
        if (z11) {
            this.f1730a = new MessageFormat("", locale);
        }
    }

    public String a(String str, Object... objArr) {
        MessageFormat messageFormat = this.f1730a;
        if (messageFormat == null) {
            return c(str, objArr);
        }
        messageFormat.applyPattern(b(str));
        return this.f1730a.format(objArr);
    }

    public final String b(String str) {
        int i11 = 0;
        this.f1731b.Y0(0);
        int length = str.length();
        boolean z11 = false;
        while (i11 < length) {
            char charAt = str.charAt(i11);
            if (charAt == '\'') {
                this.f1731b.O("''");
                z11 = true;
            } else if (charAt == '{') {
                int i12 = i11 + 1;
                while (i12 < length && str.charAt(i12) == '{') {
                    i12++;
                }
                int i13 = i12 - i11;
                int i14 = i13 / 2;
                if (i14 > 0) {
                    this.f1731b.append('\'');
                    do {
                        this.f1731b.append(l50.b.f69927i);
                        i14--;
                    } while (i14 > 0);
                    this.f1731b.append('\'');
                    z11 = true;
                }
                if (i13 % 2 != 0) {
                    this.f1731b.append(l50.b.f69927i);
                }
                i11 = i12 - 1;
            } else {
                this.f1731b.append(charAt);
            }
            i11++;
        }
        return z11 ? this.f1731b.toString() : str;
    }

    public final String c(String str, Object... objArr) {
        this.f1731b.Y0(0);
        int length = str.length();
        int i11 = 0;
        boolean z11 = false;
        int i12 = -1;
        while (i11 < length) {
            char charAt = str.charAt(i11);
            if (i12 < 0) {
                if (charAt == '{') {
                    int i13 = i11 + 1;
                    if (i13 >= length || str.charAt(i13) != '{') {
                        i12 = 0;
                    } else {
                        this.f1731b.append(charAt);
                        i11 = i13;
                    }
                    z11 = true;
                } else {
                    this.f1731b.append(charAt);
                }
            } else if (charAt == '}') {
                if (i12 >= objArr.length) {
                    throw new IllegalArgumentException("Argument index out of bounds: " + i12);
                }
                if (str.charAt(i11 - 1) == '{') {
                    throw new IllegalArgumentException("Missing argument index after a left curly brace");
                }
                Object obj = objArr[i12];
                if (obj == null) {
                    this.f1731b.O("null");
                } else {
                    this.f1731b.O(obj.toString());
                }
                i12 = -1;
            } else {
                if (charAt < '0' || charAt > '9') {
                    throw new IllegalArgumentException("Unexpected '" + charAt + "' while parsing argument index");
                }
                i12 = (i12 * 10) + (charAt - '0');
            }
            i11++;
        }
        if (i12 < 0) {
            return z11 ? this.f1731b.toString() : str;
        }
        throw new IllegalArgumentException("Unmatched braces in the pattern.");
    }
}
