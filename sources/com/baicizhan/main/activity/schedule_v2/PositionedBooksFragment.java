package com.baicizhan.main.activity.schedule_v2;

import a00.h0;
import a00.i0;
import a00.r0;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import com.baicizhan.client.business.dataset.models.BookCategory;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.managers.booklist.BookListManager;
import com.baicizhan.main.activity.schedule_v2.PositionedBooksFragment;
import com.baicizhan.main.activity.schedule_v2.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import oe.j0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nPositionedBooksFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PositionedBooksFragment.kt\ncom/baicizhan/main/activity/schedule_v2/PositionedBooksFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n360#2,7:118\n1878#2,2:125\n1563#2:127\n1634#2,3:128\n1563#2:131\n1634#2,3:132\n1869#2,2:135\n1880#2:137\n2783#2,7:138\n*S KotlinDebug\n*F\n+ 1 PositionedBooksFragment.kt\ncom/baicizhan/main/activity/schedule_v2/PositionedBooksFragment\n*L\n30#1:118,7\n84#1:125,2\n85#1:127\n85#1:128,3\n88#1:131\n88#1:132,3\n90#1:135,2\n84#1:137\n95#1:138,7\n*E\n"})
/* loaded from: classes4.dex */
public final class PositionedBooksFragment extends com.baicizhan.main.activity.schedule_v2.b {

    /* renamed from: t, reason: collision with root package name */
    public static final int f18953t = 8;

    /* renamed from: r, reason: collision with root package name */
    public int f18954r = -1;

    /* renamed from: s, reason: collision with root package name */
    @l
    public b f18955s;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends LinearSmoothScroller {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@k PositionedBooksFragment fragment) {
            super(fragment.requireContext());
            g0.p(fragment, "fragment");
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            return -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void d0(@k String str);
    }

    public static final g2 d0(PositionedBooksFragment positionedBooksFragment, List list) {
        int size = list.size();
        int i11 = positionedBooksFragment.f18954r;
        if (i11 < 0 || i11 >= size) {
            g0.m(list);
            qe.a aVar = (qe.a) r0.b3(list, 0);
            if (aVar != null) {
                positionedBooksFragment.U(aVar.e(), aVar.f());
            }
        } else {
            positionedBooksFragment.U(((qe.a) list.get(i11)).e(), ((qe.a) list.get(positionedBooksFragment.f18954r)).f());
        }
        return g2.f100423a;
    }

    @Override // com.baicizhan.main.activity.schedule_v2.b
    @k
    public List<Object> M(@k List<? extends BookCategory> categories) {
        g0.p(categories, "categories");
        ArrayList arrayList = new ArrayList();
        if (categories.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        for (Object obj : categories) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            BookCategory bookCategory = (BookCategory) obj;
            String categoryName = bookCategory.getCategoryName();
            g0.o(categoryName, "getCategoryName(...)");
            List<BookCategory.SubCategory> subCategories = bookCategory.getSubCategories();
            g0.o(subCategories, "getSubCategories(...)");
            List<BookCategory.SubCategory> list = subCategories;
            ArrayList arrayList3 = new ArrayList(i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(((BookCategory.SubCategory) it.next()).getSubName());
            }
            arrayList.add(new qe.b(categoryName, arrayList3, i11));
            List<Integer> bookIds = bookCategory.getSubCategories().get(B().get(i11).g()).getBookIds();
            arrayList2.add(Integer.valueOf(bookIds.size() + 1));
            g0.o(bookIds, "also(...)");
            List<Integer> list2 = bookIds;
            ArrayList<BookRecord> arrayList4 = new ArrayList(i0.d0(list2, 10));
            for (Integer num : list2) {
                BookListManager bookListManager = BookListManager.getInstance();
                g0.m(num);
                arrayList4.add(bookListManager.getBookById(num.intValue()));
            }
            for (BookRecord bookRecord : arrayList4) {
                int i13 = bookRecord.bookId;
                String bookName = bookRecord.bookName;
                g0.o(bookName, "bookName");
                String str = bookRecord.desc;
                String descImage = bookRecord.descImage;
                g0.o(descImage, "descImage");
                arrayList.add(new qe.c(i13, bookName, str, descImage, bookRecord.wordCount, bookRecord.bookFlag, bookRecord.isSelected()));
            }
            i11 = i12;
        }
        H().clear();
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            int intValue = ((Number) it2.next()).intValue();
            int intValue2 = ((Number) next).intValue();
            H().add(Integer.valueOf(intValue2));
            next = Integer.valueOf(intValue2 + intValue);
        }
        H().add(Integer.valueOf(((Number) next).intValue()));
        return arrayList;
    }

    @Override // com.baicizhan.main.activity.schedule_v2.b, com.baicizhan.main.activity.schedule_v2.c.b
    public void e(int i11) {
        b bVar;
        super.e(i11);
        B().get(D()).k(false);
        W(i11);
        j0 j0Var = B().get(i11);
        String C = C(j0Var.f());
        if (C != null && (bVar = this.f18955s) != null) {
            bVar.d0(C);
        }
        j0Var.k(true);
        e0(D());
    }

    public final void e0(int i11) {
        LinearLayoutManager linearLayoutManager;
        List<Object> E = E();
        if (E != null) {
            Iterator<Object> it = E.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                Object next = it.next();
                if ((next instanceof qe.b) && ((qe.b) next).f() == i11) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 < 0) {
                qb.c.d(d.f19251b, "scrollTo: position not found!", new Object[0]);
                return;
            }
            WeakReference<LinearLayoutManager> F = F();
            if (F == null || (linearLayoutManager = F.get()) == null) {
                return;
            }
            a aVar = new a(this);
            aVar.setTargetPosition(i12);
            linearLayoutManager.startSmoothScroll(aVar);
        }
    }

    @Override // com.baicizhan.main.activity.schedule_v2.b, pe.d.b
    public void n(int i11, int i12) {
        B().get(i12).j(i11);
        P();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.baicizhan.main.activity.schedule_v2.b, androidx.fragment.app.Fragment
    public void onAttach(@k Context context) {
        g0.p(context, "context");
        super.onAttach(context);
        Bundle arguments = getArguments();
        this.f18954r = arguments != null ? arguments.getInt(d.f19250a) : -1;
        if (context instanceof b) {
            this.f18955s = (b) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        G().y().observe(requireActivity(), new d.a(new x00.l() { // from class: oe.a1
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 d02;
                d02 = PositionedBooksFragment.d0(PositionedBooksFragment.this, (List) obj);
                return d02;
            }
        }));
    }
}
