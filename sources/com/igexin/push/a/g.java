package com.igexin.push.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Movie;
import android.graphics.Outline;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.getui.gtc.base.GtcProvider;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.igexin.push.a.e;
import com.igexin.push.core.a.c.k;
import com.igexin.push.core.b.m;
import com.igexin.push.core.b.s;
import com.igexin.push.core.i.a.h;
import com.igexin.push.core.l;
import com.igexin.push.extension.mod.PushTaskBean;
import com.igexin.sdk.PushConsts;
import com.igexin.sdk.main.FeedbackImpl;
import com.igexin.sdk.message.GTPopupMessage;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
public final class g extends b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f37341a = false;

    /* renamed from: b, reason: collision with root package name */
    private final String f37342b = "popupAct";

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<com.igexin.push.core.i.a.f> f37343c = new ArrayList<>();

    /* renamed from: com.igexin.push.a.g$1, reason: invalid class name */
    public class AnonymousClass1 implements c<m.b> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicLong f37344a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f37345b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PushTaskBean f37346c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f37347d;

        public AnonymousClass1(AtomicLong atomicLong, Activity activity, PushTaskBean pushTaskBean, Context context) {
            this.f37344a = atomicLong;
            this.f37345b = activity;
            this.f37346c = pushTaskBean;
            this.f37347d = context;
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private void a2(m.b bVar) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f37344a.getAndSet(currentTimeMillis) < 350) {
                    com.igexin.c.a.c.a.b("popupAct", "repetition click");
                    return;
                }
                if (bVar.f37868o.getAction().isClosePopup()) {
                    this.f37345b.finish();
                }
                g.a(bVar, this.f37346c, this.f37347d);
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
        }

        @Override // com.igexin.push.a.c
        public final /* synthetic */ void a(m.b bVar) {
            m.b bVar2 = bVar;
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f37344a.getAndSet(currentTimeMillis) < 350) {
                    com.igexin.c.a.c.a.b("popupAct", "repetition click");
                    return;
                }
                if (bVar2.f37868o.getAction().isClosePopup()) {
                    this.f37345b.finish();
                }
                g.a(bVar2, this.f37346c, this.f37347d);
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
        }
    }

    /* renamed from: com.igexin.push.a.g$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f37349a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PushTaskBean f37350b;

        public AnonymousClass2(m mVar, PushTaskBean pushTaskBean) {
            this.f37349a = mVar;
            this.f37350b = pushTaskBean;
        }

        @Override // java.lang.Runnable
        public final void run() {
            l a11 = l.a();
            GTPopupMessage gTPopupMessage = this.f37349a.f37849j;
            Bundle bundle = new Bundle();
            bundle.putInt("action", PushConsts.ACTION_POPUP_SHOW);
            bundle.putSerializable(PushConsts.KEY_POPUP_SHOW, gTPopupMessage);
            a11.a(bundle);
            FeedbackImpl.getInstance().feedbackMessageAction(this.f37350b, this.f37349a.f37848i, com.igexin.push.core.b.B);
        }
    }

    /* renamed from: com.igexin.push.a.g$3, reason: invalid class name */
    public static class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m.b f37352a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PushTaskBean f37353b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f37354c;

        public AnonymousClass3(m.b bVar, PushTaskBean pushTaskBean, Context context) {
            this.f37352a = bVar;
            this.f37353b = pushTaskBean;
            this.f37354c = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            l a11 = l.a();
            GTPopupMessage gTPopupMessage = this.f37352a.f37868o;
            Bundle bundle = new Bundle();
            bundle.setClassLoader(GTPopupMessage.class.getClassLoader());
            bundle.putInt("action", PushConsts.ACTION_POPUP_CLICKED);
            bundle.putSerializable(PushConsts.KEY_POPUP_CLICKED, gTPopupMessage);
            a11.a(bundle);
            FeedbackImpl.getInstance().feedbackMessageAction(this.f37353b, this.f37352a.f37869p, com.igexin.push.core.b.B);
            GTPopupMessage.GtAction action = this.f37352a.f37868o.getAction();
            String actionType = action.getActionType();
            if (m.a.intent.name().equals(actionType)) {
                new k();
                k.a(action.getIntent(), this.f37354c);
                return;
            }
            if (!m.a.url.name().equals(actionType)) {
                m.a.closePopup.name().equals(actionType);
                return;
            }
            new com.igexin.push.core.a.c.l();
            String url = action.getUrl();
            Context context = this.f37354c;
            try {
                if (TextUtils.isEmpty(url)) {
                    return;
                }
                s sVar = new s();
                sVar.f37904a = url;
                com.igexin.push.core.a.c.l.a(sVar, com.igexin.push.core.b.A);
                Intent intent = new Intent();
                intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setFlags(268435456);
                intent.setPackage(sVar.f37907d);
                intent.setData(Uri.parse(sVar.a()));
                context.startActivity(intent);
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
            }
        }
    }

    /* renamed from: com.igexin.push.a.g$4, reason: invalid class name */
    public class AnonymousClass4 implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f37355a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m.b f37356b;

        public AnonymousClass4(c cVar, m.b bVar) {
            this.f37355a = cVar;
            this.f37356b = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f37355a.a(this.f37356b);
        }
    }

    /* renamed from: com.igexin.push.a.g$9, reason: invalid class name */
    public class AnonymousClass9 implements e.a<byte[]> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m.b f37373a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f37374b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37375c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f37376d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f37377e;

        public AnonymousClass9(m.b bVar, Context context, int i11, int i12, d dVar) {
            this.f37373a = bVar;
            this.f37374b = context;
            this.f37375c = i11;
            this.f37376d = i12;
            this.f37377e = dVar;
        }

        @Override // com.igexin.push.a.e.a
        public final /* synthetic */ void a(byte[] bArr) {
            byte[] bArr2 = bArr;
            try {
                com.igexin.c.a.c.a.b("popupAct", "movie duration is 0 use glide " + this.f37373a.f37861h);
                com.igexin.push.core.i.a.f a11 = new com.igexin.push.core.i.a.a(this.f37374b).a(ByteBuffer.wrap(bArr2), this.f37375c, this.f37376d);
                a11.b();
                com.igexin.push.core.i.a.e c11 = a11.c();
                this.f37377e.setImageDrawable(c11);
                com.igexin.push.core.i.a.k.a(!c11.f38203d, "You cannot restart a currently running animation.");
                h hVar = c11.f38202c.f38212a;
                com.igexin.push.core.i.a.k.a(!hVar.f38230c, "Can't restart a running animation");
                hVar.f38231d = true;
                if (hVar.f38236i != null) {
                    hVar.f38236i = null;
                }
                c11.start();
                g.this.f37343c.add(a11);
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
        }

        @Override // com.igexin.push.a.e.a
        public final void a(Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private void a2(byte[] bArr) {
            try {
                com.igexin.c.a.c.a.b("popupAct", "movie duration is 0 use glide " + this.f37373a.f37861h);
                com.igexin.push.core.i.a.f a11 = new com.igexin.push.core.i.a.a(this.f37374b).a(ByteBuffer.wrap(bArr), this.f37375c, this.f37376d);
                a11.b();
                com.igexin.push.core.i.a.e c11 = a11.c();
                this.f37377e.setImageDrawable(c11);
                com.igexin.push.core.i.a.k.a(!c11.f38203d, "You cannot restart a currently running animation.");
                h hVar = c11.f38202c.f38212a;
                com.igexin.push.core.i.a.k.a(!hVar.f38230c, "Can't restart a running animation");
                hVar.f38231d = true;
                if (hVar.f38236i != null) {
                    hVar.f38236i = null;
                }
                c11.start();
                g.this.f37343c.add(a11);
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
        }
    }

    private static int a(m.b bVar) {
        String str = bVar.f37855b;
        str.getClass();
        if (str.equals(TtmlNode.CENTER)) {
            return 17;
        }
        return !str.equals(TtmlNode.RIGHT) ? GravityCompat.START : GravityCompat.END;
    }

    @Override // com.igexin.push.a.b
    public final void b(Activity activity) {
        Activity activity2;
        Intent intent = activity.getIntent();
        try {
            f37341a = true;
            Context applicationContext = activity.getApplicationContext();
            GtcProvider.setContext(applicationContext);
            try {
                if (Build.VERSION.SDK_INT != 26) {
                    if (1 == applicationContext.getResources().getConfiguration().orientation) {
                        activity.setRequestedOrientation(7);
                    } else {
                        activity.setRequestedOrientation(6);
                    }
                }
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
            AtomicLong atomicLong = new AtomicLong(0L);
            m mVar = (m) intent.getExtras().getSerializable("bean");
            PushTaskBean pushTaskBean = new PushTaskBean();
            pushTaskBean.setAppid(mVar.f37844e);
            pushTaskBean.setMessageId(mVar.f37845f);
            pushTaskBean.setTaskId(mVar.f37846g);
            pushTaskBean.setAppKey(mVar.f37847h);
            m.a(applicationContext);
            activity2 = activity;
            try {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(atomicLong, activity2, pushTaskBean, applicationContext);
                m.b bVar = mVar.f37840a;
                LinearLayout linearLayout = new LinearLayout(applicationContext);
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                linearLayout.setBackgroundColor(bVar.f37866m);
                GTPopupMessage gTPopupMessage = bVar.f37868o;
                if (gTPopupMessage != null) {
                    GTPopupMessage.GtAction action = gTPopupMessage.getAction();
                    if (action.isClosePopup() || !m.a.closePopup.name().equals(action.getActionType())) {
                        linearLayout.setOnClickListener(new AnonymousClass4(anonymousClass1, bVar));
                    } else {
                        linearLayout.setClickable(true);
                        linearLayout.setFocusable(true);
                    }
                }
                View a11 = a(mVar.f37841b, applicationContext, anonymousClass1);
                if (a11 != null) {
                    linearLayout.addView(a11);
                }
                activity2.setContentView(linearLayout);
                com.igexin.b.a.a().f37028a.execute(new AnonymousClass2(mVar, pushTaskBean));
            } catch (Throwable th3) {
                th = th3;
                com.igexin.c.a.c.a.a(th);
                activity2.finish();
            }
        } catch (Throwable th4) {
            th = th4;
            activity2 = activity;
            com.igexin.c.a.c.a.a(th);
            activity2.finish();
        }
    }

    @Override // com.igexin.push.a.b
    public final void c() {
    }

    @Override // com.igexin.push.a.b
    public final void i() {
        f37341a = false;
        Iterator<com.igexin.push.core.i.a.f> it = this.f37343c.iterator();
        while (it.hasNext()) {
            com.igexin.push.core.i.a.f next = it.next();
            if (next != null) {
                next.f();
            }
        }
        this.f37343c.clear();
    }

    private View a(final m.b bVar, final Context context, c<m.b> cVar) {
        int i11;
        if (bVar == null) {
            return null;
        }
        String str = bVar.f37854a;
        str.getClass();
        switch (str) {
            case "button":
                Button button = new Button(context);
                button.setAllCaps(false);
                return a(bVar, button, cVar);
            case "column":
            case "row":
            case "view":
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(!"row".equals(bVar.f37854a) ? 1 : 0);
                View a11 = a(bVar, linearLayout, cVar);
                if (bVar.f37860g != null) {
                    for (i11 = 0; i11 < bVar.f37860g.size(); i11++) {
                        linearLayout.addView(a(bVar.f37860g.get(i11), context, cVar));
                    }
                }
                return a11;
            case "image":
            case "image_button":
                final d dVar = new d(context);
                View a12 = a(bVar, dVar, cVar);
                dVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                try {
                    if (!TextUtils.isEmpty(bVar.f37861h)) {
                        try {
                            if (bVar.f37861h.endsWith(".gif")) {
                                final int a13 = bVar.a();
                                final int b11 = bVar.b();
                                e.b(bVar.f37861h, new e.a<Movie>() { // from class: com.igexin.push.a.g.5
                                    /* renamed from: a, reason: avoid collision after fix types in other method */
                                    private void a2(Movie movie) {
                                        if (movie.duration() == 0) {
                                            g.a(g.this, bVar, context, a13, b11, dVar);
                                            return;
                                        }
                                        d dVar2 = dVar;
                                        dVar2.f37310a = movie;
                                        dVar2.f37311b = 0L;
                                        dVar2.f37312c = 0;
                                        dVar2.setLayerType(1, null);
                                        dVar2.setImageDrawable(null);
                                        dVar2.requestLayout();
                                        dVar2.invalidate();
                                        d dVar3 = dVar;
                                        if (dVar3.f37313d) {
                                            dVar3.f37313d = false;
                                            if (dVar3.f37310a != null) {
                                                dVar3.f37311b = SystemClock.uptimeMillis() - dVar3.f37312c;
                                                dVar3.invalidate();
                                            }
                                        }
                                    }

                                    @Override // com.igexin.push.a.e.a
                                    public final /* synthetic */ void a(Movie movie) {
                                        Movie movie2 = movie;
                                        if (movie2.duration() == 0) {
                                            g.a(g.this, bVar, context, a13, b11, dVar);
                                            return;
                                        }
                                        d dVar2 = dVar;
                                        dVar2.f37310a = movie2;
                                        dVar2.f37311b = 0L;
                                        dVar2.f37312c = 0;
                                        dVar2.setLayerType(1, null);
                                        dVar2.setImageDrawable(null);
                                        dVar2.requestLayout();
                                        dVar2.invalidate();
                                        d dVar3 = dVar;
                                        if (dVar3.f37313d) {
                                            dVar3.f37313d = false;
                                            if (dVar3.f37310a != null) {
                                                dVar3.f37311b = SystemClock.uptimeMillis() - dVar3.f37312c;
                                                dVar3.invalidate();
                                            }
                                        }
                                    }

                                    @Override // com.igexin.push.a.e.a
                                    public final void a(Throwable th2) {
                                        com.igexin.c.a.c.a.a(th2);
                                    }
                                });
                            } else {
                                e.a(bVar.f37861h, bVar.a(), new e.a<Bitmap>() { // from class: com.igexin.push.a.g.6
                                    /* renamed from: a, reason: avoid collision after fix types in other method */
                                    private void a2(Bitmap bitmap) {
                                        dVar.setImageBitmap(bitmap);
                                    }

                                    @Override // com.igexin.push.a.e.a
                                    public final /* synthetic */ void a(Bitmap bitmap) {
                                        dVar.setImageBitmap(bitmap);
                                    }

                                    @Override // com.igexin.push.a.e.a
                                    public final void a(Throwable th2) {
                                        com.igexin.c.a.c.a.a(th2);
                                    }
                                });
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            com.igexin.c.a.c.a.a(th);
                            return a12;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                return a12;
            case "label":
                return a(bVar, new TextView(context), cVar);
            default:
                throw new RuntimeException("can't find type " + bVar.f37854a);
        }
    }

    private static void b(m.b bVar, PushTaskBean pushTaskBean, Context context) {
        com.igexin.b.a.a().f37028a.execute(new AnonymousClass3(bVar, pushTaskBean, context));
    }

    private void c(Activity activity) {
        Activity activity2;
        Intent intent = activity.getIntent();
        try {
            f37341a = true;
            Context applicationContext = activity.getApplicationContext();
            GtcProvider.setContext(applicationContext);
            try {
                if (Build.VERSION.SDK_INT != 26) {
                    if (1 == applicationContext.getResources().getConfiguration().orientation) {
                        activity.setRequestedOrientation(7);
                    } else {
                        activity.setRequestedOrientation(6);
                    }
                }
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
            AtomicLong atomicLong = new AtomicLong(0L);
            m mVar = (m) intent.getExtras().getSerializable("bean");
            PushTaskBean pushTaskBean = new PushTaskBean();
            pushTaskBean.setAppid(mVar.f37844e);
            pushTaskBean.setMessageId(mVar.f37845f);
            pushTaskBean.setTaskId(mVar.f37846g);
            pushTaskBean.setAppKey(mVar.f37847h);
            m.a(applicationContext);
            activity2 = activity;
            try {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(atomicLong, activity2, pushTaskBean, applicationContext);
                m.b bVar = mVar.f37840a;
                LinearLayout linearLayout = new LinearLayout(applicationContext);
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                linearLayout.setBackgroundColor(bVar.f37866m);
                GTPopupMessage gTPopupMessage = bVar.f37868o;
                if (gTPopupMessage != null) {
                    GTPopupMessage.GtAction action = gTPopupMessage.getAction();
                    if (action.isClosePopup() || !m.a.closePopup.name().equals(action.getActionType())) {
                        linearLayout.setOnClickListener(new AnonymousClass4(anonymousClass1, bVar));
                    } else {
                        linearLayout.setClickable(true);
                        linearLayout.setFocusable(true);
                    }
                }
                View a11 = a(mVar.f37841b, applicationContext, anonymousClass1);
                if (a11 != null) {
                    linearLayout.addView(a11);
                }
                activity2.setContentView(linearLayout);
                com.igexin.b.a.a().f37028a.execute(new AnonymousClass2(mVar, pushTaskBean));
            } catch (Throwable th3) {
                th = th3;
                com.igexin.c.a.c.a.a(th);
                activity2.finish();
            }
        } catch (Throwable th4) {
            th = th4;
            activity2 = activity;
            com.igexin.c.a.c.a.a(th);
            activity2.finish();
        }
    }

    private View a(final m.b bVar, final View view, final c<m.b> cVar) {
        view.setPadding(bVar.j(), bVar.g(), bVar.i(), bVar.h());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(bVar.a(), bVar.b());
        layoutParams.setMargins(bVar.f(), bVar.c(), bVar.e(), bVar.d());
        if (bVar.f37855b != null) {
            layoutParams.gravity = a(bVar);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i11 = bVar.f37866m;
        if (i11 != 0) {
            gradientDrawable.setColor(i11);
        }
        int m11 = bVar.m();
        if (m11 > 0) {
            gradientDrawable.setStroke(m11, bVar.f37867n);
        }
        final int k11 = bVar.k();
        if (k11 > 0) {
            gradientDrawable.setCornerRadius(k11);
        }
        view.setBackground(gradientDrawable);
        if (!TextUtils.isEmpty(bVar.f37863j) && !bVar.f37863j.endsWith(".gif")) {
            e.a(bVar.f37863j, bVar.a(), new e.a<Bitmap>() { // from class: com.igexin.push.a.g.7

                /* renamed from: com.igexin.push.a.g$7$1, reason: invalid class name */
                public class AnonymousClass1 extends ViewOutlineProvider {
                    public AnonymousClass1() {
                    }

                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), k11);
                    }
                }

                /* renamed from: a, reason: avoid collision after fix types in other method */
                private void a2(Bitmap bitmap) {
                    try {
                        view.setBackground(new BitmapDrawable(view.getResources(), bitmap));
                        if (k11 > 0) {
                            view.setClipToOutline(true);
                            view.setOutlineProvider(new AnonymousClass1());
                        }
                    } catch (Throwable th2) {
                        com.igexin.c.a.c.a.a(th2);
                    }
                }

                @Override // com.igexin.push.a.e.a
                public final /* synthetic */ void a(Bitmap bitmap) {
                    try {
                        view.setBackground(new BitmapDrawable(view.getResources(), bitmap));
                        if (k11 > 0) {
                            view.setClipToOutline(true);
                            view.setOutlineProvider(new AnonymousClass1());
                        }
                    } catch (Throwable th2) {
                        com.igexin.c.a.c.a.a(th2);
                    }
                }

                @Override // com.igexin.push.a.e.a
                public final void a(Throwable th2) {
                    com.igexin.c.a.c.a.a(th2);
                }
            });
        }
        view.setLayoutParams(layoutParams);
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setText(!TextUtils.isEmpty(bVar.f37864k) ? bVar.f37864k : bVar.f37857d);
            int i12 = bVar.f37865l;
            if (i12 != 0) {
                textView.setTextColor(i12);
            }
            float l11 = bVar.l();
            if (l11 != 0.0f) {
                textView.setTextSize(0, l11);
            }
            if (bVar.f37862i) {
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                textView.getPaint().setFakeBoldText(true);
            }
            if (bVar.n() != 0) {
                textView.setMaxHeight(bVar.n());
                textView.setMovementMethod(ScrollingMovementMethod.getInstance());
            }
            if (!TextUtils.isEmpty(bVar.f37856c)) {
                textView.setGravity(a(bVar));
            }
        }
        GTPopupMessage gTPopupMessage = bVar.f37868o;
        if (gTPopupMessage != null) {
            GTPopupMessage.GtAction action = gTPopupMessage.getAction();
            if (action.isClosePopup() || !m.a.closePopup.name().equals(action.getActionType())) {
                view.setOnClickListener(new View.OnClickListener() { // from class: com.igexin.push.a.g.8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        cVar.a(bVar);
                    }
                });
                return view;
            }
        }
        view.setClickable(true);
        view.setFocusable(true);
        return view;
    }

    @Override // com.igexin.push.a.b
    public final boolean b() {
        return false;
    }

    private LinearLayout a(c cVar, m mVar, Context context) {
        m.b bVar = mVar.f37840a;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(bVar.f37866m);
        GTPopupMessage gTPopupMessage = bVar.f37868o;
        if (gTPopupMessage != null) {
            GTPopupMessage.GtAction action = gTPopupMessage.getAction();
            if (action.isClosePopup() || !m.a.closePopup.name().equals(action.getActionType())) {
                linearLayout.setOnClickListener(new AnonymousClass4(cVar, bVar));
            } else {
                linearLayout.setClickable(true);
                linearLayout.setFocusable(true);
            }
        }
        View a11 = a(mVar.f37841b, context, (c<m.b>) cVar);
        if (a11 != null) {
            linearLayout.addView(a11);
        }
        return linearLayout;
    }

    @Override // com.igexin.push.a.b
    public final void a(Activity activity) {
        try {
            if (Build.VERSION.SDK_INT == 26) {
                activity.finish();
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public static /* synthetic */ void a(g gVar, m.b bVar, Context context, int i11, int i12, d dVar) {
        e.a(bVar.f37861h, gVar.new AnonymousClass9(bVar, context, i11, i12, dVar));
    }

    private void a(m.b bVar, Context context, int i11, int i12, d dVar) {
        e.a(bVar.f37861h, new AnonymousClass9(bVar, context, i11, i12, dVar));
    }

    public static /* synthetic */ void a(m.b bVar, PushTaskBean pushTaskBean, Context context) {
        com.igexin.b.a.a().f37028a.execute(new AnonymousClass3(bVar, pushTaskBean, context));
    }

    @Override // com.igexin.push.a.b
    public final boolean a() {
        return false;
    }

    @Override // com.igexin.push.a.b
    public final void d() {
    }

    @Override // com.igexin.push.a.b
    public final void e() {
    }

    @Override // com.igexin.push.a.b
    public final void f() {
    }

    @Override // com.igexin.push.a.b
    public final void g() {
    }

    @Override // com.igexin.push.a.b
    public final void h() {
    }

    @Override // com.igexin.push.a.b
    public final void j() {
    }

    @Override // com.igexin.push.a.b
    public final void k() {
    }
}
