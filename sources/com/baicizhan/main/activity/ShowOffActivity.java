package com.baicizhan.main.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import com.baicizhan.base.BaseActivity;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.baicizhan.client.business.auth.share.ShareDelegate;
import com.baicizhan.client.business.auth.share.ShareParams;
import com.baicizhan.client.business.util.BottomSheetUtils;
import com.baicizhan.client.business.widget.share.SharePickerSheetView;
import com.baicizhan.main.customview.ShowOffDragView;
import com.baicizhan.online.user_study_api.UserFinishBookFlauntInfo;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import com.jiongji.andriod.card.R;
import gs.h2;
import gs.om;
import qb0.h;
import va.g;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ShowOffActivity extends BaseActivity implements ShowOffDragView.b, ShareDelegate.b {

    /* renamed from: k, reason: collision with root package name */
    public static final String f18166k = "ShowOffActivity";

    /* renamed from: l, reason: collision with root package name */
    public static final String f18167l = "book_name";

    /* renamed from: m, reason: collision with root package name */
    public static final String f18168m = "word";

    /* renamed from: n, reason: collision with root package name */
    public static final String f18169n = "round";

    /* renamed from: o, reason: collision with root package name */
    public static final String f18170o = "book_id";

    /* renamed from: p, reason: collision with root package name */
    public static final String f18171p = "b_flaunt_share_weixin";

    /* renamed from: q, reason: collision with root package name */
    public static final String f18172q = "b_flaunt_share_weixin_circle";

    /* renamed from: r, reason: collision with root package name */
    public static final String f18173r = "b_flaunt_share_qq";

    /* renamed from: s, reason: collision with root package name */
    public static final String f18174s = "b_flaunt_share_qq_circle";

    /* renamed from: a, reason: collision with root package name */
    public SharePickerSheetView f18175a;

    /* renamed from: b, reason: collision with root package name */
    public ShareDelegate f18176b;

    /* renamed from: c, reason: collision with root package name */
    public h2 f18177c;

    /* renamed from: d, reason: collision with root package name */
    public String f18178d;

    /* renamed from: e, reason: collision with root package name */
    public int f18179e;

    /* renamed from: f, reason: collision with root package name */
    public int f18180f;

    /* renamed from: g, reason: collision with root package name */
    public int f18181g;

    /* renamed from: h, reason: collision with root package name */
    public h f18182h;

    /* renamed from: i, reason: collision with root package name */
    public UserFinishBookFlauntInfo f18183i;

    /* renamed from: j, reason: collision with root package name */
    public ShareParams f18184j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements p<UserStudyApiService.Client, UserFinishBookFlauntInfo> {
        public b() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserFinishBookFlauntInfo call(UserStudyApiService.Client client) {
            try {
                return client.user_finish_book_faunt(ShowOffActivity.this.f18181g, ShowOffActivity.this.f18180f);
            } catch (Throwable th2) {
                throw vb0.a.c(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18187a;

        static {
            int[] iArr = new int[ShareChannel.values().length];
            f18187a = iArr;
            try {
                iArr[ShareChannel.QQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18187a[ShareChannel.QZONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18187a[ShareChannel.WEIXIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18187a[ShareChannel.WEIXIN_CIRCLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static Intent M0(Activity context, String bookName, int word, int round, int bookId) {
        Intent intent = new Intent(context, (Class<?>) ShowOffActivity.class);
        intent.putExtra("book_name", bookName);
        intent.putExtra("word", word);
        intent.putExtra(f18169n, round);
        intent.putExtra("book_id", bookId);
        return intent;
    }

    private void O0() {
        h2 h2Var = (h2) DataBindingUtil.setContentView(this, R.layout.activity_showoff);
        this.f18177c = h2Var;
        om omVar = h2Var.f55131b;
        omVar.f56261j.m(omVar, this);
        int i11 = this.f18180f;
        if (i11 == 0) {
            this.f18177c.f55131b.f56261j.l(this.f18178d, this.f18179e);
        } else {
            this.f18177c.f55131b.f56261j.k(this.f18178d, this.f18179e, i11);
        }
    }

    private void P0() {
        this.f18177c.f55131b.f56261j.i();
        h hVar = this.f18182h;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f18182h.unsubscribe();
        }
        this.f18182h = com.baicizhan.client.business.thrift.p.b("/rpc/user_study").w5(bc0.c.e()).c3(new b()).I3(tb0.a.a()).r5(new a());
    }

    public static void Q0(Activity context, String bookName, int word, int round, int bookId) {
        context.startActivity(M0(context, bookName, word, round, bookId));
        context.overridePendingTransition(R.anim.slide_in_from_bottom, R.anim.business_no_fade_long);
    }

    public final void N0() {
        Intent intent = getIntent();
        this.f18178d = intent.getStringExtra("book_name");
        this.f18179e = intent.getIntExtra("word", 1024);
        this.f18180f = intent.getIntExtra(f18169n, this.f18180f);
        this.f18181g = intent.getIntExtra("book_id", 0);
    }

    @Override // com.baicizhan.main.customview.ShowOffDragView.b
    public void b0() {
        share();
    }

    @Override // com.baicizhan.main.customview.ShowOffDragView.b
    public void e() {
        finish();
        overridePendingTransition(R.anim.activity_nothing, R.anim.slide_out_to_bottom);
    }

    @Override // com.baicizhan.main.customview.ShowOffDragView.b
    public void f() {
        P0();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        SharePickerSheetView sharePickerSheetView = this.f18175a;
        if (sharePickerSheetView != null) {
            sharePickerSheetView.h(requestCode, resultCode, data);
        }
        ShareDelegate shareDelegate = this.f18176b;
        if (shareDelegate != null) {
            shareDelegate.r(this, requestCode, resultCode, data);
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        N0();
        O0();
        P0();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        SharePickerSheetView.j();
        ShareDelegate shareDelegate = this.f18176b;
        if (shareDelegate != null) {
            shareDelegate.s();
        }
    }

    @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
    public void onShareCancel() {
        this.f18177c.f55130a.u();
    }

    @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
    public void onShareError(ShareChannel media, Throwable throwable) {
        g.i("分享失败，" + throwable.getMessage(), 0);
    }

    @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
    public void onShareSend(ShareChannel media) {
        this.f18177c.f55130a.u();
        int i11 = c.f18187a[media.ordinal()];
    }

    @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
    public void onShareStart(ShareChannel media) {
        if (this.f18184j == null || this.f18183i == null) {
            return;
        }
        if (ShareChannel.WEIXIN.equals(media) || ShareChannel.WEIXIN_CIRCLE.equals(media)) {
            this.f18184j.f16057a = this.f18183i.share_url_weixin;
        } else {
            this.f18184j.f16057a = this.f18183i.share_url_qq;
        }
        this.f18175a.l(this.f18184j);
    }

    @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
    public void onShareSuccess(ShareChannel media) {
        g.i("分享成功", 0);
    }

    public void share() {
        if (this.f18183i == null) {
            return;
        }
        ShareParams shareParams = new ShareParams();
        this.f18184j = shareParams;
        UserFinishBookFlauntInfo userFinishBookFlauntInfo = this.f18183i;
        shareParams.f16057a = userFinishBookFlauntInfo.share_url_weixin;
        shareParams.f16058b = userFinishBookFlauntInfo.share_title;
        shareParams.f16059c = userFinishBookFlauntInfo.share_desc;
        shareParams.f16060d = userFinishBookFlauntInfo.share_img_url;
        SharePickerSheetView sharePickerSheetView = this.f18175a;
        if (sharePickerSheetView == null) {
            this.f18175a = new SharePickerSheetView.a().e(true).d(this.f18184j).b(this).a(this);
        } else {
            sharePickerSheetView.l(shareParams);
        }
        this.f18177c.f55130a.u();
        BottomSheetUtils.showSheetView(this.f18177c.f55130a, this.f18175a);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<UserFinishBookFlauntInfo> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            ShowOffActivity.this.f18177c.f55131b.f56261j.g();
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(UserFinishBookFlauntInfo info) {
            ShowOffActivity.this.f18183i = info;
            ShowOffActivity.this.f18177c.f55131b.f56261j.h(info.total_daka_days, info.user_unfinish_percentage);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
