package dc;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.baicizhan.client.business.thrift.ThriftRequest;
import com.baicizhan.client.business.thrift.r;
import com.baicizhan.client.video.activity.TVItemView;
import com.baicizhan.client.video.activity.TVPlayActivity;
import com.baicizhan.client.video.data.WordTVInfo;
import com.baicizhan.online.bs_words.BSWords;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.thrift.transport.TTransportException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends Fragment implements View.OnClickListener {

    /* renamed from: g, reason: collision with root package name */
    public static final String f47683g = "TVExploreFragment";

    /* renamed from: h, reason: collision with root package name */
    public static final String f47684h = "info_list";

    /* renamed from: a, reason: collision with root package name */
    public View f47685a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f47686b;

    /* renamed from: d, reason: collision with root package name */
    public PullToRefreshGridView f47688d;

    /* renamed from: e, reason: collision with root package name */
    public e f47689e;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f47687c = false;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList<WordTVInfo> f47690f = new ArrayList<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: dc.b$b, reason: collision with other inner class name */
    public class C0560b implements AdapterView.OnItemClickListener {
        public C0560b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> parent, View view, int position, long id2) {
            Context context = parent.getContext();
            TVPlayActivity.W0(context, context.getString(R.string.video_title_explore), b.this.f47690f, position);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f47688d.f();
            b.this.F();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends ThriftRequest<BSWords.Client, List<WordTVInfo>> {
        public d(String domain) {
            super(domain);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<WordTVInfo> doInBackground(BSWords.Client client) throws Exception {
            r.i(client).j(1);
            return WordTVInfo.a(client.get_video_list_explore(b.this.D(), 10));
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(List<WordTVInfo> wordTVInfos) {
            b.this.f47687c = false;
            b.this.f47688d.g();
            b.this.f47690f.clear();
            b.this.f47690f.addAll(wordTVInfos);
            if (wordTVInfos.size() == 0) {
                b.this.f47686b.setText(R.string.video_empty_text_no_explore);
            }
            b.this.f47689e.b(b.this.f47690f);
            b.this.G();
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            b.this.f47687c = false;
            Log.e(b.f47683g, exception.toString());
            if (exception instanceof TTransportException) {
                b.this.f47686b.setText(R.string.video_empty_text_no_network);
            } else {
                b.this.f47686b.setText(R.string.video_empty_text_no_explore);
            }
            b.this.f47688d.g();
            b.this.G();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        public List<WordTVInfo> f47695a = Collections.EMPTY_LIST;

        public void b(List<WordTVInfo> items) {
            this.f47695a = items;
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f47695a.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int position) {
            return this.f47695a.get(position);
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            Context context = parent.getContext();
            if (convertView == null) {
                convertView = new TVItemView(context);
            }
            ((TVItemView) convertView).a(this.f47695a.get(position));
            return convertView;
        }
    }

    private boolean E() {
        return this.f47690f.size() == 0;
    }

    public final void C() {
        Log.d(f47683g, "checkPullData");
        if (E()) {
            this.f47688d.setVisibility(0);
            this.f47685a.setVisibility(8);
            this.f47688d.postDelayed(new c(), 500L);
        } else {
            e eVar = this.f47689e;
            if (eVar != null) {
                eVar.notifyDataSetChanged();
            }
        }
    }

    public final int D() {
        if (this.f47690f.size() <= 0) {
            return 0;
        }
        return this.f47690f.get(r0.size() - 1).l();
    }

    public final void F() {
        if (this.f47687c) {
            return;
        }
        d dVar = new d("/rpc/words");
        this.f47687c = true;
        dVar.setTag(f47683g);
        com.baicizhan.client.business.thrift.c.b().a(dVar);
    }

    public final void G() {
        if (this.f47690f.size() == 0) {
            this.f47685a.setVisibility(0);
            this.f47688d.setVisibility(8);
        } else {
            this.f47685a.setVisibility(8);
            this.f47688d.setVisibility(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        if (v11.getId() == R.id.empty_view) {
            C();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_tv_explore, container, false);
        this.f47685a = inflate.findViewById(R.id.empty_view);
        this.f47686b = (TextView) inflate.findViewById(R.id.text);
        this.f47685a.setOnClickListener(this);
        PullToRefreshGridView pullToRefreshGridView = (PullToRefreshGridView) inflate.findViewById(R.id.explore_grid_view);
        this.f47688d = pullToRefreshGridView;
        pullToRefreshGridView.setMode(PullToRefreshBase.Mode.PULL_FROM_START);
        this.f47688d.setOnRefreshListener(new a());
        this.f47688d.setOnItemClickListener(new C0560b());
        this.f47689e = new e();
        if (savedInstanceState != null && savedInstanceState.containsKey(f47684h)) {
            ArrayList<WordTVInfo> parcelableArrayList = savedInstanceState.getParcelableArrayList(f47684h);
            if (parcelableArrayList.size() > 0) {
                this.f47690f = parcelableArrayList;
            }
        }
        this.f47689e.b(this.f47690f);
        this.f47688d.setAdapter(this.f47689e);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.baicizhan.client.business.thrift.c.b().b(f47683g);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        if (outState != null && this.f47690f.size() > 0) {
            outState.putParcelableArrayList(f47684h, this.f47690f);
        }
        super.onSaveInstanceState(outState);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements PullToRefreshBase.i<GridView> {
        public a() {
        }

        @Override // com.handmark.pulltorefresh.library.PullToRefreshBase.i
        public void a(PullToRefreshBase<GridView> refreshView) {
            b.this.F();
        }

        @Override // com.handmark.pulltorefresh.library.PullToRefreshBase.i
        public void b(PullToRefreshBase<GridView> refreshView) {
        }
    }
}
