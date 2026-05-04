package com.baicizhan.client.business.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import com.jiongji.andriod.card.R;
import java.lang.ref.WeakReference;
import xb.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class a extends DialogFragment {

    /* renamed from: c, reason: collision with root package name */
    public static final int f17279c = 400;

    /* renamed from: d, reason: collision with root package name */
    public static final int f17280d = 300;

    /* renamed from: a, reason: collision with root package name */
    public C0273a f17281a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17282b = true;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f17281a = new C0273a(this);
        setStyle(1, R.style.NoFrameDialog);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
        onCreateDialog.setCanceledOnTouchOutside(true);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getDialog().getWindow().setLayout(f.i(getActivity()), f.f(getActivity()));
    }

    public void v(boolean cancelable) {
        this.f17282b = cancelable;
    }

    public void w() {
        super.dismissAllowingStateLoss();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.client.business.widget.a$a, reason: collision with other inner class name */
    public static class C0273a {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<a> f17283a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f17284b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f17285c = false;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.widget.a$a$c */
        public class c implements DialogInterface.OnKeyListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f17288a;

            public c(final a val$fragment) {
                this.f17288a = val$fragment;
            }

            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
                if (4 != keyCode) {
                    return false;
                }
                if (1 == event.getAction() && this.f17288a.isCancelable()) {
                    this.f17288a.dismiss();
                }
                return true;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.widget.a$a$d */
        public class d implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f17290a;

            public d(final a val$fragment) {
                this.f17290a = val$fragment;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.f17290a.f17282b) {
                    this.f17290a.dismiss();
                }
            }
        }

        public C0273a(a fragment) {
            this.f17283a = new WeakReference<>(fragment);
        }

        public void d(View mask) {
            a aVar = this.f17283a.get();
            if (aVar == null) {
                return;
            }
            mask.setOnClickListener(new d(aVar));
        }

        public void e(View rootView) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(400L);
            if (rootView != null) {
                alphaAnimation.setAnimationListener(new AnimationAnimationListenerC0274a());
                rootView.setVisibility(0);
                rootView.startAnimation(alphaAnimation);
            }
        }

        public void f(View rootView) {
            if (this.f17284b || this.f17285c) {
                return;
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            if (rootView != null) {
                alphaAnimation.setAnimationListener(new b());
                rootView.setVisibility(4);
                rootView.startAnimation(alphaAnimation);
            } else {
                a aVar = this.f17283a.get();
                if (aVar == null) {
                    return;
                }
                aVar.w();
            }
        }

        public void g() {
            a aVar = this.f17283a.get();
            if (aVar == null) {
                return;
            }
            aVar.getDialog().setOnKeyListener(new c(aVar));
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.widget.a$a$a, reason: collision with other inner class name */
        public class AnimationAnimationListenerC0274a implements Animation.AnimationListener {
            public AnimationAnimationListenerC0274a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation arg0) {
                C0273a.this.f17284b = false;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation arg0) {
                C0273a.this.f17284b = true;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation arg0) {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.widget.a$a$b */
        public class b implements Animation.AnimationListener {
            public b() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation arg0) {
                a aVar = (a) C0273a.this.f17283a.get();
                if (aVar == null) {
                    return;
                }
                C0273a.this.f17285c = false;
                aVar.w();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation arg0) {
                C0273a.this.f17285c = true;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation arg0) {
            }
        }
    }
}
