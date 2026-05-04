package gr;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public final class g extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<Activity, WeakReference<g>> f54051b = new WeakHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public final List<WeakReference<fr.e<?>>> f54052a = new ArrayList();

    public static g a(Activity activity) {
        WeakHashMap<Activity, WeakReference<g>> weakHashMap = f54051b;
        WeakReference<g> weakReference = weakHashMap.get(activity);
        if (weakReference != null && weakReference.get() != null) {
            return weakReference.get();
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        g gVar = null;
        try {
            g gVar2 = (g) fragmentManager.findFragmentByTag("com.huawei.hmf.tasks.lifecycle_fragment_tag");
            if (gVar2 == null) {
                try {
                    gVar = b(fragmentManager);
                } catch (ClassCastException e11) {
                    e = e11;
                    gVar = gVar2;
                    Log.e("LifecycleCallbackFrg", "found LifecycleCallbackFragment but the type do not match. " + e.getMessage());
                    return gVar;
                }
            } else {
                gVar = gVar2;
            }
            weakHashMap.put(activity, new WeakReference<>(gVar));
            return gVar;
        } catch (ClassCastException e12) {
            e = e12;
        }
    }

    public static g b(FragmentManager fragmentManager) {
        g gVar;
        g gVar2 = null;
        try {
            gVar = new g();
        } catch (Exception e11) {
            e = e11;
        }
        try {
            fragmentManager.beginTransaction().add(gVar, "com.huawei.hmf.tasks.lifecycle_fragment_tag").commitAllowingStateLoss();
            return gVar;
        } catch (Exception e12) {
            e = e12;
            gVar2 = gVar;
            Log.e("LifecycleCallbackFrg", "create fragment failed." + e.getMessage());
            return gVar2;
        }
    }

    public static void c(Activity activity, fr.e eVar) {
        g a11 = a(activity);
        if (a11 != null) {
            synchronized (a11.f54052a) {
                a11.f54052a.add(new WeakReference<>(eVar));
            }
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        synchronized (this.f54052a) {
            try {
                Iterator<WeakReference<fr.e<?>>> it = this.f54052a.iterator();
                while (it.hasNext()) {
                    fr.e<?> eVar = it.next().get();
                    if (eVar != null) {
                        eVar.cancel();
                    }
                }
                this.f54052a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
