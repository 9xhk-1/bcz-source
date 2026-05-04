package fj;

import a00.k1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.widget.ViewPager2;
import com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel;
import com.baicizhan.main.wikiv2.studyv2.data.f0;
import com.jiongji.andriod.card.R;
import fj.p;
import gs.lg;
import kotlin.jvm.internal.g0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class p extends li.e<f0, b> {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final a f51945j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f51946k = 8;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final String f51947l = "WikiSentenceBinder";

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final StudyWikiV2ViewModel f51948e;

    /* renamed from: f, reason: collision with root package name */
    public int f51949f;

    /* renamed from: g, reason: collision with root package name */
    public int f51950g;

    /* renamed from: h, reason: collision with root package name */
    public int f51951h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f51952i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends li.b<lg> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p f51953e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k p pVar, lg itemBinding) {
            super(itemBinding);
            g0.p(itemBinding, "itemBinding");
            this.f51953e = pVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewPager2 f51954a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f51955b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f51956c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f0 f51957d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int[] f51958e;

        public c(ViewPager2 viewPager2, p pVar, b bVar, f0 f0Var, int[] iArr) {
            this.f51954a = viewPager2;
            this.f51955b = pVar;
            this.f51956c = bVar;
            this.f51957d = f0Var;
            this.f51958e = iArr;
        }

        public static final void b(p pVar, b bVar, f0 f0Var, int i11) {
            pVar.L(bVar.b(), f0Var, i11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            super.onPageScrollStateChanged(i11);
            if (this.f51955b.f51950g >= 0) {
                int i12 = this.f51955b.f51950g;
                int[] iArr = this.f51958e;
                if (i12 >= iArr.length) {
                    return;
                }
                if (i11 == 1) {
                    iArr[this.f51955b.f51950g] = this.f51954a.getHeight();
                    qb.c.b(p.f51947l, "pagerHeightArray:" + a00.a0.bz(this.f51958e), new Object[0]);
                }
                if (i11 == 2) {
                    this.f51954a.setUserInputEnabled(false);
                }
                if (i11 == 0) {
                    this.f51955b.f51951h = this.f51954a.getHeight();
                    this.f51955b.f51950g = this.f51954a.getCurrentItem();
                    this.f51954a.setUserInputEnabled(true);
                }
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            int i13;
            int i14;
            super.onPageScrolled(i11, f11, i12);
            if (f11 == 0.0f || i12 == 0) {
                return;
            }
            if (this.f51955b.f51950g == i11) {
                int i15 = this.f51955b.f51950g + 1;
                int[] iArr = this.f51958e;
                if (i15 >= iArr.length || iArr[this.f51955b.f51950g + 1] <= 0) {
                    return;
                }
                i13 = this.f51958e[this.f51955b.f51950g + 1] - this.f51958e[this.f51955b.f51950g];
                i14 = this.f51958e[this.f51955b.f51950g];
            } else {
                if (this.f51955b.f51950g < 1) {
                    return;
                }
                int i16 = this.f51955b.f51950g;
                int[] iArr2 = this.f51958e;
                if (i16 >= iArr2.length) {
                    return;
                }
                i13 = iArr2[this.f51955b.f51950g] - this.f51958e[this.f51955b.f51950g - 1];
                i14 = this.f51958e[this.f51955b.f51950g - 1];
            }
            int width = (int) (i13 * (i12 / this.f51954a.getWidth()));
            ViewPager2 viewPager2 = this.f51954a;
            ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
            layoutParams.height = width + i14;
            viewPager2.setLayoutParams(layoutParams);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(final int i11) {
            super.onPageSelected(i11);
            ViewPager2 viewPager2 = this.f51954a;
            final p pVar = this.f51955b;
            final b bVar = this.f51956c;
            final f0 f0Var = this.f51957d;
            viewPager2.post(new Runnable() { // from class: fj.q
                @Override // java.lang.Runnable
                public final void run() {
                    p.c.b(p.this, bVar, f0Var, i11);
                }
            });
            if (!this.f51955b.f51952i) {
                this.f51955b.F().b(ma.a.E4, k1.k(h1.a(ma.b.f72950u1, Integer.valueOf(i11))));
            }
            this.f51955b.f51952i = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@m80.k LifecycleOwner lifecycleOwner, @m80.k StudyWikiV2ViewModel vm2) {
        super(lifecycleOwner);
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(vm2, "vm");
        this.f51948e = vm2;
        this.f51951h = -1;
        this.f51952i = true;
    }

    public static final void H(f0 f0Var, int[] iArr, ViewPager2 viewPager2, p pVar) {
        if (f0Var.e().isEmpty()) {
            return;
        }
        iArr[0] = viewPager2.getHeight();
        pVar.f51951h = viewPager2.getHeight();
    }

    public static final void I(p pVar, ViewPager2 viewPager2, int[] iArr, View page, float f11) {
        g0.p(page, "page");
        g0.m(viewPager2);
        pVar.M(page, viewPager2, f11, iArr);
    }

    public static final void N(View view, float f11, p pVar, int[] iArr) {
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (f11 > 0.0f) {
            int i11 = pVar.f51950g;
            if (i11 + 1 < pVar.f51949f) {
                iArr[i11 + 1] = view.getMeasuredHeight();
            }
        }
    }

    public final int E() {
        return this.f51949f;
    }

    @m80.k
    public final StudyWikiV2ViewModel F() {
        return this.f51948e;
    }

    @Override // p50.e
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k b holder, @m80.k final f0 pages) {
        g0.p(holder, "holder");
        g0.p(pages, "pages");
        if (pages.e().isEmpty()) {
            return;
        }
        this.f51949f = pages.e().size();
        final int[] iArr = new int[pages.e().size()];
        final ViewPager2 viewPager2 = holder.b().f55775b;
        viewPager2.setAdapter(new ej.e(pages.e(), this.f51948e, p()));
        viewPager2.registerOnPageChangeCallback(new c(viewPager2, this, holder, pages, iArr));
        viewPager2.post(new Runnable() { // from class: fj.n
            @Override // java.lang.Runnable
            public final void run() {
                p.H(f0.this, iArr, viewPager2, this);
            }
        });
        viewPager2.setPageTransformer(new ViewPager2.PageTransformer() { // from class: fj.o
            @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
            public final void transformPage(View view, float f11) {
                p.I(p.this, viewPager2, iArr, view, f11);
            }
        });
    }

    @Override // li.e
    @m80.k
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public b q(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        lg e11 = lg.e(inflater, parent, false);
        g0.o(e11, "inflate(...)");
        return new b(this, e11);
    }

    public final void K(int i11) {
        this.f51949f = i11;
    }

    public final void L(lg lgVar, f0 f0Var, int i11) {
        lgVar.f55774a.removeAllViews();
        if (f0Var.e().size() <= 1) {
            LinearLayout linearLayout = lgVar.f55774a;
            g0.m(linearLayout);
            sa.q.z(linearLayout, false);
            return;
        }
        LinearLayout indicatorLayout = lgVar.f55774a;
        g0.o(indicatorLayout, "indicatorLayout");
        sa.q.z(indicatorLayout, true);
        int size = f0Var.e().size();
        int i12 = 0;
        while (i12 < size) {
            ImageView imageView = new ImageView(lgVar.getRoot().getContext());
            imageView.setImageResource(R.drawable.shape_wiki_page_indicator_selector);
            imageView.setSelected(i12 == i11);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(xb.i.a(lgVar.getRoot().getContext(), 4.0f), 0, xb.i.a(lgVar.getRoot().getContext(), 4.0f), 0);
            imageView.setLayoutParams(layoutParams);
            lgVar.f55774a.addView(imageView);
            i12++;
        }
    }

    public final void M(final View view, ViewPager2 viewPager2, final float f11, final int[] iArr) {
        view.post(new Runnable() { // from class: fj.m
            @Override // java.lang.Runnable
            public final void run() {
                p.N(view, f11, this, iArr);
            }
        });
    }
}
