package com.baicizhan.main.activity.schedule_v2;

import a00.h0;
import a00.k1;
import a00.l1;
import a00.r0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.dataset.models.BookCategory;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.main.activity.schedule_v2.b;
import com.baicizhan.main.activity.schedule_v2.c;
import com.jay.widget.StickyHeadersLinearLayoutManager;
import com.jiongji.andriod.card.R;
import gs.y7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kc.d;
import kc.u;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ma.t;
import oe.i0;
import oe.j0;
import p50.h;
import pe.b;
import pe.d;
import q9.x;
import sa.q;
import va.g;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nBooksFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BooksFragment.kt\ncom/baicizhan/main/activity/schedule_v2/BooksFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,359:1\n1878#2,3:360\n1563#2:363\n1634#2,3:364\n1869#2,2:367\n1878#2,3:370\n1869#2,2:373\n1#3:369\n*S KotlinDebug\n*F\n+ 1 BooksFragment.kt\ncom/baicizhan/main/activity/schedule_v2/BooksFragment\n*L\n85#1:360,3\n92#1:363\n92#1:364,3\n104#1:367,2\n116#1:370,3\n122#1:373,2\n*E\n"})
/* loaded from: classes4.dex */
public abstract class b extends Fragment implements c.b, d.b, b.c {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final C0295b f19225n = new C0295b(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f19226o = 8;

    /* renamed from: p, reason: collision with root package name */
    public static final String f19227p = b.class.getSimpleName();

    /* renamed from: q, reason: collision with root package name */
    @k
    public static final String f19228q = "https://learn.baicizhan.com/book_selling/?bookId=";

    /* renamed from: a, reason: collision with root package name */
    @l
    public h f19229a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public com.baicizhan.main.activity.schedule_v2.c f19230b;

    /* renamed from: d, reason: collision with root package name */
    @l
    public a f19232d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public List<? extends BookCategory> f19233e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public String f19234f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public y7 f19235g;

    /* renamed from: j, reason: collision with root package name */
    public int f19238j;

    /* renamed from: l, reason: collision with root package name */
    @l
    public WeakReference<LinearLayoutManager> f19240l;

    /* renamed from: c, reason: collision with root package name */
    @k
    public ArrayList<RecyclerView.ItemDecoration> f19231c = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SparseArray<j0> f19236h = new SparseArray<>();

    /* renamed from: i, reason: collision with root package name */
    @k
    public ArrayList<Integer> f19237i = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    @k
    public final c0 f19239k = e0.c(new x00.a() { // from class: oe.g
        @Override // x00.a
        public final Object invoke() {
            i0 J;
            J = com.baicizhan.main.activity.schedule_v2.b.J(com.baicizhan.main.activity.schedule_v2.b.this);
            return J;
        }
    });

    /* renamed from: m, reason: collision with root package name */
    @k
    public final c0 f19241m = e0.c(new x00.a() { // from class: oe.h
        @Override // x00.a
        public final Object invoke() {
            b.c T;
            T = com.baicizhan.main.activity.schedule_v2.b.T(com.baicizhan.main.activity.schedule_v2.b.this);
            return T;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void l(@k qe.c cVar, @k String str);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.main.activity.schedule_v2.b$b, reason: collision with other inner class name */
    public static final class C0295b {
        public /* synthetic */ C0295b(v vVar) {
            this();
        }

        public C0295b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends RecyclerView.OnScrollListener {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final WeakReference<b> f19242a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f19243b;

        public c(@k b booksFragment) {
            g0.p(booksFragment, "booksFragment");
            this.f19242a = new WeakReference<>(booksFragment);
        }

        public final void a() {
            this.f19243b = false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@k RecyclerView recyclerView, int i11) {
            WeakReference<LinearLayoutManager> F;
            LinearLayoutManager linearLayoutManager;
            g0.p(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i11);
            b bVar = this.f19242a.get();
            if (bVar == null) {
                return;
            }
            if (i11 == 1) {
                this.f19243b = true;
                return;
            }
            if (i11 != 2) {
                if (this.f19243b && (F = bVar.F()) != null && (linearLayoutManager = F.get()) != null) {
                    int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                    int size = bVar.H().size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            i12 = 0;
                            break;
                        } else if (bVar.H().get(i12).intValue() >= findFirstCompletelyVisibleItemPosition) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    com.baicizhan.main.activity.schedule_v2.c cVar = bVar.f19230b;
                    if (cVar != null) {
                        cVar.g(i12);
                    }
                }
                this.f19243b = false;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends h implements com.jay.widget.a {
        @Override // com.jay.widget.a
        public boolean a(int i11) {
            List<?> c11 = c();
            g0.o(c11, "getItems(...)");
            return r0.b3(c11, i11) instanceof qe.b;
        }
    }

    public static final i0 J(b bVar) {
        FragmentActivity requireActivity = bVar.requireActivity();
        g0.o(requireActivity, "requireActivity(...)");
        return (i0) new ViewModelProvider(requireActivity).get(i0.class);
    }

    public static final g2 K(final b bVar, final qe.c cVar, String it) {
        g0.p(it, "it");
        e a11 = e.f19253c.a(it);
        a11.C(new x00.a() { // from class: oe.f
            @Override // x00.a
            public final Object invoke() {
                g2 L;
                L = com.baicizhan.main.activity.schedule_v2.b.L(com.baicizhan.main.activity.schedule_v2.b.this, cVar);
                return L;
            }
        });
        a11.show(bVar.getParentFragmentManager(), "special");
        ma.l.e("activity-common", ma.a.f72879y5, k1.k(h1.a("book_id", Integer.valueOf(cVar.m()))));
        return g2.f100423a;
    }

    public static final g2 L(b bVar, qe.c cVar) {
        bVar.N(cVar);
        return g2.f100423a;
    }

    private final void O() {
        b0();
        P();
    }

    public static final g2 R(b bVar, qe.c cVar, View it) {
        g0.p(it, "it");
        i0 G = bVar.G();
        String str = bVar.f19234f;
        if (str == null) {
            str = "";
        }
        G.c0(cVar, str);
        ma.l.e(t.f73017p, ma.a.B1, l1.W(h1.a(ma.b.f72933p, gi.i0.a(bVar.G().B())), h1.a("click_type", 1), h1.a(ma.b.Y, 0), h1.a(ma.b.S1, Integer.valueOf(cVar.m()))));
        return g2.f100423a;
    }

    public static final g2 S(b bVar, qe.c cVar, View it) {
        g0.p(it, "it");
        ma.l.e(t.f73017p, ma.a.B1, l1.W(h1.a(ma.b.f72933p, gi.i0.a(bVar.G().B())), h1.a("click_type", 0), h1.a(ma.b.Y, 0), h1.a(ma.b.S1, Integer.valueOf(cVar.m()))));
        return g2.f100423a;
    }

    public static final c T(b bVar) {
        return new c(bVar);
    }

    public static /* synthetic */ void V(b bVar, List list, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBookCategories");
        }
        if ((i11 & 2) != 0) {
            str = "";
        }
        bVar.U(list, str);
    }

    @k
    public final SparseArray<j0> B() {
        return this.f19236h;
    }

    @l
    public final String C(@k String categoryId) {
        Object obj;
        g0.p(categoryId, "categoryId");
        List<? extends BookCategory> list = this.f19233e;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (g0.g(((BookCategory) obj).getCategoryId(), categoryId)) {
                    break;
                }
            }
            BookCategory bookCategory = (BookCategory) obj;
            if (bookCategory != null) {
                return bookCategory.getCategoryTagName();
            }
        }
        return null;
    }

    public final int D() {
        return this.f19238j;
    }

    @l
    public final List<Object> E() {
        h hVar = this.f19229a;
        List<?> c11 = hVar != null ? hVar.c() : null;
        if (c11 instanceof List) {
            return c11;
        }
        return null;
    }

    @l
    public final WeakReference<LinearLayoutManager> F() {
        return this.f19240l;
    }

    @k
    public final i0 G() {
        return (i0) this.f19239k.getValue();
    }

    @k
    public final ArrayList<Integer> H() {
        return this.f19237i;
    }

    public final c I() {
        return (c) this.f19241m.getValue();
    }

    @k
    public abstract List<Object> M(@k List<? extends BookCategory> list);

    public final void N(qe.c cVar) {
        g2 g2Var;
        UserRecord p11 = x.r().p();
        if (p11 != null) {
            if (p11.getIsNewUser()) {
                Q(cVar);
                g2Var = g2.f100423a;
            } else {
                a aVar = this.f19232d;
                if (aVar != null) {
                    String str = this.f19234f;
                    if (str == null) {
                        str = "";
                    }
                    aVar.l(cVar, str);
                    g2Var = g2.f100423a;
                } else {
                    g2Var = null;
                }
            }
            if (g2Var != null) {
                return;
            }
        }
        qb.c.d(f19227p, "user null", new Object[0]);
    }

    public final void P() {
        h hVar = this.f19229a;
        if (hVar != null) {
            List<? extends BookCategory> list = this.f19233e;
            if (list == null) {
                return;
            }
            List<?> M = M(list);
            Z(M);
            hVar.m(M);
        }
        h hVar2 = this.f19229a;
        if (hVar2 != null) {
            hVar2.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [kc.d, kc.h] */
    public final void Q(final qe.c cVar) {
        mc.a.o(this, ((u.a) d.a.s(d.a.J(mc.a.e(this).M(getString(R.string.books_dialog_message_new_book, cVar.n())), null, null, new x00.l() { // from class: oe.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 R;
                R = com.baicizhan.main.activity.schedule_v2.b.R(com.baicizhan.main.activity.schedule_v2.b.this, cVar, (View) obj);
                return R;
            }
        }, 3, null), null, new x00.l() { // from class: oe.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 S;
                S = com.baicizhan.main.activity.schedule_v2.b.S(com.baicizhan.main.activity.schedule_v2.b.this, cVar, (View) obj);
                return S;
            }
        }, 1, null)).d(), null, 2, null);
    }

    public final void U(@k List<? extends BookCategory> bookCategories, @k String topAllName) {
        g0.p(bookCategories, "bookCategories");
        g0.p(topAllName, "topAllName");
        this.f19233e = bookCategories;
        this.f19234f = topAllName;
        a0();
        b0();
        h hVar = this.f19229a;
        if (hVar != null) {
            List<?> M = M(bookCategories);
            Z(M);
            hVar.m(M);
        }
        h hVar2 = this.f19229a;
        if (hVar2 != null) {
            hVar2.notifyDataSetChanged();
        }
    }

    public final void W(int i11) {
        this.f19238j = i11;
    }

    public final void X(@l WeakReference<LinearLayoutManager> weakReference) {
        this.f19240l = weakReference;
    }

    public final void Y(@k ArrayList<Integer> arrayList) {
        g0.p(arrayList, "<set-?>");
        this.f19237i = arrayList;
    }

    public final void Z(List<? extends Object> list) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        for (RecyclerView.ItemDecoration itemDecoration : this.f19231c) {
            y7 y7Var = this.f19235g;
            if (y7Var != null && (recyclerView3 = y7Var.f57558a) != null) {
                recyclerView3.removeItemDecoration(itemDecoration);
            }
        }
        this.f19231c.clear();
        y7 y7Var2 = this.f19235g;
        if (y7Var2 != null && (recyclerView2 = y7Var2.f57558a) != null) {
            Context requireContext = requireContext();
            g0.o(requireContext, "requireContext(...)");
            xl.c cVar = new xl.c(requireContext, 1, list.size() - 1, 0, false, 24, null);
            Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.divider_transparent_32dp, null);
            if (drawable != null) {
                cVar.setDrawable(drawable);
            }
            this.f19231c.add(cVar);
            recyclerView2.addItemDecoration(cVar);
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            if (i11 > 0 && (obj instanceof qe.b)) {
                arrayList.add(Integer.valueOf(i11));
            }
            i11 = i12;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            y7 y7Var3 = this.f19235g;
            if (y7Var3 != null && (recyclerView = y7Var3.f57558a) != null) {
                Context requireContext2 = requireContext();
                g0.o(requireContext2, "requireContext(...)");
                xl.c cVar2 = new xl.c(requireContext2, 1, intValue - 1, intValue, false, 16, null);
                Drawable drawable2 = ResourcesCompat.getDrawable(getResources(), R.drawable.divider_transparent_16dp, null);
                if (drawable2 != null) {
                    cVar2.setDrawable(drawable2);
                }
                this.f19231c.add(cVar2);
                recyclerView.addItemDecoration(cVar2);
            }
        }
    }

    public final void a0() {
        List<? extends BookCategory> list = this.f19233e;
        if (list != null) {
            this.f19236h.clear();
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    h0.b0();
                }
                SparseArray<j0> sparseArray = this.f19236h;
                String categoryId = ((BookCategory) obj).getCategoryId();
                g0.o(categoryId, "getCategoryId(...)");
                sparseArray.put(i11, new j0(categoryId, i11 == this.f19238j, 0));
                i11 = i12;
            }
        }
    }

    public final void b0() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        List<? extends BookCategory> list = this.f19233e;
        if (list != null) {
            List<? extends BookCategory> list2 = list;
            ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
            for (BookCategory bookCategory : list2) {
                String categoryId = bookCategory.getCategoryId();
                g0.o(categoryId, "getCategoryId(...)");
                String categoryTagName = bookCategory.getCategoryTagName();
                g0.o(categoryTagName, "getCategoryTagName(...)");
                arrayList.add(new oe.k1(categoryId, categoryTagName));
            }
            if (arrayList.size() <= 1) {
                y7 y7Var = this.f19235g;
                if (y7Var == null || (recyclerView = y7Var.f57560c) == null) {
                    return;
                }
                q.z(recyclerView, false);
                return;
            }
            y7 y7Var2 = this.f19235g;
            if (y7Var2 != null && (recyclerView2 = y7Var2.f57560c) != null) {
                q.z(recyclerView2, true);
            }
            com.baicizhan.main.activity.schedule_v2.c cVar = this.f19230b;
            if (cVar != null) {
                cVar.h(arrayList);
            }
            com.baicizhan.main.activity.schedule_v2.c cVar2 = this.f19230b;
            if (cVar2 != null) {
                cVar2.g(0);
            }
        }
    }

    public void e(int i11) {
        RecyclerView recyclerView;
        I().a();
        y7 y7Var = this.f19235g;
        if (y7Var == null || (recyclerView = y7Var.f57558a) == null) {
            return;
        }
        recyclerView.stopScroll();
    }

    @Override // pe.b.c
    public void k(@k final qe.c book) {
        g0.p(book, "book");
        ma.l.e(t.f73017p, ma.a.A1, l1.W(h1.a(ma.b.f72933p, gi.i0.a(G().B())), h1.a(ma.b.Y, 0)));
        if (book.j()) {
            g.g(R.string.books_toast_book_already_added, 0);
            return;
        }
        if ((book.o() & 2) != 0) {
            G().Y(book.m(), new x00.l() { // from class: oe.i
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 K;
                    K = com.baicizhan.main.activity.schedule_v2.b.K(com.baicizhan.main.activity.schedule_v2.b.this, book, (String) obj);
                    return K;
                }
            });
            return;
        }
        if ((book.o() & 4) == 0) {
            N(book);
            return;
        }
        if (G().z().contains(Integer.valueOf(book.m()))) {
            N(book);
            return;
        }
        BczWebExecutorKt.startWebForResult$default(requireActivity(), f19228q + book.m(), 0, false, 0, 24, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(@k Context context) {
        g0.p(context, "context");
        super.onAttach(context);
        if (context instanceof a) {
            this.f19232d = (a) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@k LayoutInflater inflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        g0.p(inflater, "inflater");
        y7 d11 = y7.d(inflater);
        this.f19235g = d11;
        g0.m(d11);
        return d11.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        super.onDestroyView();
        y7 y7Var = this.f19235g;
        if (y7Var != null && (recyclerView2 = y7Var.f57558a) != null) {
            recyclerView2.setAdapter(null);
        }
        y7 y7Var2 = this.f19235g;
        if (y7Var2 == null || (recyclerView = y7Var2.f57560c) == null) {
            return;
        }
        recyclerView.setAdapter(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle bundle) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        g0.p(view, "view");
        super.onViewCreated(view, bundle);
        y7 y7Var = this.f19235g;
        if (y7Var != null && (recyclerView2 = y7Var.f57560c) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 0, false));
            com.baicizhan.main.activity.schedule_v2.c cVar = new com.baicizhan.main.activity.schedule_v2.c(this);
            this.f19230b = cVar;
            recyclerView2.setAdapter(cVar);
            recyclerView2.setItemAnimator(null);
            Context requireContext = requireContext();
            g0.o(requireContext, "requireContext(...)");
            xl.b bVar = new xl.b(requireContext, 0);
            Drawable drawable = ResourcesCompat.getDrawable(recyclerView2.getResources(), R.drawable.divider_transparent_12dp, null);
            if (drawable != null) {
                bVar.setDrawable(drawable);
            }
            recyclerView2.addItemDecoration(bVar);
        }
        y7 y7Var2 = this.f19235g;
        if (y7Var2 != null && (recyclerView = y7Var2.f57558a) != null) {
            d dVar = new d();
            dVar.i(qe.b.class, new pe.d(this, this));
            dVar.i(qe.c.class, new pe.b(this, this));
            this.f19229a = dVar;
            recyclerView.setAdapter(dVar);
            StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = new StickyHeadersLinearLayoutManager(recyclerView.getContext());
            this.f19240l = new WeakReference<>(stickyHeadersLinearLayoutManager);
            recyclerView.setLayoutManager(stickyHeadersLinearLayoutManager);
            recyclerView.addOnScrollListener(I());
        }
        O();
    }

    public void n(int i11, int i12) {
    }
}
