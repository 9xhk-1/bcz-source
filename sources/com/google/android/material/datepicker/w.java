package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.datepicker.j;
import com.google.android.material.timepicker.TimeModel;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class w extends RecyclerView.Adapter<b> {

    /* renamed from: a, reason: collision with root package name */
    public final j<?> f31302a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f31303a;

        public a(int i11) {
            this.f31303a = i11;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.this.f31302a.Q(w.this.f31302a.H().g(Month.b(this.f31303a, w.this.f31302a.J().f31109b)));
            w.this.f31302a.R(j.l.DAY);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f31305a;

        public b(TextView textView) {
            super(textView);
            this.f31305a = textView;
        }
    }

    public w(j<?> jVar) {
        this.f31302a = jVar;
    }

    @NonNull
    public final View.OnClickListener c(int i11) {
        return new a(i11);
    }

    public int d(int i11) {
        return i11 - this.f31302a.H().o().f31110c;
    }

    public int f(int i11) {
        return this.f31302a.H().o().f31110c + i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull b bVar, int i11) {
        int f11 = f(i11);
        bVar.f31305a.setText(String.format(Locale.getDefault(), TimeModel.f32588i, Integer.valueOf(f11)));
        TextView textView = bVar.f31305a;
        textView.setContentDescription(h.k(textView.getContext(), f11));
        com.google.android.material.datepicker.b I = this.f31302a.I();
        Calendar v11 = v.v();
        com.google.android.material.datepicker.a aVar = v11.get(1) == f11 ? I.f31148f : I.f31146d;
        Iterator<Long> it = this.f31302a.w().m0().iterator();
        while (it.hasNext()) {
            v11.setTimeInMillis(it.next().longValue());
            if (v11.get(1) == f11) {
                aVar = I.f31147e;
            }
        }
        aVar.f(bVar.f31305a);
        bVar.f31305a.setOnClickListener(c(f11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f31302a.H().r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i11) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
