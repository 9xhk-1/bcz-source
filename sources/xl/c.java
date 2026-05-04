package xl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c10.d;
import g10.u;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import org.junit.jupiter.api.j2;
import w00.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class c extends xl.a {

    /* renamed from: m, reason: collision with root package name */
    public static final String f98148m = "RangedDecor";

    /* renamed from: n, reason: collision with root package name */
    public static final a f98149n = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public int f98150j;

    /* renamed from: k, reason: collision with root package name */
    public int f98151k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f98152l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(v vVar) {
            this();
        }
    }

    @k
    public c(@m80.k Context context, int i11) {
        this(context, i11, 0, 0, false, 28, null);
    }

    @Override // xl.a
    public void e(@m80.k Canvas canvas, @m80.k RecyclerView parent) {
        int height;
        int i11;
        g0.q(canvas, "canvas");
        g0.q(parent, "parent");
        Drawable c11 = c();
        if (c11 != null) {
            canvas.save();
            if (parent.getClipToPadding()) {
                i11 = parent.getPaddingTop();
                height = parent.getHeight() - parent.getPaddingBottom();
                canvas.clipRect(parent.getPaddingLeft(), i11, parent.getWidth() - parent.getPaddingRight(), height);
            } else {
                height = parent.getHeight();
                i11 = 0;
            }
            int childCount = parent.getChildCount();
            int u11 = u.u(this.f98150j, 0);
            RecyclerView.Adapter adapter = parent.getAdapter();
            if (adapter != null) {
                int itemCount = adapter.getItemCount();
                int i12 = this.f98151k;
                if (i12 >= 0) {
                    itemCount = u.B(i12, itemCount);
                }
                for (int i13 = 0; i13 < childCount; i13++) {
                    View child = parent.getChildAt(i13);
                    int childAdapterPosition = parent.getChildAdapterPosition(child);
                    if (b()) {
                        Log.d(f98148m, "pos: " + childAdapterPosition);
                    }
                    if (childAdapterPosition != -1 && u11 <= childAdapterPosition && itemCount > childAdapterPosition) {
                        parent.getDecoratedBoundsWithMargins(child, a());
                        if (this.f98152l) {
                            int i14 = a().left;
                            g0.h(child, "child");
                            int L0 = i14 - d.L0(child.getTranslationY());
                            c11.setBounds(L0, i11, c11.getIntrinsicWidth() + L0, height);
                        } else {
                            int i15 = a().right;
                            g0.h(child, "child");
                            int L02 = i15 + d.L0(child.getTranslationX());
                            c11.setBounds(L02 - c11.getIntrinsicWidth(), i11, L02, height);
                        }
                        c11.draw(canvas);
                    }
                }
                canvas.restore();
            }
        }
    }

    @Override // xl.a
    public void f(@m80.k Canvas canvas, @m80.k RecyclerView parent) {
        int width;
        int i11;
        g0.q(canvas, "canvas");
        g0.q(parent, "parent");
        canvas.save();
        Drawable c11 = c();
        if (c11 != null) {
            if (parent.getClipToPadding()) {
                i11 = parent.getPaddingLeft();
                width = parent.getWidth() - parent.getPaddingRight();
                canvas.clipRect(i11, parent.getPaddingTop(), width, parent.getHeight() - parent.getPaddingBottom());
            } else {
                width = parent.getWidth();
                i11 = 0;
            }
            int childCount = parent.getChildCount();
            int u11 = u.u(this.f98150j, 0);
            RecyclerView.Adapter adapter = parent.getAdapter();
            if (adapter != null) {
                int itemCount = adapter.getItemCount();
                int i12 = this.f98151k;
                if (i12 >= 0) {
                    itemCount = u.B(i12, itemCount);
                }
                if (b()) {
                    Log.d(f98148m, "draw: [" + u11 + j2.O + itemCount + ')');
                }
                for (int i13 = 0; i13 < childCount; i13++) {
                    View child = parent.getChildAt(i13);
                    int childAdapterPosition = parent.getChildAdapterPosition(child);
                    if (b()) {
                        Log.d(f98148m, "pos: " + childAdapterPosition);
                    }
                    if (childAdapterPosition != -1 && u11 <= childAdapterPosition && itemCount > childAdapterPosition) {
                        parent.getDecoratedBoundsWithMargins(child, a());
                        if (this.f98152l) {
                            int i14 = a().top;
                            g0.h(child, "child");
                            int L0 = i14 - d.L0(child.getTranslationY());
                            c11.setBounds(i11, L0, width, c11.getIntrinsicHeight() + L0);
                        } else {
                            int i15 = a().bottom;
                            g0.h(child, "child");
                            int L02 = i15 + d.L0(child.getTranslationY());
                            int intrinsicHeight = L02 - c11.getIntrinsicHeight();
                            if (b()) {
                                Log.d(f98148m, i11 + j2.O + intrinsicHeight + j2.O + width + j2.O + L02);
                            }
                            c11.setBounds(i11, intrinsicHeight, width, L02);
                        }
                        c11.draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@m80.k Rect outRect, @m80.k View view, @m80.k RecyclerView parent, @m80.k RecyclerView.State state) {
        g2 g2Var;
        g0.q(outRect, "outRect");
        g0.q(view, "view");
        g0.q(parent, "parent");
        g0.q(state, "state");
        Drawable c11 = c();
        if (c11 != null) {
            RecyclerView.Adapter adapter = parent.getAdapter();
            if (adapter != null) {
                int itemCount = adapter.getItemCount();
                int childAdapterPosition = parent.getChildAdapterPosition(view);
                int u11 = u.u(this.f98150j, 0);
                int i11 = this.f98151k;
                if (i11 >= 0) {
                    itemCount = u.B(i11, itemCount);
                }
                if (d() == 1) {
                    if (u11 <= childAdapterPosition && itemCount > childAdapterPosition) {
                        outRect.set(0, this.f98152l ? c11.getIntrinsicHeight() : 0, 0, this.f98152l ? 0 : c11.getIntrinsicHeight());
                    } else {
                        outRect.set(0, 0, 0, 0);
                    }
                } else if (u11 <= childAdapterPosition && itemCount > childAdapterPosition) {
                    outRect.set(this.f98152l ? c11.getIntrinsicWidth() : 0, 0, this.f98152l ? 0 : c11.getIntrinsicWidth(), 0);
                }
                g2Var = g2.f100423a;
            } else {
                g2Var = null;
            }
            if (g2Var != null) {
                return;
            }
        }
        outRect.set(0, 0, 0, 0);
        g2 g2Var2 = g2.f100423a;
    }

    public final void i(boolean z11) {
        this.f98152l = z11;
    }

    @k
    public c(@m80.k Context context, int i11, int i12) {
        this(context, i11, i12, 0, false, 24, null);
    }

    @k
    public c(@m80.k Context context, int i11, int i12, int i13) {
        this(context, i11, i12, i13, false, 16, null);
    }

    public /* synthetic */ c(Context context, int i11, int i12, int i13, boolean z11, int i14, v vVar) {
        this(context, i11, (i14 & 4) != 0 ? -1 : i12, (i14 & 8) != 0 ? -1 : i13, (i14 & 16) != 0 ? false : z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @k
    public c(@m80.k Context context, int i11, int i12, int i13, boolean z11) {
        super(context, i11);
        g0.q(context, "context");
        this.f98150j = i12;
        this.f98151k = i13;
        this.f98152l = z11;
    }
}
