package th;

import androidx.fragment.app.FragmentActivity;
import com.baicizhan.client.business.managers.booklist.BookListManager;
import com.baicizhan.client.business.webview.hijack.WhiteListMgr;
import com.baicizhan.main.module.ReviewAdModule;
import qg.l0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f90624a = false;

    /* renamed from: b, reason: collision with root package name */
    public static final int f90625b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f90626c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f90627d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f90628e = 3;

    public static /* synthetic */ Integer a(Boolean bool) {
        return 3;
    }

    public static /* synthetic */ Integer b(Boolean bool) {
        return 1;
    }

    public static /* synthetic */ Integer c(Boolean bool) {
        return 2;
    }

    public static rx.c<Integer> d(FragmentActivity activity, l0 mgr) {
        if (f90624a) {
            return rx.c.M2(0);
        }
        f90624a = true;
        sh.c.d().j();
        if (activity != null) {
            qh.b.e(activity);
            ai.d.g(activity);
        } else {
            f90624a = false;
            qb.c.d("LowPriorityInitObservables", "NULL == Activity", new Object[0]);
        }
        rx.c<R> c32 = WhiteListMgr.inst().requestWhiteList().c3(new wb0.p() { // from class: th.h
            @Override // wb0.p
            public final Object call(Object obj) {
                return k.b((Boolean) obj);
            }
        });
        rx.c<R> c33 = y9.e.f().i().c3(new wb0.p() { // from class: th.i
            @Override // wb0.p
            public final Object call(Object obj) {
                return k.c((Boolean) obj);
            }
        });
        BookListManager.getInstance().refreshBookUpdateInfos();
        me.o.f73181a.k(activity);
        ReviewAdModule.f24424a.l();
        la.f.f70832a.k();
        return rx.c.k3(c32, c33, mgr.E().c3(new wb0.p() { // from class: th.j
            @Override // wb0.p
            public final Object call(Object obj) {
                return k.a((Boolean) obj);
            }
        })).I3(tb0.a.a()).w5(bc0.c.a());
    }

    public static void e() {
        f90624a = false;
    }
}
