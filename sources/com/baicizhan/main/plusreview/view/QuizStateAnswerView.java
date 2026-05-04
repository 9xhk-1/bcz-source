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
import androidx.appcompat.widget.AppCompatTextView;
import com.baicizhan.client.business.view.a;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class QuizStateAnswerView extends AppCompatTextView {

    /* renamed from: o, reason: collision with root package name */
    public static final int f24752o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final int f24753p = 1;

    /* renamed from: a, reason: collision with root package name */
    public int f24754a;

    /* renamed from: b, reason: collision with root package name */
    public int f24755b;

    /* renamed from: c, reason: collision with root package name */
    public int f24756c;

    /* renamed from: d, reason: collision with root package name */
    public int f24757d;

    /* renamed from: e, reason: collision with root package name */
    public String f24758e;

    /* renamed from: f, reason: collision with root package name */
    public int f24759f;

    /* renamed from: g, reason: collision with root package name */
    public int f24760g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f24761h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f24762i;

    /* renamed from: j, reason: collision with root package name */
    public char[] f24763j;

    /* renamed from: k, reason: collision with root package name */
    public int f24764k;

    /* renamed from: l, reason: collision with root package name */
    public List<Integer> f24765l;

    /* renamed from: m, reason: collision with root package name */
    public com.baicizhan.client.business.view.a f24766m;

    /* renamed from: n, reason: collision with root package name */
    public c f24767n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends ReplacementSpan {
        public a() {
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence text, int start, int end, float x11, int top, int y11, int bottom, Paint paint) {
            Paint paint2 = paint;
            int i11 = QuizStateAnswerView.this.f24756c;
            RectF rectF = new RectF(x11, top - i11, paint2.measureText(text.subSequence(start, end).toString()) + x11 + (i11 * 4), QuizStateAnswerView.this.f24757d + y11 + i11);
            paint2.setColor(QuizStateAnswerView.this.f24754a);
            canvas.drawRoundRect(rectF, QuizStateAnswerView.this.f24756c, QuizStateAnswerView.this.f24756c, paint2);
            paint2.setColor(QuizStateAnswerView.this.f24755b);
            float f11 = 0.0f;
            int i12 = 0;
            while (i12 < end - start) {
                if (QuizStateAnswerView.this.f24761h[i12] == 0) {
                    paint2.setAlpha(0);
                } else {
                    paint2.setAlpha(QuizStateAnswerView.this.f24762i[i12]);
                }
                if (i12 == 0) {
                    canvas.drawText(text, start, start + 1, x11 + (i11 * 2), y11, paint2);
                } else {
                    int i13 = start + i12;
                    f11 += paint2.measureText(text.subSequence(i13 - 1, i13).toString());
                    canvas.drawText(text, i13, i13 + 1, (i11 * 2) + x11 + f11, y11, paint2);
                }
                i12++;
                paint2 = paint;
            }
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm2) {
            int i11 = QuizStateAnswerView.this.f24756c * 2;
            return Math.round(paint.measureText(text.subSequence(start, end).toString())) + i11 + i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public QuizStateAnswerView f24769a;

        /* renamed from: b, reason: collision with root package name */
        public String f24770b;

        /* renamed from: c, reason: collision with root package name */
        public int f24771c;

        /* renamed from: d, reason: collision with root package name */
        public int f24772d;

        /* renamed from: e, reason: collision with root package name */
        public int[] f24773e;

        /* renamed from: f, reason: collision with root package name */
        public int f24774f;

        public String a() {
            StringBuilder sb2 = new StringBuilder("QuizStateAnswerView info {");
            sb2.append("[quiz: ");
            sb2.append(this.f24770b);
            sb2.append("]; ");
            sb2.append("[quiz length: ");
            String str = this.f24770b;
            sb2.append(str != null ? str.length() : 0);
            sb2.append("]; ");
            sb2.append("[answer border: [");
            sb2.append(this.f24771c);
            sb2.append(j2.O);
            sb2.append(this.f24772d);
            sb2.append(")]; ");
            sb2.append("[states length: ");
            int[] iArr = this.f24773e;
            sb2.append(iArr != null ? iArr.length : 0);
            sb2.append("]; ");
            sb2.append("[cursor: ");
            sb2.append(this.f24774f);
            sb2.append("]}");
            return sb2.toString();
        }

        public QuizStateAnswerView b() {
            int i11;
            if (this.f24769a == null || TextUtils.isEmpty(this.f24770b)) {
                return null;
            }
            int length = this.f24770b.length();
            int i12 = this.f24771c;
            if (i12 < 0 || i12 >= length || (i11 = this.f24772d) < 0 || i11 > length || i11 - i12 < 1) {
                throw new IllegalArgumentException("initialize failed, " + a());
            }
            if (this.f24773e == null) {
                int[] iArr = new int[i11 - i12];
                this.f24773e = iArr;
                if (1 == iArr.length) {
                    iArr[0] = 0;
                    this.f24774f = 0;
                } else if (iArr.length <= 3) {
                    iArr[0] = 1;
                    int i13 = 1;
                    while (true) {
                        int[] iArr2 = this.f24773e;
                        if (i13 >= iArr2.length) {
                            break;
                        }
                        iArr2[i13] = 0;
                        i13++;
                    }
                    this.f24774f = 1;
                } else {
                    int i14 = 0;
                    while (true) {
                        int[] iArr3 = this.f24773e;
                        if (i14 >= iArr3.length) {
                            break;
                        }
                        if (i14 == 0 || iArr3.length - 1 == i14) {
                            iArr3[i14] = 1;
                        } else {
                            iArr3[i14] = 0;
                        }
                        i14++;
                    }
                    this.f24774f = 1;
                }
            }
            if (this.f24773e.length > length) {
                throw new IllegalArgumentException("initialize failed, " + a());
            }
            int i15 = this.f24774f;
            if (i15 < 0 || i15 >= this.f24772d - this.f24771c) {
                throw new IllegalArgumentException("initialize failed, " + a());
            }
            this.f24769a.f24758e = this.f24770b;
            this.f24769a.f24759f = this.f24771c;
            this.f24769a.f24760g = this.f24772d;
            this.f24769a.f24762i = new int[length];
            this.f24769a.f24763j = this.f24770b.substring(this.f24771c, this.f24772d).toCharArray();
            this.f24769a.f24761h = this.f24773e;
            this.f24769a.f24764k = this.f24774f;
            for (int i16 = 1; i16 < this.f24773e.length && !QuizStateAnswerView.E(this.f24769a.f24763j[i16]); i16++) {
                this.f24773e[i16] = 1;
                this.f24769a.f24764k++;
            }
            for (int i17 = 0; i17 < this.f24773e.length; i17++) {
                this.f24769a.f24762i[i17] = 1 == this.f24773e[i17] ? 255 : 0;
            }
            this.f24769a.G();
            return this.f24769a;
        }

        public b c(int start, int end) {
            this.f24771c = start;
            this.f24772d = end;
            return this;
        }

        public b d(int cursor) {
            this.f24774f = cursor;
            return this;
        }

        public b e(String quiz) {
            this.f24770b = quiz;
            return this;
        }

        public b f(int[] states) {
            this.f24773e = states;
            return this;
        }

        public b g(QuizStateAnswerView target) {
            this.f24769a = target;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements a.b {
        @Override // com.baicizhan.client.business.view.a.b
        public void b(int frame) {
            QuizStateAnswerView.this.y(frame);
        }

        @Override // com.baicizhan.client.business.view.a.b
        public boolean d() {
            int i11 = QuizStateAnswerView.this.f24760g - QuizStateAnswerView.this.f24759f;
            if (QuizStateAnswerView.this.f24764k > -1) {
                return QuizStateAnswerView.this.f24762i[Math.min(QuizStateAnswerView.this.f24764k - 1, i11 - 1)] < 255;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                if (QuizStateAnswerView.this.f24762i[i12] < 255) {
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

    public QuizStateAnswerView(Context context) {
        super(context);
        this.f24767n = new c();
        D(null, R.style.DefaultQuizStateAnswerView);
    }

    private void D(AttributeSet attrs, int defStyleRes) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.QuizStateAnswerView, 0, defStyleRes);
        x(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        com.baicizhan.client.business.view.a h11 = com.baicizhan.client.business.view.a.g().h(this.f24767n);
        this.f24766m = h11;
        h11.j(15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean E(char c11) {
        if (c11 < 'a' || c11 > 'z') {
            return c11 >= 'A' && c11 <= 'Z';
        }
        return true;
    }

    private static boolean F(int state) {
        return state >= 0 && state <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        if (TextUtils.isEmpty(this.f24758e)) {
            return;
        }
        SpannableString spannableString = new SpannableString(this.f24758e);
        spannableString.setSpan(new a(), this.f24759f, this.f24760g, 33);
        setText(spannableString);
    }

    private void x(TypedArray a11) {
        this.f24754a = a11.getColor(0, -16777216);
        this.f24755b = a11.getColor(2, -1);
        int dimensionPixelSize = a11.getDimensionPixelSize(1, 0);
        this.f24756c = dimensionPixelSize;
        int i11 = dimensionPixelSize * 2;
        this.f24757d = i11;
        setLineSpacing(i11, 1.0f);
        setGravity(16);
        int i12 = this.f24757d;
        setPadding(0, i12, 0, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(int delta) {
        if (this.f24764k > -1) {
            List<Integer> list = this.f24765l;
            if (list != null) {
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    int[] iArr = this.f24762i;
                    int i11 = iArr[intValue] + delta;
                    if (i11 > 255) {
                        i11 = 255;
                    }
                    iArr[intValue] = i11;
                }
            }
        } else {
            int i12 = this.f24760g - this.f24759f;
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.f24762i;
                int i14 = iArr2[i13];
                if (i14 < 255) {
                    int i15 = i14 + delta;
                    if (i15 > 255) {
                        i15 = 255;
                    }
                    iArr2[i13] = i15;
                }
            }
        }
        G();
    }

    public boolean A(String answer) {
        int i11;
        if (TextUtils.isEmpty(this.f24758e) || answer == null || answer.length() != 1) {
            return false;
        }
        char c11 = this.f24763j[this.f24764k];
        Locale locale = Locale.US;
        if (answer.toLowerCase(locale).charAt(0) != c11 && answer.toUpperCase(locale).charAt(0) != c11) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        this.f24765l = arrayList;
        arrayList.add(Integer.valueOf(this.f24764k));
        this.f24764k++;
        int i12 = 0;
        while (true) {
            i11 = this.f24764k;
            if (i12 >= i11 - 1) {
                break;
            }
            this.f24762i[i12] = 255;
            i12++;
        }
        this.f24761h[i11 - 1] = 1;
        while (true) {
            char[] cArr = this.f24763j;
            if (i11 >= cArr.length || E(cArr[i11])) {
                break;
            }
            this.f24764k++;
            this.f24765l.add(Integer.valueOf(i11));
            this.f24761h[i11] = 1;
            i11++;
        }
        this.f24766m.l();
        this.f24766m.k(0, 255);
        return true;
    }

    public String B() {
        StringBuilder sb2 = new StringBuilder("QuizStateAnswerView info {");
        sb2.append("[quiz: ");
        sb2.append(this.f24758e);
        sb2.append("]; ");
        sb2.append("[quiz length: ");
        String str = this.f24758e;
        sb2.append(str != null ? str.length() : 0);
        sb2.append("]; ");
        sb2.append("[answer border: [");
        sb2.append(this.f24759f);
        sb2.append(j2.O);
        sb2.append(this.f24760g);
        sb2.append(")]; ");
        sb2.append("[states length: ");
        int[] iArr = this.f24761h;
        sb2.append(iArr != null ? iArr.length : 0);
        sb2.append("]; ");
        sb2.append("[cursor: ");
        sb2.append(this.f24764k);
        sb2.append("]}");
        sb2.append("[alphas length: ");
        int[] iArr2 = this.f24762i;
        sb2.append(iArr2 != null ? iArr2.length : 0);
        sb2.append("]}");
        return sb2.toString();
    }

    public String C(int cursor) {
        if (TextUtils.isEmpty(this.f24758e)) {
            return null;
        }
        int i11 = this.f24760g - this.f24759f;
        if (cursor >= 0 && cursor < i11) {
            return String.valueOf(this.f24763j[cursor]);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Answer's cursor is out of range, ");
        sb2.append(cursor);
        sb2.append(" is not from 0 to ");
        sb2.append(i11 - 1);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public void H(int cursor, int state) {
        if (TextUtils.isEmpty(this.f24758e)) {
            return;
        }
        int i11 = this.f24760g - this.f24759f;
        if (cursor < 0 || cursor >= i11) {
            throw new IndexOutOfBoundsException("Answer's cursor is out of range, " + cursor + " is not from 0 to " + (i11 - 1));
        }
        if (!F(state)) {
            throw new IllegalArgumentException("Set states failed for states' value is not valid.");
        }
        int[] iArr = this.f24761h;
        if (iArr[cursor] != state) {
            iArr[cursor] = state;
            if (1 == state) {
                this.f24762i[cursor] = 255;
            }
            G();
        }
    }

    public String getAnswer() {
        if (TextUtils.isEmpty(this.f24758e)) {
            return null;
        }
        return String.valueOf(this.f24763j[this.f24764k]);
    }

    public String getAnswers() {
        if (TextUtils.isEmpty(this.f24758e)) {
            return null;
        }
        return this.f24758e.substring(this.f24759f, this.f24760g);
    }

    public int getUnAnsweredCount() {
        int[] iArr = this.f24761h;
        if (iArr == null) {
            return 0;
        }
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 == 0) {
                i11++;
            }
        }
        return i11;
    }

    public void setStates(int[] states) {
        if (states == null || TextUtils.isEmpty(this.f24758e)) {
            return;
        }
        int[] iArr = this.f24761h;
        if (iArr != null && states.length != iArr.length) {
            throw new IllegalArgumentException("Set states failed for states' length is not equal the required value: " + this.f24761h.length);
        }
        for (int i11 : states) {
            if (!F(i11)) {
                throw new IllegalArgumentException("Set states failed for states' value is not valid.");
            }
        }
        this.f24761h = states;
        int i12 = 0;
        while (true) {
            int[] iArr2 = this.f24761h;
            if (i12 >= iArr2.length) {
                G();
                return;
            } else {
                this.f24762i[i12] = 1 == iArr2[i12] ? 255 : 0;
                i12++;
            }
        }
    }

    public boolean w() {
        if (TextUtils.isEmpty(this.f24758e)) {
            return false;
        }
        for (int i11 : this.f24761h) {
            if (i11 == 0) {
                return false;
            }
        }
        return true;
    }

    public void z() {
        if (TextUtils.isEmpty(this.f24758e)) {
            return;
        }
        this.f24764k = -1;
        int i11 = this.f24760g - this.f24759f;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f24761h[i12] = 1;
        }
        this.f24766m.l();
        this.f24766m.k(0, 255);
    }

    public QuizStateAnswerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f24767n = new c();
        D(attrs, R.style.DefaultQuizStateAnswerView);
    }

    public QuizStateAnswerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f24767n = new c();
        D(attrs, R.style.DefaultQuizStateAnswerView);
    }
}
