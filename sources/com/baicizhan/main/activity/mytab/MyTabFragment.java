package com.baicizhan.main.activity.mytab;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import cn.hugo.android.scanner.CaptureActivity;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.BottomSheetUtils;
import com.baicizhan.client.business.util.StoreEntryJumper;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.baicizhan.client.business.webview.sdk.NavigatorMgr;
import com.baicizhan.main.activity.IntroductionPageActivity;
import com.baicizhan.main.activity.SingleFragmentActivity;
import com.baicizhan.main.activity.calendar.DakaCalendarActivity;
import com.baicizhan.main.activity.feedback.FeedbackWebviewActivity;
import com.baicizhan.main.activity.idenity.UserGradleActivity;
import com.baicizhan.main.activity.mytab.MyTabFragment;
import com.baicizhan.main.activity.mytab.device.MyDeviceVM;
import com.baicizhan.main.activity.mytab.task.TaskVM;
import com.baicizhan.main.activity.setting.SettingsActivity;
import com.baicizhan.main.activity.userinfo.UserInfoActivity;
import com.baicizhan.main.home.experiment.q0;
import com.jiongji.andriod.card.R;
import gs.r9;
import he.w;
import ma.l;
import ma.t;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@qu.b
/* loaded from: classes4.dex */
public class MyTabFragment extends he.f {

    /* renamed from: l, reason: collision with root package name */
    public static final String f18584l = "MyTabFragment";

    /* renamed from: m, reason: collision with root package name */
    public static final String f18585m = "tab_index";

    /* renamed from: f, reason: collision with root package name */
    public w f18586f;

    /* renamed from: g, reason: collision with root package name */
    public bh.c f18587g;

    /* renamed from: h, reason: collision with root package name */
    public r9 f18588h;

    /* renamed from: i, reason: collision with root package name */
    public TaskVM f18589i;

    /* renamed from: j, reason: collision with root package name */
    public MyDeviceVM f18590j;

    /* renamed from: k, reason: collision with root package name */
    public final ActivityResultLauncher<Intent> f18591k = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: he.h
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            MyTabFragment.this.X((ActivityResult) obj);
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Observer<Void> {
        public a() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            BczWebExecutorKt.startWebLeftIn(MyTabFragment.this.getActivity(), BczWebExecutorKt.URL_MY_LIBRARY);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Observer<Void> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            FeedbackWebviewActivity.M0(MyTabFragment.this.getActivity());
            MyTabFragment.this.f18587g.i(8);
            l.a(t.f73012k, ma.a.f72818q0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Observer<Void> {
        public c() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            StoreEntryJumper.jumpToNativeMall(MyTabFragment.this.requireActivity(), "bcz_app_my_tab_v2");
            l.a(t.f73012k, ma.a.f72811p0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Observer<Void> {
        public d() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            SingleFragmentActivity.J0(MyTabFragment.this.requireActivity(), je.a.class, null, MyTabFragment.this.getString(R.string.my_tab_item_my_collection), false, false);
            l.a(t.f73012k, ma.a.f72797n0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Observer<Void> {
        public e() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            BczWebHelperKt.startExchangeCenter(MyTabFragment.this.requireActivity(), "app_left_drawer");
            l.a(t.f73012k, "credit-click");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements Observer<Void> {
        public f() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            BczWebExecutorKt.startNormalWeb(MyTabFragment.this.requireActivity(), BczWebExecutorKt.URL_COURSE);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements Observer<Void> {
        public g() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            MyTabFragment.this.f18591k.launch(new Intent(MyTabFragment.this.requireActivity(), (Class<?>) SettingsActivity.class));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements Observer<Void> {
        public h() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            ch.l lVar = ch.l.f8644a;
            if (TextUtils.isEmpty(lVar.c())) {
                SingleFragmentActivity.I0(MyTabFragment.this.requireActivity(), ge.e.class, null, MyTabFragment.this.getString(R.string.my_tab_item_word_tests));
            } else if (MyTabFragment.this.getActivity() != null) {
                BczWebExecutorKt.startNormalWeb(MyTabFragment.this.requireActivity(), lVar.c(), MyTabFragment.this.getActivity().getString(R.string.my_tab_item_word_tests));
            }
            l.a(t.f73013l, ma.a.f72860w0);
        }
    }

    private void K() {
        this.f18586f.i().observe(this, new a());
        this.f18586f.h().observe(this, new Observer() { // from class: he.o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MyTabFragment.this.Q((Void) obj);
            }
        });
        this.f18586f.j().observe(this, new b());
        this.f18586f.l().observe(this, new c());
        this.f18586f.m().observe(this, new d());
        this.f18586f.n().observe(this, new e());
        this.f18586f.o().observe(this, new f());
        this.f18586f.p().observe(this, new Observer() { // from class: he.p
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MyTabFragment.this.R((Void) obj);
            }
        });
        this.f18586f.q().observe(this, new Observer() { // from class: he.q
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MyTabFragment.this.S((Void) obj);
            }
        });
        this.f18586f.r().observe(this, new Observer() { // from class: he.r
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MyTabFragment.this.T((Void) obj);
            }
        });
        this.f18586f.s().observe(this, new g());
        this.f18586f.k().observe(getViewLifecycleOwner(), new Observer() { // from class: he.s
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MyTabFragment.this.U((Void) obj);
            }
        });
        this.f18586f.u().observe(this, new h());
        this.f18586f.t().observe(this, new Observer() { // from class: he.t
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                va.g.i((String) obj, 0);
            }
        });
        this.f18589i.k().observe(this, new Observer() { // from class: he.i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MyTabFragment.this.N((String) obj);
            }
        });
        this.f18589i.j().observe(getViewLifecycleOwner(), new Observer() { // from class: he.j
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MyTabFragment.this.O((String) obj);
            }
        });
        this.f18590j.c().observe(this, new Observer() { // from class: he.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MyTabFragment.this.P((String) obj);
            }
        });
    }

    private void L(LayoutInflater inflater) {
        r9 i11 = r9.i(inflater);
        this.f18588h = i11;
        i11.p(this.f18586f);
        this.f18588h.o(this.f18589i);
        this.f18588h.n(this.f18587g);
        this.f18588h.setLifecycleOwner(this);
        TextViewCompat.setAutoSizeTextTypeUniformWithPresetSizes(this.f18588h.f56615v, new int[]{20, 21, 22, 23, 24}, 2);
        this.f18588h.f56594a.setPadding(0, zb.a.k(getActivity()) + xb.f.a(getContext(), 8.0f), 0, xb.f.a(getContext(), 8.0f));
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f18588h.f56595b.getLayoutParams();
        layoutParams.setMargins(0, xb.f.a(getContext(), 64.0f) + zb.a.k(getActivity()), 0, 0);
        this.f18588h.f56595b.setLayoutParams(layoutParams);
        this.f18588h.f56598e.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: he.l
            @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
            public final void onScrollChange(NestedScrollView nestedScrollView, int i12, int i13, int i14, int i15) {
                MyTabFragment.this.V(nestedScrollView, i12, i13, i14, i15);
            }
        });
        Drawable drawable = getResources().getDrawable(R.drawable.ic_my_tab_gradle_enter);
        drawable.setBounds(0, 0, xb.f.a(getContext(), 12.0f), xb.f.a(getContext(), 12.0f));
        this.f18588h.f56601h.setCompoundDrawables(null, null, drawable, null);
        this.f18588h.B.setGoExchange(new x00.l() { // from class: he.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 W;
                W = MyTabFragment.this.W((String) obj);
                return W;
            }
        });
        this.f18588h.f56619z.setClick(new View.OnClickListener() { // from class: he.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ma.l.a(ma.t.f73012k, ma.a.Z4);
            }
        });
        if (q0.f21394a.b()) {
            this.f18588h.f56606m.getRoot().setVisibility(8);
        }
        J();
    }

    private void M() {
        this.f18586f = (w) new ViewModelProvider(this).get(w.class);
        this.f18589i = (TaskVM) new ViewModelProvider(this).get(TaskVM.class);
        this.f18590j = (MyDeviceVM) new ViewModelProvider(this).get(MyDeviceVM.class);
        this.f18587g = (bh.c) new ViewModelProvider(getActivity()).get(bh.c.class);
    }

    public static MyTabFragment Y(int index) {
        MyTabFragment myTabFragment = new MyTabFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("tab_index", index);
        myTabFragment.setArguments(bundle);
        return myTabFragment;
    }

    public final void J() {
        r9 r9Var = this.f18588h;
        if (r9Var == null) {
            return;
        }
        View findViewById = r9Var.getRoot().findViewById(R.id.my_calendar);
        if (findViewById != null) {
            com.baicizhan.base.d.d((ViewGroup) findViewById, getContext());
        }
        View findViewById2 = this.f18588h.getRoot().findViewById(R.id.my_plan);
        if (findViewById2 != null) {
            com.baicizhan.base.d.d((ViewGroup) findViewById2, getContext());
        }
        View findViewById3 = this.f18588h.getRoot().findViewById(R.id.my_word_test);
        if (findViewById3 != null) {
            com.baicizhan.base.d.d((ViewGroup) findViewById3, getContext());
        }
        try {
            View findViewById4 = this.f18588h.getRoot().findViewById(R.id.my_collection);
            if (findViewById4 != null) {
                com.baicizhan.base.d.d((ViewGroup) findViewById4, getContext());
            }
            View findViewById5 = this.f18588h.getRoot().findViewById(R.id.my_exam);
            if (findViewById5 != null) {
                com.baicizhan.base.d.d((ViewGroup) findViewById5, getContext());
            }
            View findViewById6 = this.f18588h.getRoot().findViewById(R.id.my_money);
            if (findViewById6 != null) {
                com.baicizhan.base.d.d((ViewGroup) findViewById6, getContext());
            }
            View findViewById7 = this.f18588h.getRoot().findViewById(R.id.my_mall);
            if (findViewById7 != null) {
                com.baicizhan.base.d.d((ViewGroup) findViewById7, getContext());
            }
            View findViewById8 = this.f18588h.getRoot().findViewById(R.id.give_praise);
            if (findViewById8 != null) {
                com.baicizhan.base.d.d((ViewGroup) findViewById8, getContext());
            }
            View findViewById9 = this.f18588h.getRoot().findViewById(R.id.help_and_feedback);
            if (findViewById9 != null) {
                com.baicizhan.base.d.d((ViewGroup) findViewById9, getContext());
            }
        } catch (Exception unused) {
        }
    }

    public final /* synthetic */ void N(String str) {
        BczWebExecutorKt.startNormalWeb(requireActivity(), str);
    }

    public final /* synthetic */ void O(String str) {
        Intent intent = new Intent(jc.a.f64014a, Uri.parse(str));
        intent.setFlags(67108864);
        startActivity(intent);
    }

    public final /* synthetic */ void P(String str) {
        NavigatorMgr.INSTANCE.navToWebOrNaive(getContext(), str, 1);
    }

    public final /* synthetic */ void Q(Void r22) {
        DakaCalendarActivity.V0(getActivity(), 1);
        l.a(t.f73003b, ma.a.J);
    }

    public final /* synthetic */ void R(Void r12) {
        UserInfoActivity.J0(requireActivity());
    }

    public final /* synthetic */ void S(Void r52) {
        if (getActivity() instanceof zf.a) {
            BottomSheetUtils.showBaicizhanAppStoreBottomSheet(getActivity(), ((zf.a) getActivity()).getBottomSheetLayout(), getString(R.string.my_tab_give_praise), new BottomSheetUtils.PraiseStatsCallback(getActivity()));
        }
        l.a(t.f73012k, ma.a.f72825r0);
    }

    public final /* synthetic */ void T(Void r42) {
        requireActivity().startActivity(new Intent(requireActivity(), (Class<?>) CaptureActivity.class));
        requireActivity().overridePendingTransition(R.anim.business_push_left_in, R.anim.business_push_left_out);
    }

    public final /* synthetic */ void U(Void r32) {
        UserGradleActivity.r1(requireActivity(), 2, this.f18587g.f6827h.getValue());
    }

    public final /* synthetic */ void V(NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14) {
        int height = this.f18588h.f56594a.getHeight();
        this.f18588h.m(i12 > height / 2);
        this.f18588h.f56594a.setBackgroundColor(i12 > height ? Color.argb(255, 255, 255, 255) : Color.argb((int) ((i12 / height) * 255.0f), 255, 255, 255));
    }

    public final /* synthetic */ g2 W(String str) {
        l.a(t.f73012k, "credit-click");
        BczWebExecutorKt.startNormalWeb(getActivity(), str);
        return null;
    }

    public final /* synthetic */ void X(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        if (activityResult.getResultCode() != -1 || data == null || data.getParcelableExtra("loggedOutUser") == null) {
            return;
        }
        IntroductionPageActivity.x1(requireContext(), (UserRecord) data.getParcelableExtra("loggedOutUser"));
        requireActivity().finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        M();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        L(inflater);
        K();
        return this.f18588h.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        zb.a.f(getActivity(), true);
        this.f18589i.p();
        this.f18590j.i();
        this.f18586f.M(getContext());
    }
}
