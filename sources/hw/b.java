package hw;

import android.view.View;
import com.sina.weibo.sdk.web.WebActivity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebActivity f59791a;

    public b(WebActivity webActivity) {
        this.f59791a = webActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebActivity webActivity = this.f59791a;
        webActivity.f41590a.setVisibility(8);
        webActivity.f41593d.setVisibility(0);
        this.f59791a.f41593d.reload();
    }
}
