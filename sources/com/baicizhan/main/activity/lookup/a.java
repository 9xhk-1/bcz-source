package com.baicizhan.main.activity.lookup;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.lookup.Word;
import com.baicizhan.client.business.util.CollectionUtils;
import com.baicizhan.client.business.webview.ui.SimpleWebView;
import com.baicizhan.main.activity.lookup.a;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import kc.r;
import kc.u;
import ma.l;
import ma.t;
import xb.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends Fragment {

    /* renamed from: h, reason: collision with root package name */
    public static final int f18548h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final String f18549i = "result_list";

    /* renamed from: j, reason: collision with root package name */
    public static final String f18550j = "is_history";

    /* renamed from: k, reason: collision with root package name */
    public static final String f18551k = "search_info";

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<Word> f18552a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18553b = false;

    /* renamed from: c, reason: collision with root package name */
    public SearchInfo f18554c;

    /* renamed from: d, reason: collision with root package name */
    public b f18555d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f18556e;

    /* renamed from: f, reason: collision with root package name */
    public ImageView f18557f;

    /* renamed from: g, reason: collision with root package name */
    public c f18558g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.main.activity.lookup.a$a, reason: collision with other inner class name */
    public class C0287a extends sa.c {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.main.activity.lookup.a$a$a, reason: collision with other inner class name */
        public class C0288a extends r {
            public C0288a() {
            }

            @Override // kc.r, kc.q
            public void onDialogPositiveClick(@NonNull View v11) {
                if (a.this.f18558g != null) {
                    a.this.f18558g.H();
                }
                a.this.f18552a = null;
                if (a.this.f18555d != null) {
                    a.this.f18555d.notifyDataSetChanged();
                }
                a.this.f18556e.setVisibility(8);
                a.this.f18557f.setVisibility(8);
                a.this.G(null);
            }
        }

        public C0287a() {
        }

        public final /* synthetic */ void c(DialogInterface dialogInterface) {
            if (a.this.f18558g != null) {
                a.this.f18558g.h(false);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            if (a.this.f18558g != null) {
                a.this.f18558g.h(true);
            }
            mc.a.k(a.this, ((u) new u.a(v11.getContext()).L(R.string.lookup_clear_confirm_title).U(R.string.lookup_clear_confirm_content).d()).f0(new C0288a()).B(new DialogInterface.OnDismissListener() { // from class: fe.b
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    a.C0287a.this.c(dialogInterface);
                }
            }));
            l.a(t.D, ma.a.T3);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends RecyclerView.Adapter<C0290b> {

        /* renamed from: d, reason: collision with root package name */
        public static final int f18561d = 0;

        /* renamed from: e, reason: collision with root package name */
        public static final int f18562e = 1;

        /* renamed from: f, reason: collision with root package name */
        public static final int f18563f = 2;

        /* renamed from: a, reason: collision with root package name */
        public boolean f18564a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f18565b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.main.activity.lookup.a$b$a, reason: collision with other inner class name */
        public class C0289a extends sa.c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Word f18567a;

            public C0289a(final Word val$word) {
                this.f18567a = val$word;
            }

            @Override // sa.c, android.view.View.OnClickListener
            public void onClick(View v11) {
                super.onClick(v11);
                if (a.this.f18558g != null) {
                    a.this.f18558g.V(this.f18567a, a.this.f18553b);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.main.activity.lookup.a$b$b, reason: collision with other inner class name */
        public class C0290b extends RecyclerView.ViewHolder {

            /* renamed from: a, reason: collision with root package name */
            public TextView f18569a;

            /* renamed from: b, reason: collision with root package name */
            public ImageView f18570b;

            /* renamed from: c, reason: collision with root package name */
            public View f18571c;

            /* renamed from: d, reason: collision with root package name */
            public TextView f18572d;

            /* renamed from: e, reason: collision with root package name */
            public TextView f18573e;

            /* renamed from: f, reason: collision with root package name */
            public TextView f18574f;

            /* renamed from: g, reason: collision with root package name */
            public View f18575g;

            /* renamed from: h, reason: collision with root package name */
            public SimpleWebView f18576h;

            /* renamed from: i, reason: collision with root package name */
            public int f18577i;

            /* renamed from: j, reason: collision with root package name */
            public boolean f18578j;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: com.baicizhan.main.activity.lookup.a$b$b$a, reason: collision with other inner class name */
            public class C0291a extends sa.c {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ b f18580a;

                public C0291a(final b val$this$1) {
                    this.f18580a = val$this$1;
                }

                @Override // sa.c, android.view.View.OnClickListener
                public void onClick(View v11) {
                    super.onClick(v11);
                    b.this.f18564a = !r2.f18564a;
                    b.this.notifyDataSetChanged();
                    l.a(t.D, b.this.f18564a ? "unfold_click" : ma.a.S3);
                }
            }

            public C0290b(View itemView, int viewType) {
                super(itemView);
                this.f18578j = false;
                if (viewType == 0) {
                    this.f18571c = itemView.findViewById(R.id.item);
                    this.f18572d = (TextView) itemView.findViewById(R.id.word);
                    this.f18573e = (TextView) itemView.findViewById(R.id.accent);
                    this.f18574f = (TextView) itemView.findViewById(R.id.cnmean);
                    this.f18575g = itemView.findViewById(R.id.divider);
                    return;
                }
                if (viewType == 1) {
                    this.f18569a = (TextView) itemView.findViewById(R.id.expand_text);
                    this.f18570b = (ImageView) itemView.findViewById(R.id.expand_arrow);
                    itemView.findViewById(R.id.expand_view).setOnClickListener(new C0291a(b.this));
                } else {
                    SimpleWebView simpleWebView = (SimpleWebView) itemView.findViewById(R.id.lookup_web);
                    this.f18576h = simpleWebView;
                    simpleWebView.setAspectRatio(a.this.f18554c.getAspectRatio());
                    this.f18576h.setListener(new SimpleWebView.OnLoadListener() { // from class: fe.c
                        @Override // com.baicizhan.client.business.webview.ui.SimpleWebView.OnLoadListener
                        public final void onLoaded(boolean z11) {
                            a.b.C0290b.this.m(z11);
                        }
                    });
                    this.f18576h.setUrl(a.this.getString(R.string.url_search_recommendation));
                    this.f18577i = f.a(a.this.requireContext(), 8.0f);
                }
            }

            public final /* synthetic */ void m(boolean z11) {
                if (z11) {
                    return;
                }
                this.f18576h.setAspectRatio(0.0f);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final C0290b holder, int position) {
            int itemViewType = getItemViewType(position);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) holder.f18576h.getLayoutParams();
                    marginLayoutParams.topMargin = (position == 0 || !this.f18565b) ? holder.f18577i : 0;
                    holder.f18576h.setLayoutParams(marginLayoutParams);
                    return;
                }
                holder.f18569a.setText(this.f18564a ? R.string.search_history_collapse : R.string.search_history_expand);
                holder.f18570b.setRotation(this.f18564a ? 180.0f : 0.0f);
                if (!com.baicizhan.base.a.a(a.this.getContext()) || holder.f18578j) {
                    return;
                }
                com.baicizhan.base.d.c(holder.f18569a, a.this.getContext());
                holder.f18578j = true;
                return;
            }
            if (a.this.f18552a == null || a.this.f18552a.size() <= position) {
                return;
            }
            Word word = (Word) a.this.f18552a.get(position);
            holder.f18572d.setText(word.getWord());
            holder.f18573e.setText(word.getAccent());
            holder.f18574f.setText(word.getCnmean());
            View view = holder.f18575g;
            if (!a.this.f18553b && position == a.this.f18552a.size() - 1) {
                r1 = 8;
            }
            view.setVisibility(r1);
            holder.f18571c.setOnClickListener(new C0289a(word));
            if (!com.baicizhan.base.a.a(a.this.getContext()) || holder.f18578j) {
                return;
            }
            com.baicizhan.base.d.c(holder.f18572d, a.this.getContext());
            com.baicizhan.base.d.c(holder.f18573e, a.this.getContext());
            com.baicizhan.base.d.c(holder.f18574f, a.this.getContext());
            holder.f18578j = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0290b onCreateViewHolder(ViewGroup parent, int viewType) {
            return new C0290b(LayoutInflater.from(parent.getContext()).inflate(viewType == 0 ? R.layout.lookup_result_list_item : viewType == 1 ? R.layout.item_word_plan_search_expand : R.layout.lookup_result_list_item_web, parent, false), viewType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int i11;
            int i12 = 0;
            if (a.this.f18554c == null || !a.this.f18553b) {
                if (a.this.f18552a == null || a.this.f18552a.isEmpty()) {
                    return 0;
                }
                return a.this.f18552a.size();
            }
            if (this.f18564a) {
                if (a.this.f18552a != null && !a.this.f18552a.isEmpty()) {
                    i12 = (a.this.f18553b ? 1 : 0) + a.this.f18552a.size();
                }
                i11 = a.this.f18553b;
            } else {
                if (a.this.f18552a != null && !a.this.f18552a.isEmpty()) {
                    int min = Math.min(a.this.f18552a.size(), 2);
                    if (a.this.f18553b && this.f18565b) {
                        i12 = 1;
                    }
                    i12 += min;
                }
                i11 = a.this.f18553b;
            }
            return i12 + i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            if (!a.this.f18553b || a.this.f18554c == null) {
                return 0;
            }
            if (a.this.f18552a == null || a.this.f18552a.isEmpty() || position == getItemCount() - 1) {
                return 2;
            }
            return (this.f18565b && position == getItemCount() - 2) ? 1 : 0;
        }

        public b() {
            this.f18564a = false;
            this.f18565b = false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void B();

        void H();

        void V(Word word, boolean isHistory);

        void h(boolean showing);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v11, MotionEvent event) {
            if (a.this.f18558g == null) {
                return false;
            }
            a.this.f18558g.B();
            return false;
        }

        public d() {
        }
    }

    public static a C(ArrayList<Word> resultlist, boolean isHistory, SearchInfo searchInfo) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f18549i, resultlist);
        bundle.putBoolean(f18550j, isHistory);
        bundle.putSerializable(f18551k, searchInfo);
        aVar.setArguments(bundle);
        return aVar;
    }

    public void D(ArrayList<Word> results, boolean isHistory) {
        this.f18552a = results;
        this.f18553b = isHistory;
        this.f18555d.f18565b = results != null && results.size() > 2;
        this.f18555d.notifyDataSetChanged();
        int i11 = (!this.f18553b || CollectionUtils.isEmpty(this.f18552a)) ? 8 : 0;
        this.f18556e.setVisibility(i11);
        this.f18557f.setVisibility(i11);
        F();
    }

    public final void E(int history, int expanded) {
        l.b(t.D, ma.a.P3, ma.u.b(new String[]{ma.b.f72958x0, "unfold_click"}, new String[]{history + "", expanded + ""}));
    }

    public void F() {
        G(this.f18552a);
    }

    public void G(ArrayList<Word> arrayList) {
        SearchInfo searchInfo;
        if (!this.f18553b || (searchInfo = this.f18554c) == null || searchInfo.getAspectRatio() <= 0.0f) {
            return;
        }
        E(!CollectionUtils.isEmpty(arrayList) ? 1 : 0, (arrayList == null || arrayList.size() <= 2) ? 0 : 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f18558g = (c) activity;
        } catch (ClassCastException unused) {
            qb.c.d("", "LookupResultListFragment's activity does not implement OnInteractionListener...", new Object[0]);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            savedInstanceState = getArguments();
        }
        if (savedInstanceState != null) {
            this.f18552a = savedInstanceState.getParcelableArrayList(f18549i);
            this.f18553b = savedInstanceState.getBoolean(f18550j);
            this.f18554c = (SearchInfo) savedInstanceState.getSerializable(f18551k);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_lookup_result_list, container, false);
        this.f18556e = (TextView) inflate.findViewById(R.id.history_tag);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.history_clear);
        this.f18557f = imageView;
        imageView.setOnClickListener(new C0287a());
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.lookup_result_list);
        recyclerView.setOnTouchListener(new d());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        b bVar = new b();
        this.f18555d = bVar;
        recyclerView.setAdapter(bVar);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelableArrayList(f18549i, this.f18552a);
        outState.putBoolean(f18550j, this.f18553b);
    }
}
