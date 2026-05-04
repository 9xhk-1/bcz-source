package gi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.media3.common.C;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.util.HighLightMatcher;
import com.baicizhan.main.customview.PopPointWindowLayout;
import com.jiongji.andriod.card.R;
import f9.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final String f53798b = "WordRenderHelper";

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f53799c = new m0();

    /* renamed from: a, reason: collision with root package name */
    public PopupWindow f53800a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements PopupWindow.OnDismissListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f53801a;

        public a(final View val$parent) {
            this.f53801a = val$parent;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            View view = this.f53801a;
            if (view instanceof TextView) {
                CharSequence text = ((TextView) view).getText();
                if (text instanceof SpannableString) {
                    for (va.p pVar : (va.p[]) ((SpannableString) text).getSpans(0, text.length(), va.p.class)) {
                        pVar.setPressed(false);
                    }
                    this.f53801a.invalidate();
                } else if (text instanceof SpannableStringBuilder) {
                    for (va.p pVar2 : (va.p[]) ((SpannableStringBuilder) text).getSpans(0, text.length(), va.p.class)) {
                        pVar2.setPressed(false);
                    }
                    this.f53801a.invalidate();
                }
            }
            m0.this.f53800a = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            m0.this.f53800a.dismiss();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements PopPointWindowLayout.d {
        public c() {
        }

        @Override // com.baicizhan.main.customview.PopPointWindowLayout.d
        public void a() {
            m0.this.f53800a.dismiss();
        }

        @Override // com.baicizhan.main.customview.PopPointWindowLayout.d
        public void b() {
            m0.this.f53800a.dismiss();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements PopPointWindowLayout.e {
        public d() {
        }

        @Override // com.baicizhan.main.customview.PopPointWindowLayout.e
        public void a() {
            m0.this.f53800a.dismiss();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public float f53806a;

        /* renamed from: b, reason: collision with root package name */
        public float f53807b;

        /* renamed from: c, reason: collision with root package name */
        public float f53808c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f53809d;

        /* renamed from: e, reason: collision with root package name */
        public zf.a f53810e;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements g {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<TextView> f53811a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f53812b;

        public f(TextView target) {
            this(target, false);
        }

        @Override // gi.m0.g
        public void a(String word, e config) {
            TextView textView = this.f53811a.get();
            if (textView == null || word == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(word);
            if (sb2.length() > 0 && sb2.charAt(0) == '\'') {
                sb2.deleteCharAt(0);
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == '\'') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            config.f53809d = this.f53812b;
            m0.f53799c.m(textView.getContext(), textView, sb2.toString(), config);
        }

        public f(TextView target, boolean disableMore) {
            this.f53811a = new WeakReference<>(target);
            this.f53812b = disableMore;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface g {
        void a(String word, e config);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface h {
        Object create();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i implements h {

        /* renamed from: a, reason: collision with root package name */
        public int f53813a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f53814b = 0;

        public void a(int textColor) {
            this.f53814b = textColor;
        }

        public void b(int textSize) {
            this.f53813a = textSize;
        }

        @Override // gi.m0.h
        public Object create() {
            return this.f53813a == 0 ? new ForegroundColorSpan(this.f53814b) : new TextAppearanceSpan(null, 0, this.f53813a, ColorStateList.valueOf(this.f53814b), null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public String f53815a;

        /* renamed from: b, reason: collision with root package name */
        public int f53816b;

        /* renamed from: c, reason: collision with root package name */
        public int f53817c;

        /* renamed from: d, reason: collision with root package name */
        public String f53818d;

        /* renamed from: e, reason: collision with root package name */
        public String f53819e;

        /* renamed from: f, reason: collision with root package name */
        public int f53820f;

        /* renamed from: g, reason: collision with root package name */
        public Pair<Integer, Integer> f53821g;

        /* renamed from: h, reason: collision with root package name */
        public List<a.b> f53822h = null;

        /* renamed from: i, reason: collision with root package name */
        public boolean f53823i = false;

        /* renamed from: j, reason: collision with root package name */
        public boolean f53824j = false;

        /* renamed from: k, reason: collision with root package name */
        public boolean f53825k = true;

        /* renamed from: l, reason: collision with root package name */
        public g f53826l = null;

        /* renamed from: m, reason: collision with root package name */
        public zf.a f53827m;

        public j(String text) {
            this.f53815a = text.replaceAll("\\s", " ") + " ";
        }

        public static j m(String text) {
            return new j(text);
        }

        public j a(a.b segment) {
            if (this.f53822h == null) {
                this.f53822h = new ArrayList(1);
            }
            this.f53822h.add(segment);
            return this;
        }

        public j b(Pair<Integer, Integer> indexPair) {
            this.f53821g = indexPair;
            return this;
        }

        public j c() {
            this.f53823i = true;
            return this;
        }

        public j d() {
            this.f53824j = true;
            return this;
        }

        public j e(int textColor) {
            this.f53816b = textColor;
            return this;
        }

        public j f(String key) {
            this.f53818d = key;
            return this;
        }

        public j g(String phrase, int phraseColor) {
            this.f53819e = phrase;
            this.f53820f = phraseColor;
            return this;
        }

        public j h(int textSize) {
            this.f53817c = textSize;
            return this;
        }

        public void i(final TextView target) {
            List<a.b> list;
            int indexOf;
            SpannableString spannableString = new SpannableString(this.f53815a);
            try {
                if (!TextUtils.isEmpty(this.f53818d)) {
                    List<a.b> h11 = f9.a.h(this.f53815a, this.f53818d, null);
                    List<a.b> list2 = this.f53822h;
                    if (list2 == null || h11 == null) {
                        this.f53822h = h11;
                    } else {
                        list2.addAll(h11);
                    }
                }
                List<a.b> list3 = this.f53822h;
                if (list3 != null && list3.size() > 0) {
                    i iVar = new i();
                    iVar.a(this.f53816b);
                    iVar.b(this.f53817c);
                    for (a.b bVar : this.f53822h) {
                        spannableString.setSpan(iVar.create(), bVar.f51340a, bVar.f51341b, 33);
                    }
                }
                if (!TextUtils.isEmpty(this.f53819e) && (indexOf = this.f53815a.replace("\n", " ").indexOf(this.f53819e)) >= 0) {
                    spannableString.setSpan(new ja.a(this.f53820f), indexOf, this.f53819e.length() + indexOf, 33);
                }
                Pair<Integer, Integer> pair = this.f53821g;
                if (pair != null && pair.getFirst().intValue() >= 0 && this.f53821g.getSecond().intValue() > this.f53821g.getFirst().intValue()) {
                    spannableString.setSpan(new StyleSpan(1), this.f53821g.getFirst().intValue(), this.f53821g.getSecond().intValue(), 33);
                }
                if (this.f53823i) {
                    f fVar = new f(target, this.f53824j);
                    for (HighLightMatcher.Segment segment : HighLightMatcher.splitEnglishWords(this.f53815a)) {
                        int start = segment.getStart();
                        int end = segment.getEnd();
                        if (this.f53825k && (list = this.f53822h) != null) {
                            for (a.b bVar2 : list) {
                                if (bVar2.f51340a > start || bVar2.f51341b < end) {
                                    start = start;
                                    end = end;
                                } else if (this.f53826l != null) {
                                    int i11 = start;
                                    int i12 = end;
                                    spannableString.setSpan(new k(this.f53826l, i11, i12, this.f53824j, this.f53827m), i11, i12, 33);
                                }
                            }
                        }
                        int i13 = start;
                        int i14 = end;
                        spannableString.setSpan(new k(fVar, i13, i14, this.f53824j, this.f53827m), i13, i14, 33);
                    }
                    va.n nVar = new va.n();
                    nVar.c(true);
                    target.setMovementMethod(nVar);
                    target.setHighlightColor(-12618497);
                }
            } catch (Exception e11) {
                qb.c.c(m0.f53798b, "", e11);
            }
            target.setText(spannableString);
            target.setLongClickable(false);
        }

        public j j(zf.a getBottomSheetLayout) {
            this.f53827m = getBottomSheetLayout;
            return this;
        }

        public j k(g listener) {
            this.f53826l = listener;
            return this;
        }

        public j l() {
            this.f53825k = true;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k extends va.p {

        /* renamed from: a, reason: collision with root package name */
        public g f53828a;

        /* renamed from: b, reason: collision with root package name */
        public int f53829b;

        /* renamed from: c, reason: collision with root package name */
        public int f53830c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f53831d;

        /* renamed from: e, reason: collision with root package name */
        public zf.a f53832e;

        public k(g listener, int start, int end, boolean disableMore, zf.a getBottomSheetLayout) {
            super(Color.parseColor("#FF3F74FF"));
            this.f53828a = listener;
            this.f53829b = start;
            this.f53830c = end;
            this.f53831d = disableMore;
            this.f53832e = getBottomSheetLayout;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            TextView textView = (TextView) widget;
            String charSequence = textView.getText().subSequence(this.f53829b, this.f53830c).toString();
            int i11 = (this.f53829b + this.f53830c) / 2;
            Layout layout = textView.getLayout();
            int lineForOffset = layout.getLineForOffset(i11);
            float primaryHorizontal = ((layout.getPrimaryHorizontal(this.f53829b) + layout.getPrimaryHorizontal(this.f53830c)) / 2.0f) - xb.f.a(textView.getContext(), 1.0f);
            float lineTop = layout.getLineTop(lineForOffset);
            float lineBottom = layout.getLineBottom(lineForOffset);
            if (this.f53828a != null) {
                e eVar = new e();
                eVar.f53806a = primaryHorizontal;
                eVar.f53807b = lineTop;
                eVar.f53808c = lineBottom;
                eVar.f53809d = this.f53831d;
                eVar.f53810e = this.f53832e;
                this.f53828a.a(charSequence, eVar);
            }
        }
    }

    public static void e(TextView textView, SpannableStringBuilder spannable, List<a.b> skipSegments) {
        f(textView, spannable, skipSegments, false);
    }

    public static void f(TextView textView, SpannableStringBuilder spannable, List<a.b> skipSegments, boolean disableMore) {
        try {
            String spannableStringBuilder = spannable.toString();
            f fVar = new f(textView, disableMore);
            for (HighLightMatcher.Segment segment : HighLightMatcher.splitEnglishWords(spannableStringBuilder)) {
                int start = segment.getStart();
                int end = segment.getEnd();
                if (skipSegments != null) {
                    for (a.b bVar : skipSegments) {
                        if (bVar.f51340a > start || bVar.f51341b < end) {
                        }
                    }
                }
                spannable.setSpan(new k(fVar, start, end, true, null), start, end, 33);
            }
            va.n nVar = new va.n();
            nVar.c(true);
            textView.setMovementMethod(nVar);
            textView.setHighlightColor(-12618497);
        } catch (Exception e11) {
            qb.c.c(f53798b, "addClickableToSpannable error", e11);
        }
    }

    public static int[] i(TopicRecord record) {
        List<a.b> h11;
        int indexOf;
        ArrayList<String> arrayList = new ArrayList(2);
        if (!TextUtils.isEmpty(record.word)) {
            arrayList.add(record.word.toLowerCase(Locale.US));
        }
        if (!TextUtils.isEmpty(record.wordVariants)) {
            try {
                for (String str : TextUtils.split(record.wordVariants, ",")) {
                    arrayList.add(str.trim().toLowerCase(Locale.US));
                }
            } catch (Exception e11) {
                qb.c.c("temp", "", e11);
            }
        }
        String lowerCase = record.sentence.toLowerCase(Locale.US);
        for (String str2 : arrayList) {
            if (lowerCase.length() > 0 && (indexOf = lowerCase.indexOf(str2, 0)) != -1) {
                return new int[]{indexOf, str2.length() + indexOf};
            }
        }
        if (!l(record.word) || (h11 = f9.a.h(record.sentence, record.word, null)) == null || h11.isEmpty()) {
            return null;
        }
        return new int[]{h11.get(0).f51340a, h11.get(h11.size() - 1).f51341b};
    }

    public static m0 j() {
        return f53799c;
    }

    public static int[][] k(TopicRecord record) {
        List<a.b> h11 = f9.a.h(record.sentence, record.word, null);
        if (h11 == null || h11.isEmpty()) {
            return null;
        }
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, h11.size(), 2);
        int i11 = 0;
        for (a.b bVar : h11) {
            int i12 = bVar.f51340a;
            int i13 = -1;
            int i14 = -1;
            for (int i15 = bVar.f51341b - 1; i12 < bVar.f51341b && i15 >= i12 && (i13 < 0 || i14 < 0); i15--) {
                if (i13 < 0 && Character.isLetter(record.sentence.charAt(i12))) {
                    i13 = i12;
                }
                if (i14 < 0 && Character.isLetter(record.sentence.charAt(i15))) {
                    i14 = i15;
                }
                i12++;
            }
            int[] iArr2 = iArr[i11];
            iArr2[0] = i13;
            iArr2[1] = i14 + 1;
            i11++;
        }
        return iArr;
    }

    public static boolean l(String phrase) {
        if (TextUtils.isEmpty(phrase)) {
            return false;
        }
        for (char c11 : phrase.replaceAll(" ", "").toLowerCase(Locale.US).toCharArray()) {
            if (c11 < 'a' || c11 > 'z') {
                return false;
            }
        }
        return true;
    }

    public static void n(TextView textView, String sentence, Pair<Integer, Integer> pair) {
        j.m(sentence).b(pair).c().d().i(textView);
    }

    public static void o(TextView textView, TopicRecord record) {
        int color = textView.getResources().getColor(R.color.main_color_blue_dark);
        j.m(record.sentence).e(color).f(record.word).g(record.sentencePhrase, pb.a.a().getResources().getColor(R.color.main_color_weak_divider)).c().l().d().i(textView);
    }

    public static void p(TextView textView, TopicRecord record) {
        r(textView, record, true, false);
    }

    public static void q(TextView textView, TopicRecord record, boolean clickable) {
        r(textView, record, clickable, false);
    }

    public static void r(TextView textView, TopicRecord record, boolean clickable, boolean showMore) {
        j m11 = j.m(record.sentence);
        if (clickable) {
            m11.c().l();
        }
        if (!showMore) {
            m11.d();
        }
        m11.i(textView);
    }

    public static void s(TextView textView, String sentence) {
        u(textView, sentence, true, false);
    }

    public static void t(TextView textView, String sentence, boolean clickable) {
        u(textView, sentence, clickable, false);
    }

    public static void u(TextView textView, String sentence, boolean clickable, boolean showMore) {
        j m11 = j.m(sentence);
        if (clickable) {
            m11.c().l();
        }
        if (!showMore) {
            m11.d();
        }
        m11.i(textView);
    }

    public static void v(TextView textView, TopicRecord record) {
        j.m(record.word + " = " + record.wordMean).a(new a.b(0, record.word.length())).e(pb.a.a().getResources().getColor(R.color.main_blue)).d().i(textView);
    }

    public static void w(TextView textView, TopicRecord record) {
        j.m(record.word + " = " + record.wordMeanEn).a(new a.b(0, record.word.length())).e(pb.a.a().getResources().getColor(R.color.main_blue)).c().l().d().i(textView);
    }

    public void g() {
        PopupWindow popupWindow = this.f53800a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void h(boolean needFullScreen, PopupWindow popupWindow) {
        try {
            Field declaredField = PopupWindow.class.getDeclaredField("mLayoutInScreen");
            declaredField.setAccessible(true);
            declaredField.set(popupWindow, Boolean.valueOf(needFullScreen));
        } catch (IllegalAccessException e11) {
            e11.printStackTrace();
        } catch (NoSuchFieldException e12) {
            e12.printStackTrace();
        }
    }

    @SuppressLint({"InflateParams"})
    public final void m(Context context, final View parent, String word, @NonNull e config) {
        int[] iArr = new int[2];
        parent.getLocationInWindow(iArr);
        iArr[0] = iArr[0] + parent.getPaddingLeft();
        iArr[1] = iArr[1] + parent.getPaddingTop();
        PopPointWindowLayout popPointWindowLayout = new PopPointWindowLayout(context);
        popPointWindowLayout.B(word, ((int) config.f53806a) + iArr[0], iArr, config.f53807b, config.f53808c);
        popPointWindowLayout.setMoreDisabled(config.f53809d);
        popPointWindowLayout.setGetBottomSheetLayout(config.f53810e);
        PopupWindow popupWindow = this.f53800a;
        if (popupWindow != null) {
            try {
                popupWindow.dismiss();
            } catch (Exception e11) {
                qb.c.c(f53798b, "", e11);
            }
        }
        PopupWindow popupWindow2 = new PopupWindow(popPointWindowLayout, -1, -1);
        this.f53800a = popupWindow2;
        popupWindow2.setBackgroundDrawable(new ColorDrawable(C.ENCODING_PCM_32BIT_BIG_ENDIAN));
        h(true, this.f53800a);
        this.f53800a.setFocusable(true);
        this.f53800a.setTouchable(true);
        this.f53800a.setClippingEnabled(false);
        try {
            Field declaredField = PopupWindow.class.getDeclaredField("mLayoutInScreen");
            declaredField.setAccessible(true);
            declaredField.set(this.f53800a, Boolean.FALSE);
        } catch (Exception e12) {
            qb.c.c(f53798b, "", e12);
        }
        this.f53800a.setOutsideTouchable(true);
        this.f53800a.setAnimationStyle(R.style.Animations_fade_in_out);
        this.f53800a.showAtLocation(parent, 48, 0, 0);
        this.f53800a.setOnDismissListener(new a(parent));
        popPointWindowLayout.setOnClickListener(new b());
        popPointWindowLayout.setOnActionListener(new c());
        popPointWindowLayout.setCollectListener(new d());
    }
}
