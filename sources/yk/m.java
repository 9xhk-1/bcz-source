package yk;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import yk.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Lifecycle, com.bumptech.glide.k> f100177a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final p.b f100178b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        public final FragmentManager f100181a;

        public b(FragmentManager fragmentManager) {
            this.f100181a = fragmentManager;
        }

        public final void a(FragmentManager fragmentManager, Set<com.bumptech.glide.k> set) {
            List<Fragment> fragments = fragmentManager.getFragments();
            int size = fragments.size();
            for (int i11 = 0; i11 < size; i11++) {
                Fragment fragment = fragments.get(i11);
                a(fragment.getChildFragmentManager(), set);
                com.bumptech.glide.k a11 = m.this.a(fragment.getLifecycle());
                if (a11 != null) {
                    set.add(a11);
                }
            }
        }

        @Override // yk.q
        @NonNull
        public Set<com.bumptech.glide.k> b() {
            HashSet hashSet = new HashSet();
            a(this.f100181a, hashSet);
            return hashSet;
        }
    }

    public m(@NonNull p.b bVar) {
        this.f100178b = bVar;
    }

    public com.bumptech.glide.k a(Lifecycle lifecycle) {
        fl.o.b();
        return this.f100177a.get(lifecycle);
    }

    public com.bumptech.glide.k b(Context context, com.bumptech.glide.c cVar, Lifecycle lifecycle, FragmentManager fragmentManager, boolean z11) {
        fl.o.b();
        com.bumptech.glide.k a11 = a(lifecycle);
        if (a11 != null) {
            return a11;
        }
        k kVar = new k(lifecycle);
        com.bumptech.glide.k a12 = this.f100178b.a(cVar, kVar, new b(fragmentManager), context);
        this.f100177a.put(lifecycle, a12);
        kVar.b(new a(lifecycle));
        if (z11) {
            a12.onStart();
        }
        return a12;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f100179a;

        public a(Lifecycle lifecycle) {
            this.f100179a = lifecycle;
        }

        @Override // yk.l
        public void onDestroy() {
            m.this.f100177a.remove(this.f100179a);
        }

        @Override // yk.l
        public void onStart() {
        }

        @Override // yk.l
        public void onStop() {
        }
    }
}
