package com.baicizhan.client.business.widget.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.baicizhan.client.business.auth.share.ShareDelegate;
import com.baicizhan.client.business.auth.share.ShareParams;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.widget.share.SharePanelViewV2;
import com.jiongji.andriod.card.R;
import gs.ye;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import qb.c;
import sa.q;
import xb.f;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSharePanelViewV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharePanelViewV2.kt\ncom/baicizhan/client/business/widget/share/SharePanelViewV2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,187:1\n1#2:188\n35#3:189\n*S KotlinDebug\n*F\n+ 1 SharePanelViewV2.kt\ncom/baicizhan/client/business/widget/share/SharePanelViewV2\n*L\n150#1:189\n*E\n"})
/* loaded from: classes4.dex */
public final class SharePanelViewV2 extends LinearLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final int f17292h = 8;

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f17293a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public a f17294b;

    /* renamed from: c, reason: collision with root package name */
    public ShareDelegate f17295c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ShareParams f17296d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public ShareDelegate.b f17297e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public ShareChannel f17298f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public b f17299g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends RecyclerView.Adapter<C0275a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<wa.a> f17300a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SharePanelViewV2 f17301b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.widget.share.SharePanelViewV2$a$a, reason: collision with other inner class name */
        public final class C0275a extends RecyclerView.ViewHolder {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ye f17302a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f17303b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0275a(@k a aVar, ye binding) {
                super(binding.getRoot());
                g0.p(binding, "binding");
                this.f17303b = aVar;
                this.f17302a = binding;
            }

            @k
            public final ye a() {
                return this.f17302a;
            }
        }

        public a(@k SharePanelViewV2 sharePanelViewV2, List<wa.a> data) {
            g0.p(data, "data");
            this.f17301b = sharePanelViewV2;
            this.f17300a = data;
        }

        public static final g2 f(SharePanelViewV2 sharePanelViewV2, a aVar, int i11, View it) {
            g0.p(it, "it");
            sharePanelViewV2.setCurrentClickChannel(aVar.f17300a.get(i11).g());
            b mShareClickListener = sharePanelViewV2.getMShareClickListener();
            if (mShareClickListener != null) {
                mShareClickListener.a(aVar.f17300a.get(i11).g());
            }
            return g2.f100423a;
        }

        @k
        public final List<wa.a> c() {
            return this.f17300a;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@k C0275a holder, final int i11) {
            g0.p(holder, "holder");
            ye a11 = holder.a();
            final SharePanelViewV2 sharePanelViewV2 = this.f17301b;
            a11.f57597b.setText(this.f17300a.get(i11).i());
            a11.getRoot().getLayoutParams().width = (int) (f.i(a11.getRoot().getContext()) / 4.5f);
            a11.f57596a.setEnabled(this.f17300a.get(i11).j());
            a11.f57596a.setBackgroundResource(this.f17300a.get(i11).h());
            ImageView shareIcon = a11.f57596a;
            g0.o(shareIcon, "shareIcon");
            q.t(shareIcon, 0, new x00.l() { // from class: wa.b
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 f11;
                    f11 = SharePanelViewV2.a.f(SharePanelViewV2.this, this, i11, (View) obj);
                    return f11;
                }
            }, 1, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0275a onCreateViewHolder(@k ViewGroup parent, int i11) {
            g0.p(parent, "parent");
            ye e11 = ye.e(LayoutInflater.from(parent.getContext()), parent, false);
            g0.o(e11, "inflate(...)");
            return new C0275a(this, e11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f17300a.size();
        }

        public final void h(@k List<wa.a> newData) {
            g0.p(newData, "newData");
            this.f17300a.clear();
            this.f17300a.addAll(newData);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(@k ShareChannel shareChannel);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public SharePanelViewV2(@k Context context) {
        this(context, null, 0, 6, null);
        g0.p(context, "context");
    }

    private final List<wa.a> getDisableChannel() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new wa.a(ShareChannel.WEIXIN, "微信好友", R.drawable.share_weixin_default, false, 8, null));
        arrayList.add(new wa.a(ShareChannel.WEIXIN_CIRCLE, "朋友圈", R.drawable.share_circleoffriends_default, false, 8, null));
        arrayList.add(new wa.a(ShareChannel.WEIBO, "新浪微博", R.drawable.share_weibo_default, false, 8, null));
        arrayList.add(new wa.a(ShareChannel.QQ, "QQ好友", R.drawable.share_qq_default, false, 8, null));
        arrayList.add(new wa.a(ShareChannel.QZONE, "QQ空间", R.drawable.share_qzone_default, false, 8, null));
        arrayList.add(new wa.a(ShareChannel.SAVE_PHOTO, "保存图片", R.drawable.share_save_phopo, false, 8, null));
        return arrayList;
    }

    private final List<wa.a> getEnableChannel() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (c9.a.f(getContext())) {
            arrayList.add(new wa.a(ShareChannel.WEIXIN, "微信好友", R.drawable.share_weixin_default, true));
            arrayList.add(new wa.a(ShareChannel.WEIXIN_CIRCLE, "朋友圈", R.drawable.share_circleoffriends_default, true));
        } else {
            arrayList2.add(new wa.a(ShareChannel.WEIXIN, "微信好友", R.drawable.share_weixin_default, false, 8, null));
            arrayList2.add(new wa.a(ShareChannel.WEIXIN_CIRCLE, "朋友圈", R.drawable.share_circleoffriends_default, false, 8, null));
        }
        if (c9.a.e(getContext())) {
            arrayList.add(new wa.a(ShareChannel.WEIBO, "新浪微博", R.drawable.share_weibo_default, true));
        } else {
            arrayList2.add(new wa.a(ShareChannel.WEIBO, "新浪微博", R.drawable.share_weibo_default, false, 8, null));
        }
        if (c9.a.c(getContext())) {
            arrayList.add(new wa.a(ShareChannel.QQ, "QQ好友", R.drawable.share_qq_default, true));
            arrayList.add(new wa.a(ShareChannel.QZONE, "QQ空间", R.drawable.share_qzone_default, true));
        } else {
            arrayList2.add(new wa.a(ShareChannel.QQ, "QQ好友", R.drawable.share_qq_default, false, 8, null));
            arrayList2.add(new wa.a(ShareChannel.QZONE, "QQ空间", R.drawable.share_qzone_default, false, 8, null));
        }
        arrayList.add(new wa.a(ShareChannel.SAVE_PHOTO, "保存图片", R.drawable.share_save_phopo, true));
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final void a() {
        ShareChannel shareChannel = this.f17298f;
        if (shareChannel != null) {
            Context context = getContext();
            g0.n(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ShareDelegate i11 = ShareDelegate.i((FragmentActivity) context);
            i11.v(this.f17296d);
            i11.u(this.f17297e);
            g0.o(i11, "also(...)");
            this.f17295c = i11;
            i11.w(shareChannel);
            c.i(KotlinExtKt.TAG, "doShare", new Object[0]);
        }
    }

    public final List<wa.a> b(boolean z11) {
        return z11 ? getEnableChannel() : getDisableChannel();
    }

    public final void c() {
        setOrientation(1);
        View.inflate(getContext(), R.layout.view_share_panel, this);
        View findViewById = findViewById(R.id.share_list);
        g0.o(findViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f17293a = recyclerView;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            g0.S("recyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView3 = this.f17293a;
        if (recyclerView3 == null) {
            g0.S("recyclerView");
        } else {
            recyclerView2 = recyclerView3;
        }
        a aVar = new a(this, b(false));
        this.f17294b = aVar;
        recyclerView2.setAdapter(aVar);
    }

    public final void d(int i11, int i12, @l Intent intent) {
        Context context;
        if (this.f17295c == null || (context = getContext()) == null) {
            return;
        }
        ShareDelegate shareDelegate = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            ShareDelegate shareDelegate2 = this.f17295c;
            if (shareDelegate2 == null) {
                g0.S("mShareDelegate");
            } else {
                shareDelegate = shareDelegate2;
            }
            shareDelegate.r(activity, i11, i12, intent);
        }
    }

    public final void e(int i11, @k String[] permissions, @k int[] results) {
        g0.p(permissions, "permissions");
        g0.p(results, "results");
        ShareDelegate shareDelegate = this.f17295c;
        if (shareDelegate != null) {
            if (shareDelegate == null) {
                g0.S("mShareDelegate");
                shareDelegate = null;
            }
            shareDelegate.t(i11, permissions, results);
        }
    }

    public final void f(boolean z11) {
        a aVar = this.f17294b;
        if (aVar != null) {
            aVar.h(b(z11));
        }
        a aVar2 = this.f17294b;
        if (aVar2 != null) {
            aVar2.notifyDataSetChanged();
        }
    }

    @l
    public final ShareChannel getCurrentClickChannel() {
        return this.f17298f;
    }

    @l
    public final ShareDelegate.b getMListener() {
        return this.f17297e;
    }

    @l
    public final b getMShareClickListener() {
        return this.f17299g;
    }

    @k
    public final ShareParams getShareParams() {
        return this.f17296d;
    }

    public final void setCurrentClickChannel(@l ShareChannel shareChannel) {
        this.f17298f = shareChannel;
    }

    public final void setMListener(@l ShareDelegate.b bVar) {
        this.f17297e = bVar;
    }

    public final void setMShareClickListener(@l b bVar) {
        this.f17299g = bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public SharePanelViewV2(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public SharePanelViewV2(@k Context context, @l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
        this.f17296d = new ShareParams();
        c();
    }

    public /* synthetic */ SharePanelViewV2(Context context, AttributeSet attributeSet, int i11, int i12, v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
