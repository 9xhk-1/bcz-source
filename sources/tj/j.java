package tj;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class j {

    /* renamed from: f, reason: collision with root package name */
    public static final int f90714f = 150;

    /* renamed from: g, reason: collision with root package name */
    public static final int f90715g = 48;

    /* renamed from: d, reason: collision with root package name */
    public ValueAnimator f90719d;

    /* renamed from: a, reason: collision with root package name */
    public Map<c0, Boolean> f90716a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f90717b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f90718c = 0;

    /* renamed from: e, reason: collision with root package name */
    public float f90720e = 0.0f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            j.this.f90720e = ((Float) animation.getAnimatedValue()).floatValue();
            for (Map.Entry entry : j.this.f90716a.entrySet()) {
                if (((Boolean) entry.getValue()).booleanValue()) {
                    ((c0) entry.getKey()).f90667f.setTranslationX(-j.this.f90720e);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            j.this.f90720e = ((Float) animation.getAnimatedValue()).floatValue();
            for (Map.Entry entry : j.this.f90716a.entrySet()) {
                if (((Boolean) entry.getValue()).booleanValue()) {
                    ((c0) entry.getKey()).f90667f.setTranslationX(-j.this.f90720e);
                }
            }
        }
    }

    public final void d() {
        int i11 = this.f90718c;
        ValueAnimator duration = ValueAnimator.ofFloat(this.f90720e, i11).setDuration((int) (((i11 - r2) / i11) * 150.0f));
        this.f90719d = duration;
        duration.setInterpolator(new LinearInterpolator());
        this.f90719d.addUpdateListener(new a());
        this.f90719d.start();
    }

    public final void e() {
        ValueAnimator duration = ValueAnimator.ofFloat(this.f90720e, 0.0f).setDuration((int) ((r0 / this.f90718c) * 150.0f));
        this.f90719d = duration;
        duration.setInterpolator(new LinearInterpolator());
        this.f90719d.addUpdateListener(new b());
        this.f90719d.start();
    }

    public void f(c0 holder) {
        this.f90716a.put(holder, Boolean.FALSE);
        if (this.f90718c == 0) {
            h(holder);
        }
        holder.f90667f.setTranslationX(this.f90717b ? -this.f90718c : 0.0f);
    }

    public void g(boolean enableEdit) {
        this.f90717b = enableEdit;
        ValueAnimator valueAnimator = this.f90719d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Iterator<Map.Entry<c0, Boolean>> it = this.f90716a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().setValue(Boolean.TRUE);
        }
        if (this.f90717b) {
            d();
        } else {
            e();
        }
    }

    public final void h(c0 holder) {
        LinearLayout linearLayout = holder.f90667f;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f90718c = linearLayout.getMeasuredWidth() - xb.f.a(pb.a.a().getApplicationContext(), 48.0f);
    }
}
