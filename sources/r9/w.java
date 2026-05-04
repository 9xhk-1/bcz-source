package r9;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.KotlinExtKt;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: i, reason: collision with root package name */
    public static final int f83833i = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final View f83834a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final ViewGroup f83835b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final View f83836c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final TextView f83837d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final TextView f83838e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final TextView f83839f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final ImageView f83840g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final ImageView f83841h;

    public w(@m80.k View adMainContainer, @m80.k ViewGroup imageContainer, @m80.k View adBottom, @m80.k TextView skipView, @m80.k TextView jumpView, @m80.k TextView adMarkView, @m80.k ImageView logo, @m80.k ImageView copyright) {
        g0.p(adMainContainer, "adMainContainer");
        g0.p(imageContainer, "imageContainer");
        g0.p(adBottom, "adBottom");
        g0.p(skipView, "skipView");
        g0.p(jumpView, "jumpView");
        g0.p(adMarkView, "adMarkView");
        g0.p(logo, "logo");
        g0.p(copyright, "copyright");
        this.f83834a = adMainContainer;
        this.f83835b = imageContainer;
        this.f83836c = adBottom;
        this.f83837d = skipView;
        this.f83838e = jumpView;
        this.f83839f = adMarkView;
        this.f83840g = logo;
        this.f83841h = copyright;
    }

    public static /* synthetic */ w j(w wVar, View view, ViewGroup viewGroup, View view2, TextView textView, TextView textView2, TextView textView3, ImageView imageView, ImageView imageView2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            view = wVar.f83834a;
        }
        if ((i11 & 2) != 0) {
            viewGroup = wVar.f83835b;
        }
        if ((i11 & 4) != 0) {
            view2 = wVar.f83836c;
        }
        if ((i11 & 8) != 0) {
            textView = wVar.f83837d;
        }
        if ((i11 & 16) != 0) {
            textView2 = wVar.f83838e;
        }
        if ((i11 & 32) != 0) {
            textView3 = wVar.f83839f;
        }
        if ((i11 & 64) != 0) {
            imageView = wVar.f83840g;
        }
        if ((i11 & 128) != 0) {
            imageView2 = wVar.f83841h;
        }
        ImageView imageView3 = imageView;
        ImageView imageView4 = imageView2;
        TextView textView4 = textView2;
        TextView textView5 = textView3;
        return wVar.i(view, viewGroup, view2, textView, textView4, textView5, imageView3, imageView4);
    }

    @m80.k
    public final View a() {
        return this.f83834a;
    }

    @m80.k
    public final ViewGroup b() {
        return this.f83835b;
    }

    @m80.k
    public final View c() {
        return this.f83836c;
    }

    @m80.k
    public final TextView d() {
        return this.f83837d;
    }

    @m80.k
    public final TextView e() {
        return this.f83838e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return g0.g(this.f83834a, wVar.f83834a) && g0.g(this.f83835b, wVar.f83835b) && g0.g(this.f83836c, wVar.f83836c) && g0.g(this.f83837d, wVar.f83837d) && g0.g(this.f83838e, wVar.f83838e) && g0.g(this.f83839f, wVar.f83839f) && g0.g(this.f83840g, wVar.f83840g) && g0.g(this.f83841h, wVar.f83841h);
    }

    @m80.k
    public final TextView f() {
        return this.f83839f;
    }

    @m80.k
    public final ImageView g() {
        return this.f83840g;
    }

    @m80.k
    public final ImageView h() {
        return this.f83841h;
    }

    public int hashCode() {
        return (((((((((((((this.f83834a.hashCode() * 31) + this.f83835b.hashCode()) * 31) + this.f83836c.hashCode()) * 31) + this.f83837d.hashCode()) * 31) + this.f83838e.hashCode()) * 31) + this.f83839f.hashCode()) * 31) + this.f83840g.hashCode()) * 31) + this.f83841h.hashCode();
    }

    @m80.k
    public final w i(@m80.k View adMainContainer, @m80.k ViewGroup imageContainer, @m80.k View adBottom, @m80.k TextView skipView, @m80.k TextView jumpView, @m80.k TextView adMarkView, @m80.k ImageView logo, @m80.k ImageView copyright) {
        g0.p(adMainContainer, "adMainContainer");
        g0.p(imageContainer, "imageContainer");
        g0.p(adBottom, "adBottom");
        g0.p(skipView, "skipView");
        g0.p(jumpView, "jumpView");
        g0.p(adMarkView, "adMarkView");
        g0.p(logo, "logo");
        g0.p(copyright, "copyright");
        return new w(adMainContainer, imageContainer, adBottom, skipView, jumpView, adMarkView, logo, copyright);
    }

    public final void k() {
        KotlinExtKt.expandTouchArea(this.f83836c, 5);
    }

    @m80.k
    public final View l() {
        return this.f83836c;
    }

    @m80.k
    public final View m() {
        return this.f83834a;
    }

    @m80.k
    public final TextView n() {
        return this.f83839f;
    }

    @m80.k
    public final ImageView o() {
        return this.f83841h;
    }

    @m80.k
    public final ViewGroup p() {
        return this.f83835b;
    }

    @m80.k
    public final TextView q() {
        return this.f83838e;
    }

    @m80.k
    public final ImageView r() {
        return this.f83840g;
    }

    @m80.k
    public final TextView s() {
        return this.f83837d;
    }

    @m80.k
    public String toString() {
        return "SplashViewData(adMainContainer=" + this.f83834a + ", imageContainer=" + this.f83835b + ", adBottom=" + this.f83836c + ", skipView=" + this.f83837d + ", jumpView=" + this.f83838e + ", adMarkView=" + this.f83839f + ", logo=" + this.f83840g + ", copyright=" + this.f83841h + pn.j.f81007d;
    }
}
