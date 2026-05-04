package vn;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.AttrRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class p {

    /* renamed from: m, reason: collision with root package name */
    public static final e f94154m = new n(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public f f94155a;

    /* renamed from: b, reason: collision with root package name */
    public f f94156b;

    /* renamed from: c, reason: collision with root package name */
    public f f94157c;

    /* renamed from: d, reason: collision with root package name */
    public f f94158d;

    /* renamed from: e, reason: collision with root package name */
    public e f94159e;

    /* renamed from: f, reason: collision with root package name */
    public e f94160f;

    /* renamed from: g, reason: collision with root package name */
    public e f94161g;

    /* renamed from: h, reason: collision with root package name */
    public e f94162h;

    /* renamed from: i, reason: collision with root package name */
    public h f94163i;

    /* renamed from: j, reason: collision with root package name */
    public h f94164j;

    /* renamed from: k, reason: collision with root package name */
    public h f94165k;

    /* renamed from: l, reason: collision with root package name */
    public h f94166l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface c {
        @NonNull
        e a(@NonNull e eVar);
    }

    @NonNull
    public static b a() {
        return new b();
    }

    @NonNull
    public static b b(Context context, @StyleRes int i11, @StyleRes int i12) {
        return c(context, i11, i12, 0);
    }

    @NonNull
    public static b c(Context context, @StyleRes int i11, @StyleRes int i12, int i13) {
        return d(context, i11, i12, new vn.a(i13));
    }

    @NonNull
    public static b d(Context context, @StyleRes int i11, @StyleRes int i12, @NonNull e eVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i11);
        if (i12 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i12);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R.styleable.ShapeAppearance);
        try {
            int i13 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamily, 0);
            int i14 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopLeft, i13);
            int i15 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopRight, i13);
            int i16 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomRight, i13);
            int i17 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i13);
            e m11 = m(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSize, eVar);
            e m12 = m(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopLeft, m11);
            e m13 = m(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopRight, m11);
            e m14 = m(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomRight, m11);
            return new b().I(i14, m12).N(i15, m13).A(i16, m14).v(i17, m(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomLeft, m11));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static b e(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        return f(context, attributeSet, i11, i12, 0);
    }

    @NonNull
    public static b f(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12, int i13) {
        return g(context, attributeSet, i11, i12, new vn.a(i13));
    }

    @NonNull
    public static b g(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12, @NonNull e eVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialShape, i11, i12);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, eVar);
    }

    @NonNull
    public static e m(TypedArray typedArray, int i11, @NonNull e eVar) {
        TypedValue peekValue = typedArray.peekValue(i11);
        if (peekValue != null) {
            int i12 = peekValue.type;
            if (i12 == 5) {
                return new vn.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i12 == 6) {
                return new n(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return eVar;
    }

    @NonNull
    public h h() {
        return this.f94165k;
    }

    @NonNull
    public f i() {
        return this.f94158d;
    }

    @NonNull
    public e j() {
        return this.f94162h;
    }

    @NonNull
    public f k() {
        return this.f94157c;
    }

    @NonNull
    public e l() {
        return this.f94161g;
    }

    @NonNull
    public h n() {
        return this.f94166l;
    }

    @NonNull
    public h o() {
        return this.f94164j;
    }

    @NonNull
    public h p() {
        return this.f94163i;
    }

    @NonNull
    public f q() {
        return this.f94155a;
    }

    @NonNull
    public e r() {
        return this.f94159e;
    }

    @NonNull
    public f s() {
        return this.f94156b;
    }

    @NonNull
    public e t() {
        return this.f94160f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean u(@NonNull RectF rectF) {
        boolean z11 = this.f94166l.getClass().equals(h.class) && this.f94164j.getClass().equals(h.class) && this.f94163i.getClass().equals(h.class) && this.f94165k.getClass().equals(h.class);
        float a11 = this.f94159e.a(rectF);
        return z11 && ((this.f94160f.a(rectF) > a11 ? 1 : (this.f94160f.a(rectF) == a11 ? 0 : -1)) == 0 && (this.f94162h.a(rectF) > a11 ? 1 : (this.f94162h.a(rectF) == a11 ? 0 : -1)) == 0 && (this.f94161g.a(rectF) > a11 ? 1 : (this.f94161g.a(rectF) == a11 ? 0 : -1)) == 0) && ((this.f94156b instanceof o) && (this.f94155a instanceof o) && (this.f94157c instanceof o) && (this.f94158d instanceof o));
    }

    @NonNull
    public b v() {
        return new b(this);
    }

    @NonNull
    public p w(float f11) {
        return v().o(f11).m();
    }

    @NonNull
    public p x(@NonNull e eVar) {
        return v().p(eVar).m();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public p y(@NonNull c cVar) {
        return v().L(cVar.a(r())).Q(cVar.a(t())).y(cVar.a(j())).D(cVar.a(l())).m();
    }

    public p(@NonNull b bVar) {
        this.f94155a = bVar.f94167a;
        this.f94156b = bVar.f94168b;
        this.f94157c = bVar.f94169c;
        this.f94158d = bVar.f94170d;
        this.f94159e = bVar.f94171e;
        this.f94160f = bVar.f94172f;
        this.f94161g = bVar.f94173g;
        this.f94162h = bVar.f94174h;
        this.f94163i = bVar.f94175i;
        this.f94164j = bVar.f94176j;
        this.f94165k = bVar.f94177k;
        this.f94166l = bVar.f94178l;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public f f94167a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        public f f94168b;

        /* renamed from: c, reason: collision with root package name */
        @NonNull
        public f f94169c;

        /* renamed from: d, reason: collision with root package name */
        @NonNull
        public f f94170d;

        /* renamed from: e, reason: collision with root package name */
        @NonNull
        public e f94171e;

        /* renamed from: f, reason: collision with root package name */
        @NonNull
        public e f94172f;

        /* renamed from: g, reason: collision with root package name */
        @NonNull
        public e f94173g;

        /* renamed from: h, reason: collision with root package name */
        @NonNull
        public e f94174h;

        /* renamed from: i, reason: collision with root package name */
        @NonNull
        public h f94175i;

        /* renamed from: j, reason: collision with root package name */
        @NonNull
        public h f94176j;

        /* renamed from: k, reason: collision with root package name */
        @NonNull
        public h f94177k;

        /* renamed from: l, reason: collision with root package name */
        @NonNull
        public h f94178l;

        public b() {
            this.f94167a = l.b();
            this.f94168b = l.b();
            this.f94169c = l.b();
            this.f94170d = l.b();
            this.f94171e = new vn.a(0.0f);
            this.f94172f = new vn.a(0.0f);
            this.f94173g = new vn.a(0.0f);
            this.f94174h = new vn.a(0.0f);
            this.f94175i = l.c();
            this.f94176j = l.c();
            this.f94177k = l.c();
            this.f94178l = l.c();
        }

        public static float n(f fVar) {
            if (fVar instanceof o) {
                return ((o) fVar).f94153a;
            }
            if (fVar instanceof g) {
                return ((g) fVar).f94090a;
            }
            return -1.0f;
        }

        @NonNull
        @uo.a
        public b A(int i11, @NonNull e eVar) {
            return B(l.a(i11)).D(eVar);
        }

        @NonNull
        @uo.a
        public b B(@NonNull f fVar) {
            this.f94169c = fVar;
            float n11 = n(fVar);
            if (n11 != -1.0f) {
                C(n11);
            }
            return this;
        }

        @NonNull
        @uo.a
        public b C(@Dimension float f11) {
            this.f94173g = new vn.a(f11);
            return this;
        }

        @NonNull
        @uo.a
        public b D(@NonNull e eVar) {
            this.f94173g = eVar;
            return this;
        }

        @NonNull
        @uo.a
        public b E(@NonNull h hVar) {
            this.f94178l = hVar;
            return this;
        }

        @NonNull
        @uo.a
        public b F(@NonNull h hVar) {
            this.f94176j = hVar;
            return this;
        }

        @NonNull
        @uo.a
        public b G(@NonNull h hVar) {
            this.f94175i = hVar;
            return this;
        }

        @NonNull
        @uo.a
        public b H(int i11, @Dimension float f11) {
            return J(l.a(i11)).K(f11);
        }

        @NonNull
        @uo.a
        public b I(int i11, @NonNull e eVar) {
            return J(l.a(i11)).L(eVar);
        }

        @NonNull
        @uo.a
        public b J(@NonNull f fVar) {
            this.f94167a = fVar;
            float n11 = n(fVar);
            if (n11 != -1.0f) {
                K(n11);
            }
            return this;
        }

        @NonNull
        @uo.a
        public b K(@Dimension float f11) {
            this.f94171e = new vn.a(f11);
            return this;
        }

        @NonNull
        @uo.a
        public b L(@NonNull e eVar) {
            this.f94171e = eVar;
            return this;
        }

        @NonNull
        @uo.a
        public b M(int i11, @Dimension float f11) {
            return O(l.a(i11)).P(f11);
        }

        @NonNull
        @uo.a
        public b N(int i11, @NonNull e eVar) {
            return O(l.a(i11)).Q(eVar);
        }

        @NonNull
        @uo.a
        public b O(@NonNull f fVar) {
            this.f94168b = fVar;
            float n11 = n(fVar);
            if (n11 != -1.0f) {
                P(n11);
            }
            return this;
        }

        @NonNull
        @uo.a
        public b P(@Dimension float f11) {
            this.f94172f = new vn.a(f11);
            return this;
        }

        @NonNull
        @uo.a
        public b Q(@NonNull e eVar) {
            this.f94172f = eVar;
            return this;
        }

        @NonNull
        public p m() {
            return new p(this);
        }

        @NonNull
        @uo.a
        public b o(@Dimension float f11) {
            return K(f11).P(f11).C(f11).x(f11);
        }

        @NonNull
        @uo.a
        public b p(@NonNull e eVar) {
            return L(eVar).Q(eVar).D(eVar).y(eVar);
        }

        @NonNull
        @uo.a
        public b q(int i11, @Dimension float f11) {
            return r(l.a(i11)).o(f11);
        }

        @NonNull
        @uo.a
        public b r(@NonNull f fVar) {
            return J(fVar).O(fVar).B(fVar).w(fVar);
        }

        @NonNull
        @uo.a
        public b s(@NonNull h hVar) {
            return E(hVar).G(hVar).F(hVar).t(hVar);
        }

        @NonNull
        @uo.a
        public b t(@NonNull h hVar) {
            this.f94177k = hVar;
            return this;
        }

        @NonNull
        @uo.a
        public b u(int i11, @Dimension float f11) {
            return w(l.a(i11)).x(f11);
        }

        @NonNull
        @uo.a
        public b v(int i11, @NonNull e eVar) {
            return w(l.a(i11)).y(eVar);
        }

        @NonNull
        @uo.a
        public b w(@NonNull f fVar) {
            this.f94170d = fVar;
            float n11 = n(fVar);
            if (n11 != -1.0f) {
                x(n11);
            }
            return this;
        }

        @NonNull
        @uo.a
        public b x(@Dimension float f11) {
            this.f94174h = new vn.a(f11);
            return this;
        }

        @NonNull
        @uo.a
        public b y(@NonNull e eVar) {
            this.f94174h = eVar;
            return this;
        }

        @NonNull
        @uo.a
        public b z(int i11, @Dimension float f11) {
            return B(l.a(i11)).C(f11);
        }

        public b(@NonNull p pVar) {
            this.f94167a = l.b();
            this.f94168b = l.b();
            this.f94169c = l.b();
            this.f94170d = l.b();
            this.f94171e = new vn.a(0.0f);
            this.f94172f = new vn.a(0.0f);
            this.f94173g = new vn.a(0.0f);
            this.f94174h = new vn.a(0.0f);
            this.f94175i = l.c();
            this.f94176j = l.c();
            this.f94177k = l.c();
            this.f94178l = l.c();
            this.f94167a = pVar.f94155a;
            this.f94168b = pVar.f94156b;
            this.f94169c = pVar.f94157c;
            this.f94170d = pVar.f94158d;
            this.f94171e = pVar.f94159e;
            this.f94172f = pVar.f94160f;
            this.f94173g = pVar.f94161g;
            this.f94174h = pVar.f94162h;
            this.f94175i = pVar.f94163i;
            this.f94176j = pVar.f94164j;
            this.f94177k = pVar.f94165k;
            this.f94178l = pVar.f94166l;
        }
    }

    public p() {
        this.f94155a = l.b();
        this.f94156b = l.b();
        this.f94157c = l.b();
        this.f94158d = l.b();
        this.f94159e = new vn.a(0.0f);
        this.f94160f = new vn.a(0.0f);
        this.f94161g = new vn.a(0.0f);
        this.f94162h = new vn.a(0.0f);
        this.f94163i = l.c();
        this.f94164j = l.c();
        this.f94165k = l.c();
        this.f94166l = l.c();
    }
}
