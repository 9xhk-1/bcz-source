package com.baicizhan.client.business.widget.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.baicizhan.client.business.auth.WeixinAuthHelper;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.baicizhan.client.business.auth.share.ShareDelegate;
import com.baicizhan.client.business.auth.share.ShareParams;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SharePickerSheetView extends LinearLayout implements View.OnClickListener {

    /* renamed from: k, reason: collision with root package name */
    public static final long f17304k = 1000;

    /* renamed from: a, reason: collision with root package name */
    public ShareDelegate f17305a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f17306b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f17307c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f17308d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f17309e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f17310f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f17311g;

    /* renamed from: h, reason: collision with root package name */
    public LinearLayout f17312h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17313i;

    /* renamed from: j, reason: collision with root package name */
    public long f17314j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public ShareParams f17315a;

        /* renamed from: b, reason: collision with root package name */
        public ShareDelegate.b f17316b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f17317c = true;

        /* renamed from: d, reason: collision with root package name */
        public boolean f17318d = false;

        public SharePickerSheetView a(Context context) {
            SharePickerSheetView sharePickerSheetView = (SharePickerSheetView) LayoutInflater.from(context).inflate(R.layout.share_picker_sheet_view, (ViewGroup) null, false);
            sharePickerSheetView.f17313i = this.f17317c;
            sharePickerSheetView.f17305a = ShareDelegate.i((FragmentActivity) context).v(this.f17315a).u(this.f17316b);
            TextView textView = sharePickerSheetView.f17309e;
            ShareParams shareParams = this.f17315a;
            textView.setVisibility((shareParams == null || TextUtils.isEmpty(shareParams.f16060d) || this.f17315a.f16061e == ShareParams.ShareType.MINI_PROGRAM) ? 8 : 0);
            if (!this.f17317c) {
                sharePickerSheetView.f17309e.setVisibility(8);
            }
            TextView textView2 = sharePickerSheetView.f17307c;
            ShareParams.ShareType shareType = this.f17315a.f16061e;
            ShareParams.ShareType shareType2 = ShareParams.ShareType.MINI_PROGRAM;
            textView2.setVisibility(shareType == shareType2 ? 8 : 0);
            TextView textView3 = sharePickerSheetView.f17310f;
            ShareParams.ShareType shareType3 = this.f17315a.f16061e;
            textView3.setVisibility((shareType3 == ShareParams.ShareType.TEXT || shareType3 == shareType2) ? 8 : 0);
            sharePickerSheetView.f17311g.setVisibility(this.f17318d ? 0 : 8);
            return sharePickerSheetView;
        }

        public a b(ShareDelegate.b listener) {
            this.f17316b = listener;
            return this;
        }

        public a c(boolean visable) {
            this.f17318d = visable;
            return this;
        }

        public a d(ShareParams params) {
            this.f17315a = params;
            return this;
        }

        public a e(boolean visible) {
            this.f17317c = visible;
            return this;
        }
    }

    public SharePickerSheetView(Context context) {
        super(context);
        this.f17313i = true;
        this.f17314j = 0L;
    }

    public static void j() {
        WeixinAuthHelper.A().F();
    }

    public final void g() {
        ShareDelegate shareDelegate = this.f17305a;
        if (shareDelegate != null) {
            shareDelegate.j();
        }
    }

    public void h(int requestCode, int resultCode, Intent data) {
        if (this.f17305a != null) {
            Context context = getContext();
            if (context instanceof Activity) {
                this.f17305a.r((Activity) context, requestCode, resultCode, data);
            }
        }
    }

    public void i(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        ShareDelegate shareDelegate = this.f17305a;
        if (shareDelegate != null) {
            shareDelegate.t(requestCode, permissions, grantResults);
        }
    }

    public SharePickerSheetView k(ShareDelegate.b listener) {
        ShareDelegate shareDelegate = this.f17305a;
        if (shareDelegate != null) {
            shareDelegate.u(listener);
        }
        return this;
    }

    public SharePickerSheetView l(ShareParams params) {
        ShareDelegate shareDelegate = this.f17305a;
        if (shareDelegate != null) {
            shareDelegate.v(params);
            TextView textView = this.f17309e;
            if (textView != null && !this.f17313i) {
                textView.setVisibility(8);
            }
            if (params.f16061e == ShareParams.ShareType.TEXT) {
                this.f17310f.setVisibility(8);
            }
            if (params.f16061e == ShareParams.ShareType.MINI_PROGRAM) {
                this.f17307c.setVisibility(8);
                this.f17309e.setVisibility(8);
                this.f17310f.setVisibility(8);
            }
        }
        return this;
    }

    public final void m(ShareChannel media) {
        ShareDelegate shareDelegate = this.f17305a;
        if (shareDelegate != null) {
            shareDelegate.w(media);
        }
    }

    public final boolean n() {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z11 = Math.abs(currentTimeMillis - this.f17314j) < 1000;
        if (!z11) {
            this.f17314j = currentTimeMillis;
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean c11 = c9.a.c(getContext());
        boolean f11 = c9.a.f(getContext());
        boolean e11 = c9.a.e(getContext());
        Drawable drawable = getContext().getResources().getDrawable(f11 ? R.drawable.share_weixin_default : R.drawable.ic_app_wechat_disable);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f17306b.setSelected(f11);
        this.f17306b.setCompoundDrawables(null, drawable, null, null);
        this.f17306b.setOnClickListener(f11 ? this : null);
        Drawable drawable2 = getContext().getResources().getDrawable(f11 ? R.drawable.share_circleoffriends_default : R.drawable.ic_app_wechatmoment_disable);
        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        this.f17307c.setSelected(f11);
        this.f17307c.setCompoundDrawables(null, drawable2, null, null);
        this.f17307c.setOnClickListener(f11 ? this : null);
        Drawable drawable3 = getContext().getResources().getDrawable(c11 ? R.drawable.share_qq_default : R.drawable.ic_app_qq_disable);
        drawable3.setBounds(0, 0, drawable3.getMinimumWidth(), drawable3.getMinimumHeight());
        this.f17308d.setSelected(c11);
        this.f17308d.setCompoundDrawables(null, drawable3, null, null);
        this.f17308d.setOnClickListener(c11 ? this : null);
        Drawable drawable4 = getContext().getResources().getDrawable(c11 ? R.drawable.share_qzone_default : R.drawable.ic_app_qqzone_disable);
        drawable4.setBounds(0, 0, drawable4.getMinimumWidth(), drawable4.getMinimumHeight());
        this.f17310f.setSelected(c11);
        this.f17310f.setCompoundDrawables(null, drawable4, null, null);
        this.f17310f.setOnClickListener(c11 ? this : null);
        Drawable drawable5 = getContext().getResources().getDrawable(e11 ? R.drawable.share_weibo_default : R.drawable.ic_app_weibo_disable);
        drawable5.setBounds(0, 0, drawable5.getMinimumWidth(), drawable5.getMinimumHeight());
        this.f17309e.setSelected(e11);
        this.f17309e.setCompoundDrawables(null, drawable5, null, null);
        this.f17309e.setOnClickListener(e11 ? this : null);
        this.f17311g.setOnClickListener(this);
        this.f17311g.setSelected(true);
        this.f17312h.removeAllViewsInLayout();
        if (f11) {
            this.f17312h.addView(this.f17307c);
            this.f17312h.addView(this.f17306b);
        }
        if (e11) {
            this.f17312h.addView(this.f17309e);
        }
        if (c11) {
            this.f17312h.addView(this.f17310f);
            this.f17312h.addView(this.f17308d);
        }
        if (!f11) {
            this.f17312h.addView(this.f17307c);
            this.f17312h.addView(this.f17306b);
        }
        if (!e11) {
            this.f17312h.addView(this.f17309e);
        }
        if (!c11) {
            this.f17312h.addView(this.f17310f);
            this.f17312h.addView(this.f17308d);
        }
        this.f17312h.addView(this.f17311g);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        if (n()) {
            return;
        }
        int id2 = v11.getId();
        if (id2 == R.id.weixin) {
            m(ShareChannel.WEIXIN);
            return;
        }
        if (id2 == R.id.circle) {
            m(ShareChannel.WEIXIN_CIRCLE);
            return;
        }
        if (id2 == R.id.qq) {
            m(ShareChannel.QQ);
            return;
        }
        if (id2 == R.id.qzone) {
            m(ShareChannel.QZONE);
            return;
        }
        if (id2 == R.id.weibo) {
            m(ShareChannel.WEIBO);
        } else if (id2 == R.id.save_img) {
            m(ShareChannel.SAVE_PHOTO);
        } else if (id2 == R.id.cancel) {
            g();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.weixin);
        this.f17306b = textView;
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) findViewById(R.id.circle);
        this.f17307c = textView2;
        textView2.setOnClickListener(this);
        TextView textView3 = (TextView) findViewById(R.id.qq);
        this.f17308d = textView3;
        textView3.setOnClickListener(this);
        TextView textView4 = (TextView) findViewById(R.id.qzone);
        this.f17310f = textView4;
        textView4.setOnClickListener(this);
        TextView textView5 = (TextView) findViewById(R.id.weibo);
        this.f17309e = textView5;
        textView5.setOnClickListener(this);
        this.f17311g = (TextView) findViewById(R.id.save_img);
        TextView textView6 = this.f17309e;
        ShareDelegate shareDelegate = this.f17305a;
        textView6.setVisibility((shareDelegate == null || shareDelegate.l() == null || TextUtils.isEmpty(this.f17305a.l().f16060d)) ? 8 : 0);
        if (!this.f17313i) {
            this.f17309e.setVisibility(8);
        }
        findViewById(R.id.cancel).setOnClickListener(this);
        this.f17312h = (LinearLayout) findViewById(R.id.container);
    }

    public SharePickerSheetView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f17313i = true;
        this.f17314j = 0L;
    }

    public SharePickerSheetView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f17313i = true;
        this.f17314j = 0L;
    }
}
