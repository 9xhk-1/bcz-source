package com.baicizhan.main.activity.calendar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.main.customview.calendar.CalendarView;
import com.baicizhan.main.wikiv2.lookup.WordWikiActivity;
import com.baicizhan.main.wikiv2.studyv2.StudyWikiV2Activity;
import com.baicizhan.main.wikiv2.studyv2.data.v0;
import com.baicizhan.online.user_study_api.CalendarDailyWord;
import gs.jj;
import gs.lj;
import gs.nj;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import ld.g;
import ld.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: c, reason: collision with root package name */
    public static final int f18315c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f18316d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f18317e = 2;

    /* renamed from: a, reason: collision with root package name */
    public List<CalendarDailyWord> f18318a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public g f18319b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.main.activity.calendar.a$a, reason: collision with other inner class name */
    public class C0283a implements CalendarView.g {
        public C0283a() {
        }

        @Override // com.baicizhan.main.customview.calendar.CalendarView.g
        public void a(Calendar calendar) {
            l f11 = a.this.f18319b.f();
            if (f11 != null) {
                f11.q(calendar);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public jj f18321a;

        public b(jj binding) {
            super(binding.getRoot());
            this.f18321a = binding;
        }

        public jj b() {
            return this.f18321a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public lj f18322a;

        public c(lj binding) {
            super(binding.getRoot());
            this.f18322a = binding;
        }

        public final lj b() {
            return this.f18322a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public nj f18323a;

        public d(nj binding) {
            super(binding.getRoot());
            this.f18323a = binding;
        }

        public final nj b() {
            return this.f18323a;
        }
    }

    public static /* synthetic */ void b(CalendarDailyWord calendarDailyWord, View view) {
        if (v0.f26118a.b()) {
            StudyWikiV2Activity.O0(view.getContext(), calendarDailyWord.topic_id, calendarDailyWord.getWord_level_id());
        } else {
            WordWikiActivity.N0(view.getContext(), calendarDailyWord.topic_id, calendarDailyWord.getWord_level_id());
        }
    }

    public final void d(final b headItemHolder) {
        headItemHolder.f18321a.f55520f.setTitleVisibility(8);
        headItemHolder.f18321a.j(this.f18319b.f());
        headItemHolder.f18321a.f55520f.setOnItemClick(new C0283a());
    }

    public final void f(d holder, int pos) {
        final CalendarDailyWord calendarDailyWord = this.f18318a.get(h(pos));
        holder.b().m(calendarDailyWord.word);
        holder.b().n(calendarDailyWord.mean);
        holder.b().o(new View.OnClickListener() { // from class: ld.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.baicizhan.main.activity.calendar.a.b(CalendarDailyWord.this, view);
            }
        });
        holder.b().p(true);
        holder.b().executePendingBindings();
    }

    public final void g(c holder) {
        holder.b().j(this.f18319b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f18318a.size() + 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        }
        return position == this.f18318a.size() + 1 ? 1 : 2;
    }

    public final int h(int pos) {
        return pos - 1;
    }

    public void i(List<CalendarDailyWord> calendarDailyWordList) {
        this.f18318a.clear();
        this.f18318a.addAll(calendarDailyWordList);
        notifyDataSetChanged();
    }

    public void j(g viewModel) {
        this.f18319b = viewModel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == 0) {
            d((b) holder);
        } else if (getItemViewType(position) == 1) {
            g((c) holder);
        } else {
            f((d) holder, position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        return viewType == 0 ? new b(jj.g(from, parent, false)) : 1 == viewType ? new c(lj.g(from, parent, false)) : new d(nj.j(from, parent, false));
    }
}
