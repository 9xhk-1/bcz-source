package bb;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bb.h;
import cb.a;
import com.baicizhan.client.business.managers.experience.TaskAction;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.business.util.RxFlowUtilsKt;
import com.baicizhan.client.fm.activity.fragment.FmPlayPager;
import com.baicizhan.client.fm.data.FmList;
import com.baicizhan.client.fm.data.NotifyInfo;
import com.baicizhan.client.fm.data.load.AllDownloader;
import com.baicizhan.client.fm.data.load.AllDownloaderCreator;
import com.baicizhan.client.fm.data.load.FmListLoader;
import com.jiongji.andriod.card.R;
import fb.c;
import i80.l;
import i9.o;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kc.s;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@qu.b
/* loaded from: classes4.dex */
public class d extends bb.i implements View.OnClickListener, c.InterfaceC0614c {
    public static final String S = "FmFragment";
    public qb0.h A;
    public c.g D;
    public int M;
    public long N;
    public long O;
    public CountDownTimer Q;

    @Inject
    public u9.f R;

    /* renamed from: f, reason: collision with root package name */
    public FmPlayPager f6644f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f6645g;

    /* renamed from: h, reason: collision with root package name */
    public i f6646h;

    /* renamed from: i, reason: collision with root package name */
    public ProgressBar f6647i;

    /* renamed from: j, reason: collision with root package name */
    public View f6648j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f6649k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f6650l;

    /* renamed from: m, reason: collision with root package name */
    public RecyclerView f6651m;

    /* renamed from: n, reason: collision with root package name */
    public bb.h f6652n;

    /* renamed from: o, reason: collision with root package name */
    public View f6653o;

    /* renamed from: p, reason: collision with root package name */
    public View f6654p;

    /* renamed from: q, reason: collision with root package name */
    public AllDownloaderCreator f6655q;

    /* renamed from: r, reason: collision with root package name */
    public AllDownloader f6656r;

    /* renamed from: t, reason: collision with root package name */
    public fb.c f6658t;

    /* renamed from: u, reason: collision with root package name */
    public fb.b f6659u;

    /* renamed from: v, reason: collision with root package name */
    public FmList f6660v;

    /* renamed from: w, reason: collision with root package name */
    public List<String> f6661w;

    /* renamed from: x, reason: collision with root package name */
    public List<String> f6662x;

    /* renamed from: y, reason: collision with root package name */
    public String f6663y;

    /* renamed from: z, reason: collision with root package name */
    public String f6664z;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6657s = false;
    public int B = 0;
    public int C = 0;
    public boolean E = false;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;
    public boolean J = false;
    public boolean K = false;
    public j L = new j();
    public int P = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends GridLayoutManager.SpanSizeLookup {
        public a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int position) {
            return d.this.f6652n.c(position) ? 3 : 1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements h.b {
        public b() {
        }

        @Override // bb.h.b
        public void a(int position) {
            if (!d.this.f6652n.c(position)) {
                d.this.o0(position);
                d.this.f6644f.g0(position, false);
                return;
            }
            d.this.H = false;
            d.this.I = false;
            d.this.D = null;
            d.this.E = false;
            d.this.p0();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements wb0.a {
        public e() {
        }

        @Override // wb0.a
        public void call() {
            d.this.f6647i.setVisibility(8);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends CountDownTimer {
        public f(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            d.this.m0();
            d.this.u0();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            long j11 = (millisUntilFinished + 500) / 1000;
            long j12 = j11 / 60;
            long j13 = j12 / 60;
            long j14 = j12 % 60;
            long j15 = j11 % 60;
            d.this.f6649k.setText(j13 == 0 ? String.format(Locale.CHINA, "%02d:%02d", Long.valueOf(j14), Long.valueOf(j15)) : String.format(Locale.CHINA, "%02d:%02d:%02d", Long.valueOf(j13), Long.valueOf(j14), Long.valueOf(j15)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g implements AllDownloader.OnAllDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<d> f6671a;

        /* renamed from: b, reason: collision with root package name */
        public int f6672b;

        public g(d fragment) {
            this.f6671a = new WeakReference<>(fragment);
        }

        @Override // com.baicizhan.client.fm.data.load.AllDownloader.OnAllDownloadListener
        public void onAllDownloadInit(int progress, int completed, int total) {
            d dVar = this.f6671a.get();
            if (dVar == null || dVar.getActivity() == null || dVar.getActivity().isFinishing()) {
                return;
            }
            qb.c.b(d.S, "onAllDownloadInit: %d, %d, %d %b", Integer.valueOf(progress), Integer.valueOf(completed), Integer.valueOf(total), Boolean.valueOf(dVar.f6656r.isDownloading()));
            this.f6672b = progress;
            if (dVar.f6656r.hasDownloaded()) {
                dVar.f6650l.setText(R.string.fm_config_downloaded);
                Drawable drawable = ResourcesCompat.getDrawable(dVar.getResources(), R.drawable.ic_audio_center_downloaded, null);
                if (drawable != null) {
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                }
                dVar.f6650l.setCompoundDrawables(null, drawable, null, null);
            } else if (dVar.f6656r.isDownloading()) {
                qb.c.i(d.S, "not downloaded or downloading...", new Object[0]);
            } else if (progress > 0) {
                String format = String.format(Locale.CHINA, "%d%%", Integer.valueOf(progress));
                TextView textView = dVar.f6650l;
                if (!dVar.f6656r.isDownloading()) {
                    format = dVar.getResources().getString(R.string.fm_config_download_suspended, format);
                }
                textView.setText(format);
            } else {
                dVar.f6650l.setText(R.string.fm_config_download);
            }
            dVar.f6650l.setEnabled(true);
        }

        @Override // com.baicizhan.client.fm.data.load.AllDownloader.OnAllDownloadListener
        public void onAllDownloadProgress(int progress, int completed, int total) {
            d dVar = this.f6671a.get();
            if (dVar == null || dVar.getActivity() == null || dVar.getActivity().isFinishing()) {
                return;
            }
            qb.c.b(d.S, "onAllDownloadProgress: %d, %d, %d, downloading %b ", Integer.valueOf(progress), Integer.valueOf(completed), Integer.valueOf(total), Boolean.valueOf(dVar.f6656r.isDownloading()));
            String format = String.format(Locale.CHINA, "%d%%", Integer.valueOf(progress));
            TextView textView = dVar.f6650l;
            if (progress == 0 && completed == 0 && total == 0) {
                format = "准备下载";
            } else if (!dVar.f6656r.isDownloading()) {
                format = dVar.getResources().getString(R.string.fm_config_download_suspended, format);
            }
            textView.setText(format);
        }

        @Override // com.baicizhan.client.fm.data.load.AllDownloader.OnAllDownloadListener
        public void onAllDownloaded(boolean success, int errCode) {
            d dVar = this.f6671a.get();
            if (dVar == null || dVar.getActivity() == null || dVar.getActivity().isFinishing()) {
                return;
            }
            qb.c.b(d.S, "onAllDownloaded: %b, %d", Boolean.valueOf(success), Integer.valueOf(errCode));
            String string = dVar.getString(R.string.fm_config_downloaded);
            if (!success) {
                string = -1 == errCode ? dVar.getString(R.string.fm_download_all_failed_offline) : -3 == errCode ? this.f6672b > 0 ? dVar.getResources().getString(R.string.fm_config_download_suspended, String.format(Locale.CHINA, "%d%%", Integer.valueOf(this.f6672b))) : dVar.getString(R.string.fm_config_download) : dVar.getString(R.string.fm_download_all_failed);
            }
            dVar.f6650l.setText(string);
            if (success) {
                Drawable drawable = ResourcesCompat.getDrawable(dVar.getResources(), R.drawable.ic_audio_center_downloaded, null);
                if (drawable != null) {
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                }
                dVar.f6650l.setCompoundDrawables(null, drawable, null, null);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h implements AllDownloaderCreator.OnAllDownloaderCreateListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<d> f6673a;

        public h(d fragment) {
            this.f6673a = new WeakReference<>(fragment);
        }

        @Override // com.baicizhan.client.fm.data.load.AllDownloaderCreator.OnAllDownloaderCreateListener
        public void onAllDownloaderCreate(AllDownloader downloader, int errCode) {
            d dVar = this.f6673a.get();
            if (dVar == null || dVar.getActivity() == null || dVar.getActivity().isFinishing()) {
                return;
            }
            if (errCode == -1) {
                va.g.i("离线包数据有缺失，请检查网络是否畅通", 1);
                dVar.f6657s = true;
                dVar.f6650l.setText("离线包缺失");
            } else {
                if (downloader == null || errCode != 0) {
                    dVar.f6650l.setText("未知错误");
                    return;
                }
                dVar.f6656r = downloader;
                if (dVar.f6656r.isPrepared()) {
                    dVar.f6656r.init();
                } else {
                    dVar.f6650l.setEnabled(true);
                    dVar.f6650l.setText(R.string.fm_config_download);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public boolean f6677a;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6677a) {
                d.this.t0();
            } else {
                d.this.o0(0);
            }
        }

        public j() {
            this.f6677a = true;
        }
    }

    private void G0() {
        fb.b bVar = this.f6659u;
        if (bVar != null) {
            bVar.j();
        }
    }

    public static d k0() {
        return new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        fb.b bVar = this.f6659u;
        if (bVar != null) {
            bVar.d();
        }
    }

    private void n0() {
        List<String> list;
        c.g gVar = this.D;
        if (gVar == null) {
            return;
        }
        fb.b bVar = gVar.f51498a;
        this.f6659u = bVar;
        bVar.i(gb.c.c());
        c.g gVar2 = this.D;
        if (!gVar2.f51499b || this.f6659u == null || (list = gVar2.f51500c) == null || list.isEmpty()) {
            va.g.i(this.D.f51502e == -8 ? "电台数据有缺失，请检查网络并重试" : "没有可播放的电台，点击重试吧~", 1);
            this.f6647i.setVisibility(8);
            this.f6648j.setVisibility(0);
            return;
        }
        c.g gVar3 = this.D;
        this.f6661w = gVar3.f51500c;
        this.f6662x = gVar3.f51501d;
        int i11 = gVar3.f51502e;
        if (i11 == -7 || i11 == -6) {
            s0();
            return;
        }
        if (i11 == -5 || i11 == -2) {
            va.g.g(R.string.fm_play_no_offline, 0);
            this.f6647i.setVisibility(8);
            this.f6648j.setVisibility(0);
        } else {
            if (i11 == -1) {
                va.g.g(R.string.fm_play_offline, 0);
            }
            j0();
            if (this.f6656r == null) {
                this.f6655q.create();
            }
        }
    }

    private void v0() {
        fb.b bVar = this.f6659u;
        if (bVar != null) {
            bVar.e();
        }
    }

    private void w0() {
        this.f6658t.w();
        this.f6644f.k0();
        this.f6648j.setVisibility(8);
        this.f6647i.setVisibility(0);
        this.f6645g.setVisibility(8);
        this.f6652n.h(null);
        this.f6652n.notifyDataSetChanged();
    }

    public void A0() {
        if (this.f6648j.getVisibility() == 0) {
            return;
        }
        if (this.H) {
            c0();
        }
        if (this.C == 2) {
            if (this.H) {
                v0();
            } else if (this.I) {
                this.H = true;
                f0();
            }
        }
        this.C = 0;
        this.K = false;
    }

    public void B0(Context context) {
        C0(context);
    }

    public final void C0(Context context) {
        fb.c i11 = fb.c.i(this);
        this.f6658t = i11;
        i11.j(context);
    }

    public void D0() {
        this.F = true;
        if (this.E) {
            n0();
        }
    }

    public final void E0() {
        this.O += this.N == 0 ? 0L : System.currentTimeMillis() - this.N;
        this.N = 0L;
    }

    public final void F0() {
        this.M++;
        this.N = System.currentTimeMillis();
        this.R.c(TaskAction.wordFM, true, 1);
    }

    public final void Y(final boolean hasOfflineFms) {
        fb.b bVar = this.f6659u;
        if (bVar != null) {
            bVar.h(hasOfflineFms ? -1 : -4);
        }
        va.g.g(hasOfflineFms ? R.string.fm_play_offline : R.string.fm_play_no_offline, 0);
        if (hasOfflineFms) {
            return;
        }
        this.f6648j.setVisibility(0);
        this.f6647i.setVisibility(8);
    }

    public void Z(Context context) {
        a0(context);
    }

    public final void a0(Context context) {
        fb.c cVar = this.f6658t;
        if (cVar != null) {
            cVar.h(context);
        }
    }

    public final void b0() {
        AllDownloader allDownloader = this.f6656r;
        if (allDownloader != null) {
            if (allDownloader.isDownloading()) {
                this.f6656r.cancel();
            } else {
                this.f6656r.download();
            }
        }
    }

    public final void c0() {
        i iVar = this.f6646h;
        if (iVar != null) {
            this.f6645g.removeCallbacks(iVar);
        }
        if (((int) this.f6645g.getAlpha()) == 0) {
            this.f6645g.animate().alpha(1.0f).setDuration(300L).setListener(new c()).start();
        }
        i iVar2 = new i(0.0f);
        this.f6646h = iVar2;
        this.f6645g.postDelayed(iVar2, 3000L);
    }

    public final File d0() {
        if (TextUtils.isEmpty(this.f6664z)) {
            return null;
        }
        return new File(this.f6664z);
    }

    public final File e0() {
        if (TextUtils.isEmpty(this.f6663y)) {
            return null;
        }
        return new File(this.f6663y);
    }

    public final void f0() {
        this.f6645g.setVisibility(0);
        this.f6645g.setEnabled(false);
        this.f6644f.n0(this.f6660v, this.f6662x, (!this.J ? 1 : 0) | 2, requireActivity());
        j jVar = this.L;
        jVar.f6677a = !this.J;
        this.f6644f.postDelayed(jVar, 1000L);
        this.f6647i.setVisibility(8);
        this.J = true;
    }

    public final void g0(View root) {
        FmPlayPager fmPlayPager = (FmPlayPager) root.findViewById(R.id.fm_play_pager);
        this.f6644f = fmPlayPager;
        fmPlayPager.setHoldFragment(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.fm_word_pager_padding);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.fm_word_pager_margin);
        this.f6644f.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        this.f6644f.setPageMargin(dimensionPixelSize2);
        this.f6644f.setClipToPadding(false);
        ImageView imageView = (ImageView) root.findViewById(R.id.fm_toggle);
        this.f6645g = imageView;
        imageView.setOnClickListener(this);
        this.f6645g.animate().alpha(0.0f).setDuration(0L).start();
        this.f6647i = (ProgressBar) root.findViewById(R.id.load_progress);
        View findViewById = root.findViewById(R.id.fm_empty);
        this.f6648j = findViewById;
        findViewById.setOnClickListener(this);
        TextView textView = (TextView) root.findViewById(R.id.config_download);
        this.f6650l = textView;
        textView.setOnClickListener(this);
        this.f6650l.setEnabled(false);
        this.f6650l.setText("正在检查");
        this.f6655q = new AllDownloaderCreator.Builder().with(getActivity()).setBookid(x.r().l()).downloadHigh(gb.c.c()).setCreateCallback(new h(this)).setDownloadCallback(new g(this)).build();
        this.f6651m = (RecyclerView) root.findViewById(R.id.fm_grid);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 3);
        this.f6651m.setLayoutManager(gridLayoutManager);
        bb.h hVar = new bb.h();
        this.f6652n = hVar;
        this.f6651m.setAdapter(hVar);
        gridLayoutManager.setSpanSizeLookup(new a());
        this.f6652n.i(new b());
        this.f6653o = root.findViewById(R.id.list_tag);
        this.f6654p = root.findViewById(R.id.list_tag_divider);
        TextView textView2 = (TextView) root.findViewById(R.id.config_auto_close);
        this.f6649k = textView2;
        textView2.setOnClickListener(this);
    }

    @Override // fb.c.InterfaceC0614c
    public void h(c.g bean) {
        if (getActivity() == null || getActivity().isFinishing()) {
            return;
        }
        AllDownloader allDownloader = this.f6656r;
        if (allDownloader != null && allDownloader.isDownloading()) {
            this.f6656r.cancel();
        }
        l0(NotifyInfo.getFmNotifyInfoJson(getActivity()));
        this.D = bean;
        this.E = true;
        if (this.F) {
            n0();
        }
    }

    public final boolean h0(List<String> fmWordIds, FmList list) {
        if (list == null) {
            qb.c.d(S, "get fm list failed for data inconsistent, list is null", new Object[0]);
            return false;
        }
        if (list.needBorn()) {
            qb.c.d(S, "get fm list failed for data inconsistent, list need born", new Object[0]);
            return false;
        }
        int size = list.size();
        if (size != fmWordIds.size()) {
            qb.c.d(S, "get fm list failed for data inconsistent, list size from client [%d], from service [%d]", Integer.valueOf(size), Integer.valueOf(fmWordIds.size()));
            return false;
        }
        for (int i11 = 0; i11 < size; i11++) {
            if (!fmWordIds.get(i11).equals(list.get(i11).getWordid())) {
                qb.c.d(S, "get fm list failed for data inconsistent, word id inconsistent [%s] - [%s]", fmWordIds.get(i11), list.get(i11).getWordid());
                return false;
            }
        }
        qb.c.i(S, "get fm list consistent!", new Object[0]);
        return true;
    }

    @Override // fb.c.InterfaceC0614c
    public void i(c.e bean) {
        this.f6661w = bean.f51493b;
        this.f6662x = bean.f51494c;
        j0();
        this.f6655q.create();
    }

    public final /* synthetic */ void i0(List list, int i11) {
        int intValue = ((Integer) list.get(i11)).intValue();
        this.P = intValue;
        x0(intValue);
    }

    public final void j0() {
        qb0.h hVar = this.A;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.A.unsubscribe();
        }
        this.A = FmListLoader.loadFmList(getActivity(), x.r().l(), this.f6661w).I3(tb0.a.a()).W1(new e()).r5(new C0113d());
    }

    public void l0(String notifyJson) {
        fb.c cVar = this.f6658t;
        if (cVar != null) {
            cVar.n(notifyJson);
        }
    }

    @Override // fb.c.InterfaceC0614c
    public void m(c.f bean) {
        int i11 = bean.f51495a;
        this.B = i11;
        switch (i11) {
            case 0:
                E0();
                return;
            case 1:
                break;
            case 2:
                this.f6645g.setEnabled(true);
                this.f6645g.setImageResource(R.drawable.wordsfm_pause_normal_default);
                c0();
                if (1001 == bean.f51497c) {
                    this.f6644f.g0(bean.f51496b, false);
                    this.f6644f.l0(bean.f51496b, false);
                    F0();
                }
                if (this.C != 0) {
                    m0();
                    return;
                }
                return;
            case 3:
                this.f6645g.setEnabled(true);
                this.f6645g.setImageResource(R.drawable.wordsfm_play_normal_default);
                c0();
                E0();
                return;
            case 4:
                qb.c.i(S, "loading state, state [%d], index [%d], type [%d]", Integer.valueOf(i11), Integer.valueOf(bean.f51496b), Integer.valueOf(bean.f51497c));
                return;
            case 5:
                qb.c.d(S, "stopped state, state [%d], index [%d], type [%d]", Integer.valueOf(i11), Integer.valueOf(bean.f51496b), Integer.valueOf(bean.f51497c));
                E0();
                return;
            case 6:
                qb.c.d(S, "stopped state, state [%d], index [%d], type [%d]", Integer.valueOf(i11), Integer.valueOf(bean.f51496b), Integer.valueOf(bean.f51497c));
                E0();
                return;
            case 7:
                qb.c.d(S, "stopped state, state [%d], index [%d], type [%d]", Integer.valueOf(i11), Integer.valueOf(bean.f51496b), Integer.valueOf(bean.f51497c));
                E0();
                return;
            case 8:
            default:
                qb.c.d(S, "undefined state, state [%d], index [%d], type [%d]", Integer.valueOf(i11), Integer.valueOf(bean.f51496b), Integer.valueOf(bean.f51497c));
                break;
            case 9:
                qb.c.d(S, "stopped state, state [%d], index [%d], type [%d]", Integer.valueOf(i11), Integer.valueOf(bean.f51496b), Integer.valueOf(bean.f51497c));
                if (1001 == bean.f51497c) {
                    this.f6644f.g0(bean.f51496b, false);
                    this.f6644f.l0(bean.f51496b, true);
                }
                E0();
                return;
            case 10:
                this.f6644f.f0();
                E0();
                return;
            case 11:
                this.f6644f.h0(true);
                E0();
                return;
        }
        this.f6645g.setEnabled(false);
    }

    public void o0(int index) {
        this.f6659u.a(index);
        this.f6652n.g(index);
        this.f6652n.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int id2 = v11.getId();
        if (R.id.fm_toggle == id2) {
            if (((int) this.f6645g.getAlpha()) == 1) {
                this.f6659u.k();
                return;
            } else {
                c0();
                return;
            }
        }
        if (R.id.config_auto_close == id2) {
            y0();
            return;
        }
        if (R.id.config_download != id2) {
            if (R.id.fm_empty == id2) {
                w0();
            }
        } else {
            AllDownloader allDownloader = this.f6656r;
            if (allDownloader == null || !allDownloader.hasDownloaded()) {
                b0();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(S, "fm fragment create view..");
        View inflate = inflater.inflate(R.layout.fragment_fm, container, false);
        g0(inflate);
        i80.c.f().v(this);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(S, "fm fragment destroy view..");
        RxFlowUtilsKt.asRxJava(this.R.a()).w5(bc0.c.e()).u5(new wb0.b() { // from class: bb.a
            @Override // wb0.b
            public final void call(Object obj) {
                d.w((Boolean) obj);
            }
        }, new wb0.b() { // from class: bb.b
            @Override // wb0.b
            public final void call(Object obj) {
                qb.c.c(d.S, "", (Throwable) obj);
            }
        });
        qb0.h hVar = this.A;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.A.unsubscribe();
        }
        AllDownloaderCreator allDownloaderCreator = this.f6655q;
        if (allDownloaderCreator != null) {
            allDownloaderCreator.destroy();
        }
        AllDownloader allDownloader = this.f6656r;
        if (allDownloader != null) {
            allDownloader.cancel();
            this.f6656r.destroy();
        }
        i iVar = this.f6646h;
        if (iVar != null) {
            this.f6645g.removeCallbacks(iVar);
        }
        CountDownTimer countDownTimer = this.Q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f6644f.removeCallbacks(this.L);
        i80.c.f().A(this);
        E0();
    }

    @l
    public void onEventMainThread(a.c event) {
        int a11 = event.a();
        if (a11 == 0) {
            this.C = this.B;
            m0();
        } else if (1 == a11 && 2 == this.C) {
            this.C = 0;
            v0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f6657s) {
            this.f6657s = false;
            this.f6655q.create();
            TextView textView = this.f6650l;
            if (textView != null) {
                textView.setEnabled(false);
                this.f6650l.setText("正在检查");
            }
        }
    }

    public void p0() {
        this.f6658t.q();
        this.f6644f.k0();
        this.f6647i.setVisibility(0);
        this.f6645g.setVisibility(8);
        this.f6652n.h(null);
        this.f6652n.notifyDataSetChanged();
    }

    public void q0() {
        File d02 = d0();
        if (d02 == null || !d02.exists()) {
            this.f6644f.h0(true);
        } else {
            this.f6659u.b(d02.getAbsolutePath());
        }
    }

    public void r0(int index) {
        this.f6659u.c(index);
    }

    public final void s0() {
        if (!this.G) {
            va.g.g(R.string.fm_load_warn_msg_mobile_tip, 1);
            this.G = true;
        }
        j0();
        this.f6655q.create();
    }

    public void t0() {
        File e02 = e0();
        if (e02 == null || !e02.exists()) {
            this.f6644f.h0(true);
        } else {
            this.f6659u.b(e02.getAbsolutePath());
        }
    }

    public final void u0() {
        this.f6649k.setText(R.string.fm_config_auto_close);
        this.Q = null;
        this.P = -1;
    }

    public final void x0(int minute) {
        CountDownTimer countDownTimer = this.Q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (minute < 0) {
            u0();
            return;
        }
        f fVar = new f(minute * 60 * 1000, 1000L);
        this.Q = fVar;
        fVar.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y0() {
        final ArrayList arrayList = new ArrayList(5);
        for (int i11 = 15; i11 <= 60; i11 += 15) {
            arrayList.add(Integer.valueOf(i11));
        }
        arrayList.add(-1);
        ArrayList arrayList2 = new ArrayList(5);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (intValue > 0) {
                arrayList2.add(intValue + " 分钟");
            } else {
                arrayList2.add("不开启");
            }
        }
        s sVar = (s) new s.a(requireContext()).R((String[]) arrayList2.toArray(new String[5]), arrayList.indexOf(Integer.valueOf(this.P))).M(getString(R.string.fm_config_auto_close)).d();
        sVar.m0(new s.b() { // from class: bb.c
            @Override // kc.s.b
            public final void a(int i12) {
                d.this.i0(arrayList, i12);
            }
        });
        sVar.show(getChildFragmentManager(), "auto_close_options");
    }

    public void z0() {
        if (this.K || this.f6648j.getVisibility() == 0) {
            return;
        }
        int i11 = this.B;
        if (i11 != 0) {
            this.C = i11;
        } else {
            this.f6644f.removeCallbacks(this.L);
            this.H = false;
            this.C = 2;
        }
        m0();
        this.K = true;
        CountDownTimer countDownTimer = this.Q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            u0();
        }
    }

    @l
    public void onEventMainThread(a.d event) {
        this.f6644f.f0();
    }

    @l
    public void onEventMainThread(a.C0143a event) {
        Log.d("whiz", "on fm click..");
        c0();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: bb.d$d, reason: collision with other inner class name */
    public class C0113d extends qb0.g<FmListLoader.FmListParams> {
        public C0113d() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.d(d.S, "loadFmList failure : " + e11.getMessage(), new Object[0]);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(FmListLoader.FmListParams fmListParams) {
            if (fmListParams != null) {
                d dVar = d.this;
                if (dVar.h0(dVar.f6661w, fmListParams.list)) {
                    d.this.f6660v = fmListParams.list;
                    List<String> list = fmListParams.borders;
                    if (list != null && list.size() >= 2) {
                        d.this.f6663y = PathUtil.reformFmPath(PathUtil.BCZ_HOME + list.get(0));
                        d.this.f6664z = PathUtil.reformFmPath(PathUtil.BCZ_HOME + list.get(1));
                        if (!new File(d.this.f6663y).exists()) {
                            d.this.f6663y = PathUtil.reformFmPath(PathUtil.BCZ_HOME + o.f60434h);
                        }
                        if (!new File(d.this.f6664z).exists()) {
                            d.this.f6664z = PathUtil.reformFmPath(PathUtil.BCZ_HOME + o.f60435i);
                        }
                    }
                    if (d.this.C == 0) {
                        d.this.f0();
                        d.this.H = true;
                    }
                    d.this.I = true;
                    d.this.f6653o.setVisibility(0);
                    d.this.f6654p.setVisibility(0);
                    d.this.f6652n.h(d.this.f6660v);
                    d.this.f6652n.notifyDataSetChanged();
                    d.this.f6649k.setVisibility(0);
                    d.this.f6650l.setVisibility(0);
                    return;
                }
            }
            va.g.g(R.string.fm_data_err, 0);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final float f6674a;

        public i(float alpha) {
            this.f6674a = alpha;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f6645g.animate().alpha(this.f6674a).setDuration(300L).setListener(new a()).start();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Animator.AnimatorListener {
            public a() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                d.this.f6645g.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            d.this.f6645g.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
        }
    }

    public static /* synthetic */ void w(Boolean bool) {
    }
}
