package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class q implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final String f78184e;

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f78185f;

    /* renamed from: c, reason: collision with root package name */
    public char f78188c = '\n';

    /* renamed from: d, reason: collision with root package name */
    public char f78189d = '#';

    /* renamed from: b, reason: collision with root package name */
    public char[] f78187b = (char[]) f78185f.clone();

    /* renamed from: a, reason: collision with root package name */
    public String f78186a = f78184e;

    static {
        String property = System.getProperty("line.separator");
        if (property == null) {
            f78184e = "\n";
        } else {
            f78184e = property;
        }
        f78185f = f78184e.toCharArray();
    }

    public static String d(Object obj) {
        if (obj instanceof Character) {
            char charValue = ((Character) obj).charValue();
            return charValue != 0 ? charValue != '\r' ? charValue != '\t' ? charValue != '\n' ? obj.toString() : "\\n" : "\\t" : "\\r" : "\\0";
        }
        if (obj instanceof String) {
            String str = (String) obj;
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < str.length(); i11++) {
                sb2.append(d(Character.valueOf(str.charAt(i11))));
            }
            obj = sb2.toString();
        }
        if (!String.valueOf(obj).trim().isEmpty()) {
            return String.valueOf(obj);
        }
        return "'" + obj + '\'';
    }

    public static char[] h() {
        return (char[]) f78185f.clone();
    }

    @Override // 
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public q clone() {
        try {
            return (q) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new IllegalStateException("Error cloning format object", e11);
        }
    }

    public char b() {
        return this.f78189d;
    }

    public abstract TreeMap<String, Object> c();

    public char[] e() {
        return (char[]) this.f78187b.clone();
    }

    public String f() {
        return this.f78186a;
    }

    public char g() {
        return this.f78188c;
    }

    public boolean i(char c11) {
        return this.f78189d == c11;
    }

    public boolean j(char c11) {
        return this.f78188c == c11;
    }

    public void l(char c11) {
        this.f78189d = c11;
    }

    public void m(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Line separator cannot be empty");
        }
        n(str.toCharArray());
    }

    public void n(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            throw new IllegalArgumentException("Invalid line separator. Expected 1 to 2 characters");
        }
        if (cArr.length > 2) {
            throw new IllegalArgumentException("Invalid line separator. Up to 2 characters are expected. Got " + cArr.length + " characters.");
        }
        this.f78187b = cArr;
        this.f78186a = new String(cArr);
        if (cArr.length == 1) {
            o(cArr[0]);
        }
    }

    public void o(char c11) {
        this.f78188c = c11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(':');
        TreeMap<String, Object> c11 = c();
        c11.put("Comment character", Character.valueOf(this.f78189d));
        c11.put("Line separator sequence", this.f78186a);
        c11.put("Line separator (normalized)", Character.valueOf(this.f78188c));
        for (Map.Entry<String, Object> entry : c11.entrySet()) {
            sb2.append("\n\t\t");
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(d(entry.getValue()));
        }
        return sb2.toString();
    }
}
