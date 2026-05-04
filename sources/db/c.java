package db;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.Redirector;
import com.baicizhan.client.fm.activity.ExamAudioPlayActivity;
import com.baicizhan.online.bs_users.BBRedirectInfo;
import com.baicizhan.online.bs_words.BBExam;
import com.baicizhan.online.bs_words.BBExamAudioCategory;
import com.jiongji.andriod.card.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import ma.l;
import ma.t;
import za.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends Fragment {

    /* renamed from: n, reason: collision with root package name */
    public static final String f47637n = "c";

    /* renamed from: a, reason: collision with root package name */
    public View f47638a;

    /* renamed from: b, reason: collision with root package name */
    public View f47639b;

    /* renamed from: c, reason: collision with root package name */
    public View f47640c;

    /* renamed from: d, reason: collision with root package name */
    public RecyclerView f47641d;

    /* renamed from: e, reason: collision with root package name */
    public View f47642e;

    /* renamed from: f, reason: collision with root package name */
    public RecyclerView f47643f;

    /* renamed from: g, reason: collision with root package name */
    public C0558c f47644g;

    /* renamed from: h, reason: collision with root package name */
    public e f47645h;

    /* renamed from: i, reason: collision with root package name */
    public List<BBExamAudioCategory> f47646i;

    /* renamed from: j, reason: collision with root package name */
    public List<BBExam> f47647j;

    /* renamed from: k, reason: collision with root package name */
    public int f47648k;

    /* renamed from: l, reason: collision with root package name */
    public BBRedirectInfo f47649l;

    /* renamed from: m, reason: collision with root package name */
    public i f47650m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            c.this.load();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.f47649l != null) {
                new Redirector(c.this.getActivity()).redirect(c.this.f47649l);
            }
            l.a(t.f73015n, ma.a.f72847u1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: db.c$c, reason: collision with other inner class name */
    public class C0558c extends RecyclerView.Adapter<b> {

        /* renamed from: a, reason: collision with root package name */
        public int f47653a;

        /* renamed from: b, reason: collision with root package name */
        public int f47654b = -16777216;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: db.c$c$a */
        public class a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ BBExamAudioCategory f47656a;

            public a(final BBExamAudioCategory val$category) {
                this.f47656a = val$category;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v11) {
                c.this.I(this.f47656a);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: db.c$c$b */
        public class b extends RecyclerView.ViewHolder {

            /* renamed from: a, reason: collision with root package name */
            public View f47658a;

            /* renamed from: b, reason: collision with root package name */
            public TextView f47659b;

            /* renamed from: c, reason: collision with root package name */
            public ImageView f47660c;

            public b(View itemView) {
                super(itemView);
                this.f47658a = itemView.findViewById(R.id.root);
                this.f47659b = (TextView) itemView.findViewById(R.id.name);
                this.f47660c = (ImageView) itemView.findViewById(R.id.image);
            }
        }

        public C0558c() {
            this.f47653a = c.this.getActivity().getResources().getColor(R.color.main_blue);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(b holder, int position) {
            BBExamAudioCategory bBExamAudioCategory = (BBExamAudioCategory) c.this.f47646i.get(position);
            hc.c.l(bBExamAudioCategory.getImg_url()).j(R.drawable.examination).o(holder.f47660c);
            holder.f47659b.setText(bBExamAudioCategory.getCategory_name());
            holder.f47658a.setOnClickListener(new a(bBExamAudioCategory));
            holder.f47659b.setTextColor(bBExamAudioCategory.getCategory_id() == c.this.f47648k ? this.f47653a : this.f47654b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(ViewGroup parent, int viewType) {
            return new b(LayoutInflater.from(c.this.getActivity()).inflate(R.layout.category_view, parent, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return c.this.f47646i.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements a.d<List<BBExamAudioCategory>> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<c> f47662a;

        public d(c fragment) {
            this.f47662a = new WeakReference<>(fragment);
        }

        @Override // za.a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<BBExamAudioCategory> res) {
            c cVar = this.f47662a.get();
            if (cVar == null || cVar.getActivity() == null) {
                return;
            }
            cVar.f47646i = res;
            if (cVar.f47646i.isEmpty()) {
                onError("分类列表为空");
                return;
            }
            cVar.f47638a.setVisibility(0);
            cVar.f47639b.setVisibility(4);
            cVar.f47644g.notifyDataSetChanged();
            cVar.I((BBExamAudioCategory) cVar.f47646i.get(0));
        }

        @Override // za.a.d
        public void onError(String msg) {
            c cVar = this.f47662a.get();
            if (cVar == null || cVar.getActivity() == null) {
                return;
            }
            cVar.f47638a.setVisibility(4);
            cVar.f47639b.setVisibility(0);
            va.g.i(msg, 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends RecyclerView.Adapter<b> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ BBExam f47664a;

            public a(final BBExam val$exam) {
                this.f47664a = val$exam;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v11) {
                if (c.this.f47650m != null) {
                    c.this.f47650m.A();
                }
                ExamAudioPlayActivity.w1(c.this.getActivity(), this.f47664a.getExam_id(), c.this.f47648k);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends RecyclerView.ViewHolder {

            /* renamed from: a, reason: collision with root package name */
            public TextView f47666a;

            public b(View itemView) {
                super(itemView);
                this.f47666a = (TextView) itemView.findViewById(android.R.id.text1);
            }
        }

        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(b holder, int position) {
            BBExam bBExam = (BBExam) c.this.f47647j.get(position);
            holder.f47666a.setText(bBExam.getExam_name());
            holder.f47666a.setOnClickListener(new a(bBExam));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(ViewGroup parent, int viewType) {
            return new b(LayoutInflater.from(c.this.getActivity()).inflate(R.layout.exam_item, parent, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return c.this.f47647j.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements a.d<List<BBExam>> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<c> f47668a;

        public f(c fragment) {
            this.f47668a = new WeakReference<>(fragment);
        }

        @Override // za.a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<BBExam> res) {
            c cVar = this.f47668a.get();
            if (cVar == null || cVar.getActivity() == null) {
                return;
            }
            cVar.f47640c.setVisibility(8);
            cVar.f47647j = res;
            cVar.f47645h.notifyDataSetChanged();
        }

        @Override // za.a.d
        public void onError(String msg) {
            c cVar = this.f47668a.get();
            if (cVar == null || cVar.getActivity() == null) {
                return;
            }
            cVar.f47640c.setVisibility(8);
            cVar.f47639b.setVisibility(0);
            va.g.i("无法获取试卷列表, 请在稳定的网络下重试", 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends RecyclerView.ItemDecoration {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f47669a;

        public g() {
            this.f47669a = new ColorDrawable(c.this.getResources().getColor(R.color.C6));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            if (parent.getChildAdapterPosition(view) != parent.getAdapter().getItemCount() - 1) {
                outRect.bottom = 1;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(Canvas c11, RecyclerView parent, RecyclerView.State state) {
            super.onDraw(c11, parent, state);
            int paddingLeft = parent.getPaddingLeft();
            int width = parent.getWidth() - parent.getPaddingRight();
            int childCount = parent.getChildCount();
            for (int i11 = 0; i11 < childCount - 1; i11++) {
                View childAt = parent.getChildAt(i11);
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                this.f47669a.setBounds(paddingLeft, bottom, width, bottom + 1);
                this.f47669a.draw(c11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends RecyclerView.ItemDecoration {

        /* renamed from: a, reason: collision with root package name */
        public final int f47671a;

        public h(int space) {
            this.f47671a = space;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            if (parent.getChildAdapterPosition(view) != parent.getAdapter().getItemCount() - 1) {
                outRect.right = this.f47671a;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface i {
        void A();
    }

    private View initView(View rt2) {
        this.f47638a = rt2.findViewById(R.id.data_container);
        View findViewById = rt2.findViewById(R.id.err_msg);
        this.f47639b = findViewById;
        findViewById.setOnClickListener(new a());
        this.f47640c = rt2.findViewById(R.id.load_progress);
        this.f47641d = (RecyclerView) rt2.findViewById(R.id.category_list);
        this.f47643f = (RecyclerView) rt2.findViewById(R.id.exam_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(0);
        this.f47641d.setLayoutManager(linearLayoutManager);
        this.f47641d.addItemDecoration(new h(getResources().getDimensionPixelSize(R.dimen.fm_exam_books_padding)));
        this.f47641d.setAdapter(this.f47644g);
        this.f47643f.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f47643f.setAdapter(this.f47645h);
        View findViewById2 = rt2.findViewById(R.id.buy);
        this.f47642e = findViewById2;
        findViewById2.setOnClickListener(new b());
        load();
        return rt2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void load() {
        if (this.f47646i.isEmpty()) {
            this.f47638a.setVisibility(4);
            this.f47639b.setVisibility(8);
            this.f47640c.setVisibility(0);
            za.a.k().l(f47637n, new d(this));
        }
    }

    public final void I(final BBExamAudioCategory category) {
        this.f47640c.setVisibility(0);
        this.f47648k = category.getCategory_id();
        this.f47644g.notifyDataSetChanged();
        BBRedirectInfo mall_info = category.getMall_info();
        this.f47649l = mall_info;
        this.f47642e.setVisibility(mall_info == null ? 8 : 0);
        za.a.k().p(f47637n, this.f47648k, new f(this));
        List<BBExam> list = this.f47647j;
        if (list != null) {
            list.clear();
        }
        this.f47645h.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f47650m = (i) activity;
        } catch (ClassCastException e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f47644g = new C0558c();
        this.f47645h = new e();
        this.f47646i = new ArrayList();
        this.f47647j = new ArrayList();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return initView(inflater.inflate(R.layout.fragment_select_exam, container, false));
    }
}
