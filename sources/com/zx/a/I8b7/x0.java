package com.zx.a.I8b7;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f46740c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f46741d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f46742a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46743b;

    public x0(String str, String str2, String str3, String str4) {
        this.f46742a = str;
        this.f46743b = str4;
    }

    public static x0 a(String str) {
        Matcher matcher = f46740c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = group.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f46741d.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder a11 = f3.a("Parameter is not formatted correctly: \"");
                a11.append(str.substring(end));
                a11.append("\" for: \"");
                a11.append(str);
                a11.append('\"');
                throw new IllegalArgumentException(a11.toString());
            }
            String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase("charset")) {
                String group3 = matcher2.group(2);
                if (group3 == null) {
                    group3 = matcher2.group(3);
                } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                    group3 = group3.substring(1, group3.length() - 1);
                }
                if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group3 + "\" for: \"" + str + '\"');
                }
                str2 = group3;
            }
        }
        return new x0(str, lowerCase, lowerCase2, str2);
    }

    public static x0 b(String str) {
        try {
            return a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof x0) && ((x0) obj).f46742a.equals(this.f46742a);
    }

    public int hashCode() {
        return this.f46742a.hashCode();
    }

    public String toString() {
        return this.f46742a;
    }

    public Charset a() {
        Charset charset = StandardCharsets.UTF_8;
        try {
            String str = this.f46743b;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
