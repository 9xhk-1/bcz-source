package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<Object> f67041a;

    public v0(int i11) {
        this.f67041a = new ArrayList<>(i11);
    }

    public void a(Object obj) {
        this.f67041a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f67041a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f67041a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f67041a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f67041a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f67041a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f67041a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f67041a.toArray(objArr);
    }
}
