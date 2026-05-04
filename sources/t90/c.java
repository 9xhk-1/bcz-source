package t90;

import java.util.TreeMap;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class c extends q {

    /* renamed from: g, reason: collision with root package name */
    public char f90365g = ' ';

    /* renamed from: h, reason: collision with root package name */
    public char f90366h = s60.d.f88057a;

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.q
    public TreeMap<String, Object> c() {
        TreeMap<String, Object> treeMap = new TreeMap<>();
        treeMap.put("Padding", Character.valueOf(this.f90365g));
        return treeMap;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.q
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final c clone() {
        return (c) super.clone();
    }

    public char q() {
        return this.f90366h;
    }

    public char s() {
        return this.f90365g;
    }

    public boolean t(char c11) {
        return this.f90365g == c11;
    }

    public void u(char c11) {
        this.f90366h = c11;
    }

    public void v(char c11) {
        this.f90365g = c11;
    }
}
