package mt;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: t, reason: collision with root package name */
    public static final String f73686t = "InvisibleFragment";

    /* renamed from: a, reason: collision with root package name */
    public FragmentActivity f73687a;

    /* renamed from: b, reason: collision with root package name */
    public Fragment f73688b;

    /* renamed from: c, reason: collision with root package name */
    public Dialog f73689c;

    /* renamed from: d, reason: collision with root package name */
    public Set<String> f73690d;

    /* renamed from: e, reason: collision with root package name */
    public Set<String> f73691e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f73692f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f73693g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f73694h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f73695i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f73696j = -1;

    /* renamed from: k, reason: collision with root package name */
    public Set<String> f73697k = new HashSet();

    /* renamed from: l, reason: collision with root package name */
    public Set<String> f73698l = new HashSet();

    /* renamed from: m, reason: collision with root package name */
    public Set<String> f73699m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public Set<String> f73700n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public Set<String> f73701o = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public kt.d f73702p;

    /* renamed from: q, reason: collision with root package name */
    public kt.a f73703q;

    /* renamed from: r, reason: collision with root package name */
    public kt.b f73704r;

    /* renamed from: s, reason: collision with root package name */
    public kt.c f73705s;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lt.c f73706a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f73707b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ mt.b f73708c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f73709d;

        public a(lt.c cVar, boolean z11, mt.b bVar, List list) {
            this.f73706a = cVar;
            this.f73707b = z11;
            this.f73708c = bVar;
            this.f73709d = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f73706a.dismiss();
            if (this.f73707b) {
                this.f73708c.c(this.f73709d);
            } else {
                f.this.c(this.f73709d);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lt.c f73711a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mt.b f73712b;

        public b(lt.c cVar, mt.b bVar) {
            this.f73711a = cVar;
            this.f73712b = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f73711a.dismiss();
            this.f73712b.a();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            f.this.f73689c = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lt.d f73715a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f73716b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ mt.b f73717c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f73718d;

        public d(lt.d dVar, boolean z11, mt.b bVar, List list) {
            this.f73715a = dVar;
            this.f73716b = z11;
            this.f73717c = bVar;
            this.f73718d = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f73715a.dismiss();
            if (this.f73716b) {
                this.f73717c.c(this.f73718d);
            } else {
                f.this.c(this.f73718d);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lt.d f73720a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mt.b f73721b;

        public e(lt.d dVar, mt.b bVar) {
            this.f73720a = dVar;
            this.f73721b = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f73720a.dismiss();
            this.f73721b.a();
        }
    }

    public f(FragmentActivity fragmentActivity, Fragment fragment, Set<String> set, boolean z11, Set<String> set2) {
        this.f73687a = fragmentActivity;
        this.f73688b = fragment;
        if (fragmentActivity == null && fragment != null) {
            this.f73687a = fragment.getActivity();
        }
        this.f73690d = set;
        this.f73692f = z11;
        this.f73691e = set2;
    }

    public f b() {
        this.f73693g = true;
        return this;
    }

    public final void c(List<String> list) {
        this.f73701o.clear();
        this.f73701o.addAll(list);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.f73687a.getPackageName(), null));
        e().startActivityForResult(intent, 2);
    }

    public FragmentManager d() {
        Fragment fragment = this.f73688b;
        return fragment != null ? fragment.getChildFragmentManager() : this.f73687a.getSupportFragmentManager();
    }

    public final mt.e e() {
        FragmentManager d11 = d();
        Fragment findFragmentByTag = d11.findFragmentByTag(f73686t);
        if (findFragmentByTag != null) {
            return (mt.e) findFragmentByTag;
        }
        mt.e eVar = new mt.e();
        d11.beginTransaction().add(eVar, f73686t).commitNowAllowingStateLoss();
        return eVar;
    }

    public f f(kt.a aVar) {
        this.f73703q = aVar;
        return this;
    }

    public f g(kt.b bVar) {
        this.f73704r = bVar;
        return this;
    }

    public f h(kt.c cVar) {
        this.f73705s = cVar;
        return this;
    }

    public void i(kt.d dVar) {
        this.f73702p = dVar;
        h hVar = new h();
        hVar.a(new i(this));
        hVar.a(new g(this));
        hVar.b();
    }

    public void j(mt.b bVar) {
        e().x(this, bVar);
    }

    public void k(Set<String> set, mt.b bVar) {
        e().y(this, set, bVar);
    }

    public f l(int i11, int i12) {
        this.f73695i = i11;
        this.f73696j = i12;
        return this;
    }

    public void m(mt.b bVar, boolean z11, List<String> list, String str, String str2, String str3) {
        n(bVar, z11, new lt.a(this.f73687a, list, str, str2, str3, this.f73695i, this.f73696j));
    }

    public void n(mt.b bVar, boolean z11, @NonNull lt.c cVar) {
        this.f73694h = true;
        List<String> b11 = cVar.b();
        if (b11.isEmpty()) {
            bVar.a();
            return;
        }
        this.f73689c = cVar;
        cVar.show();
        View c11 = cVar.c();
        View a11 = cVar.a();
        cVar.setCancelable(false);
        cVar.setCanceledOnTouchOutside(false);
        c11.setClickable(true);
        c11.setOnClickListener(new a(cVar, z11, bVar, b11));
        if (a11 != null) {
            a11.setClickable(true);
            a11.setOnClickListener(new b(cVar, bVar));
        }
        this.f73689c.setOnDismissListener(new c());
    }

    public void o(mt.b bVar, boolean z11, @NonNull lt.d dVar) {
        this.f73694h = true;
        List<String> v11 = dVar.v();
        if (v11.isEmpty()) {
            bVar.a();
            return;
        }
        dVar.showNow(d(), "PermissionXRationaleDialogFragment");
        View w11 = dVar.w();
        View t11 = dVar.t();
        dVar.setCancelable(false);
        w11.setClickable(true);
        w11.setOnClickListener(new d(dVar, z11, bVar, v11));
        if (t11 != null) {
            t11.setClickable(true);
            t11.setOnClickListener(new e(dVar, bVar));
        }
    }
}
