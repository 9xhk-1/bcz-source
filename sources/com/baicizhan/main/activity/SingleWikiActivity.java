package com.baicizhan.main.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.main.wikiv2.studyv2.data.v0;
import com.jiongji.andriod.card.R;
import hg.u;
import li.c;
import li.f;
import q9.x;
import wi.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SingleWikiActivity extends BaseAppCompatActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final int f18203f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final String f18204g = "extra_wiki_src";

    /* renamed from: h, reason: collision with root package name */
    public static final String f18205h = "extra_need_custom_pending_anim";

    /* renamed from: i, reason: collision with root package name */
    public static final String f18206i = "extra_topic_record";

    /* renamed from: j, reason: collision with root package name */
    public static final String f18207j = "extra_wiki_style";

    /* renamed from: k, reason: collision with root package name */
    public static final String f18208k = "extra_killed_id";

    /* renamed from: a, reason: collision with root package name */
    public c f18209a;

    /* renamed from: b, reason: collision with root package name */
    public int f18210b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18211c = true;

    /* renamed from: d, reason: collision with root package name */
    public int f18212d;

    /* renamed from: e, reason: collision with root package name */
    public TopicRecord f18213e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements f {
        public a() {
        }

        @Override // li.f
        public void C(Integer killedId) {
            if (killedId != null) {
                Intent intent = new Intent();
                intent.putExtra(SingleWikiActivity.f18208k, SingleWikiActivity.this.f18213e.topicId);
                SingleWikiActivity.this.setResult(-1, intent);
            }
            SingleWikiActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (this.f18211c) {
            overridePendingTransition(R.anim.business_no_fade, R.anim.business_push_down_out);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        c cVar = this.f18209a;
        if (cVar == null) {
            super.onBackPressed();
        } else {
            if (cVar.d()) {
                return;
            }
            super.onBackPressed();
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (x.r().c(this)) {
            return;
        }
        if (bundle != null) {
            this.f18213e = (TopicRecord) bundle.getParcelable(f18206i);
            this.f18210b = bundle.getInt(f18204g);
            this.f18211c = bundle.getBoolean(f18205h);
            this.f18212d = bundle.getInt(f18207j);
        } else {
            Intent intent = getIntent();
            this.f18213e = (TopicRecord) intent.getParcelableExtra(f18206i);
            this.f18210b = intent.getIntExtra(f18204g, 0);
            this.f18211c = intent.getBooleanExtra(f18205h, this.f18211c);
            this.f18212d = intent.getIntExtra(f18207j, 0);
        }
        if (this.f18211c) {
            overridePendingTransition(R.anim.business_push_down_in, R.anim.business_no_fade);
        }
        setContentView(R.layout.activity_single_wiki);
        if (this.f18213e == null) {
            throw new IllegalArgumentException("必须传入一个 非空 TopicRecord对象以显示.");
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        if (this.f18210b == 0) {
            v0 v0Var = v0.f26118a;
            TopicRecord topicRecord = this.f18213e;
            c c11 = v0Var.c(topicRecord.topicId, topicRecord.bookId);
            this.f18209a = c11;
            c11.j(new a());
            beginTransaction.add(R.id.frame, (Fragment) this.f18209a, (String) null);
        } else {
            beginTransaction.add(R.id.frame, u.v(this.f18213e), (String) null);
        }
        beginTransaction.commit();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        try {
            super.onDestroy();
        } catch (Exception e11) {
            qb.c.c("", "single activity onDestroy error, is alive? " + x.r().L(), e11);
        }
        p.f96399a.a();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(f18204g, this.f18210b);
        outState.putBoolean(f18205h, this.f18211c);
        outState.putInt(f18207j, this.f18212d);
        outState.putParcelable(f18206i, this.f18213e);
    }
}
