package k80;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Bundle;
import k80.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final k80.b f66025a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @TargetApi(11)
    public static class a extends c<Fragment> {
        public a(k80.b bVar) {
            super(bVar);
        }

        @Override // k80.c
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Fragment a(h hVar, Bundle bundle) {
            d.a aVar = new d.a();
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends c<androidx.fragment.app.Fragment> {
        public b(k80.b bVar) {
            super(bVar);
        }

        @Override // k80.c
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.fragment.app.Fragment a(h hVar, Bundle bundle) {
            d.b bVar = new d.b();
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    public c(k80.b bVar) {
        this.f66025a = bVar;
    }

    public abstract T a(h hVar, Bundle bundle);

    public String b(h hVar, Bundle bundle) {
        return this.f66025a.f66016a.getString(this.f66025a.d(hVar.f66046a));
    }

    public String c(h hVar, Bundle bundle) {
        k80.b bVar = this.f66025a;
        return bVar.f66016a.getString(bVar.f66017b);
    }

    public T d(h hVar, boolean z11, Bundle bundle) {
        int i11;
        Class<?> cls;
        if (hVar.d()) {
            return null;
        }
        Bundle bundle2 = bundle != null ? (Bundle) bundle.clone() : new Bundle();
        if (!bundle2.containsKey(e.f66031d)) {
            bundle2.putString(e.f66031d, c(hVar, bundle2));
        }
        if (!bundle2.containsKey(e.f66032e)) {
            bundle2.putString(e.f66032e, b(hVar, bundle2));
        }
        if (!bundle2.containsKey(e.f66033f)) {
            bundle2.putBoolean(e.f66033f, z11);
        }
        if (!bundle2.containsKey(e.f66035h) && (cls = this.f66025a.f66024i) != null) {
            bundle2.putSerializable(e.f66035h, cls);
        }
        if (!bundle2.containsKey(e.f66034g) && (i11 = this.f66025a.f66023h) != 0) {
            bundle2.putInt(e.f66034g, i11);
        }
        return a(hVar, bundle2);
    }
}
