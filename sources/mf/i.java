package mf;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.main.activity.SingleFragmentActivity;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;
import gs.kb;
import gs.l8;
import java.util.Locale;
import va.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class i extends Fragment {

    /* renamed from: f, reason: collision with root package name */
    public static final String f73213f = "UserInfoFragment";

    /* renamed from: a, reason: collision with root package name */
    public l8 f73214a;

    /* renamed from: b, reason: collision with root package name */
    public kb f73215b;

    /* renamed from: c, reason: collision with root package name */
    public l f73216c;

    /* renamed from: d, reason: collision with root package name */
    public m f73217d;

    /* renamed from: e, reason: collision with root package name */
    public BottomSheetLayout f73218e;

    private void C() {
        this.f73216c.f73229h.observe(this, new Observer() { // from class: mf.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                i.this.J((Integer) obj);
            }
        });
        this.f73216c.f73228g.observe(this, new Observer() { // from class: mf.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                i.this.K(((Long) obj).longValue());
            }
        });
        this.f73216c.f73231j.observe(this, new Observer() { // from class: mf.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                i.this.F((Void) obj);
            }
        });
        this.f73216c.f73230i.observe(this, new Observer() { // from class: mf.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                i.this.G((Void) obj);
            }
        });
        this.f73217d.f73239c.observe(this, new Observer() { // from class: mf.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                i.this.H((Void) obj);
            }
        });
        this.f73217d.f73238b.observe(this, new Observer() { // from class: mf.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                i.this.I((Integer) obj);
            }
        });
        this.f73216c.f73232k.observe(this, new Observer() { // from class: mf.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                va.g.i((String) obj, 0);
            }
        });
    }

    private void D(LayoutInflater inflater) {
        l8 e11 = l8.e(inflater);
        this.f73214a = e11;
        e11.j(this.f73216c);
        this.f73214a.setLifecycleOwner(this);
    }

    private void E() {
        this.f73216c = (l) new ViewModelProvider(this).get(l.class);
        this.f73217d = (m) new ViewModelProvider(this).get(m.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(Void r42) {
        SingleFragmentActivity.I0(getContext(), nf.h.class, null, getString(R.string.userinfo_edit_search_major_title));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(Void r12) {
        kf.l.H(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(Void r12) {
        BottomSheetLayout bottomSheetLayout = this.f73218e;
        if (bottomSheetLayout != null) {
            bottomSheetLayout.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(long time) {
        Locale.setDefault(Locale.CHINA);
        new j.c().e(System.currentTimeMillis()).h(2).i((int) time).d(new a()).a(getContext()).show();
    }

    public final /* synthetic */ void I(Integer num) {
        this.f73216c.k(num.intValue());
        BottomSheetLayout bottomSheetLayout = this.f73218e;
        if (bottomSheetLayout != null) {
            bottomSheetLayout.u();
        }
    }

    public final void J(Integer edu) {
        if (this.f73215b == null) {
            this.f73215b = kb.e(getLayoutInflater());
        }
        this.f73217d.f73237a.setValue(edu);
        if (this.f73218e == null && (getActivity() instanceof zf.a)) {
            this.f73218e = ((zf.a) getActivity()).getBottomSheetLayout();
        }
        if (this.f73218e == null) {
            return;
        }
        this.f73215b.j(this.f73217d);
        this.f73218e.L(this.f73215b.getRoot());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        E();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        D(inflater);
        C();
        return this.f73214a.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f73216c.start();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements j.d {
        public a() {
        }

        @Override // va.j.d
        public void a(int y11, int m11, int d11) {
            i.this.f73216c.l(y11);
        }

        @Override // va.j.d
        public void cancel() {
        }
    }
}
