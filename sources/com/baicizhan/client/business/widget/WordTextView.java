package com.baicizhan.client.business.widget;

import a00.i0;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.text.Regex;
import m80.k;
import m80.l;
import m80.o;
import u30.f0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordTextView.kt\ncom/baicizhan/client/business/widget/WordTextView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n1563#2:164\n1634#2,3:165\n1869#2,2:168\n*S KotlinDebug\n*F\n+ 1 WordTextView.kt\ncom/baicizhan/client/business/widget/WordTextView\n*L\n32#1:164\n32#1:165,3\n36#1:168,2\n*E\n"})
/* loaded from: classes4.dex */
public final class WordTextView extends FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final int f17267i = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public Mode f17268a;

    /* renamed from: b, reason: collision with root package name */
    public int f17269b;

    /* renamed from: c, reason: collision with root package name */
    public int f17270c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public String f17271d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Drawable f17272e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public AppCompatTextView f17273f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public AppCompatImageView f17274g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ProgressBar f17275h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Mode {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode NONE = new Mode("NONE", 0);
        public static final Mode LOADING = new Mode("LOADING", 1);
        public static final Mode ERROR = new Mode("ERROR", 2);
        public static final Mode NORMAL = new Mode("NORMAL", 3);

        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{NONE, LOADING, ERROR, NORMAL};
        }

        static {
            Mode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private Mode(String str, int i11) {
        }

        @k
        public static m00.a<Mode> getEntries() {
            return $ENTRIES;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17276a;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Mode.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17276a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            g0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            g0.p(animation, "animation");
            WordTextView.this.f17274g.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            g0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            g0.p(animation, "animation");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WordTextView.f(WordTextView.this);
            WordTextView.this.postDelayed(this, 2000L);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public WordTextView(@k Context context) {
        this(context, null, 0, 0, 14, null);
        g0.p(context, "context");
    }

    public static final void f(WordTextView wordTextView) {
        wordTextView.f17268a = Mode.values()[(wordTextView.f17268a.ordinal() + 1) % Mode.values().length];
        wordTextView.d();
    }

    private final String getDashText() {
        List<String> split = new Regex(" +").split(this.f17271d, 0);
        ArrayList arrayList = new ArrayList(i0.d0(split, 10));
        Iterator<T> it = split.iterator();
        while (it.hasNext()) {
            arrayList.add(c((String) it.next()));
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sb2.append(((String) it2.next()) + "    ");
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return k0.h6(sb3).toString();
    }

    public final String c(String str) {
        return k0.h6(f0.v2("_ ", str.length())).toString();
    }

    public final void d() {
        if (this.f17268a.compareTo(Mode.NORMAL) >= 0) {
            this.f17273f.setText(this.f17271d);
            this.f17273f.setTextColor(this.f17270c);
            this.f17275h.setVisibility(8);
            this.f17274g.setVisibility(8);
            return;
        }
        this.f17273f.setText(getDashText());
        this.f17273f.setTextColor(this.f17269b);
        int i11 = a.f17276a[this.f17268a.ordinal()];
        if (i11 == 1) {
            this.f17275h.setVisibility(8);
            this.f17274g.setVisibility(8);
        } else if (i11 == 2) {
            this.f17275h.setVisibility(0);
            this.f17274g.setVisibility(8);
        } else {
            if (i11 != 3) {
                return;
            }
            this.f17275h.setVisibility(8);
            this.f17274g.setVisibility(0);
            this.f17274g.setAlpha(1.0f);
            g0.m(this.f17274g.animate().alpha(0.0f).setDuration(350L).setStartDelay(1000L).setListener(new b()));
        }
    }

    @o
    public final void e() {
        postDelayed(new c(), 3000L);
    }

    @k
    public final Mode getMode() {
        return this.f17268a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f17272e;
        if (drawable != null) {
            this.f17274g.setImageDrawable(drawable);
        }
        d();
    }

    public final void setErrorDrawable(@k Drawable d11) {
        g0.p(d11, "d");
        this.f17272e = d11;
        this.f17274g.setImageDrawable(d11);
    }

    public final void setMode(@k Mode mode) {
        g0.p(mode, "mode");
        this.f17268a = mode;
        d();
    }

    public final void setWord(@k String word) {
        g0.p(word, "word");
        this.f17271d = word;
        d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public WordTextView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public WordTextView(@k Context context, @l AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public WordTextView(@k Context context, @l AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        g0.p(context, "context");
        this.f17268a = Mode.NONE;
        this.f17271d = "";
        LayoutInflater.from(context).inflate(R.layout.layout_word_text_view, this);
        View findViewById = findViewById(R.id.word_str);
        g0.o(findViewById, "findViewById(...)");
        this.f17273f = (AppCompatTextView) findViewById;
        View findViewById2 = findViewById(R.id.error_icon);
        g0.o(findViewById2, "findViewById(...)");
        this.f17274g = (AppCompatImageView) findViewById2;
        View findViewById3 = findViewById(R.id.progress);
        g0.o(findViewById3, "findViewById(...)");
        this.f17275h = (ProgressBar) findViewById3;
        setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.word_text_view_min_height));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.WordTextView, i11, i12);
        g0.o(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f17269b = obtainStyledAttributes.getColor(3, -16777216);
        this.f17270c = obtainStyledAttributes.getColor(2, -16777216);
        String string = obtainStyledAttributes.getString(1);
        this.f17271d = string != null ? string : "";
        this.f17272e = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ WordTextView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, v vVar) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R.attr.word_text_style : i11, (i13 & 8) != 0 ? 0 : i12);
    }
}
