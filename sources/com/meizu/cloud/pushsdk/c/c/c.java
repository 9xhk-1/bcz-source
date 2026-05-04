package com.meizu.cloud.pushsdk.c.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f39537a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f39538a = new ArrayList(20);

        private void c(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                if (charAt <= 31 || charAt >= 127) {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i11), str));
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            int length2 = str2.length();
            for (int i12 = 0; i12 < length2; i12++) {
                char charAt2 = str2.charAt(i12);
                if (charAt2 <= 31 || charAt2 >= 127) {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt2), Integer.valueOf(i12), str, str2));
                }
            }
        }

        public a a(String str, String str2) {
            c(str, str2);
            return b(str, str2);
        }

        public a b(String str, String str2) {
            this.f39538a.add(str);
            this.f39538a.add(str2.trim());
            return this;
        }

        public c a() {
            return new c(this);
        }
    }

    private c(a aVar) {
        this.f39537a = (String[]) aVar.f39538a.toArray(new String[aVar.f39538a.size()]);
    }

    public int a() {
        return this.f39537a.length / 2;
    }

    public String b(int i11) {
        return this.f39537a[(i11 * 2) + 1];
    }

    public a c() {
        a aVar = new a();
        Collections.addAll(aVar.f39538a, this.f39537a);
        return aVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int a11 = a();
        for (int i11 = 0; i11 < a11; i11++) {
            sb2.append(a(i11));
            sb2.append(": ");
            sb2.append(b(i11));
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public static c a(String... strArr) {
        if (strArr == null || strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i11 = 0; i11 < strArr2.length; i11++) {
            String str = strArr2[i11];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i11] = str.trim();
        }
        for (int i12 = 0; i12 < strArr2.length; i12 += 2) {
            String str2 = strArr2[i12];
            String str3 = strArr2[i12 + 1];
            if (str2.length() == 0 || str2.indexOf(0) != -1 || str3.indexOf(0) != -1) {
                throw new IllegalArgumentException("Unexpected header: " + str2 + ": " + str3);
            }
        }
        return new c(strArr2);
    }

    public Set<String> b() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int a11 = a();
        for (int i11 = 0; i11 < a11; i11++) {
            treeSet.add(a(i11));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    private c(String[] strArr) {
        this.f39537a = strArr;
    }

    public String a(int i11) {
        return this.f39537a[i11 * 2];
    }

    public String a(String str) {
        return a(this.f39537a, str);
    }

    private static String a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }
}
