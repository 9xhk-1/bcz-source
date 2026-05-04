package com.baicizhan.main.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bt.q;
import com.jiongji.andriod.card.R;
import java.util.HashMap;
import java.util.Map;
import xb.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class WordListNavigation extends ViewGroup implements View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public static final Map<String, Integer> f20185h;

    /* renamed from: a, reason: collision with root package name */
    public int f20186a;

    /* renamed from: b, reason: collision with root package name */
    public int f20187b;

    /* renamed from: c, reason: collision with root package name */
    public int f20188c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f20189d;

    /* renamed from: e, reason: collision with root package name */
    public int f20190e;

    /* renamed from: f, reason: collision with root package name */
    public q f20191f;

    /* renamed from: g, reason: collision with root package name */
    public c f20192g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f20193a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f20194b;

        public a(final int val$index, final boolean val$user) {
            this.f20193a = val$index;
            this.f20194b = val$user;
        }

        @Override // java.lang.Runnable
        public void run() {
            WordListNavigation.this.d(this.f20193a, this.f20194b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements q.g {
        public b() {
        }

        @Override // bt.q.g
        public void a(q valueAnimator) {
            WordListNavigation.this.f20188c = ((Integer) valueAnimator.R()).intValue();
            WordListNavigation.this.postInvalidate();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(int index, boolean user);
    }

    static {
        HashMap hashMap = new HashMap();
        f20185h = hashMap;
        hashMap.put("已学单词", Integer.valueOf(R.id.learned));
        hashMap.put("未学单词", Integer.valueOf(R.id.unlearned));
        hashMap.put("已斩单词", Integer.valueOf(R.id.killed));
        hashMap.put("收藏单词", Integer.valueOf(R.id.collection));
    }

    public WordListNavigation(Context context) {
        this(context, null, 0);
    }

    public void c(String... tabs) {
        for (String str : tabs) {
            TextView textView = new TextView(getContext());
            textView.setTextColor(getContext().getResources().getColor(R.color.main_color_black));
            textView.setTextSize(2, 13.0f);
            textView.setGravity(17);
            textView.setText(str);
            Map<String, Integer> map = f20185h;
            if (map.containsKey(str)) {
                textView.setId(map.get(str).intValue());
            }
            addView(textView);
            textView.setOnClickListener(this);
        }
    }

    public final void d(int index, boolean user) {
        if (index < 0 || index >= getChildCount() || this.f20186a == index) {
            return;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            TextView textView = (TextView) getChildAt(i11);
            textView.setSelected(false);
            textView.setTypeface(Typeface.defaultFromStyle(0));
        }
        q qVar = this.f20191f;
        if (qVar != null) {
            qVar.cancel();
        }
        q g02 = q.g0(this.f20188c, this.f20187b * index);
        this.f20191f = g02;
        g02.G(new b());
        this.f20191f.l(500L);
        this.f20191f.s();
        this.f20186a = index;
        TextView textView2 = (TextView) getChildAt(index);
        textView2.setSelected(true);
        textView2.setTypeface(Typeface.defaultFromStyle(1));
        c cVar = this.f20192g;
        if (cVar != null) {
            cVar.a(this.f20186a, user);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float height = getHeight() - (this.f20190e / 2.0f);
        canvas.drawLine(this.f20188c, height, r0 + this.f20187b, height, this.f20189d);
    }

    public void e(final int index, boolean user) {
        if (this.f20187b == 0) {
            post(new a(index, user));
        } else {
            d(index, user);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        setSelected(indexOfChild(v11));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        if (getChildCount() == 0) {
            return;
        }
        this.f20187b = (r11 - l11) / getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).layout(i11, 0, this.f20187b + i11, b11 - t11);
            i11 += this.f20187b;
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode == 0 || mode2 == 0) {
            throw new IllegalArgumentException("measure mode error");
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size / childCount, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        setMeasuredDimension(size, size2);
    }

    public void setOnTabChangeListener(c listener) {
        this.f20192g = listener;
    }

    public void setSelected(final int index) {
        e(index, true);
    }

    public WordListNavigation(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public WordListNavigation(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f20186a = -1;
        this.f20187b = 0;
        this.f20188c = 0;
        Paint paint = new Paint();
        this.f20189d = paint;
        paint.setColor(context.getResources().getColor(R.color.main_color_black));
        int a11 = i.a(context, 2.0f);
        this.f20190e = a11;
        this.f20189d.setStrokeWidth(a11);
    }
}
