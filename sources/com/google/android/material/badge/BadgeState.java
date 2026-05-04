package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.annotation.XmlRes;
import com.google.android.material.R;
import com.google.android.material.internal.d0;
import java.util.Locale;
import sn.c;
import sn.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class BadgeState {

    /* renamed from: l, reason: collision with root package name */
    public static final String f30514l = "badge";

    /* renamed from: a, reason: collision with root package name */
    public final State f30515a;

    /* renamed from: b, reason: collision with root package name */
    public final State f30516b;

    /* renamed from: c, reason: collision with root package name */
    public final float f30517c;

    /* renamed from: d, reason: collision with root package name */
    public final float f30518d;

    /* renamed from: e, reason: collision with root package name */
    public final float f30519e;

    /* renamed from: f, reason: collision with root package name */
    public final float f30520f;

    /* renamed from: g, reason: collision with root package name */
    public final float f30521g;

    /* renamed from: h, reason: collision with root package name */
    public final float f30522h;

    /* renamed from: i, reason: collision with root package name */
    public final int f30523i;

    /* renamed from: j, reason: collision with root package name */
    public final int f30524j;

    /* renamed from: k, reason: collision with root package name */
    public int f30525k;

    public BadgeState(Context context, @XmlRes int i11, @AttrRes int i12, @StyleRes int i13, @Nullable State state) {
        State state2 = new State();
        this.f30516b = state2;
        state = state == null ? new State() : state;
        if (i11 != 0) {
            state.f30526a = i11;
        }
        TypedArray c11 = c(context, state.f30526a, i12, i13);
        Resources resources = context.getResources();
        this.f30517c = c11.getDimensionPixelSize(R.styleable.Badge_badgeRadius, -1);
        this.f30523i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f30524j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f30518d = c11.getDimensionPixelSize(R.styleable.Badge_badgeWithTextRadius, -1);
        int i14 = R.styleable.Badge_badgeWidth;
        int i15 = R.dimen.m3_badge_size;
        this.f30519e = c11.getDimension(i14, resources.getDimension(i15));
        int i16 = R.styleable.Badge_badgeWithTextWidth;
        int i17 = R.dimen.m3_badge_with_text_size;
        this.f30521g = c11.getDimension(i16, resources.getDimension(i17));
        this.f30520f = c11.getDimension(R.styleable.Badge_badgeHeight, resources.getDimension(i15));
        this.f30522h = c11.getDimension(R.styleable.Badge_badgeWithTextHeight, resources.getDimension(i17));
        boolean z11 = true;
        this.f30525k = c11.getInt(R.styleable.Badge_offsetAlignmentMode, 1);
        state2.f30534i = state.f30534i == -2 ? 255 : state.f30534i;
        if (state.f30536k != -2) {
            state2.f30536k = state.f30536k;
        } else {
            int i18 = R.styleable.Badge_number;
            if (c11.hasValue(i18)) {
                state2.f30536k = c11.getInt(i18, 0);
            } else {
                state2.f30536k = -1;
            }
        }
        if (state.f30535j != null) {
            state2.f30535j = state.f30535j;
        } else {
            int i19 = R.styleable.Badge_badgeText;
            if (c11.hasValue(i19)) {
                state2.f30535j = c11.getString(i19);
            }
        }
        state2.f30540o = state.f30540o;
        state2.f30541p = state.f30541p == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : state.f30541p;
        state2.f30542q = state.f30542q == 0 ? R.plurals.mtrl_badge_content_description : state.f30542q;
        state2.f30543r = state.f30543r == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : state.f30543r;
        if (state.f30545t != null && !state.f30545t.booleanValue()) {
            z11 = false;
        }
        state2.f30545t = Boolean.valueOf(z11);
        state2.f30537l = state.f30537l == -2 ? c11.getInt(R.styleable.Badge_maxCharacterCount, -2) : state.f30537l;
        state2.f30538m = state.f30538m == -2 ? c11.getInt(R.styleable.Badge_maxNumber, -2) : state.f30538m;
        state2.f30530e = Integer.valueOf(state.f30530e == null ? c11.getResourceId(R.styleable.Badge_badgeShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : state.f30530e.intValue());
        state2.f30531f = Integer.valueOf(state.f30531f == null ? c11.getResourceId(R.styleable.Badge_badgeShapeAppearanceOverlay, 0) : state.f30531f.intValue());
        state2.f30532g = Integer.valueOf(state.f30532g == null ? c11.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : state.f30532g.intValue());
        state2.f30533h = Integer.valueOf(state.f30533h == null ? c11.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearanceOverlay, 0) : state.f30533h.intValue());
        state2.f30527b = Integer.valueOf(state.f30527b == null ? J(context, c11, R.styleable.Badge_backgroundColor) : state.f30527b.intValue());
        state2.f30529d = Integer.valueOf(state.f30529d == null ? c11.getResourceId(R.styleable.Badge_badgeTextAppearance, R.style.TextAppearance_MaterialComponents_Badge) : state.f30529d.intValue());
        if (state.f30528c != null) {
            state2.f30528c = state.f30528c;
        } else {
            int i21 = R.styleable.Badge_badgeTextColor;
            if (c11.hasValue(i21)) {
                state2.f30528c = Integer.valueOf(J(context, c11, i21));
            } else {
                state2.f30528c = Integer.valueOf(new d(context, state2.f30529d.intValue()).i().getDefaultColor());
            }
        }
        state2.f30544s = Integer.valueOf(state.f30544s == null ? c11.getInt(R.styleable.Badge_badgeGravity, 8388661) : state.f30544s.intValue());
        state2.f30546u = Integer.valueOf(state.f30546u == null ? c11.getDimensionPixelSize(R.styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : state.f30546u.intValue());
        state2.f30547v = Integer.valueOf(state.f30547v == null ? c11.getDimensionPixelSize(R.styleable.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : state.f30547v.intValue());
        state2.f30548w = Integer.valueOf(state.f30548w == null ? c11.getDimensionPixelOffset(R.styleable.Badge_horizontalOffset, 0) : state.f30548w.intValue());
        state2.f30549x = Integer.valueOf(state.f30549x == null ? c11.getDimensionPixelOffset(R.styleable.Badge_verticalOffset, 0) : state.f30549x.intValue());
        state2.f30550y = Integer.valueOf(state.f30550y == null ? c11.getDimensionPixelOffset(R.styleable.Badge_horizontalOffsetWithText, state2.f30548w.intValue()) : state.f30550y.intValue());
        state2.f30551z = Integer.valueOf(state.f30551z == null ? c11.getDimensionPixelOffset(R.styleable.Badge_verticalOffsetWithText, state2.f30549x.intValue()) : state.f30551z.intValue());
        state2.C = Integer.valueOf(state.C == null ? c11.getDimensionPixelOffset(R.styleable.Badge_largeFontVerticalOffsetAdjustment, 0) : state.C.intValue());
        state2.A = Integer.valueOf(state.A == null ? 0 : state.A.intValue());
        state2.B = Integer.valueOf(state.B == null ? 0 : state.B.intValue());
        state2.D = Boolean.valueOf(state.D == null ? c11.getBoolean(R.styleable.Badge_autoAdjustToWithinGrandparentBounds, false) : state.D.booleanValue());
        c11.recycle();
        if (state.f30539n == null) {
            state2.f30539n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            state2.f30539n = state.f30539n;
        }
        this.f30515a = state;
    }

    public static int J(Context context, @NonNull TypedArray typedArray, @StyleableRes int i11) {
        return c.a(context, typedArray, i11).getDefaultColor();
    }

    public State A() {
        return this.f30515a;
    }

    public String B() {
        return this.f30516b.f30535j;
    }

    @StyleRes
    public int C() {
        return this.f30516b.f30529d.intValue();
    }

    @Dimension(unit = 1)
    public int D() {
        return this.f30516b.f30551z.intValue();
    }

    @Dimension(unit = 1)
    public int E() {
        return this.f30516b.f30549x.intValue();
    }

    public boolean F() {
        return this.f30516b.f30536k != -1;
    }

    public boolean G() {
        return this.f30516b.f30535j != null;
    }

    public boolean H() {
        return this.f30516b.D.booleanValue();
    }

    public boolean I() {
        return this.f30516b.f30545t.booleanValue();
    }

    public void K(@Dimension(unit = 1) int i11) {
        this.f30515a.A = Integer.valueOf(i11);
        this.f30516b.A = Integer.valueOf(i11);
    }

    public void L(@Dimension(unit = 1) int i11) {
        this.f30515a.B = Integer.valueOf(i11);
        this.f30516b.B = Integer.valueOf(i11);
    }

    public void M(int i11) {
        this.f30515a.f30534i = i11;
        this.f30516b.f30534i = i11;
    }

    public void N(boolean z11) {
        this.f30515a.D = Boolean.valueOf(z11);
        this.f30516b.D = Boolean.valueOf(z11);
    }

    public void O(@ColorInt int i11) {
        this.f30515a.f30527b = Integer.valueOf(i11);
        this.f30516b.f30527b = Integer.valueOf(i11);
    }

    public void P(int i11) {
        this.f30515a.f30544s = Integer.valueOf(i11);
        this.f30516b.f30544s = Integer.valueOf(i11);
    }

    public void Q(@Px int i11) {
        this.f30515a.f30546u = Integer.valueOf(i11);
        this.f30516b.f30546u = Integer.valueOf(i11);
    }

    public void R(int i11) {
        this.f30515a.f30531f = Integer.valueOf(i11);
        this.f30516b.f30531f = Integer.valueOf(i11);
    }

    public void S(int i11) {
        this.f30515a.f30530e = Integer.valueOf(i11);
        this.f30516b.f30530e = Integer.valueOf(i11);
    }

    public void T(@ColorInt int i11) {
        this.f30515a.f30528c = Integer.valueOf(i11);
        this.f30516b.f30528c = Integer.valueOf(i11);
    }

    public void U(@Px int i11) {
        this.f30515a.f30547v = Integer.valueOf(i11);
        this.f30516b.f30547v = Integer.valueOf(i11);
    }

    public void V(int i11) {
        this.f30515a.f30533h = Integer.valueOf(i11);
        this.f30516b.f30533h = Integer.valueOf(i11);
    }

    public void W(int i11) {
        this.f30515a.f30532g = Integer.valueOf(i11);
        this.f30516b.f30532g = Integer.valueOf(i11);
    }

    public void X(@StringRes int i11) {
        this.f30515a.f30543r = i11;
        this.f30516b.f30543r = i11;
    }

    public void Y(CharSequence charSequence) {
        this.f30515a.f30540o = charSequence;
        this.f30516b.f30540o = charSequence;
    }

    public void Z(CharSequence charSequence) {
        this.f30515a.f30541p = charSequence;
        this.f30516b.f30541p = charSequence;
    }

    public void a() {
        g0(-1);
    }

    public void a0(@PluralsRes int i11) {
        this.f30515a.f30542q = i11;
        this.f30516b.f30542q = i11;
    }

    public void b() {
        i0(null);
    }

    public void b0(@Dimension(unit = 1) int i11) {
        this.f30515a.f30550y = Integer.valueOf(i11);
        this.f30516b.f30550y = Integer.valueOf(i11);
    }

    public final TypedArray c(Context context, @XmlRes int i11, @AttrRes int i12, @StyleRes int i13) {
        AttributeSet attributeSet;
        int i14;
        if (i11 != 0) {
            attributeSet = kn.d.k(context, i11, f30514l);
            i14 = attributeSet.getStyleAttribute();
        } else {
            attributeSet = null;
            i14 = 0;
        }
        return d0.k(context, attributeSet, R.styleable.Badge, i12, i14 == 0 ? i13 : i14, new int[0]);
    }

    public void c0(@Dimension(unit = 1) int i11) {
        this.f30515a.f30548w = Integer.valueOf(i11);
        this.f30516b.f30548w = Integer.valueOf(i11);
    }

    @Dimension(unit = 1)
    public int d() {
        return this.f30516b.A.intValue();
    }

    public void d0(@Dimension(unit = 1) int i11) {
        this.f30515a.C = Integer.valueOf(i11);
        this.f30516b.C = Integer.valueOf(i11);
    }

    @Dimension(unit = 1)
    public int e() {
        return this.f30516b.B.intValue();
    }

    public void e0(int i11) {
        this.f30515a.f30537l = i11;
        this.f30516b.f30537l = i11;
    }

    public int f() {
        return this.f30516b.f30534i;
    }

    public void f0(int i11) {
        this.f30515a.f30538m = i11;
        this.f30516b.f30538m = i11;
    }

    @ColorInt
    public int g() {
        return this.f30516b.f30527b.intValue();
    }

    public void g0(int i11) {
        this.f30515a.f30536k = i11;
        this.f30516b.f30536k = i11;
    }

    public int h() {
        return this.f30516b.f30544s.intValue();
    }

    public void h0(Locale locale) {
        this.f30515a.f30539n = locale;
        this.f30516b.f30539n = locale;
    }

    @Px
    public int i() {
        return this.f30516b.f30546u.intValue();
    }

    public void i0(String str) {
        this.f30515a.f30535j = str;
        this.f30516b.f30535j = str;
    }

    public int j() {
        return this.f30516b.f30531f.intValue();
    }

    public void j0(@StyleRes int i11) {
        this.f30515a.f30529d = Integer.valueOf(i11);
        this.f30516b.f30529d = Integer.valueOf(i11);
    }

    public int k() {
        return this.f30516b.f30530e.intValue();
    }

    public void k0(@Dimension(unit = 1) int i11) {
        this.f30515a.f30551z = Integer.valueOf(i11);
        this.f30516b.f30551z = Integer.valueOf(i11);
    }

    @ColorInt
    public int l() {
        return this.f30516b.f30528c.intValue();
    }

    public void l0(@Dimension(unit = 1) int i11) {
        this.f30515a.f30549x = Integer.valueOf(i11);
        this.f30516b.f30549x = Integer.valueOf(i11);
    }

    @Px
    public int m() {
        return this.f30516b.f30547v.intValue();
    }

    public void m0(boolean z11) {
        this.f30515a.f30545t = Boolean.valueOf(z11);
        this.f30516b.f30545t = Boolean.valueOf(z11);
    }

    public int n() {
        return this.f30516b.f30533h.intValue();
    }

    public int o() {
        return this.f30516b.f30532g.intValue();
    }

    @StringRes
    public int p() {
        return this.f30516b.f30543r;
    }

    public CharSequence q() {
        return this.f30516b.f30540o;
    }

    public CharSequence r() {
        return this.f30516b.f30541p;
    }

    @PluralsRes
    public int s() {
        return this.f30516b.f30542q;
    }

    @Dimension(unit = 1)
    public int t() {
        return this.f30516b.f30550y.intValue();
    }

    @Dimension(unit = 1)
    public int u() {
        return this.f30516b.f30548w.intValue();
    }

    @Dimension(unit = 1)
    public int v() {
        return this.f30516b.C.intValue();
    }

    public int w() {
        return this.f30516b.f30537l;
    }

    public int x() {
        return this.f30516b.f30538m;
    }

    public int y() {
        return this.f30516b.f30536k;
    }

    public Locale z() {
        return this.f30516b.f30539n;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public static final int E = -1;
        public static final int F = -2;

        @Dimension(unit = 1)
        public Integer A;

        @Dimension(unit = 1)
        public Integer B;

        @Dimension(unit = 1)
        public Integer C;
        public Boolean D;

        /* renamed from: a, reason: collision with root package name */
        @XmlRes
        public int f30526a;

        /* renamed from: b, reason: collision with root package name */
        @ColorInt
        public Integer f30527b;

        /* renamed from: c, reason: collision with root package name */
        @ColorInt
        public Integer f30528c;

        /* renamed from: d, reason: collision with root package name */
        @StyleRes
        public Integer f30529d;

        /* renamed from: e, reason: collision with root package name */
        @StyleRes
        public Integer f30530e;

        /* renamed from: f, reason: collision with root package name */
        @StyleRes
        public Integer f30531f;

        /* renamed from: g, reason: collision with root package name */
        @StyleRes
        public Integer f30532g;

        /* renamed from: h, reason: collision with root package name */
        @StyleRes
        public Integer f30533h;

        /* renamed from: i, reason: collision with root package name */
        public int f30534i;

        /* renamed from: j, reason: collision with root package name */
        @Nullable
        public String f30535j;

        /* renamed from: k, reason: collision with root package name */
        public int f30536k;

        /* renamed from: l, reason: collision with root package name */
        public int f30537l;

        /* renamed from: m, reason: collision with root package name */
        public int f30538m;

        /* renamed from: n, reason: collision with root package name */
        public Locale f30539n;

        /* renamed from: o, reason: collision with root package name */
        @Nullable
        public CharSequence f30540o;

        /* renamed from: p, reason: collision with root package name */
        @Nullable
        public CharSequence f30541p;

        /* renamed from: q, reason: collision with root package name */
        @PluralsRes
        public int f30542q;

        /* renamed from: r, reason: collision with root package name */
        @StringRes
        public int f30543r;

        /* renamed from: s, reason: collision with root package name */
        public Integer f30544s;

        /* renamed from: t, reason: collision with root package name */
        public Boolean f30545t;

        /* renamed from: u, reason: collision with root package name */
        @Px
        public Integer f30546u;

        /* renamed from: v, reason: collision with root package name */
        @Px
        public Integer f30547v;

        /* renamed from: w, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f30548w;

        /* renamed from: x, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f30549x;

        /* renamed from: y, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f30550y;

        /* renamed from: z, reason: collision with root package name */
        @Dimension(unit = 1)
        public Integer f30551z;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public State createFromParcel(@NonNull Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public State[] newArray(int i11) {
                return new State[i11];
            }
        }

        public State() {
            this.f30534i = 255;
            this.f30536k = -2;
            this.f30537l = -2;
            this.f30538m = -2;
            this.f30545t = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            parcel.writeInt(this.f30526a);
            parcel.writeSerializable(this.f30527b);
            parcel.writeSerializable(this.f30528c);
            parcel.writeSerializable(this.f30529d);
            parcel.writeSerializable(this.f30530e);
            parcel.writeSerializable(this.f30531f);
            parcel.writeSerializable(this.f30532g);
            parcel.writeSerializable(this.f30533h);
            parcel.writeInt(this.f30534i);
            parcel.writeString(this.f30535j);
            parcel.writeInt(this.f30536k);
            parcel.writeInt(this.f30537l);
            parcel.writeInt(this.f30538m);
            CharSequence charSequence = this.f30540o;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f30541p;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f30542q);
            parcel.writeSerializable(this.f30544s);
            parcel.writeSerializable(this.f30546u);
            parcel.writeSerializable(this.f30547v);
            parcel.writeSerializable(this.f30548w);
            parcel.writeSerializable(this.f30549x);
            parcel.writeSerializable(this.f30550y);
            parcel.writeSerializable(this.f30551z);
            parcel.writeSerializable(this.C);
            parcel.writeSerializable(this.A);
            parcel.writeSerializable(this.B);
            parcel.writeSerializable(this.f30545t);
            parcel.writeSerializable(this.f30539n);
            parcel.writeSerializable(this.D);
        }

        public State(@NonNull Parcel parcel) {
            this.f30534i = 255;
            this.f30536k = -2;
            this.f30537l = -2;
            this.f30538m = -2;
            this.f30545t = Boolean.TRUE;
            this.f30526a = parcel.readInt();
            this.f30527b = (Integer) parcel.readSerializable();
            this.f30528c = (Integer) parcel.readSerializable();
            this.f30529d = (Integer) parcel.readSerializable();
            this.f30530e = (Integer) parcel.readSerializable();
            this.f30531f = (Integer) parcel.readSerializable();
            this.f30532g = (Integer) parcel.readSerializable();
            this.f30533h = (Integer) parcel.readSerializable();
            this.f30534i = parcel.readInt();
            this.f30535j = parcel.readString();
            this.f30536k = parcel.readInt();
            this.f30537l = parcel.readInt();
            this.f30538m = parcel.readInt();
            this.f30540o = parcel.readString();
            this.f30541p = parcel.readString();
            this.f30542q = parcel.readInt();
            this.f30544s = (Integer) parcel.readSerializable();
            this.f30546u = (Integer) parcel.readSerializable();
            this.f30547v = (Integer) parcel.readSerializable();
            this.f30548w = (Integer) parcel.readSerializable();
            this.f30549x = (Integer) parcel.readSerializable();
            this.f30550y = (Integer) parcel.readSerializable();
            this.f30551z = (Integer) parcel.readSerializable();
            this.C = (Integer) parcel.readSerializable();
            this.A = (Integer) parcel.readSerializable();
            this.B = (Integer) parcel.readSerializable();
            this.f30545t = (Boolean) parcel.readSerializable();
            this.f30539n = (Locale) parcel.readSerializable();
            this.D = (Boolean) parcel.readSerializable();
        }
    }
}
