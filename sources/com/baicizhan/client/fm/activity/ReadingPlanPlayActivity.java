package com.baicizhan.client.fm.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import com.baicizhan.client.business.thrift.ThriftRequest;
import com.baicizhan.client.business.util.Redirector;
import com.baicizhan.client.business.widget.CircleProgressView;
import com.baicizhan.online.bs_users.BBRedirectInfo;
import com.baicizhan.online.bs_words.BBReadingPlan;
import com.baicizhan.online.bs_words.BBReadingPlanDetail;
import com.baicizhan.online.bs_words.BSWords;
import com.jiongji.andriod.card.R;
import gb.a;
import gs.v1;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import l6.n;
import za.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ReadingPlanPlayActivity extends AudioPlayActivity implements View.OnClickListener {

    /* renamed from: y, reason: collision with root package name */
    public static final String f17382y = "planId";

    /* renamed from: z, reason: collision with root package name */
    public static String f17383z = "ReadingPlanPlayActivity";

    /* renamed from: f, reason: collision with root package name */
    public TextView f17384f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f17385g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f17386h;

    /* renamed from: i, reason: collision with root package name */
    public View f17387i;

    /* renamed from: j, reason: collision with root package name */
    public ListView f17388j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f17389k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f17390l;

    /* renamed from: m, reason: collision with root package name */
    public SeekBar f17391m;

    /* renamed from: n, reason: collision with root package name */
    public BBRedirectInfo f17392n;

    /* renamed from: o, reason: collision with root package name */
    public View f17393o;

    /* renamed from: p, reason: collision with root package name */
    public ImageView f17394p;

    /* renamed from: q, reason: collision with root package name */
    public ImageView f17395q;

    /* renamed from: r, reason: collision with root package name */
    public ImageView f17396r;

    /* renamed from: s, reason: collision with root package name */
    public va.f f17397s;

    /* renamed from: t, reason: collision with root package name */
    public e f17398t;

    /* renamed from: u, reason: collision with root package name */
    public int f17399u;

    /* renamed from: v, reason: collision with root package name */
    public List<BBReadingPlanDetail> f17400v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f17401w;

    /* renamed from: x, reason: collision with root package name */
    public v1 f17402x;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            ReadingPlanPlayActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements a.b {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<ReadingPlanPlayActivity> f17407a;

        /* renamed from: b, reason: collision with root package name */
        public final BBReadingPlanDetail f17408b;

        public d(ReadingPlanPlayActivity activity, @NonNull BBReadingPlanDetail chapter) {
            this.f17407a = new WeakReference<>(activity);
            this.f17408b = chapter;
        }

        @Override // gb.a.b
        public void a(double progress) {
            ReadingPlanPlayActivity readingPlanPlayActivity = this.f17407a.get();
            if (readingPlanPlayActivity == null || readingPlanPlayActivity.f17398t == null) {
                return;
            }
            readingPlanPlayActivity.f17398t.notifyDataSetChanged();
        }

        @Override // gb.a.b
        public void onError(String msg) {
            ReadingPlanPlayActivity readingPlanPlayActivity = this.f17407a.get();
            if (readingPlanPlayActivity == null || readingPlanPlayActivity.f17398t == null) {
                return;
            }
            va.g.i(msg, 0);
            readingPlanPlayActivity.f17398t.notifyDataSetChanged();
        }

        @Override // gb.a.b
        public void onStart() {
            ReadingPlanPlayActivity readingPlanPlayActivity = this.f17407a.get();
            if (readingPlanPlayActivity == null || readingPlanPlayActivity.f17398t == null) {
                return;
            }
            readingPlanPlayActivity.f17398t.notifyDataSetChanged();
        }

        @Override // gb.a.b
        public void onSuccess(String path) {
            ReadingPlanPlayActivity readingPlanPlayActivity = this.f17407a.get();
            if (readingPlanPlayActivity == null || readingPlanPlayActivity.f17398t == null) {
                return;
            }
            this.f17408b.setAudio_url(n.f70249a + path);
            readingPlanPlayActivity.f17398t.notifyDataSetChanged();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends BaseAdapter {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f17410a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ za.b f17411b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BBReadingPlanDetail f17412c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a.b f17413d;

            public a(final b val$holder, final za.b val$rc, final BBReadingPlanDetail val$chapter, final a.b val$downloadListener) {
                this.f17410a = val$holder;
                this.f17411b = val$rc;
                this.f17412c = val$chapter;
                this.f17413d = val$downloadListener;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v11) {
                if (this.f17410a.f17418d.getVisibility() == 0) {
                    this.f17411b.g(this.f17412c.getAudio_file_name(), this.f17412c.getAudio_url(), this.f17413d);
                } else if (this.f17410a.f17419e.getVisibility() == 0) {
                    this.f17411b.f(this.f17412c.getAudio_file_name());
                    e.this.notifyDataSetChanged();
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b {

            /* renamed from: a, reason: collision with root package name */
            public TextView f17415a;

            /* renamed from: b, reason: collision with root package name */
            public TextView f17416b;

            /* renamed from: c, reason: collision with root package name */
            public View f17417c;

            /* renamed from: d, reason: collision with root package name */
            public ImageView f17418d;

            /* renamed from: e, reason: collision with root package name */
            public CircleProgressView f17419e;

            public b() {
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ReadingPlanPlayActivity.this.f17400v.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int position) {
            return ReadingPlanPlayActivity.this.f17400v.get(position);
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return ((BBReadingPlanDetail) ReadingPlanPlayActivity.this.f17400v.get(position)).getChapter_num();
        }

        @Override // android.widget.Adapter
        public View getView(final int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(ReadingPlanPlayActivity.this).inflate(R.layout.chapter_item_view, parent, false);
                b bVar = new b();
                bVar.f17415a = (TextView) convertView.findViewById(R.id.name);
                bVar.f17416b = (TextView) convertView.findViewById(R.id.duration);
                bVar.f17417c = convertView.findViewById(R.id.download_container);
                bVar.f17418d = (ImageView) convertView.findViewById(R.id.download);
                bVar.f17419e = (CircleProgressView) convertView.findViewById(R.id.progress);
                convertView.setTag(bVar);
            }
            b bVar2 = (b) convertView.getTag();
            BBReadingPlanDetail bBReadingPlanDetail = (BBReadingPlanDetail) getItem(position);
            bVar2.f17415a.setText(bBReadingPlanDetail.getChapter_name());
            int duration = bBReadingPlanDetail.getDuration();
            bVar2.f17416b.setText(String.format("%02d:%02d", Integer.valueOf(duration / 60), Integer.valueOf(duration % 60)));
            if (bBReadingPlanDetail.getFile_size() > 0) {
                TextView textView = bVar2.f17416b;
                textView.setText(String.format("%s %.2fMB", textView.getText(), Double.valueOf(bBReadingPlanDetail.getFile_size() / 1048576.0d)));
            }
            za.b j11 = za.b.j();
            Double i11 = j11.i(bBReadingPlanDetail.getAudio_file_name());
            if (i11 == null) {
                bVar2.f17418d.setVisibility(0);
                bVar2.f17419e.setVisibility(4);
            } else if (i11.doubleValue() > 1.0d) {
                bVar2.f17418d.setVisibility(4);
                bVar2.f17419e.setVisibility(4);
            } else {
                bVar2.f17418d.setVisibility(4);
                bVar2.f17419e.setVisibility(0);
                bVar2.f17419e.setMaxProgress(100);
                bVar2.f17419e.setProgress((int) (i11.doubleValue() * 100.0d));
            }
            d dVar = new d(ReadingPlanPlayActivity.this, bBReadingPlanDetail);
            j11.o(bBReadingPlanDetail.getAudio_file_name(), dVar);
            bVar2.f17417c.setOnClickListener(new a(bVar2, j11, bBReadingPlanDetail, dVar));
            return convertView;
        }

        public e() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements b.c<List<BBReadingPlanDetail>> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<ReadingPlanPlayActivity> f17421a;

        public f(ReadingPlanPlayActivity activity) {
            this.f17421a = new WeakReference<>(activity);
        }

        @Override // za.b.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<BBReadingPlanDetail> res) {
            ReadingPlanPlayActivity readingPlanPlayActivity = this.f17421a.get();
            if (readingPlanPlayActivity == null) {
                return;
            }
            readingPlanPlayActivity.f17400v = res;
            readingPlanPlayActivity.f17398t.notifyDataSetChanged();
            if (readingPlanPlayActivity.f17397s != null) {
                readingPlanPlayActivity.f17397s.dismiss();
            }
        }

        @Override // za.b.c
        public void onError(String msg) {
            ReadingPlanPlayActivity readingPlanPlayActivity = this.f17421a.get();
            if (readingPlanPlayActivity == null) {
                return;
            }
            if (readingPlanPlayActivity.f17397s != null) {
                readingPlanPlayActivity.f17397s.dismiss();
            }
            readingPlanPlayActivity.s1(msg);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g implements b.c<List<BBReadingPlan>> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<ReadingPlanPlayActivity> f17422a;

        public g(ReadingPlanPlayActivity activity) {
            this.f17422a = new WeakReference<>(activity);
        }

        @Override // za.b.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<BBReadingPlan> res) {
            ReadingPlanPlayActivity readingPlanPlayActivity = this.f17422a.get();
            if (readingPlanPlayActivity == null) {
                return;
            }
            for (BBReadingPlan bBReadingPlan : res) {
                if (bBReadingPlan.getPlan_id() == readingPlanPlayActivity.f17399u) {
                    hc.c.l(bBReadingPlan.getImg_url()).j(R.drawable.readplan).o(readingPlanPlayActivity.f17386h);
                    readingPlanPlayActivity.f17384f.setText(bBReadingPlan.getPlan_name() + "\n级别: " + bBReadingPlan.getPlan_level());
                    readingPlanPlayActivity.f17385g.setText(bBReadingPlan.getPlan_descrp());
                    readingPlanPlayActivity.f17392n = bBReadingPlan.getMall_info();
                    za.b.j().m(ReadingPlanPlayActivity.f17383z, readingPlanPlayActivity.f17399u, new f(readingPlanPlayActivity));
                    return;
                }
            }
            onError("无法获取阅读计划概要");
        }

        @Override // za.b.c
        public void onError(String msg) {
            ReadingPlanPlayActivity readingPlanPlayActivity = this.f17422a.get();
            if (readingPlanPlayActivity == null) {
                return;
            }
            if (readingPlanPlayActivity.f17397s != null) {
                readingPlanPlayActivity.f17397s.dismiss();
            }
            readingPlanPlayActivity.s1(msg);
        }
    }

    private void q1() {
        this.f17384f = this.f17402x.f57118m;
        this.f17385g = (TextView) findViewById(R.id.desc);
        this.f17386h = (ImageView) findViewById(R.id.image);
        View findViewById = findViewById(R.id.buy);
        this.f17387i = findViewById;
        findViewById.setClickable(false);
        this.f17389k = (TextView) findViewById(R.id.now_time);
        this.f17390l = (TextView) findViewById(R.id.end_time);
        this.f17391m = (SeekBar) findViewById(R.id.seekbar);
        View findViewById2 = findViewById(R.id.control_panel);
        this.f17393o = findViewById2;
        findViewById2.setVisibility(8);
        this.f17394p = (ImageView) findViewById(R.id.play);
        this.f17395q = (ImageView) findViewById(R.id.prev);
        this.f17396r = (ImageView) findViewById(R.id.next);
        this.f17388j = (ListView) findViewById(R.id.chapter_list);
    }

    private void r1() {
        za.b j11 = za.b.j();
        va.f fVar = new va.f(this);
        this.f17397s = fVar;
        fVar.f("请稍候");
        this.f17397s.show();
        j11.k(f17383z, new g(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s1(String msg) {
        va.g.i(msg, 0);
        finish();
    }

    private void t1() {
        ListView listView = this.f17388j;
        e eVar = new e();
        this.f17398t = eVar;
        listView.setAdapter((ListAdapter) eVar);
    }

    private void u1() {
        v1();
        this.f17391m.setOnSeekBarChangeListener(new b());
    }

    private void v1() {
        this.f17394p.setOnClickListener(this);
        this.f17395q.setOnClickListener(this);
        this.f17396r.setOnClickListener(this);
        this.f17387i.setOnClickListener(this);
        this.f17388j.setOnItemClickListener(new c());
    }

    public static void w1(Context context, int planId) {
        Intent intent = new Intent(context, (Class<?>) ReadingPlanPlayActivity.class);
        intent.putExtra(f17382y, planId);
        context.startActivity(intent);
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity
    public void S0() {
        this.f17394p.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.wordsfm_play_normal_default));
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity
    public void T0() {
        this.f17398t.notifyDataSetChanged();
        this.f17393o.setVisibility(0);
        this.f17394p.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.wordsfm_pause_normal_default));
        this.f17391m.setMax(P0());
        int P0 = P0() / 1000;
        this.f17390l.setText(String.format("%02d:%02d", Integer.valueOf(P0 / 60), Integer.valueOf(P0 % 60)));
        i9.f.k(this, i9.f.h(i9.f.Z, "" + this.f17399u), (int) (System.currentTimeMillis() / 1000));
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity
    public void U0(int playId, boolean isCompleted) {
        if (!this.f17401w) {
            this.f17393o.setVisibility(8);
        }
        this.f17401w = false;
        if (isCompleted) {
            if (playId < 0 || playId >= this.f17400v.size() - 1) {
                d1();
            } else {
                int i11 = playId + 1;
                b1(i11, this.f17400v.get(i11).getAudio_url());
            }
        }
        this.f17398t.notifyDataSetChanged();
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity
    public void V0(int playId) {
        va.g.i("播放取消", 0);
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity
    public void W0(int playId, int what, int extra) {
        va.g.i("音频加载失败", 0);
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity
    public void X0(int playId, IOException e11) {
        va.g.i("音频加载失败: " + e11.getMessage(), 0);
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity
    public void Y0() {
        va.g.i("请在稳定的网络环境下播放在线音频", 0);
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity
    public void Z0(int position) {
        this.f17391m.setProgress(position);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int O0 = O0();
        if (v11 == this.f17394p) {
            if (Q0()) {
                a1();
                return;
            } else {
                b1(O0(), this.f17400v.get(O0()).getAudio_url());
                return;
            }
        }
        if (v11 == this.f17395q && O0 > 0) {
            int i11 = O0 - 1;
            this.f17401w = true;
            b1(i11, this.f17400v.get(i11).getAudio_url());
        } else if (v11 != this.f17396r || O0 >= this.f17400v.size() - 1) {
            if (v11 == this.f17387i) {
                new Redirector(this).redirect(this.f17392n);
            }
        } else {
            int i12 = O0 + 1;
            this.f17401w = true;
            b1(i12, this.f17400v.get(i12).getAudio_url());
        }
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        int intExtra = getIntent().getIntExtra(f17382y, -1);
        this.f17399u = intExtra;
        if (intExtra < 0) {
            finish();
            return;
        }
        super.onCreate(savedInstanceState);
        v1 v1Var = (v1) DataBindingUtil.setContentView(this, R.layout.activity_reading_plan_play);
        this.f17402x = v1Var;
        v1Var.f57106a.D(new a());
        this.f17400v = new ArrayList();
        this.f17401w = false;
        q1();
        u1();
        t1();
        r1();
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity, com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.baicizhan.client.business.thrift.c.b().b(f17383z);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements AdapterView.OnItemClickListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> parent, View view, int position, long id2) {
            ReadingPlanPlayActivity.this.b1(position, ((BBReadingPlanDetail) ((e) parent.getAdapter()).getItem(position)).getAudio_url());
            com.baicizhan.client.business.thrift.c.b().a(new a("/rpc/words", ReadingPlanPlayActivity.f17383z));
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends ThriftRequest<BSWords.Client, Void> {
            public a(String domain, String tag) {
                super(domain, tag);
            }

            @Override // com.baicizhan.client.business.thrift.ThriftRequest
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void doInBackground(BSWords.Client client) throws Exception {
                client.update_reading_plan_play_times(ReadingPlanPlayActivity.this.f17399u, 1);
                return null;
            }

            @Override // com.baicizhan.client.business.thrift.ThriftRequest
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onResult(Void aVoid) {
            }

            @Override // com.baicizhan.client.business.thrift.ThriftRequest
            public void onError(Exception exception) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements SeekBar.OnSeekBarChangeListener {
        public b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            int i11 = progress / 1000;
            ReadingPlanPlayActivity.this.f17389k.setText(String.format("%02d:%02d", Integer.valueOf(i11 / 60), Integer.valueOf(i11 % 60)));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ReadingPlanPlayActivity.this.c1(seekBar.getProgress());
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }
    }
}
