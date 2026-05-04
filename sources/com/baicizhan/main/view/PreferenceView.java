package com.baicizhan.main.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.jiongji.andriod.card.R;
import gs.eo;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import sa.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PreferenceView extends ConstraintLayout {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f25120j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f25121k = 8;

    /* renamed from: l, reason: collision with root package name */
    public static final int f25122l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f25123m = 1;

    /* renamed from: a, reason: collision with root package name */
    @l
    public Drawable f25124a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public CharSequence f25125b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Drawable f25126c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public CharSequence f25127d;

    /* renamed from: e, reason: collision with root package name */
    public int f25128e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Drawable f25129f;

    /* renamed from: g, reason: collision with root package name */
    public int f25130g;

    /* renamed from: h, reason: collision with root package name */
    public int f25131h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final eo f25132i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public PreferenceView(@k Context context) {
        this(context, null, 0, 0, 14, null);
        g0.p(context, "context");
    }

    private final void g() {
        ImageView noproguardIcon = this.f25132i.f54836d;
        g0.o(noproguardIcon, "noproguardIcon");
        q.z(noproguardIcon, this.f25124a != null);
        ImageView noproguardIcon2 = this.f25132i.f54836d;
        g0.o(noproguardIcon2, "noproguardIcon");
        if (q.m(noproguardIcon2)) {
            this.f25132i.f54836d.setImageDrawable(this.f25124a);
        }
        this.f25132i.f54842j.setText(this.f25125b);
        ImageView titleTag = this.f25132i.f54843k;
        g0.o(titleTag, "titleTag");
        q.o(titleTag, this.f25126c);
        if (this.f25131h != 0) {
            TextView desc = this.f25132i.f54834b;
            g0.o(desc, "desc");
            q.z(desc, false);
            ImageView noproguardStateIcon = this.f25132i.f54839g;
            g0.o(noproguardStateIcon, "noproguardStateIcon");
            q.z(noproguardStateIcon, false);
            Switch switchBtn = this.f25132i.f54841i;
            g0.o(switchBtn, "switchBtn");
            q.z(switchBtn, true);
            return;
        }
        TextView desc2 = this.f25132i.f54834b;
        g0.o(desc2, "desc");
        q.p(desc2, this.f25127d);
        int i11 = this.f25128e;
        if (i11 > 0.0f) {
            this.f25132i.f54834b.setTextSize(0, i11);
        }
        ImageView noproguardStateIcon2 = this.f25132i.f54839g;
        g0.o(noproguardStateIcon2, "noproguardStateIcon");
        q.o(noproguardStateIcon2, this.f25129f);
        int i12 = this.f25130g;
        if (i12 != -1) {
            this.f25132i.f54839g.setImageTintList(ColorStateList.valueOf(i12));
        }
        Switch switchBtn2 = this.f25132i.f54841i;
        g0.o(switchBtn2, "switchBtn");
        q.z(switchBtn2, false);
    }

    @l
    public final CharSequence getDescription() {
        return this.f25127d;
    }

    @l
    public final Drawable getTitleTag() {
        return this.f25126c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        g();
    }

    public final void setDescription(@l CharSequence charSequence) {
        this.f25127d = charSequence;
        TextView desc = this.f25132i.f54834b;
        g0.o(desc, "desc");
        q.p(desc, charSequence);
    }

    public final void setTitleTag(@l Drawable drawable) {
        this.f25126c = drawable;
        ImageView titleTag = this.f25132i.f54843k;
        g0.o(titleTag, "titleTag");
        q.o(titleTag, drawable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public PreferenceView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public PreferenceView(@k Context context, @l AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public PreferenceView(@k Context context, @l AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        g0.p(context, "context");
        this.f25130g = -1;
        eo b11 = eo.b(LayoutInflater.from(context), this);
        g0.o(b11, "inflate(...)");
        this.f25132i = b11;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PreferenceView, i11, i12);
        g0.o(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f25124a = obtainStyledAttributes.getDrawable(2);
        this.f25125b = obtainStyledAttributes.getString(5);
        setTitleTag(obtainStyledAttributes.getDrawable(6));
        setDescription(obtainStyledAttributes.getString(0));
        this.f25128e = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f25129f = obtainStyledAttributes.getDrawable(3);
        this.f25130g = obtainStyledAttributes.getColor(4, -7829368);
        this.f25131h = obtainStyledAttributes.getInt(7, 0);
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ PreferenceView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, v vVar) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }
}
