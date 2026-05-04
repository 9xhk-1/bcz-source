package com.baicizhan.main.wikiv2.studyv2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.main.wikiv2.studyv2.StudyWikiV2Fragment;
import com.baicizhan.main.wikiv2.studyv2.data.WikiStyle;
import com.baicizhan.main.wikiv2.studyv2.data.u0;
import com.jiongji.andriod.card.R;
import gs.m2;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import w00.o;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class StudyWikiV2Activity extends BaseAppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f25906b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f25907c = 8;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f25908d = "topic_id";

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f25909e = "book_id";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c0 f25910a = e0.c(new x00.a() { // from class: com.baicizhan.main.wikiv2.studyv2.a
        @Override // x00.a
        public final Object invoke() {
            m2 L0;
            L0 = StudyWikiV2Activity.L0(StudyWikiV2Activity.this);
            return L0;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static /* synthetic */ void c(a aVar, Context context, int i11, int i12, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                i12 = 0;
            }
            aVar.b(context, i11, i12);
        }

        @w00.k
        @o
        public final void a(@m80.k Context context, int i11) {
            g0.p(context, "context");
            c(this, context, i11, 0, 4, null);
        }

        @w00.k
        @o
        public final void b(@m80.k Context context, int i11, int i12) {
            g0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) StudyWikiV2Activity.class);
            intent.putExtra("topic_id", i11);
            intent.putExtra("book_id", i12);
            context.startActivity(intent);
        }

        public a() {
        }
    }

    public static final m2 L0(StudyWikiV2Activity studyWikiV2Activity) {
        return m2.d(studyWikiV2Activity.getLayoutInflater());
    }

    public static final void M0(StudyWikiV2Activity studyWikiV2Activity, View view) {
        studyWikiV2Activity.finish();
    }

    @w00.k
    @o
    public static final void N0(@m80.k Context context, int i11) {
        f25906b.a(context, i11);
    }

    @w00.k
    @o
    public static final void O0(@m80.k Context context, int i11, int i12) {
        f25906b.b(context, i11, i12);
    }

    @m80.k
    public final m2 K0() {
        return (m2) this.f25910a.getValue();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(K0().getRoot());
        K0().f55835a.D(new View.OnClickListener() { // from class: com.baicizhan.main.wikiv2.studyv2.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudyWikiV2Activity.M0(StudyWikiV2Activity.this, view);
            }
        });
        getSupportFragmentManager().beginTransaction().add(R.id.word_wiki, StudyWikiV2Fragment.a.d(StudyWikiV2Fragment.f25911f, getIntent().getIntExtra("topic_id", 0), getIntent().getIntExtra("book_id", 0), true, false, 8, null)).commit();
        u0.f26107a.r(WikiStyle.TEST_GUIDE_WIKI);
    }
}
