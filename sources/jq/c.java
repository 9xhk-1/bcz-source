package jq;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.handmark.pulltorefresh.library.internal.LoadingLayout;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet<LoadingLayout> f64612a = new HashSet<>();

    public void a(LoadingLayout layout) {
        if (layout != null) {
            this.f64612a.add(layout);
        }
    }

    @Override // jq.b
    public void setLastUpdatedLabel(CharSequence label) {
        Iterator<LoadingLayout> it = this.f64612a.iterator();
        while (it.hasNext()) {
            it.next().setLastUpdatedLabel(label);
        }
    }

    @Override // jq.b
    public void setLoadingDrawable(Drawable drawable) {
        Iterator<LoadingLayout> it = this.f64612a.iterator();
        while (it.hasNext()) {
            it.next().setLoadingDrawable(drawable);
        }
    }

    @Override // jq.b
    public void setPullLabel(CharSequence label) {
        Iterator<LoadingLayout> it = this.f64612a.iterator();
        while (it.hasNext()) {
            it.next().setPullLabel(label);
        }
    }

    @Override // jq.b
    public void setRefreshingLabel(CharSequence refreshingLabel) {
        Iterator<LoadingLayout> it = this.f64612a.iterator();
        while (it.hasNext()) {
            it.next().setRefreshingLabel(refreshingLabel);
        }
    }

    @Override // jq.b
    public void setReleaseLabel(CharSequence label) {
        Iterator<LoadingLayout> it = this.f64612a.iterator();
        while (it.hasNext()) {
            it.next().setReleaseLabel(label);
        }
    }

    @Override // jq.b
    public void setTextTypeface(Typeface tf2) {
        Iterator<LoadingLayout> it = this.f64612a.iterator();
        while (it.hasNext()) {
            it.next().setTextTypeface(tf2);
        }
    }
}
