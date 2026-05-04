package hg;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.LayoutRes;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.baicizhan.client.business.webview.args.Arguments;
import com.baicizhan.client.business.webview.ui.BczWebFragment;
import com.jiongji.andriod.card.R;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class j extends BczWebFragment {

    /* renamed from: a, reason: collision with root package name */
    public static final String f59290a = "LittleClassFragment";

    /* renamed from: b, reason: collision with root package name */
    public static int f59291b = ia.a.c(ia.a.f60468s);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            BczWebHelperKt.startLittleClassCollect(j.this.getActivity());
        }
    }

    public static j x0() {
        String format = String.format(Locale.US, "%s/little_class?device_name=%s&night_mode=%s", PathUtil.getDataDns(), "android", "false");
        Bundle bundle = new Bundle();
        bundle.putString(Arguments.ARG_DEFAULT_URL, format);
        bundle.putInt(Arguments.ARG_URL_STRATEGY, 0);
        j jVar = new j();
        jVar.setArguments(bundle);
        return jVar;
    }

    public static void y0(int time) {
        f59291b = time;
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment
    @LayoutRes
    public int getTitleBarResource() {
        return R.layout.little_class_main_title;
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment
    public boolean loadFromCache() {
        return ia.a.c(ia.a.f60468s) == f59291b;
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment
    public boolean needCache() {
        return true;
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        ia.a.k(ia.a.f60468s, f59291b);
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment
    public void onViewInited(View parent) {
        parent.findViewById(R.id.collect).setOnClickListener(new a());
    }
}
