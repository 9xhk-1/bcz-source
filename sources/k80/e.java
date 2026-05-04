package k80;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static c<?> f66028a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final String f66029b = "de.greenrobot.eventbus.error_dialog";

    /* renamed from: c, reason: collision with root package name */
    public static final String f66030c = "de.greenrobot.eventbus.error_dialog_manager";

    /* renamed from: d, reason: collision with root package name */
    public static final String f66031d = "de.greenrobot.eventbus.errordialog.title";

    /* renamed from: e, reason: collision with root package name */
    public static final String f66032e = "de.greenrobot.eventbus.errordialog.message";

    /* renamed from: f, reason: collision with root package name */
    public static final String f66033f = "de.greenrobot.eventbus.errordialog.finish_after_dialog";

    /* renamed from: g, reason: collision with root package name */
    public static final String f66034g = "de.greenrobot.eventbus.errordialog.icon_id";

    /* renamed from: h, reason: collision with root package name */
    public static final String f66035h = "de.greenrobot.eventbus.errordialog.event_type_on_close";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @TargetApi(11)
    public static class a extends Fragment {

        /* renamed from: a, reason: collision with root package name */
        public boolean f66036a;

        /* renamed from: b, reason: collision with root package name */
        public Bundle f66037b;

        /* renamed from: c, reason: collision with root package name */
        public i80.c f66038c;

        /* renamed from: d, reason: collision with root package name */
        public Object f66039d;

        public static void a(Activity activity, Object obj, boolean z11, Bundle bundle) {
            FragmentManager fragmentManager = activity.getFragmentManager();
            a aVar = (a) fragmentManager.findFragmentByTag(e.f66030c);
            if (aVar == null) {
                aVar = new a();
                fragmentManager.beginTransaction().add(aVar, e.f66030c).commit();
                fragmentManager.executePendingTransactions();
            }
            aVar.f66036a = z11;
            aVar.f66037b = bundle;
            aVar.f66039d = obj;
        }

        public void onEventMainThread(h hVar) {
            if (e.g(this.f66039d, hVar)) {
                e.f(hVar);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.executePendingTransactions();
                DialogFragment dialogFragment = (DialogFragment) fragmentManager.findFragmentByTag(e.f66029b);
                if (dialogFragment != null) {
                    dialogFragment.dismiss();
                }
                DialogFragment dialogFragment2 = (DialogFragment) e.f66028a.d(hVar, this.f66036a, this.f66037b);
                if (dialogFragment2 != null) {
                    dialogFragment2.show(fragmentManager, e.f66029b);
                }
            }
        }

        @Override // android.app.Fragment
        public void onPause() {
            this.f66038c.A(this);
            super.onPause();
        }

        @Override // android.app.Fragment
        public void onResume() {
            super.onResume();
            i80.c c11 = e.f66028a.f66025a.c();
            this.f66038c = c11;
            c11.v(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends androidx.fragment.app.Fragment {

        /* renamed from: a, reason: collision with root package name */
        public boolean f66040a;

        /* renamed from: b, reason: collision with root package name */
        public Bundle f66041b;

        /* renamed from: c, reason: collision with root package name */
        public i80.c f66042c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f66043d;

        /* renamed from: e, reason: collision with root package name */
        public Object f66044e;

        public static void t(Activity activity, Object obj, boolean z11, Bundle bundle) {
            androidx.fragment.app.FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            b bVar = (b) supportFragmentManager.findFragmentByTag(e.f66030c);
            if (bVar == null) {
                bVar = new b();
                supportFragmentManager.beginTransaction().add(bVar, e.f66030c).commit();
                supportFragmentManager.executePendingTransactions();
            }
            bVar.f66040a = z11;
            bVar.f66041b = bundle;
            bVar.f66044e = obj;
        }

        @Override // androidx.fragment.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            i80.c c11 = e.f66028a.f66025a.c();
            this.f66042c = c11;
            c11.v(this);
            this.f66043d = true;
        }

        public void onEventMainThread(h hVar) {
            if (e.g(this.f66044e, hVar)) {
                e.f(hVar);
                androidx.fragment.app.FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.executePendingTransactions();
                androidx.fragment.app.DialogFragment dialogFragment = (androidx.fragment.app.DialogFragment) fragmentManager.findFragmentByTag(e.f66029b);
                if (dialogFragment != null) {
                    dialogFragment.dismiss();
                }
                androidx.fragment.app.DialogFragment dialogFragment2 = (androidx.fragment.app.DialogFragment) e.f66028a.d(hVar, this.f66040a, this.f66041b);
                if (dialogFragment2 != null) {
                    dialogFragment2.show(fragmentManager, e.f66029b);
                }
            }
        }

        @Override // androidx.fragment.app.Fragment
        public void onPause() {
            this.f66042c.A(this);
            super.onPause();
        }

        @Override // androidx.fragment.app.Fragment
        public void onResume() {
            super.onResume();
            if (this.f66043d) {
                this.f66043d = false;
                return;
            }
            i80.c c11 = e.f66028a.f66025a.c();
            this.f66042c = c11;
            c11.v(this);
        }
    }

    public static void b(Activity activity) {
        e(activity, false, null);
    }

    public static void c(Activity activity, Object obj, boolean z11, Bundle bundle) {
        if (f66028a == null) {
            throw new RuntimeException("You must set the static factory field to configure error dialogs for your app.");
        }
        if (h(activity)) {
            b.t(activity, obj, z11, bundle);
        } else {
            a.a(activity, obj, z11, bundle);
        }
    }

    public static void d(Activity activity, boolean z11) {
        e(activity, z11, null);
    }

    public static void e(Activity activity, boolean z11, Bundle bundle) {
        c(activity, activity.getClass(), z11, bundle);
    }

    public static void f(h hVar) {
        k80.b bVar = f66028a.f66025a;
        if (bVar.f66021f) {
            String str = bVar.f66022g;
            if (str == null) {
                str = i80.c.f60259s;
            }
            Log.i(str, "Error dialog manager received exception", hVar.f66046a);
        }
    }

    public static boolean g(Object obj, h hVar) {
        Object b11;
        return hVar == null || (b11 = hVar.b()) == null || b11.equals(obj);
    }

    public static boolean h(Activity activity) {
        String name;
        Class<?> cls = activity.getClass();
        do {
            cls = cls.getSuperclass();
            if (cls == null) {
                throw new RuntimeException("Illegal activity type: " + activity.getClass());
            }
            name = cls.getName();
            if (name.equals("androidx.fragment.app.FragmentActivity")) {
                return true;
            }
            if (name.startsWith("com.actionbarsherlock.app") && (name.endsWith(".SherlockActivity") || name.endsWith(".SherlockListActivity") || name.endsWith(".SherlockPreferenceActivity"))) {
                throw new RuntimeException("Please use SherlockFragmentActivity. Illegal activity: " + name);
            }
        } while (!name.equals("android.app.Activity"));
        return false;
    }
}
