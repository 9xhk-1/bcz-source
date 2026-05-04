package s90;

import java.util.TreeMap;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b extends q {

    /* renamed from: g, reason: collision with root package name */
    public char f88141g = '\"';

    /* renamed from: h, reason: collision with root package name */
    public char f88142h = '\"';

    /* renamed from: i, reason: collision with root package name */
    public String f88143i = ",";

    /* renamed from: j, reason: collision with root package name */
    public Character f88144j = null;

    public boolean A(char c11) {
        return this.f88142h == c11;
    }

    public final void B(char c11) {
        this.f88144j = Character.valueOf(c11);
    }

    public void E(char c11) {
        this.f88143i = String.valueOf(c11);
    }

    public void F(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Delimiter cannot be null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Delimiter cannot be empty");
        }
        this.f88143i = str;
    }

    public void G(char c11) {
        this.f88141g = c11;
    }

    public void J(char c11) {
        this.f88142h = c11;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.q
    public TreeMap<String, Object> c() {
        TreeMap<String, Object> treeMap = new TreeMap<>();
        treeMap.put("Quote character", Character.valueOf(this.f88141g));
        treeMap.put("Quote escape character", Character.valueOf(this.f88142h));
        treeMap.put("Quote escape escape character", this.f88144j);
        treeMap.put("Field delimiter", this.f88143i);
        return treeMap;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.q
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        return (b) super.clone();
    }

    public final char q() {
        Character ch2 = this.f88144j;
        if (ch2 != null) {
            return ch2.charValue();
        }
        char c11 = this.f88141g;
        char c12 = this.f88142h;
        if (c11 == c12) {
            return (char) 0;
        }
        return c12;
    }

    public char s() {
        if (this.f88143i.length() <= 1) {
            return this.f88143i.charAt(0);
        }
        throw new UnsupportedOperationException("Delimiter '" + this.f88143i + "' has more than one character. Use method getDelimiterString()");
    }

    public String t() {
        return this.f88143i;
    }

    public char u() {
        return this.f88141g;
    }

    public char v() {
        return this.f88142h;
    }

    public final boolean w(char c11) {
        char q11 = q();
        return q11 != 0 && q11 == c11;
    }

    public boolean x(char c11) {
        if (this.f88143i.length() <= 1) {
            return this.f88143i.charAt(0) == c11;
        }
        throw new UnsupportedOperationException("Delimiter '" + this.f88143i + "' has more than one character. Use method isDelimiter(String)");
    }

    public boolean y(String str) {
        return this.f88143i.equals(str);
    }

    public boolean z(char c11) {
        return this.f88141g == c11;
    }
}
