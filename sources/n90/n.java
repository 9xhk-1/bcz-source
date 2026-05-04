package n90;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class n implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f74979a = null;

    /* renamed from: b, reason: collision with root package name */
    public List<Object[]> f74980b = Collections.EMPTY_LIST;

    public void a() {
        this.f74980b = Collections.EMPTY_LIST;
        this.f74979a = null;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n clone() {
        try {
            return (n) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new InternalError(e11.getMessage());
        }
    }

    public List<Object[]> c() {
        return this.f74980b;
    }

    public Object[] d() {
        return this.f74979a;
    }

    public void e(List<Object[]> list) {
        this.f74980b = list;
    }

    public void f(Object[] objArr) {
        this.f74979a = objArr;
    }
}
