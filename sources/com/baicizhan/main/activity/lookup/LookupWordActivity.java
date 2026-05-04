package com.baicizhan.main.activity.lookup;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentTransaction;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.lookup.Word;
import com.baicizhan.client.business.lookup.rx.LookupEngine;
import com.baicizhan.client.business.util.SystemUtil;
import com.baicizhan.client.business.webview.BczWebDirector;
import com.baicizhan.main.activity.LoadingPageActivity;
import com.baicizhan.main.activity.lookup.LookupWordActivity;
import com.baicizhan.main.activity.lookup.a;
import com.baicizhan.main.wikiv2.lookup.wikiv2.WikiSceneFragment;
import com.baicizhan.main.wikiv2.studyv2.data.EntryPage;
import com.baicizhan.main.wikiv2.studyv2.data.u0;
import com.baicizhan.main.word_book.list.WordFavoriteAddActivity;
import com.baicizhan.online.resource_api.GetTopicResourceChannel;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;
import gs.e1;
import i9.m;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import ma.l;
import ma.t;
import ma.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@qu.b
/* loaded from: classes4.dex */
public class LookupWordActivity extends fe.a implements View.OnClickListener, a.c, li.f {
    public static final String A = "arg_search_info";
    public static final String B = "arg_type";

    /* renamed from: y, reason: collision with root package name */
    public static final String f18513y = "LookupWordActivity";

    /* renamed from: z, reason: collision with root package name */
    public static final String f18514z = "arg_text";

    /* renamed from: e, reason: collision with root package name */
    public e1 f18515e;

    /* renamed from: f, reason: collision with root package name */
    public BottomSheetLayout f18516f;

    /* renamed from: g, reason: collision with root package name */
    public ConstraintLayout f18517g;

    /* renamed from: h, reason: collision with root package name */
    public FrameLayout f18518h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f18519i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f18520j;

    /* renamed from: k, reason: collision with root package name */
    public View f18521k;

    /* renamed from: l, reason: collision with root package name */
    public qb0.h f18522l;

    /* renamed from: m, reason: collision with root package name */
    public qb0.h f18523m;

    /* renamed from: n, reason: collision with root package name */
    public qb0.h f18524n;

    /* renamed from: o, reason: collision with root package name */
    public qb0.h f18525o;

    /* renamed from: p, reason: collision with root package name */
    public com.baicizhan.main.activity.lookup.a f18526p;

    /* renamed from: q, reason: collision with root package name */
    public WikiSceneFragment f18527q;

    /* renamed from: r, reason: collision with root package name */
    public Word f18528r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f18529s;

    /* renamed from: t, reason: collision with root package name */
    public SearchInfo f18530t;

    /* renamed from: u, reason: collision with root package name */
    public Candidate f18531u;

    /* renamed from: v, reason: collision with root package name */
    public String f18532v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f18533w = false;

    /* renamed from: x, reason: collision with root package name */
    public SearchType f18534x;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements TextView.OnEditorActionListener {
        public c() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView v11, int actionId, KeyEvent event) {
            if (actionId == 3) {
                String obj = LookupWordActivity.this.f18519i.getText().toString();
                if (!TextUtils.isEmpty(obj)) {
                    LookupWordActivity.this.h1(obj, 1);
                    LookupWordActivity.this.c1();
                } else if (LookupWordActivity.this.f18531u != null && !TextUtils.isEmpty(LookupWordActivity.this.f18531u.getKey()) && !LookupWordActivity.this.f18531u.getKey().equals(LookupWordActivity.this.f18532v) && !TextUtils.isEmpty(LookupWordActivity.this.f18531u.getUrl())) {
                    new BczWebDirector.Builder().setDefaultUrl(LookupWordActivity.this.f18531u.getUrl()).build().goToWeb(LookupWordActivity.this);
                    l.b(t.D, ma.a.O3, u.b(new String[]{"index", "title"}, new String[]{LookupWordActivity.this.f18530t.getCandidateIndex() + "", LookupWordActivity.this.f18531u.getKey()}));
                    LookupWordActivity.this.c1();
                }
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends sa.c {
        public d() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            WordFavoriteAddActivity.f26754c.c(LookupWordActivity.this);
            i9.f.j(LookupWordActivity.this, i9.f.D, true);
            LookupWordActivity.this.f18515e.f54697c.setVisibility(8);
            l.a(t.D, ma.a.P4);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends sa.c {
        public e() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            i9.f.j(LookupWordActivity.this, i9.f.D, true);
            LookupWordActivity.this.f18515e.f54697c.setVisibility(8);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LookupWordActivity.this.f18519i.clearFocus();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements Callable<UserRecord> {
        public h() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserRecord call() throws Exception {
            return m.c(LookupWordActivity.this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            LookupWordActivity.this.c1();
            return false;
        }

        public j() {
        }
    }

    public static void m1(@NonNull Context context) {
        o1(context, "");
    }

    public static void n1(Context context, SearchType type, SearchInfo searchInfo) {
        Intent intent = new Intent(context, (Class<?>) LookupWordActivity.class);
        intent.putExtra(B, type);
        if (searchInfo != null) {
            intent.putExtra(A, searchInfo);
        }
        context.startActivity(intent);
    }

    public static void o1(@NonNull Context context, CharSequence text) {
        Intent intent = new Intent(context, (Class<?>) LookupWordActivity.class);
        intent.putExtra(f18514z, text);
        intent.putExtra(B, SearchType.NORMAL);
        context.startActivity(intent);
    }

    @Override // com.baicizhan.main.activity.lookup.a.c
    public void B() {
        c1();
    }

    @Override // com.baicizhan.main.activity.lookup.a.c
    public void H() {
        c1();
        qb0.h hVar = this.f18523m;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f18523m.unsubscribe();
        }
        this.f18523m = LookupEngine.h(this).I3(tb0.a.a()).r5(new a());
    }

    @Override // com.baicizhan.main.activity.lookup.a.c
    public void V(Word word, boolean isHistory) {
        c1();
        Y0(word);
        this.f18519i.clearFocus();
        l1(word);
        if (isHistory) {
            l.b(t.D, ma.a.Q3, u.a("word", word.getWord()));
        } else {
            l.b(t.D, ma.a.f72877y3, u.b(new String[]{ma.b.f72934p0, ma.b.f72937q0}, new String[]{this.f18519i.getText().toString(), word.getWord()}));
        }
    }

    public final void Y0(Word word) {
        qb0.h hVar = this.f18524n;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f18524n.unsubscribe();
        }
        this.f18524n = LookupEngine.g(this, word).I3(tb0.a.a()).r5(new i());
    }

    public final void Z0() {
        this.f18519i.clearAnimation();
        c1();
        finish();
        l.a(t.D, ma.a.U3);
    }

    public final void a1() {
        qb0.h hVar = this.f18525o;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f18525o.unsubscribe();
        }
        this.f18525o = rx.c.z2(new h()).w5(bc0.c.e()).I3(tb0.a.a()).r5(new g());
    }

    public final void b1(boolean withAnim) {
        if (this.f18527q != null) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            if (withAnim) {
                beginTransaction.setCustomAnimations(R.anim.business_push_up_in, R.anim.business_push_down_out);
            }
            beginTransaction.remove(this.f18527q).commitAllowingStateLoss();
            this.f18527q = null;
            this.f18528r = null;
            com.baicizhan.main.activity.lookup.a aVar = this.f18526p;
            if (aVar != null) {
                aVar.F();
            }
        }
    }

    public final void c1() {
        SystemUtil.hideIME(this.f18519i);
        this.f18519i.post(new f());
    }

    public final void d1(Bundle savedInstanceState) {
        this.f18532v = getString(R.string.learn_word_search);
        this.f18516f = (BottomSheetLayout) findViewById(R.id.bottomsheet);
        this.f18515e.getRoot().setOnTouchListener(new j());
        this.f18517g = (ConstraintLayout) findViewById(R.id.lookup_content_root);
        this.f18518h = (FrameLayout) findViewById(R.id.drag_highlight);
        View findViewById = findViewById(R.id.lookup_clear);
        findViewById.setOnClickListener(this);
        this.f18520j = (TextView) findViewById(R.id.lookup_tip);
        this.f18521k = findViewById(R.id.lookup_progress);
        findViewById(R.id.lookup_edit_bg).setOnClickListener(this);
        EditText editText = (EditText) findViewById(R.id.lookup_edit);
        this.f18519i = editText;
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: fe.f
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                LookupWordActivity.this.e1(view, z11);
            }
        });
        findViewById(R.id.cancel_lookup).setOnClickListener(this);
        if (savedInstanceState == null) {
            k1(null, false);
            this.f18519i.postDelayed(new Runnable() { // from class: fe.g
                @Override // java.lang.Runnable
                public final void run() {
                    LookupWordActivity.this.g1();
                }
            }, 350L);
            CharSequence charSequenceExtra = getIntent().getCharSequenceExtra(f18514z);
            String charSequence = charSequenceExtra != null ? charSequenceExtra.toString() : "";
            h1(charSequence, 0);
            if (TextUtils.isEmpty(charSequence)) {
                Candidate candidate = this.f18531u;
                if (candidate != null && !candidate.getKey().equals(this.f18532v)) {
                    this.f18519i.setHint(this.f18531u.getKey());
                }
            } else {
                this.f18519i.setText(charSequence);
            }
        } else {
            com.baicizhan.main.activity.lookup.a aVar = (com.baicizhan.main.activity.lookup.a) getSupportFragmentManager().findFragmentByTag(com.baicizhan.main.activity.lookup.a.f18549i);
            WikiSceneFragment wikiSceneFragment = (WikiSceneFragment) getSupportFragmentManager().findFragmentByTag("wiki");
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            if (aVar != null) {
                beginTransaction.remove(aVar);
            }
            if (wikiSceneFragment != null) {
                beginTransaction.remove(wikiSceneFragment);
            }
            beginTransaction.commit();
            CharSequence charSequence2 = savedInstanceState.getCharSequence(a.d.C0245a.f16161a);
            Word word = (Word) savedInstanceState.getParcelable("word");
            k1(null, false);
            h1(TextUtils.isEmpty(charSequence2) ? "" : charSequence2.toString(), 0);
            if (!TextUtils.isEmpty(charSequence2)) {
                this.f18519i.setText(charSequence2);
            }
            if (word != null) {
                l1(word);
            }
        }
        this.f18519i.addTextChangedListener(new b(findViewById));
        this.f18519i.setOnEditorActionListener(new c());
        this.f18517g.setOnDragListener(new View.OnDragListener() { // from class: fe.h
            @Override // android.view.View.OnDragListener
            public final boolean onDrag(View view, DragEvent dragEvent) {
                boolean f12;
                f12 = LookupWordActivity.this.f1(view, dragEvent);
                return f12;
            }
        });
        if (this.f18534x == SearchType.OCR) {
            this.f18515e.f54696b.setVisibility(0);
            this.f18515e.f54696b.setOnClickListener(new d());
            if (i9.f.c(this, i9.f.D)) {
                return;
            }
            this.f18515e.f54697c.setVisibility(0);
            this.f18515e.f54708n.setOnClickListener(new e());
        }
    }

    public final /* synthetic */ void e1(View view, boolean z11) {
        if (z11) {
            b1(true);
        }
    }

    public final /* synthetic */ boolean f1(View view, DragEvent dragEvent) {
        Log.d(f18513y, "action: " + dragEvent.getAction());
        if (dragEvent.getAction() == 3) {
            if (dragEvent.getClipData().getItemCount() > 0 && dragEvent.getClipDescription().getMimeType(0).contentEquals("text/plain")) {
                ClipData.Item itemAt = dragEvent.getClipData().getItemAt(0);
                Log.d(f18513y, "text: " + ((Object) itemAt.getText()));
                if (!itemAt.getText().toString().isEmpty()) {
                    this.f18519i.setText(itemAt.getText());
                    return true;
                }
            }
        } else {
            if (dragEvent.getAction() == 1) {
                this.f18518h.setVisibility(0);
                return true;
            }
            if (dragEvent.getAction() == 4) {
                this.f18518h.setVisibility(8);
            }
        }
        return false;
    }

    @Override // com.baicizhan.main.activity.lookup.a.c
    public void h(boolean showing) {
        if (showing) {
            c1();
        } else {
            this.mHandler.postDelayed(new Runnable() { // from class: fe.e
                @Override // java.lang.Runnable
                public final void run() {
                    LookupWordActivity.this.g1();
                }
            }, 200L);
        }
    }

    public final void h1(String keyword, int token) {
        qb0.h hVar = this.f18522l;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f18522l.unsubscribe();
        }
        this.f18522l = LookupEngine.k(this, keyword, token, 5).I3(tb0.a.a()).r5(new k(this));
    }

    public final void i1(LookupEngine.Params params) {
        k1(params.results, TextUtils.isEmpty(params.keyword));
    }

    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public final void g1() {
        this.f18519i.requestFocus();
        SystemUtil.showIME(this.f18519i);
    }

    public final void k1(List<Word> results, boolean isHistory) {
        com.baicizhan.main.activity.lookup.a aVar = this.f18526p;
        if (aVar != null) {
            aVar.D(results != null ? new ArrayList<>(results) : null, isHistory);
        } else {
            this.f18526p = com.baicizhan.main.activity.lookup.a.C(results != null ? new ArrayList<>(results) : null, isHistory, this.f18530t);
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, this.f18526p, com.baicizhan.main.activity.lookup.a.f18549i).commit();
        }
    }

    public final void l1(Word word) {
        u0.f26107a.q(EntryPage.WORD_SEARCH_RESULT);
        this.f18527q = WikiSceneFragment.i0(Integer.parseInt(word.getId()), word.getBookId(), GetTopicResourceChannel.LOOK_UP, -1);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.business_push_up_in, R.anim.business_push_down_out).add(R.id.fragment_container, this.f18527q, "wiki").commitAllowingStateLoss();
        this.f18528r = word;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f18516f.C()) {
            this.f18516f.u();
            return;
        }
        WikiSceneFragment wikiSceneFragment = this.f18527q;
        if (wikiSceneFragment == null) {
            super.onBackPressed();
        } else {
            if (wikiSceneFragment.N0()) {
                return;
            }
            b1(true);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int id2 = v11.getId();
        if (id2 == R.id.cancel_lookup) {
            Z0();
            return;
        }
        if (id2 == R.id.lookup_clear) {
            this.f18519i.setText((CharSequence) null);
            g1();
        } else {
            if (id2 != R.id.lookup_edit_bg) {
                return;
            }
            b1(true);
            g1();
        }
    }

    @Override // fe.a, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppCompatStandardDefault);
        Serializable serializableExtra = getIntent().getSerializableExtra(A);
        if (serializableExtra instanceof SearchInfo) {
            SearchInfo searchInfo = (SearchInfo) serializableExtra;
            this.f18530t = searchInfo;
            this.f18531u = searchInfo.getCandidate();
        }
        this.f18534x = (SearchType) getIntent().getSerializableExtra(B);
        this.f18515e = (e1) DataBindingUtil.setContentView(this, R.layout.activity_lookup_word);
        d1(savedInstanceState);
        a1();
    }

    @Override // fe.a, com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        qb0.h hVar = this.f18522l;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f18522l.unsubscribe();
        }
        qb0.h hVar2 = this.f18523m;
        if (hVar2 != null && !hVar2.isUnsubscribed()) {
            this.f18523m.unsubscribe();
        }
        qb0.h hVar3 = this.f18524n;
        if (hVar3 != null && !hVar3.isUnsubscribed()) {
            this.f18524n.unsubscribe();
        }
        qb0.h hVar4 = this.f18525o;
        if (hVar4 == null || hVar4.isUnsubscribed()) {
            return;
        }
        this.f18525o.unsubscribe();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        c1();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onResumeFragments() {
        super.onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Word word = this.f18528r;
        if (word != null) {
            outState.putParcelable("word", word);
        }
        if (TextUtils.isEmpty(this.f18529s)) {
            return;
        }
        outState.putCharSequence(a.d.C0245a.f16161a, this.f18529s);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.f18533w) {
            this.f18533w = false;
            com.baicizhan.main.activity.lookup.a aVar = this.f18526p;
            if (aVar != null) {
                aVar.F();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f18533w = true;
    }

    public final void p1(int tipRes, boolean show) {
        if (tipRes > 0) {
            this.f18520j.setText(tipRes);
        }
        if (this.f18520j.getVisibility() == 0 && !show) {
            this.f18520j.setVisibility(8);
        } else {
            if (this.f18520j.getVisibility() == 0 || !show) {
                return;
            }
            this.f18520j.setVisibility(0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<Boolean> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c("", "clear search histories failed.", e11);
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends qb0.g<UserRecord> {
        public g() {
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(UserRecord userRecord) {
            if (userRecord == null) {
                LoadingPageActivity.A1(LookupWordActivity.this);
                va.g.i("您需要先登录才能使用词典功能哦~", 0);
                LookupWordActivity.this.finish();
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i extends qb0.g<Boolean> {
        public i() {
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
        }

        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k extends qb0.g<LookupEngine.Params> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<LookupWordActivity> f18547a;

        public k(LookupWordActivity activity) {
            this.f18547a = new WeakReference<>(activity);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(LookupEngine.Params params) {
            List<Word> list;
            LookupWordActivity lookupWordActivity = this.f18547a.get();
            if (lookupWordActivity == null) {
                return;
            }
            if (params.searching) {
                lookupWordActivity.f18521k.setVisibility(0);
                return;
            }
            if (lookupWordActivity.f18521k.getVisibility() == 0) {
                lookupWordActivity.f18521k.setVisibility(8);
            }
            if (!TextUtils.isEmpty(params.keyword) && ((list = params.results) == null || list.isEmpty())) {
                if (-100 == params.errcode) {
                    lookupWordActivity.p1(R.string.wordlock_search_neterr, true);
                } else {
                    lookupWordActivity.p1(R.string.wordlock_search_none, true);
                }
            }
            lookupWordActivity.i1(params);
        }

        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
        }
    }

    @Override // li.f
    public void C(Integer killedId) {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        public String f18536a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f18537b;

        public b(final View val$clearView) {
            this.f18537b = val$clearView;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            LookupWordActivity.this.p1(0, false);
            String obj = s11.toString();
            if (TextUtils.isEmpty(obj)) {
                this.f18537b.setVisibility(8);
            } else {
                this.f18537b.setVisibility(0);
            }
            LookupWordActivity.this.f18529s = obj;
            if (obj.equals(this.f18536a)) {
                return;
            }
            LookupWordActivity.this.h1(obj, 0);
            LookupWordActivity.this.b1(false);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
            this.f18536a = s11.toString();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
        }
    }
}
