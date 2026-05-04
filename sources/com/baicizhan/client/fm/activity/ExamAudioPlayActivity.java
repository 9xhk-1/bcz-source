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
import com.baicizhan.client.business.widget.CircleProgressView;
import com.baicizhan.client.fm.activity.ExamAudioPlayActivity;
import com.baicizhan.online.bs_words.BBExam;
import com.baicizhan.online.bs_words.BBExamAudio;
import com.jiongji.andriod.card.R;
import gb.a;
import gs.h0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import l6.n;
import va.g;
import za.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ExamAudioPlayActivity extends AudioPlayActivity implements View.OnClickListener {

    /* renamed from: u, reason: collision with root package name */
    public static final String f17343u = "examId";

    /* renamed from: v, reason: collision with root package name */
    public static final String f17344v = "categoryId";

    /* renamed from: w, reason: collision with root package name */
    public static String f17345w = "ExamAudioPlayActivity";

    /* renamed from: f, reason: collision with root package name */
    public ListView f17346f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f17347g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f17348h;

    /* renamed from: i, reason: collision with root package name */
    public SeekBar f17349i;

    /* renamed from: j, reason: collision with root package name */
    public View f17350j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f17351k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f17352l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView f17353m;

    /* renamed from: n, reason: collision with root package name */
    public va.f f17354n;

    /* renamed from: o, reason: collision with root package name */
    public d f17355o;

    /* renamed from: p, reason: collision with root package name */
    public int f17356p;

    /* renamed from: q, reason: collision with root package name */
    public int f17357q;

    /* renamed from: r, reason: collision with root package name */
    public List<BBExamAudio> f17358r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17359s;

    /* renamed from: t, reason: collision with root package name */
    public h0 f17360t;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements AdapterView.OnItemClickListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> parent, View view, int position, long id2) {
            ExamAudioPlayActivity.this.b1(position, ((BBExamAudio) ((d) parent.getAdapter()).getItem(position)).getAudio_url());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements a.b {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<ExamAudioPlayActivity> f17363a;

        /* renamed from: b, reason: collision with root package name */
        public final BBExamAudio f17364b;

        public c(ExamAudioPlayActivity activity, @NonNull BBExamAudio chapter) {
            this.f17363a = new WeakReference<>(activity);
            this.f17364b = chapter;
        }

        @Override // gb.a.b
        public void a(double progress) {
            ExamAudioPlayActivity examAudioPlayActivity = this.f17363a.get();
            if (examAudioPlayActivity == null || examAudioPlayActivity.f17355o == null) {
                return;
            }
            examAudioPlayActivity.f17355o.notifyDataSetChanged();
        }

        @Override // gb.a.b
        public void onError(String msg) {
            ExamAudioPlayActivity examAudioPlayActivity = this.f17363a.get();
            if (examAudioPlayActivity == null || examAudioPlayActivity.f17355o == null) {
                return;
            }
            g.i(msg, 0);
            examAudioPlayActivity.f17355o.notifyDataSetChanged();
        }

        @Override // gb.a.b
        public void onStart() {
            ExamAudioPlayActivity examAudioPlayActivity = this.f17363a.get();
            if (examAudioPlayActivity == null || examAudioPlayActivity.f17355o == null) {
                return;
            }
            examAudioPlayActivity.f17355o.notifyDataSetChanged();
        }

        @Override // gb.a.b
        public void onSuccess(String path) {
            ExamAudioPlayActivity examAudioPlayActivity = this.f17363a.get();
            if (examAudioPlayActivity == null || examAudioPlayActivity.f17355o == null) {
                return;
            }
            this.f17364b.setAudio_url(n.f70249a + path);
            examAudioPlayActivity.f17355o.notifyDataSetChanged();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        public int f17365a;

        /* renamed from: b, reason: collision with root package name */
        public int f17366b;

        /* renamed from: c, reason: collision with root package name */
        public int f17367c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f17369a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ za.a f17370b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BBExamAudio f17371c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a.b f17372d;

            public a(final b val$holder, final za.a val$rc, final BBExamAudio val$chapter, final a.b val$downloadListener) {
                this.f17369a = val$holder;
                this.f17370b = val$rc;
                this.f17371c = val$chapter;
                this.f17372d = val$downloadListener;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v11) {
                if (this.f17369a.f17377d.getVisibility() == 0) {
                    this.f17370b.h(this.f17371c.getAudio_file_name(), this.f17371c.getAudio_url(), this.f17372d);
                } else if (this.f17369a.f17378e.getVisibility() == 0) {
                    this.f17370b.g(this.f17371c.getAudio_file_name());
                    d.this.notifyDataSetChanged();
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b {

            /* renamed from: a, reason: collision with root package name */
            public TextView f17374a;

            /* renamed from: b, reason: collision with root package name */
            public TextView f17375b;

            /* renamed from: c, reason: collision with root package name */
            public View f17376c;

            /* renamed from: d, reason: collision with root package name */
            public ImageView f17377d;

            /* renamed from: e, reason: collision with root package name */
            public CircleProgressView f17378e;

            public b() {
            }
        }

        public d() {
            this.f17365a = ExamAudioPlayActivity.this.getResources().getColor(R.color.main_blue);
            this.f17366b = ExamAudioPlayActivity.this.getResources().getColor(R.color.main_color_main_word);
            this.f17367c = ExamAudioPlayActivity.this.getResources().getColor(R.color.main_color_word_b8);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ExamAudioPlayActivity.this.f17358r.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int position) {
            return ExamAudioPlayActivity.this.f17358r.get(position);
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.Adapter
        public View getView(final int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(ExamAudioPlayActivity.this).inflate(R.layout.chapter_item_view, parent, false);
                b bVar = new b();
                bVar.f17374a = (TextView) convertView.findViewById(R.id.name);
                bVar.f17375b = (TextView) convertView.findViewById(R.id.duration);
                bVar.f17376c = convertView.findViewById(R.id.download_container);
                bVar.f17377d = (ImageView) convertView.findViewById(R.id.download);
                bVar.f17378e = (CircleProgressView) convertView.findViewById(R.id.progress);
                convertView.setTag(bVar);
            }
            b bVar2 = (b) convertView.getTag();
            BBExamAudio bBExamAudio = (BBExamAudio) getItem(position);
            bVar2.f17374a.setText(bBExamAudio.getAudio_name());
            bVar2.f17374a.setTextColor(position == ExamAudioPlayActivity.this.O0() ? this.f17365a : this.f17366b);
            bVar2.f17375b.setTextColor(position == ExamAudioPlayActivity.this.O0() ? this.f17365a : this.f17367c);
            int duration = bBExamAudio.getDuration();
            bVar2.f17375b.setText(String.format("%02d:%02d", Integer.valueOf(duration / 60), Integer.valueOf(duration % 60)));
            if (bBExamAudio.getFile_size() > 0) {
                TextView textView = bVar2.f17375b;
                textView.setText(String.format("%s %.2fMB", textView.getText(), Double.valueOf(bBExamAudio.getFile_size() / 1048576.0d)));
            }
            za.a k11 = za.a.k();
            Double j11 = k11.j(bBExamAudio.getAudio_file_name());
            if (j11 == null) {
                bVar2.f17377d.setVisibility(0);
                bVar2.f17378e.setVisibility(4);
            } else if (j11.doubleValue() > 1.0d) {
                bVar2.f17377d.setVisibility(4);
                bVar2.f17378e.setVisibility(4);
            } else {
                bVar2.f17377d.setVisibility(4);
                bVar2.f17378e.setVisibility(0);
                bVar2.f17378e.setMaxProgress(100);
                bVar2.f17378e.setProgress((int) (j11.doubleValue() * 100.0d));
            }
            c cVar = new c(ExamAudioPlayActivity.this, bBExamAudio);
            k11.r(bBExamAudio.getAudio_file_name(), cVar);
            bVar2.f17376c.setOnClickListener(new a(bVar2, k11, bBExamAudio, cVar));
            return convertView;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements a.d<List<BBExamAudio>> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<ExamAudioPlayActivity> f17380a;

        public e(ExamAudioPlayActivity activity) {
            this.f17380a = new WeakReference<>(activity);
        }

        @Override // za.a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<BBExamAudio> res) {
            ExamAudioPlayActivity examAudioPlayActivity = this.f17380a.get();
            if (examAudioPlayActivity == null) {
                return;
            }
            examAudioPlayActivity.f17358r = res;
            examAudioPlayActivity.f17355o.notifyDataSetChanged();
            if (examAudioPlayActivity.f17354n != null) {
                examAudioPlayActivity.f17354n.dismiss();
            }
        }

        @Override // za.a.d
        public void onError(String msg) {
            ExamAudioPlayActivity examAudioPlayActivity = this.f17380a.get();
            if (examAudioPlayActivity == null) {
                return;
            }
            if (examAudioPlayActivity.f17354n != null) {
                examAudioPlayActivity.f17354n.dismiss();
            }
            examAudioPlayActivity.s1(msg);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements a.d<List<BBExam>> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<ExamAudioPlayActivity> f17381a;

        public f(ExamAudioPlayActivity activity) {
            this.f17381a = new WeakReference<>(activity);
        }

        @Override // za.a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<BBExam> res) {
            ExamAudioPlayActivity examAudioPlayActivity = this.f17381a.get();
            if (examAudioPlayActivity == null) {
                return;
            }
            for (BBExam bBExam : res) {
                if (bBExam.getExam_id() == examAudioPlayActivity.f17356p) {
                    examAudioPlayActivity.f17360t.f55118a.V(bBExam.getExam_name());
                    za.a.k().n(ExamAudioPlayActivity.f17345w, examAudioPlayActivity.f17356p, new e(examAudioPlayActivity));
                    return;
                }
            }
            onError("一致性检测未通过");
        }

        @Override // za.a.d
        public void onError(String msg) {
            ExamAudioPlayActivity examAudioPlayActivity = this.f17381a.get();
            if (examAudioPlayActivity == null) {
                return;
            }
            if (examAudioPlayActivity.f17354n != null) {
                examAudioPlayActivity.f17354n.dismiss();
            }
            examAudioPlayActivity.s1(msg);
        }
    }

    private void p1() {
        this.f17360t.f55118a.D(new View.OnClickListener() { // from class: ab.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExamAudioPlayActivity.this.q1(view);
            }
        });
        this.f17347g = (TextView) findViewById(R.id.now_time);
        this.f17348h = (TextView) findViewById(R.id.end_time);
        this.f17349i = (SeekBar) findViewById(R.id.seekbar);
        View findViewById = findViewById(R.id.control_panel);
        this.f17350j = findViewById;
        findViewById.setVisibility(8);
        this.f17351k = (ImageView) findViewById(R.id.play);
        this.f17352l = (ImageView) findViewById(R.id.prev);
        this.f17353m = (ImageView) findViewById(R.id.next);
        this.f17346f = (ListView) findViewById(R.id.chapter_list);
    }

    public static void w1(Context context, int examId, int categoryId) {
        Intent intent = new Intent(context, (Class<?>) ExamAudioPlayActivity.class);
        intent.putExtra(f17343u, examId);
        intent.putExtra(f17344v, categoryId);
        context.startActivity(intent);
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity
    public void S0() {
        this.f17351k.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.wordsfm_play_normal_default));
        y1(O0());
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity
    public void T0() {
        this.f17355o.notifyDataSetChanged();
        this.f17350j.setVisibility(0);
        this.f17351k.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.wordsfm_pause_normal_default));
        this.f17349i.setMax(P0());
        int P0 = P0() / 1000;
        this.f17348h.setText(String.format("%02d:%02d", Integer.valueOf(P0 / 60), Integer.valueOf(P0 % 60)));
        x1(O0());
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity
    public void U0(int playId, boolean isCompleted) {
        if (!this.f17359s) {
            this.f17350j.setVisibility(8);
        }
        this.f17359s = false;
        if (isCompleted) {
            if (playId < 0 || playId >= this.f17358r.size() - 1) {
                d1();
            } else {
                playId++;
                b1(playId, this.f17358r.get(playId).getAudio_url());
            }
        }
        this.f17355o.notifyDataSetChanged();
        if (playId < 0 || playId > this.f17358r.size() - 1) {
            return;
        }
        y1(playId);
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity
    public void V0(int playId) {
        g.i("播放取消", 0);
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity
    public void W0(int playId, int what, int extra) {
        g.i("音频加载失败", 0);
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity
    public void X0(int playId, IOException e11) {
        g.i("音频加载失败: " + e11.getMessage(), 0);
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity
    public void Y0() {
        g.i("请在稳定的网络环境下播放在线音频", 0);
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity
    public void Z0(int position) {
        this.f17349i.setProgress(position);
    }

    public final String o1(int playId) {
        return ExamAudioPlayActivity.class.getSimpleName() + this.f17356p + "." + ((BBExamAudio) this.f17355o.getItem(playId)).getAudio_file_name();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int O0 = O0();
        if (v11 == this.f17351k) {
            if (Q0()) {
                a1();
                return;
            } else {
                if (O0() >= 0) {
                    b1(O0(), this.f17358r.get(O0()).getAudio_url());
                    return;
                }
                return;
            }
        }
        if (v11 == this.f17352l && O0 > 0) {
            int i11 = O0 - 1;
            this.f17359s = true;
            b1(i11, this.f17358r.get(i11).getAudio_url());
        } else {
            if (v11 != this.f17353m || O0 >= this.f17358r.size() - 1) {
                return;
            }
            int i12 = O0 + 1;
            this.f17359s = true;
            b1(i12, this.f17358r.get(i12).getAudio_url());
        }
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f17356p = getIntent().getIntExtra(f17343u, -1);
        int intExtra = getIntent().getIntExtra(f17344v, -1);
        this.f17357q = intExtra;
        if (this.f17356p < 0 || intExtra < 0) {
            finish();
            return;
        }
        this.f17360t = (h0) DataBindingUtil.setContentView(this, R.layout.activity_exam_audio_play);
        this.f17358r = new ArrayList();
        this.f17359s = false;
        p1();
        u1();
        t1();
        r1();
    }

    @Override // com.baicizhan.client.fm.activity.AudioPlayActivity, com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.baicizhan.client.business.thrift.c.b().b(f17345w);
    }

    public final /* synthetic */ void q1(View view) {
        finish();
    }

    public final void r1() {
        za.a k11 = za.a.k();
        va.f fVar = new va.f(this);
        this.f17354n = fVar;
        fVar.f("请稍候");
        this.f17354n.show();
        k11.p(f17345w, this.f17357q, new f(this));
    }

    public final void s1(String msg) {
        g.i(msg, 0);
        finish();
    }

    public final void t1() {
        ListView listView = this.f17346f;
        d dVar = new d();
        this.f17355o = dVar;
        listView.setAdapter((ListAdapter) dVar);
    }

    public final void u1() {
        v1();
        this.f17349i.setOnSeekBarChangeListener(new a());
    }

    public final void v1() {
        this.f17351k.setOnClickListener(this);
        this.f17352l.setOnClickListener(this);
        this.f17353m.setOnClickListener(this);
        this.f17346f.setOnItemClickListener(new b());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            int i11 = progress / 1000;
            ExamAudioPlayActivity.this.f17347g.setText(String.format("%02d:%02d", Integer.valueOf(i11 / 60), Integer.valueOf(i11 % 60)));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ExamAudioPlayActivity.this.c1(seekBar.getProgress());
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }
    }

    public final void x1(int playId) {
    }

    public final void y1(int playId) {
    }
}
