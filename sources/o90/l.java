package o90;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.helpers.MethodFilter;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class l<C extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.i> implements z<C>, org.junit.jupiter.params.shadow.com.univocity.parsers.common.l {

    /* renamed from: a, reason: collision with root package name */
    public final d<?, C>[] f76678a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<Class, d> f76679b = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends d<Object, C> {

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Class f76680y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, MethodFilter methodFilter, Class cls2) {
            super(cls, methodFilter);
            this.f76680y = cls2;
        }

        @Override // o90.d
        public void l0(Object obj, C c11) {
            l.this.a(this.f76680y, obj, c11);
        }
    }

    public l(Class... clsArr) {
        org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.v("Bean types", clsArr);
        this.f76678a = new d[clsArr.length];
        for (int i11 = 0; i11 < clsArr.length; i11++) {
            Class cls = clsArr[i11];
            this.f76678a[i11] = new a(cls, MethodFilter.ONLY_SETTERS, cls);
            this.f76679b.put(cls, this.f76678a[i11]);
        }
    }

    public abstract void a(Class<?> cls, Object obj, C c11);

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.l
    public j90.n<String> b(r90.g... gVarArr) {
        ArrayList arrayList = new ArrayList(this.f76678a.length);
        int i11 = 0;
        while (true) {
            d<?, C>[] dVarArr = this.f76678a;
            if (i11 >= dVarArr.length) {
                return new j90.n<>(arrayList);
            }
            arrayList.add(dVarArr[i11].b(gVarArr));
            i11++;
        }
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.l
    public j90.n<Integer> c(r90.g... gVarArr) {
        ArrayList arrayList = new ArrayList(this.f76678a.length);
        int i11 = 0;
        while (true) {
            d<?, C>[] dVarArr = this.f76678a;
            if (i11 >= dVarArr.length) {
                return new j90.n<>(arrayList);
            }
            arrayList.add(dVarArr[i11].c(gVarArr));
            i11++;
        }
    }

    public final Class[] d() {
        Class[] clsArr = new Class[this.f76678a.length];
        int i11 = 0;
        while (true) {
            d<?, C>[] dVarArr = this.f76678a;
            if (i11 >= dVarArr.length) {
                return clsArr;
            }
            clsArr[i11] = dVarArr[i11].f76691i;
            i11++;
        }
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.l
    public void e(r90.g... gVarArr) {
        int i11 = 0;
        while (true) {
            d<?, C>[] dVarArr = this.f76678a;
            if (i11 >= dVarArr.length) {
                return;
            }
            dVarArr[i11].e(gVarArr);
            i11++;
        }
    }

    public <T> d<T, C> f(Class<T> cls) {
        d<T, C> dVar = this.f76679b.get(cls);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("No processor of type '" + cls.getName() + "' is available. Supported types are: " + this.f76679b.keySet());
    }

    @Override // o90.z
    public void h(C c11) {
        int i11 = 0;
        while (true) {
            d<?, C>[] dVarArr = this.f76678a;
            if (i11 >= dVarArr.length) {
                return;
            }
            dVarArr[i11].h(c11);
            i11++;
        }
    }

    @Override // o90.z
    public void i(C c11) {
        int i11 = 0;
        while (true) {
            d<?, C>[] dVarArr = this.f76678a;
            if (i11 >= dVarArr.length) {
                return;
            }
            dVarArr[i11].i(c11);
            i11++;
        }
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.l
    public void n(Class<?> cls, r90.g... gVarArr) {
        int i11 = 0;
        while (true) {
            d<?, C>[] dVarArr = this.f76678a;
            if (i11 >= dVarArr.length) {
                return;
            }
            dVarArr[i11].n(cls, gVarArr);
            i11++;
        }
    }

    @Override // o90.z
    public final void q(String[] strArr, C c11) {
        int i11 = 0;
        while (true) {
            d<?, C>[] dVarArr = this.f76678a;
            if (i11 >= dVarArr.length) {
                return;
            }
            dVarArr[i11].q(strArr, c11);
            i11++;
        }
    }
}
