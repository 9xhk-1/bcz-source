package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class s<S> extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet<r<S>> f31294a = new LinkedHashSet<>();

    public boolean t(r<S> rVar) {
        return this.f31294a.add(rVar);
    }

    public void v() {
        this.f31294a.clear();
    }

    public abstract DateSelector<S> w();

    public boolean x(r<S> rVar) {
        return this.f31294a.remove(rVar);
    }
}
