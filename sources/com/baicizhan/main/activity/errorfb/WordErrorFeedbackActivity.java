package com.baicizhan.main.activity.errorfb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.thrift.l;
import com.baicizhan.client.business.util.TopicIdMapingUtils;
import com.baicizhan.main.activity.errorfb.WordErrorFeedbackActivity;
import com.baicizhan.main.wikiv2.lookup.data.WordBugData;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.resource_api.WordBugType;
import com.jiongji.andriod.card.R;
import gs.b3;
import java.util.ArrayList;
import java.util.List;
import org.apache.thrift.TException;
import q9.x;
import qb0.h;
import va.f;
import va.g;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class WordErrorFeedbackActivity extends BaseAppCompatActivity implements View.OnClickListener {

    /* renamed from: i, reason: collision with root package name */
    public static final String f18458i = "WordErrorFeedbackActivity";

    /* renamed from: j, reason: collision with root package name */
    public static final String f18459j = "topic";

    /* renamed from: k, reason: collision with root package name */
    public static final String f18460k = "items";

    /* renamed from: l, reason: collision with root package name */
    public static final String f18461l = "item_bug_data";

    /* renamed from: m, reason: collision with root package name */
    public static int[] f18462m = {R.string.error_fb_word_error_base, R.string.error_fb_word_error_variant, R.string.error_fb_word_error_sentence, R.string.error_fb_word_error_video, R.string.error_fb_word_error_similar, R.string.error_fb_word_error_root, R.string.error_fb_word_error_enmean, R.string.error_fb_word_error_img};

    /* renamed from: n, reason: collision with root package name */
    public static SparseArray<WordBugType> f18463n = new a();

    /* renamed from: a, reason: collision with root package name */
    public TopicRecord f18464a;

    /* renamed from: b, reason: collision with root package name */
    public LinearLayout f18465b;

    /* renamed from: c, reason: collision with root package name */
    public View f18466c = null;

    /* renamed from: d, reason: collision with root package name */
    public int[] f18467d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<WordBugData> f18468e;

    /* renamed from: f, reason: collision with root package name */
    public b3 f18469f;

    /* renamed from: g, reason: collision with root package name */
    public h f18470g;

    /* renamed from: h, reason: collision with root package name */
    public f f18471h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends SparseArray<WordBugType> {
        public a() {
            put(R.string.error_fb_word_error_base, WordBugType.BASIC);
            put(R.string.error_fb_word_error_variant, WordBugType.VARIANT);
            WordBugType wordBugType = WordBugType.SENTENCE;
            put(R.string.error_fb_word_error_sentence, wordBugType);
            put(R.string.error_fb_word_error_video, WordBugType.VIDEO);
            put(R.string.error_fb_word_error_similar, WordBugType.SIMILAR);
            put(R.string.error_fb_word_error_root, WordBugType.ETYMA);
            put(R.string.error_fb_word_error_enmean, WordBugType.EN_MEAN);
            put(R.string.error_fb_word_error_img, WordBugType.DEFORMATION);
            put(R.string.error_fb_word_error_synonyms, WordBugType.SYNONYM);
            put(R.string.error_fb_word_error_antonyms, WordBugType.ANTONYM);
            put(R.string.error_fb_word_error_detail, wordBugType);
            put(R.string.error_fb_word_error_phrase, WordBugType.SHORT_PHRASE);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements p<ResourceService.Client, rx.c<Void>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f18473a;

        public c(final List val$info) {
            this.f18473a = val$info;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Void> call(ResourceService.Client client) {
            try {
                client.word_bug_report(TopicIdMapingUtils.buildTopicKey(WordErrorFeedbackActivity.this.f18464a.topicId, WordErrorFeedbackActivity.this.f18464a.bookId), this.f18473a);
                return rx.c.M2(null);
            } catch (TException e11) {
                qb.c.d(WordErrorFeedbackActivity.f18458i, "submit_word_feedback error: " + e11, new Object[0]);
                return rx.c.T1(e11);
            }
        }
    }

    private void M0() {
        this.f18465b = (LinearLayout) findViewById(R.id.select_area);
        this.f18469f.f54223a.D(new View.OnClickListener() { // from class: ae.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WordErrorFeedbackActivity.this.N0(view);
            }
        });
        ((TextView) findViewById(R.id.word)).setText(this.f18464a.word);
        View findViewById = findViewById(R.id.submit);
        this.f18466c = findViewById;
        findViewById.setSelected(true);
        this.f18466c.setClickable(false);
        if (this.f18467d != null) {
            for (int i11 = 0; i11 < this.f18467d.length; i11++) {
                TextView textView = (TextView) LayoutInflater.from(this).inflate(R.layout.word_error_feedback_selection_item, (ViewGroup) null);
                textView.setSelected(false);
                textView.setText(this.f18467d[i11]);
                textView.setOnClickListener(this);
                textView.setId(this.f18467d[i11]);
                this.f18465b.addView(textView);
                if (i11 != this.f18467d.length - 1) {
                    View inflate = LayoutInflater.from(this).inflate(R.layout.word_error_feedback_selection_divider, (ViewGroup) null);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
                    layoutParams.setMargins(xb.f.a(this, 24.0f), 0, xb.f.a(this, 24.0f), 0);
                    this.f18465b.addView(inflate, layoutParams);
                }
            }
            return;
        }
        if (this.f18468e != null) {
            for (int i12 = 0; i12 < this.f18468e.size(); i12++) {
                TextView textView2 = (TextView) LayoutInflater.from(this).inflate(R.layout.word_error_feedback_selection_item, (ViewGroup) null);
                textView2.setSelected(false);
                textView2.setText(this.f18468e.get(i12).e());
                textView2.setOnClickListener(this);
                textView2.setTag(this.f18468e.get(i12).g());
                this.f18465b.addView(textView2);
                if (i12 != this.f18468e.size() - 1) {
                    View inflate2 = LayoutInflater.from(this).inflate(R.layout.word_error_feedback_selection_divider, (ViewGroup) null);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 1);
                    layoutParams2.setMargins(xb.f.a(this, 24.0f), 0, xb.f.a(this, 24.0f), 0);
                    this.f18465b.addView(inflate2, layoutParams2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(View view) {
        finish();
    }

    public static void P0(Context context, @NonNull TopicRecord record, ArrayList<WordBugData> items) {
        Intent intent = new Intent(context, (Class<?>) WordErrorFeedbackActivity.class);
        intent.putExtra("topic", record);
        intent.putParcelableArrayListExtra(f18461l, items);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static void Q0(Context context, @NonNull TopicRecord record, List<Integer> items) {
        Intent intent = new Intent(context, (Class<?>) WordErrorFeedbackActivity.class);
        intent.putExtra("topic", record);
        int[] iArr = new int[items.size()];
        for (int i11 = 0; i11 < items.size(); i11++) {
            iArr[i11] = items.get(i11).intValue();
        }
        intent.putExtra(f18460k, iArr);
        context.startActivity(intent);
    }

    public final List<WordBugType> L0() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.f18465b.getChildCount(); i11++) {
            if (this.f18465b.getChildAt(i11).isSelected()) {
                WordBugType wordBugType = (WordBugType) (this.f18467d != null ? f18463n.get(this.f18465b.getChildAt(i11).getId()) : this.f18465b.getChildAt(i11).getTag());
                if (wordBugType != null && !arrayList.contains(wordBugType)) {
                    arrayList.add(wordBugType);
                }
            }
        }
        return arrayList;
    }

    public final void O0() {
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= this.f18465b.getChildCount()) {
                break;
            }
            if (this.f18465b.getChildAt(i11).isSelected()) {
                z11 = true;
                break;
            }
            i11++;
        }
        this.f18466c.setSelected(!z11);
        this.f18466c.setOnClickListener(z11 ? this : null);
        this.f18466c.setClickable(z11);
    }

    public final void R0() {
        List<WordBugType> L0 = L0();
        if (L0 == null) {
            g.g(R.string.error_fb_submit_empty, 0);
            finish();
            return;
        }
        if (this.f18471h == null) {
            f fVar = new f(this);
            this.f18471h = fVar;
            fVar.setCancelable(false);
        }
        this.f18471h.show();
        h hVar = this.f18470g;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f18470g.unsubscribe();
        }
        this.f18470g = com.baicizhan.client.business.thrift.p.a(new l("/rpc/resource_api")).b2(new c(L0)).w5(bc0.c.a()).I3(tb0.a.a()).r5(new b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int id2 = v11.getId();
        if (id2 == R.id.back) {
            finish();
        } else if (id2 == R.id.submit) {
            R0();
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f18465b.getChildCount()) {
                break;
            }
            if (v11 == this.f18465b.getChildAt(i11)) {
                v11.setSelected(!v11.isSelected());
                break;
            }
            i11++;
        }
        O0();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (x.r().c(this)) {
            return;
        }
        if (savedInstanceState != null) {
            this.f18464a = (TopicRecord) savedInstanceState.getParcelable("topic");
            this.f18467d = savedInstanceState.getIntArray(f18460k);
            this.f18468e = savedInstanceState.getParcelableArrayList(f18461l);
        } else {
            this.f18464a = (TopicRecord) getIntent().getParcelableExtra("topic");
            this.f18467d = getIntent().getIntArrayExtra(f18460k);
            this.f18468e = getIntent().getParcelableArrayListExtra(f18461l);
        }
        if (this.f18464a == null || (this.f18467d == null && this.f18468e == null)) {
            qb.c.d(f18458i, "feedback word error failed, topic is null.", new Object[0]);
            finish();
        } else {
            this.f18469f = (b3) DataBindingUtil.setContentView(this, R.layout.activity_word_error_feedback);
            M0();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable("topic", this.f18464a);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<Void> {
        public b() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            WordErrorFeedbackActivity.this.f18471h.dismiss();
            g.g(R.string.error_fb_submit_error, 0);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Void aVoid) {
            WordErrorFeedbackActivity.this.f18471h.dismiss();
            g.g(R.string.error_fb_submit_success, 0);
            WordErrorFeedbackActivity.this.finish();
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
