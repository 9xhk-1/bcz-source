package ld;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.thrift.p;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.online.user_study_api.CalendarResignInfo;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import com.jiongji.andriod.card.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import ma.t;
import org.apache.thrift.TException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class l extends AndroidViewModel {
    public static final int A = 3;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 3;

    /* renamed from: w, reason: collision with root package name */
    public static final String f71143w = "HeadItemViewModel";

    /* renamed from: x, reason: collision with root package name */
    public static final int f71144x = 12;

    /* renamed from: y, reason: collision with root package name */
    public static final int f71145y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final int f71146z = 2;

    /* renamed from: a, reason: collision with root package name */
    public ObservableInt f71147a;

    /* renamed from: b, reason: collision with root package name */
    public ObservableField<String> f71148b;

    /* renamed from: c, reason: collision with root package name */
    public ObservableField<String> f71149c;

    /* renamed from: d, reason: collision with root package name */
    public ObservableField<String> f71150d;

    /* renamed from: e, reason: collision with root package name */
    public ObservableField<b> f71151e;

    /* renamed from: f, reason: collision with root package name */
    public ObservableField<Calendar> f71152f;

    /* renamed from: g, reason: collision with root package name */
    public ObservableBoolean f71153g;

    /* renamed from: h, reason: collision with root package name */
    public ObservableBoolean f71154h;

    /* renamed from: i, reason: collision with root package name */
    public ObservableField<String> f71155i;

    /* renamed from: j, reason: collision with root package name */
    public SingleLiveEvent<Void> f71156j;

    /* renamed from: k, reason: collision with root package name */
    public SingleLiveEvent<Void> f71157k;

    /* renamed from: l, reason: collision with root package name */
    public SingleLiveEvent<Void> f71158l;

    /* renamed from: m, reason: collision with root package name */
    public MutableLiveData<CalendarResignInfo> f71159m;

    /* renamed from: n, reason: collision with root package name */
    public ObservableField<String> f71160n;

    /* renamed from: o, reason: collision with root package name */
    public MutableLiveData<Integer> f71161o;

    /* renamed from: p, reason: collision with root package name */
    public ObservableInt f71162p;

    /* renamed from: q, reason: collision with root package name */
    public Calendar f71163q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f71164r;

    /* renamed from: s, reason: collision with root package name */
    public int f71165s;

    /* renamed from: t, reason: collision with root package name */
    public String f71166t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f71167u;

    /* renamed from: v, reason: collision with root package name */
    public qb0.h f71168v;

    public l(@NonNull Application application) {
        super(application);
        this.f71147a = new ObservableInt(1);
        this.f71148b = new ObservableField<>();
        this.f71149c = new ObservableField<>();
        this.f71150d = new ObservableField<>();
        this.f71151e = new ObservableField<>();
        this.f71152f = new ObservableField<>();
        this.f71153g = new ObservableBoolean(false);
        this.f71154h = new ObservableBoolean(false);
        this.f71155i = new ObservableField<>();
        this.f71156j = new SingleLiveEvent<>();
        this.f71157k = new SingleLiveEvent<>();
        this.f71158l = new SingleLiveEvent<>();
        this.f71159m = new MutableLiveData<>();
        this.f71160n = new ObservableField<>();
        this.f71161o = new MutableLiveData<>();
        this.f71162p = new ObservableInt(2);
        this.f71164r = true;
        this.f71165s = -1;
        this.f71166t = "";
        this.f71167u = false;
    }

    public static /* synthetic */ CalendarResignInfo c(UserStudyApiService.Client client) {
        try {
            return client.get_calendar_resign_info();
        } catch (TException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public void h() {
        this.f71158l.call();
    }

    public final void i() {
        this.f71152f.set(null);
        this.f71150d.set("");
        this.f71155i.set("");
        this.f71156j.call();
        this.f71154h.set(false);
    }

    public void j() {
        if (this.f71167u) {
            return;
        }
        if (p()) {
            this.f71167u = true;
            p.a(new com.baicizhan.client.business.thrift.l("/rpc/user_study")).c3(new wb0.p() { // from class: ld.h
                @Override // wb0.p
                public final Object call(Object obj) {
                    return l.c((UserStudyApiService.Client) obj);
                }
            }).w5(bc0.c.e()).I3(tb0.a.a()).u5(new wb0.b() { // from class: ld.i
                @Override // wb0.b
                public final void call(Object obj) {
                    l.this.k((CalendarResignInfo) obj);
                }
            }, new wb0.b() { // from class: ld.j
                @Override // wb0.b
                public final void call(Object obj) {
                    l.this.l((Throwable) obj);
                }
            });
            ma.l.a(t.C, ma.a.f72821q3);
        } else {
            if (TextUtils.isEmpty(this.f71166t)) {
                return;
            }
            va.g.i(this.f71166t, 0);
        }
    }

    public final /* synthetic */ void k(CalendarResignInfo calendarResignInfo) {
        qb.c.i(f71143w, calendarResignInfo.toString(), new Object[0]);
        this.f71159m.postValue(calendarResignInfo);
        this.f71167u = false;
    }

    public final /* synthetic */ void l(Throwable th2) {
        qb.c.c(f71143w, "", th2);
        va.g.j(th2, 0);
        this.f71167u = false;
    }

    public final /* synthetic */ void m(Boolean bool) {
        if (bool.booleanValue()) {
            o(this.f71163q);
            this.f71154h.set(false);
            this.f71155i.set("");
            this.f71157k.call();
        }
    }

    public void n() {
        if (this.f71163q == null || this.f71162p.get() == 1 || this.f71147a.get() == 1) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.f71163q.getTimeInMillis());
        calendar.set(5, 1);
        int i11 = calendar.get(2) - 1;
        if (i11 < 0) {
            calendar.set(1, this.f71163q.get(1) - 1);
            calendar.set(2, 11);
        } else {
            calendar.set(2, i11);
        }
        if (TimeUtil.getBetweenMonth(System.currentTimeMillis(), calendar.getTimeInMillis()) == 12) {
            this.f71162p.set(1);
        }
        if (this.f71162p.get() == 2) {
            this.f71162p.set(3);
        }
        u(calendar);
        o(calendar);
        i();
    }

    public final void o(@NonNull final Calendar calendar) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
        Calendar calendar2 = this.f71163q;
        qb.c.i(f71143w, "current %s , next %s", calendar2 == null ? "null" : simpleDateFormat.format(calendar2.getTime()), simpleDateFormat.format(calendar.getTime()));
        this.f71163q = calendar;
        this.f71147a.set(1);
        c.j().k(calendar).I3(tb0.a.a()).r5(new a(calendar));
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        qb0.h hVar = this.f71168v;
        if (hVar != null) {
            hVar.unsubscribe();
        }
        this.f71164r = true;
        c.j().f();
    }

    public boolean p() {
        return this.f71165s == 6;
    }

    public void q(Calendar calendar) {
        Calendar calendar2 = this.f71152f.get();
        if (this.f71163q != null && calendar.get(2) != this.f71163q.get(2)) {
            qb.c.i(f71143w, "OUT OF RANGE", new Object[0]);
            return;
        }
        if (calendar2 != null && bg.a.e(calendar, calendar2)) {
            i();
            return;
        }
        this.f71154h.set(false);
        this.f71152f.set(calendar);
        this.f71150d.set(this.f71148b.get() + getApplication().getString(R.string.study_calendar_date, Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))));
        this.f71155i.set("");
        this.f71157k.call();
    }

    public void r() {
        Calendar calendar = this.f71163q;
        if (calendar != null) {
            o(calendar);
        }
    }

    public void s() {
        if (this.f71163q == null || this.f71162p.get() == 2 || this.f71147a.get() == 1) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.f71163q.getTimeInMillis());
        int i11 = calendar.get(2) + 1;
        if (i11 > 11) {
            calendar.set(1, this.f71163q.get(1) + 1);
            calendar.set(2, 0);
        } else {
            calendar.set(2, i11);
        }
        if (bg.a.a(Calendar.getInstance(), calendar) <= 0) {
            this.f71162p.set(2);
        }
        if (this.f71162p.get() == 1) {
            this.f71162p.set(3);
        }
        u(calendar);
        o(calendar);
        i();
    }

    public void start() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        u(calendar);
        o(calendar);
        this.f71168v = md.g.b().t5(new wb0.b() { // from class: ld.k
            @Override // wb0.b
            public final void call(Object obj) {
                l.this.m((Boolean) obj);
            }
        });
    }

    public void t(int resignState, String msg) {
        this.f71153g.set(false);
        this.f71165s = resignState;
        this.f71166t = msg;
        Calendar calendar = this.f71152f.get();
        if (resignState == 0 && calendar != null) {
            this.f71153g.set(c.j().i(calendar));
        }
        switch (resignState) {
            case 4:
                this.f71153g.set(true);
                break;
            case 5:
                this.f71160n.set("已补日历");
                this.f71161o.setValue(Integer.valueOf(R.drawable.bg_calendar_repair_btn_done));
                break;
            case 6:
                this.f71161o.setValue(Integer.valueOf(R.drawable.bg_calendar_repair_btn));
                this.f71160n.set("补日历");
                break;
            case 7:
            case 8:
                this.f71160n.set("补日历");
                this.f71161o.setValue(Integer.valueOf(R.drawable.bg_calendar_repair_btn_cannot));
                break;
        }
    }

    public final void u(Calendar calendar) {
        int i11 = calendar.get(1);
        if (Calendar.getInstance().get(1) != i11) {
            this.f71148b.set(pb.a.a().getString(R.string.study_calendar_year, Integer.valueOf(i11)));
        } else {
            this.f71148b.set("");
        }
        this.f71149c.set(pb.a.a().getResources().getStringArray(R.array.study_calendar_month)[calendar.get(2)]);
    }

    public void v() {
        Calendar calendar = this.f71152f.get();
        if (calendar == null) {
            return;
        }
        this.f71154h.set(c.j().e(calendar));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<b> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Calendar f71169a;

        public a(final Calendar val$calendar) {
            this.f71169a = val$calendar;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.h(l.f71143w, "", e11);
            l.this.f71147a.set(2);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(b calendarDataParam) {
            l.this.f71147a.set(3);
            l.this.f71151e.set(calendarDataParam);
            if (l.this.f71164r) {
                l.this.f71164r = false;
                l.this.q(this.f71169a);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
