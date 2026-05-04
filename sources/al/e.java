package al;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f2675a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, List<a<?, ?>>> f2676b = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<T, R> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f2677a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<R> f2678b;

        /* renamed from: c, reason: collision with root package name */
        public final ik.f<T, R> f2679c;

        public a(@NonNull Class<T> cls, @NonNull Class<R> cls2, ik.f<T, R> fVar) {
            this.f2677a = cls;
            this.f2678b = cls2;
            this.f2679c = fVar;
        }

        public boolean a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f2677a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f2678b);
        }
    }

    public synchronized <T, R> void a(@NonNull String str, @NonNull ik.f<T, R> fVar, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, fVar));
    }

    @NonNull
    public synchronized <T, R> List<ik.f<T, R>> b(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f2675a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f2676b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f2679c);
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public final synchronized List<a<?, ?>> c(@NonNull String str) {
        List<a<?, ?>> list;
        try {
            if (!this.f2675a.contains(str)) {
                this.f2675a.add(str);
            }
            list = this.f2676b.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.f2676b.put(str, list);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return list;
    }

    @NonNull
    public synchronized <T, R> List<Class<R>> d(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f2675a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f2676b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f2678b)) {
                        arrayList.add(aVar.f2678b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void e(@NonNull String str, @NonNull ik.f<T, R> fVar, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        c(str).add(0, new a<>(cls, cls2, fVar));
    }

    public synchronized void f(@NonNull List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f2675a);
            this.f2675a.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f2675a.add(it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f2675a.add(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
