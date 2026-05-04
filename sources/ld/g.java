package ld;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableInt;
import androidx.databinding.ObservableList;
import androidx.lifecycle.AndroidViewModel;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.baicizhan.online.user_study_api.CalendarDailyInfo;
import com.baicizhan.online.user_study_api.CalendarDailyWord;
import com.jiongji.andriod.card.R;
import java.util.Calendar;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class g extends AndroidViewModel {

    /* renamed from: i, reason: collision with root package name */
    public static final String f71123i = "DakaCalendarViewModel";

    /* renamed from: j, reason: collision with root package name */
    public static final int f71124j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f71125k = 2;

    /* renamed from: l, reason: collision with root package name */
    public static final int f71126l = 3;

    /* renamed from: m, reason: collision with root package name */
    public static final int f71127m = 4;

    /* renamed from: n, reason: collision with root package name */
    public static final int f71128n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f71129o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static final int f71130p = 3;

    /* renamed from: a, reason: collision with root package name */
    public l f71131a;

    /* renamed from: b, reason: collision with root package name */
    public ObservableInt f71132b;

    /* renamed from: c, reason: collision with root package name */
    public ObservableList<CalendarDailyWord> f71133c;

    /* renamed from: d, reason: collision with root package name */
    public ObservableInt f71134d;

    /* renamed from: e, reason: collision with root package name */
    public ObservableInt f71135e;

    /* renamed from: f, reason: collision with root package name */
    public qb0.h f71136f;

    /* renamed from: g, reason: collision with root package name */
    public SingleLiveEvent<Void> f71137g;

    /* renamed from: h, reason: collision with root package name */
    public SingleLiveEvent<Void> f71138h;

    public g(@NonNull Application application) {
        super(application);
        this.f71132b = new ObservableInt(4);
        this.f71133c = new ObservableArrayList();
        this.f71134d = new ObservableInt(3);
        this.f71135e = new ObservableInt(3);
        this.f71137g = new SingleLiveEvent<>();
        this.f71138h = new SingleLiveEvent<>();
    }

    public void b() {
        this.f71137g.call();
    }

    public void c() {
        qb0.h hVar = this.f71136f;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f71136f.unsubscribe();
            this.f71136f = null;
        }
        this.f71132b.set(4);
        this.f71133c.clear();
        this.f71134d.set(3);
    }

    public SingleLiveEvent<Void> d() {
        return this.f71137g;
    }

    public l f() {
        return this.f71131a;
    }

    public SingleLiveEvent<Void> g() {
        return this.f71138h;
    }

    public final void h() {
        qb0.h hVar = this.f71136f;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f71136f.unsubscribe();
        }
        Calendar calendar = this.f71131a.f71152f.get();
        if (calendar == null) {
            return;
        }
        this.f71136f = c.j().l(calendar, this.f71133c.size()).I3(tb0.a.a()).r5(new a());
    }

    public void i() {
        qb0.h hVar = this.f71136f;
        if (hVar == null || hVar.isUnsubscribed()) {
            this.f71135e.set(1);
            h();
        }
    }

    public void j() {
        this.f71132b.set(4);
        this.f71133c.clear();
        this.f71134d.set(1);
        h();
    }

    public void k() {
        i();
    }

    public void l(l headItemViewModel) {
        this.f71131a = headItemViewModel;
    }

    public void m() {
        this.f71138h.call();
    }

    public void start() {
        this.f71131a.start();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<CalendarDailyInfo> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(g.f71123i, "", e11);
            g gVar = g.this;
            gVar.f71134d.set(gVar.f71133c.size() == 0 ? 2 : 3);
            g gVar2 = g.this;
            gVar2.f71132b.set(gVar2.f71133c.size() == 0 ? 4 : 3);
            g.this.f71135e.set(3);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(CalendarDailyInfo calendarDailyInfo) {
            g.this.f71134d.set(3);
            g.this.f71135e.set(3);
            int i11 = calendarDailyInfo.state;
            if (i11 == 3 || i11 == 2) {
                g.this.f71132b.set(4);
                g.this.f71131a.f71155i.set(calendarDailyInfo.hint);
                return;
            }
            g.this.f71131a.v();
            g.this.f71131a.t(calendarDailyInfo.resign_state, calendarDailyInfo.resign_message);
            g.this.f71133c.addAll(calendarDailyInfo.words);
            if (g.this.f71133c.size() == 0) {
                g.this.f71132b.set(4);
                g.this.f71131a.f71155i.set(g.this.getApplication().getString(R.string.study_calendar_no_record));
            } else if (g.this.f71133c.size() < calendarDailyInfo.daily_word_count) {
                g.this.f71132b.set(2);
                g.this.f71131a.f71155i.set(null);
            } else {
                g gVar = g.this;
                gVar.f71132b.set(gVar.f71133c.size() >= 100 ? 1 : 4);
                g.this.f71131a.f71155i.set(null);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
