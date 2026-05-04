package com.baicizhan.main.plusreview.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.util.TopicTextRenderHelper;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.customview.SimpleKeyboard;
import com.baicizhan.main.fragment.PatternBaseFragment;
import com.baicizhan.main.plusreview.view.QuizHollowAnswerView;
import com.bumptech.glide.load.engine.GlideException;
import com.jiongji.andriod.card.R;
import q9.l;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class WriteFragment extends PatternBaseFragment implements View.OnClickListener, SimpleKeyboard.b {
    public SimpleKeyboard A;
    public boolean B;
    public boolean C;
    public Handler D;
    public IAudioPlayer E;
    public boolean F;
    public boolean G;
    public c H;

    /* renamed from: s, reason: collision with root package name */
    public int[] f24707s;

    /* renamed from: t, reason: collision with root package name */
    public int[] f24708t;

    /* renamed from: u, reason: collision with root package name */
    public QuizHollowAnswerView f24709u;

    /* renamed from: v, reason: collision with root package name */
    public ImageView f24710v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f24711w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f24712x;

    /* renamed from: y, reason: collision with root package name */
    public ImageView f24713y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView f24714z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends sa.c {
        public a() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            if (WriteFragment.this.H != null) {
                WriteFragment.this.H.p();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WriteFragment.this.e(-1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void p();
    }

    public WriteFragment(Context context, int category) {
        this(context, null, 0, category);
    }

    public final void A() {
        new QuizHollowAnswerView.b().e(this.f24709u).d(this.f20748i.sentence).c(this.f24707s, this.f24708t).b();
    }

    @Override // com.baicizhan.main.customview.SimpleKeyboard.b
    public void b(@NonNull String s11) {
        if (this.B || this.C) {
            return;
        }
        this.f24709u.L(s11);
        if (this.f24709u.D()) {
            this.f24709u.I();
            if (this.f24709u.F()) {
                this.B = true;
                e(this.f20748i.topicId);
                this.F = true;
            } else {
                this.C = true;
                this.f24709u.K();
                this.D.postDelayed(new b(), 1000L);
            }
        }
    }

    @Override // com.baicizhan.main.customview.SimpleKeyboard.b
    public void c(int code) {
        if (this.B || this.C || code != 67) {
            return;
        }
        this.f24709u.G();
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void j(boolean retain) {
        if (this.B || this.C) {
            A();
            this.f24713y.setVisibility(0);
            this.f24712x.setVisibility(4);
            this.B = false;
            this.C = false;
            this.f24709u.T();
        }
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public boolean k() {
        if (this.G) {
            return false;
        }
        IAudioPlayer iAudioPlayer = this.E;
        TopicRecord topicRecord = this.f20748i;
        ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, topicRecord.wordAudio);
        this.f24712x.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        this.f24712x.startAnimation(alphaAnimation);
        this.G = true;
        return true;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void o(Activity activity) {
        super.o(activity);
        this.E = new l(activity);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.B || this.C) {
            return;
        }
        int id2 = view.getId();
        if (id2 == R.id.hint) {
            this.f20746g.k0();
            return;
        }
        if (id2 == R.id.kill) {
            c cVar = this.H;
            if (cVar != null) {
                cVar.p();
                return;
            }
            return;
        }
        if (this.f24710v == view) {
            IAudioPlayer iAudioPlayer = this.E;
            TopicRecord topicRecord = this.f20748i;
            ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, topicRecord.wordAudio);
        }
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public View p(LayoutInflater inflater, ViewGroup container) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.plusreview_fragment_write_portrait, container, true);
        this.f24709u = (QuizHollowAnswerView) viewGroup.findViewById(R.id.plusreview_write_quiz);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.plusreview_write_image);
        this.f24710v = imageView;
        imageView.setOnClickListener(this);
        this.f24711w = (TextView) viewGroup.findViewById(R.id.plusreview_write_cnmean);
        this.f24712x = (TextView) viewGroup.findViewById(R.id.plusreview_write_accent);
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.hint);
        this.f24713y = imageView2;
        imageView2.setOnClickListener(this);
        ImageView imageView3 = (ImageView) viewGroup.findViewById(R.id.slash);
        this.f24714z = imageView3;
        imageView3.setOnClickListener(new a());
        SimpleKeyboard simpleKeyboard = (SimpleKeyboard) viewGroup.findViewById(R.id.plusreview_write_keyboard);
        this.A = simpleKeyboard;
        simpleKeyboard.setKeyListener(this);
        return viewGroup;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void q() {
        super.q();
        IAudioPlayer iAudioPlayer = this.E;
        if (iAudioPlayer != null) {
            iAudioPlayer.stop();
            this.E.destroy();
        }
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void r() {
        this.F = false;
        this.B = false;
        this.C = false;
        this.G = false;
        int[][] matchWordBorders = TopicTextRenderHelper.getMatchWordBorders(this.f20748i);
        if (matchWordBorders == null) {
            if (!(getContext() instanceof Activity)) {
                throw new RuntimeException("Topic record content is not completed, record: " + this.f20748i);
            }
            qb.c.d(PatternBaseFragment.f20734l, "Topic record content is not completed, record: " + this.f20748i, new Object[0]);
            g.i("暂不支持", 0);
            ((Activity) getContext()).finish();
            return;
        }
        this.f24707s = new int[matchWordBorders.length];
        this.f24708t = new int[matchWordBorders.length];
        for (int i11 = 0; i11 < matchWordBorders.length; i11++) {
            int[] iArr = this.f24707s;
            int[] iArr2 = matchWordBorders[i11];
            iArr[i11] = iArr2[0];
            this.f24708t[i11] = iArr2[1];
        }
        A();
        TopicRecord topicRecord = this.f20748i;
        ZPackUtils.loadImageCompat(topicRecord, topicRecord.imagePath).f(R.drawable.image_broke_normal_default).h().o(this.f24710v);
        this.f24711w.setText(this.f20748i.wordMean.replace(GlideException.a.f28776d, "\n"));
        this.f24712x.setText(this.f20748i.phonetic);
        this.f24712x.setVisibility(4);
        this.f24713y.setVisibility(0);
    }

    public void setOnControlListener(c l11) {
        this.H = l11;
    }

    public WriteFragment(Context context, AttributeSet attrs, int defStyle, int category) {
        super(context, attrs, defStyle, category);
        this.B = false;
        this.C = false;
        this.D = new Handler();
        this.F = false;
        this.G = false;
        p(LayoutInflater.from(context), this);
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void w() {
    }
}
