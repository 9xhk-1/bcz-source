package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.datepicker.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class q extends RecyclerView.Adapter<b> {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final CalendarConstraints f31285a;

    /* renamed from: b, reason: collision with root package name */
    public final DateSelector<?> f31286b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public final DayViewDecorator f31287c;

    /* renamed from: d, reason: collision with root package name */
    public final j.m f31288d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31289e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MaterialCalendarGridView f31290a;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.f31290a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
            if (this.f31290a.getAdapter().s(i11)) {
                q.this.f31288d.a(this.f31290a.getAdapter().getItem(i11).longValue());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f31292a;

        /* renamed from: b, reason: collision with root package name */
        public final MaterialCalendarGridView f31293b;

        public b(@NonNull LinearLayout linearLayout, boolean z11) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f31292a = textView;
            ViewCompat.setAccessibilityHeading(textView, true);
            this.f31293b = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z11) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public q(@NonNull Context context, DateSelector<?> dateSelector, @NonNull CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator, j.m mVar) {
        Month o11 = calendarConstraints.o();
        Month i11 = calendarConstraints.i();
        Month m11 = calendarConstraints.m();
        if (o11.compareTo(m11) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (m11.compareTo(i11) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f31289e = (p.f31276g * j.K(context)) + (l.S(context) ? j.K(context) : 0);
        this.f31285a = calendarConstraints;
        this.f31286b = dateSelector;
        this.f31287c = dayViewDecorator;
        this.f31288d = mVar;
        setHasStableIds(true);
    }

    @NonNull
    public Month c(int i11) {
        return this.f31285a.o().m(i11);
    }

    @NonNull
    public CharSequence d(int i11) {
        return c(i11).k();
    }

    public int f(@NonNull Month month) {
        return this.f31285a.o().o(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull b bVar, int i11) {
        Month m11 = this.f31285a.o().m(i11);
        bVar.f31292a.setText(m11.k());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f31293b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !m11.equals(materialCalendarGridView.getAdapter().f31279a)) {
            p pVar = new p(m11, this.f31286b, this.f31285a, this.f31287c);
            materialCalendarGridView.setNumColumns(m11.f31111d);
            materialCalendarGridView.setAdapter((ListAdapter) pVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().r(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f31285a.l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i11) {
        return this.f31285a.o().m(i11).l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i11) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!l.S(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f31289e));
        return new b(linearLayout, true);
    }
}
