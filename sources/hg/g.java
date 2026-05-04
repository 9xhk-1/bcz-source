package hg;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.report.ExposureConstraintLayout;
import com.baicizhan.client.business.util.report.RecyclerViewExposureHelper;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.client.business.widget.RedDotImageView;
import com.baicizhan.client.friend.model.DiscoveryAppItem;
import com.baicizhan.main.activity.discovery.FriendsActivity;
import com.jiongji.andriod.card.R;
import gs.j8;
import gs.yd;
import hg.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class g extends hg.a {

    /* renamed from: m, reason: collision with root package name */
    public static final String f59257m = "g";

    /* renamed from: n, reason: collision with root package name */
    public static final String f59258n = "tab_index";

    /* renamed from: c, reason: collision with root package name */
    public j8 f59259c;

    /* renamed from: d, reason: collision with root package name */
    public f f59260d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f59261e = true;

    /* renamed from: f, reason: collision with root package name */
    public e f59262f = null;

    /* renamed from: g, reason: collision with root package name */
    public qb0.h f59263g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f59264h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f59265i;

    /* renamed from: j, reason: collision with root package name */
    public bh.c f59266j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f59267k;

    /* renamed from: l, reason: collision with root package name */
    public LifecycleRegistry f59268l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends RecyclerView.ItemDecoration {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f59270a;

        public b(final int val$bottomMargin) {
            this.f59270a = val$bottomMargin;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            if (parent.getChildAdapterPosition(view) >= ((state.getItemCount() - 1) / 2) * 2) {
                outRect.bottom = this.f59270a;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements View.OnScrollChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerViewExposureHelper f59272a;

        public c(final RecyclerViewExposureHelper val$helper) {
            this.f59272a = val$helper;
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i11, int i12, int i22, int i32) {
            this.f59272a.onScroll();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends sa.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f59274a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f59275b;

        public d(final e val$banner, final Map val$param) {
            this.f59274a = val$banner;
            this.f59275b = val$param;
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            if (TextUtils.isEmpty(this.f59274a.f59278b)) {
                return;
            }
            BczWebExecutorKt.startNormalWeb(g.this.getContext(), this.f59274a.f59278b);
            ma.l.e(ma.t.f73020s, ma.a.f72708a2, this.f59275b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public String f59277a;

        /* renamed from: b, reason: collision with root package name */
        public String f59278b;

        /* renamed from: c, reason: collision with root package name */
        public long f59279c;

        /* renamed from: d, reason: collision with root package name */
        public long f59280d;

        /* renamed from: e, reason: collision with root package name */
        public String f59281e;

        public boolean a() {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            return this.f59279c <= currentTimeMillis && this.f59280d >= currentTimeMillis;
        }

        public e() {
            this.f59279c = 0L;
            this.f59280d = 0L;
            this.f59281e = "";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends RecyclerView.Adapter<C0673g> {

        /* renamed from: a, reason: collision with root package name */
        public List<DiscoveryAppItem> f59282a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public List<DiscoveryAppItem> f59283b = new ArrayList();

        public f(List<DiscoveryAppItem> items) {
            this.f59282a.addAll(items);
            this.f59283b.addAll(items);
            g.this.f59266j.f6822c.observe(g.this.getActivity(), new Observer() { // from class: hg.h
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    g.f.this.d((SparseBooleanArray) obj);
                }
            });
        }

        public final /* synthetic */ void d(SparseBooleanArray sparseBooleanArray) {
            if (sparseBooleanArray != null && sparseBooleanArray.get(2)) {
                for (DiscoveryAppItem discoveryAppItem : this.f59282a) {
                    if (discoveryAppItem.statTag.equalsIgnoreCase(DiscoveryAppItem.TAG_ZHANJIA)) {
                        discoveryAppItem.hasNew = DiscoveryAppItem.checkNewOfZhanjia();
                    }
                }
            }
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C0673g holder, int position) {
            DiscoveryAppItem discoveryAppItem = this.f59282a.get(position);
            ((ExposureConstraintLayout) holder.itemView).setExposureData(discoveryAppItem);
            holder.f59285a.f57594c.setText(discoveryAppItem.title);
            holder.f59285a.f57592a.setText(discoveryAppItem.subtitle);
            int i11 = discoveryAppItem.iconRes;
            if (i11 != 0) {
                holder.f59285a.f57595d.setImageResource(i11);
            } else if (!TextUtils.isEmpty(discoveryAppItem.iconUrl)) {
                hc.c.l(discoveryAppItem.iconUrl).o(holder.f59285a.f57595d);
            }
            holder.f59285a.f57593b.setVisibility(discoveryAppItem.hasNew ? 0 : 8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0673g onCreateViewHolder(ViewGroup parent, int viewType) {
            g gVar = g.this;
            return gVar.new C0673g(LayoutInflater.from(gVar.getContext()).inflate(R.layout.item_discovery_widget, parent, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<DiscoveryAppItem> list = this.f59282a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public void h(List<DiscoveryAppItem> items) {
            if (this.f59282a.size() == items.size() + this.f59283b.size() && this.f59282a.containsAll(items)) {
                qb.c.i(g.f59257m, "nothing change", new Object[0]);
                return;
            }
            qb.c.i(g.f59257m, "update discovery items %d", Integer.valueOf(items.size()));
            this.f59282a.clear();
            this.f59282a.addAll(this.f59283b);
            this.f59282a.addAll(items);
            notifyDataSetChanged();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: hg.g$g, reason: collision with other inner class name */
    public class C0673g extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public yd f59285a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: hg.g$g$a */
        public class a extends sa.c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f59287a;

            public a(final g val$this$0) {
                this.f59287a = val$this$0;
            }

            @Override // sa.c, android.view.View.OnClickListener
            public void onClick(View v11) {
                Intent b11;
                super.onClick(v11);
                int adapterPosition = C0673g.this.getAdapterPosition();
                if (adapterPosition < 0 || adapterPosition > g.this.f59260d.f59282a.size() - 1) {
                    return;
                }
                DiscoveryAppItem discoveryAppItem = (DiscoveryAppItem) g.this.f59260d.f59282a.get(adapterPosition);
                if (discoveryAppItem.jumpTo != null) {
                    if (!discoveryAppItem.statTag.equalsIgnoreCase(ma.a.M2) || (b11 = gi.w.b(g.this.getContext())) == null) {
                        discoveryAppItem.jumpTo.jumpto(g.this.getContext(), discoveryAppItem, null);
                    } else {
                        try {
                            b11.setFlags(268435456);
                            g.this.startActivity(b11);
                        } catch (Exception e11) {
                            qb.c.d(g.f59257m, "DiscoveryWidgetHolder item click: " + e11, new Object[0]);
                            discoveryAppItem.jumpTo.jumpto(g.this.getContext(), discoveryAppItem, null);
                        }
                    }
                    if (discoveryAppItem.hasNew) {
                        g.this.f59266j.k(4);
                        discoveryAppItem.hasNew = false;
                        g.this.f59260d.notifyItemChanged(adapterPosition);
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("id", "1");
                    hashMap.put("tag", discoveryAppItem.statTag);
                    hashMap.put("adv_id", discoveryAppItem.statTag);
                    hashMap.put("idx", Integer.valueOf(adapterPosition + 1));
                    ma.l.e(ma.t.f73020s, ma.a.W1, hashMap);
                }
            }
        }

        public C0673g(View itemView) {
            super(itemView);
            this.f59285a = (yd) DataBindingUtil.bind(itemView);
            itemView.setOnClickListener(new a(g.this));
        }
    }

    public g() {
        Boolean bool = Boolean.FALSE;
        this.f59264h = bool;
        this.f59265i = bool;
        this.f59267k = false;
        this.f59268l = new LifecycleRegistry(this);
    }

    private void J() {
        this.f59266j.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(Boolean bool) {
        this.f59264h = bool;
        P();
    }

    public static g O() {
        return new g();
    }

    public final void I() {
        try {
            y9.e f11 = y9.e.f();
            if (f11.e(y9.c.f99694b)) {
                this.f59262f = new e();
                if (f11.d(y9.c.f99694b, "duration")) {
                    List list = (List) f11.c(y9.c.f99694b, "duration");
                    this.f59262f.f59279c = ((Double) list.get(0)).longValue();
                    this.f59262f.f59280d = ((Double) list.get(1)).longValue();
                }
                this.f59262f.f59281e = (String) f11.c(y9.c.f99694b, "id");
                this.f59262f.f59277a = (String) f11.c(y9.c.f99694b, "icon");
                if (f11.d(y9.c.f99694b, y9.b.f99687c)) {
                    this.f59262f.f59278b = (String) f11.c(y9.c.f99694b, y9.b.f99687c);
                }
                Q(this.f59262f);
            }
        } catch (Exception e11) {
            qb.c.c(f59257m, "", e11);
        }
    }

    public final /* synthetic */ void K(List list) {
        if (list == null || list.size() <= 0 || getActivity() == null) {
            return;
        }
        this.f59260d.h(list);
        this.f59259c.f55445b.invalidateItemDecorations();
    }

    public final /* synthetic */ void M(Boolean bool) {
        this.f59265i = bool;
        P();
    }

    public final void N() {
        qb0.h hVar = this.f59263g;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f59263g.unsubscribe();
        }
        this.f59263g = DiscoveryAppItem.loadItems(getActivity()).I3(tb0.a.a()).u5(new wb0.b() { // from class: hg.e
            @Override // wb0.b
            public final void call(Object obj) {
                g.this.K((List) obj);
            }
        }, new wb0.b() { // from class: hg.f
            @Override // wb0.b
            public final void call(Object obj) {
                qb.c.d(g.f59257m, ((Throwable) obj).getMessage(), new Object[0]);
            }
        });
    }

    public final void P() {
        Boolean bool;
        RedDotImageView t11 = t();
        if (t11 != null) {
            Boolean bool2 = this.f59264h;
            t11.setShowRedDot((bool2 != null && bool2.booleanValue()) || ((bool = this.f59265i) != null && bool.booleanValue()));
        }
    }

    public final void Q(e banner) {
        if (!this.f59262f.a()) {
            qb.c.i(f59257m, "NOT IN DURATION", new Object[0]);
            return;
        }
        this.f59259c.f55444a.getLayoutParams().height = (int) (((xb.f.i(getContext()) - xb.f.a(getContext(), 40.0f)) * 3) / 9.0d);
        this.f59259c.f55444a.setVisibility(0);
        this.f59259c.f55444a.requestLayout();
        HashMap hashMap = new HashMap();
        String str = banner.f59281e;
        if (str == null) {
            str = "";
        }
        hashMap.put("id", str);
        String str2 = banner.f59281e;
        hashMap.put("adv_id", str2 != null ? str2 : "");
        if (this.f59261e) {
            ma.l.e(ma.t.f73020s, ma.a.Z1, hashMap);
            this.f59261e = false;
        }
        this.f59259c.f55444a.setOnClickListener(new d(banner, hashMap));
        hc.c.l(banner.f59277a).j(R.drawable.ic_train_ad_holder).f(R.drawable.ic_train_ad_holder).o(this.f59259c.f55444a);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bh.c cVar = (bh.c) new ViewModelProvider(getActivity()).get(bh.c.class);
        this.f59266j = cVar;
        cVar.f6824e.observe(getActivity(), new Observer() { // from class: hg.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                g.this.L((Boolean) obj);
            }
        });
        this.f59266j.f6825f.observe(getActivity(), new Observer() { // from class: hg.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                g.this.M((Boolean) obj);
            }
        });
        J();
        this.f59268l.setCurrentState(Lifecycle.State.CREATED);
    }

    @Override // hg.a, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f59268l.setCurrentState(Lifecycle.State.DESTROYED);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        qb0.h hVar = this.f59263g;
        if (hVar != null) {
            hVar.unsubscribe();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f59268l.setCurrentState(Lifecycle.State.STARTED);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        I();
        if (this.f59267k) {
            J();
            this.f59267k = false;
        }
        zb.a.f(getActivity(), true);
        this.f59268l.setCurrentState(Lifecycle.State.RESUMED);
        N();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f59268l.setCurrentState(Lifecycle.State.STARTED);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f59268l.setCurrentState(Lifecycle.State.CREATED);
    }

    @Override // hg.a
    public View v(ViewGroup container) {
        this.f59259c = (j8) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.fragment_discovery, container, false);
        this.f59249a.f56715a.setPadding(0, zb.a.k(getActivity()), 0, 0);
        f fVar = new f(DiscoveryAppItem.loadDefaultItems(getContext()));
        this.f59260d = fVar;
        this.f59259c.f55445b.setAdapter(fVar);
        RecyclerViewExposureHelper recyclerViewExposureHelper = new RecyclerViewExposureHelper(this.f59259c.f55445b, this.f59268l, 60);
        recyclerViewExposureHelper.setExposureCallback(new a());
        this.f59259c.f55445b.addItemDecoration(new b(xb.f.a(getContext(), 24.0f)));
        this.f59249a.f56717c.setOnScrollChangeListener(new c(recyclerViewExposureHelper));
        return this.f59259c.getRoot();
    }

    @Override // hg.a
    public int w() {
        return R.drawable.ic_friends;
    }

    @Override // hg.a
    public CharSequence x() {
        return getString(R.string.discovery_title);
    }

    @Override // hg.a
    public void y(RedDotImageView v11) {
        this.f59267k = true;
        Boolean bool = this.f59264h;
        if (bool != null && bool.booleanValue()) {
            this.f59266j.k(2);
        }
        FriendsActivity.J0(getContext(), this.f59264h.booleanValue(), this.f59265i.booleanValue());
        ma.l.a(ma.t.f73003b, ma.a.Q);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements RecyclerViewExposureHelper.ExposureDataCallback {
        public a() {
        }

        @Override // com.baicizhan.client.business.util.report.RecyclerViewExposureHelper.ExposureDataCallback
        public void onExposure(@m80.k Object data, int position, Size size) {
            if (data instanceof DiscoveryAppItem) {
                DiscoveryAppItem discoveryAppItem = (DiscoveryAppItem) data;
                HashMap hashMap = new HashMap();
                hashMap.put("adv_id", discoveryAppItem.statTag);
                hashMap.put("id", "1");
                hashMap.put("tag", discoveryAppItem.statTag);
                hashMap.put("idx", Integer.valueOf(position + 1));
                ma.l.e(ma.t.f73020s, ma.a.f72849u3, hashMap);
            }
        }

        @Override // com.baicizhan.client.business.util.report.RecyclerViewExposureHelper.ExposureDataCallback
        public void onUnExposure(@m80.k Object data, int position) {
        }
    }
}
