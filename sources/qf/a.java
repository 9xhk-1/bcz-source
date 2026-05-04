package qf;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class a extends RecyclerView.ItemDecoration {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final C1018a f82069j = new C1018a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f82070k = 8;

    /* renamed from: l, reason: collision with root package name */
    public static final String f82071l = a.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    public final int f82072a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82073b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82074c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f82075d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f82076e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f82077f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f82078g;

    /* renamed from: h, reason: collision with root package name */
    public final int f82079h;

    /* renamed from: i, reason: collision with root package name */
    public final int f82080i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: qf.a$a, reason: collision with other inner class name */
    public static final class C1018a {
        public /* synthetic */ C1018a(v vVar) {
            this();
        }

        public C1018a() {
        }
    }

    public a(int i11, int i12, int i13, boolean z11, boolean z12, boolean z13, boolean z14, int i14, int i15) {
        this.f82072a = i11;
        this.f82073b = i12;
        this.f82074c = i13;
        this.f82075d = z11;
        this.f82076e = z12;
        this.f82077f = z13;
        this.f82078g = z14;
        this.f82079h = i14;
        this.f82080i = i15;
        if (i11 <= 0) {
            throw new RuntimeException("columnCount must be greater than 0!");
        }
    }

    public final void a(Rect rect, int i11, int i12, int i13) {
        int i14;
        int i15;
        rect.left = (this.f82075d && i12 == 0) ? this.f82073b : i12 < this.f82072a ? this.f82073b / 2 : 0;
        int i16 = this.f82072a;
        rect.right = (i12 == i16 + (-1) && this.f82077f) ? this.f82073b : i12 < i16 + (-1) ? this.f82073b / 2 : 0;
        if (!this.f82076e || i11 >= i16) {
            i14 = 0;
        } else {
            i14 = this.f82079h;
            if (i14 <= 0) {
                i14 = this.f82074c;
            }
        }
        rect.top = i14;
        if (i11 < ((i13 - 1) / i16) * i16) {
            i15 = this.f82074c;
        } else if (this.f82078g) {
            i15 = this.f82080i;
            if (i15 <= 0) {
                i15 = this.f82073b;
            }
        } else {
            i15 = 0;
        }
        rect.bottom = i15;
        qb.c.b(f82071l, i11 + j2.O + i12 + j2.O + i13 + j2.O + rect, new Object[0]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@k Rect outRect, @k View view, @k RecyclerView parent, @k RecyclerView.State state) {
        g0.p(outRect, "outRect");
        g0.p(view, "view");
        g0.p(parent, "parent");
        g0.p(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        a(outRect, childAdapterPosition, childAdapterPosition % this.f82072a, state.getItemCount());
    }

    public /* synthetic */ a(int i11, int i12, int i13, boolean z11, boolean z12, boolean z13, boolean z14, int i14, int i15, int i16, v vVar) {
        this(i11, (i16 & 2) != 0 ? 0 : i12, (i16 & 4) != 0 ? 0 : i13, (i16 & 8) != 0 ? false : z11, (i16 & 16) != 0 ? false : z12, (i16 & 32) != 0 ? false : z13, (i16 & 64) != 0 ? false : z14, (i16 & 128) != 0 ? 0 : i14, (i16 & 256) != 0 ? 0 : i15);
    }
}
