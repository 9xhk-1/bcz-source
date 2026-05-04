package ef;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.activity.SingleFragmentActivity;
import com.baicizhan.main.activity.idenity.UserGradleActivity;
import com.baicizhan.main.activity.userinfo.editname.UserEditActivity;
import com.baicizhan.main.activity.userinfo.school.main.EditSchoolActivity;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import ef.k;
import gs.ib;
import gs.mb;
import java.util.Objects;
import kc.u;
import va.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class k extends Fragment {

    /* renamed from: f, reason: collision with root package name */
    public static final String f49754f = "UserInfoFragment";

    /* renamed from: a, reason: collision with root package name */
    public ib f49755a;

    /* renamed from: b, reason: collision with root package name */
    public l f49756b;

    /* renamed from: c, reason: collision with root package name */
    public ef.a f49757c;

    /* renamed from: d, reason: collision with root package name */
    public mb f49758d;

    /* renamed from: e, reason: collision with root package name */
    public BottomSheetLayout f49759e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Observer<Integer> {
        public a() {
        }

        public final /* synthetic */ void b(BottomSheetLayout bottomSheetLayout) {
            k.this.f49756b.m();
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Integer integer) {
            if (k.this.f49758d == null) {
                k kVar = k.this;
                kVar.f49758d = mb.e(LayoutInflater.from(kVar.getContext()));
            }
            if (k.this.f49759e == null && (k.this.getActivity() instanceof zf.a)) {
                k kVar2 = k.this;
                kVar2.f49759e = ((zf.a) kVar2.getActivity()).getBottomSheetLayout();
            }
            k.this.f49757c.c(integer.intValue());
            k.this.f49758d.j(k.this.f49757c);
            if (k.this.f49759e != null) {
                k.this.f49759e.u();
                k.this.f49759e.L(k.this.f49758d.getRoot());
                k.this.f49759e.o(new ql.b() { // from class: ef.j
                    @Override // ql.b
                    public final void a(BottomSheetLayout bottomSheetLayout) {
                        k.a.this.b(bottomSheetLayout);
                    }
                });
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Observer<Void> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void s11) {
            SingleFragmentActivity.J0(k.this.getActivity(), ff.g.class, null, k.this.getString(R.string.userinfo_edit_avatar_title), true, false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Observer<Void> {
        public c() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            UserEditActivity.Q0(k.this.getActivity());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Observer<Long> {
        public d() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Long currentBirthday) {
            k.this.Q(currentBirthday.longValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Observer<Void> {
        public e() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            k.this.R();
        }
    }

    private void I() {
        this.f49756b.f49779l.observe(this, new a());
        this.f49756b.f49778k.observe(this, new b());
        this.f49756b.f49780m.observe(this, new c());
        this.f49756b.f49784q.observe(this, new Observer() { // from class: ef.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                k.this.L((Void) obj);
            }
        });
        this.f49756b.f49783p.observe(this, new Observer() { // from class: ef.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                k.this.M((Void) obj);
            }
        });
        this.f49756b.f49785r.observe(this, new Observer() { // from class: ef.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                k.this.N((Void) obj);
            }
        });
        SingleLiveEvent<Integer> singleLiveEvent = this.f49757c.f49744b;
        final l lVar = this.f49756b;
        Objects.requireNonNull(lVar);
        singleLiveEvent.observe(this, new Observer() { // from class: ef.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                l.this.l(((Integer) obj).intValue());
            }
        });
        this.f49757c.f49745c.observe(this, new Observer() { // from class: ef.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                k.this.O((Void) obj);
            }
        });
        this.f49756b.f49781n.observe(this, new d());
        this.f49756b.f49782o.observe(this, new e());
        this.f49756b.f49786s.observe(this, new Observer() { // from class: ef.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                k.this.P((Void) obj);
            }
        });
        this.f49756b.f49787t.observe(this, new Observer() { // from class: ef.i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                va.g.i((String) obj, 0);
            }
        });
    }

    private void J(LayoutInflater inflater) {
        ib e11 = ib.e(inflater);
        this.f49755a = e11;
        e11.j(this.f49756b);
        this.f49755a.setLifecycleOwner(this);
    }

    private void K() {
        this.f49756b = (l) new ViewModelProvider(this).get(l.class);
        this.f49757c = (ef.a) new ViewModelProvider(this).get(ef.a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(Void r12) {
        kf.l.H(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(Void r12) {
        EditSchoolActivity.J0(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(Void r22) {
        UserGradleActivity.q1(requireActivity(), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(Void r12) {
        BottomSheetLayout bottomSheetLayout = this.f49759e;
        if (bottomSheetLayout != null) {
            bottomSheetLayout.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [kc.d, kc.h] */
    public /* synthetic */ void P(Void r22) {
        mc.a.l(this, ((u.a) new u.a(requireContext()).L(R.string.userinfo_ip_description_prompt_title).U(R.string.userinfo_ip_description_prompt_message).b0(ButtonType.SINGLE_POSITIVE).C(R.string.i_know)).d(), IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
    }

    public final void Q(long birthday) {
        j.c e11 = new j.c().e(System.currentTimeMillis());
        if (0 == birthday) {
            birthday = System.currentTimeMillis();
        }
        e11.g(birthday).d(new f()).a(getContext()).show();
    }

    public final void R() {
        SingleFragmentActivity.I0(getContext(), lf.h.class, null, getString(R.string.userinfo_edit_search_position_title));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        K();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        J(inflater);
        I();
        return this.f49755a.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f49756b.q(getContext());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements j.d {
        public f() {
        }

        @Override // va.j.d
        public void a(int y11, int m11, int d11) {
            k.this.f49756b.n(y11, m11, d11);
        }

        @Override // va.j.d
        public void cancel() {
        }
    }
}
