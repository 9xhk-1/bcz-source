package db;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.baicizhan.client.business.util.ColorStateListUtils;
import com.baicizhan.client.business.util.StoreEntryJumper;
import com.baicizhan.client.fm.activity.ReadingPlanPlayActivity;
import com.baicizhan.online.bs_words.BBReadingPlan;
import com.jiongji.andriod.card.R;
import i9.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import va.g;
import za.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends Fragment implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public String f47617a = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    public List<BBReadingPlan> f47618b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public GridView f47619c;

    /* renamed from: d, reason: collision with root package name */
    public b f47620d;

    /* renamed from: e, reason: collision with root package name */
    public View f47621e;

    /* renamed from: f, reason: collision with root package name */
    public View f47622f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f47623g;

    /* renamed from: h, reason: collision with root package name */
    public View f47624h;

    /* renamed from: i, reason: collision with root package name */
    public View f47625i;

    /* renamed from: j, reason: collision with root package name */
    public c f47626j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: db.a$a, reason: collision with other inner class name */
    public class C0555a implements AdapterView.OnItemClickListener {
        public C0555a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> parent, View view, int position, long id2) {
            if (a.this.f47626j != null) {
                a.this.f47626j.g0();
            }
            ReadingPlanPlayActivity.w1(a.this.getActivity(), (int) id2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends BaseAdapter {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: db.a$b$a, reason: collision with other inner class name */
        public class C0556a {

            /* renamed from: a, reason: collision with root package name */
            public ImageView f47629a;

            /* renamed from: b, reason: collision with root package name */
            public TextView f47630b;

            /* renamed from: c, reason: collision with root package name */
            public TextView f47631c;

            /* renamed from: d, reason: collision with root package name */
            public TextView f47632d;

            public C0556a() {
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return a.this.f47618b.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int position) {
            return a.this.f47618b.get(position);
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return ((BBReadingPlan) a.this.f47618b.get(position)).getPlan_id();
        }

        @Override // android.widget.Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(a.this.getActivity()).inflate(R.layout.book_view, parent, false);
                C0556a c0556a = new C0556a();
                c0556a.f47629a = (ImageView) convertView.findViewById(R.id.image);
                c0556a.f47630b = (TextView) convertView.findViewById(R.id.name);
                c0556a.f47631c = (TextView) convertView.findViewById(R.id.level);
                c0556a.f47632d = (TextView) convertView.findViewById(R.id.play_time);
                convertView.setTag(c0556a);
            }
            C0556a c0556a2 = (C0556a) convertView.getTag();
            BBReadingPlan bBReadingPlan = (BBReadingPlan) getItem(position);
            hc.c.l(bBReadingPlan.getImg_url()).j(R.drawable.readplan).o(c0556a2.f47629a);
            c0556a2.f47630b.setText(bBReadingPlan.getPlan_name());
            c0556a2.f47631c.setText("级别: " + bBReadingPlan.getPlan_level());
            if (bBReadingPlan.getPlay_times() >= 10000) {
                c0556a2.f47632d.setText(String.format(" %.1f万", Double.valueOf(bBReadingPlan.getPlay_times() / 10000.0d)));
                return convertView;
            }
            c0556a2.f47632d.setText(" " + bBReadingPlan.getPlay_times());
            return convertView;
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void g0();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements b.c<List<BBReadingPlan>> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<a> f47634a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: db.a$d$a, reason: collision with other inner class name */
        public class C0557a implements Comparator<BBReadingPlan> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f47635a;

            public C0557a(final a val$fragment) {
                this.f47635a = val$fragment;
            }

            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(BBReadingPlan lhs, BBReadingPlan rhs) {
                return f.d(this.f47635a.getActivity(), f.h(f.Z, "" + rhs.getPlan_id())) - f.d(this.f47635a.getActivity(), f.h(f.Z, "" + lhs.getPlan_id()));
            }
        }

        public d(a fragment) {
            this.f47634a = new WeakReference<>(fragment);
        }

        @Override // za.b.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<BBReadingPlan> res) {
            a aVar = this.f47634a.get();
            if (aVar == null || aVar.getActivity() == null) {
                return;
            }
            aVar.f47618b = res;
            Collections.sort(aVar.f47618b, new C0557a(aVar));
            aVar.f47620d.notifyDataSetChanged();
            aVar.f47625i.setVisibility(8);
        }

        @Override // za.b.c
        public void onError(String msg) {
            a aVar = this.f47634a.get();
            if (aVar == null || aVar.getActivity() == null) {
                return;
            }
            g.i(msg, 0);
            aVar.f47625i.setVisibility(8);
            aVar.f47618b = new ArrayList();
            aVar.f47624h.setVisibility(0);
            aVar.f47619c.setVisibility(4);
            aVar.f47620d.notifyDataSetChanged();
        }
    }

    private void load() {
        za.b j11 = za.b.j();
        this.f47624h.setVisibility(8);
        this.f47625i.setVisibility(0);
        this.f47619c.setVisibility(0);
        j11.k(this.f47617a, new d(this));
    }

    public final void B() {
        View view = this.f47622f;
        view.setVisibility(view.getVisibility() == 8 ? 0 : 8);
    }

    public final View initView(View rt2) {
        GridView gridView = (GridView) rt2.findViewById(R.id.book_grid);
        this.f47619c = gridView;
        b bVar = new b();
        this.f47620d = bVar;
        gridView.setAdapter((ListAdapter) bVar);
        this.f47619c.setOnItemClickListener(new C0555a());
        View findViewById = rt2.findViewById(R.id.help);
        this.f47621e = findViewById;
        findViewById.setOnClickListener(this);
        View findViewById2 = rt2.findViewById(R.id.man);
        this.f47622f = findViewById2;
        findViewById2.setOnClickListener(this);
        View findViewById3 = rt2.findViewById(R.id.err_msg);
        this.f47624h = findViewById3;
        findViewById3.setOnClickListener(this);
        this.f47625i = rt2.findViewById(R.id.load_progress);
        TextView textView = (TextView) rt2.findViewById(R.id.store);
        this.f47623g = textView;
        textView.setTextColor(ColorStateListUtils.getSimpleThemeColorStateListWithAttr(getActivity(), R.attr.color_blue_btn, R.attr.color_blue_btn_pressed));
        this.f47623g.setOnClickListener(this);
        load();
        return rt2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f47626j = (c) activity;
        } catch (ClassCastException e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        if (v11 == this.f47621e || v11 == this.f47622f) {
            B();
        } else if (v11 == this.f47623g) {
            StoreEntryJumper.getInstance().jump(getActivity(), "app_reading_plan");
        } else if (v11 == this.f47624h) {
            load();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return initView(inflater.inflate(R.layout.fragment_book_list, container, false));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.baicizhan.client.business.thrift.c.b().b(this.f47617a);
    }
}
