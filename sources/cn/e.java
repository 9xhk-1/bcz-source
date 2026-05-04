package cn;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f9270a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends e {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CarouselLayoutManager f9271b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, CarouselLayoutManager carouselLayoutManager) {
            super(i11, null);
            this.f9271b = carouselLayoutManager;
        }

        @Override // cn.e
        public void a(RectF rectF, RectF rectF2, RectF rectF3) {
            float f11 = rectF2.top;
            float f12 = rectF3.top;
            if (f11 < f12 && rectF2.bottom > f12) {
                float f13 = f12 - f11;
                rectF.top += f13;
                rectF3.top += f13;
            }
            float f14 = rectF2.bottom;
            float f15 = rectF3.bottom;
            if (f14 <= f15 || rectF2.top >= f15) {
                return;
            }
            float f16 = f14 - f15;
            rectF.bottom = Math.max(rectF.bottom - f16, rectF.top);
            rectF2.bottom = Math.max(rectF2.bottom - f16, rectF2.top);
        }

        @Override // cn.e
        public int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f9271b.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // cn.e
        public float f(RecyclerView.LayoutParams layoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // cn.e
        public RectF g(float f11, float f12, float f13, float f14) {
            return new RectF(0.0f, f13, f12, f11 - f13);
        }

        @Override // cn.e
        public int h() {
            return this.f9271b.getHeight();
        }

        @Override // cn.e
        public int i() {
            return h();
        }

        @Override // cn.e
        public int j() {
            return this.f9271b.getPaddingLeft();
        }

        @Override // cn.e
        public int k() {
            return this.f9271b.getWidth() - this.f9271b.getPaddingRight();
        }

        @Override // cn.e
        public int l() {
            return m();
        }

        @Override // cn.e
        public int m() {
            return 0;
        }

        @Override // cn.e
        public void n(View view, int i11, int i12) {
            int j11 = j();
            this.f9271b.layoutDecoratedWithMargins(view, j11, i11, j11 + e(view), i12);
        }

        @Override // cn.e
        public void o(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.bottom <= rectF3.top) {
                float floor = ((float) Math.floor(rectF.bottom)) - 1.0f;
                rectF.bottom = floor;
                rectF.top = Math.min(rectF.top, floor);
            }
            if (rectF2.top >= rectF3.bottom) {
                float ceil = ((float) Math.ceil(rectF.top)) + 1.0f;
                rectF.top = ceil;
                rectF.bottom = Math.max(ceil, rectF.bottom);
            }
        }

        @Override // cn.e
        public void p(View view, Rect rect, float f11, float f12) {
            view.offsetTopAndBottom((int) (f12 - (rect.top + f11)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends e {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CarouselLayoutManager f9272b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, CarouselLayoutManager carouselLayoutManager) {
            super(i11, null);
            this.f9272b = carouselLayoutManager;
        }

        @Override // cn.e
        public void a(RectF rectF, RectF rectF2, RectF rectF3) {
            float f11 = rectF2.left;
            float f12 = rectF3.left;
            if (f11 < f12 && rectF2.right > f12) {
                float f13 = f12 - f11;
                rectF.left += f13;
                rectF2.left += f13;
            }
            float f14 = rectF2.right;
            float f15 = rectF3.right;
            if (f14 <= f15 || rectF2.left >= f15) {
                return;
            }
            float f16 = f14 - f15;
            rectF.right = Math.max(rectF.right - f16, rectF.left);
            rectF2.right = Math.max(rectF2.right - f16, rectF2.left);
        }

        @Override // cn.e
        public int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f9272b.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // cn.e
        public float f(RecyclerView.LayoutParams layoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        }

        @Override // cn.e
        public RectF g(float f11, float f12, float f13, float f14) {
            return new RectF(f14, 0.0f, f12 - f14, f11);
        }

        @Override // cn.e
        public int h() {
            return this.f9272b.getHeight() - this.f9272b.getPaddingBottom();
        }

        @Override // cn.e
        public int i() {
            return this.f9272b.P() ? j() : k();
        }

        @Override // cn.e
        public int j() {
            return 0;
        }

        @Override // cn.e
        public int k() {
            return this.f9272b.getWidth();
        }

        @Override // cn.e
        public int l() {
            return this.f9272b.P() ? k() : j();
        }

        @Override // cn.e
        public int m() {
            return this.f9272b.getPaddingTop();
        }

        @Override // cn.e
        public void n(View view, int i11, int i12) {
            int m11 = m();
            this.f9272b.layoutDecoratedWithMargins(view, i11, m11, i12, m11 + e(view));
        }

        @Override // cn.e
        public void o(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.right <= rectF3.left) {
                float floor = ((float) Math.floor(rectF.right)) - 1.0f;
                rectF.right = floor;
                rectF.left = Math.min(rectF.left, floor);
            }
            if (rectF2.left >= rectF3.right) {
                float ceil = ((float) Math.ceil(rectF.left)) + 1.0f;
                rectF.left = ceil;
                rectF.right = Math.max(ceil, rectF.right);
            }
        }

        @Override // cn.e
        public void p(View view, Rect rect, float f11, float f12) {
            view.offsetLeftAndRight((int) (f12 - (rect.left + f11)));
        }
    }

    public /* synthetic */ e(int i11, a aVar) {
        this(i11);
    }

    public static e b(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    public static e c(CarouselLayoutManager carouselLayoutManager, int i11) {
        if (i11 == 0) {
            return b(carouselLayoutManager);
        }
        if (i11 == 1) {
            return d(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static e d(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    public abstract void a(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract int e(View view);

    public abstract float f(RecyclerView.LayoutParams layoutParams);

    public abstract RectF g(float f11, float f12, float f13, float f14);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract void n(View view, int i11, int i12);

    public abstract void o(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract void p(View view, Rect rect, float f11, float f12);

    public e(int i11) {
        this.f9270a = i11;
    }
}
