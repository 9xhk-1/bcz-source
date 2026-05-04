package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pair;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class p extends BaseAdapter {

    /* renamed from: g, reason: collision with root package name */
    public static final int f31276g = v.x().getMaximum(4);

    /* renamed from: h, reason: collision with root package name */
    public static final int f31277h = (v.x().getMaximum(5) + v.x().getMaximum(7)) - 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f31278i = -1;

    /* renamed from: a, reason: collision with root package name */
    public final Month f31279a;

    /* renamed from: b, reason: collision with root package name */
    public final DateSelector<?> f31280b;

    /* renamed from: c, reason: collision with root package name */
    public Collection<Long> f31281c;

    /* renamed from: d, reason: collision with root package name */
    public b f31282d;

    /* renamed from: e, reason: collision with root package name */
    public final CalendarConstraints f31283e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public final DayViewDecorator f31284f;

    public p(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator) {
        this.f31279a = month;
        this.f31280b = dateSelector;
        this.f31283e = calendarConstraints;
        this.f31284f = dayViewDecorator;
        this.f31281c = dateSelector.m0();
    }

    public int b(int i11) {
        return c() + (i11 - 1);
    }

    public int c() {
        return this.f31279a.e(this.f31283e.k());
    }

    public final String d(Context context, long j11) {
        return h.e(context, j11, m(j11), l(j11), h(j11));
    }

    @Override // android.widget.Adapter
    @Nullable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i11) {
        if (i11 < c() || i11 > n()) {
            return null;
        }
        return Long.valueOf(this.f31279a.g(o(i11)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    @Override // android.widget.Adapter
    @androidx.annotation.NonNull
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, @androidx.annotation.Nullable android.view.View r7, @androidx.annotation.NonNull android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.g(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.R.layout.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.c()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.Month r8 = r5.f31279a
            int r2 = r8.f31112e
            if (r7 < r2) goto L2d
            goto L54
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L5d
        L54:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r0
        L64:
            long r1 = r6.longValue()
            r5.p(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.p.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public final void g(Context context) {
        if (this.f31282d == null) {
            this.f31282d = new b(context);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f31277h;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11 / this.f31279a.f31111d;
    }

    @VisibleForTesting
    public boolean h(long j11) {
        Iterator<Pair<Long, Long>> it = this.f31280b.G0().iterator();
        while (it.hasNext()) {
            Long l11 = it.next().second;
            if (l11 != null && l11.longValue() == j11) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public boolean i(int i11) {
        return i11 % this.f31279a.f31111d == 0;
    }

    public boolean j(int i11) {
        return (i11 + 1) % this.f31279a.f31111d == 0;
    }

    public final boolean k(long j11) {
        Iterator<Long> it = this.f31280b.m0().iterator();
        while (it.hasNext()) {
            if (v.a(j11) == v.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    public boolean l(long j11) {
        Iterator<Pair<Long, Long>> it = this.f31280b.G0().iterator();
        while (it.hasNext()) {
            Long l11 = it.next().first;
            if (l11 != null && l11.longValue() == j11) {
                return true;
            }
        }
        return false;
    }

    public final boolean m(long j11) {
        return v.v().getTimeInMillis() == j11;
    }

    public int n() {
        return (c() + this.f31279a.f31112e) - 1;
    }

    public int o(int i11) {
        return (i11 - c()) + 1;
    }

    public final void p(@Nullable TextView textView, long j11, int i11) {
        boolean z11;
        a aVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String d11 = d(context, j11);
        textView.setContentDescription(d11);
        boolean f11 = this.f31283e.h().f(j11);
        if (f11) {
            textView.setEnabled(true);
            z11 = k(j11);
            textView.setSelected(z11);
            aVar = z11 ? this.f31282d.f31144b : m(j11) ? this.f31282d.f31145c : this.f31282d.f31143a;
        } else {
            z11 = false;
            textView.setEnabled(false);
            aVar = this.f31282d.f31149g;
        }
        boolean z12 = z11;
        DayViewDecorator dayViewDecorator = this.f31284f;
        if (dayViewDecorator == null || i11 == -1) {
            aVar.f(textView);
            return;
        }
        Month month = this.f31279a;
        int i12 = month.f31110c;
        int i13 = month.f31109b;
        aVar.g(textView, dayViewDecorator.a(context, i12, i13, i11, f11, z12), this.f31284f.h(context, i12, i13, i11, f11, z12));
        textView.setCompoundDrawables(this.f31284f.c(context, i12, i13, i11, f11, z12), this.f31284f.e(context, i12, i13, i11, f11, z12), this.f31284f.d(context, i12, i13, i11, f11, z12), this.f31284f.b(context, i12, i13, i11, f11, z12));
        textView.setContentDescription(this.f31284f.g(context, i12, i13, i11, f11, z12, d11));
    }

    public final void q(MaterialCalendarGridView materialCalendarGridView, long j11) {
        if (Month.c(j11).equals(this.f31279a)) {
            int i11 = this.f31279a.i(j11);
            p((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().b(i11) - materialCalendarGridView.getFirstVisiblePosition()), j11, i11);
        }
    }

    public void r(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f31281c.iterator();
        while (it.hasNext()) {
            q(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.f31280b;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.m0().iterator();
            while (it2.hasNext()) {
                q(materialCalendarGridView, it2.next().longValue());
            }
            this.f31281c = this.f31280b.m0();
        }
    }

    public boolean s(int i11) {
        return i11 >= c() && i11 <= n();
    }
}
