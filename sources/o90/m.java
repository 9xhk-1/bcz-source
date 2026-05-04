package o90;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class m<C extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.i> extends l<C> {

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<Class<?>, Object> f76682c;

    /* renamed from: d, reason: collision with root package name */
    public long f76683d;

    public m(Class... clsArr) {
        super(clsArr);
        this.f76682c = new HashMap<>();
        this.f76683d = -1L;
    }

    @Override // o90.l
    public final void a(Class<?> cls, Object obj, C c11) {
        if (this.f76683d != c11.p() && this.f76683d != -1) {
            k(c11);
        }
        this.f76683d = c11.p();
        this.f76682c.put(cls, obj);
    }

    @Override // o90.l, o90.z
    public void h(C c11) {
        this.f76683d = -1L;
        this.f76682c.clear();
        super.h(c11);
    }

    @Override // o90.l, o90.z
    public void i(C c11) {
        k(c11);
        super.i(c11);
    }

    public abstract void j(Map<Class<?>, Object> map, C c11);

    public final void k(C c11) {
        if (this.f76682c.isEmpty()) {
            return;
        }
        j(this.f76682c, c11);
        this.f76682c.clear();
    }
}
