package td;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
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
import com.baicizhan.main.activity.daka.imagedaka.photo.PickupPhotoDialogActivity;
import gs.a9;
import sa.q;
import xb.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends Fragment implements pd.c {

    /* renamed from: d, reason: collision with root package name */
    public static final int f90433d = 111;

    /* renamed from: a, reason: collision with root package name */
    public a9 f90434a;

    /* renamed from: b, reason: collision with root package name */
    public td.b f90435b;

    /* renamed from: c, reason: collision with root package name */
    public MutableLiveData<Boolean> f90436c = new MutableLiveData<>(Boolean.FALSE);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: td.a$a, reason: collision with other inner class name */
    public class C1199a implements Observer<Boolean> {
        public C1199a() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Boolean aBoolean) {
            if (aBoolean != null) {
                a.this.z(aBoolean.booleanValue());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Observer<Void> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            PickupPhotoDialogActivity.d1(a.this, 111);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Observer<String> {
        public c() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable String s11) {
            va.g.i(s11, 1);
        }
    }

    private void A() {
        this.f90435b = (td.b) new ViewModelProvider(this).get(td.b.class);
    }

    public static a w() {
        return new a();
    }

    private void x() {
        this.f90434a.j(this.f90435b);
        this.f90435b.start();
        this.f90435b.g().observe(this, new C1199a());
        this.f90435b.d().observe(this, new b());
        this.f90435b.h().observe(this, new c());
        q.g(this.f90434a.f54157b, i.a(requireContext(), 16.0f));
    }

    private void y(LayoutInflater layoutInflater) {
        a9 e11 = a9.e(layoutInflater);
        this.f90434a = e11;
        e11.f54156a.setTranslationY(-xb.f.a(getContext(), 2.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(final boolean open) {
        this.f90434a.f54156a.animate().setDuration(200L).alpha(open ? 1.0f : 0.0f).translationYBy(xb.f.a(getContext(), 2.0f) * (open ? -1 : 1)).setListener(new d(open)).start();
    }

    @Override // pd.c
    public pd.d f() {
        return this.f90435b.f();
    }

    @Override // pd.c
    public ObservableInt g() {
        return this.f90435b.f90446c;
    }

    @Override // pd.c
    public LiveData<Boolean> l() {
        return this.f90436c;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 111 && resultCode == -1 && !TextUtils.isEmpty(data.getStringExtra(PickupPhotoDialogActivity.f18421i))) {
            this.f90435b.j(data.getStringExtra(PickupPhotoDialogActivity.f18421i));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        A();
        y(inflater);
        x();
        this.f90436c.setValue(Boolean.TRUE);
        return this.f90434a.getRoot();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f90440a;

        public d(final boolean val$open) {
            this.f90440a = val$open;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            a.this.f90434a.f54156a.setVisibility(this.f90440a ? 0 : 8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            a.this.f90434a.f54156a.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
        }
    }
}
