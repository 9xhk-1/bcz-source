package rd;

import android.animation.Animator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.databinding.ObservableInt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import gs.y8;
import pd.c;
import pd.d;
import sa.q;
import xb.f;
import xb.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends Fragment implements c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f83949e = "ImageDakaFragment";

    /* renamed from: a, reason: collision with root package name */
    public int f83950a;

    /* renamed from: b, reason: collision with root package name */
    public y8 f83951b;

    /* renamed from: c, reason: collision with root package name */
    public rd.b f83952c;

    /* renamed from: d, reason: collision with root package name */
    public MutableLiveData<Boolean> f83953d = new MutableLiveData<>(Boolean.FALSE);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: rd.a$a, reason: collision with other inner class name */
    public class C1047a implements Observer<Boolean> {
        public C1047a() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Boolean aBoolean) {
            if (aBoolean != null) {
                a.this.A(aBoolean.booleanValue());
            }
        }
    }

    public static a w(int type) {
        a aVar = new a();
        aVar.y(type);
        return aVar;
    }

    private void x() {
        this.f83951b.j(this.f83952c);
        this.f83952c.h(this.f83950a);
        this.f83952c.start();
        this.f83952c.d().observe(getViewLifecycleOwner(), new C1047a());
        q.g(this.f83951b.f57562b, i.a(requireContext(), 16.0f));
    }

    public final void A(final boolean open) {
        this.f83951b.f57561a.animate().setDuration(200L).alpha(open ? 1.0f : 0.0f).translationYBy(f.a(getContext(), 2.0f) * (open ? -1 : 1)).setListener(new b(open)).start();
    }

    public final void B() {
        this.f83952c = (rd.b) new ViewModelProvider(this).get(rd.b.class);
    }

    @Override // pd.c
    public d f() {
        return this.f83952c.c();
    }

    @Override // pd.c
    public ObservableInt g() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("viewModel is null");
        sb2.append(this.f83952c == null);
        qb.c.b(f83949e, sb2.toString(), new Object[0]);
        return this.f83952c.f83960c;
    }

    @Override // pd.c
    public LiveData<Boolean> l() {
        return this.f83953d;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        qb.c.i(f83949e, "onCreateView:" + this.f83950a, new Object[0]);
        B();
        z(inflater);
        x();
        this.f83953d.setValue(Boolean.TRUE);
        return this.f83951b.getRoot();
    }

    public void y(int type) {
        this.f83950a = type;
    }

    public final void z(LayoutInflater layoutInflater) {
        this.f83951b = y8.e(layoutInflater);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f83955a;

        public b(final boolean val$open) {
            this.f83955a = val$open;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            a.this.f83951b.f57561a.setVisibility(this.f83955a ? 0 : 8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            a.this.f83951b.f57561a.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
        }
    }
}
