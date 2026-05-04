package com.baicizhan.base;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public class c extends Fragment {

    /* renamed from: c, reason: collision with root package name */
    public static final int f15909c = 8;

    /* renamed from: a, reason: collision with root package name */
    public boolean f15910a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Handler f15911b = new Handler();

    public static final void x(c cVar) {
        cVar.v();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle bundle) {
        g0.p(view, "view");
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        g0.o(requireContext, "requireContext(...)");
        if (a.a(requireContext)) {
            this.f15911b.post(new Runnable() { // from class: com.baicizhan.base.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.x(c.this);
                }
            });
        }
    }

    public void v() {
        if (this.f15910a) {
            return;
        }
        Context requireContext = requireContext();
        g0.o(requireContext, "requireContext(...)");
        if (!a.a(requireContext) || getView() == null) {
            return;
        }
        View view = getView();
        if (view instanceof ViewGroup) {
            Context requireContext2 = requireContext();
            g0.o(requireContext2, "requireContext(...)");
            d.d((ViewGroup) view, requireContext2);
        }
        this.f15910a = true;
    }

    public void w() {
    }
}
