package ai;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.main.activity.ForceAuthActivity;
import com.baicizhan.main.activity.IntroductionPageActivity;
import com.baicizhan.main.activity.userinfo.data.AccountBindingMgr;
import com.jiongji.andriod.card.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Callable;
import kc.r;
import kc.u;
import q9.x;
import qb0.g;
import qb0.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static String f2645d = "ForceAuthMgr";

    /* renamed from: e, reason: collision with root package name */
    public static final String f2646e = "key_force_auth";

    /* renamed from: f, reason: collision with root package name */
    public static final String f2647f = "key_force_auth_last_show_time";

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<FragmentActivity> f2648a;

    /* renamed from: b, reason: collision with root package name */
    public h f2649b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2650c = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends r {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f2652a;

        public b(final FragmentActivity val$activity) {
            this.f2652a = val$activity;
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View view) {
            ForceAuthActivity.J0(this.f2652a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends r {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f2654a;

        public c(final FragmentActivity val$activity) {
            this.f2654a = val$activity;
        }

        @Override // kc.r, kc.q
        public void onDialogNegativeClick(@NonNull View view) {
            a.this.f();
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View view) {
            ForceAuthActivity.J0(this.f2654a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Callable<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f2659a;

        public e(final Activity val$activity) {
            this.f2659a = val$activity;
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            gi.e.q(this.f2659a);
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public static a f2661a = new a();
    }

    public static a e() {
        return f.f2661a;
    }

    public void c(FragmentActivity activity) {
        this.f2648a = new WeakReference<>(activity);
        (!AccountBindingMgr.inst().isLoaded() ? AccountBindingMgr.inst().bindInfo() : rx.c.M2(AccountBindingMgr.inst().getAllBindInfos())).I3(tb0.a.a()).r5(new C0019a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Map<String, AccountBindingMgr.BindInfo> bindInfo) {
        long f11 = i9.f.f(pb.a.a(), f2646e);
        long f12 = i9.f.f(pb.a.a(), f2647f);
        int betweenDays = TimeUtil.getBetweenDays(f11, System.currentTimeMillis());
        int betweenDays2 = f12 == 0 ? 1 : TimeUtil.getBetweenDays(f12, System.currentTimeMillis());
        qb.c.i(f2645d, "%d,%d", Long.valueOf(f11), Integer.valueOf(betweenDays));
        if (g(bindInfo)) {
            if (f11 == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                i9.f.m(pb.a.a(), f2646e, currentTimeMillis);
                qb.c.i(f2645d, "first %d", Long.valueOf(currentTimeMillis));
                return;
            }
            FragmentActivity fragmentActivity = this.f2648a.get();
            if (fragmentActivity == null) {
                qb.c.i(f2645d, "NULL Activity", new Object[0]);
                return;
            }
            if (betweenDays < 1 || betweenDays > 5 || (betweenDays2 == 0 && this.f2650c)) {
                if (betweenDays >= 6) {
                    mc.a.n(fragmentActivity, ((u) ((u.a) ((u.a) new u.a(fragmentActivity).U(R.string.force_auth_dialog_content_ruthless).n(R.string.force_auth_dialog_logout)).C(R.string.force_auth_dialog_confirm)).d()).f0(new c(fragmentActivity)), "bind-force");
                }
            } else {
                this.f2650c = true;
                i9.f.m(pb.a.a(), f2647f, System.currentTimeMillis());
                mc.a.n(fragmentActivity, ((u) ((u.a) ((u.a) new u.a(fragmentActivity).U(R.string.force_auth_dialog_content).n(R.string.force_auth_dialog_later)).C(R.string.force_auth_dialog_confirm)).d()).f0(new b(fragmentActivity)), "bind");
            }
        }
    }

    public final void f() {
        qb.c.i(f2645d, "", new Object[0]);
        FragmentActivity fragmentActivity = this.f2648a.get();
        if (fragmentActivity == null) {
            return;
        }
        UserRecord p11 = x.r().p();
        h hVar = this.f2649b;
        if (hVar == null || hVar.isUnsubscribed()) {
            this.f2649b = rx.c.z2(new e(fragmentActivity)).w5(bc0.c.a()).I3(tb0.a.a()).r5(new d(fragmentActivity, p11));
        } else {
            qb.c.i(f2645d, "logout ", new Object[0]);
        }
    }

    public final boolean g(Map<String, AccountBindingMgr.BindInfo> bindInfo) {
        return (bindInfo.containsKey("phone") || bindInfo.containsKey("weixin") || bindInfo.containsKey("qq")) ? false : true;
    }

    public void h() {
        i9.f.m(pb.a.a(), f2646e, 0L);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ai.a$a, reason: collision with other inner class name */
    public class C0019a extends g<Map<String, AccountBindingMgr.BindInfo>> {
        public C0019a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(a.f2645d, "", e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Map<String, AccountBindingMgr.BindInfo> stringBindInfoMap) {
            a.this.d(stringBindInfoMap);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends g<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f2656a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UserRecord f2657b;

        public d(final Activity val$activity, final UserRecord val$user) {
            this.f2656a = val$activity;
            this.f2657b = val$user;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            va.g.g(R.string.user_center_logout_failed, 0);
            qb.c.c(a.f2645d, "logout failed.", e11);
        }

        @Override // qb0.c
        public void onNext(Object o11) {
            Intent intent = new Intent(this.f2656a, (Class<?>) IntroductionPageActivity.class);
            UserRecord userRecord = this.f2657b;
            if (userRecord != null) {
                Activity activity = this.f2656a;
                String verboseLoginType = userRecord.getVerboseLoginType();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" ");
                sb2.append(this.f2657b.getLoginType() == 3 ? "" : this.f2657b.getUser());
                intent.putExtra(IntroductionPageActivity.f17961o, activity.getString(R.string.last_login, verboseLoginType, sb2.toString()));
                intent.putExtra(IntroductionPageActivity.f17962p, this.f2657b.getUser());
                if (this.f2657b.getLoginType() == 0 || 6 == this.f2657b.getLoginType()) {
                    ia.a.m(ia.a.f60464o, this.f2657b.getUser());
                }
            }
            uf.a.d();
            this.f2656a.startActivity(intent);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
