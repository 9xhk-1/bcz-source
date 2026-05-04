package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.circularreveal.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface c extends b.a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b, reason: collision with root package name */
        public static final TypeEvaluator<e> f31068b = new b();

        /* renamed from: a, reason: collision with root package name */
        public final e f31069a = new e();

        @Override // android.animation.TypeEvaluator
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f11, @NonNull e eVar, @NonNull e eVar2) {
            this.f31069a.b(on.a.f(eVar.f31073a, eVar2.f31073a, f11), on.a.f(eVar.f31074b, eVar2.f31074b, f11), on.a.f(eVar.f31075c, eVar2.f31075c, f11));
            return this.f31069a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.android.material.circularreveal.c$c, reason: collision with other inner class name */
    public static class C0372c extends Property<c, e> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property<c, e> f31070a = new C0372c("circularReveal");

        public C0372c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(@NonNull c cVar) {
            return cVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull c cVar, @Nullable e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends Property<c, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property<c, Integer> f31071a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(@NonNull c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull c cVar, @NonNull Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: d, reason: collision with root package name */
        public static final float f31072d = Float.MAX_VALUE;

        /* renamed from: a, reason: collision with root package name */
        public float f31073a;

        /* renamed from: b, reason: collision with root package name */
        public float f31074b;

        /* renamed from: c, reason: collision with root package name */
        public float f31075c;

        public boolean a() {
            return this.f31075c == Float.MAX_VALUE;
        }

        public void b(float f11, float f12, float f13) {
            this.f31073a = f11;
            this.f31074b = f12;
            this.f31075c = f13;
        }

        public void c(@NonNull e eVar) {
            b(eVar.f31073a, eVar.f31074b, eVar.f31075c);
        }

        public e() {
        }

        public e(float f11, float f12, float f13) {
            this.f31073a = f11;
            this.f31074b = f12;
            this.f31075c = f13;
        }

        public e(@NonNull e eVar) {
            this(eVar.f31073a, eVar.f31074b, eVar.f31075c);
        }
    }

    void a();

    void d();

    void draw(Canvas canvas);

    @Nullable
    Drawable getCircularRevealOverlayDrawable();

    @ColorInt
    int getCircularRevealScrimColor();

    @Nullable
    e getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(@Nullable Drawable drawable);

    void setCircularRevealScrimColor(@ColorInt int i11);

    void setRevealInfo(@Nullable e eVar);
}
