package com.baicizhan.main.wikiv2.lookup.wikiv2.tab;

import a00.h0;
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
import com.baicizhan.client.business.util.KotlinExtKt;
import java.util.ArrayList;
import java.util.Iterator;
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
import ri.i;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nPhrasesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhrasesFragment.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/tab/PhrasesFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,102:1\n1491#2:103\n1516#2,3:104\n1519#2,3:114\n1869#2,2:117\n382#3,7:107\n*S KotlinDebug\n*F\n+ 1 PhrasesFragment.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/tab/PhrasesFragment\n*L\n67#1:103\n67#1:104,3\n67#1:114,3\n70#1:117,2\n67#1:107,7\n*E\n"})
/* loaded from: classes3.dex */
public final class e extends com.baicizhan.main.wikiv2.lookup.wikiv2.tab.a {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f25767h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f25768i = 8;

    /* renamed from: f, reason: collision with root package name */
    @l
    public i f25769f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public RecyclerView f25770g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final e a() {
            return new e();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f25771a;

        public b(x00.l function) {
            g0.p(function, "function");
            this.f25771a = function;
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
            return this.f25771a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25771a.invoke(obj);
        }
    }

    private final void G() {
        x().J().observe(getViewLifecycleOwner(), new b(new x00.l() { // from class: ui.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 H;
                H = com.baicizhan.main.wikiv2.lookup.wikiv2.tab.e.H(com.baicizhan.main.wikiv2.lookup.wikiv2.tab.e.this, (y2) obj);
                return H;
            }
        }));
    }

    public static final g2 H(e eVar, y2 y2Var) {
        if (y2Var == null) {
            eVar.B("词组");
            return g2.f100423a;
        }
        List<i0.r> a02 = y2Var.a0();
        if (a02.isEmpty()) {
            eVar.B("词组");
            return g2.f100423a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : a02) {
            Integer valueOf = Integer.valueOf(((i0.r) obj).m());
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = h0.Q(1, 2).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            List list = (List) linkedHashMap.get(Integer.valueOf(intValue));
            if (list != null && !list.isEmpty()) {
                arrayList.add(new i.b(intValue, i.f84124d.a(intValue), list));
            }
        }
        if (arrayList.isEmpty()) {
            eVar.B("词组");
        } else {
            eVar.y();
            if (eVar.f25769f == null) {
                LifecycleOwner viewLifecycleOwner = eVar.getViewLifecycleOwner();
                g0.o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                eVar.f25769f = new i(viewLifecycleOwner, eVar.x());
            }
            i iVar = eVar.f25769f;
            if (iVar != null) {
                iVar.g(arrayList);
            }
            RecyclerView recyclerView = eVar.f25770g;
            if (recyclerView != null) {
                recyclerView.setAdapter(eVar.f25769f);
            }
        }
        return g2.f100423a;
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
        recyclerView.setPadding(0, 0, 0, KotlinExtKt.getDpPixels(16));
        recyclerView.setClipToPadding(false);
        this.f25770g = recyclerView;
        frameLayout.addView(recyclerView);
        return frameLayout;
    }

    @Override // com.baicizhan.main.wikiv2.lookup.wikiv2.tab.a, androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle bundle) {
        g0.p(view, "view");
        super.onViewCreated(view, bundle);
        G();
    }
}
