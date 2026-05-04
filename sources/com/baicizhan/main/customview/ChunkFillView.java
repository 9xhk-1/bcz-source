package com.baicizhan.main.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ChunkFillView extends HighlightTextView {

    /* renamed from: d, reason: collision with root package name */
    public static String f19997d = "ChunkFillView";

    public ChunkFillView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void i(CharSequence text) {
        setHighlightText(getHighlightText().toString().replaceFirst("[\\[ ]+" + ((Object) text) + "[\\] ]+", " __ "));
    }

    public CharSequence j() {
        Matcher matcher = Pattern.compile("\\][^\\[]*\\[").matcher(new StringBuffer(getHighlightText()).reverse().toString());
        if (!matcher.find()) {
            return null;
        }
        String stringBuffer = new StringBuffer(matcher.group(0).substring(1, matcher.group(0).length() - 1)).reverse().toString();
        String replaceFirst = matcher.replaceFirst("__");
        setHighlightText(new StringBuffer(replaceFirst).reverse());
        Log.d(f19997d, "reverse=" + replaceFirst);
        Matcher matcher2 = Pattern.compile(" [a-zA-Z]+ ").matcher(replaceFirst);
        if (!matcher2.find()) {
            return stringBuffer;
        }
        Log.d(f19997d, "mat=" + matcher2.group(0).substring(1, matcher2.group(0).length() - 1));
        setHighlightText(new StringBuffer(matcher2.replaceFirst(" ]" + matcher2.group(0).substring(1, matcher2.group(0).length() - 1) + "[ ")).reverse());
        return stringBuffer;
    }

    public void k(CharSequence chunk) {
        setHighlightText(getHighlightText().toString().replaceAll("[\\[\\]]", "").replaceFirst("__", "[" + ((Object) chunk) + "]"));
    }

    public void setProblem(CharSequence text) {
        int length = text.toString().split(Constants.ACCEPT_TIME_SEPARATOR_SERVER).length;
        int length2 = text.length();
        StringBuffer stringBuffer = new StringBuffer();
        int i11 = 0;
        while (true) {
            if (i11 >= (length > 1 ? length : length2)) {
                stringBuffer.append(" ");
                setHighlightText(stringBuffer.toString());
                return;
            } else {
                stringBuffer.append(" __");
                i11++;
            }
        }
    }
}
