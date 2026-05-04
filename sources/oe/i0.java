package oe;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.dataset.models.AllTopCategoryInfo;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.dataset.models.UserIdentityLevelInfo;
import com.baicizhan.client.business.managers.booklist.BookListManager;
import com.baicizhan.main.activity.idenity.UserIdentity;
import com.baicizhan.online.user_study_api.UserSelectedBookInfo;
import java.util.ArrayList;
import java.util.List;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nBooksModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BooksModel.kt\ncom/baicizhan/main/activity/schedule_v2/BooksModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n1#2:134\n1563#3:135\n1634#3,3:136\n*S KotlinDebug\n*F\n+ 1 BooksModel.kt\ncom/baicizhan/main/activity/schedule_v2/BooksModel\n*L\n94#1:135\n94#1:136,3\n*E\n"})
/* loaded from: classes4.dex */
public final class i0 extends AndroidViewModel {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final a f76872h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f76873i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final String f76874j = i0.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public qb0.h f76875a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public qb0.h f76876b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<List<qe.a>> f76877c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<UserSelectedBookInfo> f76878d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f76879e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public UserIdentity f76880f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final List<Integer> f76881g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(@m80.k Application application) {
        super(application);
        kotlin.jvm.internal.g0.p(application, "application");
        this.f76877c = new MutableLiveData<>();
        this.f76878d = new MutableLiveData<>();
        this.f76879e = new MutableLiveData<>();
        this.f76880f = UserIdentity.ALL;
        this.f76881g = new ArrayList();
    }

    public static final rx.c G(UserIdentity userIdentity, Integer num) {
        return se.c.f88370a.f(userIdentity);
    }

    public static final rx.c H(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    public static final List I(List list) {
        kotlin.jvm.internal.g0.m(list);
        List<AllTopCategoryInfo> list2 = list;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        for (AllTopCategoryInfo allTopCategoryInfo : list2) {
            arrayList.add(new qe.a(allTopCategoryInfo.getCategoryName(), se.c.f88370a.e(allTopCategoryInfo.getSubCategoryIds())));
        }
        return arrayList;
    }

    public static final List J(x00.l lVar, Object obj) {
        return (List) lVar.invoke(obj);
    }

    public static final g2 K(i0 i0Var, List list) {
        i0Var.f76879e.postValue(Boolean.FALSE);
        i0Var.f76877c.postValue(list);
        return g2.f100423a;
    }

    public static final void L(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void M(i0 i0Var, Throwable th2) {
        qb.c.c(f76874j, "load error: ", th2);
        i0Var.f76879e.postValue(Boolean.FALSE);
        va.g.j(th2, 0);
    }

    public static final rx.c N(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    public static final List O(UserIdentityLevelInfo userIdentityLevelInfo) {
        return se.c.f88370a.e(userIdentityLevelInfo.getCategories());
    }

    public static final List P(x00.l lVar, Object obj) {
        return (List) lVar.invoke(obj);
    }

    public static final g2 Q(i0 i0Var, List list) {
        i0Var.f76879e.postValue(Boolean.FALSE);
        MutableLiveData<List<qe.a>> mutableLiveData = i0Var.f76877c;
        kotlin.jvm.internal.g0.m(list);
        mutableLiveData.postValue(a00.g0.l(new qe.a("", list)));
        return g2.f100423a;
    }

    public static final void R(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void S(i0 i0Var, Throwable th2) {
        qb.c.c(f76874j, "load by identity error: ", th2);
        i0Var.f76879e.postValue(Boolean.FALSE);
        va.g.j(th2, 0);
    }

    public static final rx.c T(Integer num) {
        return se.c.f88370a.c();
    }

    public static final g2 V(i0 i0Var, List list) {
        i0Var.f76881g.clear();
        List<Integer> list2 = i0Var.f76881g;
        kotlin.jvm.internal.g0.m(list);
        list2.addAll(list);
        return g2.f100423a;
    }

    public static final void W(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void X(Throwable th2) {
        qb.c.c(f76874j, "", th2);
    }

    public static final g2 Z(x00.l lVar, String str) {
        kotlin.jvm.internal.g0.m(str);
        lVar.invoke(str);
        return g2.f100423a;
    }

    public static final void a0(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void b0(Throwable th2) {
        qb.c.c(f76874j, "", th2);
    }

    public static final g2 d0(i0 i0Var, UserSelectedBookInfo userSelectedBookInfo) {
        i0Var.f76879e.postValue(Boolean.FALSE);
        i0Var.f76878d.postValue(userSelectedBookInfo);
        return g2.f100423a;
    }

    public static final void e0(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void f0(i0 i0Var, Throwable th2) {
        qb.c.c(f76874j, "new book plan: ", th2);
        i0Var.f76879e.postValue(Boolean.FALSE);
        va.g.j(th2, 0);
    }

    @m80.k
    public final LiveData<Boolean> A() {
        return this.f76879e;
    }

    @m80.k
    public final UserIdentity B() {
        return this.f76880f;
    }

    @m80.k
    public final LiveData<UserSelectedBookInfo> C() {
        return this.f76878d;
    }

    public final void D() {
        qb0.h hVar = this.f76875a;
        if (hVar != null) {
            if (hVar.isUnsubscribed()) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.unsubscribe();
            }
        }
        this.f76879e.setValue(Boolean.TRUE);
        rx.c<Integer> h11 = se.c.f88370a.h(getApplication());
        final x00.l lVar = new x00.l() { // from class: oe.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                rx.c T;
                T = i0.T((Integer) obj);
                return T;
            }
        };
        rx.c<R> b22 = h11.b2(new wb0.p() { // from class: oe.w
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c H;
                H = i0.H(x00.l.this, obj);
                return H;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: oe.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                List I;
                I = i0.I((List) obj);
                return I;
            }
        };
        rx.c I3 = b22.c3(new wb0.p() { // from class: oe.b0
            @Override // wb0.p
            public final Object call(Object obj) {
                List J;
                J = i0.J(x00.l.this, obj);
                return J;
            }
        }).I3(tb0.a.a());
        final x00.l lVar3 = new x00.l() { // from class: oe.c0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 K;
                K = i0.K(i0.this, (List) obj);
                return K;
            }
        };
        this.f76875a = I3.u5(new wb0.b() { // from class: oe.d0
            @Override // wb0.b
            public final void call(Object obj) {
                i0.L(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: oe.e0
            @Override // wb0.b
            public final void call(Object obj) {
                i0.M(i0.this, (Throwable) obj);
            }
        });
    }

    public final void F(@m80.k final UserIdentity identity) {
        kotlin.jvm.internal.g0.p(identity, "identity");
        this.f76880f = identity;
        qb0.h hVar = this.f76875a;
        if (hVar != null) {
            if (hVar.isUnsubscribed()) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.unsubscribe();
            }
        }
        this.f76879e.setValue(Boolean.TRUE);
        rx.c<Integer> h11 = se.c.f88370a.h(getApplication());
        final x00.l lVar = new x00.l() { // from class: oe.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                rx.c G;
                G = i0.G(UserIdentity.this, (Integer) obj);
                return G;
            }
        };
        rx.c<R> b22 = h11.b2(new wb0.p() { // from class: oe.n
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c N;
                N = i0.N(x00.l.this, obj);
                return N;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: oe.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                List O;
                O = i0.O((UserIdentityLevelInfo) obj);
                return O;
            }
        };
        rx.c I3 = b22.c3(new wb0.p() { // from class: oe.p
            @Override // wb0.p
            public final Object call(Object obj) {
                List P;
                P = i0.P(x00.l.this, obj);
                return P;
            }
        }).I3(tb0.a.a());
        final x00.l lVar3 = new x00.l() { // from class: oe.q
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 Q;
                Q = i0.Q(i0.this, (List) obj);
                return Q;
            }
        };
        this.f76875a = I3.u5(new wb0.b() { // from class: oe.r
            @Override // wb0.b
            public final void call(Object obj) {
                i0.R(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: oe.s
            @Override // wb0.b
            public final void call(Object obj) {
                i0.S(i0.this, (Throwable) obj);
            }
        });
    }

    public final void U() {
        rx.c<List<Integer>> loadHasPayedBooks = BookListManager.getInstance().loadHasPayedBooks();
        final x00.l lVar = new x00.l() { // from class: oe.x
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 V;
                V = i0.V(i0.this, (List) obj);
                return V;
            }
        };
        loadHasPayedBooks.u5(new wb0.b() { // from class: oe.y
            @Override // wb0.b
            public final void call(Object obj) {
                i0.W(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: oe.z
            @Override // wb0.b
            public final void call(Object obj) {
                i0.X((Throwable) obj);
            }
        });
    }

    public final void Y(int i11, @m80.k final x00.l<? super String, g2> callback) {
        kotlin.jvm.internal.g0.p(callback, "callback");
        rx.c<String> loadSpecialDes = BookListManager.getInstance().loadSpecialDes(i11);
        final x00.l lVar = new x00.l() { // from class: oe.t
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 Z;
                Z = i0.Z(x00.l.this, (String) obj);
                return Z;
            }
        };
        loadSpecialDes.u5(new wb0.b() { // from class: oe.u
            @Override // wb0.b
            public final void call(Object obj) {
                i0.a0(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: oe.v
            @Override // wb0.b
            public final void call(Object obj) {
                i0.b0((Throwable) obj);
            }
        });
    }

    public final void c0(@m80.k qe.c book, @m80.k String topAllName) {
        kotlin.jvm.internal.g0.p(book, "book");
        kotlin.jvm.internal.g0.p(topAllName, "topAllName");
        qb0.h hVar = this.f76876b;
        if (hVar != null) {
            hVar.unsubscribe();
        }
        this.f76879e.setValue(Boolean.TRUE);
        se.u uVar = se.u.f88397a;
        Application application = getApplication();
        BookRecord bookById = BookListManager.getInstance().getBookById(book.m());
        kotlin.jvm.internal.g0.o(bookById, "getBookById(...)");
        rx.c<UserSelectedBookInfo> I3 = uVar.o(application, bookById, topAllName).I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: oe.f0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 d02;
                d02 = i0.d0(i0.this, (UserSelectedBookInfo) obj);
                return d02;
            }
        };
        this.f76876b = I3.u5(new wb0.b() { // from class: oe.g0
            @Override // wb0.b
            public final void call(Object obj) {
                i0.e0(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: oe.h0
            @Override // wb0.b
            public final void call(Object obj) {
                i0.f0(i0.this, (Throwable) obj);
            }
        });
    }

    public final void g0(@m80.k UserIdentity userIdentity) {
        kotlin.jvm.internal.g0.p(userIdentity, "<set-?>");
        this.f76880f = userIdentity;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        qb0.h hVar = this.f76875a;
        if (hVar != null) {
            hVar.unsubscribe();
        }
        qb0.h hVar2 = this.f76876b;
        if (hVar2 != null) {
            hVar2.unsubscribe();
        }
    }

    @m80.k
    public final LiveData<List<qe.a>> y() {
        return this.f76877c;
    }

    @m80.k
    public final List<Integer> z() {
        return this.f76881g;
    }
}
