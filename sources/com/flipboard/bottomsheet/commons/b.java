package com.flipboard.bottomsheet.commons;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.CheckResult;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.fragment.app.AccessFragmentInternals;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.flipboard.bottomsheet.BottomSheetLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b implements ql.b {

    /* renamed from: j, reason: collision with root package name */
    public static final String f29577j = "bottomsheet:savedBottomSheet";

    /* renamed from: k, reason: collision with root package name */
    public static final String f29578k = "bottomsheet:backStackId";

    /* renamed from: l, reason: collision with root package name */
    public static final String f29579l = "bottomsheet:bottomSheetLayoutId";

    /* renamed from: b, reason: collision with root package name */
    public BottomSheetLayout f29581b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f29582c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29583d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29584e;

    /* renamed from: h, reason: collision with root package name */
    public c f29587h;

    /* renamed from: i, reason: collision with root package name */
    public Fragment f29588i;

    /* renamed from: a, reason: collision with root package name */
    @IdRes
    public int f29580a = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29585f = true;

    /* renamed from: g, reason: collision with root package name */
    public int f29586g = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public b(c sheetFragmentInterface) {
        if (!(sheetFragmentInterface instanceof Fragment)) {
            throw new IllegalArgumentException("sheetFragmentInterface must be an instance of a Fragment too!");
        }
        this.f29587h = sheetFragmentInterface;
        this.f29588i = (Fragment) sheetFragmentInterface;
    }

    public static b b(c sheetFragmentInterface) {
        return new b(sheetFragmentInterface);
    }

    @Override // ql.b
    @CallSuper
    public void a(BottomSheetLayout bottomSheetLayout) {
        if (this.f29584e) {
            return;
        }
        e(true);
    }

    public void c() {
        e(false);
    }

    public void d() {
        e(true);
    }

    public final void e(boolean allowStateLoss) {
        if (this.f29582c) {
            return;
        }
        this.f29582c = true;
        this.f29583d = false;
        BottomSheetLayout bottomSheetLayout = this.f29581b;
        if (bottomSheetLayout != null) {
            bottomSheetLayout.u();
            this.f29581b = null;
        }
        this.f29584e = true;
        if (this.f29586g >= 0) {
            this.f29588i.getFragmentManager().popBackStack(this.f29586g, 1);
            this.f29586g = -1;
            return;
        }
        FragmentTransaction beginTransaction = this.f29588i.getFragmentManager().beginTransaction();
        beginTransaction.remove(this.f29588i);
        if (allowStateLoss) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    @Nullable
    public final BottomSheetLayout f() {
        Fragment parentFragment = this.f29588i.getParentFragment();
        if (parentFragment != null) {
            View view = parentFragment.getView();
            if (view != null) {
                return (BottomSheetLayout) view.findViewById(this.f29580a);
            }
            return null;
        }
        FragmentActivity activity = this.f29588i.getActivity();
        if (activity != null) {
            return (BottomSheetLayout) activity.findViewById(this.f29580a);
        }
        return null;
    }

    public BottomSheetLayout g() {
        if (this.f29581b == null) {
            this.f29581b = f();
        }
        return this.f29581b;
    }

    @CheckResult
    public LayoutInflater h(Bundle savedInstanceState, LayoutInflater superInflater) {
        if (!this.f29585f) {
            return superInflater;
        }
        BottomSheetLayout g11 = g();
        this.f29581b = g11;
        return g11 != null ? LayoutInflater.from(g11.getContext()) : LayoutInflater.from(this.f29588i.getActivity());
    }

    public void i(@Nullable Bundle savedInstanceState) {
        View view;
        if (this.f29585f && (view = this.f29588i.getView()) != null && view.getParent() != null) {
            throw new IllegalStateException("BottomSheetFragment can not be attached to a container view");
        }
    }

    public void j(Context context) {
        if (this.f29583d) {
            return;
        }
        this.f29582c = false;
    }

    public void k(@Nullable Bundle savedInstanceState) {
        boolean z11 = AccessFragmentInternals.getContainerId(this.f29588i) == 0;
        this.f29585f = z11;
        if (savedInstanceState != null) {
            this.f29585f = savedInstanceState.getBoolean(f29577j, z11);
            this.f29586g = savedInstanceState.getInt(f29578k, -1);
            this.f29580a = savedInstanceState.getInt(f29579l, -1);
        }
    }

    public void l() {
        BottomSheetLayout bottomSheetLayout = this.f29581b;
        if (bottomSheetLayout != null) {
            this.f29584e = true;
            bottomSheetLayout.u();
            this.f29581b = null;
        }
    }

    public void m() {
        if (this.f29583d || this.f29582c) {
            return;
        }
        this.f29582c = true;
    }

    public void n(Bundle outState) {
        if (!this.f29585f) {
            outState.putBoolean(f29577j, false);
        }
        int i11 = this.f29586g;
        if (i11 != -1) {
            outState.putInt(f29578k, i11);
        }
        int i12 = this.f29580a;
        if (i12 != -1) {
            outState.putInt(f29579l, i12);
        }
    }

    public void o() {
        BottomSheetLayout bottomSheetLayout = this.f29581b;
        if (bottomSheetLayout != null) {
            this.f29584e = false;
            bottomSheetLayout.M(this.f29588i.getView(), this.f29587h.p());
            this.f29581b.o(this);
        }
    }

    public int p(FragmentTransaction transaction, @IdRes int bottomSheetLayoutId) {
        this.f29582c = false;
        this.f29583d = true;
        this.f29580a = bottomSheetLayoutId;
        transaction.add(this.f29588i, String.valueOf(bottomSheetLayoutId));
        this.f29584e = false;
        int commit = transaction.commit();
        this.f29586g = commit;
        return commit;
    }

    public void q(FragmentManager manager, @IdRes int bottomSheetLayoutId) {
        this.f29582c = false;
        this.f29583d = true;
        this.f29580a = bottomSheetLayoutId;
        manager.beginTransaction().add(this.f29588i, String.valueOf(bottomSheetLayoutId)).commit();
    }
}
