package com.baicizhan.main.wikiv2.lookup.wikiv2.tab;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.baicizhan.main.wikiv2.lookup.wikiv2.helper.SentenceTagHelper;
import com.baicizhan.main.wikiv2.lookup.wikiv2.view.ExamSentenceView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l3.i0;
import l3.y2;
import m80.k;
import m80.l;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nRealExamSentencesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealExamSentencesFragment.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/tab/RealExamSentencesFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,76:1\n774#2:77\n865#2,2:78\n1491#2:80\n1516#2,3:81\n1519#2,3:91\n382#3,7:84\n*S KotlinDebug\n*F\n+ 1 RealExamSentencesFragment.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/tab/RealExamSentencesFragment\n*L\n44#1:77\n44#1:78,2\n53#1:80\n53#1:81,3\n53#1:91,3\n53#1:84,7\n*E\n"})
/* loaded from: classes3.dex */
public final class f extends com.baicizhan.main.wikiv2.lookup.wikiv2.tab.a {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f25772g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f25773h = 8;

    /* renamed from: f, reason: collision with root package name */
    @l
    public ExamSentenceView f25774f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final f a() {
            return new f();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f25775a;

        public b(x00.l function) {
            g0.p(function, "function");
            this.f25775a = function;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof b0)) {
                return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @k
        public final w<?> getFunctionDelegate() {
            return this.f25775a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25775a.invoke(obj);
        }
    }

    private final void G() {
        x().J().observe(getViewLifecycleOwner(), new b(new x00.l() { // from class: ui.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 H;
                H = com.baicizhan.main.wikiv2.lookup.wikiv2.tab.f.H(com.baicizhan.main.wikiv2.lookup.wikiv2.tab.f.this, (y2) obj);
                return H;
            }
        }));
    }

    public static final g2 H(f fVar, y2 y2Var) {
        if (y2Var == null) {
            fVar.B("真题例句");
            return g2.f100423a;
        }
        List<i0.w> c02 = y2Var.c0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : c02) {
            if (SentenceTagHelper.f25653a.d(((i0.w) obj).j0())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            fVar.B("真题例句");
        } else {
            fVar.y();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : arrayList) {
                String b11 = SentenceTagHelper.f25653a.b(((i0.w) obj2).j0());
                if (b11 == null) {
                    b11 = "其他";
                }
                Object obj3 = linkedHashMap.get(b11);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap.put(b11, obj3);
                }
                ((List) obj3).add(obj2);
            }
            Context requireContext = fVar.requireContext();
            g0.o(requireContext, "requireContext(...)");
            ExamSentenceView examSentenceView = new ExamSentenceView(requireContext, null, 0, 6, null);
            LifecycleOwner viewLifecycleOwner = fVar.getViewLifecycleOwner();
            g0.o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            examSentenceView.setLifecycleOwner(viewLifecycleOwner);
            examSentenceView.setViewModel(fVar.x());
            examSentenceView.setSentencesByExamType(linkedHashMap);
            fVar.f25774f = examSentenceView;
            View view = fVar.getView();
            FrameLayout frameLayout = view instanceof FrameLayout ? (FrameLayout) view : null;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            View view2 = fVar.getView();
            FrameLayout frameLayout2 = view2 instanceof FrameLayout ? (FrameLayout) view2 : null;
            if (frameLayout2 != null) {
                frameLayout2.addView(fVar.f25774f);
            }
        }
        return g2.f100423a;
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public View onCreateView(@k LayoutInflater inflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        g0.p(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // com.baicizhan.main.wikiv2.lookup.wikiv2.tab.a, androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle bundle) {
        g0.p(view, "view");
        super.onViewCreated(view, bundle);
        G();
    }
}
