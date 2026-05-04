package com.baicizhan.main.customview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.baicizhan.client.business.lookup.Word;
import com.baicizhan.client.business.lookup.rx.LookupEngine;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.customview.PopPointWindowLayout;
import com.baicizhan.main.wikiv2.lookup.wikiv2.WikiSceneActivity;
import com.baicizhan.main.wikiv2.study.model.ExtendedWordInfo;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.thrift.basic.LogicException;
import com.bumptech.glide.load.engine.GlideException;
import gs.yl;
import hj.m;
import hj.o;
import java.io.File;
import java.net.SocketTimeoutException;
import java.util.List;
import org.apache.thrift.transport.TTransportException;
import q9.l;
import qb0.g;
import qb0.h;
import wb0.p;
import yg.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class PopPointWindowLayout extends FrameLayout implements IAudioPlayer.b {

    /* renamed from: t, reason: collision with root package name */
    public static final String f20116t = "PopPointWindowLayout";

    /* renamed from: a, reason: collision with root package name */
    public yl f20117a;

    /* renamed from: b, reason: collision with root package name */
    public int f20118b;

    /* renamed from: c, reason: collision with root package name */
    public j2 f20119c;

    /* renamed from: d, reason: collision with root package name */
    public h f20120d;

    /* renamed from: e, reason: collision with root package name */
    public Word f20121e;

    /* renamed from: f, reason: collision with root package name */
    public h f20122f;

    /* renamed from: g, reason: collision with root package name */
    public ExtendedWordInfo f20123g;

    /* renamed from: h, reason: collision with root package name */
    public ec0.b f20124h;

    /* renamed from: i, reason: collision with root package name */
    public AnimationDrawable f20125i;

    /* renamed from: j, reason: collision with root package name */
    public AnimationDrawable f20126j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20127k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f20128l;

    /* renamed from: m, reason: collision with root package name */
    public float f20129m;

    /* renamed from: n, reason: collision with root package name */
    public float f20130n;

    /* renamed from: o, reason: collision with root package name */
    public IAudioPlayer f20131o;

    /* renamed from: p, reason: collision with root package name */
    public zf.a f20132p;

    /* renamed from: q, reason: collision with root package name */
    public d f20133q;

    /* renamed from: r, reason: collision with root package name */
    public m f20134r;

    /* renamed from: s, reason: collision with root package name */
    public e f20135s;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements p<ResourceService.Client, rx.c<ExtendedWordInfo>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f20138a;

        public c(final String val$word) {
            this.f20138a = val$word;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<ExtendedWordInfo> call(ResourceService.Client client) {
            try {
                return rx.c.M2(ExtendedWordInfo.fromWordDictV2(client.get_dict_by_word_v2(this.f20138a)));
            } catch (Exception e11) {
                return rx.c.T1(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        void a();

        void b();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
        void a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends g<File> {
            public a() {
            }

            @Override // qb0.c
            public void onError(Throwable e11) {
                qb.c.c(PopPointWindowLayout.f20116t, "get word audio failed.", e11);
            }

            @Override // qb0.c
            public void onNext(File file) {
                PopPointWindowLayout.this.f20131o.stop();
                PopPointWindowLayout.this.f20131o.e(file);
                PopPointWindowLayout.this.f20127k = true;
            }

            @Override // qb0.c
            public void onCompleted() {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends g<File> {
            public b() {
            }

            @Override // qb0.c
            public void onError(Throwable e11) {
                Log.e(PopPointWindowLayout.f20116t, "get word audio uk failed. " + Log.getStackTraceString(e11));
                qb.c.c(PopPointWindowLayout.f20116t, "get word audio uk failed.", e11);
            }

            @Override // qb0.c
            public void onNext(File file) {
                PopPointWindowLayout.this.f20131o.stop();
                PopPointWindowLayout.this.f20131o.e(file);
                PopPointWindowLayout.this.f20127k = false;
            }

            @Override // qb0.c
            public void onCompleted() {
            }
        }

        public f() {
        }

        public final /* synthetic */ void b(Boolean bool, long[] jArr) {
            if (bool != null) {
                PopPointWindowLayout.this.f20117a.s(bool.booleanValue());
            }
        }

        public void c() {
            if (PopPointWindowLayout.this.f20134r == null) {
                qb.c.d(PopPointWindowLayout.f20116t, "can not do collect , collect is null", new Object[0]);
            } else {
                PopPointWindowLayout.this.f20135s.a();
                PopPointWindowLayout.this.f20134r.r(nj.a.a(PopPointWindowLayout.this.f20121e), new o() { // from class: zf.l
                    @Override // hj.o
                    public final void a(Boolean bool, long[] jArr) {
                        PopPointWindowLayout.f.this.b(bool, jArr);
                    }
                });
            }
        }

        public void d() {
            if (PopPointWindowLayout.this.f20121e == null || PopPointWindowLayout.this.f20119c.b() != 1) {
                return;
            }
            WikiSceneActivity.K0(PopPointWindowLayout.this.getContext(), Integer.parseInt(PopPointWindowLayout.this.f20121e.getId()));
            if (PopPointWindowLayout.this.f20133q != null) {
                PopPointWindowLayout.this.f20133q.b();
            }
        }

        public void e() {
            if (PopPointWindowLayout.this.f20123g != null) {
                PopPointWindowLayout.this.f20124h.a(m9.d.d().e(PopPointWindowLayout.this.f20123g.wordAudioUrl).I3(tb0.a.a()).r5(new a()));
            }
        }

        public void f() {
            if (PopPointWindowLayout.this.f20123g != null) {
                PopPointWindowLayout.this.f20124h.a(m9.d.d().e(PopPointWindowLayout.this.f20123g.wordAudioUrl).I3(tb0.a.a()).r5(new b()));
            }
        }
    }

    public PopPointWindowLayout(@NonNull Context context) {
        super(context);
        this.f20124h = new ec0.b();
        this.f20128l = new int[2];
        s(context);
    }

    public static float r(Context context, int contentHeight, int[] parentLoc, float wordTop, float wordBottom) {
        int a11 = xb.f.a(context, 2.0f);
        return parentLoc[1] + (t(context, parentLoc, wordTop) ? (wordTop - a11) - (contentHeight + xb.f.a(context, 6.0f)) : wordBottom + a11);
    }

    public static boolean t(Context context, int[] parentLoc, float wordTop) {
        return ((float) parentLoc[1]) + wordTop > ((float) ((xb.f.f(context) * 2) / 5));
    }

    public static int y(final CharSequence text, final int textSize, final int deviceWidth, final int padding, final int maxLine) {
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(textSize);
        StaticLayout build = StaticLayout.Builder.obtain(text, 0, text.length(), textPaint, deviceWidth).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(padding, 1.0f).setIncludePad(padding != 0).setMaxLines(maxLine).build();
        return build.getLineCount() > maxLine ? build.getLineTop(maxLine) - padding : build.getHeight();
    }

    public final void A(Context context, View view) {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        if (theme == null) {
            return;
        }
        theme.resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        view.setBackground(getContext().getTheme().obtainStyledAttributes(typedValue.resourceId, new int[]{R.attr.selectableItemBackground}).getDrawable(0));
    }

    public void B(String word, int wordCenter, @NonNull int[] parentLoc, float wordTop, float wordBottom) {
        this.f20128l = parentLoc;
        this.f20129m = wordTop;
        this.f20130n = wordBottom;
        boolean t11 = t(getContext(), parentLoc, wordTop);
        this.f20117a.u(t11);
        float max = Math.max((wordCenter - this.f20117a.f57645m.getPaddingLeft()) - (this.f20118b / 2), xb.f.a(getContext(), 2.0f));
        if (t11) {
            this.f20117a.f57635c.setX(max);
        } else {
            this.f20117a.f57643k.setX(max);
        }
        this.f20117a.x(new f());
        this.f20125i = (AnimationDrawable) getContext().getResources().getDrawable(com.jiongji.andriod.card.R.drawable.animation_searchwords_voice);
        this.f20126j = (AnimationDrawable) getContext().getResources().getDrawable(com.jiongji.andriod.card.R.drawable.animation_searchwords_voice);
        x(word);
    }

    public final void C() {
        ExtendedWordInfo extendedWordInfo = this.f20123g;
        if (extendedWordInfo == null || TextUtils.isEmpty(extendedWordInfo.accent)) {
            return;
        }
        this.f20117a.f57633a.setPadding(0, 0, getResources().getDimensionPixelSize(com.jiongji.andriod.card.R.dimen.wiki_item_padding_accent), 0);
        this.f20117a.f57633a.setText(String.format("美%s", this.f20123g.accent));
        this.f20117a.f57634b.setVisibility(0);
    }

    public void D() {
        if (this.f20134r == null || this.f20121e == null) {
            qb.c.q(f20116t, "updateCollectStatus waiting...", new Object[0]);
        } else {
            qb.c.b(f20116t, "updateCollectStatus done", new Object[0]);
            this.f20134r.D(new hj.a() { // from class: zf.k
                @Override // hj.a
                public final void onResult(Object obj) {
                    PopPointWindowLayout.this.v((List) obj);
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f20120d;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f20120d.unsubscribe();
        }
        h hVar2 = this.f20122f;
        if (hVar2 != null && !hVar2.isUnsubscribed()) {
            this.f20122f.unsubscribe();
        }
        this.f20124h.unsubscribe();
        this.f20131o.destroy();
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
    public void onPlayStateChanged(IAudioPlayer.State state) {
        yl ylVar = this.f20117a;
        if (ylVar == null) {
            return;
        }
        if (state == IAudioPlayer.State.Completed || state == IAudioPlayer.State.Stopped || state == IAudioPlayer.State.Paused) {
            ylVar.f57634b.setImageResource(com.jiongji.andriod.card.R.drawable.ic_searchwords_voice_2);
            this.f20125i.stop();
            this.f20126j.stop();
        } else if (state == IAudioPlayer.State.Playing) {
            if (this.f20127k) {
                ylVar.f57634b.setImageDrawable(this.f20125i);
                this.f20125i.start();
            } else {
                this.f20126j.start();
                this.f20117a.f57634b.setImageResource(com.jiongji.andriod.card.R.drawable.ic_searchwords_voice_2);
            }
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        z();
    }

    public final int q() {
        return (this.f20117a.f57633a.getWidth() + xb.f.a(getContext(), 40.0f)) * 2;
    }

    public final void s(final Context context) {
        yl n11 = yl.n((LayoutInflater) context.getSystemService("layout_inflater"), this, true);
        this.f20117a = n11;
        A(context, n11.f57642j);
        j2 j2Var = new j2();
        this.f20119c = j2Var;
        this.f20117a.y(j2Var);
        this.f20118b = xb.f.a(context, 12.0f);
        l lVar = new l(context);
        this.f20131o = lVar;
        lVar.f(this);
        hj.p.d(context, new rj.e() { // from class: zf.j
            @Override // rj.e
            public final void a(ij.e eVar) {
                PopPointWindowLayout.this.u(eVar);
            }
        });
    }

    public void setCollectListener(e collectListener) {
        this.f20135s = collectListener;
    }

    public void setGetBottomSheetLayout(zf.a getBottomSheetLayout) {
        this.f20132p = getBottomSheetLayout;
    }

    public void setMoreDisabled(boolean moreDisabled) {
        this.f20117a.v(moreDisabled);
    }

    public void setOnActionListener(d listener) {
        this.f20133q = listener;
    }

    public final /* synthetic */ void u(ij.e eVar) {
        if (getContext() instanceof FragmentActivity) {
            this.f20134r = new m((FragmentActivity) getContext(), eVar);
            D();
        }
    }

    public final /* synthetic */ void v(List list) {
        this.f20117a.s(list.contains(Integer.valueOf(Integer.parseInt(this.f20121e.getId()))));
    }

    public final void w(final String word) {
        h hVar = this.f20122f;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f20122f.unsubscribe();
        }
        this.f20122f = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/resource_api")).b2(new c(word)).w5(bc0.c.e()).I3(tb0.a.a()).r5(new b());
    }

    public final void x(String keyword) {
        h hVar = this.f20120d;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f20120d.unsubscribe();
        }
        this.f20120d = LookupEngine.n(getContext(), keyword, true).I3(tb0.a.a()).r5(new a());
    }

    public final void z() {
        this.f20117a.executePendingBindings();
        int y11 = y(this.f20117a.f57641i.getText(), xb.f.s(getContext(), 15.0f), xb.f.i(getContext()) - xb.f.a(getContext(), 84.0f), xb.f.a(getContext(), 6.5f), 3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(xb.f.i(getContext()), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f20117a.f57641i.getLayoutParams().height = y11;
        this.f20117a.getRoot().measure(makeMeasureSpec, makeMeasureSpec2);
        this.f20117a.f57645m.setY(r(getContext(), (this.f20117a.f57637e.getMeasuredHeight() - this.f20117a.f57641i.getMeasuredHeight()) + y11, this.f20128l, this.f20129m, this.f20130n));
        if (q() >= this.f20117a.f57633a.getWidth()) {
            this.f20117a.f57644l.setLayoutTransition(null);
        }
    }

    public PopPointWindowLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.f20124h = new ec0.b();
        this.f20128l = new int[2];
        s(context);
    }

    public PopPointWindowLayout(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f20124h = new ec0.b();
        this.f20128l = new int[2];
        s(context);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends g<Word> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.d(PopPointWindowLayout.f20116t, "lookup single word failed. " + e11, new Object[0]);
            if ((e11 instanceof LogicException) && ((LogicException) e11).getCode() == 3) {
                PopPointWindowLayout.this.f20119c.c(-1);
            } else if ((e11 instanceof TTransportException) || (e11 instanceof SocketTimeoutException)) {
                PopPointWindowLayout.this.f20119c.c(-2);
            } else {
                PopPointWindowLayout.this.f20119c.c(-3);
            }
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Word word) {
            PopPointWindowLayout.this.f20121e = word;
            if (word == null) {
                PopPointWindowLayout.this.f20119c.c(-3);
                return;
            }
            PopPointWindowLayout.this.f20121e.setBookId(0);
            if (TextUtils.isEmpty(word.getWord())) {
                PopPointWindowLayout.this.f20119c.c(-1);
                return;
            }
            PopPointWindowLayout.this.f20119c.c(1);
            word.setCnmean(word.getCnmean().replace("\n", GlideException.a.f28776d));
            word.setCnmean(word.getCnmean().replace("；  ", GlideException.a.f28776d));
            PopPointWindowLayout.this.f20117a.z(word);
            PopPointWindowLayout.this.f20117a.f57641i.setText(word.getCnmean());
            PopPointWindowLayout.this.z();
            PopPointWindowLayout.this.w(word.getWord());
            PopPointWindowLayout.this.D();
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends g<ExtendedWordInfo> {
        public b() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(PopPointWindowLayout.f20116t, "load extend word info failed.", e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(ExtendedWordInfo extendedWordInfo) {
            if (extendedWordInfo != null) {
                PopPointWindowLayout.this.f20123g = extendedWordInfo;
                PopPointWindowLayout.this.f20117a.t(extendedWordInfo);
                PopPointWindowLayout.this.z();
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
