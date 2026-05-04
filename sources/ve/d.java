package ve;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.webview.sdk.NavigatorMgr;
import com.baicizhan.main.activity.userinfo.data.AccountBindingMgr;
import com.baicizhan.main.auth.AccountVerificationActivity;
import com.baicizhan.main.auth.VerificationType;
import com.jiongji.andriod.card.R;
import gs.gb;
import java.util.Map;
import kc.r;
import kc.u;
import ma.l;
import ma.t;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransportException;
import q9.x;
import qb0.h;
import tf.q;
import va.f;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d extends Fragment implements View.OnClickListener {

    /* renamed from: j, reason: collision with root package name */
    public static final String f93842j = "AccountFragment";

    /* renamed from: k, reason: collision with root package name */
    public static final int f93843k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f93844l = 2;

    /* renamed from: m, reason: collision with root package name */
    public static final int f93845m = 101;

    /* renamed from: b, reason: collision with root package name */
    public h f93847b;

    /* renamed from: c, reason: collision with root package name */
    public h f93848c;

    /* renamed from: d, reason: collision with root package name */
    public f f93849d;

    /* renamed from: e, reason: collision with root package name */
    public ta.b f93850e;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f93846a = {R.drawable.ic_app_mail, R.drawable.ic_app_weibo, R.drawable.ic_app_renren, R.drawable.ic_baicizhan, R.drawable.ic_app_wechat, R.drawable.ic_app_qq, R.drawable.ic_app_phone, R.drawable.ic_login_hw};

    /* renamed from: f, reason: collision with root package name */
    public gb f93851f = null;

    /* renamed from: g, reason: collision with root package name */
    public int f93852g = 2;

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f93853h = new Runnable() { // from class: ve.b
        @Override // java.lang.Runnable
        public final void run() {
            d.this.G();
        }
    };

    /* renamed from: i, reason: collision with root package name */
    public final Handler f93854i = new Handler();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ve.d$d, reason: collision with other inner class name */
    public class C1263d extends r {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f93858a;

        public C1263d(final String val$provider) {
            this.f93858a = val$provider;
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View view) {
            d.this.K(this.f93858a);
        }
    }

    public static d D(int type) {
        d dVar = new d();
        dVar.f93852g = type;
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        AccountBindingMgr inst = AccountBindingMgr.inst();
        AccountBindingMgr.BindInfo bindInfo = inst.getBindInfo("qq");
        AccountBindingMgr.BindInfo bindInfo2 = inst.getBindInfo("phone");
        AccountBindingMgr.BindInfo bindInfo3 = inst.getBindInfo("weixin");
        AccountBindingMgr.BindInfo bindInfo4 = inst.getBindInfo("weibo");
        this.f93851f.y(this.f93852g != 1);
        this.f93851f.u(bindInfo2);
        this.f93851f.v(bindInfo);
        this.f93851f.z(bindInfo3);
        UserRecord p11 = x.r().p();
        if (p11 != null) {
            this.f93851f.s(p11.getLoginType());
            this.f93851f.f55041q.setText(UserRecord.VERBOSE_LOGIN_TYPES[p11.getLoginType()]);
            this.f93851f.f55040p.setImageResource(this.f93846a[p11.getLoginType()]);
            String displayName = p11.getDisplayName();
            int loginType = p11.getLoginType();
            if (loginType == 0) {
                this.f93851f.x(true);
                displayName = p11.getEmail();
            } else if (loginType != 1) {
                if (loginType != 4) {
                    if (loginType != 5) {
                        if (loginType == 6) {
                            displayName = bindInfo2 != null ? bindInfo2.unionid : "";
                            this.f93851f.x(bindInfo2 != null);
                        } else if (loginType == 7) {
                            this.f93851f.x(true);
                            displayName = p11.getNickName();
                        }
                    } else if (bindInfo == null) {
                        this.f93851f.x(false);
                    } else {
                        this.f93851f.x(true);
                        displayName = bindInfo.nickname;
                    }
                } else if (bindInfo3 == null) {
                    this.f93851f.x(false);
                } else {
                    this.f93851f.x(true);
                    displayName = bindInfo3.nickname;
                }
            } else if (bindInfo4 == null) {
                this.f93851f.x(false);
            } else {
                this.f93851f.x(true);
                displayName = bindInfo4.nickname;
            }
            this.f93851f.f55039o.setText(displayName);
        }
        f fVar = this.f93849d;
        if (fVar != null) {
            fVar.dismiss();
        }
    }

    public final void B(String provider) {
        h hVar = this.f93847b;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f93847b.unsubscribe();
        }
        if ("qq".equals(provider) && !c9.a.c(getContext())) {
            g.g(R.string.qq_not_install, 0);
        } else if ("weixin".equals(provider) && !c9.a.f(getContext())) {
            g.g(R.string.weixin_not_install, 0);
        } else {
            this.f93849d.show();
            this.f93847b = AccountBindingMgr.inst().bind(provider, getActivity()).I3(tb0.a.a()).r5(new b());
        }
    }

    public final void C(boolean toChange) {
        AccountBindingMgr inst = AccountBindingMgr.inst();
        if (toChange && inst.getBindInfo("qq") == null && inst.getBindInfo("weixin") == null) {
            g.g(R.string.user_center_edit_phone_hint, 1);
            return;
        }
        if (getActivity() == null) {
            return;
        }
        l.a(t.f73023v, toChange ? ma.a.F2 : ma.a.C2);
        if (!toChange) {
            com.baicizhan.main.auth.onekey.a.f19954a.p(getActivity(), VerificationType.BIND_PHONE_DIRECTLY, null, -1);
            return;
        }
        AccountBindingMgr.BindInfo bindInfo = AccountBindingMgr.inst().getBindInfo("qq");
        AccountBindingMgr.BindInfo bindInfo2 = AccountBindingMgr.inst().getBindInfo("weixin");
        if ((bindInfo == null || TextUtils.isEmpty(bindInfo.unionid)) && (bindInfo2 == null || TextUtils.isEmpty(bindInfo2.unionid))) {
            g.g(R.string.user_center_edit_phone_hint, 0);
        } else {
            AccountVerificationActivity.e2(this, AccountBindingMgr.inst().getBindInfo("phone").unionid, "手机号", 101);
        }
    }

    public final void E() {
        ta.b bVar = (ta.b) new ViewModelProvider(this).get(ta.b.class);
        this.f93850e = bVar;
        this.f93851f.t(bVar);
        this.f93850e.f90403e.observeForever(new Observer() { // from class: ve.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                d.this.F((Void) obj);
            }
        });
        if (AccountBindingMgr.inst().isLoaded()) {
            this.f93850e.s();
        } else {
            I();
        }
    }

    public final /* synthetic */ void F(Void r12) {
        I();
    }

    public final /* synthetic */ void G() {
        this.f93849d.show();
    }

    public final void I() {
        this.f93850e.k();
        AccountBindingMgr.inst().bindInfo().I3(tb0.a.a()).r5(new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J(final String provider) {
        mc.a.k(this, ((u) new u.a(requireContext()).U(R.string.user_center_unbind_dialog).d()).f0(new C1263d(provider)));
    }

    public final void K(String provider) {
        h hVar = this.f93848c;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f93848c.unsubscribe();
        }
        this.f93849d.show();
        this.f93848c = AccountBindingMgr.inst().unbind(provider).I3(tb0.a.a()).r5(new c());
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable @m80.l Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 101 && resultCode == -1) {
            AccountVerificationActivity.U1(requireContext(), VerificationType.BIND_PHONE_CHANGE);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        String str;
        int id2 = v11.getId();
        str = "weixin";
        switch (id2) {
            case R.id.bind_phone_button /* 2131361987 */:
            case R.id.bind_qq_button /* 2131361991 */:
            case R.id.bind_wechat_button /* 2131361996 */:
                if (id2 == R.id.bind_qq_button) {
                    str = "qq";
                } else if (id2 != R.id.bind_wechat_button) {
                    str = "phone";
                }
                J(str);
                break;
            case R.id.current_button /* 2131362232 */:
                NavigatorMgr.INSTANCE.navToWebOrNaive(getContext(), "https://learn.baicizhan.com/new_activities/delete_user/index.html", 1);
                break;
            case R.id.unbind_phone_button /* 2131363907 */:
                C(false);
                break;
            case R.id.unbind_qq_button /* 2131363910 */:
            case R.id.unbind_wechat_button /* 2131363914 */:
                B(id2 == R.id.unbind_qq_button ? "qq" : "weixin");
                break;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        gb gbVar = (gb) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.fragment_usercenter_accountbind, null, false);
        this.f93851f = gbVar;
        gbVar.setLifecycleOwner(this);
        this.f93851f.r(this);
        E();
        f fVar = new f(getActivity());
        this.f93849d = fVar;
        fVar.setCancelable(false);
        q.f90552a.a().f();
        return this.f93851f.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f93849d.dismiss();
        this.f93854i.removeCallbacks(this.f93853h);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        H();
        super.onResume();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<Map<String, AccountBindingMgr.BindInfo>> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            d.this.f93850e.f(e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Map<String, AccountBindingMgr.BindInfo> stringBindInfoMap) {
            d.this.f93850e.s();
            d.this.H();
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<Void> {
        public b() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            d.this.f93849d.dismiss();
            qb.c.c(d.f93842j, "", e11);
            if (e11.getCause() instanceof TException) {
                e11 = e11.getCause();
            }
            if (e11 instanceof TTransportException) {
                g.g(R.string.network_error_retry_later, 0);
            } else if (((e11 instanceof TException) || (e11 instanceof AccountBindingMgr.AuthExcetption)) && d.this.getActivity() != null) {
                g.i(e11.getMessage(), 0);
            }
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Void aVoid) {
            FragmentActivity activity;
            g.g(R.string.user_center_bind_success, 0);
            if (d.this.f93852g == 1 && (activity = d.this.getActivity()) != null) {
                activity.finish();
            }
            d.this.H();
            d.this.f93849d.dismiss();
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends qb0.g<Void> {
        public c() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            d.this.f93849d.dismiss();
            qb.c.c(d.f93842j, "", e11);
            g.i(g.d(e11), 0);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Void aVoid) {
            d.this.H();
            d.this.f93849d.dismiss();
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
