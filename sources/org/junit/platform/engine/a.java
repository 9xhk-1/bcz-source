package org.junit.platform.engine;

import ba0.c2;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import l50.b;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.engine.UniqueId;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final a f78250g = new a('[', ':', b.f69930l, '/');
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public final char f78251a;

    /* renamed from: b, reason: collision with root package name */
    public final char f78252b;

    /* renamed from: c, reason: collision with root package name */
    public final char f78253c;

    /* renamed from: d, reason: collision with root package name */
    public final char f78254d;

    /* renamed from: e, reason: collision with root package name */
    public final Pattern f78255e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap<Character, String> f78256f;

    public a(char openSegment, char typeValueSeparator, char closeSegment, char segmentDelimiter) {
        HashMap<Character, String> hashMap = new HashMap<>();
        this.f78256f = hashMap;
        this.f78251a = openSegment;
        this.f78254d = typeValueSeparator;
        this.f78252b = closeSegment;
        this.f78253c = segmentDelimiter;
        this.f78255e = Pattern.compile(String.format("%s(.+)%s(.+)%s", o(openSegment), o(typeValueSeparator), o(closeSegment)), 32);
        hashMap.computeIfAbsent('%', new Function() { // from class: ca0.k0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String j11;
                j11 = org.junit.platform.engine.a.j(((Character) obj).charValue());
                return j11;
            }
        });
        hashMap.computeIfAbsent('+', new Function() { // from class: ca0.k0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String j11;
                j11 = org.junit.platform.engine.a.j(((Character) obj).charValue());
                return j11;
            }
        });
        hashMap.computeIfAbsent(Character.valueOf(openSegment), new Function() { // from class: ca0.k0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String j11;
                j11 = org.junit.platform.engine.a.j(((Character) obj).charValue());
                return j11;
            }
        });
        hashMap.computeIfAbsent(Character.valueOf(typeValueSeparator), new Function() { // from class: ca0.k0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String j11;
                j11 = org.junit.platform.engine.a.j(((Character) obj).charValue());
                return j11;
            }
        });
        hashMap.computeIfAbsent(Character.valueOf(closeSegment), new Function() { // from class: ca0.k0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String j11;
                j11 = org.junit.platform.engine.a.j(((Character) obj).charValue());
                return j11;
            }
        });
        hashMap.computeIfAbsent(Character.valueOf(segmentDelimiter), new Function() { // from class: ca0.k0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String j11;
                j11 = org.junit.platform.engine.a.j(((Character) obj).charValue());
                return j11;
            }
        });
    }

    public static String h(String s11) {
        try {
            return URLDecoder.decode(s11, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e11) {
            throw new JUnitException("UTF-8 should be supported", e11);
        }
    }

    public static String j(char c11) {
        try {
            return URLEncoder.encode(String.valueOf(c11), StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e11) {
            throw new AssertionError("UTF-8 should be supported", e11);
        }
    }

    public static a m() {
        return f78250g;
    }

    public static String o(char c11) {
        return Pattern.quote(String.valueOf(c11));
    }

    public final String e(String typeOrValue) {
        f(typeOrValue, this.f78253c);
        f(typeOrValue, this.f78254d);
        f(typeOrValue, this.f78251a);
        f(typeOrValue, this.f78252b);
        return typeOrValue;
    }

    public final void f(final String typeOrValue, final char forbiddenCharacter) {
        c2.f(typeOrValue.indexOf(forbiddenCharacter) < 0, new Supplier() { // from class: ca0.i0
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("type or value '%s' must not contain '%s'", typeOrValue, Character.valueOf(forbiddenCharacter));
                return format;
            }
        });
    }

    public final UniqueId.Segment g(String segmentString) throws JUnitException {
        Matcher matcher = this.f78255e.matcher(segmentString);
        if (matcher.matches()) {
            return new UniqueId.Segment(h(e(matcher.group(1))), h(e(matcher.group(2))));
        }
        throw new JUnitException(String.format("'%s' is not a well-formed UniqueId segment", segmentString));
    }

    public final String i(UniqueId.Segment segment) {
        return this.f78251a + (k(segment.getType()) + this.f78254d + k(segment.getValue())) + this.f78252b;
    }

    public final String k(String s11) {
        StringBuilder sb2 = new StringBuilder(s11.length());
        for (int i11 = 0; i11 < s11.length(); i11++) {
            char charAt = s11.charAt(i11);
            String str = this.f78256f.get(Character.valueOf(charAt));
            if (str == null) {
                sb2.append(charAt);
            } else {
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public String l(UniqueId uniqueId) {
        return (String) uniqueId.getSegments().stream().map(new Function() { // from class: ca0.h0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String i11;
                i11 = org.junit.platform.engine.a.this.i((UniqueId.Segment) obj);
                return i11;
            }
        }).collect(Collectors.joining(String.valueOf(this.f78253c)));
    }

    public UniqueId n(String source) throws JUnitException {
        return new UniqueId(this, (List<UniqueId.Segment>) Arrays.stream(source.split(String.valueOf(this.f78253c))).map(new Function() { // from class: ca0.j0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                UniqueId.Segment g11;
                g11 = org.junit.platform.engine.a.this.g((String) obj);
                return g11;
            }
        }).collect(Collectors.toList()));
    }
}
