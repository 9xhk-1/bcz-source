package ze;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.main.activity.SingleFragmentActivity;
import com.baicizhan.main.activity.setting.privatessetting.debug.c2;
import com.jiongji.andriod.card.R;
import gs.ea;
import ma.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class r extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public ea f102583a;

    /* renamed from: b, reason: collision with root package name */
    public s f102584b;

    private void A(LayoutInflater inflater) {
        ea e11 = ea.e(inflater);
        this.f102583a = e11;
        e11.j(this.f102584b);
        this.f102583a.setLifecycleOwner(this);
    }

    private void B() {
        s sVar = (s) new ViewModelProvider(this).get(s.class);
        this.f102584b = sVar;
        sVar.f102587b.observe(this, new Observer() { // from class: ze.l
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                r.this.C((Void) obj);
            }
        });
        this.f102584b.f102590e.observe(this, new Observer() { // from class: ze.m
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                r.this.D((Void) obj);
            }
        });
        this.f102584b.f102592g.observe(this, new Observer() { // from class: ze.n
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                r.this.E((Boolean) obj);
            }
        });
        this.f102584b.f102586a.observe(this, new Observer() { // from class: ze.o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                r.this.F((Void) obj);
            }
        });
        this.f102584b.f102588c.observe(this, new Observer() { // from class: ze.p
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                r.this.G((Void) obj);
            }
        });
        this.f102584b.f102589d.observe(this, new Observer() { // from class: ze.q
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                r.this.H((Void) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(Void r82) {
        SingleFragmentActivity.K0(getActivity(), b.class, null, getString(R.string.setting_ui_private_ad), false, false, -1);
        ma.l.a(t.f73012k, ma.a.F3);
    }

    public final /* synthetic */ void D(Void r42) {
        SingleFragmentActivity.I0(getActivity(), c2.class, null, getString(R.string.setting_ui_develop_setting));
    }

    public final /* synthetic */ void E(Boolean bool) {
        this.f102583a.f54760a.getRoot().setVisibility((bool == null || !bool.booleanValue()) ? 8 : 0);
    }

    public final /* synthetic */ void F(Void r82) {
        SingleFragmentActivity.K0(getActivity(), k.class, null, getString(R.string.setting_ui_private_permissions), false, false, -1);
        ma.l.a(t.f73012k, ma.a.E3);
    }

    public final /* synthetic */ void G(Void r22) {
        BczWebExecutorKt.startNormalWeb(getContext(), getString(R.string.url_private_protocol_userinfo_collection));
        ma.l.a(t.f73012k, ma.a.G3);
    }

    public final /* synthetic */ void H(Void r22) {
        BczWebExecutorKt.startWebLeftIn(getActivity(), getString(R.string.url_private_protocol));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        B();
        this.f102584b.start();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        A(inflater);
        return this.f102583a.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }
}
