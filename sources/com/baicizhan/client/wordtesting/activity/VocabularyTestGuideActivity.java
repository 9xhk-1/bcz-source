package com.baicizhan.client.wordtesting.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.baicizhan.base.BaseActivity;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.jiongji.andriod.card.R;
import ma.l;
import ma.t;
import sa.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class VocabularyTestGuideActivity extends BaseActivity {

    /* renamed from: a, reason: collision with root package name */
    public c f17787a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends c {
        public a() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            int id2 = v11.getId();
            if (id2 == R.id.close) {
                VocabularyTestGuideActivity.this.finish();
                return;
            }
            if (id2 == R.id.test_reading) {
                BczWebHelperKt.startReadTest(VocabularyTestGuideActivity.this, "popup");
                l.a(t.f73013l, ma.a.f72846u0);
                VocabularyTestGuideActivity.this.finish();
            } else if (id2 == R.id.test_listening) {
                BczWebHelperKt.startListenerTest(VocabularyTestGuideActivity.this, "popup");
                l.a(t.f73013l, ma.a.f72853v0);
                VocabularyTestGuideActivity.this.finish();
            }
        }
    }

    public static void I0(Context context) {
        context.startActivity(new Intent(context, (Class<?>) VocabularyTestGuideActivity.class));
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary_test_guide);
        findViewById(R.id.close).setOnClickListener(this.f17787a);
        findViewById(R.id.test_reading).setOnClickListener(this.f17787a);
        findViewById(R.id.test_listening).setOnClickListener(this.f17787a);
    }
}
