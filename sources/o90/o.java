package o90;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class o<T extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.i> extends p<T> {

    /* renamed from: i, reason: collision with root package name */
    public List<Object[]> f76685i;

    /* renamed from: j, reason: collision with root package name */
    public String[] f76686j;

    /* renamed from: k, reason: collision with root package name */
    public final int f76687k;

    public o() {
        this(0);
    }

    @Override // o90.p
    public void G(Object[] objArr, T t11) {
        this.f76685i.add(objArr);
    }

    public List<Object[]> H() {
        List<Object[]> list = this.f76685i;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public String[] a() {
        return this.f76686j;
    }

    @Override // o90.p, o90.z
    public void h(T t11) {
        super.h(t11);
        this.f76685i = new ArrayList(this.f76687k);
    }

    @Override // o90.p, o90.z
    public void i(T t11) {
        super.i(t11);
        this.f76686j = t11.a();
    }

    public o(int i11) {
        this.f76687k = i11 <= 0 ? 10000 : i11;
    }
}
