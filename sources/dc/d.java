package dc;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SectionIndexer;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.baicizhan.client.business.thrift.ThriftRequest;
import com.baicizhan.client.business.thrift.r;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.client.business.widget.PinnedSectionListView;
import com.baicizhan.client.business.widget.PullToRefreshPinnedSectionListView;
import com.baicizhan.client.video.activity.TVItemView;
import com.baicizhan.client.video.activity.TVPlayActivity;
import com.baicizhan.client.video.data.WordTVInfo;
import com.baicizhan.main.wordlist.activity.WordListItem;
import com.baicizhan.online.bs_words.BBWordMediaV3;
import com.baicizhan.online.bs_words.BSWords;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.jiongji.andriod.card.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.j2;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d extends Fragment implements View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public static final String f47707h = "TVTimelineFragment";

    /* renamed from: i, reason: collision with root package name */
    public static final long f47708i = 1420128000000L;

    /* renamed from: j, reason: collision with root package name */
    public static final String f47709j = "key_word_tv_list";

    /* renamed from: a, reason: collision with root package name */
    public PullToRefreshPinnedSectionListView f47710a;

    /* renamed from: b, reason: collision with root package name */
    public View f47711b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f47712c;

    /* renamed from: e, reason: collision with root package name */
    public C0562d f47714e;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f47713d = false;

    /* renamed from: f, reason: collision with root package name */
    public List<Long> f47715f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public List<List<WordTVInfo>> f47716g = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f47710a.f();
            d.this.L();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends ThriftRequest<BSWords.Client, List<BBWordMediaV3>> {
        public c(String domain) {
            super(domain);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<BBWordMediaV3> doInBackground(BSWords.Client client) throws Exception {
            r.i(client).j(1);
            long convert = TimeUnit.SECONDS.convert(d.this.I(), TimeUnit.MILLISECONDS);
            int J = d.this.J();
            Log.d(d.f47707h, "get_video_list_learned " + convert + j2.O + J);
            return client.get_video_list_learned(convert, 12, J);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(List<BBWordMediaV3> result) {
            d.this.f47713d = false;
            Log.d(d.f47707h, "====== result size ====== " + result.size());
            Iterator<BBWordMediaV3> it = result.iterator();
            while (it.hasNext()) {
                Log.d(d.f47707h, it.next().toString());
            }
            Log.d(d.f47707h, "=================");
            List<WordTVInfo> a11 = WordTVInfo.a(result);
            d.this.G(a11);
            if (d.this.K()) {
                d.this.f47712c.setText(R.string.video_empty_text_no_history);
            } else if (a11.size() == 0) {
                g.i("没有更早的单词了", 0);
            } else {
                d.this.f47714e.c(d.this.f47715f, d.this.f47716g);
            }
            d.this.f47710a.g();
            d.this.M();
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            d.this.f47713d = false;
            d.this.M();
            if (d.this.K()) {
                d.this.f47712c.setText(R.string.video_empty_text_no_network);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: dc.d$d, reason: collision with other inner class name */
    public static class C0562d extends BaseAdapter implements PinnedSectionListView.e, SectionIndexer {

        /* renamed from: f, reason: collision with root package name */
        public static final int f47720f = 0;

        /* renamed from: g, reason: collision with root package name */
        public static final int f47721g = 1;

        /* renamed from: h, reason: collision with root package name */
        public static final int f47722h = 2;

        /* renamed from: i, reason: collision with root package name */
        public static final int f47723i = 2;

        /* renamed from: c, reason: collision with root package name */
        public Long[] f47726c;

        /* renamed from: d, reason: collision with root package name */
        public List<List<WordTVInfo>> f47727d;

        /* renamed from: e, reason: collision with root package name */
        public int[] f47728e;

        /* renamed from: b, reason: collision with root package name */
        public int f47725b = 0;

        /* renamed from: a, reason: collision with root package name */
        public Calendar f47724a = Calendar.getInstance();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: dc.d$d$a */
        public class a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f47729a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f47730b;

            public a(final List val$section, final int val$index) {
                this.f47729a = val$section;
                this.f47730b = val$index;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v11) {
                Context context = v11.getContext();
                TVPlayActivity.W0(context, context.getString(R.string.video_title_learned), this.f47729a, this.f47730b);
            }
        }

        @Override // com.baicizhan.client.business.widget.PinnedSectionListView.e
        public boolean a(int viewType) {
            return viewType == 0;
        }

        public String b(long timestamp) {
            int betweenDays = TimeUtil.getBetweenDays(System.currentTimeMillis(), timestamp);
            if (betweenDays == 0) {
                return WordListItem.f27795i;
            }
            if (betweenDays == 1) {
                return "昨天";
            }
            if (betweenDays == 2) {
                return "前天";
            }
            if (timestamp <= d.f47708i) {
                return WordListItem.f27794h;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(timestamp);
            return new SimpleDateFormat(this.f47724a.get(1) == calendar.get(1) ? "M月dd日" : "yyyy年M月dd日", Locale.CHINA).format(calendar.getTime());
        }

        public void c(List<Long> sectionTimestamps, List<List<WordTVInfo>> sectionTVInfos) {
            Log.d(d.f47707h, "update " + sectionTimestamps.size());
            Long[] lArr = new Long[sectionTimestamps.size()];
            this.f47726c = lArr;
            sectionTimestamps.toArray(lArr);
            this.f47727d = sectionTVInfos;
            this.f47728e = new int[sectionTVInfos.size()];
            this.f47725b = 0;
            for (int i11 = 0; i11 < this.f47727d.size(); i11++) {
                int[] iArr = this.f47728e;
                int i12 = this.f47725b;
                iArr[i11] = i12;
                int i13 = i12 + 1;
                this.f47725b = i13;
                this.f47725b = i13 + ((this.f47727d.get(i11).size() + 1) >> 1);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f47725b;
        }

        @Override // android.widget.Adapter
        public Object getItem(int position) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int position) {
            return this.f47728e[getSectionForPosition(position)] == position ? 0 : 1;
        }

        @Override // android.widget.SectionIndexer
        public int getPositionForSection(int sectionIndex) {
            return this.f47728e[sectionIndex];
        }

        @Override // android.widget.SectionIndexer
        public int getSectionForPosition(int position) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f47728e;
                if (i11 >= iArr.length) {
                    return iArr.length - 1;
                }
                if (iArr[i11] > position) {
                    return i11 - 1;
                }
                i11++;
            }
        }

        @Override // android.widget.SectionIndexer
        public Object[] getSections() {
            return this.f47726c;
        }

        @Override // android.widget.Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            Context context = parent.getContext();
            if (getItemViewType(position) == 0) {
                if (convertView == null) {
                    convertView = LayoutInflater.from(context).inflate(R.layout.tv_timeline_section, parent, false);
                }
                ((TextView) convertView.findViewById(R.id.text)).setText(b(this.f47726c[getSectionForPosition(position)].longValue()));
                return convertView;
            }
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.tv_timeline_item_view, parent, false);
            }
            ViewGroup viewGroup = (ViewGroup) convertView;
            int sectionForPosition = getSectionForPosition(position);
            int positionForSection = ((position - getPositionForSection(sectionForPosition)) - 1) * 2;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                viewGroup.getChildAt(i11).setVisibility(4);
                viewGroup.getChildAt(i11).setOnClickListener(null);
            }
            List<WordTVInfo> list = this.f47727d.get(sectionForPosition);
            for (int i12 = positionForSection; i12 < positionForSection + 2 && i12 < list.size(); i12++) {
                TVItemView tVItemView = (TVItemView) viewGroup.getChildAt(i12 - positionForSection);
                tVItemView.setVisibility(0);
                tVItemView.a(list.get(i12));
                tVItemView.setOnClickListener(new a(list, i12));
            }
            return convertView;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 2;
        }
    }

    private void H() {
        Log.d(f47707h, "checkPullData");
        if (K()) {
            this.f47710a.setVisibility(0);
            this.f47711b.setVisibility(8);
            this.f47710a.postDelayed(new b(), 500L);
            return;
        }
        Log.d(f47707h, "not empty " + this.f47715f.size());
        C0562d c0562d = this.f47714e;
        if (c0562d != null) {
            c0562d.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int J() {
        if (this.f47716g.size() <= 0) {
            return 0;
        }
        List<WordTVInfo> list = this.f47716g.get(r0.size() - 1);
        if (list.size() > 0) {
            return list.get(list.size() - 1).l();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K() {
        return this.f47715f.size() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        Log.d(f47707h, "refreshView " + K());
        if (K()) {
            this.f47711b.setVisibility(0);
            this.f47710a.setVisibility(8);
        } else {
            this.f47711b.setVisibility(8);
            this.f47710a.setVisibility(0);
        }
    }

    public final void G(List<WordTVInfo> infos) {
        Log.d(f47707h, "appendData " + infos.size());
        if (infos.size() > 0) {
            long startOfDay = TimeUtil.getStartOfDay(I());
            for (WordTVInfo wordTVInfo : infos) {
                long startOfDay2 = TimeUtil.getStartOfDay(wordTVInfo.e());
                if (startOfDay2 != startOfDay) {
                    this.f47715f.add(Long.valueOf(startOfDay2));
                    this.f47716g.add(new ArrayList());
                }
                this.f47716g.get(r0.size() - 1).add(wordTVInfo);
                startOfDay = startOfDay2;
            }
        }
    }

    public final long I() {
        if (this.f47716g.size() <= 0) {
            return Long.MAX_VALUE;
        }
        List<WordTVInfo> list = this.f47716g.get(r0.size() - 1);
        if (list.size() > 0) {
            return list.get(list.size() - 1).e();
        }
        return Long.MAX_VALUE;
    }

    public final void L() {
        if (this.f47713d) {
            return;
        }
        c cVar = new c("/rpc/words");
        this.f47713d = true;
        cVar.setTag(f47707h);
        com.baicizhan.client.business.thrift.c.b().a(cVar);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        if (v11.getId() == R.id.empty_view) {
            H();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(f47707h, "onCreateView " + savedInstanceState);
        View inflate = inflater.inflate(R.layout.fragment_tv_timeline, container, false);
        PullToRefreshPinnedSectionListView pullToRefreshPinnedSectionListView = (PullToRefreshPinnedSectionListView) inflate.findViewById(R.id.timeline_list_view);
        this.f47710a = pullToRefreshPinnedSectionListView;
        pullToRefreshPinnedSectionListView.setMode(PullToRefreshBase.Mode.PULL_FROM_END);
        View findViewById = inflate.findViewById(R.id.empty_view);
        this.f47711b = findViewById;
        findViewById.setOnClickListener(this);
        this.f47712c = (TextView) this.f47711b.findViewById(R.id.text);
        this.f47714e = new C0562d();
        if (savedInstanceState != null && savedInstanceState.containsKey(f47709j)) {
            ArrayList parcelableArrayList = savedInstanceState.getParcelableArrayList(f47709j);
            Log.d(f47707h, "saveInstanceState " + parcelableArrayList.size());
            if (parcelableArrayList.size() > 0) {
                G(parcelableArrayList);
            }
        }
        this.f47714e.c(this.f47715f, this.f47716g);
        this.f47710a.setAdapter(this.f47714e);
        this.f47710a.setVisibility(0);
        ((PinnedSectionListView) this.f47710a.getRefreshableView()).setShadowVisible(false);
        this.f47710a.setOnRefreshListener(new a());
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f47710a.g();
        com.baicizhan.client.business.thrift.c.b().b(f47707h);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Log.d(f47707h, "onResume");
        H();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        if (outState != null && this.f47716g.size() > 0) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<List<WordTVInfo>> it = this.f47716g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                List<WordTVInfo> next = it.next();
                if (arrayList.size() + next.size() >= 12) {
                    arrayList.addAll(next.subList(0, 12 - arrayList.size()));
                    break;
                }
                arrayList.addAll(next);
            }
            Log.d(f47707h, "onSaveInstance size " + arrayList.size());
            outState.putParcelableArrayList(f47709j, arrayList);
        }
        super.onSaveInstanceState(outState);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements PullToRefreshBase.i<PinnedSectionListView> {
        public a() {
        }

        @Override // com.handmark.pulltorefresh.library.PullToRefreshBase.i
        public void b(PullToRefreshBase<PinnedSectionListView> refreshView) {
            Log.d(d.f47707h, "onPullUpToRefresh");
            d.this.L();
        }

        @Override // com.handmark.pulltorefresh.library.PullToRefreshBase.i
        public void a(PullToRefreshBase<PinnedSectionListView> refreshView) {
        }
    }
}
