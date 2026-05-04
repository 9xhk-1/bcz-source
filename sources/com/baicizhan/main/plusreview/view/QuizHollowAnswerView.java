package com.baicizhan.main.plusreview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.appcompat.widget.AppCompatTextView;
import com.baicizhan.client.business.view.a;
import com.jiongji.andriod.card.R;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class QuizHollowAnswerView extends AppCompatTextView {

    /* renamed from: u, reason: collision with root package name */
    public static final int f24717u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final int f24718v = 1;

    /* renamed from: a, reason: collision with root package name */
    public int f24719a;

    /* renamed from: b, reason: collision with root package name */
    public int f24720b;

    /* renamed from: c, reason: collision with root package name */
    public int f24721c;

    /* renamed from: d, reason: collision with root package name */
    public int f24722d;

    /* renamed from: e, reason: collision with root package name */
    public int f24723e;

    /* renamed from: f, reason: collision with root package name */
    public int f24724f;

    /* renamed from: g, reason: collision with root package name */
    public String f24725g;

    /* renamed from: h, reason: collision with root package name */
    public char[] f24726h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f24727i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f24728j;

    /* renamed from: k, reason: collision with root package name */
    public List<int[]> f24729k;

    /* renamed from: l, reason: collision with root package name */
    public List<int[]> f24730l;

    /* renamed from: m, reason: collision with root package name */
    public List<char[]> f24731m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f24732n;

    /* renamed from: o, reason: collision with root package name */
    public int f24733o;

    /* renamed from: p, reason: collision with root package name */
    public int f24734p;

    /* renamed from: q, reason: collision with root package name */
    public List<List<Integer>> f24735q;

    /* renamed from: r, reason: collision with root package name */
    public com.baicizhan.client.business.view.a f24736r;

    /* renamed from: s, reason: collision with root package name */
    public c f24737s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f24738t;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends ReplacementSpan {

        /* renamed from: a, reason: collision with root package name */
        public final int f24739a;

        /* renamed from: b, reason: collision with root package name */
        public SparseArray<String> f24740b = new SparseArray<>();

        public a(int outCursor) {
            this.f24739a = outCursor;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence text, int start, int end, float x11, int top, int y11, int bottom, Paint paint) {
            Paint paint2 = paint;
            int i11 = QuizHollowAnswerView.this.f24723e;
            int i12 = end - start;
            RectF rectF = new RectF(x11, top, paint2.measureText(text.subSequence(start, end).toString()) + x11 + (i11 * 4), QuizHollowAnswerView.this.f24724f + y11);
            paint2.setColor(QuizHollowAnswerView.this.f24719a);
            canvas.drawRoundRect(rectF, QuizHollowAnswerView.this.f24723e, QuizHollowAnswerView.this.f24723e, paint2);
            float f11 = 0.0f;
            int i13 = 0;
            while (i13 < i12) {
                if (!QuizHollowAnswerView.this.f24738t) {
                    String str = x11 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + y11;
                    String str2 = this.f24740b.get(i13);
                    if (TextUtils.isEmpty(str2)) {
                        this.f24740b.put(i13, str);
                    } else if (!TextUtils.equals(str, str2)) {
                        i13++;
                        paint2 = paint;
                    }
                }
                int i14 = start + i13;
                paint2.setColor(QuizHollowAnswerView.this.f24725g.charAt(i14) == QuizHollowAnswerView.this.f24726h[i14] ? QuizHollowAnswerView.this.f24720b : QuizHollowAnswerView.this.f24721c);
                paint2.setAlpha((((int[]) QuizHollowAnswerView.this.f24729k.get(this.f24739a))[i13] != 0 || (QuizHollowAnswerView.this.f24733o == this.f24739a && QuizHollowAnswerView.this.f24734p == i13)) ? ((int[]) QuizHollowAnswerView.this.f24730l.get(this.f24739a))[i13] : 0);
                if (i13 == 0) {
                    canvas.drawText(text, start, start + 1, x11 + (i11 * 2), y11, paint2);
                } else {
                    f11 += paint2.measureText(text.subSequence(i14 - 1, i14).toString());
                    canvas.drawText(text, i14, i14 + 1, (i11 * 2) + x11 + f11, y11, paint2);
                }
                i13++;
                paint2 = paint;
            }
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm2) {
            int i11 = QuizHollowAnswerView.this.f24723e * 2;
            return Math.round(paint.measureText(text.subSequence(start, end).toString())) + i11 + i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public QuizHollowAnswerView f24742a;

        /* renamed from: b, reason: collision with root package name */
        public String f24743b;

        /* renamed from: c, reason: collision with root package name */
        public int[] f24744c;

        /* renamed from: d, reason: collision with root package name */
        public int[] f24745d;

        /* renamed from: e, reason: collision with root package name */
        public List<char[]> f24746e;

        /* renamed from: f, reason: collision with root package name */
        public List<int[]> f24747f;

        /* renamed from: g, reason: collision with root package name */
        public List<int[]> f24748g;

        /* renamed from: h, reason: collision with root package name */
        public int[] f24749h;

        /* renamed from: i, reason: collision with root package name */
        public List<List<Integer>> f24750i;

        public String a() {
            StringBuilder sb2 = new StringBuilder("QuizHollowAnswerView info {");
            sb2.append("[quiz: ");
            sb2.append(this.f24743b);
            sb2.append("]; ");
            sb2.append("[quiz length: ");
            String str = this.f24743b;
            sb2.append(str != null ? str.length() : 0);
            sb2.append("]; ");
            sb2.append("[answer borders: [");
            sb2.append(this.f24744c);
            sb2.append(j2.O);
            sb2.append(this.f24745d);
            sb2.append(")]; ");
            sb2.append("[states length: ");
            List<int[]> list = this.f24747f;
            sb2.append(list != null ? list.size() : 0);
            sb2.append("]; ");
            sb2.append("[cursors: ");
            sb2.append(this.f24749h);
            sb2.append("]}");
            return sb2.toString();
        }

        public QuizHollowAnswerView b() {
            int i11;
            if (this.f24742a == null || TextUtils.isEmpty(this.f24743b) || this.f24744c == null || this.f24745d == null) {
                return null;
            }
            int length = this.f24743b.length();
            int[] iArr = this.f24744c;
            int length2 = iArr.length;
            int[] iArr2 = this.f24745d;
            if (length2 != iArr2.length || iArr.length <= 0 || iArr.length > length || iArr2.length > length) {
                throw new IllegalArgumentException("initialize failed, " + a());
            }
            this.f24746e = new ArrayList(this.f24744c.length);
            this.f24747f = new ArrayList(this.f24744c.length);
            this.f24748g = new ArrayList(this.f24744c.length);
            this.f24749h = new int[this.f24744c.length];
            this.f24750i = new ArrayList(this.f24744c.length);
            int i12 = 0;
            while (true) {
                int[] iArr3 = this.f24744c;
                if (i12 >= iArr3.length) {
                    this.f24742a.f24725g = this.f24743b;
                    this.f24742a.f24726h = this.f24743b.toCharArray();
                    this.f24742a.f24727i = this.f24744c;
                    this.f24742a.f24728j = this.f24745d;
                    this.f24742a.f24730l = this.f24748g;
                    this.f24742a.f24731m = this.f24746e;
                    this.f24742a.f24729k = this.f24747f;
                    this.f24742a.f24732n = this.f24749h;
                    this.f24742a.O();
                    this.f24742a.f24735q = this.f24750i;
                    this.f24742a.R();
                    return this.f24742a;
                }
                int i13 = iArr3[i12];
                int i14 = this.f24745d[i12];
                if (i13 < 0 || i13 >= length || i14 < 0 || i14 > length || (i11 = i14 - i13) < 1) {
                    break;
                }
                this.f24746e.add(this.f24743b.substring(i13, i14).toCharArray());
                int[] iArr4 = new int[i11];
                int[] iArr5 = new int[i11];
                for (int i15 = 0; i15 < i11; i15++) {
                    iArr4[i15] = 0;
                    iArr5[i15] = 0;
                }
                this.f24747f.add(iArr4);
                this.f24748g.add(iArr5);
                this.f24749h[i12] = 0;
                this.f24750i.add(null);
                i12++;
            }
            throw new IllegalArgumentException("initialize failed, " + a());
        }

        public b c(int[] starts, int[] ends) {
            this.f24744c = starts;
            this.f24745d = ends;
            return this;
        }

        public b d(String quiz) {
            this.f24743b = quiz;
            return this;
        }

        public b e(QuizHollowAnswerView target) {
            this.f24742a = target;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements a.b {
        @Override // com.baicizhan.client.business.view.a.b
        public void b(int frame) {
            QuizHollowAnswerView.this.J(frame);
        }

        @Override // com.baicizhan.client.business.view.a.b
        public boolean d() {
            if (QuizHollowAnswerView.this.f24733o < 0) {
                for (int i11 = 0; i11 < QuizHollowAnswerView.this.f24727i.length; i11++) {
                    int i12 = QuizHollowAnswerView.this.f24728j[i11] - QuizHollowAnswerView.this.f24727i[i11];
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (((int[]) QuizHollowAnswerView.this.f24730l.get(i11))[i13] < 255 && ((int[]) QuizHollowAnswerView.this.f24730l.get(i11))[i13] > 0) {
                            return true;
                        }
                    }
                }
                return false;
            }
            int i14 = QuizHollowAnswerView.this.f24728j[QuizHollowAnswerView.this.f24733o] - QuizHollowAnswerView.this.f24727i[QuizHollowAnswerView.this.f24733o];
            if (QuizHollowAnswerView.this.f24732n[QuizHollowAnswerView.this.f24733o] > -1) {
                int min = Math.min(QuizHollowAnswerView.this.f24734p, i14 - 1);
                return ((int[]) QuizHollowAnswerView.this.f24730l.get(QuizHollowAnswerView.this.f24733o))[min] < 255 && ((int[]) QuizHollowAnswerView.this.f24730l.get(QuizHollowAnswerView.this.f24733o))[min] > 0;
            }
            for (int i15 = 0; i15 < i14; i15++) {
                if (((int[]) QuizHollowAnswerView.this.f24730l.get(QuizHollowAnswerView.this.f24733o))[i15] < 255 && ((int[]) QuizHollowAnswerView.this.f24730l.get(QuizHollowAnswerView.this.f24733o))[i15] > 0) {
                    return true;
                }
            }
            return false;
        }

        public c() {
        }

        @Override // com.baicizhan.client.business.view.a.b
        public void a() {
        }

        @Override // com.baicizhan.client.business.view.a.b
        public void c() {
        }
    }

    public QuizHollowAnswerView(Context context) {
        super(context);
        this.f24737s = new c();
        this.f24738t = false;
        N(null, R.style.DefaultQuizStateAnswerView);
    }

    private void N(AttributeSet attrs, int defStyleRes) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.QuizStateAnswerView, 0, defStyleRes);
        E(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        com.baicizhan.client.business.view.a h11 = com.baicizhan.client.business.view.a.g().h(this.f24737s);
        this.f24736r = h11;
        h11.j(15);
    }

    public static boolean P(char c11) {
        if (c11 < 'a' || c11 > 'z') {
            return c11 >= 'A' && c11 <= 'Z';
        }
        return true;
    }

    public static boolean Q(int state) {
        return state >= 0 && state <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        if (TextUtils.isEmpty(this.f24725g)) {
            return;
        }
        SpannableString spannableString = new SpannableString(String.copyValueOf(this.f24726h));
        for (int i11 = 0; i11 < this.f24727i.length; i11++) {
            spannableString.setSpan(new a(i11), this.f24727i[i11], this.f24728j[i11], 33);
        }
        setText(spannableString);
    }

    public boolean D() {
        if (TextUtils.isEmpty(this.f24725g)) {
            return false;
        }
        for (int[] iArr : this.f24729k) {
            for (int i11 : iArr) {
                if (i11 == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void E(TypedArray a11) {
        this.f24719a = a11.getColor(0, -16777216);
        this.f24720b = a11.getColor(2, -1);
        this.f24721c = a11.getColor(4, -65536);
        this.f24722d = a11.getColor(3, -65536);
        int dimensionPixelSize = a11.getDimensionPixelSize(1, 0);
        this.f24723e = dimensionPixelSize;
        int i11 = dimensionPixelSize * 2;
        this.f24724f = i11;
        setLineSpacing(i11, 1.0f);
        setGravity(17);
        int i12 = this.f24724f;
        setPadding(0, i12, 0, i12);
    }

    public boolean F() {
        return TextUtils.equals(this.f24725g, String.copyValueOf(this.f24726h));
    }

    public void G() {
        if (TextUtils.isEmpty(this.f24725g)) {
            return;
        }
        H();
        int i11 = this.f24733o;
        if (i11 < 0 || this.f24732n[i11] <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        do {
            int[] iArr = this.f24732n;
            int i12 = this.f24733o;
            int i13 = iArr[i12] - 1;
            iArr[i12] = i13;
            this.f24734p = i13;
            arrayList.add(Integer.valueOf(i13));
            this.f24729k.get(this.f24733o)[this.f24734p] = 0;
        } while (!P(this.f24731m.get(this.f24733o)[this.f24734p]));
        for (int i14 = 0; i14 < this.f24734p; i14++) {
            this.f24730l.get(this.f24733o)[i14] = 255;
        }
        this.f24735q.set(this.f24733o, arrayList);
        this.f24736r.l();
        this.f24736r.k(255, 0);
    }

    public final void H() {
        if (this.f24733o >= this.f24729k.size()) {
            this.f24733o--;
            return;
        }
        int i11 = this.f24733o;
        if (i11 <= 0) {
            return;
        }
        for (int i12 : this.f24729k.get(i11)) {
            if (i12 == 1) {
                return;
            }
        }
        this.f24733o--;
    }

    public void I() {
        this.f24738t = true;
        R();
    }

    public final void J(int delta) {
        int i11 = this.f24733o;
        if (i11 < 0) {
            int i12 = 0;
            while (true) {
                int[] iArr = this.f24727i;
                if (i12 >= iArr.length) {
                    break;
                }
                int i13 = this.f24728j[i12] - iArr[i12];
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((this.f24730l.get(i12)[i14] < 255 || delta <= 0) && (this.f24730l.get(i12)[i14] > 0 || delta >= 0)) {
                        int i15 = this.f24730l.get(i12)[i14] + delta;
                        int[] iArr2 = this.f24730l.get(i12);
                        if (i15 > 255) {
                            i15 = 255;
                        } else if (i15 < 0) {
                            i15 = 0;
                        }
                        iArr2[i14] = i15;
                    }
                }
                i12++;
            }
        } else if (this.f24732n[i11] <= -1) {
            int i16 = this.f24728j[i11] - this.f24727i[i11];
            for (int i17 = 0; i17 < i16; i17++) {
                if ((this.f24730l.get(this.f24733o)[i17] < 255 || delta <= 0) && (this.f24730l.get(this.f24733o)[i17] > 0 || delta >= 0)) {
                    int i18 = this.f24730l.get(this.f24733o)[i17] + delta;
                    int[] iArr3 = this.f24730l.get(this.f24733o);
                    if (i18 > 255) {
                        i18 = 255;
                    } else if (i18 < 0) {
                        i18 = 0;
                    }
                    iArr3[i17] = i18;
                }
            }
        } else if (this.f24735q.get(i11) != null) {
            Iterator<Integer> it = this.f24735q.get(this.f24733o).iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                int i19 = this.f24730l.get(this.f24733o)[intValue] + delta;
                int[] iArr4 = this.f24730l.get(this.f24733o);
                if (i19 > 255) {
                    i19 = 255;
                } else if (i19 < 0) {
                    i19 = 0;
                }
                iArr4[intValue] = i19;
            }
        }
        R();
    }

    public void K() {
        if (TextUtils.isEmpty(this.f24725g)) {
            return;
        }
        this.f24733o = -1;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f24727i;
            if (i11 >= iArr.length) {
                this.f24726h = this.f24725g.toCharArray();
                this.f24736r.l();
                this.f24736r.k(0, 255);
                return;
            } else {
                this.f24732n[i11] = -1;
                int i12 = this.f24728j[i11] - iArr[i11];
                for (int i13 = 0; i13 < i12; i13++) {
                    this.f24729k.get(i11)[i13] = 1;
                }
                i11++;
            }
        }
    }

    public boolean L(String answer) {
        int i11;
        if (TextUtils.isEmpty(this.f24725g) || answer == null || answer.length() != 1) {
            return false;
        }
        U();
        int i12 = this.f24733o;
        int[] iArr = this.f24727i;
        if (i12 >= iArr.length) {
            return false;
        }
        int i13 = this.f24732n[i12];
        this.f24734p = i13;
        int i14 = iArr[i12] + i13;
        char charAt = this.f24725g.charAt(i14);
        if (P(charAt) && Math.abs(charAt - answer.charAt(0)) == 32) {
            this.f24726h[i14] = charAt;
        } else {
            this.f24726h[i14] = answer.charAt(0);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.f24732n[this.f24733o]));
        int[] iArr2 = this.f24732n;
        int i15 = this.f24733o;
        iArr2[i15] = iArr2[i15] + 1;
        int i16 = 0;
        while (true) {
            int[] iArr3 = this.f24732n;
            i11 = this.f24733o;
            if (i16 >= iArr3[i11] - 1) {
                break;
            }
            this.f24730l.get(i11)[i16] = 255;
            i16++;
        }
        int[] iArr4 = this.f24729k.get(i11);
        int[] iArr5 = this.f24732n;
        int i17 = this.f24733o;
        iArr4[iArr5[i17] - 1] = 1;
        for (int i18 = iArr5[i17]; i18 < this.f24731m.get(this.f24733o).length && !P(this.f24731m.get(this.f24733o)[i18]); i18++) {
            int[] iArr6 = this.f24732n;
            int i19 = this.f24733o;
            iArr6[i19] = iArr6[i19] + 1;
            arrayList.add(Integer.valueOf(i18));
            this.f24729k.get(this.f24733o)[i18] = 1;
        }
        this.f24735q.set(this.f24733o, arrayList);
        this.f24736r.l();
        this.f24736r.k(0, 255);
        return true;
    }

    public String M(int outCursor, int cursor) {
        if (TextUtils.isEmpty(this.f24725g)) {
            return null;
        }
        if (outCursor >= 0) {
            int[] iArr = this.f24727i;
            if (outCursor < iArr.length) {
                int i11 = this.f24728j[outCursor] - iArr[outCursor];
                if (cursor >= 0 && cursor < i11) {
                    return String.valueOf(this.f24731m.get(outCursor)[cursor]);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Answer's cursor is out of range, ");
                sb2.append(cursor);
                sb2.append(" is not from 0 to ");
                sb2.append(i11 - 1);
                throw new IndexOutOfBoundsException(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Answer's out cursor is out of range, ");
        sb3.append(outCursor);
        sb3.append(" is not from 0 to ");
        sb3.append(this.f24727i.length - 1);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public final void O() {
        this.f24733o = 0;
        loop0: for (int[] iArr : this.f24729k) {
            for (int i11 : iArr) {
                if (i11 != 1) {
                    break loop0;
                }
            }
            this.f24733o++;
        }
        this.f24734p = this.f24732n[this.f24733o];
    }

    public void S(int outCursor, int cursor, int state) {
        if (TextUtils.isEmpty(this.f24725g)) {
            return;
        }
        if (outCursor >= 0) {
            int[] iArr = this.f24727i;
            if (outCursor < iArr.length) {
                int i11 = this.f24728j[outCursor] - iArr[outCursor];
                if (cursor < 0 || cursor >= i11) {
                    throw new IndexOutOfBoundsException("Answer's cursor is out of range, " + cursor + " is not from 0 to " + (i11 - 1));
                }
                if (!Q(state)) {
                    throw new IllegalArgumentException("Set states failed for states' value is not valid.");
                }
                if (this.f24729k.get(outCursor)[cursor] != state) {
                    this.f24729k.get(outCursor)[cursor] = state;
                    if (1 == state) {
                        this.f24730l.get(outCursor)[cursor] = 255;
                    }
                    R();
                    return;
                }
                return;
            }
        }
        throw new IndexOutOfBoundsException("Answer's out cursor is out of range, " + outCursor + " is not from 0 to " + (this.f24727i.length - 1));
    }

    public void T() {
        this.f24738t = false;
        R();
    }

    public final void U() {
        if (this.f24733o >= this.f24729k.size()) {
            return;
        }
        for (int i11 : this.f24729k.get(this.f24733o)) {
            if (i11 != 1) {
                return;
            }
        }
        this.f24733o++;
    }

    public String getAnswer() {
        if (TextUtils.isEmpty(this.f24725g)) {
            return null;
        }
        return String.valueOf(this.f24731m.get(this.f24733o)[this.f24732n[this.f24733o]]);
    }

    public String getAnswers() {
        if (TextUtils.isEmpty(this.f24725g)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int[] iArr = this.f24727i;
            if (i11 >= iArr.length) {
                return sb2.toString();
            }
            sb2.append(this.f24725g.substring(iArr[i11], this.f24728j[i11]));
            if (this.f24727i.length > 0 && i11 != r2.length - 1) {
                sb2.append(" ");
            }
            i11++;
        }
    }

    public int getUnAnsweredCount() {
        List<int[]> list = this.f24729k;
        if (list == null) {
            return 0;
        }
        int i11 = 0;
        for (int[] iArr : list) {
            for (int i12 : iArr) {
                if (i12 == 0) {
                    i11++;
                }
            }
        }
        return i11;
    }

    public QuizHollowAnswerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f24737s = new c();
        this.f24738t = false;
        N(attrs, R.style.DefaultQuizStateAnswerView);
    }

    public QuizHollowAnswerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f24737s = new c();
        this.f24738t = false;
        N(attrs, R.style.DefaultQuizStateAnswerView);
    }
}
