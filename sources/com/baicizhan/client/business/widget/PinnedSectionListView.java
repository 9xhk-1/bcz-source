package com.baicizhan.client.business.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SectionIndexer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class PinnedSectionListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f17135a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f17136b;

    /* renamed from: c, reason: collision with root package name */
    public int f17137c;

    /* renamed from: d, reason: collision with root package name */
    public View f17138d;

    /* renamed from: e, reason: collision with root package name */
    public MotionEvent f17139e;

    /* renamed from: f, reason: collision with root package name */
    public GradientDrawable f17140f;

    /* renamed from: g, reason: collision with root package name */
    public int f17141g;

    /* renamed from: h, reason: collision with root package name */
    public int f17142h;

    /* renamed from: i, reason: collision with root package name */
    public AbsListView.OnScrollListener f17143i;

    /* renamed from: j, reason: collision with root package name */
    public d f17144j;

    /* renamed from: k, reason: collision with root package name */
    public d f17145k;

    /* renamed from: l, reason: collision with root package name */
    public int f17146l;

    /* renamed from: m, reason: collision with root package name */
    public final AbsListView.OnScrollListener f17147m;

    /* renamed from: n, reason: collision with root package name */
    public final DataSetObserver f17148n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17149o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements AbsListView.OnScrollListener {
        public a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
            AbsListView.OnScrollListener onScrollListener = PinnedSectionListView.this.f17143i;
            if (onScrollListener != null) {
                onScrollListener.onScroll(view, firstVisibleItem, visibleItemCount, totalItemCount);
            }
            ListAdapter adapter = PinnedSectionListView.this.getAdapter();
            if (adapter == null || visibleItemCount == 0) {
                return;
            }
            if (PinnedSectionListView.i(adapter, adapter.getItemViewType(firstVisibleItem))) {
                if (PinnedSectionListView.this.getChildAt(0).getTop() == PinnedSectionListView.this.getPaddingTop()) {
                    PinnedSectionListView.this.c();
                    return;
                } else {
                    PinnedSectionListView.this.d(firstVisibleItem, firstVisibleItem, visibleItemCount);
                    return;
                }
            }
            int e11 = PinnedSectionListView.this.e(firstVisibleItem);
            if (e11 > -1) {
                PinnedSectionListView.this.d(e11, firstVisibleItem, visibleItemCount);
            } else {
                PinnedSectionListView.this.c();
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView view, int scrollState) {
            AbsListView.OnScrollListener onScrollListener = PinnedSectionListView.this.f17143i;
            if (onScrollListener != null) {
                onScrollListener.onScrollStateChanged(view, scrollState);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PinnedSectionListView.this.l();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            PinnedSectionListView.this.l();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PinnedSectionListView.this.l();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public View f17153a;

        /* renamed from: b, reason: collision with root package name */
        public int f17154b;

        /* renamed from: c, reason: collision with root package name */
        public long f17155c;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e extends ListAdapter {
        boolean a(int viewType);
    }

    public PinnedSectionListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f17135a = new Rect();
        this.f17136b = new PointF();
        this.f17147m = new a();
        this.f17148n = new b();
        this.f17149o = false;
        h();
    }

    public static boolean i(ListAdapter adapter, int viewType) {
        if (adapter instanceof HeaderViewListAdapter) {
            adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
        }
        return ((e) adapter).a(viewType);
    }

    public final void a() {
        this.f17138d = null;
        MotionEvent motionEvent = this.f17139e;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.f17139e = null;
        }
    }

    public void b(int position) {
        d dVar = this.f17144j;
        this.f17144j = null;
        if (dVar == null) {
            dVar = new d();
        }
        View view = getAdapter().getView(position, dVar.f17153a, this);
        AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = (AbsListView.LayoutParams) generateDefaultLayoutParams();
            view.setLayoutParams(layoutParams);
        }
        int mode = View.MeasureSpec.getMode(layoutParams.height);
        int size = View.MeasureSpec.getSize(layoutParams.height);
        if (mode == 0) {
            mode = 1073741824;
        }
        int height = (getHeight() - getListPaddingTop()) - getListPaddingBottom();
        if (size > height) {
            size = height;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getWidth() - getListPaddingLeft()) - getListPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(size, mode));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f17146l = 0;
        dVar.f17153a = view;
        dVar.f17154b = position;
        dVar.f17155c = getAdapter().getItemId(position);
        this.f17145k = dVar;
    }

    public void c() {
        d dVar = this.f17145k;
        if (dVar != null) {
            this.f17144j = dVar;
            this.f17145k = null;
        }
    }

    public void d(int sectionPosition, int firstVisibleItem, int visibleItemCount) {
        if (visibleItemCount < 2) {
            c();
            return;
        }
        d dVar = this.f17145k;
        if (dVar != null && dVar.f17154b != sectionPosition) {
            c();
        }
        if (this.f17145k == null) {
            b(sectionPosition);
        }
        int i11 = sectionPosition + 1;
        if (i11 < getCount()) {
            int f11 = f(i11, visibleItemCount - (i11 - firstVisibleItem));
            if (f11 <= -1) {
                this.f17146l = 0;
                this.f17141g = Integer.MAX_VALUE;
                return;
            }
            View childAt = getChildAt(f11 - firstVisibleItem);
            int top = childAt.getTop() - (this.f17145k.f17153a.getBottom() + getPaddingTop());
            this.f17141g = top;
            if (top < 0) {
                this.f17146l = top;
            } else {
                this.f17146l = 0;
            }
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f17145k != null) {
            int listPaddingLeft = getListPaddingLeft();
            int listPaddingTop = getListPaddingTop();
            View view = this.f17145k.f17153a;
            canvas.save();
            canvas.clipRect(listPaddingLeft, listPaddingTop, view.getWidth() + listPaddingLeft, view.getHeight() + (this.f17140f == null ? 0 : Math.min(this.f17142h, this.f17141g)) + listPaddingTop);
            canvas.translate(listPaddingLeft, listPaddingTop + this.f17146l);
            drawChild(canvas, this.f17145k.f17153a, getDrawingTime());
            GradientDrawable gradientDrawable = this.f17140f;
            if (gradientDrawable != null && this.f17141g > 0) {
                gradientDrawable.setBounds(this.f17145k.f17153a.getLeft(), this.f17145k.f17153a.getBottom(), this.f17145k.f17153a.getRight(), this.f17145k.f17153a.getBottom() + this.f17142h);
                this.f17140f.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev2) {
        d dVar;
        float x11 = ev2.getX();
        float y11 = ev2.getY();
        int action = ev2.getAction();
        if (action == 0 && this.f17138d == null && (dVar = this.f17145k) != null && j(dVar.f17153a, x11, y11)) {
            this.f17138d = this.f17145k.f17153a;
            PointF pointF = this.f17136b;
            pointF.x = x11;
            pointF.y = y11;
            this.f17139e = MotionEvent.obtain(ev2);
        }
        View view = this.f17138d;
        if (view == null) {
            try {
                return super.dispatchTouchEvent(ev2);
            } catch (Exception unused) {
                return true;
            }
        }
        if (j(view, x11, y11)) {
            this.f17138d.dispatchTouchEvent(ev2);
        }
        if (action == 1) {
            super.dispatchTouchEvent(ev2);
            k();
            a();
        } else if (action == 3) {
            a();
        } else if (action == 2 && Math.abs(y11 - this.f17136b.y) > this.f17137c) {
            MotionEvent obtain = MotionEvent.obtain(ev2);
            obtain.setAction(3);
            this.f17138d.dispatchTouchEvent(obtain);
            obtain.recycle();
            super.dispatchTouchEvent(this.f17139e);
            super.dispatchTouchEvent(ev2);
            a();
        }
        return true;
    }

    public int e(int fromPosition) {
        ListAdapter adapter = getAdapter();
        if (fromPosition >= adapter.getCount()) {
            return -1;
        }
        if (adapter instanceof SectionIndexer) {
            SectionIndexer sectionIndexer = (SectionIndexer) adapter;
            int positionForSection = sectionIndexer.getPositionForSection(sectionIndexer.getSectionForPosition(fromPosition));
            if (i(adapter, adapter.getItemViewType(positionForSection))) {
                return positionForSection;
            }
        }
        while (fromPosition >= 0) {
            if (i(adapter, adapter.getItemViewType(fromPosition))) {
                return fromPosition;
            }
            fromPosition--;
        }
        return -1;
    }

    public int f(int firstVisibleItem, int visibleItemCount) {
        ListAdapter adapter = getAdapter();
        int count = adapter.getCount();
        if (getLastVisiblePosition() >= count) {
            return -1;
        }
        if (firstVisibleItem + visibleItemCount >= count) {
            visibleItemCount = count - firstVisibleItem;
        }
        for (int i11 = 0; i11 < visibleItemCount; i11++) {
            int i12 = firstVisibleItem + i11;
            if (i(adapter, adapter.getItemViewType(i12))) {
                return i12;
            }
        }
        return -1;
    }

    public void g(boolean visible) {
        if (visible) {
            if (this.f17140f == null) {
                this.f17140f = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#ffa0a0a0"), Color.parseColor("#50a0a0a0"), Color.parseColor("#00a0a0a0")});
                this.f17142h = (int) (getResources().getDisplayMetrics().density * 8.0f);
                return;
            }
            return;
        }
        if (this.f17140f != null) {
            this.f17140f = null;
            this.f17142h = 0;
        }
    }

    public final void h() {
        setOnScrollListener(this.f17147m);
        this.f17137c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        g(true);
    }

    public final boolean j(View view, float x11, float y11) {
        view.getHitRect(this.f17135a);
        Rect rect = this.f17135a;
        int i11 = rect.top;
        int i12 = this.f17146l;
        rect.top = i11 + i12;
        rect.bottom += i12 + getPaddingTop();
        this.f17135a.left += getPaddingLeft();
        this.f17135a.right -= getPaddingRight();
        return this.f17135a.contains((int) x11, (int) y11);
    }

    public final boolean k() {
        AdapterView.OnItemClickListener onItemClickListener;
        if (this.f17145k == null || (onItemClickListener = getOnItemClickListener()) == null || !getAdapter().isEnabled(this.f17145k.f17154b)) {
            return false;
        }
        View view = this.f17145k.f17153a;
        playSoundEffect(0);
        if (view != null) {
            view.sendAccessibilityEvent(1);
        }
        d dVar = this.f17145k;
        onItemClickListener.onItemClick(this, view, dVar.f17154b, dVar.f17155c);
        return true;
    }

    public void l() {
        int firstVisiblePosition;
        int e11;
        c();
        ListAdapter adapter = getAdapter();
        if (adapter == null || adapter.getCount() <= 0 || (e11 = e((firstVisiblePosition = getFirstVisiblePosition()))) == -1) {
            return;
        }
        d(e11, firstVisiblePosition, getLastVisiblePosition() - firstVisiblePosition);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev2) {
        if (!this.f17149o || ev2.getAction() == 0) {
            return super.onInterceptTouchEvent(ev2);
        }
        return false;
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        super.onLayout(changed, l11, t11, r11, b11);
        if (this.f17145k == null || ((r11 - l11) - getPaddingLeft()) - getPaddingRight() == this.f17145k.f17153a.getWidth()) {
            return;
        }
        l();
    }

    @Override // android.widget.AbsListView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(state);
        post(new c());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
        this.f17149o = disallowIntercept;
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener listener) {
        if (listener == this.f17147m) {
            super.setOnScrollListener(listener);
        } else {
            this.f17143i = listener;
        }
    }

    public void setShadowVisible(boolean visible) {
        g(visible);
        d dVar = this.f17145k;
        if (dVar != null) {
            View view = dVar.f17153a;
            invalidate(view.getLeft(), view.getTop(), view.getRight(), view.getBottom() + this.f17142h);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter adapter) {
        if (adapter != null) {
            if (!(adapter instanceof e)) {
                throw new IllegalArgumentException("Does your adapter implement PinnedSectionListAdapter?");
            }
            if (adapter.getViewTypeCount() < 2) {
                throw new IllegalArgumentException("Does your adapter handle at least two types of views in getViewTypeCount() method: items and sections?");
            }
        }
        ListAdapter adapter2 = getAdapter();
        if (adapter2 != null) {
            adapter2.unregisterDataSetObserver(this.f17148n);
        }
        if (adapter != null) {
            adapter.registerDataSetObserver(this.f17148n);
        }
        if (adapter2 != adapter) {
            c();
        }
        super.setAdapter(adapter);
    }

    public PinnedSectionListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f17135a = new Rect();
        this.f17136b = new PointF();
        this.f17147m = new a();
        this.f17148n = new b();
        this.f17149o = false;
        h();
    }
}
