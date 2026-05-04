package com.baicizhan.main.wikiv2.lookup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.main.wikiv2.lookup.WordWikiActivity;
import com.baicizhan.main.wikiv2.lookup.WordWikiFragment;
import com.baicizhan.online.resource_api.GetTopicResourceChannel;
import com.jiongji.andriod.card.R;
import gs.h3;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.o;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordWikiActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordWikiActivity.kt\ncom/baicizhan/main/wikiv2/lookup/WordWikiActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
/* loaded from: classes3.dex */
public final class WordWikiActivity extends BaseAppCompatActivity implements WordWikiFragment.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f25556b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f25557c = 8;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String f25558d = "topic_id";

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f25559e = "book_id";

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f25560f = "channel";

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c0 f25561a = e0.c(new x00.a() { // from class: oi.c
        @Override // x00.a
        public final Object invoke() {
            WordWikiFragment P0;
            P0 = WordWikiActivity.P0(WordWikiActivity.this);
            return P0;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
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
        @o
        public final void a(@k Context context, int i11) {
            g0.p(context, "context");
            d(this, context, i11, 0, null, 12, null);
        }

        @w00.k
        @o
        public final void b(@k Context context, int i11, int i12) {
            g0.p(context, "context");
            d(this, context, i11, i12, null, 8, null);
        }

        @w00.k
        @o
        public final void c(@k Context context, int i11, int i12, @k GetTopicResourceChannel channel) {
            g0.p(context, "context");
            g0.p(channel, "channel");
            Intent intent = new Intent(context, (Class<?>) WordWikiActivity.class);
            intent.putExtra("topic_id", i11);
            intent.putExtra("book_id", i12);
            intent.putExtra("channel", channel);
            context.startActivity(intent);
        }

        public a() {
        }
    }

    public static final void L0(WordWikiActivity wordWikiActivity, View view) {
        wordWikiActivity.finish();
    }

    @w00.k
    @o
    public static final void M0(@k Context context, int i11) {
        f25556b.a(context, i11);
    }

    @w00.k
    @o
    public static final void N0(@k Context context, int i11, int i12) {
        f25556b.b(context, i11, i12);
    }

    @w00.k
    @o
    public static final void O0(@k Context context, int i11, int i12, @k GetTopicResourceChannel getTopicResourceChannel) {
        f25556b.c(context, i11, i12, getTopicResourceChannel);
    }

    public static final WordWikiFragment P0(WordWikiActivity wordWikiActivity) {
        Fragment findFragmentById = wordWikiActivity.getSupportFragmentManager().findFragmentById(R.id.word_wiki);
        if (findFragmentById instanceof WordWikiFragment) {
            return (WordWikiFragment) findFragmentById;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    @Override // com.baicizhan.main.wikiv2.lookup.WordWikiFragment.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G(boolean r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L93
            com.baicizhan.main.wikiv2.lookup.WordWikiFragment r6 = r5.K0()
            if (r6 == 0) goto L93
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "topic_id"
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            r3 = 0
            if (r1 == 0) goto L1f
            goto L20
        L1f:
            r0 = r3
        L20:
            if (r0 == 0) goto L27
        L22:
            int r0 = r0.intValue()
            goto L43
        L27:
            android.content.Intent r0 = r5.getIntent()
            android.net.Uri r0 = r0.getData()
            if (r0 == 0) goto L3e
            java.lang.String r1 = "topicId"
            java.lang.String r0 = r0.getQueryParameter(r1)
            if (r0 == 0) goto L3e
            java.lang.Integer r0 = u30.e0.p1(r0)
            goto L3f
        L3e:
            r0 = r3
        L3f:
            if (r0 == 0) goto L42
            goto L22
        L42:
            r0 = r2
        L43:
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r4 = "book_id"
            int r1 = r1.getIntExtra(r4, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r4 = r1.intValue()
            if (r4 == 0) goto L58
            goto L59
        L58:
            r1 = r3
        L59:
            if (r1 == 0) goto L60
        L5b:
            int r2 = r1.intValue()
            goto L7b
        L60:
            android.content.Intent r1 = r5.getIntent()
            android.net.Uri r1 = r1.getData()
            if (r1 == 0) goto L77
            java.lang.String r4 = "bookId"
            java.lang.String r1 = r1.getQueryParameter(r4)
            if (r1 == 0) goto L77
            java.lang.Integer r1 = u30.e0.p1(r1)
            goto L78
        L77:
            r1 = r3
        L78:
            if (r1 == 0) goto L7b
            goto L5b
        L7b:
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r4 = "channel"
            java.io.Serializable r1 = r1.getSerializableExtra(r4)
            boolean r4 = r1 instanceof com.baicizhan.online.resource_api.GetTopicResourceChannel
            if (r4 == 0) goto L8c
            r3 = r1
            com.baicizhan.online.resource_api.GetTopicResourceChannel r3 = (com.baicizhan.online.resource_api.GetTopicResourceChannel) r3
        L8c:
            if (r3 != 0) goto L90
            com.baicizhan.online.resource_api.GetTopicResourceChannel r3 = com.baicizhan.online.resource_api.GetTopicResourceChannel.LOOK_UP
        L90:
            r6.d0(r0, r2, r3)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wikiv2.lookup.WordWikiActivity.G(boolean):void");
    }

    public final WordWikiFragment K0() {
        return (WordWikiFragment) this.f25561a.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        WordWikiFragment K0 = K0();
        if (K0 == null || !K0.g0()) {
            super.onBackPressed();
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        ((h3) DataBindingUtil.setContentView(this, R.layout.activity_word_wiki)).f55132a.D(new View.OnClickListener() { // from class: oi.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WordWikiActivity.L0(WordWikiActivity.this, view);
            }
        });
    }
}
