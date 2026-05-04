package com.baicizhan.main.phrasetraining.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.baicizhan.client.business.widget.CommentCircleProgressView;
import com.jiongji.andriod.card.R;
import ih.b;
import java.util.List;
import qb.c;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class PhraseGroupHeader extends RelativeLayout implements hh.a, b.InterfaceC0700b, View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public TextView f24557a;

    /* renamed from: b, reason: collision with root package name */
    public CommentCircleProgressView f24558b;

    /* renamed from: c, reason: collision with root package name */
    public b f24559c;

    /* renamed from: d, reason: collision with root package name */
    public List<Integer> f24560d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24561e;

    public PhraseGroupHeader(Context context) {
        super(context);
        this.f24561e = false;
    }

    @Override // ih.b.InterfaceC0700b
    public void b(int progress, float completed, float total) {
        if (progress >= 100 && completed == total) {
            this.f24561e = true;
            return;
        }
        String format = String.format("%.2fM/%.2fM", Float.valueOf(completed), Float.valueOf(total));
        this.f24557a.setText(format);
        this.f24558b.setProgress(progress);
        this.f24558b.setComment(format);
        this.f24557a.setVisibility(0);
        this.f24557a.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.business_scale_fadein));
    }

    @Override // ih.b.InterfaceC0700b
    public void c(boolean success, int code) {
        if (success) {
            this.f24561e = true;
            this.f24557a.setText(R.string.phrase_group_download_finished);
            this.f24558b.setComment(R.string.phrase_group_download_finished);
        } else {
            g.g(code != -4 ? code != -3 ? code != -2 ? code != -1 ? R.string.phrase_training_load_failed : R.string.phrase_training_load_failed_for_data : R.string.phrase_training_load_failed_for_net : R.string.phrase_training_load_failed_for_net_offline : R.string.phrase_training_load_failed_for_net_usr_reject, 0);
            this.f24559c.l();
        }
        if (this.f24558b.getVisibility() == 0) {
            this.f24558b.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.business_scale_fadeout));
            this.f24558b.setVisibility(8);
            if (success) {
                return;
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.business_scale_fadein);
            loadAnimation.setStartOffset(400L);
            this.f24557a.startAnimation(loadAnimation);
            this.f24557a.setVisibility(0);
        }
    }

    @Override // hh.a
    public void cancel() {
        b bVar = this.f24559c;
        if (bVar != null) {
            bVar.h();
        }
    }

    @Override // ih.b.InterfaceC0700b
    public void e(int progress, float completed, float total) {
        String format = String.format("%.2fM/%.2fM", Float.valueOf(completed), Float.valueOf(total));
        this.f24557a.setText(format);
        this.f24558b.setProgress(progress);
        this.f24558b.setComment(format);
    }

    public void j(List<Integer> groupIds) {
        this.f24560d = groupIds;
        this.f24559c.o(groupIds);
        this.f24559c.i();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        List<Integer> list;
        if ((view != this.f24557a && view != this.f24558b) || (list = this.f24560d) == null || list.isEmpty() || this.f24559c == null || this.f24561e) {
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.business_scale_fadeout);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.business_scale_fadein);
        loadAnimation2.setStartOffset(400L);
        TextView textView = this.f24557a;
        if (view == textView) {
            textView.startAnimation(loadAnimation);
            this.f24557a.setVisibility(8);
            this.f24558b.startAnimation(loadAnimation2);
            this.f24558b.setVisibility(0);
        } else {
            this.f24558b.startAnimation(loadAnimation);
            this.f24558b.setVisibility(8);
            this.f24557a.startAnimation(loadAnimation2);
            this.f24557a.setVisibility(0);
        }
        loadAnimation2.setAnimationListener(new a());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.phrase_group_download);
        this.f24557a = textView;
        textView.setVisibility(8);
        this.f24557a.setOnClickListener(this);
        CommentCircleProgressView commentCircleProgressView = (CommentCircleProgressView) findViewById(R.id.phrase_group_downloading);
        this.f24558b = commentCircleProgressView;
        commentCircleProgressView.setOnClickListener(this);
        this.f24558b.setVisibility(8);
        this.f24558b.setComment(R.string.phrase_group_download);
        this.f24559c = new b.a().b(getContext().getAssets()).c(this).a();
    }

    public PhraseGroupHeader(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f24561e = false;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (PhraseGroupHeader.this.f24559c.j() && PhraseGroupHeader.this.f24558b.getVisibility() == 0) {
                c.b("whiz", "phrase download start..", new Object[0]);
                PhraseGroupHeader.this.f24559c.o(PhraseGroupHeader.this.f24560d);
                PhraseGroupHeader.this.f24559c.k();
            } else {
                if (PhraseGroupHeader.this.f24559c.j() || PhraseGroupHeader.this.f24557a.getVisibility() != 0) {
                    return;
                }
                c.b("whiz", "phrase download cancel..", new Object[0]);
                PhraseGroupHeader.this.f24559c.h();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    @Override // hh.a
    public void a() {
    }

    @Override // ih.b.InterfaceC0700b
    public void d() {
    }
}
