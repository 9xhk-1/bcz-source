package wm;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class d<V extends View> extends f<V> {

    /* renamed from: k, reason: collision with root package name */
    public static final int f96487k = -1;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public Runnable f96488d;

    /* renamed from: e, reason: collision with root package name */
    public OverScroller f96489e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f96490f;

    /* renamed from: g, reason: collision with root package name */
    public int f96491g;

    /* renamed from: h, reason: collision with root package name */
    public int f96492h;

    /* renamed from: i, reason: collision with root package name */
    public int f96493i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public VelocityTracker f96494j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final CoordinatorLayout f96495a;

        /* renamed from: b, reason: collision with root package name */
        public final V f96496b;

        public a(CoordinatorLayout coordinatorLayout, V v11) {
            this.f96495a = coordinatorLayout;
            this.f96496b = v11;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f96496b == null || (overScroller = d.this.f96489e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                d.this.w(this.f96495a, this.f96496b);
                return;
            }
            d dVar = d.this;
            dVar.y(this.f96495a, this.f96496b, dVar.f96489e.getCurrY());
            ViewCompat.postOnAnimation(this.f96496b, this);
        }
    }

    public d() {
        this.f96491g = -1;
        this.f96493i = -1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f96493i < 0) {
            this.f96493i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f96490f) {
            int i11 = this.f96491g;
            if (i11 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i11)) == -1) {
                return false;
            }
            int y11 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y11 - this.f96492h) > this.f96493i) {
                this.f96492h = y11;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f96491g = -1;
            int x11 = (int) motionEvent.getX();
            int y12 = (int) motionEvent.getY();
            boolean z11 = q(v11) && coordinatorLayout.isPointInChildBounds(v11, x11, y12);
            this.f96490f = z11;
            if (z11) {
                this.f96492h = y12;
                this.f96491g = motionEvent.getPointerId(0);
                r();
                OverScroller overScroller = this.f96489e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f96489e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f96494j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r10, @androidx.annotation.NonNull V r11, @androidx.annotation.NonNull android.view.MotionEvent r12) {
        /*
            r9 = this;
            int r1 = r12.getActionMasked()
            r6 = -1
            r7 = 0
            r8 = 1
            if (r1 == r8) goto L4d
            r3 = 2
            if (r1 == r3) goto L2d
            r2 = 3
            if (r1 == r2) goto L71
            r2 = 6
            if (r1 == r2) goto L13
            goto L4b
        L13:
            int r1 = r12.getActionIndex()
            if (r1 != 0) goto L1b
            r1 = r8
            goto L1c
        L1b:
            r1 = r7
        L1c:
            int r2 = r12.getPointerId(r1)
            r9.f96491g = r2
            float r1 = r12.getY(r1)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.f96492h = r1
            goto L4b
        L2d:
            int r1 = r9.f96491g
            int r1 = r12.findPointerIndex(r1)
            if (r1 != r6) goto L36
            return r7
        L36:
            float r1 = r12.getY(r1)
            int r1 = (int) r1
            int r3 = r9.f96492h
            int r3 = r3 - r1
            r9.f96492h = r1
            int r4 = r9.t(r11)
            r5 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.x(r1, r2, r3, r4, r5)
        L4b:
            r1 = r7
            goto L80
        L4d:
            android.view.VelocityTracker r1 = r9.f96494j
            if (r1 == 0) goto L71
            r1.addMovement(r12)
            android.view.VelocityTracker r1 = r9.f96494j
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            android.view.VelocityTracker r1 = r9.f96494j
            int r3 = r9.f96491g
            float r5 = r1.getYVelocity(r3)
            int r1 = r9.u(r11)
            int r3 = -r1
            r4 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.s(r1, r2, r3, r4, r5)
            r1 = r8
            goto L72
        L71:
            r1 = r7
        L72:
            r9.f96490f = r7
            r9.f96491g = r6
            android.view.VelocityTracker r2 = r9.f96494j
            if (r2 == 0) goto L80
            r2.recycle()
            r2 = 0
            r9.f96494j = r2
        L80:
            android.view.VelocityTracker r2 = r9.f96494j
            if (r2 == 0) goto L87
            r2.addMovement(r12)
        L87:
            boolean r2 = r9.f96490f
            if (r2 != 0) goto L8f
            if (r1 == 0) goto L8e
            goto L8f
        L8e:
            return r7
        L8f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wm.d.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean q(V v11) {
        return false;
    }

    public final void r() {
        if (this.f96494j == null) {
            this.f96494j = VelocityTracker.obtain();
        }
    }

    public final boolean s(CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11, int i12, float f11) {
        Runnable runnable = this.f96488d;
        if (runnable != null) {
            v11.removeCallbacks(runnable);
            this.f96488d = null;
        }
        if (this.f96489e == null) {
            this.f96489e = new OverScroller(v11.getContext());
        }
        this.f96489e.fling(0, i(), 0, Math.round(f11), 0, 0, i11, i12);
        if (!this.f96489e.computeScrollOffset()) {
            w(coordinatorLayout, v11);
            return false;
        }
        a aVar = new a(coordinatorLayout, v11);
        this.f96488d = aVar;
        ViewCompat.postOnAnimation(v11, aVar);
        return true;
    }

    public int t(@NonNull V v11) {
        return -v11.getHeight();
    }

    public int u(@NonNull V v11) {
        return v11.getHeight();
    }

    public int v() {
        return i();
    }

    public final int x(CoordinatorLayout coordinatorLayout, V v11, int i11, int i12, int i13) {
        return z(coordinatorLayout, v11, v() - i11, i12, i13);
    }

    public int y(CoordinatorLayout coordinatorLayout, V v11, int i11) {
        return z(coordinatorLayout, v11, i11, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int z(CoordinatorLayout coordinatorLayout, V v11, int i11, int i12, int i13) {
        int clamp;
        int i14 = i();
        if (i12 == 0 || i14 < i12 || i14 > i13 || i14 == (clamp = MathUtils.clamp(i11, i12, i13))) {
            return 0;
        }
        o(clamp);
        return i14 - clamp;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f96491g = -1;
        this.f96493i = -1;
    }

    public void w(CoordinatorLayout coordinatorLayout, V v11) {
    }
}
