package o90;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class h<T extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.i> implements z<T> {

    /* renamed from: a, reason: collision with root package name */
    public List<String[]> f76666a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f76667b;

    /* renamed from: c, reason: collision with root package name */
    public final int f76668c;

    public h() {
        this(0);
    }

    public String[] a() {
        return this.f76667b;
    }

    public List<String[]> b() {
        List<String[]> list = this.f76666a;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // o90.z
    public void h(T t11) {
        this.f76666a = new ArrayList(this.f76668c);
    }

    @Override // o90.z
    public void i(T t11) {
        this.f76667b = t11.a();
    }

    @Override // o90.z
    public void q(String[] strArr, T t11) {
        this.f76666a.add(strArr);
    }

    public h(int i11) {
        this.f76668c = i11 <= 0 ? 10000 : i11;
    }
}
