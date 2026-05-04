package o90;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.helpers.MethodFilter;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class c<T, C extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.i> extends d<T, C> {
    public final int A;

    /* renamed from: y, reason: collision with root package name */
    public List<T> f76632y;

    /* renamed from: z, reason: collision with root package name */
    public String[] f76633z;

    public c(Class<T> cls) {
        this(cls, 0);
    }

    public String[] a() {
        return this.f76633z;
    }

    @Override // o90.d, o90.z
    public void h(C c11) {
        super.h(c11);
        this.f76632y = new ArrayList(this.A);
    }

    @Override // o90.d, o90.z
    public void i(C c11) {
        this.f76633z = c11.a();
        super.i(c11);
    }

    @Override // o90.d
    public void l0(T t11, C c11) {
        this.f76632y.add(t11);
    }

    public List<T> m0() {
        List<T> list = this.f76632y;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public c(Class<T> cls, int i11) {
        super(cls, MethodFilter.ONLY_SETTERS);
        this.A = i11 <= 0 ? 10000 : i11;
    }
}
