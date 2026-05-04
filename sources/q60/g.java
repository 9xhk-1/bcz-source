package q60;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g implements n60.g {

    /* renamed from: b, reason: collision with root package name */
    public static final String f81813b = "AEIOU";

    /* renamed from: c, reason: collision with root package name */
    public static final String f81814c = "EIY";

    /* renamed from: d, reason: collision with root package name */
    public static final String f81815d = "CSPTG";

    /* renamed from: a, reason: collision with root package name */
    public int f81816a = 4;

    @Override // n60.g
    public String a(String str) {
        return h(str);
    }

    public int b() {
        return this.f81816a;
    }

    public final boolean c(int i11, int i12) {
        return i12 + 1 == i11;
    }

    public boolean d(String str, String str2) {
        return h(str).equals(h(str2));
    }

    public final boolean e(StringBuffer stringBuffer, int i11, char c11) {
        return i11 >= 0 && i11 < stringBuffer.length() - 1 && stringBuffer.charAt(i11 + 1) == c11;
    }

    @Override // n60.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return h((String) obj);
        }
        throw new EncoderException("Parameter supplied to Metaphone encode is not of type java.lang.String");
    }

    public final boolean f(StringBuffer stringBuffer, int i11, char c11) {
        return i11 > 0 && i11 < stringBuffer.length() && stringBuffer.charAt(i11 - 1) == c11;
    }

    public final boolean g(StringBuffer stringBuffer, int i11) {
        return f81813b.indexOf(stringBuffer.charAt(i11)) >= 0;
    }

    public String h(String str) {
        boolean z11;
        if (str == null || str.length() == 0) {
            return "";
        }
        boolean z12 = true;
        if (str.length() == 1) {
            return str.toUpperCase(Locale.ENGLISH);
        }
        char[] charArray = str.toUpperCase(Locale.ENGLISH).toCharArray();
        StringBuffer stringBuffer = new StringBuffer(40);
        StringBuffer stringBuffer2 = new StringBuffer(10);
        int i11 = 0;
        char c11 = charArray[0];
        if (c11 != 'A') {
            if (c11 == 'G' || c11 == 'K' || c11 == 'P') {
                if (charArray[1] == 'N') {
                    stringBuffer.append(charArray, 1, charArray.length - 1);
                } else {
                    stringBuffer.append(charArray);
                }
            } else if (c11 == 'W') {
                char c12 = charArray[1];
                if (c12 == 'R') {
                    stringBuffer.append(charArray, 1, charArray.length - 1);
                } else if (c12 == 'H') {
                    stringBuffer.append(charArray, 1, charArray.length - 1);
                    stringBuffer.setCharAt(0, 'W');
                } else {
                    stringBuffer.append(charArray);
                }
            } else if (c11 != 'X') {
                stringBuffer.append(charArray);
            } else {
                charArray[0] = 'S';
                stringBuffer.append(charArray);
            }
        } else if (charArray[1] == 'E') {
            stringBuffer.append(charArray, 1, charArray.length - 1);
        } else {
            stringBuffer.append(charArray);
        }
        int length = stringBuffer.length();
        while (stringBuffer2.length() < b() && i11 < length) {
            char charAt = stringBuffer.charAt(i11);
            if (charAt == 'C' || !f(stringBuffer, i11, charAt)) {
                z11 = z12;
                switch (charAt) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        if (i11 == 0) {
                            stringBuffer2.append(charAt);
                            break;
                        }
                        break;
                    case 'B':
                        if (!f(stringBuffer, i11, io.ktor.util.date.b.f62001g) || !c(length, i11)) {
                            stringBuffer2.append(charAt);
                            break;
                        }
                        break;
                    case 'C':
                        if (!f(stringBuffer, i11, 'S') || c(length, i11) || f81814c.indexOf(stringBuffer.charAt(i11 + 1)) < 0) {
                            if (!i(stringBuffer, i11, "CIA")) {
                                if (!c(length, i11) && f81814c.indexOf(stringBuffer.charAt(i11 + 1)) >= 0) {
                                    stringBuffer2.append('S');
                                    break;
                                } else if (!f(stringBuffer, i11, 'S') || !e(stringBuffer, i11, 'H')) {
                                    if (!e(stringBuffer, i11, 'H')) {
                                        stringBuffer2.append('K');
                                        break;
                                    } else if (i11 != 0 || length < 3 || !g(stringBuffer, 2)) {
                                        stringBuffer2.append('X');
                                        break;
                                    } else {
                                        stringBuffer2.append('K');
                                        break;
                                    }
                                } else {
                                    stringBuffer2.append('K');
                                    break;
                                }
                            } else {
                                stringBuffer2.append('X');
                                break;
                            }
                        }
                        break;
                    case 'D':
                        if (!c(length, i11 + 1) && e(stringBuffer, i11, 'G')) {
                            int i12 = i11 + 2;
                            if (f81814c.indexOf(stringBuffer.charAt(i12)) >= 0) {
                                stringBuffer2.append('J');
                                i11 = i12;
                                break;
                            }
                        }
                        stringBuffer2.append('T');
                        break;
                    case 'F':
                    case 'J':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'R':
                        stringBuffer2.append(charAt);
                        break;
                    case 'G':
                        int i13 = i11 + 1;
                        if ((!c(length, i13) || !e(stringBuffer, i11, 'H')) && ((c(length, i13) || !e(stringBuffer, i11, 'H') || g(stringBuffer, i11 + 2)) && (i11 <= 0 || (!i(stringBuffer, i11, "GN") && !i(stringBuffer, i11, "GNED"))))) {
                            boolean f11 = f(stringBuffer, i11, 'G');
                            if (!c(length, i11) && f81814c.indexOf(stringBuffer.charAt(i13)) >= 0 && !f11) {
                                stringBuffer2.append('J');
                                break;
                            } else {
                                stringBuffer2.append('K');
                                break;
                            }
                        }
                        break;
                    case 'H':
                        if (!c(length, i11) && ((i11 <= 0 || f81815d.indexOf(stringBuffer.charAt(i11 - 1)) < 0) && g(stringBuffer, i11 + 1))) {
                            stringBuffer2.append('H');
                            break;
                        }
                        break;
                    case 'K':
                        if (i11 <= 0) {
                            stringBuffer2.append(charAt);
                            break;
                        } else if (!f(stringBuffer, i11, 'C')) {
                            stringBuffer2.append(charAt);
                            break;
                        }
                        break;
                    case 'P':
                        if (!e(stringBuffer, i11, 'H')) {
                            stringBuffer2.append(charAt);
                            break;
                        } else {
                            stringBuffer2.append('F');
                            break;
                        }
                    case 'Q':
                        stringBuffer2.append('K');
                        break;
                    case 'S':
                        if (!i(stringBuffer, i11, "SH") && !i(stringBuffer, i11, "SIO") && !i(stringBuffer, i11, "SIA")) {
                            stringBuffer2.append('S');
                            break;
                        } else {
                            stringBuffer2.append('X');
                            break;
                        }
                        break;
                    case 'T':
                        if (!i(stringBuffer, i11, "TIA") && !i(stringBuffer, i11, "TIO")) {
                            if (!i(stringBuffer, i11, "TCH")) {
                                if (!i(stringBuffer, i11, "TH")) {
                                    stringBuffer2.append('T');
                                    break;
                                } else {
                                    stringBuffer2.append('0');
                                    break;
                                }
                            }
                        } else {
                            stringBuffer2.append('X');
                            break;
                        }
                        break;
                    case 'V':
                        stringBuffer2.append('F');
                        break;
                    case 'W':
                    case 'Y':
                        if (!c(length, i11) && g(stringBuffer, i11 + 1)) {
                            stringBuffer2.append(charAt);
                            break;
                        }
                        break;
                    case 'X':
                        stringBuffer2.append('K');
                        stringBuffer2.append('S');
                        break;
                    case 'Z':
                        stringBuffer2.append('S');
                        break;
                }
                i11++;
            } else {
                i11++;
                z11 = z12;
            }
            if (stringBuffer2.length() > b()) {
                stringBuffer2.setLength(b());
            }
            z12 = z11;
        }
        return stringBuffer2.toString();
    }

    public final boolean i(StringBuffer stringBuffer, int i11, String str) {
        if (i11 < 0 || (str.length() + i11) - 1 >= stringBuffer.length()) {
            return false;
        }
        return stringBuffer.substring(i11, str.length() + i11).equals(str);
    }

    public void j(int i11) {
        this.f81816a = i11;
    }
}
