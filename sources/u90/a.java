package u90;

import java.util.TreeMap;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a extends q {

    /* renamed from: g, reason: collision with root package name */
    public char f92082g = '\\';

    /* renamed from: h, reason: collision with root package name */
    public char f92083h = 't';

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.q
    public TreeMap<String, Object> c() {
        TreeMap<String, Object> treeMap = new TreeMap<>();
        treeMap.put("Escape character", Character.valueOf(this.f92082g));
        return treeMap;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.q
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final a clone() {
        return (a) super.clone();
    }

    public char q() {
        return this.f92082g;
    }

    public char s() {
        return this.f92083h;
    }

    public boolean t(char c11) {
        return this.f92082g == c11;
    }

    public void u(char c11) {
        this.f92082g = c11;
    }

    public void v(char c11) {
        this.f92083h = c11;
    }
}
