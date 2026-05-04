package ye;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.CollectionUtils;
import com.baicizhan.client.business.util.FileUtils;
import com.baicizhan.main.activity.setting.offlineclear.ClearItem;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kc.o;
import kc.r;
import kc.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends Fragment {

    /* renamed from: k, reason: collision with root package name */
    public static final String f99891k = "ClearItemFragment";

    /* renamed from: l, reason: collision with root package name */
    public static final String f99892l = "clear_item";

    /* renamed from: a, reason: collision with root package name */
    public View f99893a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f99894b;

    /* renamed from: c, reason: collision with root package name */
    public h f99895c;

    /* renamed from: d, reason: collision with root package name */
    public ClearItem f99896d;

    /* renamed from: e, reason: collision with root package name */
    public List<ClearItem> f99897e;

    /* renamed from: f, reason: collision with root package name */
    public qb0.h f99898f;

    /* renamed from: g, reason: collision with root package name */
    public qb0.h f99899g;

    /* renamed from: h, reason: collision with root package name */
    public qb0.h f99900h;

    /* renamed from: i, reason: collision with root package name */
    public va.f f99901i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f99902j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ye.b$b, reason: collision with other inner class name */
    public class C1362b extends RecyclerView.ItemDecoration {
        public C1362b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            if (parent.getChildAdapterPosition(view) == 0) {
                outRect.top = xb.f.a(b.this.getContext(), 24.0f);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends qb0.g<List<ClearItem>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f99905a;

        public c(final boolean val$withLoading) {
            this.f99905a = val$withLoading;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.d(b.f99891k, "computeSize failed. " + e11, new Object[0]);
            if (b.this.getActivity() == null || b.this.getActivity().isFinishing()) {
                return;
            }
            if (this.f99905a && b.this.f99901i != null) {
                b.this.f99901i.dismiss();
            }
            va.g.g(R.string.base_toast_failed, 0);
        }

        @Override // qb0.g
        public void onStart() {
            if (!this.f99905a || b.this.f99901i == null) {
                return;
            }
            b.this.f99901i.show();
        }

        @Override // qb0.c
        public void onNext(List<ClearItem> clearItem) {
            if (b.this.getActivity() == null || b.this.getActivity().isFinishing()) {
                return;
            }
            if (this.f99905a && b.this.f99901i != null) {
                b.this.f99901i.dismiss();
            }
            b.this.L();
            b.this.f99895c.notifyDataSetChanged();
            b.this.O();
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends r {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ClearItem f99907a;

        public d(final ClearItem val$item) {
            this.f99907a = val$item;
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View v11) {
            b.this.K(this.f99907a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends qb0.g<Boolean> {
        public e() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.d(b.f99891k, "doClearItem failed. " + e11, new Object[0]);
            if (b.this.getActivity() == null) {
                return;
            }
            b.this.f99901i.dismiss();
            va.g.g(R.string.oc_clear_error, 0);
            b.this.H();
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            if (b.this.getActivity() == null) {
                return;
            }
            b.this.f99901i.dismiss();
            if (aBoolean == null || !aBoolean.booleanValue()) {
                va.g.g(R.string.oc_clear_failed, 0);
            } else {
                va.g.g(R.string.oc_clear_success, 0);
                b.this.f99902j = true;
            }
            b.this.H();
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends r {
        public f() {
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View v11) {
            b.this.J();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends qb0.g<Boolean> {
        public g() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.d(b.f99891k, "doClearAll failed. " + e11, new Object[0]);
            if (b.this.getActivity() == null) {
                return;
            }
            b.this.f99901i.dismiss();
            va.g.g(R.string.oc_clear_error, 0);
            b.this.H();
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            if (b.this.getActivity() == null) {
                return;
            }
            b.this.f99901i.dismiss();
            if (aBoolean == null || !aBoolean.booleanValue()) {
                va.g.g(R.string.oc_clear_failed, 0);
            } else {
                va.g.g(R.string.oc_clear_success, 0);
                b.this.f99902j = true;
            }
            b.this.H();
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: c, reason: collision with root package name */
        public static final int f99912c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f99913d = 2;

        /* renamed from: a, reason: collision with root package name */
        public long f99914a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends sa.c {
            public a() {
            }

            @Override // sa.c, android.view.View.OnClickListener
            public void onClick(View v11) {
                super.onClick(v11);
                b.this.F();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: ye.b$h$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC1363b implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ClearItem f99917a;

            public ViewOnClickListenerC1363b(final ClearItem val$clearItem) {
                this.f99917a = val$clearItem;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v11) {
                if (SystemClock.elapsedRealtime() - h.this.f99914a < 1000) {
                    return;
                }
                h.this.f99914a = SystemClock.elapsedRealtime();
                b.this.G(this.f99917a);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class c extends RecyclerView.ViewHolder {

            /* renamed from: a, reason: collision with root package name */
            public TextView f99919a;

            public c(TextView itemView) {
                super(itemView);
                this.f99919a = itemView;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class d extends RecyclerView.ViewHolder {

            /* renamed from: a, reason: collision with root package name */
            public View f99921a;

            /* renamed from: b, reason: collision with root package name */
            public TextView f99922b;

            /* renamed from: c, reason: collision with root package name */
            public TextView f99923c;

            /* renamed from: d, reason: collision with root package name */
            public View f99924d;

            public d(View itemView) {
                super(itemView);
                this.f99921a = itemView.findViewById(R.id.item);
                this.f99922b = (TextView) itemView.findViewById(R.id.name);
                this.f99923c = (TextView) itemView.findViewById(R.id.size);
                this.f99924d = itemView.findViewById(R.id.divider);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (b.this.f99897e == null) {
                return 0;
            }
            return b.this.f99897e.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            return position == b.this.f99897e.size() ? 1 : 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            if (holder instanceof c) {
                holder.itemView.setOnClickListener(new a());
                return;
            }
            if (holder instanceof d) {
                ClearItem clearItem = (ClearItem) b.this.f99897e.get(position);
                d dVar = (d) holder;
                dVar.f99922b.setText(clearItem.name);
                TextView textView = dVar.f99923c;
                long j11 = clearItem.size;
                textView.setText(j11 < 0 ? b.this.getResources().getString(R.string.oc_computing_size) : FileUtils.byteCountToDisplaySize(j11));
                dVar.f99921a.setOnClickListener(new ViewOnClickListenerC1363b(clearItem));
                if (CollectionUtils.isEmpty(b.this.f99897e)) {
                    return;
                }
                dVar.f99924d.setVisibility(position == b.this.f99897e.size() + (-1) ? 8 : 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            if (viewType != 1) {
                return new d(LayoutInflater.from(parent.getContext()).inflate(R.layout.clear_item_list_item, parent, false));
            }
            TextView textView = new TextView(b.this.getContext());
            textView.setTextSize(16.0f);
            textView.setTextColor(-1425344);
            TypedValue typedValue = new TypedValue();
            b.this.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
            textView.setBackground(b.this.getContext().getTheme().obtainStyledAttributes(typedValue.resourceId, new int[]{android.R.attr.selectableItemBackground}).getDrawable(0));
            textView.setGravity(17);
            textView.setLayoutParams(new RecyclerView.LayoutParams(-1, xb.f.a(b.this.getContext(), 64.0f)));
            textView.setText(R.string.oc_clear_all);
            return new c(textView);
        }

        public h() {
            this.f99914a = 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        mc.a.l(this, ((u) new u.a(requireContext()).V(getString(R.string.oc_ask_if_clear_all_message, this.f99896d.name)).d()).f0(new f()), "clear-all");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(final ClearItem item) {
        mc.a.l(this, ((u) new u.a(requireContext()).V(getString(R.string.oc_ask_if_clear_item_message, item.name)).d()).f0(new d(item)), o.N);
    }

    public final void H() {
        I(false);
    }

    public final void I(boolean withLoading) {
        qb0.h hVar = this.f99898f;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f99898f.unsubscribe();
        }
        ClearItem clearItem = this.f99896d;
        this.f99898f = ye.d.g(clearItem == null ? null : CollectionUtils.isEmpty(clearItem.childItems) ? Collections.singletonList(this.f99896d) : this.f99896d.childItems).I3(tb0.a.a()).r5(new c(withLoading));
    }

    public final void J() {
        P();
        this.f99901i.show();
        this.f99900h = ye.d.f(this.f99897e).I3(tb0.a.a()).r5(new g());
    }

    public final void K(ClearItem item) {
        P();
        this.f99901i.show();
        this.f99899g = ye.d.e(item).I3(tb0.a.a()).r5(new e());
    }

    public final void L() {
        M();
        ClearItem clearItem = this.f99896d;
        if (clearItem == null) {
            this.f99897e = null;
        } else {
            List<ClearItem> list = clearItem.childItems;
            if (list == null || list.isEmpty()) {
                this.f99897e = Collections.singletonList(this.f99896d);
            } else {
                this.f99897e = this.f99896d.childItems;
            }
        }
        M();
    }

    public final void M() {
        if (this.f99897e == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f99897e.size());
        for (ClearItem clearItem : this.f99897e) {
            if (clearItem.size != 0) {
                arrayList.add(clearItem);
            }
        }
        this.f99897e = arrayList;
    }

    public final void N() {
        ClearItem clearItem = this.f99896d;
        if (clearItem != null) {
            clearItem.reset();
            List<ClearItem> list = this.f99896d.childItems;
            if (list != null) {
                Iterator<ClearItem> it = list.iterator();
                while (it.hasNext()) {
                    it.next().reset();
                }
            }
        }
    }

    public final void O() {
        List<ClearItem> list = this.f99897e;
        if (list == null || list.isEmpty()) {
            this.f99893a.setVisibility(0);
            this.f99894b.setVisibility(8);
        } else {
            this.f99893a.setVisibility(8);
            this.f99894b.setVisibility(0);
        }
    }

    public final void P() {
        qb0.h hVar = this.f99898f;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f99898f.unsubscribe();
        }
        qb0.h hVar2 = this.f99899g;
        if (hVar2 != null && !hVar2.isUnsubscribed()) {
            this.f99899g.unsubscribe();
        }
        qb0.h hVar3 = this.f99900h;
        if (hVar3 == null || hVar3.isUnsubscribed()) {
            return;
        }
        this.f99900h.unsubscribe();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f99896d = getArguments() != null ? (ClearItem) getArguments().getParcelable(f99892l) : null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_clear_item, container, false);
        inflate.setOnClickListener(new a());
        this.f99893a = inflate.findViewById(R.id.empty);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.clear_item_list);
        this.f99894b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f99894b.addItemDecoration(new C1362b());
        h hVar = new h();
        this.f99895c = hVar;
        this.f99894b.setAdapter(hVar);
        O();
        va.f fVar = new va.f(getActivity());
        this.f99901i = fVar;
        fVar.setCancelable(false);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        P();
        if (this.f99902j) {
            i80.c.f().q(new ah.a());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        N();
        I(true);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }
}
