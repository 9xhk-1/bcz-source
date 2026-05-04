package com.baicizhan.main.wordlist.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.client.business.dataset.models.UniverseTopicId;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.util.ColorStateListUtils;
import com.baicizhan.client.business.widget.RoundedButton;
import com.baicizhan.main.customview.WordListNavigation;
import com.baicizhan.main.rx.BookAdObservables;
import com.baicizhan.main.wordlist.activity.SortWindow;
import com.baicizhan.main.wordlist.activity.WordListActivity;
import com.baicizhan.main.wordlist.activity.WordListFragment;
import com.jiongji.andriod.card.R;
import gi.h0;
import gs.j3;
import hj.m;
import hj.n;
import hj.p;
import i9.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ma.l;
import ma.t;
import ma.u;
import ma.v;
import q9.x;
import qb0.g;
import qb0.h;
import sa.q;
import sh.d;
import tj.i;
import tj.k;
import tj.z;
import va.f;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class WordListActivity extends BaseAppCompatActivity implements View.OnClickListener, SortWindow.b, WordListFragment.c, n {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 3;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;

    /* renamed from: w, reason: collision with root package name */
    public static final String f27733w = "WordListActivity";

    /* renamed from: x, reason: collision with root package name */
    public static final String f27734x = "default_tab_index";

    /* renamed from: y, reason: collision with root package name */
    public static final String f27735y = "key_store_tab_idx";

    /* renamed from: z, reason: collision with root package name */
    public static final String f27736z = "key_store_sort_tab";

    /* renamed from: b, reason: collision with root package name */
    public j3 f27738b;

    /* renamed from: c, reason: collision with root package name */
    public WordListNavigation f27739c;

    /* renamed from: f, reason: collision with root package name */
    public RoundedButton f27742f;

    /* renamed from: g, reason: collision with root package name */
    public View f27743g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f27744h;

    /* renamed from: i, reason: collision with root package name */
    public RoundedButton f27745i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f27746j;

    /* renamed from: l, reason: collision with root package name */
    public WordListFragment f27748l;

    /* renamed from: n, reason: collision with root package name */
    public SparseIntArray f27750n;

    /* renamed from: p, reason: collision with root package name */
    public FragmentManager f27752p;

    /* renamed from: q, reason: collision with root package name */
    public h f27753q;

    /* renamed from: r, reason: collision with root package name */
    public h f27754r;

    /* renamed from: s, reason: collision with root package name */
    public eg.h f27755s;

    /* renamed from: t, reason: collision with root package name */
    public d.g f27756t;

    /* renamed from: u, reason: collision with root package name */
    public i f27757u;

    /* renamed from: v, reason: collision with root package name */
    public m f27758v;

    /* renamed from: a, reason: collision with root package name */
    public int f27737a = 0;

    /* renamed from: d, reason: collision with root package name */
    public SparseIntArray f27740d = new SparseIntArray();

    /* renamed from: e, reason: collision with root package name */
    public gi.c f27741e = new gi.c();

    /* renamed from: k, reason: collision with root package name */
    public int f27747k = -1;

    /* renamed from: m, reason: collision with root package name */
    public String[] f27749m = {"已学单词", "未学单词", "已斩单词"};

    /* renamed from: o, reason: collision with root package name */
    public int f27751o = 3;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends sa.c {
        public a() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            i.v(WordListActivity.this);
            l.a(t.f73011j, ma.a.f72739e5);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends sa.c {
        public b() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            WordListActivity wordListActivity = WordListActivity.this;
            i.l(wordListActivity, (BookAdObservables.BookAdInfo) wordListActivity.f27738b.f55414i.getTag(), 1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends sa.c {
        public c() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            if (WordListActivity.this.f27738b.f55411f.getLayout().getEllipsisCount(WordListActivity.this.f27738b.f55411f.getLineCount() - 1) > 0) {
                WordListActivity.this.m1();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends g<Boolean> {
        public d() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            WordListActivity.this.f27741e.c(1, null);
            qb.c.b(WordListActivity.f27733w, Log.getStackTraceString(e11), new Object[0]);
            va.g.i("加载单词列表失败", 0);
            WordListActivity.this.finish();
        }

        @Override // qb0.c
        public void onNext(Boolean integer) {
            WordListActivity.this.f27741e.c(1, null);
            qb.c.b(WordListActivity.f27733w, "onResult " + integer, new Object[0]);
            WordListActivity.this.f27739c.e(WordListActivity.this.f27747k, false);
            WordListActivity.this.Y0();
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements wb0.b<Long> {
        public e() {
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Long aLong) {
            WordListActivity.this.f27745i.setClickable(true);
        }
    }

    public static /* synthetic */ g2 K0() {
        qb.c.d(f27733w, "load blurred bg error", new Object[0]);
        return null;
    }

    public static ArrayList<WordListItem> Z0() {
        int z11 = LearnRecordManager.A().z();
        ArrayList<WordListItem> arrayList = new ArrayList<>();
        for (TopicLearnRecord topicLearnRecord : LearnRecordManager.A().x()) {
            if (topicLearnRecord.isKilled()) {
                WordListItem wordListItem = new WordListItem();
                long make = UniverseTopicId.make(z11, topicLearnRecord.topicId);
                wordListItem.x(make);
                wordListItem.v(WordListItem.k(make));
                wordListItem.y(z.g().h(topicLearnRecord.topicId));
                arrayList.add(wordListItem);
            }
        }
        return arrayList;
    }

    public static ArrayList<WordListItem> a1() {
        int z11 = LearnRecordManager.A().z();
        ArrayList<WordListItem> arrayList = new ArrayList<>();
        for (TopicLearnRecord topicLearnRecord : LearnRecordManager.A().x()) {
            if (!topicLearnRecord.isKilled()) {
                WordListItem wordListItem = new WordListItem();
                long make = UniverseTopicId.make(z11, topicLearnRecord.topicId);
                wordListItem.x(make);
                wordListItem.v(WordListItem.k(make));
                wordListItem.y(z.g().h(topicLearnRecord.topicId));
                arrayList.add(wordListItem);
            }
        }
        return arrayList;
    }

    public static ArrayList<WordListItem> b1() {
        int z11 = LearnRecordManager.A().z();
        ArrayList<WordListItem> arrayList = new ArrayList<>();
        Iterator<Integer> it = x.r().z().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (LearnRecordManager.A().Q(intValue)) {
                WordListItem wordListItem = new WordListItem();
                wordListItem.x(UniverseTopicId.make(z11, intValue));
                wordListItem.y(z.g().h(intValue));
                arrayList.add(wordListItem);
            }
        }
        return arrayList;
    }

    public static boolean c1() {
        Iterator<Integer> it = x.r().z().iterator();
        while (it.hasNext()) {
            if (LearnRecordManager.A().Q(it.next().intValue())) {
                return true;
            }
        }
        return false;
    }

    private void l1() {
        h hVar = this.f27754r;
        if (hVar == null || hVar.isUnsubscribed()) {
            f fVar = new f(this);
            fVar.setCancelable(false);
            fVar.show();
            this.f27741e.c(1, fVar);
            this.f27754r = z.g().n(this, x.r().z(), x.r().l()).I3(tb0.a.a()).r5(new d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        finish();
    }

    public static void q1(Context context) {
        r1(context, -1);
    }

    public static void r1(Context context, int defTabIndex) {
        Intent intent = new Intent(context, (Class<?>) WordListActivity.class);
        if (defTabIndex >= 0) {
            intent.putExtra(f27734x, defTabIndex);
        }
        context.startActivity(intent);
    }

    @Override // com.baicizhan.main.wordlist.activity.SortWindow.b
    public void J() {
        rx.c.o6(100L, TimeUnit.MILLISECONDS).I3(tb0.a.a()).t5(new e());
        this.f27745i.setSelected(false);
    }

    @Override // com.baicizhan.main.wordlist.activity.SortWindow.b
    public void O(int type) {
        this.f27740d.put(this.f27747k, 0);
        j.k(f27736z + String.valueOf(this.f27747k), type);
        this.f27751o = type;
        n1(type);
    }

    public final void X0(int tabIndex, boolean user) {
        WordListFragment wordListFragment = this.f27748l;
        if (wordListFragment != null) {
            this.f27740d.put(this.f27747k, wordListFragment.G());
        }
        this.f27747k = tabIndex;
        if (user) {
            j.k(f27735y, tabIndex);
        }
        int e11 = j.e(f27736z + String.valueOf(this.f27747k), this.f27747k == 1 ? 7 : 3);
        this.f27751o = e11;
        n1(e11);
    }

    public final void Y0() {
        if (k.a()) {
            new k().c(this, this.f27747k == 0);
        }
    }

    public final void d1() {
        int l11 = x.r().l();
        if (l11 != 0) {
            sh.d.s().x(this, l11);
        }
    }

    public final void e1() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f27750n = sparseIntArray;
        sparseIntArray.put(1, R.string.word_list_sort_road_map);
        this.f27750n.put(6, R.string.word_list_sort_word_asc);
        this.f27750n.put(7, R.string.word_list_sort_word_desc);
        this.f27750n.put(4, R.string.word_list_sort_wrong_asc);
        this.f27750n.put(5, R.string.word_list_sort_wrong_desc);
        this.f27750n.put(2, R.string.word_list_sort_time_asc);
        this.f27750n.put(3, R.string.word_list_sort_time_desc);
    }

    public final void f1(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            this.f27737a = savedInstanceState.getInt(f27734x);
        } else {
            Uri data = getIntent().getData();
            this.f27737a = getIntent().hasExtra(f27734x) ? getIntent().getIntExtra(f27734x, 0) : (data == null || data.getQuery() == null || !data.getQuery().contains("index=") || data.getQueryParameter("index") == null) ? j.e(f27735y, 0) : Integer.parseInt(data.getQueryParameter("index"));
        }
        int i11 = this.f27737a;
        if (i11 < 0 || i11 > 2) {
            this.f27737a = 0;
        }
        this.f27747k = this.f27737a;
    }

    public final /* synthetic */ void g1(ij.e eVar) {
        qb.c.b(f27733w, "controller bound: " + eVar, new Object[0]);
        this.f27758v = new m(this, eVar);
    }

    public final /* synthetic */ void h1(int i11, boolean z11) {
        X0(i11, z11);
        s1(i11);
    }

    public final /* synthetic */ void i1(BookAdObservables.BookAdInfo bookAdInfo) {
        if (bookAdInfo != null) {
            q.p(this.f27738b.f55414i, bookAdInfo.show_name);
            if (!TextUtils.isEmpty(bookAdInfo.show_name)) {
                l.b(t.f73010i, ma.a.K0, u.c(new String[]{"id", "book_id", "adv_id"}, new String[]{bookAdInfo.aId, bookAdInfo.book_id + "", bookAdInfo.aId}, true));
            }
            this.f27738b.f55414i.setTag(bookAdInfo);
        }
    }

    @Override // com.baicizhan.main.wordlist.activity.WordListFragment.c
    public void j0(List<WordListItem> datas, boolean showMean) {
        if (xb.e.h(datas)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (WordListItem wordListItem : datas) {
            if (TextUtils.isEmpty(wordListItem.p())) {
                arrayList.add(Long.valueOf(wordListItem.n()));
            }
        }
    }

    public final /* synthetic */ g2 j1(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        this.f27738b.f55410e.setImageBitmap(bitmap);
        wz.a.c(this).l(10).m(4).j(bitmap).b(this.f27738b.f55408c);
        return null;
    }

    public final /* synthetic */ void k1(tj.a aVar) {
        if (aVar != null) {
            this.f27738b.f55406a.V(aVar.i());
            this.f27738b.f55415j.setText(getString(R.string.book_detail_words_summary, Integer.valueOf(aVar.j())));
            this.f27738b.f55411f.setText(aVar.h());
            if (TextUtils.isEmpty(aVar.g())) {
                return;
            }
            hc.c.p(aVar.g()).l(new x00.l() { // from class: tj.s
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 j12;
                    j12 = WordListActivity.this.j1((Bitmap) obj);
                    return j12;
                }
            }, new x00.a() { // from class: tj.t
                @Override // x00.a
                public final Object invoke() {
                    return WordListActivity.K0();
                }
            });
        }
    }

    @Override // hj.n
    public m l0() {
        return this.f27758v;
    }

    @Override // com.baicizhan.main.wordlist.activity.WordListFragment.c
    public void m0(int count) {
        this.f27744h.setText(getString(R.string.wordlist_header_word_count, Integer.valueOf(count)));
        this.f27743g.setVisibility(count > 0 ? 0 : 4);
    }

    public final void m1() {
        eg.h hVar = this.f27755s;
        if (hVar == null || !hVar.isVisible()) {
            this.f27755s = eg.h.B();
            getSupportFragmentManager().beginTransaction().add(this.f27755s, "detail").commitAllowingStateLoss();
        }
    }

    public final void n1(int sortMode) {
        ArrayList<WordListItem> Z0;
        int i11 = this.f27747k;
        this.f27745i.setText(this.f27750n.get(this.f27751o));
        int i12 = this.f27740d.get(this.f27747k, 0);
        WordListFragment.Config config = new WordListFragment.Config();
        config.f27784d = i12;
        config.f27782b = sortMode;
        if (i11 == 0) {
            this.f27746j.setVisibility(8);
            Z0 = a1();
            config.f27781a = 2;
            config.f27783c = true;
            config.f27786f = false;
            config.f27787g = R.drawable.ic_wordlist_learned_empty;
            config.f27785e = getString(c1() ? R.string.wordlist_empty_learned : R.string.wordlist_empty_learned_all_killed);
            this.f27748l = WordListFragment.H(Z0, config, 1);
        } else if (i11 == 1) {
            this.f27746j.setVisibility(8);
            Z0 = b1();
            config.f27781a = 2;
            config.f27783c = false;
            config.f27786f = false;
            config.f27785e = getString(R.string.wordlist_empty_unlearned);
            config.f27787g = R.drawable.ic_wordlist_unlearned_empty;
            this.f27748l = WordListFragment.H(Z0, config, 2);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException();
            }
            this.f27746j.setVisibility(8);
            Z0 = Z0();
            config.f27781a = 2;
            config.f27783c = true;
            config.f27786f = true;
            config.f27787g = R.drawable.ic_wordlist_killed_empty;
            config.f27785e = getString(R.string.wordlist_empty_killed);
            this.f27748l = WordListFragment.H(Z0, config, 3);
        }
        this.f27742f.setSelected(false);
        this.f27743g.setVisibility(Z0.size() <= 0 ? 4 : 0);
        this.f27744h.setText(getString(R.string.wordlist_header_word_count, Integer.valueOf(Z0.size())));
        this.f27752p.beginTransaction().replace(R.id.placeholder, this.f27748l).commitAllowingStateLoss();
        HashMap hashMap = new HashMap();
        hashMap.put(ma.b.H1, v.f73053x[i11]);
        l.e(t.f73011j, ma.a.f72725c5, hashMap);
    }

    public final void o1() {
        this.f27745i.setClickable(false);
        this.f27745i.setSelected(true);
        SortWindow d11 = SortWindow.d();
        int i11 = this.f27747k;
        if (i11 == 0) {
            d11.h(this.f27745i, this.f27751o, SortWindow.Strategy.Study);
        } else if (i11 == 1) {
            d11.h(this.f27745i, this.f27751o, SortWindow.Strategy.Unlearn);
        } else {
            d11.h(this.f27745i, this.f27751o, SortWindow.Strategy.Killed);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int id2 = v11.getId();
        if (id2 == R.id.edit) {
            t1();
        } else if (id2 == R.id.home) {
            finish();
        } else {
            if (id2 != R.id.sort) {
                return;
            }
            o1();
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        j3 j3Var = (j3) DataBindingUtil.setContentView(this, R.layout.activity_wordlist_without_theme);
        this.f27738b = j3Var;
        j3Var.f55406a.D(new View.OnClickListener() { // from class: tj.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WordListActivity.this.lambda$onCreate$0(view);
            }
        });
        e1();
        if (x.r().c(this)) {
            return;
        }
        p.d(this, new rj.e() { // from class: tj.n
            @Override // rj.e
            public final void a(ij.e eVar) {
                WordListActivity.this.g1(eVar);
            }
        });
        f1(savedInstanceState);
        this.f27751o = j.e(f27736z + String.valueOf(this.f27747k), 3);
        RoundedButton roundedButton = (RoundedButton) findViewById(R.id.edit);
        this.f27742f = roundedButton;
        roundedButton.setOnClickListener(this);
        this.f27742f.setStrokeColor(ColorStateList.valueOf(-859780908));
        this.f27742f.setFillColor(ColorStateListUtils.getSimpleColorStateList(1723910356, -859780908));
        RoundedButton roundedButton2 = (RoundedButton) findViewById(R.id.sort);
        this.f27745i = roundedButton2;
        roundedButton2.setStrokeColor(ColorStateList.valueOf(-859780908));
        this.f27745i.setFillColor(ColorStateListUtils.getSimpleColorStateList(1723910356, -859780908));
        this.f27745i.setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.collect_word_review);
        this.f27746j = textView;
        textView.setOnClickListener(this);
        this.f27743g = findViewById(R.id.wordlist_edit_bar);
        this.f27744h = (TextView) findViewById(R.id.word_count_header);
        WordListNavigation wordListNavigation = (WordListNavigation) findViewById(R.id.navigator);
        this.f27739c = wordListNavigation;
        wordListNavigation.c(this.f27749m);
        this.f27739c.setOnTabChangeListener(new WordListNavigation.c() { // from class: tj.o
            @Override // com.baicizhan.main.customview.WordListNavigation.c
            public final void a(int i11, boolean z11) {
                WordListActivity.this.h1(i11, z11);
            }
        });
        this.f27752p = getSupportFragmentManager();
        h0.a().d(this, R.raw.chop);
        this.f27738b.f55412g.setOnClickListener(new a());
        this.f27738b.f55414i.setOnClickListener(new b());
        this.f27738b.f55413h.getLayoutParams().height += zb.a.k(this);
        this.f27738b.f55411f.setOnClickListener(new c());
        i iVar = (i) new ViewModelProvider(this).get(i.class);
        this.f27757u = iVar;
        iVar.k().observe(this, new Observer() { // from class: tj.p
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                WordListActivity.this.u1((d.g) obj);
            }
        });
        this.f27757u.i().observe(this, new Observer() { // from class: tj.q
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                WordListActivity.this.i1((BookAdObservables.BookAdInfo) obj);
            }
        });
        this.f27757u.j().observe(this, new Observer() { // from class: tj.r
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                WordListActivity.this.k1((a) obj);
            }
        });
        d1();
        this.f27757u.r();
        this.f27757u.m();
        this.f27757u.q();
        l1();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f27741e.a();
        h hVar = this.f27754r;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f27754r.unsubscribe();
        }
        h hVar2 = this.f27753q;
        if (hVar2 == null || hVar2.isUnsubscribed()) {
            return;
        }
        this.f27753q.unsubscribe();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        SortWindow.d().g(null);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        SortWindow.d().g(this);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(f27734x, this.f27737a);
    }

    public final void p1(ArrayList<WordListItem> items) {
        if (items == null) {
            return;
        }
        switch (this.f27751o) {
            case 2:
                Collections.sort(items, Collections.reverseOrder(WordListItem.i()));
                break;
            case 3:
                Collections.sort(items, WordListItem.i());
                break;
            case 4:
                Collections.sort(items, Collections.reverseOrder(WordListItem.g()));
                break;
            case 5:
                Collections.sort(items, WordListItem.g());
                break;
            case 6:
                Collections.sort(items, WordListItem.h());
                break;
            case 7:
                Collections.sort(items, Collections.reverseOrder(WordListItem.h()));
                break;
        }
    }

    public final void s1(int tab) {
        BookRecord k11;
        String str = tab != 0 ? tab != 1 ? tab != 2 ? "" : ma.a.P2 : ma.a.O2 : ma.a.N2;
        if (TextUtils.isEmpty(str) || (k11 = x.r().k()) == null || k11.bookId == 0) {
            return;
        }
        l.b(t.f73025x, str, u.b(new String[]{"bookid"}, new String[]{k11.bookId + ""}));
    }

    public final void t1() {
        if (this.f27748l != null) {
            boolean z11 = !this.f27742f.isSelected();
            this.f27742f.setSelected(z11);
            this.f27748l.F(z11);
        }
    }

    public final void u1(d.g state) {
        float r11 = sh.d.s().r();
        qb.c.i(f27733w, "updateOfflineStatus %s", state.toString());
        if (!TextUtils.isEmpty(state.f88567d)) {
            va.g.i(state.f88567d, 0);
        }
        i.w(state, r11, this.f27738b.f55412g);
    }

    @Override // hj.n
    public void E(@Nullable m value) {
    }
}
