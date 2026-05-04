package com.baicizhan.main.wikiv2.lookup.wikiv2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import com.baicizhan.main.wikiv2.lookup.wikiv2.WikiSceneFragment;
import com.baicizhan.online.resource_api.GetTopicResourceChannel;
import com.jiongji.andriod.card.R;
import gs.x2;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@qu.b
/* loaded from: classes3.dex */
public final class WikiSceneActivity extends Hilt_WikiSceneActivity {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f25595e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f25596f = 8;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final String f25597g = "topic_id";

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final String f25598h = "book_id";

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final String f25599i = "channel";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public static /* synthetic */ void d(a aVar, Context context, int i11, int i12, GetTopicResourceChannel getTopicResourceChannel, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                i12 = 0;
            }
            if ((i13 & 8) != 0) {
                getTopicResourceChannel = GetTopicResourceChannel.LOOK_UP;
            }
            aVar.c(context, i11, i12, getTopicResourceChannel);
        }

        @w00.k
        @w00.o
        public final void a(@m80.k Context context, int i11) {
            kotlin.jvm.internal.g0.p(context, "context");
            d(this, context, i11, 0, null, 12, null);
        }

        @w00.k
        @w00.o
        public final void b(@m80.k Context context, int i11, int i12) {
            kotlin.jvm.internal.g0.p(context, "context");
            d(this, context, i11, i12, null, 8, null);
        }

        @w00.k
        @w00.o
        public final void c(@m80.k Context context, int i11, int i12, @m80.k GetTopicResourceChannel channel) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(channel, "channel");
            Intent intent = new Intent(context, (Class<?>) WikiSceneActivity.class);
            intent.putExtra("topic_id", i11);
            intent.putExtra("book_id", i12);
            intent.putExtra("channel", channel);
            context.startActivity(intent);
        }

        public a() {
        }
    }

    public static final void J0(WikiSceneActivity wikiSceneActivity, View view) {
        wikiSceneActivity.finish();
    }

    @w00.k
    @w00.o
    public static final void K0(@m80.k Context context, int i11) {
        f25595e.a(context, i11);
    }

    @w00.k
    @w00.o
    public static final void L0(@m80.k Context context, int i11, int i12) {
        f25595e.b(context, i11, i12);
    }

    @w00.k
    @w00.o
    public static final void M0(@m80.k Context context, int i11, int i12, @m80.k GetTopicResourceChannel getTopicResourceChannel) {
        f25595e.c(context, i11, i12, getTopicResourceChannel);
    }

    @Override // com.baicizhan.main.wikiv2.lookup.wikiv2.Hilt_WikiSceneActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        ((x2) DataBindingUtil.setContentView(this, R.layout.activity_wiki_scene)).f57397a.D(new View.OnClickListener() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WikiSceneActivity.J0(WikiSceneActivity.this, view);
            }
        });
        if (bundle == null) {
            int intExtra = getIntent().getIntExtra("topic_id", 0);
            int intExtra2 = getIntent().getIntExtra("book_id", 0);
            Serializable serializableExtra = getIntent().getSerializableExtra("channel");
            GetTopicResourceChannel getTopicResourceChannel = serializableExtra instanceof GetTopicResourceChannel ? (GetTopicResourceChannel) serializableExtra : null;
            if (getTopicResourceChannel == null) {
                getTopicResourceChannel = GetTopicResourceChannel.LOOK_UP;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, WikiSceneFragment.a.f(WikiSceneFragment.f25600o, intExtra, intExtra2, getTopicResourceChannel, 0, false, "lookup", 24, null)).commit();
        }
    }
}
