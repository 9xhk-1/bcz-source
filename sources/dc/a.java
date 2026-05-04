package dc;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.baicizhan.client.business.auth.share.ShareDelegate;
import com.baicizhan.client.business.auth.share.ShareParams;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.client.business.widget.DialogFragmentActivity;
import com.jiongji.andriod.card.R;
import java.lang.ref.WeakReference;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends DialogFragment implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public static final String f47673f = "url";

    /* renamed from: g, reason: collision with root package name */
    public static final String f47674g = "video_name";

    /* renamed from: h, reason: collision with root package name */
    public static final String f47675h = "title_desc";

    /* renamed from: i, reason: collision with root package name */
    public static final String f47676i = "title";

    /* renamed from: a, reason: collision with root package name */
    public String f47677a;

    /* renamed from: b, reason: collision with root package name */
    public String f47678b;

    /* renamed from: c, reason: collision with root package name */
    public String f47679c;

    /* renamed from: d, reason: collision with root package name */
    public String f47680d;

    /* renamed from: e, reason: collision with root package name */
    public ShareDelegate f47681e;

    public static a t(String url, String videoName, String titleDesc, String title) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putString("url", url);
        bundle.putString(f47674g, videoName);
        bundle.putString(f47675h, titleDesc);
        bundle.putString("title", title);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (R.id.share_weixin_close == id2) {
            dismiss();
            return;
        }
        if (R.id.share_weixin_timeline == id2) {
            y();
        } else if (R.id.share_weixin_friends == id2) {
            w();
        } else if (R.id.share_qzone == id2) {
            x();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, R.style.bczDialogStyle);
        if (savedInstanceState == null) {
            savedInstanceState = getArguments();
        }
        this.f47677a = savedInstanceState.getString("url");
        this.f47678b = savedInstanceState.getString(f47674g);
        this.f47679c = savedInstanceState.getString(f47675h);
        this.f47680d = savedInstanceState.getString("title");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.tv_share_weixin_dialog, container);
        View findViewById = inflate.findViewById(R.id.share_weixin_container);
        findViewById.setOnClickListener(null);
        ThemeResUtil.setMessageShareBg(getActivity(), findViewById);
        inflate.findViewById(R.id.share_weixin_close).setOnClickListener(this);
        inflate.findViewById(R.id.share_weixin_timeline).setOnClickListener(this);
        inflate.findViewById(R.id.share_weixin_friends).setOnClickListener(this);
        inflate.findViewById(R.id.share_qzone).setOnClickListener(this);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ShareDelegate shareDelegate = this.f47681e;
        if (shareDelegate != null) {
            shareDelegate.s();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        if (getActivity() != null) {
            DialogFragmentActivity.I0(getActivity(), dialog);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (outState != null) {
            outState.putString("url", this.f47677a);
            outState.putString(f47675h, this.f47679c);
            outState.putString("title", this.f47680d);
        }
    }

    public final void v(final ShareChannel scene) {
        ShareParams shareParams = new ShareParams();
        shareParams.f16057a = this.f47677a;
        shareParams.f16059c = this.f47679c;
        shareParams.f16058b = this.f47680d;
        shareParams.f16062f = R.drawable.business_baicizhan;
        this.f47681e = ShareDelegate.i(getActivity()).v(shareParams).u(new C0559a(this)).w(scene);
    }

    public final void w() {
        v(ShareChannel.WEIXIN);
    }

    public final void x() {
        v(ShareChannel.QZONE);
    }

    public final void y() {
        v(ShareChannel.WEIXIN_CIRCLE);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: dc.a$a, reason: collision with other inner class name */
    public static class C0559a implements ShareDelegate.b {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<a> f47682a;

        public C0559a(a fragment) {
            this.f47682a = new WeakReference<>(fragment);
        }

        @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
        public void onShareError(ShareChannel media, Throwable throwable) {
            a aVar = this.f47682a.get();
            if (aVar == null) {
                return;
            }
            g.i("分享失败，原因:" + throwable.getMessage(), 0);
            aVar.dismissAllowingStateLoss();
        }

        @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
        public void onShareSuccess(ShareChannel media) {
            a aVar = this.f47682a.get();
            if (aVar == null) {
                return;
            }
            g.i("分享成功", 0);
            aVar.dismissAllowingStateLoss();
        }

        @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
        public void onShareCancel() {
        }

        @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
        public void onShareSend(ShareChannel media) {
        }

        @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
        public void onShareStart(ShareChannel shareChannel) {
        }
    }
}
