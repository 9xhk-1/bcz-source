package com.baicizhan.client.business.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.lookup.Word;
import com.baicizhan.client.business.util.HighLightMatcher;
import com.jiongji.andriod.card.R;
import f9.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class TopicTextRenderHelper {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DefaultWordClickListener implements OnWordClickListener {
        final WeakReference<TextView> weakTarget;

        public DefaultWordClickListener(TextView target) {
            this.weakTarget = new WeakReference<>(target);
        }

        @Override // com.baicizhan.client.business.util.TopicTextRenderHelper.OnWordClickListener
        public void onClick(String word) {
            TextView textView = this.weakTarget.get();
            if (textView == null || word == null) {
                return;
            }
            String lowerCase = word.toLowerCase();
            List<Word> g11 = i9.i.g(textView.getContext(), 0, word, 1);
            if (g11 == null || g11.isEmpty()) {
                g11 = i9.i.g(textView.getContext(), 0, lowerCase, 1);
            }
            if (g11 == null || g11.isEmpty()) {
                return;
            }
            TopicTextRenderHelper.popupWordMeanWindow(textView.getContext(), textView, g11.get(0));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnWordClickListener {
        void onClick(String word);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface SpanFactory {
        Object create();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TextStyleSpanFactory implements SpanFactory {
        private int textSize = 0;
        private int textColor = 0;

        @Override // com.baicizhan.client.business.util.TopicTextRenderHelper.SpanFactory
        public Object create() {
            return this.textSize == 0 ? new ForegroundColorSpan(this.textColor) : new TextAppearanceSpan(null, 0, this.textSize, ColorStateList.valueOf(this.textColor), null);
        }

        public void setTextColor(int textColor) {
            this.textColor = textColor;
        }

        public void setTextSize(int textSize) {
            this.textSize = textSize;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TopicTextRender {
        private int mHighlightColor;
        private String mHighlightKey;
        private int mHighlightSize;
        private String mPhrase;
        private int mPhraseColor;
        private String mText;
        List<a.b> mHighlightSegments = null;
        private boolean mClickable = false;
        private boolean mSkipClickHighlighted = true;
        private OnWordClickListener mHighlightClickListener = null;

        private TopicTextRender(String text) {
            this.mText = text;
        }

        public static TopicTextRender with(String text) {
            return new TopicTextRender(text);
        }

        public TopicTextRender addHighlightSegment(a.b segment) {
            if (this.mHighlightSegments == null) {
                this.mHighlightSegments = new ArrayList(1);
            }
            this.mHighlightSegments.add(segment);
            return this;
        }

        public TopicTextRender clickable() {
            this.mClickable = true;
            return this;
        }

        public TopicTextRender highlightColor(int textColor) {
            this.mHighlightColor = textColor;
            return this;
        }

        public TopicTextRender highlightKey(String key) {
            this.mHighlightKey = key;
            return this;
        }

        public TopicTextRender highlightPhrase(String phrase, int phraseColor) {
            this.mPhrase = phrase;
            this.mPhraseColor = phraseColor;
            return this;
        }

        public TopicTextRender highlightSize(int textSize) {
            this.mHighlightSize = textSize;
            return this;
        }

        public void into(final TextView target) {
            List<a.b> list;
            SpannableString spannableString = new SpannableString(this.mText);
            try {
                if (!TextUtils.isEmpty(this.mHighlightKey)) {
                    List<a.b> h11 = f9.a.h(this.mText, this.mHighlightKey, null);
                    List<a.b> list2 = this.mHighlightSegments;
                    if (list2 == null || h11 == null) {
                        this.mHighlightSegments = h11;
                    } else {
                        list2.addAll(h11);
                    }
                }
                List<a.b> list3 = this.mHighlightSegments;
                if (list3 != null && list3.size() > 0) {
                    TextStyleSpanFactory textStyleSpanFactory = new TextStyleSpanFactory();
                    textStyleSpanFactory.setTextColor(this.mHighlightColor);
                    textStyleSpanFactory.setTextSize(this.mHighlightSize);
                    for (a.b bVar : this.mHighlightSegments) {
                        spannableString.setSpan(textStyleSpanFactory.create(), bVar.f51340a, bVar.f51341b, 33);
                    }
                }
                if (!TextUtils.isEmpty(this.mPhrase)) {
                    int indexOf = this.mText.indexOf(this.mPhrase);
                    spannableString.setSpan(new ja.a(this.mPhraseColor), indexOf, this.mPhrase.length() + indexOf, 33);
                }
                if (this.mClickable) {
                    DefaultWordClickListener defaultWordClickListener = new DefaultWordClickListener(target);
                    for (HighLightMatcher.Segment segment : HighLightMatcher.splitEnglishWords(this.mText)) {
                        int start = segment.getStart();
                        int end = segment.getEnd();
                        if (this.mSkipClickHighlighted && (list = this.mHighlightSegments) != null) {
                            for (a.b bVar2 : list) {
                                if (bVar2.f51340a <= start && bVar2.f51341b >= end) {
                                    if (this.mHighlightClickListener != null) {
                                        spannableString.setSpan(new WordClickableSpan(this.mHighlightClickListener, start, end), start, end, 33);
                                    }
                                }
                            }
                        }
                        spannableString.setSpan(new WordClickableSpan(defaultWordClickListener, start, end), start, end, 33);
                    }
                    va.n a11 = va.n.a();
                    a11.c(false);
                    target.setMovementMethod(a11);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            target.setText(spannableString);
            target.setLongClickable(false);
        }

        public TopicTextRender setHighlightClickListener(OnWordClickListener listener) {
            this.mHighlightClickListener = listener;
            return this;
        }

        public TopicTextRender skipClickHighlighted() {
            this.mSkipClickHighlighted = true;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordClickableSpan extends va.p {
        int end;
        OnWordClickListener listener;
        int start;

        public WordClickableSpan(OnWordClickListener listener, int start, int end) {
            super(Color.parseColor("#FF3F74FF"));
            this.listener = listener;
            this.start = start;
            this.end = end;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            String charSequence = ((TextView) widget).getText().subSequence(this.start, this.end).toString();
            OnWordClickListener onWordClickListener = this.listener;
            if (onWordClickListener != null) {
                onWordClickListener.onClick(charSequence);
            }
        }
    }

    public static int[] getFirstMatchWordBorder(TopicRecord record) {
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
                Log.e("temp", Log.getStackTraceString(e11));
            }
        }
        String lowerCase = record.sentence.toLowerCase(Locale.US);
        for (String str2 : arrayList) {
            if (lowerCase.length() > 0 && (indexOf = lowerCase.indexOf(str2, 0)) != -1) {
                return new int[]{indexOf, str2.length() + indexOf};
            }
        }
        if (!isSerialPhrase(record.word) || (h11 = f9.a.h(record.sentence, record.word, null)) == null || h11.isEmpty()) {
            return null;
        }
        return new int[]{h11.get(0).f51340a, h11.get(h11.size() - 1).f51341b};
    }

    public static int[][] getMatchWordBorders(TopicRecord record) {
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

    private static boolean isSerialPhrase(String phrase) {
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

    @SuppressLint({"InflateParams"})
    public static void popupWordMeanWindow(Context context, View parent, Word record) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.word_translate_window, (ViewGroup) null, false);
        ((TextView) inflate.findViewById(R.id.word)).setText(record.getWord());
        ((TextView) inflate.findViewById(R.id.phonetic)).setText(record.getAccent());
        ((TextView) inflate.findViewById(R.id.mean)).setText(record.getCnmean());
        final PopupWindow popupWindow = new PopupWindow(inflate, -1, -2);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setFocusable(true);
        popupWindow.setTouchable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setAnimationStyle(R.style.Animations_fade_in_out);
        popupWindow.showAtLocation(parent, 48, 0, 0);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.baicizhan.client.business.util.TopicTextRenderHelper.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v11) {
                popupWindow.dismiss();
            }
        });
    }

    public static void showClickableHighlightSentence(TextView textView, TopicRecord record) {
        int color = textView.getResources().getColor(R.color.main_blue);
        TopicTextRender.with(record.sentence).highlightColor(color).highlightKey(record.word).highlightPhrase(record.sentencePhrase, pb.a.a().getResources().getColor(R.color.main_color_weak_divider)).clickable().skipClickHighlighted().into(textView);
    }

    public static void showWordMeanCn(TextView textView, TopicRecord record) {
        TopicTextRender.with(record.word + " = " + record.wordMean).addHighlightSegment(new a.b(0, record.word.length())).highlightColor(pb.a.a().getResources().getColor(R.color.main_blue)).into(textView);
    }

    public static void showWordMeanEn(TextView textView, TopicRecord record) {
        TopicTextRender.with(record.word + " = " + record.wordMeanEn).addHighlightSegment(new a.b(0, record.word.length())).highlightColor(pb.a.a().getResources().getColor(R.color.main_blue)).clickable().skipClickHighlighted().into(textView);
    }
}
