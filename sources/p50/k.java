package p50;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class k implements p {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final List<Class<?>> f79146a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final List<e<?, ?>> f79147b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final List<g<?>> f79148c;

    public k() {
        this.f79146a = new ArrayList();
        this.f79147b = new ArrayList();
        this.f79148c = new ArrayList();
    }

    @Override // p50.p
    @NonNull
    public e<?, ?> a(int i11) {
        return this.f79147b.get(i11);
    }

    @Override // p50.p
    public boolean b(@NonNull Class<?> cls) {
        o.a(cls);
        boolean z11 = false;
        while (true) {
            int indexOf = this.f79146a.indexOf(cls);
            if (indexOf == -1) {
                return z11;
            }
            this.f79146a.remove(indexOf);
            this.f79147b.remove(indexOf);
            this.f79148c.remove(indexOf);
            z11 = true;
        }
    }

    @Override // p50.p
    @NonNull
    public Class<?> c(int i11) {
        return this.f79146a.get(i11);
    }

    @Override // p50.p
    public int d(@NonNull Class<?> cls) {
        o.a(cls);
        int indexOf = this.f79146a.indexOf(cls);
        if (indexOf != -1) {
            return indexOf;
        }
        for (int i11 = 0; i11 < this.f79146a.size(); i11++) {
            if (this.f79146a.get(i11).isAssignableFrom(cls)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // p50.p
    @NonNull
    public g<?> e(int i11) {
        return this.f79148c.get(i11);
    }

    @Override // p50.p
    public <T> void f(@NonNull Class<? extends T> cls, @NonNull e<T, ?> eVar, @NonNull g<T> gVar) {
        o.a(cls);
        o.a(eVar);
        o.a(gVar);
        this.f79146a.add(cls);
        this.f79147b.add(eVar);
        this.f79148c.add(gVar);
    }

    @Override // p50.p
    public int size() {
        return this.f79146a.size();
    }

    public k(int i11) {
        this.f79146a = new ArrayList(i11);
        this.f79147b = new ArrayList(i11);
        this.f79148c = new ArrayList(i11);
    }

    public k(@NonNull List<Class<?>> list, @NonNull List<e<?, ?>> list2, @NonNull List<g<?>> list3) {
        o.a(list);
        o.a(list2);
        o.a(list3);
        this.f79146a = list;
        this.f79147b = list2;
        this.f79148c = list3;
    }
}
