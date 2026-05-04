package o90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k<C extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.i> extends m<C> {

    /* renamed from: e, reason: collision with root package name */
    public final Class[] f76674e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f76675f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f76676g;

    /* renamed from: h, reason: collision with root package name */
    public final int f76677h;

    public k(int i11, Class... clsArr) {
        super(clsArr);
        this.f76674e = clsArr;
        this.f76675f = new List[clsArr.length];
        this.f76677h = i11 <= 0 ? 10000 : i11;
    }

    @Override // o90.m, o90.l, o90.z
    public final void h(C c11) {
        super.h(c11);
        for (int i11 = 0; i11 < this.f76674e.length; i11++) {
            this.f76675f[i11] = new ArrayList(this.f76677h);
        }
    }

    @Override // o90.m, o90.l, o90.z
    public final void i(C c11) {
        this.f76676g = c11.a();
        super.i(c11);
    }

    @Override // o90.m
    public final void j(Map<Class<?>, Object> map, C c11) {
        int i11 = 0;
        while (true) {
            Class[] clsArr = this.f76674e;
            if (i11 >= clsArr.length) {
                return;
            }
            this.f76675f[i11].add(map.get(clsArr[i11]));
            i11++;
        }
    }

    public <T> List<T> l(Class<T> cls) {
        int f11 = org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.f(this.f76674e, cls);
        if (f11 != -1) {
            return this.f76675f[f11];
        }
        throw new IllegalArgumentException("Unknown bean type '" + cls.getSimpleName() + "'. Available types are: " + Arrays.toString(this.f76674e));
    }

    public Map<Class<?>, List<?>> m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = 0;
        while (true) {
            Class[] clsArr = this.f76674e;
            if (i11 >= clsArr.length) {
                return linkedHashMap;
            }
            linkedHashMap.put(clsArr[i11], this.f76675f[i11]);
            i11++;
        }
    }

    public final String[] o() {
        return this.f76676g;
    }

    public k(Class... clsArr) {
        this(0, clsArr);
    }
}
