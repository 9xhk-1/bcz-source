package com.getui.gtc.dim.b;

import android.text.TextUtils;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.fusesource.jansi.Ansi;
import u30.u0;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final String f29856a;

    /* renamed from: b, reason: collision with root package name */
    final String f29857b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29858c;

    /* renamed from: d, reason: collision with root package name */
    public final long f29859d;

    private a(String str, String str2, long j11, long j12) {
        this.f29856a = str;
        this.f29857b = str2;
        this.f29858c = j11;
        this.f29859d = j12;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        char c11 = 65535;
        switch (str.hashCode()) {
            case 320894021:
                if (str.equals("dim-2-1-16-1")) {
                    c11 = 0;
                    break;
                }
                break;
            case 320894022:
                if (str.equals("dim-2-1-16-2")) {
                    c11 = 1;
                    break;
                }
                break;
            case 320894982:
                if (str.equals("dim-2-1-17-1")) {
                    c11 = 2;
                    break;
                }
                break;
            case 320894983:
                if (str.equals("dim-2-1-17-2")) {
                    c11 = 3;
                    break;
                }
                break;
            case 320895943:
                if (str.equals("dim-2-1-18-1")) {
                    c11 = 4;
                    break;
                }
                break;
            case 320895944:
                if (str.equals("dim-2-1-18-2")) {
                    c11 = 5;
                    break;
                }
                break;
            case 320895945:
                if (str.equals("dim-2-1-18-3")) {
                    c11 = 6;
                    break;
                }
                break;
            case 320896904:
                if (str.equals("dim-2-1-19-1")) {
                    c11 = 7;
                    break;
                }
                break;
            case 320896905:
                if (str.equals("dim-2-1-19-2")) {
                    c11 = '\b';
                    break;
                }
                break;
            case 320919007:
                if (str.equals("dim-2-1-21-1")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 320919008:
                if (str.equals("dim-2-1-21-2")) {
                    c11 = '\n';
                    break;
                }
                break;
            case 320919009:
                if (str.equals("dim-2-1-21-3")) {
                    c11 = 11;
                    break;
                }
                break;
            case 320919011:
                if (str.equals("dim-2-1-21-5")) {
                    c11 = '\f';
                    break;
                }
                break;
            case 378146557:
                if (str.equals("dim-2-3-10-1")) {
                    c11 = '\r';
                    break;
                }
                break;
            case 378146558:
                if (str.equals("dim-2-3-10-2")) {
                    c11 = 14;
                    break;
                }
                break;
            case 378147518:
                if (str.equals("dim-2-3-11-1")) {
                    c11 = 15;
                    break;
                }
                break;
            case 378147519:
                if (str.equals("dim-2-3-11-2")) {
                    c11 = 16;
                    break;
                }
                break;
            case 378149440:
                if (str.equals("dim-2-3-13-1")) {
                    c11 = 17;
                    break;
                }
                break;
            case 378149441:
                if (str.equals("dim-2-3-13-2")) {
                    c11 = 18;
                    break;
                }
                break;
            case 378150401:
                if (str.equals("dim-2-3-14-1")) {
                    c11 = 19;
                    break;
                }
                break;
            case 378150402:
                if (str.equals("dim-2-3-14-2")) {
                    c11 = 20;
                    break;
                }
                break;
            case 378151362:
                if (str.equals("dim-2-3-15-1")) {
                    c11 = 21;
                    break;
                }
                break;
            case 378151363:
                if (str.equals("dim-2-3-15-2")) {
                    c11 = 22;
                    break;
                }
                break;
            case 378152323:
                if (str.equals("dim-2-3-16-1")) {
                    c11 = 23;
                    break;
                }
                break;
            case 378152324:
                if (str.equals("dim-2-3-16-2")) {
                    c11 = 24;
                    break;
                }
                break;
            case 1672919129:
                if (str.equals("dim-2-1-1-1")) {
                    c11 = 25;
                    break;
                }
                break;
            case 1672919131:
                if (str.equals("dim-2-1-1-3")) {
                    c11 = 26;
                    break;
                }
                break;
            case 1672919132:
                if (str.equals("dim-2-1-1-4")) {
                    c11 = Ansi.f77778c;
                    break;
                }
                break;
            case 1672920090:
                if (str.equals("dim-2-1-2-1")) {
                    c11 = sp.b.f88892n;
                    break;
                }
                break;
            case 1672920092:
                if (str.equals("dim-2-1-2-3")) {
                    c11 = sp.b.f88893o;
                    break;
                }
                break;
            case 1672920093:
                if (str.equals("dim-2-1-2-4")) {
                    c11 = sp.b.f88894p;
                    break;
                }
                break;
            case 1672921051:
                if (str.equals("dim-2-1-3-1")) {
                    c11 = to.c.f90845b;
                    break;
                }
                break;
            case 1672922012:
                if (str.equals("dim-2-1-4-1")) {
                    c11 = ' ';
                    break;
                }
                break;
            case 1672923934:
                if (str.equals("dim-2-1-6-1")) {
                    c11 = PublicSuffixDatabase.f77441i;
                    break;
                }
                break;
            case 1672923936:
                if (str.equals("dim-2-1-6-3")) {
                    c11 = '\"';
                    break;
                }
                break;
            case 1672923937:
                if (str.equals("dim-2-1-6-4")) {
                    c11 = '#';
                    break;
                }
                break;
            case 1672924895:
                if (str.equals("dim-2-1-7-1")) {
                    c11 = '$';
                    break;
                }
                break;
            case 1672925856:
                if (str.equals("dim-2-1-8-1")) {
                    c11 = '%';
                    break;
                }
                break;
            case 1674766171:
                if (str.equals("dim-2-3-1-1")) {
                    c11 = u0.f91708d;
                    break;
                }
                break;
            case 1674766172:
                if (str.equals("dim-2-3-1-2")) {
                    c11 = '\'';
                    break;
                }
                break;
            case 1674767132:
                if (str.equals("dim-2-3-2-1")) {
                    c11 = '(';
                    break;
                }
                break;
            case 1674767133:
                if (str.equals("dim-2-3-2-2")) {
                    c11 = ')';
                    break;
                }
                break;
            case 1674768093:
                if (str.equals("dim-2-3-3-1")) {
                    c11 = '*';
                    break;
                }
                break;
            case 1674768094:
                if (str.equals("dim-2-3-3-2")) {
                    c11 = '+';
                    break;
                }
                break;
            case 1674769054:
                if (str.equals("dim-2-3-4-1")) {
                    c11 = ',';
                    break;
                }
                break;
            case 1674769055:
                if (str.equals("dim-2-3-4-2")) {
                    c11 = '-';
                    break;
                }
                break;
            case 1674770015:
                if (str.equals("dim-2-3-5-1")) {
                    c11 = '.';
                    break;
                }
                break;
            case 1674770016:
                if (str.equals("dim-2-3-5-2")) {
                    c11 = '/';
                    break;
                }
                break;
            case 1674770976:
                if (str.equals("dim-2-3-6-1")) {
                    c11 = '0';
                    break;
                }
                break;
            case 1674770977:
                if (str.equals("dim-2-3-6-2")) {
                    c11 = '1';
                    break;
                }
                break;
            case 1674771937:
                if (str.equals("dim-2-3-7-1")) {
                    c11 = '2';
                    break;
                }
                break;
            case 1674771938:
                if (str.equals("dim-2-3-7-2")) {
                    c11 = '3';
                    break;
                }
                break;
            case 1674772898:
                if (str.equals("dim-2-3-8-1")) {
                    c11 = '4';
                    break;
                }
                break;
            case 1674772899:
                if (str.equals("dim-2-3-8-2")) {
                    c11 = '5';
                    break;
                }
                break;
            case 1674773859:
                if (str.equals("dim-2-3-9-1")) {
                    c11 = '6';
                    break;
                }
                break;
            case 1674773860:
                if (str.equals("dim-2-3-9-2")) {
                    c11 = '7';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 1:
            case 15:
            case 16:
                return new a("dim-2-3-11-1", "dim-2-3-11-2", 5000L, 1800000L);
            case 2:
            case '*':
            case '+':
                return new a("dim-2-3-3-1", "dim-2-3-3-2", 5000L, 1800000L);
            case 3:
            case '(':
            case ')':
                return new a("dim-2-3-2-1", "dim-2-3-2-2", 5000L, 1800000L);
            case 4:
            case 19:
            case 20:
                return new a("dim-2-3-14-1", "dim-2-3-14-2", 5000L, 1800000L);
            case 5:
            case 17:
            case 18:
                return new a("dim-2-3-13-1", "dim-2-3-13-2", 5000L, 1800000L);
            case 6:
            case 21:
            case 22:
                return new a("dim-2-3-15-1", "dim-2-3-15-2", 5000L, 1800000L);
            case 7:
            case '\b':
            case '\r':
            case 14:
                return new a("dim-2-3-10-1", "dim-2-3-10-2", 5000L, 1800000L);
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '&':
            case '\'':
                return new a("dim-2-3-1-1", "dim-2-3-1-2", 21600000L, 86400000L);
            case 23:
            case 24:
            case '$':
                return new a("dim-2-3-16-1", "dim-2-3-16-2", 86400000L, 604800000L);
            case 25:
            case 26:
            case 27:
            case ',':
            case '-':
                return new a("dim-2-3-4-1", "dim-2-3-4-2", 86400000L, 604800000L);
            case 28:
            case 29:
            case 30:
            case '.':
            case '/':
                return new a("dim-2-3-5-1", "dim-2-3-5-2", 86400000L, 604800000L);
            case 31:
            case '0':
            case '1':
                return new a("dim-2-3-6-1", "dim-2-3-6-2", 86400000L, 604800000L);
            case ' ':
            case '4':
            case '5':
                return new a("dim-2-3-8-1", "dim-2-3-8-2", 86400000L, 604800000L);
            case '!':
            case '\"':
            case '#':
            case '2':
            case '3':
                return new a("dim-2-3-7-1", "dim-2-3-7-2", 86400000L, 604800000L);
            case '%':
            case '6':
            case '7':
                return new a("dim-2-3-9-1", "dim-2-3-9-2", 86400000L, 604800000L);
            default:
                return null;
        }
    }
}
