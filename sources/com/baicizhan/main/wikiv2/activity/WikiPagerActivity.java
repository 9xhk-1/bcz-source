package com.baicizhan.main.wikiv2.activity;

import a00.h0;
import a00.i0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.baicizhan.client.business.dataset.models.UniverseTopicId;
import com.baicizhan.client.business.widget.SwipeViewPager;
import com.baicizhan.main.wikiv2.activity.WikiPagerActivity;
import com.baicizhan.main.wikiv2.lookup.WordWikiFragment;
import com.baicizhan.main.wikiv2.lookup.wikiv2.WikiSceneFragment;
import com.baicizhan.main.wikiv2.study.StudyWikiFragment;
import com.baicizhan.main.wikiv2.studyv2.StudyWikiV2Fragment;
import com.baicizhan.main.wordlist.activity.WordListItem;
import com.baicizhan.online.resource_api.GetTopicResourceChannel;
import com.jiongji.andriod.card.R;
import gs.v2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWikiPagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WikiPagerActivity.kt\ncom/baicizhan/main/wikiv2/activity/WikiPagerActivity\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,145:1\n35#2:146\n35#2:147\n*S KotlinDebug\n*F\n+ 1 WikiPagerActivity.kt\ncom/baicizhan/main/wikiv2/activity/WikiPagerActivity\n*L\n45#1:146\n54#1:147\n*E\n"})
@qu.b
/* loaded from: classes3.dex */
public final class WikiPagerActivity extends Hilt_WikiPagerActivity {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f25543f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f25544g = 8;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final String f25545h = "arg_wiki_type";

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final String f25546i = "arg_wiki_words_info";

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final String f25547j = "arg_wiki_current_pos";

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final String f25548k = "wiki_channel";

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c0 f25549e = e0.c(new x00.a() { // from class: mi.c
        @Override // x00.a
        public final Object invoke() {
            v2 L0;
            L0 = WikiPagerActivity.L0(WikiPagerActivity.this);
            return L0;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nWikiPagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WikiPagerActivity.kt\ncom/baicizhan/main/wikiv2/activity/WikiPagerActivity$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n1573#2:146\n1604#2,4:147\n*S KotlinDebug\n*F\n+ 1 WikiPagerActivity.kt\ncom/baicizhan/main/wikiv2/activity/WikiPagerActivity$Companion\n*L\n118#1:146\n118#1:147,4\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static /* synthetic */ void c(a aVar, Context context, WikiType wikiType, List list, WikiBasicInfo wikiBasicInfo, GetTopicResourceChannel getTopicResourceChannel, int i11, Object obj) {
            if ((i11 & 16) != 0) {
                getTopicResourceChannel = GetTopicResourceChannel.LOOK_UP;
            }
            aVar.b(context, wikiType, list, wikiBasicInfo, getTopicResourceChannel);
        }

        @w00.k
        public final void a(@k Context context, @k WikiType wikiType, @k List<? extends Object> wordsInfo, @k WikiBasicInfo currentWord) {
            g0.p(context, "context");
            g0.p(wikiType, "wikiType");
            g0.p(wordsInfo, "wordsInfo");
            g0.p(currentWord, "currentWord");
            c(this, context, wikiType, wordsInfo, currentWord, null, 16, null);
        }

        @w00.k
        public final void b(@k Context context, @k WikiType wikiType, @k List<? extends Object> wordsInfo, @k WikiBasicInfo currentWord, @k GetTopicResourceChannel channel) {
            g0.p(context, "context");
            g0.p(wikiType, "wikiType");
            g0.p(wordsInfo, "wordsInfo");
            g0.p(currentWord, "currentWord");
            g0.p(channel, "channel");
            long currentTimeMillis = System.currentTimeMillis();
            ConcurrentHashMap<Long, List<WikiBasicInfo>> a11 = mi.a.f73267a.a();
            Long valueOf = Long.valueOf(currentTimeMillis);
            List<? extends Object> list = wordsInfo;
            ArrayList arrayList = new ArrayList(i0.d0(list, 10));
            int i11 = 0;
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    h0.b0();
                }
                if (!(obj instanceof WordListItem)) {
                    throw new IllegalArgumentException("illegal list type");
                }
                WordListItem wordListItem = (WordListItem) obj;
                int topicId = UniverseTopicId.getTopicId(wordListItem.n());
                int bookId = UniverseTopicId.getBookId(wordListItem.n());
                if (topicId == currentWord.g() && bookId == currentWord.e()) {
                    i11 = i12;
                }
                arrayList.add(new WikiBasicInfo(topicId, bookId));
                i12 = i13;
            }
            a11.put(valueOf, arrayList);
            Intent intent = new Intent(context, (Class<?>) WikiPagerActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable(WikiPagerActivity.f25545h, wikiType);
            bundle.putLong(WikiPagerActivity.f25546i, currentTimeMillis);
            bundle.putInt(WikiPagerActivity.f25547j, i11);
            bundle.putSerializable("wiki_channel", channel);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends FragmentStatePagerAdapter {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final WikiType f25550a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<WikiBasicInfo> f25551b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final GetTopicResourceChannel f25552c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ WikiPagerActivity f25553d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f25554a;

            static {
                int[] iArr = new int[WikiType.values().length];
                try {
                    iArr[WikiType.STUDY_WIKI.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WikiType.EXAM_WIKI.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[WikiType.WIKI_SCENE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[WikiType.WORD_LIST_WIKI.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f25554a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@k WikiPagerActivity wikiPagerActivity, @k WikiType wikiType, @k List<WikiBasicInfo> wordList, @k GetTopicResourceChannel channel, FragmentManager fragmentManager) {
            super(fragmentManager);
            g0.p(wikiType, "wikiType");
            g0.p(wordList, "wordList");
            g0.p(channel, "channel");
            g0.p(fragmentManager, "fragmentManager");
            this.f25553d = wikiPagerActivity;
            this.f25550a = wikiType;
            this.f25551b = wordList;
            this.f25552c = channel;
        }

        @k
        public final GetTopicResourceChannel a() {
            return this.f25552c;
        }

        @k
        public final WikiType b() {
            return this.f25550a;
        }

        @k
        public final List<WikiBasicInfo> c() {
            return this.f25551b;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f25551b.size();
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        @k
        public Fragment getItem(int i11) {
            int i12 = a.f25554a[this.f25550a.ordinal()];
            return i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? WordWikiFragment.a.e(WordWikiFragment.f25562t, this.f25551b.get(i11).g(), this.f25551b.get(i11).e(), this.f25552c, 0, false, 24, null) : WikiSceneFragment.a.f(WikiSceneFragment.f25600o, this.f25551b.get(i11).g(), this.f25551b.get(i11).e(), this.f25552c, 0, false, "wordlist", 24, null) : WikiSceneFragment.a.f(WikiSceneFragment.f25600o, this.f25551b.get(i11).g(), this.f25551b.get(i11).e(), this.f25552c, 0, false, "lookup", 24, null) : StudyWikiV2Fragment.a.d(StudyWikiV2Fragment.f25911f, this.f25551b.get(i11).g(), this.f25551b.get(i11).e(), true, false, 8, null) : StudyWikiFragment.f25844e.a(this.f25551b.get(i11).g(), this.f25551b.get(i11).e());
        }
    }

    public static final v2 L0(WikiPagerActivity wikiPagerActivity) {
        v2 d11 = v2.d(wikiPagerActivity.getLayoutInflater());
        g0.o(d11, "inflate(...)");
        return d11;
    }

    public static final void M0(WikiPagerActivity wikiPagerActivity, View view) {
        wikiPagerActivity.finish();
    }

    public final v2 K0() {
        return (v2) this.f25549e.getValue();
    }

    @Override // com.baicizhan.main.wikiv2.activity.Hilt_WikiPagerActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(K0().getRoot());
        K0().f57119a.D(new View.OnClickListener() { // from class: mi.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WikiPagerActivity.M0(WikiPagerActivity.this, view);
            }
        });
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Object obj = extras.get(f25545h);
            g0.n(obj, "null cannot be cast to non-null type com.baicizhan.main.wikiv2.activity.WikiType");
            WikiType wikiType = (WikiType) obj;
            long j11 = extras.getLong(f25546i);
            int i11 = extras.getInt(f25547j);
            Serializable serializable = extras.getSerializable("wiki_channel");
            g0.n(serializable, "null cannot be cast to non-null type com.baicizhan.online.resource_api.GetTopicResourceChannel");
            GetTopicResourceChannel getTopicResourceChannel = (GetTopicResourceChannel) serializable;
            if (wikiType == WikiType.LOOK_UP_WIKI) {
                K0().getRoot().setBackgroundResource(R.color.main_color_white);
            }
            List<WikiBasicInfo> list = mi.a.f73267a.a().get(Long.valueOf(j11));
            if (list != null) {
                List<WikiBasicInfo> list2 = list;
                SwipeViewPager swipeViewPager = K0().f57120b;
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                g0.o(supportFragmentManager, "getSupportFragmentManager(...)");
                swipeViewPager.setAdapter(new b(this, wikiType, list2, getTopicResourceChannel, supportFragmentManager));
                K0().f57120b.setCurrentItem(i11);
            }
        }
    }

    @Override // com.baicizhan.main.wikiv2.activity.Hilt_WikiPagerActivity, com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        mi.a.f73267a.a().clear();
    }
}
