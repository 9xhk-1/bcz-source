package com.baicizhan.main.activity.calendar;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.main.activity.calendar.DakaCalendarActivity;
import com.baicizhan.main.activity.calendar.a;
import com.baicizhan.online.user_study_api.CalendarResignInfo;
import com.jiongji.andriod.card.R;
import gi.e;
import gs.jj;
import gs.t;
import java.util.Calendar;
import ld.g;
import ld.l;
import md.f;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class DakaCalendarActivity extends BaseAppCompatActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final String f18305e = "DakaCalendar_TAG";

    /* renamed from: a, reason: collision with root package name */
    public g f18306a;

    /* renamed from: b, reason: collision with root package name */
    public t f18307b;

    /* renamed from: c, reason: collision with root package name */
    public float f18308c;

    /* renamed from: d, reason: collision with root package name */
    public f f18309d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends RecyclerView.OnScrollListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f18310a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (newState == 0 && linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1 && this.f18310a) {
                DakaCalendarActivity.this.f18306a.i();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int dx2, int dy2) {
            int argb;
            int argb2;
            super.onScrolled(recyclerView, dx2, dy2);
            this.f18310a = dy2 > 0;
            if (((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition() == 0) {
                jj b11 = ((a.b) recyclerView.findViewHolderForAdapterPosition(0)).b();
                float y11 = b11.getRoot().getY();
                float y12 = (b11.f55518d.getY() - DakaCalendarActivity.this.f18307b.f56798a.getRoot().getY()) - DakaCalendarActivity.this.f18307b.f56798a.getRoot().getHeight();
                float f11 = -y11;
                if (f11 > DakaCalendarActivity.this.f18308c) {
                    argb = Color.argb(255, 255, 255, 255);
                    argb2 = Color.argb(0, 18, 78, R.styleable.Theme_drawable_tab_friends);
                } else {
                    argb = Color.argb((int) ((f11 / DakaCalendarActivity.this.f18308c) * 255.0f), 255, 255, 255);
                    argb2 = Color.argb(255 - ((int) ((f11 / DakaCalendarActivity.this.f18308c) * 255.0f)), 18, 78, R.styleable.Theme_drawable_tab_friends);
                }
                boolean z11 = f11 > DakaCalendarActivity.this.f18308c / 2.0f;
                DakaCalendarActivity.this.f18307b.k(z11);
                zb.a.f(DakaCalendarActivity.this, z11);
                b11.f55517c.setBackgroundColor(argb2);
                DakaCalendarActivity.this.f18307b.f56798a.F(argb);
                DakaCalendarActivity.this.f18307b.f56801d.setVisibility(f11 <= y12 ? 8 : 0);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Observer<Void> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            DakaCalendarActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Observer<Void> {
        public c() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            DakaCalendarActivity.this.f18307b.f56802e.scrollToPosition(0);
            DakaCalendarActivity.this.S0();
            DakaCalendarActivity.this.f18306a.j();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Observer<Void> {
        public d() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            DakaCalendarActivity.this.S0();
            DakaCalendarActivity.this.f18306a.c();
        }
    }

    public static /* synthetic */ void J0(l lVar, va.f fVar, Void r22) {
        if (lVar.p()) {
            fVar.show();
        }
        lVar.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0() {
        if (((LinearLayoutManager) this.f18307b.f56802e.getLayoutManager()).findFirstVisibleItemPosition() == 0) {
            jj b11 = ((a.b) this.f18307b.f56802e.findViewHolderForAdapterPosition(0)).b();
            this.f18307b.k(false);
            zb.a.f(this, false);
            this.f18307b.f56798a.F(Color.argb(255, 18, 78, R.styleable.Theme_drawable_tab_friends));
            b11.f55517c.setBackgroundColor(Color.argb(255, 18, 78, R.styleable.Theme_drawable_tab_friends));
        }
    }

    public static void V0(Activity activity, int request) {
        activity.startActivityForResult(new Intent(activity, (Class<?>) DakaCalendarActivity.class), request);
    }

    private void init() {
        final va.f c11 = e.c(this);
        this.f18308c = xb.f.a(this, 50.0f);
        this.f18307b.l(this.f18306a);
        com.baicizhan.main.activity.calendar.a aVar = new com.baicizhan.main.activity.calendar.a();
        aVar.j(this.f18306a);
        this.f18307b.f56802e.setLayoutManager(new LinearLayoutManager(this));
        this.f18307b.f56802e.setAdapter(aVar);
        this.f18307b.f56802e.addOnScrollListener(new a());
        this.f18306a.d().observe(this, new b());
        final l lVar = (l) new ViewModelProvider(this).get(l.class);
        lVar.f71157k.observe(this, new c());
        lVar.f71156j.observe(this, new d());
        lVar.f71159m.observe(this, new Observer() { // from class: ld.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DakaCalendarActivity.this.Q0(lVar, c11, (CalendarResignInfo) obj);
            }
        });
        lVar.f71161o.observe(this, new Observer() { // from class: ld.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DakaCalendarActivity.this.R0((Integer) obj);
            }
        });
        lVar.f71158l.observe(this, new Observer() { // from class: ld.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DakaCalendarActivity.J0(l.this, c11, (Void) obj);
            }
        });
        this.f18306a.l(lVar);
        this.f18306a.start();
    }

    public final void P0() {
        this.f18306a = (g) new ViewModelProvider(this).get(g.class);
    }

    public final /* synthetic */ void Q0(l lVar, va.f fVar, CalendarResignInfo calendarResignInfo) {
        U0(calendarResignInfo, lVar.f71152f.get());
        fVar.dismiss();
    }

    public final /* synthetic */ void R0(Integer num) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.f18307b.f56802e.findViewHolderForAdapterPosition(0);
        if (findViewHolderForAdapterPosition != null) {
            ((a.b) findViewHolderForAdapterPosition).b().f55516b.setBackgroundResource(num.intValue());
        }
    }

    public final void T0() {
        t g11 = t.g(LayoutInflater.from(this));
        this.f18307b = g11;
        setContentView(g11.getRoot());
    }

    public final void U0(CalendarResignInfo calendarResignInfo, Calendar calendar) {
        f fVar = this.f18309d;
        if (fVar == null || fVar.getDialog() == null || !this.f18309d.getDialog().isShowing()) {
            f a11 = f.f73105g.a(calendarResignInfo, calendar);
            this.f18309d = a11;
            a11.show(getSupportFragmentManager(), "daka");
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (x.r().c(this)) {
            return;
        }
        this.mClosedFit = true;
        P0();
        T0();
        init();
    }
}
