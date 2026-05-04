package ty;

import a00.a0;
import a00.h0;
import a00.w1;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import xy.e2;
import zr.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPaths.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Paths.kt\nio/ktor/server/util/PathsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n434#2:109\n507#2,5:110\n1088#2,2:122\n142#3:115\n131#3,5:116\n1#4:121\n*S KotlinDebug\n*F\n+ 1 Paths.kt\nio/ktor/server/util/PathsKt\n*L\n55#1:109\n55#1:110,5\n100#1:122,2\n56#1:115\n56#1:116,5\n*E\n"})
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final boolean[] f91232a = f(new char[]{'A', 'a', 'C', 'c', 'l', 'L', 'P', 'p', 'n', 'N'});

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final Set<String> f91233b = w1.u("CON", "PRN", "AUX", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9");

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final boolean[] f91234c = f(new char[]{'\\', '/', ':', '*', s60.d.f88057a, '\"', u30.u0.f91709e, u30.u0.f91710f, '|'});

    public static final boolean a(boolean[] zArr, char c11) {
        g0.p(zArr, "<this>");
        return c11 < zArr.length && zArr[c11];
    }

    public static final List<String> b(List<String> list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        if (i11 > 0) {
            arrayList.addAll(list.subList(0, i11));
        }
        d(arrayList, list.get(i11));
        int size = list.size();
        for (int i12 = i11 + 1; i12 < size; i12++) {
            String str = list.get(i12);
            if (e(str)) {
                d(arrayList, str);
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @k
    public static final List<String> c(@k List<String> list) {
        g0.p(list, "<this>");
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (e(list.get(i11))) {
                return b(list, i11);
            }
        }
        return list;
    }

    public static final void d(List<String> list, String str) {
        CharSequence charSequence;
        if (str.length() == 0 || g0.g(str, ".") || g0.g(str, Constants.WAVE_SEPARATOR) || f91233b.contains(e2.g(str))) {
            return;
        }
        if (g0.g(str, m.f102856e)) {
            if (list.isEmpty()) {
                return;
            }
            list.remove(h0.L(list));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (g0.t(charAt, 32) >= 0 && !a(f91234c, charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        int length2 = sb3.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i12 = length2 - 1;
                char charAt2 = sb3.charAt(length2);
                if (charAt2 != ' ' && charAt2 != '.') {
                    charSequence = sb3.subSequence(0, length2 + 1);
                    break;
                } else if (i12 < 0) {
                    break;
                } else {
                    length2 = i12;
                }
            }
        }
        charSequence = "";
        String obj = charSequence.toString();
        if (obj.length() <= 0) {
            obj = null;
        }
        if (obj != null) {
            list.add(obj);
        }
    }

    public static final boolean e(String str) {
        int length = str.length();
        if (length == 0) {
            return true;
        }
        char charAt = str.charAt(0);
        if (charAt == '.' && (length == 1 || (length == 2 && str.charAt(1) == '.'))) {
            return true;
        }
        if (charAt == '~' && length == 1) {
            return true;
        }
        if (a(f91232a, charAt)) {
            Set<String> set = f91233b;
            if (set.contains(str) || set.contains(e2.g(str))) {
                return true;
            }
        }
        char charAt2 = str.charAt(length - 1);
        if (charAt2 == ' ' || charAt2 == '.') {
            return true;
        }
        boolean[] zArr = f91234c;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt3 = str.charAt(i11);
            if (g0.t(charAt3, 32) < 0 || a(zArr, charAt3)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean[] f(char[] cArr) {
        boolean[] zArr = new boolean[256];
        for (int i11 = 0; i11 < 256; i11++) {
            zArr[i11] = a0.w8(cArr, (char) i11);
        }
        return zArr;
    }
}
