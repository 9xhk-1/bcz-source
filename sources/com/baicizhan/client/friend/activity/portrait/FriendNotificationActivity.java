package com.baicizhan.client.friend.activity.portrait;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.friend.model.SocialNetwork;
import com.baicizhan.client.friend.model.UIState;
import com.baicizhan.online.bs_socials.BBFriendMsg;
import com.jiongji.andriod.card.R;
import gs.jc;
import java.util.List;
import q9.x;
import va.f;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FriendNotificationActivity extends BaseAppCompatActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final String f17620f = "FriendNotificationActivity";

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f17621a;

    /* renamed from: b, reason: collision with root package name */
    public ac.c f17622b;

    /* renamed from: c, reason: collision with root package name */
    public View f17623c;

    /* renamed from: d, reason: collision with root package name */
    public f f17624d;

    /* renamed from: e, reason: collision with root package name */
    public jc f17625e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            FriendNotificationActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            FriendNotificationActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements SocialNetwork.Listener<List<BBFriendMsg>> {
        public c() {
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(List<BBFriendMsg> res) {
            FriendNotificationActivity.this.f17622b.m(res);
            FriendNotificationActivity.this.L0(res.isEmpty() ? UIState.EMPTY : UIState.COMPLETE);
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        public void onError(Exception e11) {
            FriendNotificationActivity.this.L0(UIState.ERROR);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17629a;

        static {
            int[] iArr = new int[UIState.values().length];
            f17629a = iArr;
            try {
                iArr[UIState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17629a[UIState.COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17629a[UIState.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17629a[UIState.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void K0() {
        L0(UIState.LOADING);
        SocialNetwork.fetchNotifications(f17620f, new c());
    }

    public static void M0(Context context) {
        context.startActivity(new Intent(context, (Class<?>) FriendNotificationActivity.class));
    }

    public final void L0(UIState state) {
        int i11 = d.f17629a[state.ordinal()];
        if (i11 == 1) {
            if (!this.f17624d.isShowing()) {
                this.f17624d.show();
            }
            this.f17621a.setVisibility(8);
            this.f17623c.setVisibility(8);
            return;
        }
        if (i11 == 2) {
            if (this.f17624d.isShowing()) {
                this.f17624d.dismiss();
            }
            this.f17621a.setVisibility(0);
            this.f17623c.setVisibility(8);
            return;
        }
        if (i11 == 3) {
            if (this.f17624d.isShowing()) {
                this.f17624d.dismiss();
            }
            this.f17621a.setVisibility(4);
            this.f17623c.setVisibility(0);
            return;
        }
        if (i11 != 4) {
            return;
        }
        if (this.f17624d.isShowing()) {
            this.f17624d.dismiss();
        }
        this.f17621a.setVisibility(4);
        this.f17623c.setVisibility(8);
        g.i("请在稳定的网络下重试", 0);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (x.r().c(this)) {
            return;
        }
        setTheme(R.style.AppCompatStandardDefault);
        jc jcVar = (jc) DataBindingUtil.setContentView(this, R.layout.friend_notification_activity_portrait);
        this.f17625e = jcVar;
        jcVar.f55485a.D(new a());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.notifications);
        this.f17621a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        eu.a aVar = new eu.a(this);
        aVar.d(new ColorDrawable(-3029578));
        this.f17621a.addItemDecoration(aVar);
        ac.c cVar = new ac.c(this);
        this.f17622b = cVar;
        this.f17621a.setAdapter(cVar);
        this.f17623c = findViewById(R.id.empty_view);
        f fVar = new f(this);
        this.f17624d = fVar;
        fVar.setCancelable(true);
        this.f17624d.setCanceledOnTouchOutside(false);
        this.f17624d.setOnCancelListener(new b());
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.baicizhan.client.business.thrift.c.b().b(f17620f);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        K0();
    }
}
