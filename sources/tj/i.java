package tj;

import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.dataset.models.ScheduleRecord;
import com.baicizhan.client.business.util.StoreEntryJumper;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.customview.OfflineDownloadView;
import com.baicizhan.main.rx.BookAdObservables;
import com.jiongji.andriod.card.R;
import kc.d;
import kc.u;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import sh.d;
import tj.i;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class i extends AndroidViewModel {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final a f90704f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f90705g = 8;

    /* renamed from: h, reason: collision with root package name */
    public static final String f90706h = i.class.getSimpleName();

    /* renamed from: i, reason: collision with root package name */
    public static final int f90707i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f90708j = 1;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public qb0.h f90709a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public qb0.h f90710b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<d.g> f90711c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<tj.a> f90712d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<BookAdObservables.BookAdInfo> f90713e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public static final g2 c(View it) {
            g0.p(it, "it");
            i.f90704f.d();
            ma.l.a(ma.t.f73011j, ma.a.f72746f5);
            return g2.f100423a;
        }

        /* JADX WARN: Type inference failed for: r10v10, types: [kc.d, kc.h] */
        /* JADX WARN: Type inference failed for: r10v4, types: [kc.d, kc.h] */
        public final void b(Context context) {
            FragmentActivity fragmentActivity;
            int b11 = rb.d.b(context);
            qb.c.b(i.f90706h, "checkMobileOfflineDownloadEnabled " + b11, new Object[0]);
            if (b11 == 0) {
                d();
                return;
            }
            if (b11 != 1 && b11 != 2 && b11 != 3 && b11 != 4) {
                fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                if (fragmentActivity == null) {
                    return;
                }
                mc.a.n(fragmentActivity, mc.a.f(fragmentActivity).L(R.string.attention).V("检测不到网络，请联网后重试").b0(ButtonType.SINGLE_POSITIVE).d(), "no-network");
                return;
            }
            String valueOf = String.valueOf((float) Math.ceil(q9.x.r().A() * 0.08f));
            fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
            if (fragmentActivity == null) {
                return;
            }
            mc.a.n(fragmentActivity, ((u.a) d.a.I(mc.a.f(fragmentActivity).V(fragmentActivity.getString(R.string.main_alert_message_download_problem, q9.x.r().k().bookName, valueOf)), R.string.main_alert_positive_wealthy, null, new x00.l() { // from class: tj.h
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 c11;
                    c11 = i.a.c((View) obj);
                    return c11;
                }
            }, 2, null)).d(), "non-wifi");
        }

        public final void d() {
            qb.c.b(i.f90706h, "confirmOfflineDownload ", new Object[0]);
            ma.l.a(ma.t.f73016o, ma.a.f72854v1);
            sh.d.s().y();
        }

        @w00.o
        public final void e(@m80.k Context context, @m80.k BookAdObservables.BookAdInfo info, int i11) {
            g0.p(context, "context");
            g0.p(info, "info");
            ma.l.b(ma.t.f73010i, i11 == 0 ? ma.a.J0 : ma.a.L0, ma.u.c(new String[]{"id", "book_id", "adv_id"}, new Object[]{info.aId, Integer.valueOf(info.book_id), info.aId}, true));
            int i12 = info.jump_type;
            if (i12 == 2) {
                if (StoreEntryJumper.jumpToTaoBao(context, info.taobao_link)) {
                    return;
                }
                StoreEntryJumper.jumpToNative(context, info.local_link);
            } else if (i12 == 1) {
                StoreEntryJumper.jumpToNative(context, info.local_link);
            }
        }

        @w00.o
        public final void f(@m80.k Context context) {
            g0.p(context, "context");
            int i11 = sh.d.s().o().f88564a;
            if (i11 == 2) {
                va.g.i("准备下载中，请稍候", 0);
            } else if (i11 != 3) {
                b(context);
            } else {
                sh.d.s().t();
            }
        }

        @w00.o
        public final void g(@m80.k d.g state, float f11, @m80.k OfflineDownloadView view) {
            g0.p(state, "state");
            g0.p(view, "view");
            qb.c.b(i.f90706h, "updateOfflineStatus: " + state, new Object[0]);
            if (hi.e.e(view.getContext())) {
                view.setVisibility(8);
                return;
            }
            view.setEnabled(state.f88564a != 6 || state.f88566c <= 0);
            int i11 = state.f88564a;
            if (i11 == 0) {
                view.setVisibility(0);
                view.b();
                view.setText("正在检测");
                return;
            }
            if (i11 == 1) {
                view.setVisibility(0);
                if (state.f88566c > 0) {
                    view.c();
                    view.setText("继续下载");
                    return;
                } else {
                    view.b();
                    view.setText("单词数据");
                    return;
                }
            }
            if (i11 == 2) {
                view.setVisibility(0);
                view.setProgress(0);
                view.setText("准备下载");
                return;
            }
            if (i11 == 3) {
                view.setVisibility(0);
                int i12 = state.f88566c;
                view.setProgress(i12 > 0 ? (state.f88565b * 100) / i12 : 0);
                view.setText("正在下载");
                return;
            }
            if (i11 == 4) {
                view.setVisibility(0);
                view.c();
                view.setText("继续下载");
            } else {
                if (i11 != 6) {
                    throw new IllegalStateException();
                }
                if (state.f88566c <= 0) {
                    view.setVisibility(8);
                    return;
                }
                view.setVisibility(0);
                view.a();
                view.setText("下载完成");
            }
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@m80.k Application application) {
        super(application);
        g0.p(application, "application");
        this.f90711c = new MutableLiveData<>();
        this.f90712d = new MutableLiveData<>();
        this.f90713e = new MutableLiveData<>();
    }

    @w00.o
    public static final void l(@m80.k Context context, @m80.k BookAdObservables.BookAdInfo bookAdInfo, int i11) {
        f90704f.e(context, bookAdInfo, i11);
    }

    public static final g2 n(i iVar, BookAdObservables.BookAdInfo bookAdInfo) {
        iVar.f90713e.postValue(bookAdInfo);
        return g2.f100423a;
    }

    public static final void o(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void p(Throwable th2) {
        qb.c.c(f90706h, "book ad info: ", th2);
    }

    public static final g2 s(i iVar, d.g gVar) {
        iVar.f90711c.postValue(gVar);
        return g2.f100423a;
    }

    public static final void t(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void u(Throwable th2) {
        qb.c.c(f90706h, "offline status: ", th2);
    }

    @w00.o
    public static final void v(@m80.k Context context) {
        f90704f.f(context);
    }

    @w00.o
    public static final void w(@m80.k d.g gVar, float f11, @m80.k OfflineDownloadView offlineDownloadView) {
        f90704f.g(gVar, f11, offlineDownloadView);
    }

    @m80.k
    public final LiveData<BookAdObservables.BookAdInfo> i() {
        return this.f90713e;
    }

    @m80.k
    public final LiveData<tj.a> j() {
        return this.f90712d;
    }

    @m80.k
    public final LiveData<d.g> k() {
        return this.f90711c;
    }

    public final void m() {
        qb0.h hVar = this.f90710b;
        if (hVar != null) {
            hVar.unsubscribe();
        }
        BookRecord k11 = q9.x.r().k();
        if (k11 == null) {
            return;
        }
        rx.c<BookAdObservables.BookAdInfo> I3 = BookAdObservables.i(k11.bookId).I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: tj.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 n11;
                n11 = i.n(i.this, (BookAdObservables.BookAdInfo) obj);
                return n11;
            }
        };
        this.f90710b = I3.u5(new wb0.b() { // from class: tj.c
            @Override // wb0.b
            public final void call(Object obj) {
                i.o(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: tj.d
            @Override // wb0.b
            public final void call(Object obj) {
                i.p((Throwable) obj);
            }
        });
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        qb0.h hVar = this.f90709a;
        if (hVar != null) {
            hVar.unsubscribe();
        }
        qb0.h hVar2 = this.f90710b;
        if (hVar2 != null) {
            hVar2.unsubscribe();
        }
    }

    public final void q() {
        BookRecord k11;
        q9.x r11 = q9.x.r();
        ScheduleRecord o11 = r11.o();
        if (o11 == null || (k11 = r11.k()) == null) {
            return;
        }
        Pair pair = new Pair(o11, k11);
        MutableLiveData<tj.a> mutableLiveData = this.f90712d;
        String bookName = ((ScheduleRecord) pair.getFirst()).bookName;
        g0.o(bookName, "bookName");
        mutableLiveData.postValue(new tj.a(bookName, ((BookRecord) pair.getSecond()).wordCount, ((ScheduleRecord) pair.getFirst()).desc, ((ScheduleRecord) pair.getFirst()).descImage));
    }

    public final void r() {
        qb0.h hVar = this.f90709a;
        if (hVar != null) {
            hVar.unsubscribe();
        }
        rx.c<d.g> I3 = sh.d.s().q().I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: tj.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 s11;
                s11 = i.s(i.this, (d.g) obj);
                return s11;
            }
        };
        this.f90709a = I3.u5(new wb0.b() { // from class: tj.f
            @Override // wb0.b
            public final void call(Object obj) {
                i.t(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: tj.g
            @Override // wb0.b
            public final void call(Object obj) {
                i.u((Throwable) obj);
            }
        });
    }
}
