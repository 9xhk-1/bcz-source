package com.baicizhan.main.wikiv2.lookup.wikiv2.tab;

import a00.h0;
import a00.r0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.main.wikiv2.lookup.wikiv2.helper.SentenceTagHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.text.Regex;
import l3.i0;
import l3.j2;
import l3.y2;
import m80.k;
import m80.l;
import ri.m;
import u30.k0;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nExampleSentencesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExampleSentencesFragment.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/tab/ExampleSentencesFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n1761#2,3:223\n360#2,7:226\n360#2,7:233\n774#2:240\n865#2,2:241\n1563#2:243\n1634#2,3:244\n1869#2:247\n774#2:248\n865#2,2:249\n1870#2:251\n*S KotlinDebug\n*F\n+ 1 ExampleSentencesFragment.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/tab/ExampleSentencesFragment\n*L\n128#1:223,3\n135#1:226,7\n161#1:233,7\n202#1:240\n202#1:241,2\n203#1:243\n203#1:244,3\n66#1:247\n68#1:248\n68#1:249,2\n66#1:251\n*E\n"})
/* loaded from: classes3.dex */
public final class c extends com.baicizhan.main.wikiv2.lookup.wikiv2.tab.a {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f25758h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f25759i = 8;

    /* renamed from: f, reason: collision with root package name */
    @l
    public m f25760f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public RecyclerView f25761g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final c a() {
            return new c();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f25762a;

        public b(x00.l function) {
            g0.p(function, "function");
            this.f25762a = function;
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
            return this.f25762a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25762a.invoke(obj);
        }
    }

    private final void K() {
        x().J().observe(getViewLifecycleOwner(), new b(new x00.l() { // from class: ui.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 L;
                L = com.baicizhan.main.wikiv2.lookup.wikiv2.tab.c.L(com.baicizhan.main.wikiv2.lookup.wikiv2.tab.c.this, (y2) obj);
                return L;
            }
        }));
    }

    public static final g2 L(c cVar, y2 y2Var) {
        if (y2Var == null) {
            cVar.B("例句");
            return g2.f100423a;
        }
        ArrayList arrayList = new ArrayList();
        List<i0.w> arrayList2 = new ArrayList<>();
        for (j2 j2Var : y2Var.Y()) {
            if (!j2Var.s().isEmpty()) {
                List<i0.w> c02 = y2Var.c0();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : c02) {
                    i0.w wVar = (i0.w) obj;
                    if (j2Var.s().contains(Long.valueOf(wVar.R())) && !SentenceTagHelper.f25653a.d(wVar.j0())) {
                        arrayList3.add(obj);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    List<i0.w> H = cVar.H(cVar.G(arrayList3), arrayList2);
                    List<i0.w> list = H;
                    if (!list.isEmpty()) {
                        arrayList2.addAll(list);
                        long k11 = j2Var.k();
                        String q11 = j2Var.q();
                        String m11 = j2Var.m();
                        String o11 = j2Var.o();
                        if (o11 == null) {
                            o11 = "";
                        }
                        arrayList.add(new si.a(new i0.n(k11, q11, m11, o11, j2Var.s(), h0.J(), h0.J(), h0.J()), H));
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            cVar.B("例句");
        } else {
            cVar.y();
            if (cVar.f25760f == null) {
                LifecycleOwner viewLifecycleOwner = cVar.getViewLifecycleOwner();
                g0.o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                cVar.f25760f = new m(viewLifecycleOwner, cVar.x());
            }
            m mVar = cVar.f25760f;
            if (mVar != null) {
                mVar.k(arrayList);
            }
            RecyclerView recyclerView = cVar.f25761g;
            if (recyclerView != null) {
                recyclerView.setAdapter(cVar.f25760f);
            }
        }
        return g2.f100423a;
    }

    public final List<i0.w> G(List<i0.w> list) {
        if (list.size() <= 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (i0.w wVar : list) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (J(((i0.w) it.next()).h0(), wVar.h0())) {
                        Iterator it2 = arrayList.iterator();
                        int i11 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i11 = -1;
                                break;
                            }
                            if (J(((i0.w) it2.next()).h0(), wVar.h0())) {
                                break;
                            }
                            i11++;
                        }
                        if (i11 != -1 && M((i0.w) arrayList.get(i11), wVar)) {
                            arrayList.set(i11, wVar);
                        }
                    }
                }
            }
            arrayList.add(wVar);
        }
        return arrayList;
    }

    public final List<i0.w> H(List<i0.w> list, List<i0.w> list2) {
        ArrayList arrayList = new ArrayList();
        for (i0.w wVar : list) {
            Iterator<i0.w> it = list2.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (J(it.next().h0(), wVar.h0())) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                arrayList.add(wVar);
            } else if (M(list2.get(i11), wVar)) {
                list2.set(i11, wVar);
            }
        }
        return arrayList;
    }

    public final List<String> I(String str) {
        List<String> split = new Regex("\\s+").split(new Regex("[,.!?;:\"'()\\[\\]{}]").replace(k0.b6(str).toString(), ""), 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(a00.i0.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            g0.o(lowerCase, "toLowerCase(...)");
            arrayList2.add(lowerCase);
        }
        return arrayList2;
    }

    public final boolean J(String str, String str2) {
        List<String> I = I(str);
        List<String> I2 = I(str2);
        if (I.size() >= 3 && I2.size() >= 3) {
            return g0.g(r0.O5(I, 3), r0.O5(I2, 3)) || g0.g(r0.P5(I, 3), r0.P5(I2, 3));
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        g0.o(lowerCase, "toLowerCase(...)");
        String lowerCase2 = str2.toLowerCase(locale);
        g0.o(lowerCase2, "toLowerCase(...)");
        return g0.g(lowerCase, lowerCase2);
    }

    public final boolean M(i0.w wVar, i0.w wVar2) {
        return (wVar2.T().length() > 0) && !(wVar.T().length() > 0);
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public View onCreateView(@k LayoutInflater inflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        g0.p(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        RecyclerView recyclerView = new RecyclerView(requireContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.f25761g = recyclerView;
        frameLayout.addView(recyclerView);
        return frameLayout;
    }

    @Override // com.baicizhan.main.wikiv2.lookup.wikiv2.tab.a, androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle bundle) {
        g0.p(view, "view");
        super.onViewCreated(view, bundle);
        K();
    }
}
