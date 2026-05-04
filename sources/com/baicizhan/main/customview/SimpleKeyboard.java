package com.baicizhan.main.customview;

import a00.h0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.baicizhan.client.business.util.UiUtils;
import com.baicizhan.main.customview.SimpleKeyboard;
import com.jiongji.andriod.card.R;
import en.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;
import yr.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSimpleKeyboard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleKeyboard.kt\ncom/baicizhan/main/customview/SimpleKeyboard\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1878#2,3:92\n1869#2:95\n1870#2:97\n1#3:96\n*S KotlinDebug\n*F\n+ 1 SimpleKeyboard.kt\ncom/baicizhan/main/customview/SimpleKeyboard\n*L\n60#1:92,3\n68#1:95\n68#1:97\n*E\n"})
/* loaded from: classes4.dex */
public final class SimpleKeyboard extends ConstraintLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final int f20158g = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<Integer> f20159a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String[] f20160b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<a> f20161c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public b f20162d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View.OnClickListener f20163e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View.OnClickListener f20164f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void b(@k String str);

        void c(int i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public SimpleKeyboard(@k Context context) {
        this(context, null, 0, 0, 14, null);
        g0.p(context, "context");
    }

    public static final void i(SimpleKeyboard simpleKeyboard, View view) {
        CharSequence text;
        String obj;
        b bVar = simpleKeyboard.f20162d;
        if (bVar != null) {
            TextView textView = view instanceof TextView ? (TextView) view : null;
            if (textView == null || (text = textView.getText()) == null || (obj = text.toString()) == null) {
                return;
            }
            bVar.b(obj);
        }
    }

    public static final void j(SimpleKeyboard simpleKeyboard, View view) {
        b bVar = simpleKeyboard.f20162d;
        if (bVar != null) {
            Object tag = view.getTag();
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            if (num != null) {
                bVar.c(num.intValue());
            }
        }
    }

    @l
    public final b getKeyListener() {
        return this.f20162d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object obj;
        super.onFinishInflate();
        Iterator<T> it = this.f20159a.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            TextView textView = (TextView) findViewById(intValue);
            if (textView != null) {
                Iterator<T> it2 = this.f20161c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (((a) obj).g() == intValue) {
                            break;
                        }
                    }
                }
                a aVar = (a) obj;
                textView.setText(aVar != null ? aVar.h() : null);
                textView.setOnClickListener(this.f20163e);
                UiUtils.expandTouchArea(textView, 3);
            }
        }
        ImageButton imageButton = (ImageButton) findViewById(R.id.spelling_key_del);
        if (imageButton != null) {
            imageButton.setTag(67);
            imageButton.setImageResource(R.drawable.ic_keyboard_delete);
            imageButton.setOnClickListener(this.f20164f);
            UiUtils.expandTouchArea(imageButton, 3);
        }
    }

    public final void setKeyListener(@l b bVar) {
        this.f20162d = bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public SimpleKeyboard(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public SimpleKeyboard(@k Context context, @l AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        g0.p(context, "context");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f20165a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final CharSequence f20166b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Drawable f20167c;

        public a(int i11, @l CharSequence charSequence, @l Drawable drawable) {
            this.f20165a = i11;
            this.f20166b = charSequence;
            this.f20167c = drawable;
        }

        public static /* synthetic */ a e(a aVar, int i11, CharSequence charSequence, Drawable drawable, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = aVar.f20165a;
            }
            if ((i12 & 2) != 0) {
                charSequence = aVar.f20166b;
            }
            if ((i12 & 4) != 0) {
                drawable = aVar.f20167c;
            }
            return aVar.d(i11, charSequence, drawable);
        }

        public final int a() {
            return this.f20165a;
        }

        @l
        public final CharSequence b() {
            return this.f20166b;
        }

        @l
        public final Drawable c() {
            return this.f20167c;
        }

        @k
        public final a d(int i11, @l CharSequence charSequence, @l Drawable drawable) {
            return new a(i11, charSequence, drawable);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f20165a == aVar.f20165a && g0.g(this.f20166b, aVar.f20166b) && g0.g(this.f20167c, aVar.f20167c);
        }

        @l
        public final Drawable f() {
            return this.f20167c;
        }

        public final int g() {
            return this.f20165a;
        }

        @l
        public final CharSequence h() {
            return this.f20166b;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.f20165a) * 31;
            CharSequence charSequence = this.f20166b;
            int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            Drawable drawable = this.f20167c;
            return hashCode2 + (drawable != null ? drawable.hashCode() : 0);
        }

        @k
        public String toString() {
            int i11 = this.f20165a;
            CharSequence charSequence = this.f20166b;
            return "Key(id=" + i11 + ", label=" + ((Object) charSequence) + ", icon=" + this.f20167c + j.f81007d;
        }

        public /* synthetic */ a(int i11, CharSequence charSequence, Drawable drawable, int i12, v vVar) {
            this(i11, (i12 & 2) != 0 ? null : charSequence, (i12 & 4) != 0 ? null : drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public SimpleKeyboard(@k Context context, @l AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        g0.p(context, "context");
        ArrayList arrayList = new ArrayList(h0.Q(Integer.valueOf(R.id.spelling_key_1), Integer.valueOf(R.id.spelling_key_2), Integer.valueOf(R.id.spelling_key_3), Integer.valueOf(R.id.spelling_key_4), Integer.valueOf(R.id.spelling_key_5), Integer.valueOf(R.id.spelling_key_6), Integer.valueOf(R.id.spelling_key_7), Integer.valueOf(R.id.spelling_key_8), Integer.valueOf(R.id.spelling_key_9), Integer.valueOf(R.id.spelling_key_10), Integer.valueOf(R.id.spelling_key_11), Integer.valueOf(R.id.spelling_key_12), Integer.valueOf(R.id.spelling_key_13), Integer.valueOf(R.id.spelling_key_14), Integer.valueOf(R.id.spelling_key_15), Integer.valueOf(R.id.spelling_key_16), Integer.valueOf(R.id.spelling_key_17), Integer.valueOf(R.id.spelling_key_18), Integer.valueOf(R.id.spelling_key_19), Integer.valueOf(R.id.spelling_key_21), Integer.valueOf(R.id.spelling_key_22), Integer.valueOf(R.id.spelling_key_23), Integer.valueOf(R.id.spelling_key_24), Integer.valueOf(R.id.spelling_key_25), Integer.valueOf(R.id.spelling_key_26), Integer.valueOf(R.id.spelling_key_27)));
        this.f20159a = arrayList;
        this.f20160b = new String[]{"q", "w", "e", r.f50027a, "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", CmcdData.STREAMING_FORMAT_HLS, "j", "k", "l", "z", "x", "c", "v", e.f100279a, "n", "m"};
        this.f20161c = new ArrayList();
        this.f20163e = new View.OnClickListener() { // from class: zf.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleKeyboard.i(SimpleKeyboard.this, view);
            }
        };
        this.f20164f = new View.OnClickListener() { // from class: zf.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleKeyboard.j(SimpleKeyboard.this, view);
            }
        };
        int i13 = 0;
        for (Object obj : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                h0.b0();
            }
            this.f20161c.add(new a(((Number) obj).intValue(), this.f20160b[i13], null, 4, null));
            i13 = i14;
        }
    }

    public /* synthetic */ SimpleKeyboard(Context context, AttributeSet attributeSet, int i11, int i12, int i13, v vVar) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }
}
